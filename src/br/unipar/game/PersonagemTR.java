package br.unipar.game;

import java.sql.Timestamp;

public class PersonagemTR extends Personagem {

    private boolean plantar_bomba;
    private Long tempo_plantar;

    public boolean isPlantar_bomba() {
        return plantar_bomba;
    }

    public void setPlantar_bomba(boolean plantar_bomba) {
        this.plantar_bomba = plantar_bomba;
    }

    public Long getTempo_plantar() {
        return tempo_plantar;
    }

    public void setTempo_plantar(Long tempo_plantar) {
        this.tempo_plantar = tempo_plantar;
    }
}
