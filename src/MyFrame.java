import javax.swing.*;
import java.awt.*;

public class MyFrame extends JFrame {
    
    MyFrame() {
        this.setTitle("Bra titel"); //sätter titel på this
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //stänger applikationen
        this.setResizable(false); //förhindrar storleken att ändras på this
        this.setSize(420,420); //sätter x och y dimensioner
        this.setVisible(true); //gör this synlig

        ImageIcon image = new ImageIcon("ikon.jpg"); //skapar en image icon
        this.setIconImage(image.getImage()); //ändrar thisns ikon
        this.getContentPane().setBackground(new Color(157,64,200)); //ändrar bakgrundens färg
    }
    
}
