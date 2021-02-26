
public class Solution2 {
	public static Object lockOne = new Object();
	public static Object lockTwo = new Object();

	public static void main(String[] args) {
		FirstThread frstThrd = new FirstThread();
		SecondThread scndThrd = new SecondThread();
		frstThrd.start();
		scndThrd.start();
	}

	private static class FirstThread extends Thread {
		public void run() {
			synchronized (lockOne) {
				System.out.println("Threading 1: Holding lock 1");
				try {
					Thread.sleep(10);
				} catch (InterruptedException e) {
					System.out.println(e);
				}
				System.out.println("Threading 1: Waiting lock 2");
				synchronized (lockTwo) {
					System.out.println("Thread1 holding lock1 & lock2");
				}
			}
		}
	}

	private static class SecondThread extends Thread {
		public void run() {
			synchronized (lockTwo) {
				System.out.println("Threading 2: Holding lock 2");
				try {
					Thread.sleep(10);
				} catch (InterruptedException e) {
					System.out.println(e);
				}
				System.out.println("Threading 2: Waiting lock 1");
				synchronized (lockOne) {
					System.out.println("Thread2 holding lock1 & lock2");
				}
			}
		}
	}
}
