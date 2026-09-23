/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Banco_;

public class ContaPJ extends Conta {

    private String cnpj;

    public ContaPJ(String titular, double saldo, String cnpj) {
        super(titular, saldo);
        this.cnpj = cnpj;
    }

    public String getCnpj() {
        return cnpj;
    }

    @Override
    public void imprimirInformacoes() {
        System.out.println("===== CONTA PESSOA JURÍDICA =====");
        System.out.println("Titular: " + getTitular());
        System.out.println("CNPJ: " + cnpj);
        System.out.printf("Saldo: R$ %.2f%n", getSaldo());
        System.out.println("--------------------------------");
    }
}