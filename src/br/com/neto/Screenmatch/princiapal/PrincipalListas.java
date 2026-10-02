package br.com.neto.Screenmatch.princiapal;

import br.com.neto.Screenmatch.modelos.Filme;
import br.com.neto.Screenmatch.modelos.Serie;
import br.com.neto.Screenmatch.modelos.Titulo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class PrincipalListas {
    static void main() {
        Filme meuFilme = new Filme("O Poderoso Chefão", 1972);
        meuFilme.avaliar(8);
        var outroFilme = new Filme("Três Homens Em Conflito", 1966);
        outroFilme.avaliar(9.5);
        var filmeDeEduardo = new Filme("Gigante de Aço", 2011);
        filmeDeEduardo.avaliar(7);
        Serie lost = new Serie("Lost", 2000);

        ArrayList<Titulo> listaA = new ArrayList<>();
        listaA.add(meuFilme);
        listaA.add(outroFilme);
        listaA.add(filmeDeEduardo);
        listaA.add(lost);
        for (Titulo item : listaA) {
            System.out.println(item.getNome());
            if (item instanceof Filme filme && filme.getClassificavel() > 2) {
                System.out.println("Classificação " + filme.getClassificavel());
            }
        }

        ArrayList<String> buscaPorAnimais =  new ArrayList<>();
        buscaPorAnimais.add("Eduardo");
        buscaPorAnimais.add("Clint Westwood");
        buscaPorAnimais.add("Ana maria");
        System.out.println(buscaPorAnimais);

        Collections.sort(buscaPorAnimais);
        System.out.println("Depois do Collections");
        System.out.println(buscaPorAnimais);


        Collections.sort(listaA);
        System.out.println("Depois de ordena");
        System.out.println(listaA);
        listaA.sort(Comparator.comparing(Titulo::getAnoDeLancamento));
        System.out.println(listaA);
    }
}
