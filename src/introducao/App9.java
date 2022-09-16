package introducao;


import introducao.Exerc6.EquipeVendas;
import introducao.Exerc6.Gerente;
import introducao.Exerc6.Vendedor;

public class App9 {
  public static void main(String[] args) {

    Vendedor vendedor1 = new Vendedor();
    vendedor1.setNome("Lucas");
    vendedor1.setId(1);
    vendedor1.setTelefone("4444-5555");
    vendedor1.setPercComissao(10);
    vendedor1.setMetaVendas(10000);
        
    Vendedor vendedor2 = new Vendedor();
    vendedor2.setNome("James");
    vendedor2.setId(2);
    vendedor2.setTelefone("3333-4444");
    vendedor2.setMetaVendas(7000);
    vendedor2.setPercComissao(10);

    Vendedor vendedor3 = new Vendedor();
    vendedor3.setNome("Isak");
    vendedor3.setId(3);
    vendedor3.setTelefone("2222-3333");
    vendedor3.setMetaVendas(1000);
    vendedor3.setPercComissao(2);

    Vendedor vendedor4 = new Vendedor();
    vendedor4.setNome("Luisa");
    vendedor4.setId(4);
    vendedor4.setTelefone("1111-2222");
    vendedor4.setMetaVendas(5000);
    vendedor4.setPercComissao(5);

    Vendedor vendedor5 = new Vendedor();
    vendedor5.setNome("Rafaela");
    vendedor5.setId(5);
    vendedor5.setTelefone("5555-6666");
    vendedor5.setMetaVendas(1000);
    vendedor5.setPercComissao(4);

    Gerente gerente1 = new Gerente();
    gerente1.setNome("Gabriela");
    gerente1.setId(6);
    gerente1.setSetor("Financeiro");
    gerente1.setTelefone("4567-7890");
        
        
    Gerente gerente2 = new Gerente();
    gerente2.setNome("Alice");
    gerente2.setId(7);
    gerente2.setSetor("TI");
    gerente2.setTelefone("3467-3456");


    EquipeVendas equipe1 = new EquipeVendas();
    equipe1.setGestor(gerente1);
    equipe1.getListaVendedores().add(vendedor1);
    vendedor1.setEquipe(equipe1);
    equipe1.getListaVendedores().add(vendedor2);
    vendedor2.setEquipe(equipe1);
    equipe1.getListaVendedores().add(vendedor3);
    vendedor3.setEquipe(equipe1);

    var retorno = equipe1.listarEquipe();
    System.out.println(retorno);

    EquipeVendas equipe2 = new EquipeVendas();
    equipe2.setGestor(gerente2);
    equipe2.getListaVendedores().add(vendedor4);
    vendedor4.setEquipe(equipe2);
    equipe2.getListaVendedores().add(vendedor5);
    vendedor5.setEquipe(equipe2);
        
    retorno = equipe2.listarEquipe();
    System.out.println(retorno);


       

       
  }
}
