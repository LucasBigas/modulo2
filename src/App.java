import introducao.Aplicativo;
import introducao.Celular;
import introducao.Pessoa;

public class App {
    public static void main(String[] args) throws Exception {
        // Criando uma variavel do tipo pessoa
        // criando uma instancia de objeto a partir da classe pessoa

        // passgem de parametros
        Pessoa zezinho = new Pessoa("Laranja");

        zezinho.setNome ("Zezinho da Silva Sauro");
        zezinho.setIdade (23);
        zezinho.setCPF ("127.208.569-12");
        zezinho.setAltura ( 1.7f);
        zezinho.setRaca("A");
        System.out.println(zezinho.getNome() + " Raca: " + zezinho.getRaca());
        Pessoa.mostraRaca();


        Pessoa luizinho = new Pessoa("Limao");
        luizinho.setRaca("B");
        System.out.println(luizinho.getNome() + " Raca: " + luizinho.getRaca());
        System.out.println(zezinho.getNome() +  " Raca: " + zezinho.getRaca());
        //luizinho.nome = "Luizinho da Silva Sauro Jr";
        

        System.out.println(zezinho.getNome());
        System.out.println(zezinho.getCPF());
        System.out.println(zezinho.getIdade());
        System.out.println(zezinho.getAltura());
        System.out.println(luizinho.getNome());
        System.out.println(luizinho.getCPF());
        System.out.println(luizinho.getIdade());

        String guardaResultado = zezinho.podeDirigir();
        System.out.println(guardaResultado);
        guardaResultado = luizinho.podeDirigir();
        System.out.println(guardaResultado);
        
        zezinho.mostraCPF();
        luizinho.mostraCPF();
        
        Celular startak = new Celular("(47) 99999-9999 ");
        startak.setModelo("PT 550");
        startak.setModelo("Motorola");
        
        startak.setDono(zezinho);

        Aplicativo app1 = new Aplicativo("Angry Birds");
        Aplicativo app2 = new Aplicativo("Whatsapp");
        Aplicativo app3 = new Aplicativo("Tiktok");
        Aplicativo app4 = new Aplicativo("Instagram");

        startak.getListaAplicativos().add(app1);
        startak.getListaAplicativos().add(app2);
        startak.getListaAplicativos().add(app3);
        startak.getListaAplicativos().add(app4);
        /*startak.getListaAplicativos().add("Laranja");
        startak.getListaAplicativos().add("Banana");
        startak.getListaAplicativos().add(1200.0f);
        startak.getListaAplicativos().add(1234);
        startak.getListaAplicativos().add(true);
        */

        startak.getListaAplicativos().remove(2);
        startak.getListaAplicativos().set(2, new Aplicativo("Grobopary"));
        System.out.println(startak.getListaAplicativos().indexOf(app1));


        for(int i=0;i<startak.getListaAplicativos().size();i++){
        System.out.println(startak.getListaAplicativos().get(i).getNome());
        }    

        for(Aplicativo umApp : startak.getListaAplicativos()){
            System.out.println(umApp);
        }
        

    }
}
