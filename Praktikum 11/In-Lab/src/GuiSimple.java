import java.awt.*;
import javax.swing.*;

public class GuiSimple extends JFrame {

    DefaultListModel<String> dlm;
    JList<String> jListItem;
    JTextField textField;
    JButton buttonAdd;

    public GuiSimple() {
        setTitle("Gui Simple");
        setSize(300,300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

        dlm = new DefaultListModel<>();

        jListItem = new JList<>(dlm);
        JScrollPane scroll = new JScrollPane(jListItem);

        textField = new JTextField(15);
        buttonAdd = new JButton("Add");

        add(scroll);
        add(textField);
        add(buttonAdd);

        buttonAdd.addActionListener(e -> {
            addItem(textField.getText());
            textField.setText("");
        });
    }

    private void addItem(String namaItem){
        dlm.addElement(namaItem);
    }

    public static void main(String[] args) {
        new GuiSimple().setVisible(true);
    }
}