import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Sobre extends JDialog {

    public Sobre(Frame owner, String title) {
        super(owner, title);

        FlowLayout flow = new FlowLayout();
        getContentPane().setLayout(flow);

        setBounds(100,100, 250,250);

        JLabel jAluno = new JLabel("aluno: Alberto Lopes");
        jAluno.setPreferredSize(new Dimension(200,40));
        JButton btnFechar = new JButton("OK");
        btnFechar.setPreferredSize(new Dimension(100,40));


        getContentPane().add(jAluno);
        getContentPane().add(btnFechar);


        btnFechar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
            }
        });

        setVisible(true);
    }
}
