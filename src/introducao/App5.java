package introducao;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import introducao.Exerc2.Hospede;
import introducao.Exerc2.Quarto;
import introducao.Exerc2.Reserva;

public class App5 {
    public static void main(String[] args) {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        Quarto quarto1 = new Quarto();
        quarto1.setNumero(100);

        Hospede pessoa1 = new Hospede("111.111.111-11");
        pessoa1.setNome("Zezinho");
        pessoa1.setTelefone("5555-1234");

        Hospede pessoa2 = new Hospede("222.222.222-22");
        pessoa2.setNome("Mariazinha");
        pessoa2.setTelefone("5555-4321");

        Reserva reserva1 = new Reserva(1001);
        try {
            reserva1.setDatainicial(sdf.parse("28/04/2022"));
            reserva1.setDatafinal(sdf.parse("05/05/2022"));
        } catch (ParseException e) {
            e.printStackTrace();
        }

        reserva1.setQuarto(quarto1);
        reserva1.getListaHospede().add(pessoa1);
        reserva1.getListaHospede().add(pessoa2);
        System.out.println(reserva1);

        Quarto quarto2 = new Quarto();
        quarto2.setNumero(200);

        Hospede pessoa3 = new Hospede("333.333.333-33");
        pessoa3.setNome("Luizinho");
        pessoa3.setTelefone("5555-1122");

        Hospede pessoa4 = new Hospede("444.444.444-44");
        pessoa4.setNome("Huguinho");
        pessoa4.setTelefone("5555-2233");

        Hospede pessoa5 = new Hospede("555.555.555-55");
        pessoa5.setNome("Paulinha");
        pessoa5.setTelefone("5555-5555");

        Reserva reserva2 = new Reserva(1002);
        try{
            reserva2.setDatainicial(sdf.parse("21/04/2022"));
            reserva2.setDatafinal(sdf.parse("28/04/2022"));
        }catch (ParseException e){
            e.printStackTrace();
        }
        reserva2.setQuarto(quarto2);
        reserva2.getListaHospede().add(pessoa3);
        reserva2.getListaHospede().add(pessoa4);
        reserva2.getListaHospede().add(pessoa5);
        System.out.println(reserva2);

    }
}
