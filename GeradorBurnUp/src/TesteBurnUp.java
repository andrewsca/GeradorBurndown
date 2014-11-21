import java.util.ArrayList;

import junit.framework.TestCase;
import model.Estoria;
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
	public void testaCalculoTotalHorasDeveSer16(){
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
		
		assertEquals(20, bo.calculaTotalPontos(sprint));
	}
	
}
