import Conta.Conta;
import Conta.Cliente;

public class Application {

    public static void main(String[] args) {
        Conta contaUm = new Conta(1596,12345);
        Cliente clienteUm = new Cliente();
        clienteUm.setNome("José Pereira");
        clienteUm.setCpf("000.000.000-00");
        clienteUm.setProfissao("juiz");
        contaUm.setTitular(clienteUm);
        contaUm.depositar(500.00);
        System.out.println(contaUm.getSaldo());

        Conta contaDois = new Conta(1102, 12346);
        Cliente clienteDois = new Cliente();
        clienteDois.setNome("Lucas Ferreira");
        clienteDois.setCpf("000.000.000-01");
        clienteDois.setProfissao("programador");
        contaDois.setTitular(clienteDois);
        contaDois.depositar(1000.00);

        boolean transfereValor = contaDois.transferir(500.00, contaUm);

        if(transfereValor)
            System.out.println("Valor transferido!");
        else
            System.out.println("Erro na execução, tente novamente mais tarde!");

        System.out.println(contaUm.getSaldo());

        System.out.println("Total de contas: " + Conta.getTotal());
    }
}

