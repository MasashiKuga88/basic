public class PrimeCheck{
    public static void main(String[] args){
	Integer number = 133;
	Boolean prime  = true;

	for(Integer i=2;i<number;i++){

	    if(number%i==0){
		prime=false;
		break;
	    }
	}

	if(prime){
	    System.out.printf("%dは素数である。%n",number);
	}
	else{
	    System.out.printf("%dは素数でない。%n",number);
	}
    }
}
		