
public class exceptionhandling {

	public static void main(String[] args) {
		
		try{
			System.out.println("This is Execption Handling program");
			int i = 1/0;
			System.out.println("Test Completed");
		}
		catch (Exception exp) {
			System.out.println("This is inside catch block");
			System.out.println("The message is "+ exp.getMessage());
			System.out.println("The cause is "+ exp.getCause());
			exp.printStackTrace();
			
		}
		finally {
			System.out.println("This is finally block");
			
		}
	
	}
     
     
	}


