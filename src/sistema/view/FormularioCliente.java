package sistema.view;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFormattedTextField;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.text.MaskFormatter;

import sistema.controller.FormularioClienteController;
import sistema.entity.Cliente;
import sistema.exception.ValorinvalidoException;

import java.awt.GridBagLayout;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.awt.GridBagConstraints;

public class FormularioCliente extends JDialog{

    private JPanel jpncentro = new JPanel();
    private JPanel jpnBotao = new JPanel();
    private JButton btnOK = new JButton("OK");
    private JButton btnCancelar = new JButton("Cancelar");
    private JTextField txId = new JTextField(4);
    private JTextField txtNome = new JTextField(40);
    private MaskFormatter mascaraCPF;
    private JFormattedTextField txtCPF;
    private MaskFormatter mascaraData;
    private JFormattedTextField txtData;
    private FormularioClienteController controller = new FormularioClienteController(this);
    private Cliente cliente = new Cliente();

    

    public Cliente getCliente() {
        return cliente;
    }
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
    public FormularioCliente(Cliente cliente){
        this.cliente = cliente;
        setSize(400,300);
        setModal(true);
        criaPaineis();
        atualizaCampos();
        setVisible(true);
    }
    private void atualizaCampos(){
        if(this.cliente != null){
            txId.setText(String.valueOf(this.cliente.getId()));
            txtNome.setText(this.cliente.getNome());
            txtCPF.setText(this.cliente.getCPF());
            try{
                SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
                txtData.setText(sdf.format(this.cliente.getDataNascimento()));
            }catch(Exception e){}
                
        }
    }
    private void criaPaineis(){
        add(jpnBotao,"South");
        btnOK.addActionListener(controller);
        btnOK.setName("btnOK");
        jpnBotao.add(btnOK);
        btnCancelar.addActionListener(controller);
        btnCancelar.setName("btnCancelar");
        jpnBotao.add(btnCancelar);

        jpncentro.setLayout(new GridBagLayout());
        GridBagConstraints cons = new GridBagConstraints();
        cons.fill = GridBagConstraints.HORIZONTAL;


        add(jpncentro,"Center");
        cons.gridx = 0; // coluna 0
        cons.gridy = 0; // linha 0
        cons.weightx = 0.20; // largura em percentual
        jpncentro.add(new JLabel("Codigo"),cons);

        cons.gridx = 1;
        cons.gridy = 0;
        cons.weightx = 0.80;
        jpncentro.add(txId,cons);

        cons.gridx = 0;
        cons.gridy = 1;
        cons.weightx = 0.20;
        jpncentro.add(new JLabel("Nome"),cons);

        cons.gridx = 1;
        cons.gridy = 1;
        cons.weightx = 0.80;
        jpncentro.add(txtNome,cons);

        cons.gridx = 0;
        cons.gridy = 2;
        cons.weightx = 0.20;
        jpncentro.add(new JLabel("CPF"),cons);

        try{
        mascaraCPF =  new MaskFormatter("###.###.###.##");
        txtCPF = new JFormattedTextField(mascaraCPF);
        }catch(ParseException e){
            e.printStackTrace();
        }
        
        cons.gridx = 1;
        cons.gridy = 2;
        cons.weightx = 0.80;
        jpncentro.add(txtCPF,cons);

        cons.gridx = 0;
        cons.gridy = 3;
        cons.weightx = 0.20;
        jpncentro.add(new JLabel("Data de nascimento"),cons);

        try{
            mascaraData = new MaskFormatter("##/##/####");
            txtData = new JFormattedTextField(mascaraData);
        }catch(ParseException e){
            e.printStackTrace();
        }

        cons.gridx = 1;
        cons.gridy = 3;
        cons.weightx = 0.80;
        jpncentro.add(txtData,cons);

    }
    public Cliente atualiza(Cliente cliente)throws ValorinvalidoException{
        try{
        cliente.setId(Long.parseLong(txId.getText()));
        }catch(NumberFormatException e){
            throw new ValorinvalidoException("Campo codigo deve conter numeros", e, "codigo");
        }
        cliente.setNome(txtNome.getText());
        cliente.setCPF(txtCPF.getText());
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        try{
        cliente.setDataNascimento(sdf.parse(txtData.getText()));
        }catch(ParseException e){
            throw new ValorinvalidoException("Valor da data invalido", e,"DATA NASCIMENTO");
        }
        return cliente;
    }

}
