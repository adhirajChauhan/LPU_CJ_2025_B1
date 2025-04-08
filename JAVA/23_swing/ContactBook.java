import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

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

    ArrayList<Contact> contacts = new ArrayList<>();

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
        displayArea.setBorder(BorderFactory.createTitledBorder("Contacts"));
        panel.add(displayArea);

        //Add button click functionality
        addButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String name = namField.getText();
                String phone = phoneField.getText();

                if(!name.isEmpty() && !phone.isEmpty()){
                    Contact newContact = new Contact(name, phone);

                    contacts.add(newContact);
                    namField.setText("");
                    phoneField.setText("");
    
                    updateDisplay();
                }
                else{
                    JOptionPane.showMessageDialog(panel, "Please fill empty feilds");
                }



            }
            
        });

        frame.setVisible(true);
    }

    void updateDisplay(){
        StringBuilder sb = new StringBuilder();

        for(Contact c : contacts){
            sb.append(c.print() + "\n");

        }

        displayArea.setText(sb.toString());

    }

    public static void main(String[] args) {
        
        new ContactBook();
    }
}
