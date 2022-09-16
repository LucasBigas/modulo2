package introducao.Avaliacao1;

import java.util.ArrayList;

public class FaseDaObra {
    private String nome;
    private ArrayList<ItemDeConstrucao>listaDeItens = new ArrayList<>();
    private Engenheiro encarregado;
    private ArrayList<Construtor>listaDeConstrutores = new ArrayList<>();
    

    public String getNome() {
        return nome;
    }

    public ArrayList<Construtor> getListaDeConstrutores() {
        return listaDeConstrutores;
    }

    public void setListaDeConstrutores(ArrayList<Construtor> listaDeConstrutores) {
        this.listaDeConstrutores = listaDeConstrutores;
    }

    public Engenheiro getEncarregado() {
        return encarregado;
    }

    public void setEncarregado(Engenheiro encarregado) {
        this.encarregado = encarregado;
    }

    public ArrayList<ItemDeConstrucao> getListaDeItens() {
        return listaDeItens;
    }

    public void setListaDeItens(ArrayList<ItemDeConstrucao> listaDeItens) {
        this.listaDeItens = listaDeItens;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float calcularValorDaFaseDaObra(){
        float ValorTotal = 0;
        ValorTotal = ValorTotal + encarregado.getSalario();
        for(var umCons : this.getListaDeConstrutores()){
            ValorTotal = ValorTotal + umCons.getSalario();
        }
        for(var umItem : this.getListaDeItens()){
            var qtd = umItem.getQuantidade();
            var Preco = umItem.getProduto().getPreco();
            ValorTotal += (qtd * Preco);
        }
        return ValorTotal;
        
    }
    
}
