package world;

	import java.io.IOException;

	public class ThreadA extends Thread {
		SearchingInFile sf2;
		String text, directory;

		public ThreadA(SearchingInFile sf1, String text, String directory) {
			this.setName("thread A");
			System.out.println("ThreadA started");
			sf2 = sf1;
			this.text = text;
			this.directory = directory;
		}

		public void run() {
			System.out.println("ThreadA running");
			try {
				String s = sf2.directory(text, directory);
				System.out.println(s);
				System.out.println("ThreadA ended");
			} catch (IOException ie) {
				ie.printStackTrace();
			}

		}

	}



