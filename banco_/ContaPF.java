/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Banco_;

public class ContaPF extends Conta {

    private String cpf;

    public ContaPF(String titular, double saldo, String cpf) {
        super(titular, saldo);
        this.cpf = cpf;
    }

    public String getCpf() {
        return cpf;
    }

    @Override
    public void imprimirInformacoes() {
        System.out.println("===== CONTA PESSOA FÍSICA =====");
        System.out.println("Titular: " + getTitular());
        System.out.println("CPF: " + cpf);
        System.out.printf("Saldo: R$ %.2f%n", getSaldo());
        System.out.println("--------------------------------");
    }
}