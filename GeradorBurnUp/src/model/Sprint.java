package model;

import java.util.List;


public class Sprint {
	private int qtdeDias;
	private List<Estoria> estorias;
	private Double totalHoras;
	private List<ItemHistorico> itensHistorico;

	public int getQtdeDias() {
		return qtdeDias;
	}

	public void setQtdeDias(int qtdeDias) {
		this.qtdeDias = qtdeDias;
	}

	public Double getTotalHoras() {
		return totalHoras;
	}

	public void setTotalHoras(Double totalHoras) {
		this.totalHoras = totalHoras;
	}

	public List<Estoria> getEstorias() {
		return estorias;
	}

	public void setEstorias(List<Estoria> estorias) {
		this.estorias = estorias;
	}

	public List<ItemHistorico> getItensHistorico() {
		return itensHistorico;
	}

	public void setItensHistorico(List<ItemHistorico> itensHistorico) {
		this.itensHistorico = itensHistorico;
	}
}
