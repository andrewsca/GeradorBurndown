package bo;

import model.Estoria;
import model.Sprint;

public class SprintBO {

	public Double calculaTotalHoras(Sprint sprint) {
		Double totalHorasSprint = 0.0;
		for (Estoria est : sprint.getEstorias()) {
			totalHorasSprint += est.getTempoRestante();
		}
		
		return totalHorasSprint;
	}

	public Integer calculaTotalPontos(Sprint sprint) {
		Integer totalPontosSprint = 0;
		for (Estoria est : sprint.getEstorias()) {
			totalPontosSprint += est.getQtdePontos();
		}
		
		return totalPontosSprint;
	}

}
