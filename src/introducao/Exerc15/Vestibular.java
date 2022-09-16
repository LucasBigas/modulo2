package introducao.Exerc15;

import java.util.ArrayList;

public class Vestibular {
    private ArrayList<Vestibulando>listaDeVestibulados = new ArrayList<>();

    public ArrayList<Vestibulando> getListaDeVestibulados() {
        return listaDeVestibulados;
    }

    public void setListaDeVestibulados(ArrayList<Vestibulando> listaDeVestibulados) {
        this.listaDeVestibulados = listaDeVestibulados;
    }
    public String gerarListaDeAprovados(){
      
        StringBuilder montadorString = new StringBuilder();
        for(Vestibulando umVest : getListaDeVestibulados()){
            if(umVest.getNota() >=7){
            montadorString.append("Nome: " + umVest.getNome() + "\n");
            montadorString.append("Nota: " + umVest.getNota() + "\n");
            }
        }
        
        return montadorString.toString();
    }
    public static void main(String[] args) {
        Vestibulando vest1 = new Vestibulando();
        vest1.setNome("Zezinho");
        vest1.setNota(7);

        Vestibulando vest2 = new Vestibulando();
        vest2.setNome("Pedrinho");
        vest2.setNota(5);

        Vestibulando vest3 = new Vestibulando();
        vest3.setNome("Huguinho");
        vest3.setNota(10);

        Vestibulando vest4 = new Vestibulando();
        vest4.setNome("Luizinho");
        vest4.setNota(8);

        Vestibular acafe = new Vestibular();
        acafe.getListaDeVestibulados().add(vest1);
        acafe.getListaDeVestibulados().add(vest2);
        acafe.getListaDeVestibulados().add(vest3);
        acafe.getListaDeVestibulados().add(vest4);

        var guard = acafe.gerarListaDeAprovados();
        System.out.println(guard);
    }
}
