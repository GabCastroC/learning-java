
import javax.swing.JOptionPane;
public class exemploDede {
    public static void main(String entrada[]){
        double n1 = 0, n2 = 0, resultado = 0;
        char op;
        String mensagemFinal = "";
        boolean programaLigado = true;
        
        while (programaLigado) {
            op = (JOptionPane.showInputDialog("Escolha uma operação:\n1) Soma\n2) Subtração\n3) Multiplicação\n4) Divisão\n5) Sair do programa" )).charAt(0);

                if(Integer.parseInt(Character.toString(op)) >= 1 && Integer.parseInt(Character.toString(op)) <= 4) {
                    n1 = Double.parseDouble(JOptionPane.showInputDialog("Digite o primeiro número: "));
                    n2 = Double.parseDouble(JOptionPane.showInputDialog("Digite o segundo número: "));
                }

            switch(op) {
                case '1':
                    resultado = n1 + n2;
                    mensagemFinal = n1 + " + " + n2 + " = " + resultado;
                    break;
                case '2':
                    resultado = n1 - n2;
                    mensagemFinal = n1 + " - " + n2 + " = " + resultado;
                    break;
                case '3':
                    resultado = n1 * n2;
                    mensagemFinal = n1 + " x " + n2 + " = " + resultado;
                    break;
                case '4':
                    if(n2 == 0) {
                        mensagemFinal = "Não se pode dividir por zero";
                        break;
                    }
                    resultado = n1 / n2;
                    mensagemFinal = n1 + " / " + n2 + " = " + resultado;
                    break;
                case '5':
                    programaLigado = false;
                    break;
                default:
                    mensagemFinal = "Opção inválida";
                    resultado = 0;

            }
        
        /* RESOLUÇÃO COM IF/ELSE IF/ELSE

            if (op == 1){
                resultado = n1 + n2;
            } else if (op == 2){
                resultado = n1 - n2;
            } else if (op == 3){
                resultado = n1 * n2;
            } else if (op == "4".charAt(0)){
                resultado = n1 / n2;
            } else {
                resultado = 0;
            }
            
        */
            if(!mensagemFinal.isEmpty()) JOptionPane.showMessageDialog(null, mensagemFinal);
        }
    }

}
