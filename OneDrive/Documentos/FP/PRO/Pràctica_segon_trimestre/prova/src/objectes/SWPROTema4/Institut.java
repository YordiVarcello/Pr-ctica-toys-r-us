package objectes.SWPROTema4;

import java.awt.event.FocusListener;
import java.lang.reflect.Array;
import java.util.ArrayList;

public class Institut {
        ArrayList<Alumne> alumnes;

    public static void main(String[] args) {
        Modul m1 = new Modul(5, "FOL");
        Modul m2 = new Modul(5, "FOdL");
        Modul m3 = new Modul(5, "FsOL");
        Cicle c1 = new Cicle("cicle 1", 15);
        Modul2 m122 = new Modul2(5, "modul 2", c1);
        CicleArray cicle1 = new CicleArray("c1", 5, 3);
        cicle1.afegirModul(m1);
        cicle1.afegirModul(m2);
        cicle1.afegirModul(m3);
        System.out.println(cicle1.toString());
        System.out.println(cicle1.tornarModul("FOL"));
        cicle1.eliminarModul("FsOL");
        System.out.println(cicle1);
        cicle1.afegirModul(m3);
        cicle1.afegirModul(new Modul(5, "gfxd"));
        System.out.println(cicle1);
    }

}
