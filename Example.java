import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Example {

    public static void main(String[] args) {
        JFrame frame = new JFrame("House Shape Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 400);
        frame.add(new HousePanel());
        frame.setVisible(true);
    }

    private static class HousePanel extends JPanel {

        @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);
            Graphics2D g2d = (Graphics2D) g;

            // create a new HouseShape object
            HouseShape house = new HouseShape(100, 100, 100, 100);

            // set the fill color to yellow and draw the house
            g2d.setColor(Color.BLUE);
            g2d.fill(house);
        }

    }

}

