package introducao.Exerc2;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class Reserva {

    private int numero;
    private Date datainicial;
    private Date datafinal;
    private Quarto quarto;

    public String toString(){
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        StringBuilder montadorString = new StringBuilder();
        montadorString.append("\nReserva: " + numero);
        //montadorString.append(String.format("Reserva: %d", numero));
        montadorString.append("\nData Inicial: " + sdf.format(datainicial));
        montadorString.append("\nData Final: " + sdf.format(datafinal));
        montadorString.append("\nQuarto: " + quarto.getNumero());

        for(int i=0; i< listaHospede.size(); i++){
            Hospede umHospede = listaHospede.get(i);
            montadorString.append("\nHospede - Nome: " + umHospede.getNome());
            montadorString.append("\nHospede - Telefone: " + umHospede.getTelefone());
            montadorString.append("\nHospede - CPF: " + umHospede.getCPF());
        }
        /*FOR EACH
        for(Hospede umHospede : listaHospedes){
            montadorString.append("\nHospede - Nome: " + umHospede.getNome());
            montadorString.append("\nHospede - Telefone: " + umHospede.getTelefone());
            montadorString.append("\nHospede - CPF: " + umHospede.getCPF());
        }
        */
        return montadorString.toString();
    }
    private ArrayList<Hospede>listaHospede = new ArrayList<>();
    
    public ArrayList<Hospede> getListaHospede() {
        return listaHospede;
    }

    public void setListaHospede(ArrayList<Hospede> listaHospede) {
        this.listaHospede = listaHospede;
    }

    public Quarto getQuarto() {
        return quarto;
    }

    public void setQuarto(Quarto quarto) {
        this.quarto = quarto;
    }
    public Reserva(int numero){
        this.numero = numero;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public Date getDatainicial() {
        return datainicial;
    }

    public void setDatainicial(Date datainicial) {
        this.datainicial = datainicial;
    }

    public Date getDatafinal() {
        return datafinal;
    }

    public void setDatafinal(Date datafinal) {
        this.datafinal = datafinal;
    }
    

}
