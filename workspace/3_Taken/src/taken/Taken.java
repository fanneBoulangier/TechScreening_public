package taken;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

//zie leesmij.txt
public class Taken {
	
	private Set<Taak> taken = new HashSet<Taak>();

	public Set<Taak> getTaken(){
		return this.taken;
	}

	public Set<Taak> geefTakenVanTypeOplossingGestartVoor(TaakType taakType, Date oplossingStartDatum) {
		Set<Taak> result = new HashSet<Taak>();
		for (Taak taak : taken) {
			if (taak.getType().equals(taakType)) {
				if (taak.getOplossing() != null) {
					if (taak.getOplossing().getStart().before(oplossingStartDatum)) {
						result.add(taak);
					}
				}
			}
		}
		return result;
	}

	public List<Taak> geefOpgelosteTakenVanTypeGesorteerdVolgensOplossingsTermijn(TaakType taakType) {
		List<Taak> result = new ArrayList<Taak>();
		for(Taak taak: taken) {
			if (taak.getType().equals(taakType)) {
				if (taak.getOplossing() != null && taak.getOplossing().getEind() != null) {
					result.add(taak);
				}
			}
		}
		Collections.sort(result, new Comparator<Taak>() {

			@Override
			public int compare(Taak taak1, Taak taak2) {
				return new Long(taak1.getOplossing().getEind().getTime()
						- taak1.getOplossing().getStart().getTime())
						.compareTo(taak2.getOplossing().getEind().getTime()
								- taak2.getOplossing().getStart().getTime());
			}
		});
		return result;
	}

	public Set<Taak> getGestarteTakenVanType(TaakType taakType) {
		Set<Taak> result = new HashSet<Taak>();
		for(Taak taak: taken) {
			if (taakType.equals(taak.getType())) {
				if (taak.getOplossing() != null) {
					result.add(taak);
				}
			}
		}
		return result;
	}

}
