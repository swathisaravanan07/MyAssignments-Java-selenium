package week1.day2;

public class Browser {

	public static void main(String[] args) {
		Browser b=new Browser();
		b.launchBrowser("Google");
		b.loadUrl();
		}
	
	public String launchBrowser(String browserName) {
		System.out.println("Browser launched successfully");
		return browserName;
	}
	public void loadUrl() {
		System.out.println("Application url loaded successfully");
	}

}

class EdgeBrowser{
	public static void main(String[] args) {
	Browser br=new Browser();
	br.launchBrowser("google");
	br.loadUrl();
	}
}

