package view;

import model.ControleDeCarros;

public class Main {
    public static void main(String[] args) {

        ControleDeCarros controle = ControleDeCarros.getInstance();

        controle.adicionarCarro();
        controle.adicionarCarro();
        controle.adicionarCarro();

        System.out.println("Carros disponíveis: " + controle.getCarrosDisponiveis());

        controle.venderCarro();

        System.out.println("Carros disponíveis após venda: " + controle.getCarrosDisponiveis());

        ControleDeCarros controle2 = ControleDeCarros.getInstance();

        System.out.println("É a mesma instância? " + (controle == controle2));
        System.out.println("Carros disponíveis (controle2): " + controle2.getCarrosDisponiveis());
    }
}
