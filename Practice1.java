/*
import java.util.Scanner;
class Practice1
{
	//public//private// default//
	public static void main(String[]args)
	{
		
    Pdogg();
	}
	
	public static void Pdogg()
	{
		
	Scanner myScan=new Scanner(System.in);
	 System.out.println("Enter the value of a");  
	 long a=myScan.nextLong();
		System.out.println("Enter the value of b");
		long b=myScan.nextLong();
		
	     long c=a+b;

	System.out.println("Result_____"+c);
	}
}
	
*/
  /*
	Scanner myScan=new Scanner(System.in);
		String Name="";
		System.out.println("Enter the name");
		Name=myScan.nextLine();
		System.out.println("User name is"+Name);
		*/
/*Program for checking whether the given number is positive or negative*/
/*
		import java.util.Scanner;
		class Practice1	
		{
			public static void main(String[] args)
			{
				Scanner ooLo=new Scanner(System.in);
				System.out.println("Enter the number");
				int number=ooLo.nextInt();
				
				if(number>0)
				{
					System.out.println("Number is positive");
					
				}
				else if(number<0)
				{
					System.out.println("Number is negative");
					
				}
				else
				{
					System.out.println("Number is neutral");
				}
			}
		}
	*/	
		/*Program to check correct username and password*/
		/*import java.util.Scanner;
		class Practice1
		{
		    String a="Vignesh";
		    String b="Loft";
			public static void main(String[] args)
			{
				
				//Accessing non static member outside method using object//
				
				Practice1 c= new Practice1();
				String a=c.a;
				String b=c.b;
				System.out.println("Hint:"+a);
				System.out.println("Hint"+b);
				Scanner myObj=new Scanner(System.in);
				
				System.out.println("Welcome to Gmail");
				
				
				while(true)
				{
				
				System.out.println("Enter the username");
				String userinput=myObj.nextLine();
				
				
				System.out.println("Enter the Password");
				String userpassword=myObj.nextLine();
				
				if(userinput.equals(a) && userpassword.equals(b))
				{
				 System.out.println("Welcome!!!!!!!!!!!!!!!!!!!!!!!!!!!");
				 break;
				
				}
				
				
				else
				{
				System.out.println("Invalid");
				}
				
				}
					
			} 
			
		}
		*/
		
		/*
		class Practice1
		{
			public static void main(String[] args)
			{
				int a=5;
				int b=3;
				int temp=a;
				a=b;
				b=temp;
				System.out.println("A="+a);
				System.out.println("B="+b);
			}
			
		}*/
		
		/*class Practice1
		{
			public static void main(String[]args)
			{
				int a=5;
				int b=9;
				a=a+b;
				b=a-b;
				a=a-b;
				System.out.println("A-"+a);
				System.out.println("B-"+b);
				
				}
		}

		*/
		/*
class Practice1
{
	public static void main(String[] args)
	{
		int rows=5;
		
		for(int i=0;i<rows;i++)
		{
		for(int j=0;j<rows;j++)
		{
			System.out.println("* ");
		}
			System.out.println();
		}
	}
}		
		
	*/	
	/*Write a program to get the difference
	between a given number and 13, 
	if the difference value is greater than 13 return double
	the absolute difference*/
	/*
	import java.util.Scanner;
	class Practice1
	{
		public static void main(String[] args)
		{
			Scanner s1 =new Scanner(System.in);
			
			System.out.println("Enter the number");
			int a=s1.nextInt();
			int c=a-13;
			int d=c*2;
			if(c>13)
			{
				System.out.println(d);
				
			}
			else
			{
				System.out.println(c);
			}
		}
		
	}
	*/
	// Arguments and return types/
	
	
	
	/*without argument, without retyrn type

class Practice1
{
	void m1()
	{
		int a=10;
		int b=20;
		int c=a+b;
		System.out.println(c);
	}
	
	public static void main(String[] args)
	{
		
		Practice1 f=new Practice1();
		f.m1();
		
	}
}
*/

