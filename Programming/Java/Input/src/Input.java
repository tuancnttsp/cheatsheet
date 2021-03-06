import java.awt.SystemColor;
import java.io.*;

public class Input {

	public static void main(String[] args) {
		System.out.print("Nhap cau xuat ra man hinh: ");
		String output = getInput();
		System.out.println(output);
	}

	private static String getInput() {
		System.out.flush(); // waiting for input data
		BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));
		try {
			return stdin.readLine();
		} catch (Exception e) {
			System.out.println("Error message: " + e.getMessage());
			return "";
		}
	}

}
