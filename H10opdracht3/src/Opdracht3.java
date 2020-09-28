import java.applet.*;
import java.awt.*;
import java.awt.event.*;

public class Opdracht3 extends Applet {

    Label label;
    TextField input;
    TextField jaar;
    Button confirm;
    String maand = "Kies een maand";
    String dagen = "0";

    public void init() {

        label = new Label("Type eerst een Jaar en daarna een maand:");

        jaar = new TextField("",5);

        input = new TextField("",5);
        input.addActionListener(new Listener());

        confirm = new Button("Ok");
        confirm.addActionListener(new Listener());

        add(label);
        add(jaar);
        add(input);
        add(confirm);

    }

    public void paint(Graphics g) {

        setBackground(Color.orange);

        g.drawString("" + maand, 200,60);
        g.drawString("" + dagen + " dagen",300,60);

    }

    class Listener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String output = input.getText();
            String jaartxt = jaar.getText();
            int jaar = Integer.parseInt(jaartxt);
            int getal = Integer.parseInt(output);
            switch(getal) {
                case 1:
                    maand = "Januari";
                    dagen = "31";
                    break;
                case 2:
                    maand = "Februari";
                    if ((jaar % 4 == 0 && !(jaar % 100 == 0)) || jaar % 400 == 0 ) {
                        dagen = "29";
                    } else {
                        dagen = "28";
                    }
                    break;
                case 3:
                    maand = "Maart";
                    dagen = "31";
                    break;
                case 4:
                    maand = "April";
                    dagen = "30";
                    break;
                case 5:
                    maand = "Mei";
                    dagen = "31";
                    break;
                case 6:
                    maand = "Juni";
                    dagen = "30";
                    break;
                case 7:
                    maand = "Juli";
                    dagen = "31";
                    break;
                case 8:
                    maand = "Augustus";
                    dagen = "31";
                    break;
                case 9:
                    maand = "September";
                    dagen = "30";
                    break;
                case 10:
                    maand = "Oktober";
                    dagen = "31";
                    break;
                case 11:
                    maand = "November";
                    dagen = "30";
                    break;
                case 12:
                    maand = "December";
                    dagen = "31";
                    break;
                default:
                    maand = "Dat is geen maand";
                    dagen = "0";
                    break;
            }
            repaint();
        }
    }
}