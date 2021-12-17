package Project;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JTextArea;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class ExaminerPD extends JFrame {

    private JPanel contentPane;

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    ExaminerPD frame = new ExaminerPD();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    /**
     * Create the frame.
     */
    public ExaminerPD() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 450, 300);
        contentPane = new JPanel();
        contentPane.setBackground(new Color(204, 204, 255));
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);
        
        JLabel lblNewLabel = new JLabel("PERSONAL DETAILS");
        lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 16));
        lblNewLabel.setBounds(20, 11, 187, 29);
        contentPane.add(lblNewLabel);
        
        JLabel lblNewLabel_1 = new JLabel("Name :");
        lblNewLabel_1.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 14));
        lblNewLabel_1.setBounds(20, 51, 72, 22);
        contentPane.add(lblNewLabel_1);
        
        JLabel lblNewLabel_2 = new JLabel("Phone Number : ");
        lblNewLabel_2.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 14));
        lblNewLabel_2.setBounds(20, 112, 122, 22);
        contentPane.add(lblNewLabel_2);
        
        JLabel lblNewLabel_3 = new JLabel("Teachers ID :");
        lblNewLabel_3.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 14));
        lblNewLabel_3.setBounds(20, 84, 94, 17);
        contentPane.add(lblNewLabel_3);
        
        JButton btnNewButton = new JButton("BACK");
        btnNewButton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                ExaminerHome backhome = new ExaminerHome();
                backhome.setVisible(true);
            }
        });
        btnNewButton.setFont(new Font("Times New Roman", Font.BOLD, 13));
        btnNewButton.setBounds(321, 227, 89, 23);
        contentPane.add(btnNewButton);
        
        JLabel lblNewLabel_4 = new JLabel("Email :");
        lblNewLabel_4.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 14));
        lblNewLabel_4.setBounds(20, 145, 89, 22);
        contentPane.add(lblNewLabel_4);
        
        JTextArea textArea = new JTextArea();
        textArea.setBounds(74, 51, 139, 22);
        contentPane.add(textArea);
        
        JTextArea textArea_1 = new JTextArea();
        textArea_1.setBounds(109, 81, 104, 22);
        contentPane.add(textArea_1);
        
        JTextArea textArea_2 = new JTextArea();
        textArea_2.setBounds(129, 112, 127, 22);
        contentPane.add(textArea_2);
        
        JTextArea textArea_3 = new JTextArea();
        textArea_3.setBounds(69, 145, 161, 22);
        contentPane.add(textArea_3);
        
        JLabel lblNewLabel_5 = new JLabel("Address :");
        lblNewLabel_5.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 14));
        lblNewLabel_5.setBounds(20, 172, 72, 22);
        contentPane.add(lblNewLabel_5);
        
        JTextArea textArea_4 = new JTextArea();
        textArea_4.setBounds(79, 172, 177, 67);
        contentPane.add(textArea_4);
        
        JButton update_btn = new JButton("UPDATE");
        update_btn.setFont(new Font("Times New Roman", Font.BOLD, 14));
        update_btn.setBounds(321, 196, 89, 23);
        contentPane.add(update_btn);
    }
}