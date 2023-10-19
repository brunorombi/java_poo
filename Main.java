import br.com.alura.java.modelos.Filme;

public class Main {
    public static void main(String[] args) {
        Filme meuFilme = new Filme();
        meuFilme.setNome("O poderoso chefão");
        meuFilme.setAnoDeLancamento(1999);
        meuFilme.setIncluidoNoPlano(true);
        meuFilme.setDuracaoEmMinutos(140);

        meuFilme.exibeFichaTecnica();
        meuFilme.avalia(8);
        meuFilme.avalia(10);
            System.out.println(meuFilme.getTotalDeAvaliacoes());
            System.out.println(meuFilme.getSomaDasAvaliacoes());
            System.out.println("a media do filme é: "+meuFilme.pegaMedia());
    }
} 