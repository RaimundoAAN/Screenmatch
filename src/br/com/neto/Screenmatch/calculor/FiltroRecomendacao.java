package br.com.neto.Screenmatch.calculor;

public class FiltroRecomendacao {

    public void filtra(Classificavel classificavel) {
        if (classificavel.getClassificavel() >= 4) {
            System.out.printf("Preferidos do momento!");
        } else if (classificavel.getClassificavel() >= 2) {
            System.out.printf("Bem avaliado no momento!");
        } else {
            System.out.println("Assitar mais tarde");
        }
    }

}
