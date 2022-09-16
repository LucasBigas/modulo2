package sistema.service;

import java.util.ArrayList;
import sistema.dao.ClienteDao;
import sistema.entity.Cliente;

public class ClienteService {

    //private ArrayList<Cliente> listaClientes = new ArrayList<>();

    private ClienteDao clienteDao = new ClienteDao();

    public ClienteService() {
        /*var cliente1 = new Cliente();
        cliente1.setId(1);
        cliente1.setNome("Zezinho");
        cliente1.setCPF("555.555.555-55");
        Calendar calendario = GregorianCalendar.getInstance();
        calendario.set(2022, 05, 12);
        cliente1.setDataNascimento(calendario.getTime());
        listaClientes.add(cliente1);

        var cliente2 = new Cliente();
        cliente2.setId(2);
        cliente2.setCPF("444.444.444-44");
        cliente2.setNome("Lukas");
        calendario.set(2022, 06, 23);
        cliente2.setDataNascimento(calendario.getTime());
        listaClientes.add(cliente2);

        var cliente3 = new Cliente();
        cliente3.setCPF("666.666.666-66");
        cliente3.setId(3);
        cliente3.setNome("James");
        calendario.set(2022, 04, 11);
        cliente3.setDataNascimento(calendario.getTime());
        listaClientes.add(cliente3);*/
    }

    public ArrayList<Cliente> getAllClientes(){
        return clienteDao.getAll();
    }
    public Cliente save (Cliente cliente){
        //listaClientes.add(cliente);
        clienteDao.save(cliente);
        return cliente;
    }

    public void remove(Cliente cliente) {
        clienteDao.delete(cliente.getId());
    }
}
