
public class exceptionhandlingdemo {

	public static void main(String[] args) {
		try 
		{
			demo();
		} 
		catch (Exception e) 
		{
			// TODO: handle exception
			e.printStackTrace();
		}
		
	}		

	public static void demo() throws Exception
	{
		System.out.println("This is demo program");
		int i = 1/0;
		System.out.println("Completed program");
	}
}
