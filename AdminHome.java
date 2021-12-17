package Project;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class AdminHome extends JFrame {

    private JPanel contentPane;
    private JTextField txtHome;
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    AdminHome frame = new AdminHome();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }
    public AdminHome() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 450, 300);
        contentPane = new JPanel();
        contentPane.setBackground(new Color(204, 204, 255));
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);
        
        txtHome = new JTextField();
        txtHome.setHorizontalAlignment(SwingConstants.CENTER);
        txtHome.setFont(new Font("Verdana", Font.BOLD, 16));
        txtHome.setText("HOME");
        txtHome.setBounds(79, 24, 282, 33);
        contentPane.add(txtHome);
        txtHome.setColumns(10);
        
        JLabel welcome_label = new JLabel("Welcome to the main page!");
        welcome_label.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 12));
        welcome_label.setHorizontalAlignment(SwingConstants.CENTER);
        welcome_label.setForeground(Color.BLACK);
        welcome_label.setBounds(99, 68, 243, 27);
        contentPane.add(welcome_label);
        
        JButton stud_btn = new JButton("Student");
        stud_btn.setFont(new Font("Times New Roman", Font.BOLD, 14));
        stud_btn.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                StudentPD details = new StudentPD();
                details.setVisible(true);
            }
        });
        stud_btn.setBounds(10, 111, 148, 27);
        contentPane.add(stud_btn);
        
        JButton examiner_btn = new JButton("Examiner");
        examiner_btn.setFont(new Font("Times New Roman", Font.BOLD, 13));
        examiner_btn.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                ExaminerPD schedule = new ExaminerPD();
                schedule.setVisible(true);
            }
        });
        examiner_btn.setBounds(10, 154, 148, 27);
        contentPane.add(examiner_btn);
        
        JButton exit_btn = new JButton("EXIT");
        exit_btn.setFont(new Font("Times New Roman", Font.BOLD, 14));
        exit_btn.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                System.exit(EXIT_ON_CLOSE);
            }
        });
        exit_btn.setBounds(319, 227, 105, 23);
        contentPane.add(exit_btn);
        
        JButton school_btn = new JButton("School");
        school_btn.setFont(new Font("Times New Roman", Font.BOLD, 13));
        school_btn.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                SchoolStudSchedule schedule = new SchoolStudSchedule();
                schedule.setVisible(true);
            }
        });
        school_btn.setBounds(10, 192, 148, 27);
        contentPane.add(school_btn);
    }

}