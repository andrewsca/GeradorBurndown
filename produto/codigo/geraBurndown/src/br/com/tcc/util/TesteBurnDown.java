package br.com.tcc.util;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import junit.framework.TestCase;

import org.junit.Test;

import br.com.tcc.bo.SprintBO;
import br.com.tcc.model.Estoria;
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
	
	
	/**
	 * Métodos para testes da classe DataUtil e demais datas.
	 * @throws ParseException
	 */
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
	
	/**
	 * Métodos de teste da Classe SprintBO.
	 */
	@Test
	public void testaCalculoTotalPontosDeveSer10(){
		
		SprintBO bo = new SprintBO();
		Sprint sprint = new Sprint();
		sprint.setEstorias(criaListaEstorias());

		assertEquals(new Integer(10), bo.calculaTotalPontos(sprint));
		
	}
	
	/**
	 * Método utilizado para criar uma lista de estorias para testes.
	 */
	private List<Estoria> criaListaEstorias(){
		
		List<Estoria> estorias = new ArrayList<Estoria>();
		
		Estoria est1 = new Estoria();
		est1.setTempoEstimado(10);
		est1.setCodEstoria(1);
		est1.setQtdePontos(6);

		Estoria est2 = new Estoria();
		est2.setTempoEstimado(15);
		est2.setCodEstoria(2);
		est2.setQtdePontos(4);
		
		estorias.add(est1);
		estorias.add(est2);
		
		return estorias;
	}
}