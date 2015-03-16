package thread1;

public class Thread2 extends Thread {

	public void run(){
		
		
		for(int i=0; i<50; i++){
			//System.out.println(">> Thread 2");
			ProcesoManager.procesar("2");	
			//System.out.println("<< Thread 2");	
		}
	}
}
