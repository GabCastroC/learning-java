public class Teste {
    public static void main(String[] args){
        int idade;
        Double peso;
        String nome, curso;
        char genero; 
        
        idade = Integer.parseInt(args[0]);
        peso = Double.parseDouble(args[1]);
        nome = args[2];
        curso = args[3]; 
        genero = args[4].charAt(0);
        
        System.out.println("Meu nome é " + nome + " e tenho " + idade + " anos. " +  "Faço curso de " + curso + ", sou do gênero " + genero + " e peso " + peso + "Kg" );
        
        System.exit(0);
                 
    }

}