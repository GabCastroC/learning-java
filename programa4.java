
import javax.swing.JOptionPane;
public class programa4{
    public static void main(String entrada[]){
        int n1, n2;
        double resultado;
        char op = '0';
        String mensagemFinal = "";

        n1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro número: "));
        n2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo número: "));
        if (n1 > 0 && n2 > 0){
            op = (JOptionPane.showInputDialog("Digite uma opção:\n1) Multiplicação\n2) Exponenciação")).charAt(0);  
        }
        
    switch(op){
        case '1':
            resultado = n1 * n2;
            mensagemFinal = "Seu resultado é: " + n1 + " x " + n2 + " = " + resultado;
            break;
        case '2':
            resultado = Math.pow(n1, n2);
            mensagemFinal = "Seu resultado final é: " + n1 + " ^ " + n2 + " = " + resultado;
            break;
        default:
            resultado = 0;
            mensagemFinal = "Opção inválida.";
        
        }
        JOptionPane.showMessageDialog(null, mensagemFinal);
    }

}
