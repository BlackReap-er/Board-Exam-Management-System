package Project;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.SystemColor;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.Color;

public class StudentHome extends JFrame {

    private JPanel contentPane;

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    StudentHome frame = new StudentHome();
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
    public StudentHome() {
        setTitle("Home");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 450, 300);
        contentPane = new JPanel();
        contentPane.setBackground(new Color(204, 204, 255));
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);
        
        JLabel lblNewLabel = new JLabel("WELCOME STUDENT!");
        lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 20));
        lblNewLabel.setBounds(109, 40, 217, 20);
        contentPane.add(lblNewLabel);
        
        JButton btnNewButton = new JButton("Personal Details");
        btnNewButton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                StudentPD details = new StudentPD();
                details.setVisible(true);
            }
        });
        btnNewButton.setBackground(SystemColor.textInactiveText);
        btnNewButton.setFont(new Font("Times New Roman", Font.BOLD, 14));
        btnNewButton.setBounds(144, 88, 136, 25);
        contentPane.add(btnNewButton);
        
        JButton btnViewMarks = new JButton("View Marks");
        btnViewMarks.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                StudentMarks marks = new StudentMarks();
                marks.setVisible(true);
            }
        });
        btnViewMarks.setBackground(SystemColor.textInactiveText);
        btnViewMarks.setFont(new Font("Times New Roman", Font.BOLD, 14));
        btnViewMarks.setBounds(144, 123, 136, 25);
        contentPane.add(btnViewMarks);
        
        JButton btnExamSchedule = new JButton("Exam Schedule");
        btnExamSchedule.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                StudentSchedule schedule = new StudentSchedule();
                schedule.setVisible(true);
            }
        });
        btnExamSchedule.setBackground(SystemColor.textInactiveText);
        btnExamSchedule.setFont(new Font("Times New Roman", Font.BOLD, 14));
        btnExamSchedule.setBounds(144, 158, 136, 25);
        contentPane.add(btnExamSchedule);
        
        JButton btnExit = new JButton("Exit");
        btnExit.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                System.exit(0);
            }
        });
        btnExit.setFont(new Font("Times New Roman", Font.BOLD, 14));
        btnExit.setBackground(SystemColor.textInactiveText);
        btnExit.setBounds(325, 224, 101, 29);
        contentPane.add(btnExit);
    }

}