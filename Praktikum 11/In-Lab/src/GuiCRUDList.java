import java.awt.*;
import javax.swing.*;

public class GuiCRUDList extends JFrame {

    DefaultListModel<String> dlm;
    JList<String> jListItem;
    JTextField jTextFieldItem;

    JButton jButtonAdd;
    JButton jButtonUpdate;
    JButton jButtonDelete;
    JButton jButtonClearAll;
    JButton jButtonInsertData;

    public GuiCRUDList() {

        setTitle("GUI CRUD LIST");
        setSize(400,300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

        dlm = new DefaultListModel<>();
        jListItem = new JList<>(dlm);

        JScrollPane scrollPane = new JScrollPane(jListItem);
        scrollPane.setPreferredSize(new Dimension(120,150));

        jTextFieldItem = new JTextField(15);

        jButtonAdd = new JButton("Add");
        jButtonUpdate = new JButton("Update");
        jButtonDelete = new JButton("Delete");
        jButtonClearAll = new JButton("Clear All");
        jButtonInsertData = new JButton("Insert Data");

        add(scrollPane);
        add(jTextFieldItem);

        add(jButtonAdd);
        add(jButtonUpdate);
        add(jButtonDelete);
        add(jButtonClearAll);
        add(jButtonInsertData);

        // ADD
        jButtonAdd.addActionListener(e -> {
            dlm.addElement(jTextFieldItem.getText());
            jTextFieldItem.setText("");
        });

        // DELETE
        jButtonDelete.addActionListener(e -> {
            int index = jListItem.getSelectedIndex();

            if(index != -1){
                dlm.removeElementAt(index);
            }

            jTextFieldItem.setText("");
        });

        // UPDATE
        jButtonUpdate.addActionListener(e -> {
            int index = jListItem.getSelectedIndex();

            if(index != -1){
                dlm.setElementAt(jTextFieldItem.getText(), index);
            }

            jTextFieldItem.setText("");
        });

        // CLEAR ALL
        jButtonClearAll.addActionListener(e -> {
            dlm.clear();
        });

        // INSERT DATA
        jButtonInsertData.addActionListener(e -> {

            String[] items = {
                "buku",
                "meja",
                "kursi",
                "tas",
                "pintu"
            };

            for(String item : items){
                dlm.addElement(item);
            }
        });
    }

    public static void main(String[] args) {
        new GuiCRUDList().setVisible(true);
    }
}