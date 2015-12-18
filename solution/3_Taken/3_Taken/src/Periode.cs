using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

namespace taken
{
    /// <summary>
    /// zie leesmij.txt
    /// </summary>
    public class Periode
    {
        private DateTime? start;
        private DateTime? eind;

        public Periode(DateTime? start, DateTime? eind) : base()
        {
		    this.start = start;
		    this.eind = eind;
	    }

        public DateTime? getStart()
        {
		    return start;
	    }

        public void setStart(DateTime? start)
        {
		    this.start = start;
	    }

        public DateTime? getEind()
        {
		    return eind;
	    }

        public void setEind(DateTime? eind)
        {
		    this.eind = eind;
	    }

	    public String toString() {
		    return "Periode [start=" + start + ", eind=" + eind + "]";
	    }
    }
}
