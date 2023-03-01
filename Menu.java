import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class Menu extends JFrame {

    public ArrayList<Contato> ListaContatos = new ArrayList<Contato>();

    public Menu() {

        setTitle("lista de contatos");
        setSize(400, 300);

        JMenuBar menuBar = new JMenuBar();
        setJMenuBar(menuBar);

        JMenu fileMenu = new JMenu("Arquivo");
        menuBar.add(fileMenu);

        JMenuItem exitAction = new JMenuItem("Sair");
        fileMenu.add(exitAction);

        exitAction.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Tamanho: " + ListaContatos.size());
                System.exit(0);
            }
        });


        JMenu editMenu = new JMenu("Contato");
        menuBar.add(editMenu);
        JMenuItem addAction = new JMenuItem("Adicionar");
        JMenuItem searchAction= new JMenuItem("Pesquisar");
        JMenuItem listAction = new JMenuItem("Listar");
        editMenu.add(addAction);
        editMenu.add(searchAction);
        editMenu.add(listAction);

        addAction.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                AddContatos jnlAddContatos = new AddContatos(Menu.this,"Contatos");
            }
        });

        listAction.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ListContatos jnlListContatos = new ListContatos(Menu.this,"Contatos");
            }
        });


        searchAction.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Pesquisar janelaPesquisa = new Pesquisar(Menu.this, "Pesquisar");
            }
        });

        JMenu ajudaMenu = new JMenu("Ajuda");
        menuBar.add(ajudaMenu);
        JMenuItem aboutAction = new JMenuItem("Sobre");
        ajudaMenu.add(aboutAction);

        aboutAction.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Sobre jnlAjuda = new Sobre(Menu.this,"Sobre");
            }
        });

        setVisible(true);
    }
}