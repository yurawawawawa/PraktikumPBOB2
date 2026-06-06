import java.awt.*;
import java.util.ArrayList;
import java.util.List;
import javax.swing.*;

public class GuiCollection extends JFrame {

    DefaultListModel<String> dlm;
    JList<String> jListItem;

    JTextField jTextFieldItem;

    JButton jButtonAdd;
    JButton jButtonUpdate;
    JButton jButtonDelete;
    JButton jButtonClearAll;
    JButton jButtonInsertData;
    JButton jButtonSaveData;

    JLabel jLabelJumlah;

    List<String> items = new ArrayList<>();

    public GuiCollection(){

        setTitle("GUI COLLECTION");
        setSize(500,350);
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
        jButtonSaveData = new JButton("Save Data");

        jLabelJumlah = new JLabel("Data tersimpan = 0");

        add(scrollPane);
        add(jLabelJumlah);

        add(jTextFieldItem);

        add(jButtonAdd);
        add(jButtonUpdate);
        add(jButtonDelete);
        add(jButtonClearAll);
        add(jButtonInsertData);
        add(jButtonSaveData);

        String[] datas = {
            "buku",
            "meja",
            "kursi",
            "tas",
            "pintu"
        };

        for(String data : datas){
            dlm.addElement(data);
        }

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

        // CLEAR
        jButtonClearAll.addActionListener(e -> {
            dlm.clear();
        });

        // SAVE DATA
        jButtonSaveData.addActionListener(e -> {

            items.clear();

            for(int i = 0; i < dlm.size(); i++){
                items.add(dlm.getElementAt(i));
            }

            updateJumlahData();
        });

        // INSERT DATA
        jButtonInsertData.addActionListener(e -> {

            for(String item : items){
                dlm.addElement(item);
            }
        });
    }

    private void updateJumlahData(){
        jLabelJumlah.setText(
            "Data tersimpan = " + items.size()
        );
    }

    public static void main(String[] args) {
        new GuiCollection().setVisible(true);
    }
}