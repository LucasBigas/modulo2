package introducao;

import java.util.Calendar;
import java.util.GregorianCalendar;

import introducao.Exerc8.GastoDiarios;
import introducao.Exerc8.Planilha;

public class App11 {
    public static void main(String[] args) {
        
        GastoDiarios gasto1 = new GastoDiarios();
        Calendar calendario = GregorianCalendar.getInstance();
        calendario.set(2022, 02, 22);
        gasto1.setTipoGasto("Roupa");
        gasto1.setValorGasto(500f);
        gasto1.setDataGasto(calendario.getTime());
        gasto1.setFormasPagamento("Pix");

        GastoDiarios gasto2 = new GastoDiarios();
        calendario.set(2022, 03, 11);
        gasto2.setTipoGasto("Tenis");
        gasto2.setValorGasto(130f);
        gasto2.setDataGasto(calendario.getTime());
        gasto2.setFormasPagamento("Dinheiro");

        Planilha pla1 =new Planilha();
        pla1.getListaGastos().add(gasto1);
        pla1.getListaGastos().add(gasto2);
        
        pla1.MostraTipoGasto();
        System.out.println(pla1);
        
        

    }
    
}
