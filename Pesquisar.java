import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Pesquisar extends JDialog {


    public Pesquisar(Frame owner, String title) {
        super(owner, title);

        FlowLayout flow = new FlowLayout();
        getContentPane().setLayout(flow);

        setBounds(100,100, 350,300);

        JLabel jnome = new JLabel("Nome: ");
        JTextField txtNome = new JTextField(20);
        JButton btnPesquisar = new JButton("Pesquisar");
        btnPesquisar.setPreferredSize(new Dimension(250,40));
        JLabel jResult = new JLabel("Resultado Busca: ");

        getContentPane().add(jnome);
        getContentPane().add(txtNome);
        getContentPane().add(btnPesquisar);
        getContentPane().add(jResult);

        btnPesquisar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String nome = txtNome.getText();

                Menu janela = (Menu) owner;

                for (int i = 0; i < janela.ListaContatos.size(); i++){
                    if (janela.ListaContatos.get(i).getNome().equals(nome)){
                        jResult.setText(janela.ListaContatos.get(i).toString());
                        return;
                    }
                }
                jResult.setText("Não Encontrado");

            }
        });

        setVisible(true);








    }
}
