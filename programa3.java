package teste;
import javax.swing.*;

class programa3
{
    public static void main(String entrada[])        
    {
    	int n1, n2;
    	double div, pot;
    	String msg = "";
    	
    	n1 = Integer.parseInt(JOptionPane.showInputDialog("Digite um número inteiro: "));
    	n2 = Integer.parseInt(JOptionPane.showInputDialog("Digite outro número inteiro: "));
    
    	div = (int)n1 / (int)n2;
    	pot = Math.pow(n1, n2);
    
    	msg = msg + "Resto da divisão de " + n1 + " por " + n2 + " = " + div + "\n";
    	msg = msg + "Potencia de " + n1 + " elevado à " + n2 + " = " + pot + "\n";
    	JOptionPane.showMessageDialog(null, msg);
    
    	System.exit(0);
    
    
    
    }
}