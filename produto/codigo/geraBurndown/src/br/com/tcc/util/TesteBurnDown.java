package br.com.tcc.util;

import java.text.ParseException;
import java.util.Date;

import org.junit.Test;

import br.com.tcc.model.Sprint;
import junit.framework.TestCase;

public class TesteBurnDown extends TestCase{
	
	@Test
	public void testaSprintDeveTer170HorasTotais() throws ParseException{
		Sprint sprint = Main.criaSprint();
		
		assertEquals(170.0, sprint.getTotalHoras());
	}
	
	
	@Test
	public void testaSprintDataInicioNula() throws ParseException {
		Sprint sprint = new Sprint();
		
		assertEquals(null, sprint.getDtInicio());
	}
	
	@Test
	public void testaSprintDataFim01Dezembro2014() throws ParseException {
		Sprint sprint = new Sprint();
		
		@SuppressWarnings("deprecation")
		Date data = new Date(2014,12,01);
		
		sprint.setDtFim(data);
		
		assertEquals(data, sprint.getDtFim());
	}
	
}
