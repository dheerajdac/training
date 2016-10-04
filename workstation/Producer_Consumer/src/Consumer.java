
public class Consumer implements Runnable{
	Container container;
	
	public Consumer(Container container) {
		this.container=container;
	}

	 @Override
	public void run() {
		while(true)
		{
	//		container.lock.lock();
			
			container.get();
			System.out.println("In Consumer "+container.counter);
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
	//		container.lock.unlock();
		}
	}
}
