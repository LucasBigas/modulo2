package introducao;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import introducao.Exerc3.Comprador;
import introducao.Exerc3.ItemPedido;
import introducao.Exerc3.Pedido;
import introducao.Exerc3.Produto;

public class App6 {
    public static void main(String[] args) {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        Produto produto1 = new Produto();
        produto1.setId(1001);
        produto1.setNome("Playstation 5");
        produto1.setValor(8000f);

        Produto produto2 =  new Produto();
        produto2.setId(1002);
        produto2.setNome("Xbox Series X");
        produto2.setValor(5000f);
        
        Comprador zezinho = new Comprador();
        zezinho.setId(300);
        zezinho.setNome("Zezinho da Silva");
        zezinho.setEndereco("Rua Lalala 100");

        Pedido pedido1 = new Pedido();
        pedido1.setId(1);
        try{
            pedido1.setData(sdf.parse("29/04/2022"));
        }catch(ParseException e){
            e.printStackTrace();
        }
        pedido1.setCliente(zezinho);

        ItemPedido itempedido1 = new ItemPedido();
        itempedido1.setId(1);
        itempedido1.setQuantidade(1);
        itempedido1.setValorVenda(7500f);
        itempedido1.setProduto(produto1);
        pedido1.getListaitens().add(itempedido1);

        ItemPedido itemPedido2 =  new ItemPedido();
        itemPedido2.setId(2);
        itemPedido2.setQuantidade(1);
        itemPedido2.setValorVenda(4000f);
        itemPedido2.setProduto(produto2);
        pedido1.getListaitens().add(itemPedido2);
        
        var result = pedido1.calcuValorTotal();
        System.out.println(String.format("O total do pedido e: %.2f",result));

        Comprador Lukinhas = new Comprador();
        Lukinhas.setId(400);
        Lukinhas.setNome("Lukinhas Oliveira");
        Lukinhas.setEndereco("Rua Balao 340");

        Pedido pedido2 = new Pedido();
        pedido2.setId(245);
        try{
            pedido2.setData(sdf.parse("23/05/2022"));
        }catch(ParseException e){
            e.printStackTrace();
        }
        pedido2.setCliente(Lukinhas);

        Produto produto3 = new Produto();
        produto3.setId(390);
        produto3.setNome("Ipad");
        produto3.setValor(3400f);

        Produto produto4 = new Produto();
        produto4.setId(789);
        produto4.setNome("Iphone 8");
        produto4.setValor(8000f);

        Produto produto5 = new Produto();
        produto5.setId(678);
        produto5.setNome("Samsung s20");
        produto5.setValor(5600f);

        ItemPedido itemPedido3 = new ItemPedido();
        itemPedido3.setId(4);
        itemPedido3.setQuantidade(1);
        itemPedido3.setValorVenda(5000f);
        itemPedido3.setProduto(produto5);
        pedido2.getListaitens().add(itemPedido3);

        ItemPedido itemPedido4 = new ItemPedido();
        itemPedido4.setId(6);
        itemPedido4.setQuantidade(1);
        itemPedido4.setValorVenda(3000f);
        itemPedido4.setProduto(produto3);
        pedido2.getListaitens().add(itemPedido4);

        ItemPedido itemPedido5 = new ItemPedido();
        itemPedido5.setId(7);
        itemPedido5.setQuantidade(1);
        itemPedido5.setValorVenda(7000f);
        itemPedido5.setProduto(produto4);
        pedido2.getListaitens().add(itemPedido5);

        var resultado = pedido2.calcuValorTotal();
        System.out.println(String.format("O total do pedido e: %.2f",resultado));

        
        

    

        

    
         
        
       

    }
}