//with argument, with retun type
/*class Practice1
{
	int m1(int a,int b)
	{
		int c=a+b;
		return c;
	}
	
	public static void main(String[] args)
	{
		
		Practice1 f=new Practice1();
		//int x=f.m1(10,5);
		//System.out.println(x);
		
		System.out.println(f.m1(5,5));
	}
}
*/
//without argument, with return type//
/*
class Practice1
{
	int m1()
	{
		return 100;
	}
	
	public static void main(String[] args)
	{
		
		Practice1 f=new Practice1();
		int x=f.m1();
		
		System.out.println(x);
		
	}
}
*/
/*
class Practice1
{
	public static void main(String[] args)
	{
		if(args.length>2)
		{
			System.out.println("First argument"+args[0]);
			System.out.println("Second argument"+args[1]);
			System.out.println("Third argument"+args[2]);
			
		}
		
		
		else
		{
			System.out.println("no arguments");
		}
	}
}
*/
//pattern programs//
/*class Practice1
 {
   public static void main(String[] args)
   {
	   int rows=5;
	   
	   for(int i=0;i<rows;i++)
	   { 
   System.out.print("*");
	   }
	   System.out.println();
	   for(int i=0;i<rows;i++)
	   { 
   System.out.print("*");
	   }
	   System.out.println();
	    for(int i=0;i<rows;i++)
	   { 
   System.out.print("*");
	   }
	   System.out.println();
	   
	    for(int i=0;i<rows;i++)
	   { 
   System.out.print("*");
	   }
	   
	   System.out.println();
	    for(int i=0;i<rows;i++)
	   { 
   System.out.print("*");
	   }
   }
 }
 */
 /*
 class Practice1
{
	public static void main(String[] args)
	{
		int rows=5;
		
		for(int i=0;i<rows;i++)
		{
		for(int j=0;j<rows;j++)
		{
			System.out.print("* ");
		}
			System.out.println();
		}
	}
}
*/
/* 

* * * * *
* * * *
* * *
* *
* 
class Practice1
{
	public static void main(String[] args)
	{
		int rows=5;
		int columns=5;
		int temp=0;
		
		for(int i=0;i<rows;i++)
		{
			if(temp!=0)
			{
				columns=columns-1;
			}
			for(int j=0;j<columns;j++)
		{
			System.out.print("*");
		
		}
		temp++;
		System.out.println();
		}
	}
}
*/ 
/*
* 
* * 
* * *
* * * *
* * * * *
*/
/*
class Practice1
{
	public static void main(String[] args)
	{
		int rows=5;
		int columns=1;
		int temp=0;
		for(int i=0;i<rows;i++)
		{
			if(temp!=0)
			{
				columns=columns+1;
			}
			for(int j=0;j<columns;j++)
			{
				System.out.print("*");
			}
			temp++;
			System.out.println();
		}
	}
}
*/
/*
        * 
      * * 
    * * *
  * * * *
* * * * *
*/
 
 /*
 class Practice1
 {
	 public static void main(String [] args)
	 {
		 int rows=8;
		 int columns=8;
		 int temp=0;
		 
		 for(int i=0;i<rows;i++)
		 {
			 if(temp!=0)
			 {
				 columns=columns-1;
			 }
			 for(int j=0;j<columns;j++)
			 {
				 System.out.print(" ");
				
				 
			 }
			 
			  for(int k=0;k<=i;k++)
				 {
					 System.out.print("*");
				 }
				 
			 temp++;
			 
			 
		 System.out.println();
	 }
		 }
		 
 }
 */
 /*Passing the Arguments, Returning the value,
 creating an object to access non static variable in both the methods */
 
 /*
 class Practice1
 { 
 int a=30;
 int b=50;
 
	 public static void main(String [] args)
	 {

		 Practice1 s1=new Practice1();
		 int h= lom(1,2);
		 int f=s1.b-s1.a;
		 System.out.println("========"+f);
		 System.out.println("Returned value"+h);
		
	 }
	 public static int lom(int x,int y)
	 {
		
		 Practice1 s1=new Practice1();
		 int c=s1.a +s1.b;
		 System.out.println("c="+c);
		 int d=x+y;
		 int h=90+y;
		 System.out.println("Operation on the passed argument="+d);
		 return h;
	 }
 }
 */
 /*Write a program to find a value which is nearest to 100
 from to different given values*/
 /* Parcially correct*/
 
 /*
 import java.util.Scanner;
 class Practice1
 {
	 public static void main(String[] args)
	 {
		 System.out.println("HI There !!!!!!!");
		
		Scanner s1=new Scanner(System.in);
		
		while(true)
		{
		System.out.print("Enter the first number=");
		int first_no=s1.nextInt();
		
		System.out.print("Enter the second number=");
		int second_no=s1.nextInt();
		
				
		if(first_no>100 && second_no<100 || first_no<100 && second_no>100)
		{
			
			System.out.println("Enter the other values");
			
		}	
		
		else if(first_no>100 && second_no>100)
		{
			if(first_no>second_no)
			{
				System.out.print("Second number is nearer ");
			break;
			}

			else if(first_no<second_no)
			{
				System.out.print("First number is nearer ");
			break;
			}
			else
			{
				System.out.println("Both the numbers are same");
				
			}
			
			
		}
		else if(first_no<100 && second_no<100)
		{
		  
				if(first_no<second_no)
				{
					System.out.print("Second number is nearer");
					break;
				}
				
				
				else if(first_no>second_no)
				{
					System.out.print("First number is nearer");
					break;		
				}	
				else
				{
					System.out.println("Both the numbers are equal");
					
				}
		}		
		}				
	 }
 }
 */
 /*
 
 import java.util.Scanner;
class Bol
{
    public static void main(String[] args)
    {
        Scanner n=new Scanner(System.in);
		System.out.println("Enter the number");
        int a=n.nextInt();
      int x=a%2;
        if(x!=0)
        {
            System.out.println("Weird");
        }
        else if(x==0 && 2<=a){
			if(a<=6)
				
        {
            System.out.println("Not Weird");      
        }
		}
        else if(x==0 && 6<=a){
			if(a<=20)
        {
            System.out.println("Weird");
        }
		}
        else if(x==0 && a>20);
        {
        System.out.println("Not Weird");
        }
    }
}

 */
 
 /*	
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class Practice1 {
    public static void main(String[] args) {
        // JDBC connection parameters
        String url = "jdbc:mysql://localhost:3306/loft";
        String username = "root";
        String password = "";

        try {
            // Load the JDBC driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Establish the connection
            Connection connection = DriverManager.getConnection(url, username, password);

            // SQL query to insert data into the 'college_information' table
            String insertQuery = "INSERT INTO college_information (usn, mobile, mail) VALUES (?, ?, ?)";

            // Using Scanner to get input from the console
            try (Scanner scanner = new Scanner(System.in)) {
                System.out.print("Enter USN: ");
                String usn = scanner.nextLine();

                System.out.print("Enter Mobile: ");
                int mobile = scanner.nextInt();
                scanner.nextLine(); // Consume the newline character

                System.out.print("Enter Email: ");
                String mail = scanner.nextLine();

                // Create a PreparedStatement for the query
                try (PreparedStatement preparedStatement = connection.prepareStatement(insertQuery)) {
                    // Set values for parameters
                    preparedStatement.setString(1, usn);
                    preparedStatement.setInt(2, mobile);
                    preparedStatement.setString(3, mail);

                    // Execute the query
                    preparedStatement.executeUpdate();

                    System.out.println("Data inserted successfully");
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }

            // Close the connection
            connection.close();

        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
    }
}
*/
 
 /*
 import java.io.IOException;

public class Practice1 {

    public static void main(String[] args) {
        try {
            // For Windows, try opening the Camera app directly
            if (System.getProperty("os.name").startsWith("Windows")) {
                Runtime.getRuntime().exec("cmd /c start microsoft.windows.camera:");
            } else {
                // For other systems, open a web browser which might have camera access
                // You can replace this with the appropriate command for your system if necessary
                // For example, on macOS, you might use: Runtime.getRuntime().exec("open -a Photo Booth");
                // And on Linux, you might use: Runtime.getRuntime().exec("xdg-open /dev/video0");
                Runtime.getRuntime().exec("xdg-open http://localhost");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
*/
/*
import javax.swing.*;

public class Practice1 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Simple GUI");
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null); // Center the frame on the screen

        JButton minimizeButton = new JButton("-");
        minimizeButton.setBounds(340, 10, 40, 40);
        minimizeButton.addActionListener(e -> {
            frame.setState(JFrame.ICONIFIED); // Minimize the frame
        });

        JButton cancelButton = new JButton("X");
        cancelButton.setBounds(370, 10, 40, 40);
        cancelButton.addActionListener(e -> {
            frame.dispose(); // Close the frame
        });

        frame.setLayout(null);
        frame.add(minimizeButton);
        frame.add(cancelButton);
        frame.setVisible(true);
    }
}
*/
/*
 import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SimpleCalculator {

    private JFrame frame;
    private JPanel panel;
    private JTextField textField;
    private JButton[] numberButtons;
    private JButton[] functionButtons;
    private JButton addButton, subButton, mulButton, divButton, eqlButton, clrButton;
    private Font font = new Font("Arial", Font.PLAIN, 20);
    private double num1 = 0, num2 = 0, result = 0;
    private char operator;

    public SimpleCalculator() {
        frame = new JFrame("Simple Calculator");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 550);
        frame.setLayout(null);

        textField = new JTextField();
        textField.setBounds(50, 25, 300, 50);
        textField.setFont(font);
        textField.setEditable(false);

        panel = new JPanel();
        panel.setBounds(50, 100, 300, 300);
        panel.setLayout(new GridLayout(4, 4, 10, 10));

        numberButtons = new JButton[10];
        for (int i = 0; i < 10; i++) {
            numberButtons[i] = new JButton(String.valueOf(i));
            numberButtons[i].setFont(font);
            numberButtons[i].addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    JButton button = (JButton) e.getSource();
                    textField.setText(textField.getText() + button.getText());
                }
            });
        }

        functionButtons = new JButton[6];
        addButton = new JButton("+");
        subButton = new JButton("-");
        mulButton = new JButton("*");
        divButton = new JButton("/");
        eqlButton = new JButton("=");
        clrButton = new JButton("C");

        functionButtons[0] = addButton;
        functionButtons[1] = subButton;
        functionButtons[2] = mulButton;
        functionButtons[3] = divButton;
        functionButtons[4] = eqlButton;
        functionButtons[5] = clrButton;

        for (int i = 0; i < 6; i++) {
            functionButtons[i].setFont(font);
            panel.add(functionButtons[i]);
        }

        addButton.addActionListener(e -> {
            num1 = Double.parseDouble(textField.getText());
            operator = '+';
            textField.setText("");
        });

        subButton.addActionListener(e -> {
            num1 = Double.parseDouble(textField.getText());
            operator = '-';
            textField.setText("");
        });

        mulButton.addActionListener(e -> {
            num1 = Double.parseDouble(textField.getText());
            operator = '*';
            textField.setText("");
        });

        divButton.addActionListener(e -> {
            num1 = Double.parseDouble(textField.getText());
            operator = '/';
            textField.setText("");
        });

        eqlButton.addActionListener(e -> {
            num2 = Double.parseDouble(textField.getText());
            switch (operator) {
                case '+':
                    result = num1 + num2;
                    break;
                case '-':
                    result = num1 - num2;
                    break;
                case '*':
                    result = num1 * num2;
                    break;
                case '/':
                    if (num2 != 0)
                        result = num1 / num2;
                    else
                        textField.setText("Error");
                    break;
            }
            textField.setText(String.valueOf(result));
        });

        clrButton.addActionListener(e -> {
            textField.setText("");
            num1 = num2 = result = 0;
        });

        for (int i = 1; i <= 9; i++) {
            panel.add(numberButtons[i]);
        }
        panel.add(numberButtons[0]);

        frame.add(panel);
        frame.add(textField);
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        new SimpleCalculator();
    }
}
*/
/*
1
12
123
1234
12345
*/
/*
class Practice1
{
	public static void main(String []args)
	
	{
		int a=1;
		int b=1;
		for(int i=0;i<5;i++)
		{
			for(int j=1;j<=a;j++)
			{
			System.out.print(j);
			}
			System.out.println("  ");
			a=a+1;
		}
		
	}
	
}
 */
 /*
 
        *
	   * *	
	  * * *
	 * * * *
    * * * * *
     
 */
 /*
 class Practice1
 {
	 public static void main(String[]args)
	 {
		 int a=5
		 int b=5;
		 int p=1;
		 int k=0;
		 for(int i=0;i<a;i++)
		 {
			 for(int j=1;j<b;j++)
				 
			      {
				 
				 				 
					 System.out.print(" ");
					
				 }
				 b=b-1;
				 for(k=0;k<p;k++)
					 
					 {
						  System.out.print("*");
						  System.out.print(" ");
					 }
			      p=p+1;
			 System.out.println(" ");
		 }
	 }
 }
 
 
 */
 /*
 
 *         *
 **       **
 ***     ***
 ****   ****
 ***********
 ****   ****
 ***     ***
 **       **
 *         *
 
 */
 
 /*
 class Practice1
 {
	 public static void main(String []args)
	 {
		 
		 
		 
		 
		 
		 
		 
	 }
 }
 
 */
 
 
 
 
 
 /*import java.util.*;
 class Practice1
 {
	 public static void main(String[] args)
	 {
		 Scanner scnn=new Scanner(System.in);
		 while(true)
		 {
		 System.out.print("Kindly enter the number"+"  ");
		
		 int x=scnn.nextInt();
		 scnn.nextLine();
		 
		 System.out.print(x);
		 
		 System.out.println(" ");
		 if(prm(x))
		 {
			 System.out.println("given number"+" "+x+" " +"is a prime ");
		 }
		 else 
		 {
			 System.out.println("given number"+ " " +x+" "+"is a not a prime");
		 }
		 System.out.println("Want to Exit?");
	    String exit= scnn.nextLine();
	   if(exit.equals("yes"))
	   {
		   break;
	   }
	 }
	   
	 }
	 
	 
	 public static boolean prm(int number)
	 {   
	     if(number<=1)
		 {
			 return false;
		 }
		  for (int i = 2; i <= Math.sqrt(number); i++) 
		  {
            if (number % i == 0) 
			{
				return false;
			}
			
		   }
		  return true;
	 }
	 
 }
  
 */
 
 
 //carry c and b value
 /*class Practice1
 {
	 public static void main(String []args)
	 {   
		int a=0;
		int b=1;
		
		 for(int i=1;i<100;i++)
		 {   
	         
			 int c=b+a;
			 System.out.println(c);
			 
			 a=b;
			 b=c;
		 }
		 
	 }
 }
 */
 /*
 class Practice1
 {
	 public static void main(String []args)
	 {   
		int a=0;
		int b=1;
		
		 for(int i=1;i<100;i++)
		 {   
	         
			 int c=b+a;
			 System.out.println(c);
			 
			 a=b;
			 b=c;
		 }
 }
 
 }
 */
 
  
 /*
 class Practice1
 {
	 public static void main(String []args)
	 {     int a=100;
	     
	     for(int i=1; i<100; i++)
		 {
			 System.out.println(a);
			 a=a-1;
		 }
	 }
 }
 */
 /*   
 
import java.util.*;
class Practice1
 {
	 public static void main(String []args)
	 { 
        int age =21;
		 if(age>=18)
		 {
			 System.out.print("Ur eligible to vote");
			 
		 }
		
		else
		{
			System.out.print("ur not eligible");
		}
	 
	 
	 
	 
	 }
 
 }
 */
 /*
  class Practice1
  {
	  public static void main(String []args)
	  { 
	       int count=0;
		  String a="AAEFFERRRERRREUYTREEEEHHDFRYRHT";
		  for(int i=0;i<a.length();i++)
		  {
			  if(a.charAt(i)=='E')
			  {
				  System.out.println(i);
			  }
		  }
		  
		  
	  }
  }
 */
 
 /*
 class Practice1
 {
	public static void main(String[] args)
	{
		System.out.print(m1());
	}
	
  public static String m1()
 
	 {
		String a = "MADAM";
        		
	return a;
	
 }
	
			
 }
 */
 /*
 import java.util.*;
 class Practice1
 {
	 public static void main(String args[])
	 {
		  int realmarks=0;
		  int count=0;
		  int sum=0;
		  
		  
		 Scanner scn=new Scanner(System.in); 
		 while(true)
		 {	 
		 System.out.println("Enter the marks");
		 
		 int tempmarks=scn.nextInt();
		 if(tempmarks<=100)
		 {
			realmarks=tempmarks;
			   sum+=realmarks;
			
			count=count+1; 
		 }
		 else if(tempmarks>100)
		 {
			System.out.println("Not Valid"); 
		 } 
		 
		 if(count==5)
		 {
			 break;
		 }	 
		 
		 }
		 System.out.println("The average marks of five subs is"+   "=" +sum/5 );
	 }
 }
 */
