package br.unipar.game;

public class ArmaBranca extends Armas {

    private boolean pegar_faca;
    private String inspecionar_faca;

    public boolean isPegar_faca() {
        return pegar_faca;
    }

    public void setPegar_faca(boolean pegar_faca) {
        this.pegar_faca = pegar_faca;
    }

    public String getInspecionar_faca() {
        return inspecionar_faca;
    }

    public void setInspecionar_faca(String inspecionar_faca) {
        this.inspecionar_faca = inspecionar_faca;
    }
}
