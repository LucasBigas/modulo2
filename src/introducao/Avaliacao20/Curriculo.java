package introducao.Avaliacao20;

import java.util.ArrayList;

public class Curriculo {
    private Pessoa pessoa;
    private ArrayList<Formacao>listaFormacoes = new ArrayList<>();
    private ArrayList<ExperienciaProfissional>listaExperienciasProfissionais = new ArrayList<>();


    
    public Pessoa getPessoa() {
        return pessoa;
    }

    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }

    public ArrayList<Formacao> getListaFormacoes() {
        return listaFormacoes;
    }

    public void setListaFormacoes(ArrayList<Formacao> listaFormacoes) {
        this.listaFormacoes = listaFormacoes;
    }

    public ArrayList<ExperienciaProfissional> getListaExperienciasProfissionais() {
        return listaExperienciasProfissionais;
    }

    public void setListaExperienciasProfissionais(ArrayList<ExperienciaProfissional> listaExperienciasProfissionais) {
        this.listaExperienciasProfissionais = listaExperienciasProfissionais;
    }

    public String gerarCurriculo(){
        StringBuilder montar = new StringBuilder();
        montar.append("Nome Pessoa: " + pessoa.getNome() + "\n");
        montar.append("DataNascimento Pessoa: " + pessoa.getDataNascimento() + "\n");
        for(var form : getListaFormacoes()){
            montar.append("Nome Form: " + form.getNome() + "\n");
            montar.append("Ano Conclusao Form: " + form.getAnoConclusao() + "\n");
        }
        for(var exp : getListaExperienciasProfissionais()){
            montar.append("Nome Exp: " + exp.getNome() + "\n");
            montar.append("Ano Conclusao: " + exp.getAnoConclusao() + "\n");

        }
        
        return montar.toString();

    }

    public int contarNumExperienciasProfissionais(){
        int conta =0;
        
        for(var Exp : getListaExperienciasProfissionais()){
            if(Exp.getNome().equalsIgnoreCase("Experiencia"));
            conta = conta + 1;
        
        
        }
        return conta;
    }
}
