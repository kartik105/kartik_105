class MyTime
{
	int hour = 0 ;
	int minute = 0 ;
	int second = 0 ;
	MyTime()
	{
		this.hour = 1 ;
		this.minute = 1 ; 
		this.second = 1 ;
	}
	MyTime(int hour,int minute,int second )
	{
		this.hour = hour ;
		this.minute = minute ;
		this.second = second ;
	}
	public void setTime(int hour, int minute,int second) throws IllegalArgumentException
	{
		this.hour = hour ;
		this.minute = minute ;
		this.second = second ;
	}
	public int getHour()
	{
		return this.hour ;
	}
	public int getMinute()
	{
		return this.minute ;
	}
	public int getSecond()
	{
		return this.second ;
	}
	public void setHour(int hour)
	{
		this.hour = hour ;
	}
	public void setMinute(int minute)
	{
		this.minute = minute ;
	} 
	public void setSecond(int second)
	{
		this.second = second ;
	}
	public String toString()
	{
		String strTIme ;
		strTime = this.hour + " : " + this.minute + " : " + this.second ;
		return strTime ;
	}
	public static boolean validateHour(int hour) throws IllegalArgumentException
	{
		if(hour >= 0 && hour <24)
			{return true} ;
		else 
			{throw new IllegalArgumentException("Invalid hour") ;}
		return true ;
	}
	public static boolean validateMinute(int minute) throws IllegalArgumentException
	{
		if(minute >= 0 && minute <60)
			{return true} ;
		else 
			{throw new IllegalArgumentException("Invalid minute") ;}
		return true ;
	}
	public static boolean validateMinute(int second) throws IllegalAccessException
	{
		if(second >= 0 && second <24)
			{return true} ;
		else 
			{throw new IllegalAccessException("Invalid second") ;}
		return true ;
	}
}