import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AddContatos extends JDialog {

    public AddContatos(Frame owner, String title) {
        super(owner, title);
        FlowLayout flow = new FlowLayout();
        getContentPane().setLayout(flow);

        setBounds(100,100, 350,300);

        JLabel jnome = new JLabel("Nome: ");
        JTextField txtNome = new JTextField(20);
        JLabel jsobrenome = new JLabel("Sobrenome: ");
        JTextField txtSobrenome = new JTextField(20);
        JLabel jTelefone = new JLabel("Telefone: ");
        JTextField txtTelefone = new JTextField(20);
        JLabel jemail = new JLabel("e-mail: ");
        JTextField txtEmail = new JTextField(20);

        JButton btnSalvar = new JButton("Salvar");
        JButton btnCancelar = new JButton("Cancelar");


        getContentPane().add(jnome);
        getContentPane().add(txtNome);
        getContentPane().add(jsobrenome);
        getContentPane().add(txtSobrenome);
        getContentPane().add(jTelefone);
        getContentPane().add(txtTelefone);
        getContentPane().add(jemail);
        getContentPane().add(txtEmail);
        getContentPane().add(btnSalvar);
        getContentPane().add(btnCancelar);

        btnCancelar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
            }
        });


        btnSalvar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String nome = txtNome.getText();
                String sobreNome = txtSobrenome.getText();
                String telefone = txtTelefone.getText();
                String email = txtEmail.getText();

                Contato objNovo = new Contato(nome, sobreNome, email, telefone);

                Menu janelaPrincipal = (Menu) owner;
                janelaPrincipal.ListaContatos.add(objNovo);

                txtNome.setText("");
                txtSobrenome.setText("");
                txtEmail.setText("");
                txtTelefone.setText("");
            }
        });

        setVisible(true);
    }
}
