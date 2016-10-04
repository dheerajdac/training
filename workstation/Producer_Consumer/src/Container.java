import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;;

public class Container {
	int status=0;
	static int counter=0;
	Lock lock = new ReentrantLock();
	Condition condition;
	public Container() {
		lock = new ReentrantLock();
		condition= lock.newCondition();
	}
	
	public void put(){
		lock.lock();
		while(status==1)
		{
			try {
				condition.await();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		counter++;
		status=1;
		condition.signalAll();
	//	lock.unlock();
	}

	public void get(){
		lock.lock();
		while(status==0){
			try {
				condition.await();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		counter++;
		status=0;
		condition.signalAll();
	//	lock.unlock();
		
	}

}
