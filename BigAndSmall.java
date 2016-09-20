import java.util.*;

public class BigAndSmall{
    public static void main(String[] args){
	Random   rand  = new Random();
	Integer value = rand.nextInt(10);
	
	System.out.println(value);
	
	if(value<5){
	    System.out.println("Small!");
        }
	else{
	    System.out.println("Big!");
	}
    }
}