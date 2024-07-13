package desafio.app;

import desafio.model.*;

public class Main {
    public static void main(String[] args) {

        Banco banco = new Banco();
        banco.setNome("Desafio");
        Cliente cliente = new Cliente("Willians");
        IConta cc = new ContaCorrente(cliente);
        IConta poupanca = new ContaPoupanca(cliente);
        banco.getContas().add(cc);
        banco.getContas().add(poupanca);
        poupanca.depositar(1000);

        cc.depositar(100);
        cc.transferir(50, poupanca);


        banco.getContas().forEach(IConta::imprimirExtrato);

    }
}