using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

namespace taken
{
    /// <summary>
    /// zie leesmij.txt
    /// </summary>
    public class Taken
    {
        private HashSet<Taak> taken = new HashSet<Taak>();

	    public HashSet<Taak> getTaken(){
		    return this.taken;
	    }

	    public HashSet<Taak> geefTakenVanTypeOplossingGestartVoor(TaakType taakType, DateTime oplossingStartDatum) {
		    HashSet<Taak> result = new HashSet<Taak>();
		    foreach (Taak taak in taken) {
			    if (taak.getType() == taakType) {
				    if (taak.getOplossing() != null) {
					    if (DateTime.Compare(taak.getOplossing().getStart().Value, oplossingStartDatum) < 0) {
						    result.Add(taak);
					    }
				    }
			    }
		    }
		    return result;
	    }

	    public List<Taak> geefOpgelosteTakenVanTypeGesorteerdVolgensOplossingsTermijn(TaakType taakType) {
		    List<Taak> result = new List<Taak>();
		    foreach(Taak taak in taken) {
			    if (taak.getType() == taakType) {
				    if (taak.getOplossing() != null && taak.getOplossing().getEind() != null) {
					    result.Add(taak);
				    }
			    }
		    }

            result.Sort(new TaakComparer());
		    return result;
	    }

	    public HashSet<Taak> getGestarteTakenVanType(TaakType taakType) {
		    HashSet<Taak> result = new HashSet<Taak>();
		    foreach(Taak taak in taken) {
			    if (taakType == taak.getType()) {
				    if (taak.getOplossing() != null) {
					    result.Add(taak);
				    }
			    }
		    }
		    return result;
	    }

        private class TaakComparer : IComparer<Taak>
        {
            public int Compare(Taak taak1, Taak taak2)
            {
                return (taak1.getOplossing().getEind().Value.Ticks - taak1.getOplossing().getStart().Value.Ticks).CompareTo(taak2.getOplossing().getEind().Value.Ticks - taak2.getOplossing().getStart().Value.Ticks);
            }
        }
    }
}
