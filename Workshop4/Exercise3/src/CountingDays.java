/*
 * This code was created to count days between two dates, represented as 3 integers.
*/


public class CountingDays {

	//arrays of the number of days in each month of a normal year and leap year.    
	final int[] daysInMonth={31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
	final int[] daysInMonthInLeapYear={31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
	   
	
	int days;
	boolean datesChronological;
	boolean yearLeap;
	
	//works out if it is a leap year
	public boolean yearLeap(int year) 
	{
		if(year%4==0)
        {
            if(year%400!=0)
            {
               yearLeap=true;
            }
            else
            {
                yearLeap=false;
            }
        }
        else
        {
            yearLeap=false;
        }
		return yearLeap;
	}
	
	
	 //works out if the second date is after the first date
    public boolean chronologicalDates(int day, int month, int year, int day2, int month2, int year2)
    {
        if(year2>year)
        {
            if(year2!=year)
            {
                datesChronological=true;
            }
            else
            {
                if(month2>month)
                {
                    if(month2!=month)
                    {
                        datesChronological=true;
                    }
                    else
                    {
                        if(day2>day)
                        {
                            datesChronological=false;
                        }
                        else
                        {
                            datesChronological=true;
                        }
                    }
                }
                else
                {
                    datesChronological=false;
                }
            }
           
        }
        else
        {
            datesChronological=false;
        }
        return datesChronological;
    }
	   
    
	// calculates days till end of month from date given
	public int daysToEndMonth(int day, int month, int year) 
	    {
	        int temp=days;
	        int daysLeft=0;
	        if(yearLeap(year)==true)
	        {
	        	daysLeft=daysInMonthInLeapYear[month-1]-day;
	         }
	        else
	        {
	            daysLeft=daysInMonth[month-1]-day;
	        }
	        days=temp+daysLeft;
	        return days;
	    }
	
	
	//calculates days in month given
	public int daysInMonth(int month, int year) 
	    {
	        int temp=days;
	        int daysInThisMonth=0;
	        if(yearLeap(year)==true)
	        {
	        	daysInThisMonth=daysInMonthInLeapYear[month-1];
	        }
	        else
	        {
	            daysInThisMonth=daysInMonth[month-1];
	        }
	        days=temp+daysInThisMonth;
	        return days;
	    }
	    
	
	//calculates number of days to the end of the year, from the beginning of month given.
	public int daysToEndYear(int month, int year)
	    {
	    	if(yearLeap(year)==true)
	        {
	           int temp=days;
	           int m=month;
	           int d=0;
	           while(m<=11)
	           {
	        	   int temp2=d;
	        	   int dayinmonth=daysInMonthInLeapYear[m];
	        	   d=temp2+dayinmonth;
	        	   m++;
	           }
	        	days=temp+d;   
	        }
	        else
	        {
	        	int temp=days;
		           int m=month-1;
		           int d=0;
		           while(m<=11)
		           {
		        	   int temp2=d;
		        	   int dayinmonth=daysInMonth[m];
		        	   d=temp2+dayinmonth;
		        	   m++;
		           }
		        	days=temp+d;
	        }
	    	
	    	return days;
	    }
	   
	    
	// calculates days in year given
	public int daysInYear(int year) 
	    {
	        if(yearLeap(year)==true)
	        {
	            int temp=days;
	            days=temp+366;
	        }
	        else
	        {
	            int temp=days;
	            days=temp+365;
	        }
	        return days;
	    }
	   
	   
	   
	//finds number of days between the dates using the above methods   
	public int daysBetweenDates(int day, int month, int year, int day2, int month2, int year2)
	    {
	        chronologicalDates(day, month, year, day2, month2, year2);
	       
	        if(datesChronological=true)
	        {
	            //this uses the above methods to count the days
	            if(year==year2)
	            {
	                if(month==month2) // if date is in same month
	                {
	                    days=day2-day;
	                }
	                else // if date is in same year
	                {
	                    int temp=daysToEndMonth(day, month, year);
	                    int m=month-1;
	                    int d=0;
	                    while(m<month2)
	     	           {
	     	        	   int temp2=d;
	     	        	   int dayinmonth=daysInMonthInLeapYear[m];
	     	        	   d=temp2+dayinmonth;
	     	        	   m++;
	     	           }
	                    days=temp+d+day2; //adds up days
	                }
	            }
	            else //if date is in another year
	            {
	                int temp1=daysToEndMonth(day, month, year);
	                int temp2=daysToEndYear(month+1,year);
	                
	                int y=year+1;
	                int dinyear=0;
	                while(y!=year2) //this adds up days in years between dates
	                {
	                    
	                    int temp3=dinyear;
	                    int d=daysInYear(y);
	                    dinyear=temp3+d;
	                    y++;
	                }
	                
	                int m=0;
	                int dinmonth=0;
	                while(m!=month2)
	                {
	                	int temp4=dinmonth;
	                	int d=daysInMonth(m, year2);
	                	dinmonth=d+temp4;
	                	m++;
	                }
	                
	                days=temp1+temp2+dinyear+dinmonth+day2; //adds up all days
	            }
	        }
	        else
	        {
	            System.out.println("Dates must be chronological");
	        }
	       
	        return days;       
	    }
	   
	

}
