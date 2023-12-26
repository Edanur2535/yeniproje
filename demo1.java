package oop;

class MyClass implements Runnable{

	@Override
	public void run() {
		for(int i=0; i<10; i++) {
			System.out.println(Thread.currentThread().getId()+"value"+i);
			
		}
		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// TODO Auto-generated method stub
		
	}
	
}
class MyClass1 implements Runnable{

	@Override
	public void run() {
		for(int i=0; i<20; i++) {
			if(i%2==0) {
			System.out.println("value"+i);
			}
		}
		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// TODO Auto-generated method stub
		
	}
	
}

public class demo1 {

	public static void main(String[] args) {
		Thread t1=new Thread(new MyClass());
        Thread t2=new Thread(new MyClass1());
	    t1.start();
	    t2.start();
	}

}
