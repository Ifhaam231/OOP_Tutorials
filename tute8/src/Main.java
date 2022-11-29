import java.awt.*;
import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        JFrame CalculatorFrame = new JFrame("Calculator");
        CalculatorFrame.setSize(600,300);
        JPanel MainPanel = new JPanel(new BorderLayout());

        Font font = new Font("Arial", Font.BOLD, 25);

        JTextField Text = new JTextField("TEXT FIELD");
        Text.setBackground(Color.yellow); //---------
        MainPanel.add(Text, BorderLayout.NORTH);

        JPanel ButtonPanel = new JPanel(new GridLayout(1,2));
        MainPanel.add(ButtonPanel, BorderLayout.CENTER);

        JPanel NumberPanel = new JPanel(new GridLayout(4,3));
        ButtonPanel.add(NumberPanel);
        NumberPanel.setBackground(Color.blue); //---------
        JPanel OperationPanel = new JPanel(new GridLayout(4,1));
        ButtonPanel.add(OperationPanel);
        OperationPanel.setBackground(Color.blue); //---------

        JButton Plus = new JButton("+");
        Plus.setBackground(Color.green); //---------
        OperationPanel.add(Plus);
        JButton Minus = new JButton("-");
        OperationPanel.add(Minus);
        Minus.setBackground(Color.green); //---------
        JButton Clear = new JButton("Clear");
        OperationPanel.add(Clear);
        Clear.setBackground(Color.green); //---------

        for (int i = 1; i < 10; i++) {
            JButton Number = new JButton(String.valueOf(i));
            Number.setFont(font);
            NumberPanel.add(Number);
        }
        JButton Zero = new JButton("0");
        NumberPanel.add(Zero);
        JButton Period = new JButton(".");
        NumberPanel.add(Period);


        //MainPanel.add(new JButton("poopw"),BorderLayout.WEST);



        CalculatorFrame.add(MainPanel);
        CalculatorFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        CalculatorFrame.setVisible(true);


        /*JButton b=new JButton("click");//creating instance of JButton
        b.setBounds(130,100,100, 40);//x axis, y axis, width, height

        CalculatorFrame.add(b);//adding button in JFrame

        CalculatorFrame.setSize(400,500);//400 width and 500 height
        CalculatorFrame.setLayout(null);//using no layout managers*/
    }
}
