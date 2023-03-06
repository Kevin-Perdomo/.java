import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class principal {

    public static void main(String[] args) {
        Janela j;
        j = new Janela();

    }
}

class Janela extends JFrame {

    JButton b1, b2;
    JLabel l1, l2, l3, l4, l5, l6;
    JTextField t1, t2, t3, t4, t5, t6;

    Janela() {

        Monitor m = new Monitor();

        this.setSize(600, 320);
        this.setLocation(300, 200);
        this.setForeground(Color.BLACK);
        this.setTitle("Equação do segundo grau");
        this.setResizable(false);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.getContentPane().setLayout(null);

        // Input
        l1 = new JLabel("Coeficiente a:");
        l1.setSize(100, 30);
        l1.setLocation(20, 20);

        t1 = new JTextField("Texto");
        t1.setSize(80, 30);
        t1.setLocation(180, 20);
        t1.setEditable(true);
        t1.setToolTipText("b");

        b1 = new JButton("Calcular");
        b1.setSize(200, 30);
        b1.setLocation(20, 240);
        b1.setBackground(new Color(0x21, 0x56, 0x48));
        b1.setForeground(Color.WHITE);
        b1.addMouseListener(m);

        l2 = new JLabel("Coeficiente b:");
        l2.setSize(100, 30);
        l2.setLocation(20, 80);

        t2 = new JTextField("Texto");
        t2.setSize(80, 30);
        t2.setLocation(180, 80);
        t2.setEditable(true);
        t2.setToolTipText("b");

        l3 = new JLabel("Coeficiente c:");
        l3.setSize(100, 30);
        l3.setLocation(20, 140);

        t3 = new JTextField("Texto");
        t3.setSize(80, 30);
        t3.setLocation(180, 140);
        t3.setEditable(true);
        t3.setToolTipText("c");

        // Output
        l4 = new JLabel("Delta:");
        l4.setSize(100, 30);
        l4.setLocation(370, 20);

        t4 = new JTextField("Texto");
        t4.setSize(80, 30);
        t4.setLocation(480, 20);
        t4.setEditable(false);

        l5 = new JLabel("Raiz X1:");
        l5.setSize(100, 30);
        l5.setLocation(370, 80);

        t5 = new JTextField("Texto");
        t5.setSize(80, 30);
        t5.setLocation(480, 80);
        t5.setEditable(false);

        l6 = new JLabel("Raiz X2:");
        l6.setSize(100, 30);
        l6.setLocation(370, 140);

        t6 = new JTextField("Texto");
        t6.setSize(80, 30);
        t6.setLocation(480, 140);
        t6.setEditable(false);

        b2 = new JButton("Limpar");
        b2.setSize(200, 30);
        b2.setLocation(370, 240);
        b2.setBackground(new Color(0x21, 0x56, 0x48));
        b2.setForeground(Color.WHITE);
        b2.addMouseListener(m);

        // Input
        this.add(l1);
        this.add(t1);
        this.add(b1);

        this.add(l2);
        this.add(t2);

        this.add(l3);
        this.add(t3);

        // Output
        this.add(l4);
        this.add(t4);

        this.add(l5);
        this.add(t5);

        this.add(l6);
        this.add(t6);
        this.add(b2);

        this.show();
    }

    class Monitor extends MouseAdapter {

        @Override
        public void mouseClicked(MouseEvent e) {
            if (e.getSource() == b1) {
                t1.setText("clicou no 1");
            }
            if (e.getSource() == b2) {
                t1.setText("clicou no 2");
            }

        }

    }

}