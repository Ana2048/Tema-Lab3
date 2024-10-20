import java.util.List;
import java.util.Set;
import java.util.ArrayList;
public class SimulareExtragere {

    public SimulareExtragere() {
    }

    public void simuleazaExtragere()
    {
        int count=0;
        boolean[] numereExtrase=new boolean[50];

        while(count<6)
        {
            int nr=(int) (Math.random()*49)+1;
            if(!numereExtrase[nr])
            {
                System.out.println(nr);
                numereExtrase[nr]=true;
                count++;

            }
        }
    }

}