/*
import java.util.*;
class Practice1
{     
    
     
	public static void main(String args[])
	{
		int count=0;
		int x=0;
	    int y=1;
	    int z=0;
		Practice1 p=new Practice1();
		
		p.m1(x,y,count);
	}
	
	public void m1(int x,int y,int count)
	{
		
		count=count+1;
		int z=x+y;
		System.out.println(z);
		x=y;
		y=z;
		 if(count<15)
		 {
		     m1(x,y,count);
		 }
		 else{
			 
			 System.out.print("kk");
		 }
		
	}
}
 
 */
 /*
 class Practice1
 {

      public static void main(String args[])
	  {
		  import java.util.*;
class Practice1
{     
    
     
	public static void main(String args[])
	{
		int count=0;
		int x=0;
	    int y=1;
	    int z=0;
		Practice1 p=new Practice1();
		
		p.m1(x,y,count);
	}
	
	public void m1(int x,int y,int count)
	{
		
		count=count++;
		int z=x+y;
		System.out.println(z);
		x=y;
		y=z;
		 if(count<15)
		 {
		     m1(x,y,count);
		 }
		 else{
			 System.out.print("kk");
		 }
		
	}
}
 
*/	
/*	  
 class Practice1
 {
	 public static void main(String args[])
	 {    
	 
		 String a ="ABC";
		 
		 
		 for(int i=0;i<a.length();i++)
		 {         
			 System.out.print(a.charAt(i)+" ");	
			
		 }
		  System.out.print("\n");
	     for(int j=0;j<a.length();j++)
		 {
			 
			for(int y=0;y<a.length();y++)
				
			{
				if(j!=y)
				{
				System.out.print(a.charAt(j)+""+a.charAt(y)+" ");
				}
			}
		 }
		 
		  System.out.print("\n");
	     for(int l=0;l<a.length();l++)
		 {
			 
		   for(int m=0;m<a.length();m++)
				
			{
				for(int n=0;n<a.length();n++)
			   {
				      if(l!=m && m!=n &&  n!=l)
				        {
				          System.out.print(a.charAt(l)+""+a.charAt(m)+""+a.charAt(n)+" ");
				        }
			   }
			   
		    }
			
		 }
		 	 
	 }
	 
 }
 */
 /*
 import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Practice1
 {
    public static void main(String[] args) 
	{
        String data = "This is some text data to be written to a file.";
        
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("output.txt")))
		{
            writer.write(data);  
            System.out.println("Data written to file.");
        } catch (IOException e) 
		{
            e.printStackTrace();
        }
    }
}
*/
/*
class Practice1
{
	public static void main(String args[])
	{
		int arr1[]={1,2,3,4,5,6,7};
		int arr2[]={8,9,10,11,12,13,14};
		
		int arr3[]=new int[arr1.length+arr2.length];
		for(int i=0;i<arr1.length;i++)
		{
			arr3[i]=arr1[i];
			
		}
		for(int i=0;i<arr2.length;i++)
		{
			arr3[i+arr1.length]=arr2[i];
			
		}
		for(int i=0;i<arr3.length;i++)
		{
			System.out.println(arr3[i]);
		}	
}
}
*/
/*
import java.util.*;
class Practice1
{
  public static void main(String args[])
  {
	  String String1="anagrams";
	  String String2="msaragna";
	   System.out.print(cloud(String1,String2));
	  
  }  
  
  
    public static boolean cloud(String str1,String str2)
	{
		
		ArrayList arr =new ArrayList();
		
		  
		
		
		
		return true;
	}
	
	
	
}
*/
/*
// duplicates
    import java.util.*;
	class Practice1
	{
		public static void main(String args[])
		{
			int arr[]={1,2,4,5,8,9,12,12,34,44,44,66,8,9,100,100,100,100,100,1};
			//linear search
			HashSet hs=new HashSet();
			for(int i=0;i<arr.length;i++)
			{
			hs.add(arr[i]);
			
			
			}
			System.out.println(hs);
		
		}
	}	

*/
/*
// most frequent
    import java.util.*;
	class Practice1
	{
		static int z=0;
		
		public static void main(String args[])
		{
		int count =0;
		
			
			ArrayList r=new ArrayList();
			while(count<10)
			{
				count=count+1;
				
				r.add(m1());
				
			}
			System.out.print(r);
			
		
		}
	   public static int m1()
	   {		
			int freq=0;
			
			int arr[]={1,2,4,5,8,9,12,12,34,44,44,66,8,9,100,100,100,100,100,1};
			
			
			for(int i=z;i<arr.length;i++)
			{
			     for(int j=0;j<arr.length;j++)
				 {
					 if(arr[i]==arr[j])
						 freq=freq+1;					 
					 
					 			 					 
				 }	
                    z=z+1;				 
				 return freq;
	   
	}
	   }
 }	   
*/
/*
//most frequent
import java.util.*;

class Practice1 {
    public static void main(String[] args) 
	{
        
              
        System.out.println(m1()); 
    }

    public static int m1() {
        int freq = 0;
        int arr[] = {1, 2, 4, 5, 8, 9, 12, 12, 34, 44, 44, 66, 8, 9, 100, 100, 100, 100, 100, 1};
        
        
        HashMap<Integer, Integer> frequencyMap = new HashMap<>();
        
        for (int num : arr) 
		{
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }
        int mostFrequent = 0;
        int maxCount = 0;
        
        for (int num : frequencyMap.keySet()) {
            if (frequencyMap.get(num) > maxCount) {
                maxCount = frequencyMap.get(num);
                mostFrequent = num;
            }
        }
        
        return mostFrequent;  
    }
}

*/
/*
class Practice1
{
	public static void main(String args[])
	{
		int a='$';
		System.out.print(a);
	}
}
*/
/*
//Negative_positive
import java.util.*;
class Practice1
{
	public static void main(String args[])
	{      
	
	    Scanner scan =new Scanner(System.in);
		System.out.print("Enter the number bruh");
		int a=scan.nextInt();
		
		if(a>0)
		{
			System.out.print(a*-1);
			
		}
		else if(a<0)
		{
			System.out.print(-1*a);
			
		}
		
	}
}
*/
/*
import java.util.Arrays;
class Practice1
{
	public static void main(String args[])
	{   
	
	    
		int arr[]={4,67,85,32,45,23,90,80,70,56,22};
		Arrays.sort(arr);
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
			
	  

		}
		System.out.println(" ");
	  
		System.out.println(arr[arr.length/2]);
	}
	
}
*/
/*
import java.util.*;
class Practice1
{
	public static void main(String args[])
	{
	      String s="AeEsWWGwFrWJL";
		  
		  for(int i=0;i<s.length();i++)
		  {
			 if(s.charAt(i)=='W')
			 {				 
			  System.out.println(i);
			 }
		  }
		
	}
}
*/
/*
//Anagrams
import java.util.Arrays;

public class AnagramChecker {

    static boolean isAnagram(String a, String b)
	{
        
        String c = a.toLowerCase();
        String d = b.toLowerCase();

    
        if (c.length() != d.length()) 
		{
            return false; 
        }

        
        char[] p = c.toCharArray();
        char[] q = d.toCharArray();

       
        Arrays.sort(p);
        Arrays.sort(q);

        
        return Arrays.equals(p, q); 
    }

    public static void main(String[] args) {
        String str1 = "Listen";
        String str2 = "Silent";

        if (isAnagram(str1, str2)) {
            System.out.println(str1 + " and " + str2 + " are anagrams.");
        } else {
            System.out.println(str1 + " and " + str2 + " are not anagrams.");
        }
    }
}
*/
/*
//Hashmap
import java.util.HashMap;

class HashMapExample {
    public static void main(String[] args) {
        // Create a HashMap to store roll numbers and student names
        HashMap<Integer, String> students = new HashMap<>();

        // Add key-value pairs to the HashMap
        students.put(101, "Alice");
        students.put(102, "Bob");
        students.put(103, "Charlie");
        students.put(104, "David");

        // Display the HashMap
        System.out.println("Student HashMap: " + students);

        // Access a value by key
        String studentName = students.get(102);
        System.out.println("Student with roll number 102: " + studentName);

        // Check if a key exists
        if (students.containsKey(103)) {
            System.out.println("Roll number 103 exists in the HashMap.");
        }

        // Remove a key-value pair
        students.remove(104);
        System.out.println("After removing roll number 104: " + students);

        // Iterate through the HashMap
        System.out.println("Iterating over the HashMap:");
        for (Integer rollNo : students.keySet()) {
            System.out.println("Roll No: " + rollNo + ", Name: " + students.get(rollNo));
        }

        // Get the size of the HashMap
        System.out.println("Total students: " + students.size());
    }
}
*/
/*
//second largest using tree
import java.util.*;
class Practice1
{
     public static void main(String args[])
	 {
		 int arr[]={1,3,4,5,3,2,7,5,3,66,44,87,44,33,99,99,66,44,55,2,1,6};
		
		 TreeSet hs=new TreeSet();
		 for(int i=0;i<arr.length;i++)
		 {
			 hs.add(arr[i]);
		 }
		ArrayList al=new ArrayList(hs);
		 System.out.print(al.get(al.size()-(2)));
		 
	 }	 
}
*/

