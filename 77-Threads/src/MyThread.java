
public class MyThread extends Thread{
	
	@Override
	public void run() {
		
		//System.out.println("This thread is running!");
		
		if(this.isDaemon()) {
			System.out.println("This is a daemon thread running.");
		}
		else {
			System.out.println("This is a user thread running.");
		}
	}
}
