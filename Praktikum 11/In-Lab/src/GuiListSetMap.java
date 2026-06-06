import javax.swing.*;
import java.awt.*;
import java.util.*;

public class GuiListSetMap extends JFrame {

    DefaultListModel<String> dlm;
    JList<String> jListItem;

    JTextField jTextFieldItem;

    JButton btnAdd;
    JButton btnUpdate;
    JButton btnDelete;
    JButton btnClearAll;

    JButton btnSaveList;
    JButton btnInsertList;

    JButton btnSaveSet;
    JButton btnInsertSet;

    JButton btnSaveMap;
    JButton btnInsertMap;

    JLabel labelList;
    JLabel labelSet;
    JLabel labelMap;

    List<String> listData = new ArrayList<>();
    Set<String> setData = new HashSet<>();
    Map<Integer, String> mapData = new HashMap<>();

    public GuiListSetMap() {

        setTitle("GUI LIST SET MAP");
        setSize(700, 400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

        dlm = new DefaultListModel<>();

        jListItem = new JList<>(dlm);

        JScrollPane scrollPane = new JScrollPane(jListItem);
        scrollPane.setPreferredSize(new Dimension(150, 200));

        jTextFieldItem = new JTextField(15);

        btnAdd = new JButton("Add");
        btnUpdate = new JButton("Update");
        btnDelete = new JButton("Delete");
        btnClearAll = new JButton("Clear All");

        btnSaveList = new JButton("Save to List");
        btnInsertList = new JButton("Insert List");

        btnSaveSet = new JButton("Save to Set");
        btnInsertSet = new JButton("Insert Set");

        btnSaveMap = new JButton("Save to Map");
        btnInsertMap = new JButton("Insert Map");

        labelList = new JLabel("List = 0");
        labelSet = new JLabel("Set = 0");
        labelMap = new JLabel("Map = 0");

        add(scrollPane);

        add(btnSaveList);
        add(btnInsertList);
        add(labelList);

        add(btnSaveSet);
        add(btnInsertSet);
        add(labelSet);

        add(btnSaveMap);
        add(btnInsertMap);
        add(labelMap);

        add(jTextFieldItem);

        add(btnAdd);
        add(btnUpdate);
        add(btnDelete);
        add(btnClearAll);

        String[] datas = {
            "buku",
            "meja",
            "kursi",
            "tas",
            "pintu"
        };

        for (String data : datas) {
            dlm.addElement(data);
        }

        // ADD
        btnAdd.addActionListener(e -> {
            dlm.addElement(jTextFieldItem.getText());
            jTextFieldItem.setText("");
        });

        // UPDATE
        btnUpdate.addActionListener(e -> {

            int index = jListItem.getSelectedIndex();

            if (index != -1) {
                dlm.setElementAt(jTextFieldItem.getText(), index);
            }

            jTextFieldItem.setText("");
        });

        // DELETE
        btnDelete.addActionListener(e -> {

            int index = jListItem.getSelectedIndex();

            if (index != -1) {
                dlm.removeElementAt(index);
            }

            jTextFieldItem.setText("");
        });

        // CLEAR
        btnClearAll.addActionListener(e -> {
            dlm.clear();
        });

        // SAVE LIST
        btnSaveList.addActionListener(e -> {

            listData.clear();

            for (int i = 0; i < dlm.size(); i++) {
                listData.add(dlm.get(i));
            }

            labelList.setText(
                "List = " + listData.size()
            );
        });

        // INSERT LIST
        btnInsertList.addActionListener(e -> {

            for (String item : listData) {
                dlm.addElement(item);
            }
        });

        // SAVE SET
        btnSaveSet.addActionListener(e -> {

            setData.clear();

            for (int i = 0; i < dlm.size(); i++) {
                setData.add(dlm.get(i));
            }

            labelSet.setText(
                "Set = " + setData.size()
            );
        });

        // INSERT SET
        btnInsertSet.addActionListener(e -> {

            for (String item : setData) {
                dlm.addElement(item);
            }
        });

        // SAVE MAP
        btnSaveMap.addActionListener(e -> {

            mapData.clear();

            for (int i = 0; i < dlm.size(); i++) {
                mapData.put(i, dlm.get(i));
            }

            labelMap.setText(
                "Map = " + mapData.size()
            );
        });

        // INSERT MAP
        btnInsertMap.addActionListener(e -> {

            for (String item : mapData.values()) {
                dlm.addElement(item);
            }
        });
    }

    public static void main(String[] args) {
        new GuiListSetMap().setVisible(true);
    }
}