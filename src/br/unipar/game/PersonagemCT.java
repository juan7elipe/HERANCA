package br.unipar.game;

import java.sql.Timestamp;

public class PersonagemCT extends Personagem {

    private boolean desarme_bomba;
    private Long tempo_desarme;

    public boolean isDesarme_bomba() {
        return desarme_bomba;
    }

    public void setDesarme_bomba(boolean desarme_bomba) {
        this.desarme_bomba = desarme_bomba;
    }

    public Long getTempo_desarme() {
        return tempo_desarme;
    }

    public void setTempo_desarme(Long tempo_desarme) {
        this.tempo_desarme = tempo_desarme;
    }
}
