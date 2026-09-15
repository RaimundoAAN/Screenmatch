package br.com.neto.Screenmatch.modelos;
import br.com.neto.Screenmatch.calculor.Classificavel;

public class Filme extends Titulo implements Classificavel {
    private String diretor;


    public String getDiretor() {
        return diretor;
    }

    public void setDiretor(String diretor) {
        this.diretor = diretor;
    }

    @Override
    public int getClassificavel() {
        return (int) mediaAvaliacoes() / 2 ;
    }
}