/*
import java.util.*;
import java.math.*;
class Practice1
{
	public static void main(String args[])
	{
		
		
		   
	       double d =Math.random()*10;
		   
		   int app=(int)(d*10);
		   System.out.print(app);
		   System.out.print("Guess the number");
		   
		   Scanner scan=new Scanner(System.in)
		   int guess=scan.nextInt();
		   
		   while(true)
		   {
			   
		   }
		
	}
}
*/
/*
class Practice1
{
	public static void main(String args[])
	{
		int temp=0;
		int z=1;
		 //5 1 2 3 4-->right shift
	     //2 3 4 5 1 left shift
		int arr[]={1,2,3,4,5};
		
		/*
		//left
		for(int i=0;i<arr.length-1;i++)
		{
			temp =arr[i+1];
		   arr[i+1]=arr[i];
		   arr[i]=temp;	   
		}
		*/
		/*
		//right
		int f=arr[0];
		int last =arr.length-1;
		for(int i=0;i<arr.length-1;i++)
		{
			arr[i]=arr[i+1];  
		}
		arr[last]=f;
		for(int j=0;j<arr.length;j++)
		{
		 System.out.print(arr[j]+" ");
		}
	}
}
*/

/*
//Maximum subarray 
//using kedane's Algo
class Practice1
 {
    
    public static void main(String args[])
     {
		 int arr[]={1,3,4,5,-7,-9,2};
        int temp=Integer.MIN_VALUE;
        int sum=0;
        for(int i=0;i<arr.length;i++)
        {
            sum+=arr[i];
        
               if(sum>temp)
                  {
                    temp=sum;
                  }
               if(sum<0)
                  {
                     sum=0;
                   }
        }
    System.out.print(temp);
  }
}
*/
/*
//moving zeros to end
class Practice1
 {
    public static void main(String args[])
	{
		int nums[]={12,4,5,0,0,8,0,2,3,0,0,0,1};
        int count = 0;  
        
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
               
                int temp = nums[count];
                nums[count] = nums[i];
                nums[i] = temp;
                count=count+1;
				
            }
        }
		for(int z=0;z<nums.length;z++)
		{
		System.out.print(nums[z]);
		}
    }
}
*/
/*
//median of sorted array
import java.util.*;
class Practice1 {
    public static double find(int[] nums1, int[] nums2) 
    { 
        int arr[]=new int[nums1.length+nums2.length];
        for(int i=0;i<nums1.length;i++)
        {
            arr[i]=nums1[i];
        }
        for(int j=0;j<nums2.length;j++)
        {
            arr[j+nums1.length]=nums2[j];
        }
        Arrays.sort(arr);
    

        if(arr.length%2==0)//even
        {
            double a=  (arr[arr.length/2]+arr[(arr.length/2)-1])/2.0;// 1 2 3 4-->even --> arr.length/2-->    4/2= 2,,  (arr.length/2)-1==1;
           return a;
        }
        else if (arr.length%2!=0)//odd
        {
           int b=arr[(arr.length)/2];
              return b;
        }

     return -1 ;
    }
	public static void main(String args[])
	{
		int app1[]={1,2,3,4,5,6,7};
		int app2[]={8,9,10,11,12};
		System.out.print(find(app1,app2));
	}
}
*/

