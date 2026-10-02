package br.com.neto.Screenmatch.princiapal;

import br.com.neto.Screenmatch.calculor.FiltroRecomendacao;
import br.com.neto.Screenmatch.calculor.calculadoraDeTempo;
import br.com.neto.Screenmatch.modelos.Episodio;
import br.com.neto.Screenmatch.modelos.Filme;
import br.com.neto.Screenmatch.modelos.Serie;

import java.util.ArrayList;

public class Principal {
    public static void main(String[] args){
        Filme meuFilme = new Filme("O Poderoso Chefão", 1972);
        meuFilme.setDuracaoEmMinutos(180);
        meuFilme.setIncluidoNoPlano(true);
        System.out.println("Duração: " + meuFilme.getDuracaoEmMinutos() + "min");

        var outroFilme = new Filme("Três Homens Em Conflito", 1966);
        outroFilme.setDuracaoEmMinutos(180);
        outroFilme.setIncluidoNoPlano(true);


        meuFilme.exibirFichaTecnica();
        meuFilme.avaliar(9);
        meuFilme.avaliar(8);
        meuFilme.avaliar(9);
        System.out.println("Total de avaliações: " + meuFilme.getTotalDeAvaliacoes());
        System.out.println(meuFilme.mediaAvaliacoes());

        Serie lost = new Serie("Lost", 2000);
        lost.setTemporadas(20);
        lost.setEpisodiosPorTemporada(10);
        lost.setMinutosPorEpisodio(45);
        System.out.println("Duração para maratona: " + lost.getDuracaoEmMinutos());

        calculadoraDeTempo calculadora = new calculadoraDeTempo();
        calculadora.inclui(meuFilme);
        calculadora.inclui(lost);
        System.out.println(calculadora.getTempoTotal());

        FiltroRecomendacao filtro = new FiltroRecomendacao();
        filtro.filtra(meuFilme);

        Episodio episodio = new Episodio();
        episodio.setEpisodio(1);
        episodio.setSerie(lost);
        episodio.setTotalVisualizacoes(300);
        filtro.filtra(episodio);

        var filmeDeEduardo = new Filme("Gigante de Aço", 2011);
        filmeDeEduardo.setDuracaoEmMinutos(180);
        filmeDeEduardo.avaliar(8);

        ArrayList<Filme> listaDeFilmes = new ArrayList<>();
        listaDeFilmes.add(outroFilme);
        listaDeFilmes.add(meuFilme);
        listaDeFilmes.add(filmeDeEduardo);
        System.out.println("Tamanho da lista de filmes " + listaDeFilmes.size());
        System.out.println("Primeiro da Lista: " + listaDeFilmes.get(0).getNome());
        System.out.println(listaDeFilmes);
        System.out.println("toString do filme " + listaDeFilmes.get(0).toString());

    }
}