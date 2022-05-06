import java.util.Scanner;

class Clerk
{
	Clerk()
	{
		Scanner sc = new Scanner(System.in);


		System.out.print("Enter ID: ");
		int id = sc.nextInt();

		System.out.print("Enter name: ");
		String name = sc.next();

		System.out.print("Enter age: ");
		int age = sc.nextInt();

		int salary = 15000;
		String designation = "Clerk";

		System.out.println("ID: "+id);
		System.out.println("Name: "+name);
		System.out.println("Age: "+age);
		System.out.println("Salary: "+salary);
		System.out.println("Designation: "+designation);
	}
}




class Dev
{
	Dev()
	{
		Scanner sc = new Scanner(System.in);


		System.out.print("Enter ID: ");
		int id = sc.nextInt();

		System.out.print("Enter name: ");
		String name = sc.next();

		System.out.print("Enter age: ");
		int age = sc.nextInt();

		int salary = 35000;
		String designation = "Developer";

		System.out.println("ID: "+id);
		System.out.println("Name: "+name);
		System.out.println("Age: "+age);
		System.out.println("Salary: "+salary);
		System.out.println("Designation: "+designation);
	}
}



class Tester
{
	Tester()
	{
		Scanner sc = new Scanner(System.in);


		System.out.print("Enter ID: ");
		int id = sc.nextInt();

		System.out.print("Enter name: ");
		String name = sc.next();

		System.out.print("Enter age: ");
		int age = sc.nextInt();

		int salary = 25000;
		String designation = "Tester";

		System.out.println("ID: "+id);
		System.out.println("Name: "+name);
		System.out.println("Age: "+age);
		System.out.println("Salary: "+salary);
		System.out.println("Designation: "+designation);
	}
}




class Manager
{
	Manager()
	{
		Scanner sc = new Scanner(System.in);


		System.out.print("Enter ID: ");
		int id = sc.nextInt();

		System.out.print("Enter name: ");
		String name = sc.next();

		System.out.print("Enter age: ");
		int age = sc.nextInt();

		int salary = 40000;
		String designation = "Manager";

		System.out.println("ID: "+id);
		System.out.println("Name: "+name);
		System.out.println("Age: "+age);
		System.out.println("Salary: "+salary);
		System.out.println("Designation: "+designation);
	}
}
class Demo5
{
	public static void main(String args[])
	{
	
		int ch = 0;
		do{
			Scanner sca = new Scanner(System.in);
			System.out.println("MENU\n 1.Clerk\n 2.Developer\n 3.Tester\n 4.Manager\n 5.Exit");
			ch = sca.nextInt();
			switch(ch)
			{
				case 1:
					Clerk c = new Clerk();
					c = null;
					System.gc();
					break;

				case 2:
					Dev d = new Dev();
					d = null;
					System.gc();
					break;

				case 3:
					Tester t = new Tester();
					t = null;
					System.gc();
					break;

				case 4:
					Manager m = new Manager();
					m = null;
					System.gc();
					break;
			}

		}while(ch!=5);
		System.out.println("Thank you");
	}
}