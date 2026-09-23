/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Banco_;

public class Principal {

    public static void main(String[] args) {

        Banco banco = new Banco();

        ContaPF contaPF = new ContaPF(
                "Danilo Silva",
                1500.00,
                "123.456.789-00"
        );

        ContaPJ contaPJ = new ContaPJ(
                "Tech Solutions LTDA",
                8500.00,
                "12.345.678/0001-90"
        );

        banco.adicionarConta(contaPF);
        banco.adicionarConta(contaPJ);

        contaPF.depositar(500.00);

        contaPJ.sacar(1000.00);

        banco.listarContas();
    }
}