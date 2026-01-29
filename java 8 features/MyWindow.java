import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyWindow {
    public static void main(String[] args) {
        JFrame frame = new JFrame("My window");
        frame.setSize(400,400);
        frame.setLayout(new FlowLayout());

        JButton button = new JButton("Click Me !!");
        // we used here anonymous function
//        button.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                JOptionPane.showMessageDialog(null,"Hey, Button clicked");
//            }
//        });

        // or
// functional interface so here we use lambda expression
        button.addActionListener((ActionEvent e) ->{  // can also be removed ActionEvent
            System.out.println("button click");
            JOptionPane.showMessageDialog(null,"Hey, Button clicked");
        }) ;

        frame.add(button);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
