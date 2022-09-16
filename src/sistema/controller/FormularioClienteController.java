package sistema.controller;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JComponent;
import javax.swing.JOptionPane;

import sistema.entity.Cliente;
import sistema.exception.ValorinvalidoException;
import sistema.view.FormularioCliente;

public class FormularioClienteController 
                implements ActionListener{

        private FormularioCliente formCliente;

        public FormularioClienteController(FormularioCliente formCliente){
            this.formCliente= formCliente;
        }            

    @Override
    public void actionPerformed(ActionEvent e) {
       JComponent botaoClicado = (JComponent) e.getSource();
       if(botaoClicado.getName().equals("btnOK")){
           btnOkClique();
       }else{
           if(botaoClicado.getName().equals("btnCancelar")){
               btnCancelarClique();
           }
       }
        
    }
    private void btnCancelarClique(){
        formCliente.dispose();
    }
    private void btnOkClique(){
        try{
            var cliente = formCliente.getCliente();
            formCliente.atualiza(cliente);
            validador(cliente);
            formCliente.dispose();
            
        }catch(NumberFormatException e){
            JOptionPane.showMessageDialog(null,"Campo numerico nao informado");
        } catch (ValorinvalidoException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
            e.printStackTrace();
        }
    }
    private void validador(Cliente cliente)throws ValorinvalidoException {
        if(cliente.getNome() == null || cliente.getNome().isEmpty()){
            throw new ValorinvalidoException("O nome nao pode ser deixado branco", null, "Nome");    
        }
        
    }
}
