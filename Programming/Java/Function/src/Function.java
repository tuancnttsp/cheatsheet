import com.sun.imageio.spi.OutputStreamImageOutputStreamSpi;


public class Function {

	public static void main(String[] args) {
		helloWorld();
		// helloWorld1(); //error
		
		outputString("Hello abc!");
	}
	
	public static void helloWorld(){
		System.out.println("Hello World");
	}

	public void helloWorld1(){ // can not call this non static method from static method
		System.out.println("Hello World");
	}
	
	public static void outputString(String str){
		System.out.println(str);
	}
	
	public static int Cong(int a, int b){
		int res;
		res = a + b;
		return res;
	}
	
	public static int Cong(double a, double b){
		int res;
		res = (int)a + (int)b;
		return res;
	}
	
//	public static double Cong(int a, int b){ 
	/**
     *   Error because Cong(int, int) has defined above
     *   although the return value has different data type, the data type of parameter is more important
	 */
//		double res;
//		res = a + b;
//		return res;
//	}

}
