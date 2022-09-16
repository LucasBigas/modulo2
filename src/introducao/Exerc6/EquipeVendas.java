package introducao.Exerc6;

import java.util.ArrayList;

public class EquipeVendas {

    private Gerente gestor;
    private ArrayList<Vendedor>listaVendedores = new ArrayList<>();

    public ArrayList<Vendedor> getListaVendedores() {
        return listaVendedores;
    }
    public void setListaVendedores(ArrayList<Vendedor> listaVendedores) {
        this.listaVendedores = listaVendedores;
    }
    public String listarEquipe(){
        StringBuilder montadorDeStrings = new StringBuilder();

        //completar GERENTE + SETOR + VENDEDOR
        montadorDeStrings.append("GERENTE\n");
        montadorDeStrings.append("Nome:" + this.getGestor().getNome() + "\n");
        //String.format("Nome: %s \n", this.getGestor().getNome())
        montadorDeStrings.append(String.format("Nome: %s \n", this.getGestor().getNome()));
        montadorDeStrings.append(String.format("Setor: %s \n", this.getGestor().getSetor()));
        montadorDeStrings.append(String.format("Telefone: %s \n", this.getGestor().getTelefone()));
        montadorDeStrings.append(String.format("ID: %s \n", this.getGestor().getId()));

        for(var umVendedor : this.getListaVendedores()){
            montadorDeStrings.append("VENDEDORES\n");
            montadorDeStrings.append(String.format("ID: %s \n", umVendedor.getId()));
            montadorDeStrings.append(String.format("Nome: %s \n", umVendedor.getNome()));
            montadorDeStrings.append(String.format("Telefone: %s \n", umVendedor.getTelefone()));
            montadorDeStrings.append(String.format("Meta Venda: %f \n", umVendedor.getMetaVendas()));
            montadorDeStrings.append(String.format("Comissão: %f \n", umVendedor.getPercComissao()));
            /* valMETA         100%
               valcomissao     perccomissao
             */
            var valcomissao = (umVendedor.getMetaVendas() * umVendedor.getPercComissao()) / 100f;
            montadorDeStrings.append(String.format("Val comissao: %f \n", valcomissao));   
        }
        return montadorDeStrings.toString();
    }
    public Gerente getGestor() {
        return gestor;
    }

    public void setGestor(Gerente gestor) {
        this.gestor = gestor;
    }

    
}
