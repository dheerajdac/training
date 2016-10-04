
public class Main {
	public Main() {
	}
	public static void main(String[] args) {
		Container container=new Container();
		Producer producer = new Producer(container);
		Consumer consumer = new Consumer(container);
		Thread threadProducer = new Thread(producer);
		Thread threadConsumer = new Thread(consumer);
		threadConsumer.start();
		threadProducer.start();
	}
}
