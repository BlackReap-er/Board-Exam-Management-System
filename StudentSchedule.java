package Project;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.SystemColor;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.Color;
import javax.swing.SwingConstants;

public class StudentSchedule extends JFrame {

    private JPanel contentPane;

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    StudentSchedule frame = new StudentSchedule();
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
    public StudentSchedule() {
        setTitle("Exam Schedule");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 450, 300);
        contentPane = new JPanel();
        contentPane.setBackground(new Color(204, 204, 255));
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);
        
        JLabel lblNewLabel = new JLabel("Exam Schedule");
        lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
        lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 20));
        lblNewLabel.setBounds(10, 10, 151, 24);
        contentPane.add(lblNewLabel);
        
        JLabel lblNewLabel_1 = new JLabel("English :");
        lblNewLabel_1.setFont(new Font("Times New Roman", Font.BOLD, 14));
        lblNewLabel_1.setBounds(10, 70, 58, 17);
        contentPane.add(lblNewLabel_1);
        
        JTextArea textArea = new JTextArea();
        textArea.setBounds(172, 70, 100, 17);
        contentPane.add(textArea);
        
        JLabel lblNewLabel_1_1 = new JLabel("Second Language :");
        lblNewLabel_1_1.setFont(new Font("Times New Roman", Font.BOLD, 14));
        lblNewLabel_1_1.setBounds(10, 97, 118, 17);
        contentPane.add(lblNewLabel_1_1);
        
        JTextArea textArea_1 = new JTextArea();
        textArea_1.setBounds(172, 97, 100, 17);
        contentPane.add(textArea_1);
        
        JLabel lblNewLabel_1_1_1 = new JLabel("Mathematics :");
        lblNewLabel_1_1_1.setFont(new Font("Times New Roman", Font.BOLD, 14));
        lblNewLabel_1_1_1.setBounds(10, 124, 118, 17);
        contentPane.add(lblNewLabel_1_1_1);
        
        JTextArea textArea_1_1 = new JTextArea();
        textArea_1_1.setBounds(172, 124, 100, 17);
        contentPane.add(textArea_1_1);
        
        JLabel lblNewLabel_1_1_1_1 = new JLabel("Science :");
        lblNewLabel_1_1_1_1.setFont(new Font("Times New Roman", Font.BOLD, 14));
        lblNewLabel_1_1_1_1.setBounds(10, 151, 118, 17);
        contentPane.add(lblNewLabel_1_1_1_1);
        
        JTextArea textArea_1_1_1 = new JTextArea();
        textArea_1_1_1.setBounds(172, 151, 100, 17);
        contentPane.add(textArea_1_1_1);
        
        JLabel lblNewLabel_1_1_1_1_1 = new JLabel("Social Science :");
        lblNewLabel_1_1_1_1_1.setFont(new Font("Times New Roman", Font.BOLD, 14));
        lblNewLabel_1_1_1_1_1.setBounds(10, 178, 118, 17);
        contentPane.add(lblNewLabel_1_1_1_1_1);
        
        JTextArea textArea_1_1_1_1 = new JTextArea();
        textArea_1_1_1_1.setBounds(172, 178, 100, 17);
        contentPane.add(textArea_1_1_1_1);
        
        JButton btnNewButton = new JButton("Back");
        btnNewButton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                StudentHome home = new StudentHome();
                home.setVisible(true);
            }
        });
        btnNewButton.setFont(new Font("Times New Roman", Font.BOLD, 14));
        btnNewButton.setBackground(SystemColor.textInactiveText);
        btnNewButton.setBounds(325, 224, 101, 29);
        contentPane.add(btnNewButton);
    }

}