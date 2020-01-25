package AbstractExample;

abstract class auto1 {
	String modelNo;

	abstract String show(String modelNo);
}

interface run {
	int maxrun = 100;
}

class Air extends auto1 implements run {
	String show(String modelNo) {
		return modelNo;

	}
}

	interface Fly {
		int maxrun = 20;
	}

	class Train extends auto1 implements Fly {
		String show(String modelNo) {
			return modelNo;
		}
	}

	interface Swim {
		int maxrun = 30;
	}

	class Ship extends auto1 implements Swim {
		String show(String modelNo) {
			return modelNo;
		}
	}


	public class Automobile {
		public static void main(String args[]) {
			Air a = new Air();
			Train b = new Train();
			Ship s = new Ship();
			System.out.println(a.show("a123"));
			System.out.println(Fly.maxrun);
			System.out.println(b.show("t234"));
			System.out.println(run.maxrun);
			System.out.println(s.show("s567"));
			System.out.println(Swim.maxrun);

		}
	}
