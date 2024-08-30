package threadBasics;

class Task1 extends Thread {
	public void run() {
		System.out.print("\nTask1 Started");
		for (int i = 101; i <= 199; i++)
			System.out.print(i + " ");

		System.out.print("\nTask1 Done ");
	}
}

class Task2 implements Runnable {

	@Override
	public void run() {
		System.out.print("\nTask2 Started");
		for (int i = 201; i <= 299; i++)
			System.out.print(i + " ");

		System.out.print("\nTask2 Done ");
	}

}

public class ThreadBasicsRunner {

	public static void main(String[] args) {
		// Task1
		System.out.print("\nTask1 Kicked off");
		Task1 task1 = new Task1();
		// task1.run();
		task1.start();

		// Task2
		System.out.print("\nTask2 Kicked off");
		Task2 task2 = new Task2();
		Thread task2Thread = new Thread(task2);
		task2Thread.start();

		// Task3
		System.out.print("\nTask3 Kicked off");
		for (int i = 301; i <= 399; i++) {
			System.out.print(i + " ");
		}

		System.out.print("\nTask3 Done");

		System.out.print("\nMain Done");

	}

}