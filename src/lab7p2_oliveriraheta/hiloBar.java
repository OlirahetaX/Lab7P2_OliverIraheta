package lab7p2_oliveriraheta;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JProgressBar;

public class hiloBar implements Runnable {

    private JProgressBar jpb;
    private int tamanio;

    public hiloBar(JProgressBar jpb, int tamanio) {
        this.jpb = jpb;
        this.tamanio = tamanio;
    }

    @Override
    public void run() {
        
        int tiempo = tamanio / 10;
        int sum = 100 / tiempo;
        System.out.println("t "+tiempo);
        System.out.println("sum "+ sum);
        jpb.setValue(0);
        while (jpb.getValue() < 100) {
            System.out.println(jpb.getValue() + sum);
            jpb.setValue(jpb.getValue() + sum);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                Logger.getLogger(hiloBar.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        jpb.setValue(0);
    }

}
