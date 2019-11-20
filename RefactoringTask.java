import java.util.Scanner;

public class RefactoringTask {

public static void main(String args[]) {
    
while(true) {
    
Scanner in = new Scanner(System.in);
System.out.println("Enter RPN expression or \"quit\".");
String line = in.nextLine( );
if(line.equals("quit")) {
    
break;
}

else {
ReversePolishNotation calc = new ReversePolishNotation(line);
System.out.printf("Answer is %f\n", calc.get( ));
   }
  } 
 }
}

