import java.util.Scanner;
import javax.swing.JOptionPane;

public class Main {

    public static void main(String[]args){

        double x = Double.parseDouble(JOptionPane.showInputDialog(null, "Enter side x: "));
        double y = Double.parseDouble(JOptionPane.showInputDialog(null, "Enter side y: "));

        double z = Math.sqrt((x * x) + (y * y));

        JOptionPane.showMessageDialog(null, "The hypotenuse is : " + z);

        // double x;
        // double y;
        // double z;

        // Scanner scanner = new Scanner(System.in);

        // System.out.println("Enter side x: ");
        // x = scanner.nextDouble();

        // System.out.println("Enter side y: ");
        // y = scanner.nextDouble();

        // z = Math.sqrt((x * x) + (y * y));

        // System.out.println("The hypotenuse is : " + z);

        // scanner.close();
        
    }
}