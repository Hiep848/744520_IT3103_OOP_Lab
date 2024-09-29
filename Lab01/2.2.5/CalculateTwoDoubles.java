import javax.swing.JOptionPane;
public class CalculateTwoDoubles {
    public static void main(String[] args){
        String strNum1, strNum2;

        strNum1 = JOptionPane.showInputDialog(null,
        "Please input the first number: ","Input the first number", JOptionPane.INFORMATION_MESSAGE);
        

        strNum2 = JOptionPane.showInputDialog(null,
        "Please input the second number: ","Input the second number",JOptionPane.INFORMATION_MESSAGE);
        
        double num1 = Double.parseDouble(strNum1);

        double num2 = Double.parseDouble(strNum2);

        double sum = num1 + num2;
        double diff = num1 - num2;
        double product = num1 * num2;
        double quot = num1 / num2;

        JOptionPane.showMessageDialog(null, num1 + "+" + num2 + "=" + sum + "\n","Result", JOptionPane.INFORMATION_MESSAGE);
        JOptionPane.showMessageDialog(null, num1 + "-" + num2 + "=" + diff + "\n","Result", JOptionPane.INFORMATION_MESSAGE);
        JOptionPane.showMessageDialog(null, num1 + "*" + num2 + "=" + product + "\n","Result", JOptionPane.INFORMATION_MESSAGE);
        JOptionPane.showMessageDialog(null, num1 + "/" + num2 + "=" + quot + "\n","Result", JOptionPane.INFORMATION_MESSAGE);
        System.exit(0);
    }
}