package introducao.Exerc8;

import java.util.ArrayList;

public class Planilha {

    private ArrayList<GastoDiarios>listaGastos = new ArrayList<>();
    
    
    public float calculaTotalGastosMensais(){
        float soma =0;
        for(int i=0;i<listaGastos.size();i++){
            GastoDiarios umGasto = listaGastos.get(i);
            soma = soma + umGasto.getValorGasto();
        }
        return soma;
    }

    public ArrayList<GastoDiarios> getListaGastos() {
        return listaGastos;
    }

    public void setListaGastos(ArrayList<GastoDiarios> listaGastos) {
        this.listaGastos = listaGastos;
    }

    public String MostraTipoGasto(){
        StringBuilder montadorString = new StringBuilder();
        GastoDiarios gastoDiarios1 = new GastoDiarios();
        montadorString.append("\nTIPO DE GASTO: " + gastoDiarios1.getTipoGasto());
          

            
        
        return montadorString.toString();
    }
}
