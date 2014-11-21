import model.Sprint;

import org.junit.Test;

import junit.framework.TestCase;

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
		assertEquals(2, sprint.getEstorias().size());
	}
	
	
}
