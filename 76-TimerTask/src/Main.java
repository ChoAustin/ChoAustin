import java.util.Calendar;
import java.util.Timer;
import java.util.TimerTask;

public class Main {

	public static void main(String[] args) {
		
		Timer timer = new Timer();
		
		TimerTask task = new TimerTask() {
			
			int counter = 10;
			@Override
			public void run() {
				if(counter>0) {
				System.out.println(counter + " seconds");
				counter--;
				}
				else {
					System.out.println("Wake up!");
					timer.cancel();
				}
			}
		};
		
		Calendar date = Calendar.getInstance();
		date.set(Calendar.YEAR,2022);
		date.set(Calendar.MONTH,Calendar.APRIL);
		date.set(Calendar.DAY_OF_MONTH,8);
		date.set(Calendar.HOUR_OF_DAY,18);
		date.set(Calendar.MINUTE,32);
		date.set(Calendar.SECOND,50);
		date.set(Calendar.MILLISECOND,0);
		
		//timer.schedule(task, 0);
		//timer.schedule(task, date.getTime());
		timer.scheduleAtFixedRate(task, date.getTime(), 1000);
		
	}

}
