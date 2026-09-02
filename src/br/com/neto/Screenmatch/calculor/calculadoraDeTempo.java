package br.com.neto.Screenmatch.calculor;
import br.com.neto.Screenmatch.modelos.Titulo;

public class calculadoraDeTempo {
    private int tempoTotal;

    public int getTempoTotal() {
        return tempoTotal;
    }

//    Não é certo repetir codigo como abaixo
//    public void inclui(Filme f){
//        this.tempoTotal += f.getDuracaoEmMinutos();
//    }
//
//    public void inclui(Serie s){
//        this.tempoTotal += s.getDuracaoEmMinutos();
//    }

    public void inclui(Titulo titulo){
        System.out.println("Adicionando duração em min: " + titulo);
        this.tempoTotal += titulo.getDuracaoEmMinutos();
    }
}
