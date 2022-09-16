package introducao.Exerc7;

import java.util.ArrayList;

public class Planilha {

    private ArrayList<ContaDeLuz>listaContaDeLuz = new ArrayList<>();

    public ArrayList<ContaDeLuz> getListaContaDeLuz() {
        return listaContaDeLuz;
    }

    public void setListaContaDeLuz(ArrayList<ContaDeLuz> listaContaDeLuz) {
        this.listaContaDeLuz = listaContaDeLuz;
    }

    public float calculaUltimoValorMedio(){
        float soma =0;
        float media =0;
        for(int i=0;i<listaContaDeLuz.size();i++){
            ContaDeLuz umaConta = listaContaDeLuz.get(i);
            soma = soma + umaConta.getValorDaConta();
        }
        media = soma / listaContaDeLuz.size();
        return media;
    }

    public float calculaMaiorValor(){
        float omaior = 0;
        for(ContaDeLuz umaconta : listaContaDeLuz){
            if(omaior < umaconta.getValorDaConta()){
                omaior = umaconta.getValorDaConta();
            }
        }
        return omaior;
    }

    public float calculaMenorValor(){
        float omenor = 0;
        if(listaContaDeLuz.size() >=1){
            omenor = listaContaDeLuz.get(0).getValorDaConta();
        }
        for(ContaDeLuz umaConta : listaContaDeLuz){
            if(omenor > umaConta.getValorDaConta()){
                omenor = umaConta.getValorDaConta();
            }
        }
        return omenor;
    }
    
}
