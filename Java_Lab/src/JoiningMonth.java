
public class JoiningMonth {

	private String day,month,year;
	public JoiningMonth(String day,String month,String year) {
		this.day=day;
		this.month=month;
		this.year=year;
	}
	public String getJoiningMonth(){
		return month+" "+year;
	}
}
