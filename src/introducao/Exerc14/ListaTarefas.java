package introducao.Exerc14;

import java.util.ArrayList;

public class ListaTarefas {
    private ArrayList<Tarefa>listaTarefa = new ArrayList<>();

    public ArrayList<Tarefa> getListaTarefa() {
        return listaTarefa;
    }

    public void setListaTarefa(ArrayList<Tarefa> listaTarefa) {
        this.listaTarefa = listaTarefa;
    }

    public float calculaTempoTotal(){
        float soma = 0;
        for(Tarefa umTarefa : getListaTarefa()){
            soma = soma + umTarefa.getTipo().getTempo();
        }
        return soma;
    }
    public static void main(String[] args) {
        ListaTarefas lista1 = new ListaTarefas();

        TipoDeTarefa tipo1 = new TipoDeTarefa();
        tipo1.setNome("Facil");
        tipo1.setTempo(10);

        TipoDeTarefa tipo2 = new TipoDeTarefa();
        tipo2.setNome("Medio");
        tipo2.setTempo(15);

        TipoDeTarefa tipo3 = new TipoDeTarefa();
        tipo3.setNome("Dificil");
        tipo3.setTempo(20);

        Tarefa tarefa1 = new Tarefa();
        tarefa1.setNome("Passear");
        tarefa1.setTipo(tipo1);
        
        Tarefa tarefa2 = new Tarefa();
        tarefa2.setNome("Pescar");
        tarefa2.setTipo(tipo1);

        Tarefa tarefa3 = new Tarefa();
        tarefa3.setNome("Fazer Compras");
        tarefa3.setTipo(tipo2);

        Tarefa tarefa4 = new Tarefa();
        tarefa4.setNome("Estudar");
        tarefa4.setTipo(tipo2);

        Tarefa tarefa5 = new Tarefa();
        tarefa5.setNome("Trabalhar");
        tarefa5.setTipo(tipo3);

        Tarefa tarefa6 = new Tarefa();
        tarefa6.setNome("Aprender orientacoes Objetos");
        tarefa6.setTipo(tipo3);

        lista1.getListaTarefa().add(tarefa1);
        lista1.getListaTarefa().add(tarefa2);
        lista1.getListaTarefa().add(tarefa3);
        lista1.getListaTarefa().add(tarefa4);
        lista1.getListaTarefa().add(tarefa5);
        lista1.getListaTarefa().add(tarefa6);

        var guardar = lista1.calculaTempoTotal();
        System.out.println("O tempo sera de: " + guardar);
    }

}
