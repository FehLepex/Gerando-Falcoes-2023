import java.util.Scanner;

public class FalconFlix {

public static void main(String[] args) {
	Scanner sc1 = new Scanner (System.in);
	System.out.println("Qual o nome do Filme?");
	String nome = sc1.nextLine();
	
	System.out.println("Qual o genero do Filme?");
	String genero = sc1.nextLine();
	
	System.out.println("Qual a faixa etária do Filme?");
	byte faixaEt = sc1.nextByte();
	
	System.out.println("Qual a duração do Filme?");
	int durFilme = sc1.nextInt();
	
	System.out.println("Os dados do filme são:\n" + nome + "\n" + genero + "\n" + faixaEt + "\n" + durFilme + "minutos");
	
	sc1.close();
}	
}
