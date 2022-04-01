package Phase1;

public class Lockers
{
	
	private String developerName;
	private String developerPosition;

	
	public Lockers( String developerName, String developerPosition) {
		super();
		
		this.developerName = developerName;
		this.developerPosition = developerPosition;
//		this.listFiles = listFiles;
//		this.otherFileHandlingOptions = otherFileHandlingOptions;
//		this.closeApplication = closeApplication;
	}
	
	
	@Override
	public String toString() {
		return " [ DeveloperName=" + developerName + ", DeveloperPosition="
				+ developerPosition +"]";
	}
	
	
}
