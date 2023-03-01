import javax.swing.*;
import java.awt.*;

public class ListContatos extends JDialog {

    public ListContatos(Frame owner, String title) {
        super(owner, title);

        FlowLayout flow = new FlowLayout();

        getContentPane().setLayout(flow);

        Menu janela = (Menu) owner;

        for (int i = 0; i < janela.ListaContatos.size(); i++){
            JLabel labelNovo = new JLabel(janela.ListaContatos.get(i).toString());
            labelNovo.setPreferredSize(new Dimension(250,40));
            getContentPane().add(labelNovo);
        }

        setBounds(150,200, 250,200);
        setVisible(true);
    }
}
