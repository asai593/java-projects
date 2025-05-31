package xyz;
class cars extends Thread{
	public void run(){
		for (int i=0;i<=3;i++)
		{
			System.out.println("BMW car moving"+i);
			try {
				Thread.sleep(500);
			}
			catch(Exception e) {
				
			}
		}
	}
}
class bikes extends Thread{
	public void run(){
		for (int i=0;i<=3;i++)
		{
			System.out.println("kawasaki car moving"+i);
			try {
				Thread.sleep(500);
			}
			catch(Exception e) {
				
			}
		}
	}
}
public class MultiThreading{
	public static void main(String[] args)
	{

		new cars().start();
		new bikes().start();
	}
}