/*
//Best time to buy and sell
class Practice1
{
    public static void main(String args[])
    {
		int prices[]={8,4,6,8,9,1,5,3};
        int buytime = prices[0];
        int maxprofit = 0;
        for (int i = 1; i < prices.length; i++) {
            if (prices[i] < buytime) {
                buytime = prices[i];
            } else if (prices[i] - buytime > maxprofit) {
                maxprofit = prices[i] - buytime;
            }
        }
        System.out.print(maxprofit);
    }
}
*/



//Linked List reversed
class ListNode 
{
    int val;
    ListNode next;

    ListNode(int val) {
        this.val = val;
        this.next = null;
    }
}

public class Practice1 {

    public static ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode current = head;

        while (current != null)
			{
            ListNode nextNode = current.next;  // Save the next node
            current.next = prev;               // Reverse the pointer
            prev = current;                    // Move prev forward
            current = nextNode;                // Move current forward
        }

        return prev;  // prev becomes the new head
    }

    public static void printList(ListNode head) {
        ListNode temp = head;
        while (temp != null) {
            System.out.print(temp.val + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args)
	{
        // Create a LinkedList: 1 -> 2 -> 3 -> 4 -> null   
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);

        System.out.print("Original List: ");
        printList(head);

        ListNode reversedHead = reverseList(head);

        System.out.print("Reversed List: ");
        printList(reversedHead);
    }
}


















































































































   















 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 