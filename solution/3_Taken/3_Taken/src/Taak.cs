using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

namespace taken
{
    /// <summary>
    /// zie leesmij.txt
    /// </summary>
    public class Taak
    {
        private TaakType type;
	    private String omschrijving;
	    private Periode oplossing;

	    public String getOmschrijving() {
		    return omschrijving;
	    }

	    public void setOmschrijving(String omschrijving) {
		    this.omschrijving = omschrijving;
	    }

	    public TaakType getType() {
		    return type;
	    }

	    public void setType(TaakType type) {
		    this.type = type;
	    }

	    public Periode getOplossing() {
		    return oplossing;
	    }

	    public void setOplossing(Periode oplossing) {
		    this.oplossing = oplossing;
	    }

	    public String toString() {
		    return "Taak [type=" + type + ", omschrijving=" + omschrijving
				    + ", oplossing=" + oplossing + "]";
	    }
    }
}
