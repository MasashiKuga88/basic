public class Fibonacci{
    void run(){
	Integer number=5;
	Integer result;

	result=
	System.out.printf("fibonacci=(%d)=%d%n",number,result);
    }
    void printFibonacciSeries(Integer max){
	Integer result=0;
	Integer f1=1,f0=0;


	for(int i=0;i<max;i++){
	    if(i==0){
		System.out.println(0);
	    }
	    else if(i==1){
		System.out.println(1);
	    }
	    else{
		Integer f2=f1+f0;
		System.out.println(f2);
		f0=f1;
		f1=f2;
	    }
	}
    }


    public static void main(String[] args){
	Fibonacci application = new Fibonacci();
	application.run();


    }
}