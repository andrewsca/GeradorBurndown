package br.com.tcc.util;

import java.text.ParseException;

import org.junit.Test;

import br.com.tcc.model.Sprint;
import junit.framework.TestCase;

public class TesteBurnDown extends TestCase{
	
	@Test
	public void testaSprintDeveTer170HorasTotais() throws ParseException{
		Sprint sprint = Main.criaSprint();
		
		assertEquals(170.0, sprint.getTotalHoras());
	}
}
