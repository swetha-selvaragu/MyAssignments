package Week3.day1;

	public class desktop extends computer {
		 public void desktopSize() {
			System.out.println("1008px and larger");
		}
		 public static void main(String[] args) {
			desktop pc = new desktop();
			pc.computerModel();
			pc.desktopSize();
		}
		}

