package world;

	import java.io.IOException;

	public class ThreadB extends Thread {
		SearchingInFile sf2;
		String text, directory;

		public ThreadB(SearchingInFile sf1, String text, String directory) {
			this.setName("Thread B");
			System.out.println("ThreadB started");
			sf2 = sf1;
			this.text = text;
			this.directory = directory;
		}

		public void run() {
			System.out.println("ThreadB running");
			try {
				String s = sf2.directory(text, directory);
				System.out.println(s);
				System.out.println("ThreadB ended");
			} catch (IOException ie) {
				ie.printStackTrace();
			}

		}

	}


