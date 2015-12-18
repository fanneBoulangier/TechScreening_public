package taken;

import java.util.Date;

//zie leesmij.txt
public class Periode {

	private Date start;
	private Date eind;

	public Periode(Date start, Date eind) {
		super();
		this.start = start;
		this.eind = eind;
	}

	public Date getStart() {
		return start;
	}

	public void setStart(Date start) {
		this.start = start;
	}

	public Date getEind() {
		return eind;
	}

	public void setEind(Date eind) {
		this.eind = eind;
	}

	@Override
	public String toString() {
		return "Periode [start=" + start + ", eind=" + eind + "]";
	}

}
