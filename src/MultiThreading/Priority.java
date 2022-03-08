package MultiThreading;

class AOne extends Thread {

	public void run() {

		System.out.println("Thread AOne Started");
		for (int i = 1; i <= 4; i++) {

			System.out.println("From thread AOne: =" + i);

		}
		System.out.println("EXIT FROM AOne");

	}

}

class BTwo extends Thread {

	public void run() {

		System.out.println("Thread BTwo Started");
		for (int j = 1; j <= 4; j++) {

			System.out.println("From thread BTwo:  =" + j);

		}
		System.out.println("EXIT FROM BTwo");

	}

}

class CThree extends Thread {

	public void run() {

		System.out.println("Thread CThree Started");
		for (int k = 0; k <= 4; k++) {

			System.out.println("From thread C : K =" + k);

		}
		System.out.println("EXIT FROM C");

	}

}

class Priority {

	public static void main(String args[]) {

		AOne threadAOne = new AOne();
		BTwo threadBTwo = new BTwo();
		CThree threadCThree = new CThree();

		threadCThree.setPriority(Thread.MAX_PRIORITY);

		threadBTwo.setPriority(threadBTwo.getPriority() + 1);

		threadAOne.setPriority(Thread.MIN_PRIORITY);

		threadBTwo.start();
		System.out.println("Start Thread BTwo");

		threadAOne.start();
		System.out.println("Start Thread AOne");

		threadCThree.start();
		System.out.println("Exit from main thread ");

	}
}