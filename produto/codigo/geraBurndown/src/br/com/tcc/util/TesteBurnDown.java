package br.com.tcc.util;

import java.text.ParseException;
import java.util.Date;
import junit.framework.TestCase;
import org.junit.Test;
import br.com.tcc.model.Sprint;

public class TesteBurnDown extends TestCase{
	
	@Test
	public void testaSprintDeveTer170HorasTotais() throws ParseException{
		
		Sprint sprint = Main.criaSprint();		
		assertEquals(170.0, sprint.getTotalHoras());
	}
	
	@Test
	public void testaSprintDeveTer7Dias() throws ParseException{
		
		Sprint sprint = Main.criaSprint();		
		assertEquals(7, sprint.getQtdeDias());
	}
	
	@Test
	public void testaDeveRetornarDataNula() throws ParseException{
		
		Date date = DataUtil.converteStringParaDate("");
		assertNull("mensagem", date);
	}
	
	@Test(expected=ParseException.class)
	public void testaDeveRetornarExcecao() throws ParseException{
		
		@SuppressWarnings("unused")
		Date date = DataUtil.converteStringParaDate("10/45/1991");
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