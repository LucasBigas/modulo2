package sistema.exception;

public class ValorinvalidoException extends Exception{
    // mensagem de erro + campo + exception
    private String nomeCampo = "";
    
    public ValorinvalidoException(String mensagem, Exception origem, String nomeCampo) {
        this(mensagem, origem); 
        this.nomeCampo = nomeCampo;

    }

    public ValorinvalidoException(String mensagem, Exception origem) {
        super(mensagem, origem); // super se refer a siperClasse (Pai) Exception
        //super(); chama o construtor da SuperClass

    }
}
