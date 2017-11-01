package demo2;



public class App {
	
	//Using Runnable by making use of Lambda functions
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Runnable r = () -> System.out.println("Hello");
		new Thread(() -> {
			for(int i=0; i<10; i++){
				System.out.println("Hello "+i);
				try {
					Thread.sleep(100);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}).start();
		
		new Thread(() -> {
			for(int i=0; i<10; i++){
				System.out.println("Hello "+i);
				try {
					Thread.sleep(100);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}).start();

	}

}
