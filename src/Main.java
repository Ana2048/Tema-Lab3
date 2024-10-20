import java.math.BigDecimal;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Loto loto = new Loto();
        BigDecimal combinari = loto.calculCombinari(49, 6);
        System.out.println("Sansele de castig sunt de 1 la ");
        System.out.println(loto.calculCombinari(49, 6));

        SimulareExtragere simulare = new SimulareExtragere();
        simulare.simuleazaExtragere();

        System.out.println("punctul c din problema 4.5");

        SimulareC simC= new SimulareC();
        long extrageri= simC.sim();

        System.out.println("Numere extrase in ordine crescatoare : ");
        simC.afisezCrescator(extrageri);

        System.out.println("Numere extrage in ordine descrescatoare : ");
        simC.afisezDescrescator(extrageri);
    }
}