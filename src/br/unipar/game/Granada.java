package br.unipar.game;

public class Granada extends Armas{

    private boolean pegar_granada;
    private String inspecionar_granada;
    private boolean jogar_granada;

    public boolean isPegar_granada() {
        return pegar_granada;
    }

    public void setPegar_granada(boolean pegar_granada) {
        this.pegar_granada = pegar_granada;
    }

    public String getInspecionar_granada() {
        return inspecionar_granada;
    }

    public void setInspecionar_granada(String inspecionar_granada) {
        this.inspecionar_granada = inspecionar_granada;
    }

    public boolean isJogar_granada() {
        return jogar_granada;
    }

    public void setJogar_granada(boolean jogar_granada) {
        this.jogar_granada = jogar_granada;
    }
}
