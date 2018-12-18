package dec4;

public class DemoWorkingwithChrome {

	public static void main(String[] args) {
		
		WorkingWithChrome wc= new WorkingWithChrome();
		
		wc.invokeBrowser();
		
		 String titleofthepage = wc.gettitleofthepage();
		 
		 System.out.println("Title Of The Page : "+titleofthepage);
		 
		 wc.navigatemethods();
		 
		 wc.closeAllBrowser();
	
		
	}

}
