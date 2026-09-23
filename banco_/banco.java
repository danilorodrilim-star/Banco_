/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Banco_;

import java.util.ArrayList;

public class Banco {

    private ArrayList<Conta> contas;

    public Banco() {
        contas = new ArrayList<>();
    }

    public void adicionarConta(Conta conta) {
        contas.add(conta);
    }

    public void listarContas() {

        System.out.println("========== CONTAS DO BANCO ==========");
        System.out.println();

        for (Conta conta : contas) {
            conta.imprimirInformacoes();
        }
    }
}