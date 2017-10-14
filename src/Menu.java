import javax.sound.sampled.Line;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class menu extends JFrame {
    JPanel p = new JPanel();
    JButton b1 = new JButton("Read a class");
    JButton b2 = new JButton("Exit");

    public menu() {
        super("Bài tập lớn");
        setSize(800, 600);
        p.setLayout(null);

        b1.setBounds(300, 200, 200, 40);
        b2.setBounds(350, 270, 100, 40);

        b1.setActionCommand("read");
        b2.setActionCommand("exit");

        b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showConfirmDialog(null,"Trần Vũ Đức có phải là 1 con súc vật không?");
            }
        });
        b2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                    System.exit(0);
            }
        });

        p.add(b1);
        p.add(b2);
        add(p);

        setResizable(false);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);
    }

}
