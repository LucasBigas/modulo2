package introducao.Exerc13;

import java.util.ArrayList;

public class Cidade {
    private String nome;
    private ArrayList<Municipe>listaMunicipes = new ArrayList<>();

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public ArrayList<Municipe> getListaMunicipes() {
        return listaMunicipes;
    }
    public void setListaMunicipes(ArrayList<Municipe> listaMunicipes) {
        this.listaMunicipes = listaMunicipes;
    }

    public int contaCasa(){
        int conta = 0;
        for(var umMunicipio : getListaMunicipes()){
            if(umMunicipio.getTipo().getNome().equals("Casa")){
                conta = conta + 1;
            }
        }
        return conta;
    }

    public int contaApta(){
        int conta = 0;
        for(var umMunicipio : getListaMunicipes()){
            if(umMunicipio.getTipo().getNome().equals("Apartamento")){
                conta = conta +1;
            }
        }
        return conta;

    }

    public static void main(String[] args) {
        Cidade cid1 = new Cidade();
        cid1.setNome("Joinville");

        TipoDeResidencia tipo1 = new TipoDeResidencia();
        tipo1.setNome("Apartamento");

        TipoDeResidencia tipo2 = new TipoDeResidencia();
        tipo2.setNome("Casa");

        Municipe municipe1 = new Municipe();
        municipe1.setNome("Zezinho");
        municipe1.setTipo(tipo1);

        Municipe municipe2 = new Municipe();
        municipe2.setNome("Mariazinha");
        municipe2.setTipo(tipo1);

        Municipe municipe3 = new Municipe();
        municipe3.setNome("Huguinho");
        municipe3.setTipo(tipo1);

        Municipe municipe4 = new Municipe();
        municipe4.setNome("Lukinhas");
        municipe4.setTipo(tipo2);

        Municipe municipe5 = new Municipe();
        municipe5.setNome("Luizinho");
        municipe5.setTipo(tipo2);

        cid1.getListaMunicipes().add(municipe1);
        cid1.getListaMunicipes().add(municipe2);
        cid1.getListaMunicipes().add(municipe3);
        cid1.getListaMunicipes().add(municipe4);
        cid1.getListaMunicipes().add(municipe5);

        var guard = cid1.contaApta();
        System.out.println("Apartamento " + guard);

        var guardar = cid1.contaCasa();
        System.out.println("casa " + guardar);
    }
    
}
