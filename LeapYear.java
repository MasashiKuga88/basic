public class LeapYear{
    public static void main(String[] args){
	Integer year = 2016;
	Boolean leapYear = false;

	if(year%4==0){
	    if (year%100==0){
		if(year%400==0){
		    leapYear=true;
		}
		else{
		    leapYear=false;
		}
	    }
	    else{
		leapYear=true;
	    }
	}
	else{
	    leapYear=false;
	}

	if(leapYear){
	    System.out.printf("%d年はうるう年です。%n",year);
	}
	else{
	    System.out.printf("%dはうるう年ではありません。%n",year);
	}
    }
}