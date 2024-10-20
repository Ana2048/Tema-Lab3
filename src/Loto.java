import java.math.BigDecimal;

public class Loto {

    public Loto() {
    }

    private static BigDecimal factorial(int num)
    {
        BigDecimal factorial = new BigDecimal(1);
        for(int i=1;i<=num;i++)
            factorial=factorial.multiply(new BigDecimal(i));

        return factorial;

    }

    public BigDecimal calculCombinari(int n, int k)
    {
        BigDecimal factorial = Loto.factorial(n);
        BigDecimal factorial2 = Loto.factorial(k);
        BigDecimal factorial3 = Loto.factorial(n-k);
        BigDecimal numitor=factorial2.multiply(factorial3);
        BigDecimal rezultat=factorial.divide(numitor);
        return rezultat;


    }
}
