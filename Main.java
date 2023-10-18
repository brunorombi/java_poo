public class Main {
    public static void main(String[] args) {
        Filme meuFilme = new Filme();
        meuFilme.nome = "O poderoso chefão";
        meuFilme.anoDeLancamento = 1999;

        meuFilme.exibeFichaTecnica();
        meuFilme.avalia(8);
        meuFilme.avalia(10);
            System.out.println(meuFilme.somaDasAvaliacoes);
            System.out.println(meuFilme.totalDeAvaliacoes);
            System.out.println("a media do filme é: "+meuFilme.retornaMedia());
    }
}