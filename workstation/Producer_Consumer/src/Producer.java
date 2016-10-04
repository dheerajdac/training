
public class Producer implements Runnable{
Container container;
	
	public Producer(Container container) {
		this.container=container;
	}

	 @Override
	public void run() {
		 while(true)
		 {
	//		 container.lock.lock();
			 container.put();
			 System.out.println("In Producer "+container.counter);
	//		 container.lock.unlock();
		 }
	}

}
