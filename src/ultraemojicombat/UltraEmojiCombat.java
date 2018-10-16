/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ultraemojicombat;



/**
 *
 * @author Nil
 */
public class UltraEmojiCombat {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Lutador l[] = new Lutador[6];
        l[0] = new Lutador("Pretty Boy","França", 31, 1.75f, 90.9f, 11, 2, 1 );
        l[1] = new Lutador("Puttscript","Brasil", 29, 1.68f, 57.8f, 4, 2, 3  );
        l[2] = new Lutador("SnapShadow","China", 35, 1.65f, 68.9f, 12, 2, 1 );
        l[3] = new Lutador("dead Code","Angola", 28, 1.93f, 68.9f, 13, 0, 2 );
        l[4] = new Lutador("UFOCobol","Brasil", 37, 1.70f, 119.3f, 5, 4, 3  );
        l[5] = new Lutador("Nerdaart","Argentina", 30, 1.81f, 105.7f, 112, 2, 4  );
       // l[0].status();
       // l[0].apresentar();
       // l[1].status();
       // l[1].apresentar();
        
        Luta UEC01 = new Luta();
        UEC01.marcarLuta(l[2],l[3]);
        UEC01.lutar();
        l[2].status();
        l[3].status();
    }
    
}
