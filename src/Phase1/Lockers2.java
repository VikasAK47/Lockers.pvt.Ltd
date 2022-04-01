package Phase1;

public class Lockers2 {
	private String addFile;
	private String deleteFile;
	private String searchFile;
	private String goBack;
	public Lockers2(String addFile, String deleteFile, String searchFile, String goBack) {
		
		this.addFile = addFile;
		this.deleteFile = deleteFile;
		this.searchFile = searchFile;
		this.goBack = goBack;
	}
	void showLockers2Menu() {
		System.out.println(addFile);
		System.out.println(deleteFile);
		System.out.println(searchFile);
		System.out.println(goBack);
	}

}
