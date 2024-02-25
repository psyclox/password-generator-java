import java.security.SecureRandom;
import java.util.InputMismatchException;
import java.util.Scanner;
    public class Main {
    public static void main(String[] cool_buddy) {
    Scanner input=new Scanner(System.in);
    System.out.print("Enter the Password length: ");
    try {
    int length=input.nextInt();
    if (length<=0) {
    System.out.println("Password length should be greater than 0.");
        return;
                    }
            String upCase="QWERTYUIOPLKJHGFDSAZXCVBNM";
            String lowCase="qwertyuioplkjhgfdsazxcvbnm";
            String spechar="!@#$%^&*()_+-=[]{}.>|?/<";    
            StringBuilder passkoder=new StringBuilder();
            SecureRandom gen=new SecureRandom();
            for (int i=0;i<length;i++) {
        int wand=gen.nextInt(4);
        switch (wand) 
                {
                    case 1:
                        passkoder.append(gen.nextInt(10)); 
                        break;
                    case 2:
                        passkoder.append(lowCase.charAt(gen.nextInt(lowCase.length()))); 
                        break;
                    case 3:
                        passkoder.append(upCase.charAt(gen.nextInt(upCase.length()))); 
                        break;
                    case 4:
                        passkoder.append(spechar.charAt(gen.nextInt(spechar.length()))); 
                        break;
                }
            }
            System.out.println("Generated Password: "+passkoder.toString());
        } 
        catch (InputMismatchException e)
        {
            System.out.println("Please enter a valid numeric value.");
        }
        finally 
        {
            input.close();   
        }
    }
}

