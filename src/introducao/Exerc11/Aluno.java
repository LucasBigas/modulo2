package introducao.Exerc11;

import java.util.ArrayList;

public class Aluno {
    
    private String nome;
    private ArrayList<Notas>listaNotas = new ArrayList<>();
    

    public ArrayList<Notas> getListaNotas() {
        return listaNotas;
    }

    public void setListaNotas(ArrayList<Notas> listaNotas) {
        this.listaNotas = listaNotas;
    }

    public float calcuMedianotas(){
        float total = 0;
        float media = 0;
        for(int i=0;i<getListaNotas().size();i++){
            total = total + getListaNotas().get(i).getValor();
        }
        media = total / getListaNotas().size();

        return media;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    public static void main(String[] args) {
        Notas nota1 = new Notas();
        nota1.setValor(5);

        Notas nota2 = new Notas();
        nota2.setValor(7);

        Notas nota3 = new Notas();
        nota3.setValor(6);

        Aluno zezinho = new Aluno();
        zezinho.setNome("Zezinho");
        zezinho.getListaNotas().add(nota1);
        zezinho.getListaNotas().add(nota2);
        zezinho.getListaNotas().add(nota3);

        var result = zezinho.calcuMedianotas();
        System.out.println("Media: " + result);

    }
    
}
