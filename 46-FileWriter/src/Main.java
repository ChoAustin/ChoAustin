import java.io.FileWriter;
import java.io.IOException;

public class Main {

	public static void main(String[] args) {
		
		try {
			FileWriter writer = new FileWriter("poem.txt");
			writer.write("Roses are red \nViolets are blue \nI don't need you");
			writer.append("\n(A poem by Me");
			writer.close();
		}
		catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
