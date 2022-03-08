package MultiThreading;

class AAA extends Thread {
	public void run() {
		System.out.println("Thread A");
		for (int i = 1; i <= 10; i++) {
			System.out.println("Value of i in thread A" + i);
		}
		System.out.println("exit A");
	}
}

class BBB extends Thread {
	public void run() {
		System.out.println("Thread B");
		for (int i = 1; i <= 10; i++) {
			System.out.println("Value of i in thread B" + i);
		}
		System.out.println("exit B");
	}
}

class CCC extends Thread {
	public void run() {
		System.out.println("Thread C");
		for (int i = 1; i <= 10; i++) {
			System.out.println("Value of i in thread C" + i);
		}
		System.out.println("exit C");
	}
}

public class UsingJoin {

	public static void main(String[] args) {

		AAA obj = new AAA();
		BBB obj2 = new BBB();
		CCC obj3 = new CCC();

		obj2.start();
		try {

			obj2.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		obj.start();
		obj3.start();

	}

}