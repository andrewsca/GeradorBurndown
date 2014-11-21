package bo;

import java.sql.Date;
import java.util.LinkedHashMap;
import java.util.Map;

import model.ItemHistorico;
import model.Sprint;

public class BurnUpBO {

	public Map<Date, Double> calculaEixosXYHoras(Sprint sprint) {
		Map<Date,Double> eixoXY = new LinkedHashMap<Date,Double>();
		Date data = new Date(2014,11,20);
		eixoXY.put(data, 1.0);
		
		for (ItemHistorico item : sprint.getItensHistorico()) {
			eixoXY.put((Date) item.getData(), item.getTempoGasto());
		}
		
		return eixoXY;
	}

}
