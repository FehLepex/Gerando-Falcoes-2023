import java.util.Scanner;

public class FalconFlix {
	
	char seloQualidade;
	boolean disponível;
	
    public static void main(String[] args) {
        Scanner sc1 = new Scanner(System.in);

        System.out.println("Qual o nome do Filme?");
        String nome = sc1.nextLine();

        System.out.println("Qual o genero do Filme?");
        String genero = sc1.nextLine();

        System.out.println("Qual a faixa etária do Filme?");
        byte faixaEt = sc1.nextByte();

        System.out.println("Qual a duração do Filme (em minutos)?");
        short durFilme = sc1.nextShort();

        System.out.println("Quantidade de Compartilhamento");
        int qComp = sc1.nextInt();

        System.out.println("Quantidade de Visualizações");
        long qVisu = sc1.nextLong();

        System.out.println("Qual o ano de lançamento do Filme?");
        short aLanc = sc1.nextShort();
        
        System.out.println("Qual o valor de bilheteria arrecadado?");
        double bilheteria = sc1.nextDouble();
        
        System.out.println("Qual Selo de qualidade você dá a este Filme?(S,A,B,C,D, ou E)" );
        char seloQualidade = sc1.nextLine().charAt(0);
        
        System.out.println("Quais os Atores que participam do filme?");
        String atores = sc1.nextLine();
        
        System.out.println("Os dados do filme são:");
        System.out.println("Nome: " + nome);
        System.out.println("Gênero: " + genero);
        System.out.println("Faixa Etária: " + faixaEt);
        System.out.println("Duração: " + durFilme + " minutos");
        System.out.println("Compartilhamentos: " + qComp + " vezes");
        System.out.println("Visualizações: " + qVisu + " vezes");
        System.out.println("Ano de Lançamento: " + aLanc);
        System.out.println("Bilheteria:" + bilheteria);
        System.out.println("Selo de Qualidade é " + seloQualidade);
        System.out.println("Os atores do filme são " + atores);

        sc1.close();
    }
}
