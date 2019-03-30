public class Date
{
	private int year;
	private int month;
	private int day;

	public Date()
	{

	}

	public Date ( int y, int m, int d ){
		this.year = y;
		this.month = m;
		this.day = d;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		this.month = month;
	}

	public int getDay() {
		return day;
	}

	public void setDay(int day) {
		this.day = day;
	}

	@Override
	public String toString() {
		return month + "/" + day + "/" + year;
	}
}