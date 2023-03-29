package treball;

public class Main {
    public static void main(String[] args) {
        Marca Cex = new Marca("Cex", "230481935", "carrer sant pau nº23", "cex01@gmail.com");
        Marca Lego = new Marca("Lego", "426409460", "carrer de la Vinyassa nº54", "lego01@gmail.com");
        Marca Mattel = new Marca("Mattel", "794508180", "plaça de Rubén Darío nº32", "mattel01@gmail.com");
        Marca Hasbro = new Marca("Hasbro", "851827214", "avinguda de Joan Miró nº15", "hasbro01@gmail.com");
        Marca Playmobil = new Marca("Playmobil", "714622498", "carrer sant pau nº38", "playmobil01@gmail.com");
        Marca Nerf = new Marca("Nerf", "490180442", "carrer de Simó Ballester nº 24", "nerf01@gmail.com");
        Marca Fisher_Prize = new Marca("Fisher-Prize", "251969669", "Paseo de Mallorca nº68", "fisher.prize01@gmail.com");
        Marca Hot_Weels = new Marca("Hot Weels", "368428020", "Carrer del Bisbe Maura nº 64", "hot.weels01@gmail.com");
        Marca Little_Tikes = new Marca("Little Tikes", "285389743", "carrer de la Marge nº93", "little.tihes01@gmail.com");
        Marca Barbara = new Marca("Barbara", "709858114", "carrer sant pau nº83", "barbara01@gmail.com");
        Jugueta un = new Jugueta(1, "Cotxe", Cex, 24.99, "Un cotxe teledirigit",
                "RC", 25, RangoEdad.NOU_A_DOTZE);
        System.out.println(un);
    }

}
