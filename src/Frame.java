import javax.swing.*;

public class Frame extends JFrame {
    private int width;
    private int height;
    private Panel panel;
    public Frame(int width, int height){
        this.width = width;
        this.height = height;
        panel = new Panel(this.width,this.height);
    }

    public void setup(){
        this.setTitle("Quicksort");
        this.setSize(this.width,this.height);
        this.getContentPane().add(panel);
        this.setVisible(true);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }
}
