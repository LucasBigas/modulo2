package introducao;

public class Pessoa {
    //Atributos (variaveis) automaticamente incializados com valor padrao
    // - Private + public
    private String nome;
    private int idade;
    private String CPF;
    private float altura;
    private static String raca;

    

    public static void mostraRaca(){
        System.out.println(raca);
    }

    public float getAltura() {
        return altura;
    }
    public String getRaca() {
        return raca;
    }
    public void setRaca(String raca) {
        this.raca = raca;
    }
    public void setAltura(float altura) {
        this.altura = altura;
    }
    public int getIdade() {
        return idade;
    }
    public String getCPF() {
        return CPF;
    }
    public void setCPF(String cPF) {
        CPF = cPF;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }
    //GETTER e SETTER
    public String getNome(){
        return this.nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }

    //comportamento
    // CONSTRUTOR - incializar um objeto e definir valores obrigatorios
    public Pessoa(String nome){ //escopo de vida local
        System.out.println("CONSTRUTOR:" + nome);
        //this.nome = nome;
        setNome(nome);
    }//ate aqui
    
    //metodo (funcao)
    //assinatura de um metodo
    //modificadordeacesso tipoderetorno nomedometodo(parametros) {corpo}
    public String podeDirigir(){
        if(this.idade >=18){
            return "Pode dirigir";
        }else{
            return "Nao pode dirigir";
        }
    }
    public void mostraCPF(){
        System.out.println(this.CPF);
    }
}

