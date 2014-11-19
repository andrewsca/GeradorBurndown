package br.com.tcc.util;

import java.text.ParseException;
import java.util.Date;

import junit.framework.TestCase;

import org.junit.Test;

import br.com.tcc.model.Sprint;


public class TesteBurnDown extends TestCase{	
	
	@Test
	public void testaSprintDataFim01Dezembro2014() throws ParseException {
		
		Sprint sprint = new Sprint();	
		
		@SuppressWarnings("deprecation")
		Date data = new Date(2014,12,01);		
		sprint.setDtFim(data);		
		assertEquals(data, sprint.getDtFim());
	}
	
}