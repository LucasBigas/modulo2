package introducao.Exerc12;

import java.util.ArrayList;



public class Turma {
    private String serie;
    private ArrayList<crianca>listaCrianca = new ArrayList<>();

    public String getSerie() {
        return serie;
    }
    public void setSerie(String serie) {
        this.serie = serie;
    }
    public ArrayList<crianca> getListaCrianca() {
        return listaCrianca;
    }
    public void setListaCrianca(ArrayList<crianca> listaCrianca) {
        this.listaCrianca = listaCrianca;
    }
    
    public int contaMeninos(){
        int conta =0;
        for(var umaCrianca : getListaCrianca()){
            if(umaCrianca.getSexo().equalsIgnoreCase("Masculino")){
                conta = conta + 1;
            }
        }
        
        return conta ;
    }
    public int contaMeninas(){
        int conta =0;
        for(var umaCrianca : getListaCrianca()){
            if(umaCrianca.getSexo().equalsIgnoreCase("Feminino")){
                conta = conta + 1;
            }
        }
        return conta;
    }

    public static void main(String[] args) {
        crianca crianca1 = new crianca();
        crianca1.setNome("Zezinho");
        crianca1.setSexo("Masculino");

        crianca crianca2  = new crianca();
        crianca2.setNome("Mariazinha");
        crianca2.setSexo("Feminino");

        crianca crianca3 = new crianca();
        crianca3.setNome("Aninha");
        crianca3.setSexo("Feminino");

        crianca crianca4 = new crianca();
        crianca4.setNome("Julinha");
        crianca4.setSexo("Feminino");

        Turma turma1 = new Turma();
        turma1.setSerie(" 5 Serie");
        turma1.getListaCrianca().add(crianca1);
        turma1.getListaCrianca().add(crianca2);
        turma1.getListaCrianca().add(crianca3);
        turma1.getListaCrianca().add(crianca4);

        var guardar = turma1.contaMeninos();
        System.out.println("Meninos " + guardar);

        var guard = turma1.contaMeninas();
        System.out.println("Meninas " +guard);
    }
}
