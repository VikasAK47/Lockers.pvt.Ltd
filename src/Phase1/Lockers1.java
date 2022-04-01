package Phase1;

public class Lockers1 {
	private String listFiles;
	private String otherFileHandlingOptions;
	private String closeApplication;
	
	public Lockers1(String listFiles,String otherFileHandlingOptions,String closeApplication) {
		this.listFiles = listFiles;
		this.otherFileHandlingOptions = otherFileHandlingOptions;
		this.closeApplication = closeApplication;
	
	}
	
	void display() {
		
		
		System.out.println(listFiles);
		System.out.println(otherFileHandlingOptions);
		System.out.println(closeApplication);
		System.out.println(" ");
		System.out.println("Select an Option");
	}


}
