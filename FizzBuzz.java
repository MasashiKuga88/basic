public class FizzBuzz{
    void run(){
	Integer max = 100;
	this.printFizzBuzz(max);
    }

    void printFizzBuzz(Integer max){
	for(Integer i=0;i<=max;i++){
	    if(i%15==0){
		System.out.println("FizzBuzz");
	    }else if(i%3==0){
		System.out.println("Fizz");
	    }else if(i%5==0){
		System.out.println("Buzz");
	    }else{
		System.out.printf("%d%n",i);
	    }
	}
    }

    public static void main(String[] arg){
	FizzBuzz application = new FizzBuzz();
	application.run();
    }
}