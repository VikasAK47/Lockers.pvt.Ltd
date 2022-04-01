package Phase1;

public class WelcomeScreen 
{
	public void showWelcome() {
		System.out.println("**************************************************");
		
		System.out.println("*****************Lockers.Pvt.Ltd******************");
		
		System.out.println("**************************************************");
		
		System.out.println("                Developer Details                ");
		System.out.println(" ");
		
		Lockers obj=new Lockers("vikas","Trainee");
		
		System.out.println(obj);
		
		System.out.println(" ");
		System.out.println("**************************************************");
		
		System.out.println("Main menu");
		System.out.println(" ");
	}
}
