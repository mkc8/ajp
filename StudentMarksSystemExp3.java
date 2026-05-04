import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;

public class StudentMarksSystemExp3 extends Frame {

    JLabel l1, l2, l3, l4, l5, l6;
    JTextField tf1, tf2, tf3, tf4, tf5, tf6;
    JTextArea area2, area1;

    studentMarksSystem() {

        l1 = new JLabel("Student Marks");
        l1.setBounds(550, 100, 250, 20);

        l2 = new JLabel("Name of the Student:");
        l2.setBounds(50, 150, 250, 20);
        tf1 = new JTextField();
        tf1.setBounds(250, 150, 250, 20);

        l3 = new JLabel("Advanced Java:");
        l3.setBounds(50, 200, 250, 20);
        tf2 = new JTextField();
        tf2.setBounds(250, 200, 250, 20);

        l4 = new JLabel("Data Structure:");
        l4.setBounds(50, 250, 250, 20);
        tf3 = new JTextField();
        tf3.setBounds(250, 250, 250, 20);

        l5 = new JLabel("System programming:");
        l5.setBounds(50, 300, 250, 20);
        tf4 = new JTextField();
        tf4.setBounds(250, 300, 250, 20);

        l6 = new JLabel("Object Oriented programming:");
        l6.setBounds(50, 350, 250, 20);
        tf5 = new JTextField();
        tf5.setBounds(250, 350, 250, 20);

        JButton Receipt = new JButton("Generate Receipt");
        Receipt.setBounds(600, 490, 150, 30);

        JButton b2 = new JButton("Reset");
        b2.setBounds(750, 490, 150, 30);

        JButton Print = new JButton("Print");
        Print.setBounds(900, 490, 150, 30);

        area2 = new JTextArea();
        area2.setBounds(600, 540, 450, 240);

        add(l1); add(l2); add(l3); add(l4); add(l5); add(l6);
        add(tf1); add(tf2); add(tf3); add(tf4); add(tf5);
        add(area2); add(Receipt); add(b2); add(Print);

        // Reset functionality
        b2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                area2.setText("");
                tf1.setText("");
                tf2.setText("");
                tf3.setText("");
                tf4.setText("");
                tf5.setText("");
            }
        });

        // Print functionality
        Print.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    area2.print();
                } catch (Exception a) {
                    System.out.println("No Printer Found");
                }
            }
        });

        // Generate Receipt
        Receipt.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                area2.setText(
                    "-----------Report-----------\n");

                area2.append("Student Name: " + tf1.getText() + "\n");
                area2.append("Advanced Java: " + tf2.getText() + "\n");
                area2.append("Data Structure: " + tf3.getText() + "\n");
                area2.append("System programming: " + tf4.getText() + "\n");
                area2.append("OOP: " + tf5.getText() + "\n");

                try {
                    FileWriter fw = new FileWriter("java.txt", true);
                    fw.write(area2.getText());
                    fw.close();
                } catch (Exception ae) {
                    System.out.println(ae);
                }

                JOptionPane.showMessageDialog(area2, "DATA SAVED SUCCESSFULLY");
            }
        });

        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent we) {
                System.exit(0);
            }
        });

        setSize(800, 800);
        setLayout(null);
        setVisible(true);
        setBackground(Color.cyan);
    }

    public static void main(String[] args) {
        new studentMarksSystem();
    }
}
