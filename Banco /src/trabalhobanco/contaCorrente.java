/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabalhobanco;

/**
 *
 * @author matheusmarcus
 */
public class contaCorrente {

    private int numero;
    private String titular;
    private int cpf;
    private double saldo;
    static int qtdcontas = 0;

    public contaCorrente(String pTitular) {
        this.titular = pTitular;
        qtdcontas++;
        this.numero = qtdcontas;
        this.saldo = 0;

    }

    public void dadosBancarios() {
        System.out.println("");
        System.out.println("** Dados Bancarios **");
        System.out.println("** Número: " + this.numero);
        System.out.println("** Titular: " + this.titular);
        System.out.println("** CPF: " + this.cpf);
        System.out.println("** Saldo: " + this.saldo);

        System.out.println("-*- Fim dados Bancários -*-");
    }

    public void depositar(double pValor) {
        System.out.println("");
        System.out.println("** Realizar Deposito **");
        System.out.println("** Saldo Anterior " + this.saldo);

        this.saldo += pValor; //this.saldo = this.saldo + pValor;

        System.out.println("** Saldo Posterior **" + this.saldo);
        System.out.println("** fim do Deposito **");
        System.out.println("");
    }

    public void sacar(double pValor) {
        System.out.println("");
        System.out.println("** Realizar Saque **");
        System.out.println("** Saldo Anterior: " + this.saldo);

        if (pValor <= this.saldo) { //caso saldo Suficiente
            this.saldo -= pValor;
            System.out.println("** Saldo Posterior:" + this.saldo);
        } else { // caso saldo insuficiente
            System.out.println("^^ Saldo Insuficiente ^^");

        }
        System.out.println("** Fim do Saque **");
        System.out.println("");

    }

    public void transferir(contaCorrente pDest, double pValor) {
        System.out.println("");
        System.out.println("** Realizar Transferencia **");
        System.out.println("** Saldo Anterior Origem: " + this.saldo);
        System.out.println("** Saldo Anterior Destino: " + pDest.saldo);
        
        if (pValor <= this.saldo) { //caso saldo Suficiente;
            this.saldo -= pValor; // debito da conta ;
            pDest.saldo += pValor; // credito na conta do favorecido;
            System.out.println("** Saldo Posterior Origem:" + this.saldo);
            System.out.println("** Saldo Posterior Destino:" + pDest.saldo);
        } else { // caso saldo insuficiente
            
            System.out.println("^^ Saldo Insuficiente ^^");

        }
        System.out.println("** Transferencia Concluida **");
        System.out.println("");

    }
}
