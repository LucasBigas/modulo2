package introducao;


import java.util.Calendar;
import java.util.GregorianCalendar;



import introducao.Exerc4.EmpresaCliente;
import introducao.Exerc4.Funcionario;
import introducao.Exerc4.PessoaFisica;
import introducao.Exerc4.PessoaJuridica;
import introducao.Exerc4.Pessoa;

public class App7 {
    public static void main(String[] args) {
        Funcionario funcionario1 = new Funcionario();
        EmpresaCliente empresa1 = new EmpresaCliente();

        funcionario1.setCPF("555.444.555-67");
        funcionario1.setFuncao("Atendimento");
        funcionario1.setId(1001);
        funcionario1.setNome("Lukas");
        funcionario1.setTelefone("4444-5555");
        Calendar calendario = GregorianCalendar.getInstance();
        calendario.set(2000,05,10);
        funcionario1.setDataNascimento(calendario.getTime());

        empresa1.setNome("GG CONTROL");
        empresa1.setCNPJ("999.999.0001-99");
        empresa1.setMarca("Controles");
        empresa1.setTelefone("5555-3456");
        empresa1.setNumFuncionarios(10);
        calendario.set(2022, 05, 10);
        empresa1.setDataCriacao(calendario.getTime());

        PessoaFisica pessoa1 = funcionario1;
        System.out.println(pessoa1.getDataNascimento());
        System.out.println(pessoa1.getCPF());
        System.out.println(pessoa1.getNome());
        System.out.println(pessoa1.getTelefone());

        PessoaJuridica pessoa2 = empresa1;
        System.out.println(pessoa2.getCNPJ());
        System.out.println(pessoa2.getNome());
        System.out.println(pessoa2.getTelefone());
        System.out.println(pessoa2.getDataCriacao());

        Pessoa pessoa3;
        pessoa3 = pessoa1;
        System.out.println(pessoa3.getNome());
        System.out.println(pessoa3.getTelefone());

        Pessoa pessoa4;
        pessoa4 = pessoa2;
        System.out.println(pessoa4.getNome());
        System.out.println(pessoa4.getTelefone());

        Funcionario funcionario2;
        funcionario2 = (Funcionario) pessoa3;
        System.out.println(funcionario2.getCPF());
        System.out.println(funcionario2.getFuncao());
        System.out.println(funcionario2.getId());
        System.out.println(funcionario2.getNome());
        System.out.println(funcionario2.getTelefone());
        System.out.println(funcionario2.getDataNascimento());

        EmpresaCliente empresa2;
        empresa2 = (EmpresaCliente) pessoa4;
        System.out.println(empresa2.getCNPJ());
        System.out.println(empresa2.getMarca());
        System.out.println(empresa2.getNome());
        System.out.println(empresa2.getNumFuncionarios());
        System.out.println(empresa2.getTelefone());
        System.out.println(empresa2.getDataCriacao());
        
       
       
      

       
       

    }
}
