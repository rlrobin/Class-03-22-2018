import java.util.Scanner;
public class Taphy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("Key in 5 different numbers");
		int [] numbe=new int [5];
		for(int i=0; i<numbe.length; i++)
		{
			
			numbe[i]=scan.nextInt();
		}
		System.out.println(numbe[2]);
	}
	

}
