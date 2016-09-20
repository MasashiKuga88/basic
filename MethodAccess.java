public class MethodAccess{
    void run(){
        this.greet("Masashi Kuga");
    }

    void greet(String name){
	System.out.printf("Hello!");
	System.out.printf("%s%n",name);
    }

    public static void main(String[] args){
        MethodAccess application = new MethodAccess();
        application.run();
    }
}