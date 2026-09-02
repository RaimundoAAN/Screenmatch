import br.com.neto.Screenmatch.calculor.calculadoraDeTempo;
import br.com.neto.Screenmatch.modelos.Filme;
import br.com.neto.Screenmatch.modelos.Serie;

public class Principal {
    public static void main(String[] args){
        Filme meuFilme = new Filme();
        meuFilme.setNome("O Poderoso Chefão");
        meuFilme.setAnoDeLancamento(1972);
        meuFilme.setDuracaoEmMinutos(180);
        meuFilme.setIncluidoNoPlano(true);
        System.out.println("Duração: " + meuFilme.getDuracaoEmMinutos() + "min");



        meuFilme.exibirFichaTecnica();
        meuFilme.avaliar(9);
        meuFilme.avaliar(8);
        meuFilme.avaliar(9);
        System.out.println("Total de avaliações: " + meuFilme.getTotalDeAvaliacoes());
        System.out.println(meuFilme.mediaAvaliacoes());

        Serie lost = new Serie();
        lost.setNome("Lost");
        lost.setAnoDeLancamento(2000);
        lost.setTemporadas(20);
        lost.setEpisodiosPorTemporada(10);
        lost.setMinutosPorEpisodio(45);
        System.out.println("Duração para maratona: " + lost.getDuracaoEmMinutos());

        calculadoraDeTempo calculadora = new calculadoraDeTempo();
        calculadora.inclui(meuFilme);
        calculadora.inclui(lost);
        System.out.println(calculadora.getTempoTotal());


    }
}