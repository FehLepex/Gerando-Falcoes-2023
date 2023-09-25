import java.util.Scanner;

public class Filme {
    private String nome;
    private String genero;
    private byte faixaEtaria;
    private short duracao;
    private int compartilhamentos;
    private long visualizacoes;
    private short anoLancamento;
    private double bilheteria;
    private char seloQualidade;
    private String atores;

    public Filme() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Qual o nome do Filme?");
        this.nome = sc.nextLine();

        System.out.println("Qual o gênero do Filme?");
        this.genero = sc.nextLine();

        System.out.println("Qual a faixa etária do Filme?");
        this.faixaEtaria = sc.nextByte();

        System.out.println("Qual a duração do Filme (em minutos)?");
        this.duracao = sc.nextShort();

        System.out.println("Quantidade de Compartilhamentos");
        this.compartilhamentos = sc.nextInt();

        System.out.println("Quantidade de Visualizações");
        this.visualizacoes = sc.nextLong();

        System.out.println("Qual o ano de lançamento do Filme?");
        this.anoLancamento = sc.nextShort();

        System.out.println("Qual o valor de bilheteria arrecadado?");
        this.bilheteria = sc.nextDouble();

        sc.nextLine(); // Consumir a nova linha deixada após o nextDouble

        System.out.println("Qual Selo de qualidade você dá a este Filme? (S, A, B, C, D ou E)");
        this.seloQualidade = sc.nextLine().charAt(0);

        System.out.println("Quais os Atores que participam do filme?");
        this.atores = sc.nextLine();

        sc.close();
    }

    public void imprimirDadosFilme() {
        System.out.println("Os dados do filme são:");
        System.out.println("Nome: " + nome);
        System.out.println("Gênero: " + genero);
        System.out.println("Faixa Etária: " + faixaEtaria);
        System.out.println("Duração: " + duracao + " minutos");
        System.out.println("Compartilhamentos: " + compartilhamentos + " vezes");
        System.out.println("Visualizações: " + visualizacoes + " vezes");
        System.out.println("Ano de Lançamento: " + anoLancamento);
        System.out.println("Bilheteria: " + bilheteria);
        System.out.println("Selo de Qualidade é " + seloQualidade);
        System.out.println("Os atores do filme são " + atores);
    }

    public static void main(String[] args) {
        Filme filme = new Filme();
        filme.imprimirDadosFilme();
    }
}
