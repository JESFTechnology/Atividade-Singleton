package model;

public class ControleDeCarros {

    private static ControleDeCarros instanciaUnica;

    private int carrosDisponiveis = 0;

    private ControleDeCarros() {
        System.out.println("Controle de carros iniciado pela PRIMEIRA vez.");
    }

    public static ControleDeCarros getInstance() {
        if (instanciaUnica == null) {
            instanciaUnica = new ControleDeCarros();
        }
        return instanciaUnica;
    }

    public int getCarrosDisponiveis() {
        return carrosDisponiveis;
    }

    public void adicionarCarro() {
        carrosDisponiveis++;
    }

    public void venderCarro() {
        if (carrosDisponiveis > 0) {
            carrosDisponiveis--;
        }
    }
}
