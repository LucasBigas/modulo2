package sistema.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JComponent;
import javax.swing.JOptionPane;

import sistema.entity.Cliente;
import sistema.service.ClienteService;
import sistema.view.FormularioCliente;
import sistema.view.ListagemCliente;

public class ListagemClienteController implements ActionListener{
    private ClienteService service = new ClienteService();
    private ListagemCliente view;

    public ListagemClienteController(ListagemCliente view){
        this.view = view;
    }

    public ArrayList<Cliente>getAllClientes(){
        return service.getAllClientes();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        JComponent botaoClicado = (JComponent)e.getSource();
        switch (botaoClicado.getName()) {
            case "btnNovo":
                btnNovoClique();
            break;
            case "btnAlterar":
                btnAlterarClique();
            break;
            case "btnExcluir":
                btnExcluirClique();
            break;     
        }
    }

    private void btnNovoClique(){
        //JOptionPane.showMessageDialog(null,"BOTAO NOVO");
        Cliente novoCliente = new Cliente();
        FormularioCliente formulario = new FormularioCliente(novoCliente);
        service.save(novoCliente);
        view.atualizaTabela();
    }
    private void btnAlterarClique(){
        //JOptionPane.showMessageDialog( null,"BOTAO ALTERAR");
        var ClienteClicado = view.getCliente();
        if(ClienteClicado != null){
            FormularioCliente formulario = new FormularioCliente(ClienteClicado);
            service.save(ClienteClicado);
            view.atualizaTabela();
        }
    }
    private void btnExcluirClique(){
        //JOptionPane.showMessageDialog(null,"BOTAO EXCLUIR");
        var ClienteClicado = view.getCliente();
        if(ClienteClicado != null){
            var numeroBotao = JOptionPane.showConfirmDialog(null,"Tem certeza que voce quer excluir o registro");
            if(numeroBotao == 0){
                service.remove(ClienteClicado);
            }
            view.atualizaTabela();
        }
    }

}

