package world;
	import java.io.IOException;

	public class ThreadC extends Thread {
		SearchingInFile sf2;
		String text, directory;

		public ThreadC(SearchingInFile sf1, String text, String directory) {
			this.setName("Thread C");
			this.setPriority(10);
			System.out.println("ThreadC started");
			sf2 = sf1;
			this.text = text;
			this.directory = directory;
		}

		public void run() {
			System.out.println("ThreadC running");
			try {
				String s = sf2.directory(text, directory);
				System.out.println(s);
				System.out.println("ThreadC ended");
			} catch (IOException ie) {
				ie.printStackTrace();
			}

		}

	}



