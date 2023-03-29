package treball;

import java.util.ArrayList;

public class TipusJugueta {
    private ArrayList<String> tipusJugueta;

    public TipusJugueta() {
        this.tipusJugueta = new ArrayList<>();
    }

    public ArrayList<String> getTipusJugueta() {
        return tipusJugueta;
    }

    public void addTipusJugueta(String tipusJugueta) {
        this.tipusJugueta.add(tipusJugueta);
    }
}
