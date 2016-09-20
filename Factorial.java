public class Factorial{

    void run(){

        Integer number = 10;
	Integer factorialValue;

	factorialValue = this.factorial(number);

	System.out.printf("%d! = %d%n", number, factorialValue);
    }

    Integer factorial(Integer number){
	Integer result =1;
	for(Integer i=1;i<number;i++){
	    result=result*i;


	}
	return result;
    }

    public static void main(String[] arg){
	Factorial application = new Factorial();
	application.run();
    }


}