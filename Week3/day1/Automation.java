package Week3.day1;

public class Automation extends MultipleLanguage {

	
	@Override
	public void Selenium() {
		System.out.println("Selenium");
		
	}


	public void Java() {
		System.out.println("Java");
		
	}
public static void main(String[] args) {
	Automation lang = new Automation();
	lang.Java();
	lang.Selenium();
	lang.python();
	lang.ruby();
}
}
