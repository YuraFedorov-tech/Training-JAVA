import java.io.File;

public class DeletOneFiles{

	public static void main(String[] args)  {
		 File file = new File("d:/111.txt");	
		 if(file.delete())
			 System.out.print("delete sucsess");
		 else
			 System.out.print("delete fall");
	}

}
