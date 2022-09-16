package introducao.Avaliacao20;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class AppAvalicao20 {
    public static void main(String[] args) {
        Curriculo curriculo1 = new Curriculo();
        
        Pessoa pessoa1 = new Pessoa();
        pessoa1.setNome("Zezinho");
        Calendar calendar = GregorianCalendar.getInstance();
        calendar.set(1980, 12, 01);
        pessoa1.setDataNascimento(calendar.getTime());
        curriculo1.setPessoa(pessoa1);

        Formacao form1 = new Formacao();
        form1.setNome("Ensino Medio");
        form1.setAnoConclusao(1999);
        curriculo1.getListaFormacoes().add(form1);

        Formacao form2 = new Formacao();
        form2.setNome("Curso Novos Talentos TI");
        form2.setAnoConclusao(2022);
        curriculo1.getListaFormacoes().add(form2);

        ExperienciaProfissional exp1 = new ExperienciaProfissional();
        exp1.setNome("Monstro em Java");
        exp1.setAnoConclusao("2022");
        curriculo1.getListaExperienciasProfissionais().add(exp1);

        var guarda = curriculo1.gerarCurriculo();
        System.out.println(guarda);

        var result = curriculo1.contarNumExperienciasProfissionais();
        System.out.println("QTD Experiencia: " + result);

        Curriculo curriculo2 = new Curriculo();

        Pessoa pessoa2 = new Pessoa();
        pessoa2.setNome("Mariazinha");
        calendar.set(1981, 07, 10);
        pessoa2.setDataNascimento(calendar.getTime());
        curriculo2.setPessoa(pessoa2);

        Formacao form3 = new Formacao();
        form3.setNome("Ensino Medio");
        form3.setAnoConclusao(2000);
        curriculo2.getListaFormacoes().add(form3);

        Formacao form4 = new Formacao();
        form4.setNome("Curso Novos Talentos TI");
        form4.setAnoConclusao(2022);
        curriculo2.getListaFormacoes().add(form4);

        ExperienciaProfissional exp2 = new ExperienciaProfissional();
        exp2.setNome("DBA em MariaDB");
        exp2.setAnoConclusao("Atual");
        curriculo2.getListaExperienciasProfissionais().add(exp2);

        ExperienciaProfissional exp3 = new ExperienciaProfissional();
        exp3.setNome("Desenvolvedora FullStack");
        exp3.setAnoConclusao("2021");
        curriculo2.getListaExperienciasProfissionais().add(exp3);
        
        guarda = curriculo2.gerarCurriculo();
        System.out.println(guarda);

        result = curriculo2.contarNumExperienciasProfissionais();
        System.out.println("QTD Experiencia: " + result);


        
    }
}
