public class XXX{
    public static void main(String[] args){
	Integer i,k,j;
	System.out.println("   0123456789");
	for(i=0;i<10;i++){
	    System.out.print(i+": ");

	    for(j=0;j<10;j++){
		if(j==i||(9-i==j)){
		    System.out.print("X");
	        }else{
		    System.out.print(" ");
		}
	    }
	    System.out.printf("%n");
	}
    }
}