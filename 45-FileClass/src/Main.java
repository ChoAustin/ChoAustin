import java.io.File;

public class Main {

	public static void main(String[] args) {
		// file = an abstract representation of file and directory pathnames
		
		File file = new File("C:\\Users\\austi\\Desktop\\secret_message.txt");
		
		if(file.exists()) {
			System.out.println("That file exists! :O!");
			System.out.println(file.getPath());
			//System.out.println(file.getAbsolutePath());
			System.out.println(file.isFile());
			
		}
		else {
			System.out.println("That file doesn't exist :(");
		}
	}

}
