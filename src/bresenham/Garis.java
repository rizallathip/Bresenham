/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package bresenham;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;
/**
 *
 * @author Baka
 */
public class Garis extends JPanel{
    private int x0,y0,x1,y1;
    
    public int GetX0(){
        return x0;
    }
    
    public int GetY0(){
        return y0;
    }
    
    public int GetX1(){
        return x1;
    }
    
    public int GetY1(){
        return y1;
    }
    
    public void SetX0(int xa){
        x0 = xa;
    }
    
    public void SetY0(int ya){
        y0 = ya;
    }
    
    public void SetX1(int xb){
        x1 = xb;
    }
    
    public void SetY1(int yb){
        y1 = yb;
    }
    
    public void paint(Graphics g){
        int x,y,xend,yend;
        int dx = Math.abs(x1-x0);
        int dy = Math.abs(y1-y0);
        int p = 2*dy-dx;
        int duady = 2*dy;
        int duadydx = 2*(dy-dx);
        
        if(x0>x1)
        {
            x = x1;
            y = y1;
            xend = x0;
            yend = y0;
        }
        else 
        {
            x = x0;
            y = y0;
            xend = x1;
            yend = y1;
        }
        
        super.paint(g);
        this.setBackground(Color.black);
        g.setColor(Color.blue);
        g.drawRect(x, y, 1, 1);
        
        while(x < xend)
        {   
            x++;
            if(p<0)
            {
                p+=duady;
            }
            else 
            {
                /*bug
                if(y0>y1)
                {
                    y--;
                }*/
                if(yend<=y && xend>=x)
                {
                    y--;
                }
                else
                {
                    y++;
                }
                //y++;
                p+=duadydx;
            }
            g.drawRect(x, y, 1, 1);
            System.out.println("Titik yang digambar ("+x+","+y+")");
        }
        
        //Gambar garis sejajar koordinat layar x==xend
        if(x >= xend)
        {
            while(y > yend)
            {
                y--;
                g.drawRect(x, y, 1, 1);
                System.out.println("Titik yang digambar ("+x+","+y+")");
            }
            while(y < yend)
            {
                y++;
                g.drawRect(x, y, 1, 1);
                System.out.println("Titik yang digambar ("+x+","+y+")");
            }
        }
        
        
        
        //Gambar string titik awal dan akhir
        g.setColor(Color.YELLOW);
        g.drawString("A ("+x0+","+y0+")", x0, y0);
        g.drawString("B ("+x1+","+y1+")", x1, y1);
        
        //Gambar garis koordinat layar
        for(int X=0;X<=300;X++)
        {
            g.setColor(Color.green);
            g.drawRect(X, 0, 2, 2);
            g.drawString(" X+", 305, 10);
            for(int Y=0;Y<=300;Y++)
            {
                g.setColor(Color.red);
                g.drawRect(0, Y, 2, 2);
                g.drawString(" Y+", 5, 300);
            } 
        }
    }
    
}
