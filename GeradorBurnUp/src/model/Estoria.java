package model;

public class Estoria {
	private Integer codEstoria;
	private double tempoRestante;
	private Integer qtdePontos;
	

	public Estoria(Integer codEstoria, double tempoRestante) {
		super();
		this.codEstoria = codEstoria;
		this.tempoRestante = tempoRestante;
	}

	public Estoria() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Integer getCodEstoria() {
		return codEstoria;
	}

	public void setCodEstoria(Integer codEstoria) {
		this.codEstoria = codEstoria;
	}

	public Double getTempoRestante() {
		return this.tempoRestante;
	}

	public void setTempoRestante(double tempoRestante) {
		this.tempoRestante = tempoRestante;
	}

	public Integer getQtdePontos() {
		return qtdePontos;
	}

	public void setQtdePontos(Integer qtdePontos) {
		this.qtdePontos = qtdePontos;
	}
}
