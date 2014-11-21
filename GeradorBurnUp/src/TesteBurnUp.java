import java.sql.Date;
import java.util.ArrayList;
import java.util.Map;

import junit.framework.TestCase;
import model.Estoria;
import model.ItemHistorico;
import model.Sprint;

import org.junit.Test;

import bo.SprintBO;

/**
 * TDD Gerador BurnUp
 * @author Jenifer Henrique
 *
 */
public class TesteBurnUp extends TestCase{
	
	@Test
	public void testaSprintDeveTer10Dias(){
		Sprint sprint = new Sprint();
		sprint.setQtdeDias(10);
		
		assertEquals(10, sprint.getQtdeDias());
	}
	
	@Test
	public void testaSprintDeveTer60Horas(){
		Sprint sprint = new Sprint();
		sprint.setTotalHoras(60.0);
		
		assertEquals(60.0, sprint.getTotalHoras());
	}
	
	@Test
	public void testaSprintDeveTer2Estorias(){
		Sprint sprint = new Sprint();
		sprint.setEstorias(new ArrayList<Estoria>());
		sprint.getEstorias().add(new Estoria(1,2));
		sprint.getEstorias().add(new Estoria(2,3));
		
		assertEquals(2, sprint.getEstorias().size());
	}
	
	@Test
	public void testaCalculoTotalHorasSprintBODeveSer16(){
		SprintBO bo = new SprintBO();
		Sprint sprint = new Sprint();
		sprint.setEstorias(new ArrayList<Estoria>());

		Estoria estoria1 = new Estoria();
		Estoria estoria2 = new Estoria();
		estoria1.setTempoRestante(10);
		sprint.getEstorias().add(estoria1);
		
		estoria2.setTempoRestante(6);
		sprint.getEstorias().add(estoria2);
		
		assertEquals(16.0, bo.calculaTotalHoras(sprint));
	}
	
	@Test
	public void testaCalculoPontosSprintBODeveSer20(){
		SprintBO bo = new SprintBO();
		Sprint sprint = new Sprint();
		sprint.setEstorias(new ArrayList<Estoria>());
		Estoria estoria1 = new Estoria();
		Estoria estoria2 = new Estoria();
		
		estoria1.setQtdePontos(new Integer(12));
		estoria2.setQtdePontos(new Integer(8));
		
		sprint.getEstorias().add(estoria1);
		sprint.getEstorias().add(estoria2);
		
		assertEquals(new Integer(20), bo.calculaTotalPontos(sprint));
	}
	
	@Test
	public void testaSprintDeveTer3ItensHistorico(){
		Sprint sprint = new Sprint();
		sprint.setItensHistorico(new ArrayList<ItemHistorico>());
		sprint.getItensHistorico().add(new ItemHistorico());
		sprint.getItensHistorico().add(new ItemHistorico());
		sprint.getItensHistorico().add(new ItemHistorico());

		assertEquals(3, sprint.getItensHistorico().size());
	}
	
	@Test
	public void testaBurnUpBOCaculaEixosXYHoras(Sprint sprint){
		ItemHistorico item = new ItemHistorico();
		Date data = new Date(2014,11,20);
		item.setData(data);
		item.setTempoGasto(1);
		
		sprint = new Sprint();
		sprint.setItensHistorico(new ArrayList<ItemHistorico>());
		sprint.getItensHistorico().add(item);
		
		BurnUpBO bo = new BurnUpBO();
		Map<Date, Double> eixoXY = bo.calculaEixosXYHoras(sprint);
		assertTrue(eixoXY.containsKey(data));
	}
	
}
