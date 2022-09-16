package introducao.Exerc3;

import java.util.ArrayList;
import java.util.Date;

public class Pedido {
    
    private long id;
    private Date data;
    private ArrayList<ItemPedido>listaitens = new ArrayList<>();
    private Comprador cliente;

    public float calcuValorTotal(){
        float valorTotal = 0;
        for(ItemPedido umitem : listaitens){
            var valorItem = umitem.getQuantidade() * umitem.getValorVenda();
            valorTotal += valorItem;
        }
        return valorTotal;
    }
    public ArrayList<ItemPedido> getListaitens() {
        return listaitens;
    }
    public void setListaitens(ArrayList<ItemPedido> listaitens) {
        this.listaitens = listaitens;
    }
    public Comprador getCliente() {
        return cliente;
    }
    public void setCliente(Comprador cliente) {
        this.cliente = cliente;
    }
    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }
    public Date getData() {
        return data;
    }
    public void setData(Date data) {
        this.data = data;
    }

  

    
    
}
