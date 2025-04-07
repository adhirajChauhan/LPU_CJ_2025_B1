import java.awt.GridLayout;

import javax.swing.*;

class Contact{
    String name;
    String phone;

    Contact(String name, String phone){
        this.name = name;
        this.phone = phone;
    }

    String print(){
        return "Name : " + name + " Phone : " + phone;
    }
}

public class ContactBook {

    JFrame frame;
    JTextField namField, phoneField;
    JButton addButton;
    JTextArea displayArea;

    ContactBook(){
        frame = new JFrame("Contact App");
        frame.setSize(500,500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(4,1));
        frame.add(panel);

        namField = new JTextField();
        namField.setBorder(BorderFactory.createTitledBorder("Name"));
        panel.add(namField);

        phoneField = new JTextField();
        phoneField.setBorder(BorderFactory.createTitledBorder("Phone"));
        panel.add(phoneField);

        addButton = new JButton("Add Contact");
        panel.add(addButton);

        displayArea = new JTextArea();
        displayArea.setEditable(false);
        panel.add(displayArea);

        frame.setVisible(true);
    }



    public static void main(String[] args) {
        
        new ContactBook();
    }
}
