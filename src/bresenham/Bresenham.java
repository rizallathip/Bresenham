/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package bresenham;

import javax.swing.JFrame;
import java.util.Scanner;
/**
 *
 * @author Baka
 */
public class Bresenham {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        JFrame frame = new JFrame("Alogaritma Garis Bresenham");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Garis grs = new Garis();
        Scanner in = new Scanner(System.in);
        
        /*input
        grs.SetX0(10);
        grs.SetY0(20);
        grs.SetX1(100);
        grs.SetY1(60);*/
        
        System.out.println("Masukan x0 : ");grs.SetX0(in.nextInt());
        System.out.println("Masukan y0 : ");grs.SetY0(in.nextInt());
        System.out.println("Masukan x1 : ");grs.SetX1(in.nextInt());
        System.out.println("Masukan y1 : ");grs.SetY1(in.nextInt());
        
        frame.add(grs);
        frame.setSize(600, 480);
        frame.setVisible(true);
    }
    
}
