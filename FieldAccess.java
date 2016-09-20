public class FieldAccess{
    void run(){
	String name = "Masashi Kuga";

	System.out.printf("%s",name);
    }

    public static void main(String[] args){

	FieldAccess application = new FieldAccess();
	application.run();
    }
}