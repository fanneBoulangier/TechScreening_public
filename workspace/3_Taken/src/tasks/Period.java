package tasks;

import java.util.Date;

//See readme.txt
public class Period {

	private Date start;
	private Date end;

	public Period(Date start, Date end) {
		super();
		this.start = start;
		this.end = end;
	}

	public Date getStart() {
		return start;
	}

	public void setStart(Date start) {
		this.start = start;
	}

	public Date getEnd() {
		return end;
	}

	public void setEnd(Date eind) {
		this.end = eind;
	}

	@Override
	public String toString() {
		return "Period [start=" + start + ", end=" + end + "]";
	}

}
