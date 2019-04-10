/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabalhobanco;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author matheusmarcus
 */
public class TrabalhoBanco {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String aux,aux2 = null;
        int opcao, numero, numero2;
        double valor;
        ArrayList<contaCorrente> lc = new ArrayList(); // lc Lista conta

        contaCorrente cc, ccF; //cc = Conta Corrente****ccF = Conta Corrente Favorecida 

        do {
            System.out.println("Menu");
            System.out.println("1- Criar Conta");
            System.out.println("2- Dados Bancário");
            System.out.println("3- Depósito");
            System.out.println("4- Saque");
            System.out.println("5- Transferencia");
            System.out.println("0- Sair");

            System.out.print("OPÇÃO: ");
            opcao = in.nextInt();
            in.nextLine();

            switch (opcao) {
                case 1:
                    System.out.println("Digite o Nome do Titular: ");
                    aux = in.nextLine();
                    System.out.println("Digite o CPF do Titular: ");
                    aux2 = in.nextLine();
                    cc = new contaCorrente(aux);
                    lc.add(cc);
                    System.out.println("***Conta Criada Com Sucessor!!!*** ");

                    break;

                case 2:
                    System.out.println("Digite o Numero da Conta: ");
                    numero = in.nextInt();

                    cc = lc.get(numero - 1);
                    cc.dadosBancarios();
                    
                    break;

                case 3:
                    System.out.println("Digite o Numero da Conta: ");
                    numero = in.nextInt();

                    cc = lc.get(numero - 1);

                    System.out.println("Digite o Valor do Depósito: ");
                    valor = in.nextDouble();

                    cc.depositar(valor);

                    break;

                case 4:
                    System.out.println("Digite o Numero da Conta: ");
                    numero = in.nextInt();

                    cc = lc.get(numero - 1);

                    System.out.println("Digite o Valor do Saque: ");
                    valor = in.nextDouble();

                    cc.sacar(valor);

                    break;

                case 5:
                    System.out.println("Digite o Numero da Conta de Origem: ");
                    numero = in.nextInt();
                    cc = lc.get(numero - 1);
                        System.out.println("- - - - - - -");
                    System.out.println("Digite o Numero da Conta Favorecida: ");
                    numero2 = in.nextInt();
                    ccF = lc.get(numero2 - 1);

                    System.out.println("Digite o Valor da Transferencia: ");
                    valor = in.nextDouble();

                    cc.transferir(ccF, valor);

                    break;

                default:
                    if (opcao != 0) {
                        System.out.println("Opção Inválida");
                    }
                    break;
            }
            System.out.println("");
        } while (opcao != 0);
    }

}
