import java.applet.*;
import java.awt.*;
import java.awt.event.*;

public class H10opdracht1 extends Applet {

    TextField input;
    Label label;
    Button confirm;
    int resultaat;
    int resultaat2;

    public void init() {

        label = new Label("Type hier je getal:");
        input = new TextField("",10);

        confirm = new Button("Enter");
        confirm.addActionListener(new Listener());

        add(label);
        add(input);
        add(confirm);
    }

    public void paint(Graphics g) {

        setBackground(Color.yellow);

        g.drawString("Laagste getal: " + resultaat2,90,60);
        g.drawString("Hoogste getal:" + resultaat,200,60);

    }

    class Listener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String output = input.getText();
            int getal = Integer.parseInt(output);
            if (getal > resultaat) {
                resultaat = getal;
                repaint();
            } else {
                if (resultaat2 == 0) {
                    if (getal < resultaat) {
                        resultaat2 = getal;
                        repaint();
                    }
                } else {
                    if (getal < resultaat2) {
                        resultaat2 = getal;
                        repaint();
                    }
                }
            }
        }
    }
}