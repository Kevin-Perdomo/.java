package version_1_0_0;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;
import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

class Janela extends JFrame {

  // Constructor
  public Janela() {
    this.setSize(465, 300);
    this.setTitle("Calcular equação de segundo grau");
    this.setDefaultCloseOperation(EXIT_ON_CLOSE);
    this.setResizable(false);
    this.setLayout(null);

    JLabel iLabel = new JLabel("Equação Quadrática ---> [aX² + bX + C = 0]");
    iLabel.setSize(400, 30);
    iLabel.setLocation(100, 5);

    JTextField aText = new JTextField();
    aText.setSize(50, 30);
    aText.setLocation(150, 40);
    aText.setBackground(Color.WHITE);
    aText.setForeground(Color.BLACK);

    JTextField bText = new JTextField();
    bText.setSize(50, 30);
    bText.setLocation(150, 100);
    bText.setBackground(Color.WHITE);
    bText.setForeground(Color.BLACK);

    JTextField cText = new JTextField();
    cText.setSize(50, 30);
    cText.setLocation(150, 160);
    cText.setBackground(Color.WHITE);
    cText.setForeground(Color.BLACK);

    JLabel aLabel = new JLabel("Coeficiente a:");
    aLabel.setSize(100, 30);
    aLabel.setLocation(50, 40);

    JLabel bLabel = new JLabel("Coeficiente b:");
    bLabel.setSize(100, 30);
    bLabel.setLocation(50, 100);

    JLabel cLabel = new JLabel("Coeficiente c:");
    cLabel.setSize(100, 30);
    cLabel.setLocation(50, 160);

    JTextField deltaText = new JTextField();
    deltaText.setSize(140, 30);
    deltaText.setLocation(290, 40);
    deltaText.setBackground(Color.WHITE);
    deltaText.setForeground(Color.BLACK);
    deltaText.setEditable(false);

    JTextField x1Text = new JTextField();
    x1Text.setSize(140, 30);
    x1Text.setLocation(290, 100);
    x1Text.setBackground(Color.WHITE);
    x1Text.setForeground(Color.BLACK);
    x1Text.setEditable(false);

    JTextField x2Text = new JTextField();
    x2Text.setSize(140, 30);
    x2Text.setLocation(290, 160);
    x2Text.setBackground(Color.WHITE);
    x2Text.setForeground(Color.BLACK);
    x2Text.setEditable(false);

    JLabel deltaLabel = new JLabel("Delta:");
    deltaLabel.setSize(60, 30);
    deltaLabel.setLocation(250, 40);

    JLabel x1Label = new JLabel("X1:");
    x1Label.setSize(60, 30);
    x1Label.setLocation(250, 100);

    JLabel x2Label = new JLabel("X2:");
    x2Label.setSize(60, 30);
    x2Label.setLocation(250, 160);

    // Botão Calcular
    JButton calculateButton = new JButton("Calcular");
    calculateButton.setSize(150, 50);
    calculateButton.setLocation(50, 200);
    calculateButton.setBackground(new Color(0x26, 0x35, 0x41));
    calculateButton.setForeground(Color.WHITE);
    calculateButton.addActionListener(new ActionListener() {

      @Override
      public void actionPerformed(ActionEvent e) {
        Equação_quadratica equation = new Equação_quadratica(Double.parseDouble(aText.getText()),
            Double.parseDouble(bText.getText()),
            Double.parseDouble(cText.getText()));

        // DecimalFormat
        String formato = "#,##0.000";
        DecimalFormat d = new DecimalFormat(formato);

        deltaText.setText(d.format(equation.delta).toString());
        x1Text.setText(d.format(equation.x1).toString());
        x2Text.setText(d.format(equation.x2).toString());
      }

    });

    // Botão Limpar
    JButton clearButton = new JButton("Limpar");
    clearButton.setSize(150, 50);
    clearButton.setLocation(280, 200);
    clearButton.setBackground(new Color(0x26, 0x35, 0x41));
    clearButton.setForeground(Color.WHITE);
    clearButton.addActionListener(new ActionListener() {

      @Override
      public void actionPerformed(ActionEvent e) {
        aText.setText("");
        bText.setText("");
        cText.setText("");
        deltaText.setText("");
        x1Text.setText("");
        x2Text.setText("");
      }
    });

    this.add(iLabel);
    this.add(aText);
    this.add(bText);
    this.add(cText);
    this.add(calculateButton);
    this.add(clearButton);
    this.add(aLabel);
    this.add(bLabel);
    this.add(cLabel);
    this.add(deltaText);
    this.add(x1Text);
    this.add(x2Text);
    this.add(deltaLabel);
    this.add(x1Label);
    this.add(x2Label);
    this.setVisible(true);
  }
}