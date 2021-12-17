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
import javax.swing.JTextPane;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class SchoolHome extends JFrame {

    private JPanel contentPane;
    private JTextField txtHome;

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    SchoolHome frame = new SchoolHome();
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
    public SchoolHome() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 450, 300);
        contentPane = new JPanel();
        contentPane.setBackground(new Color(204, 204, 255));
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);
        
        txtHome = new JTextField();
        txtHome.setHorizontalAlignment(SwingConstants.CENTER);
        txtHome.setFont(new Font("Tahoma", Font.BOLD, 18));
        txtHome.setText("HOME");
        txtHome.setBounds(136, 33, 162, 39);
        contentPane.add(txtHome);
        txtHome.setColumns(10);
        
        JLabel lblNewLabel = new JLabel("Welcome to the main page!");
        lblNewLabel.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 14));
        lblNewLabel.setForeground(new Color(0, 0, 0));
        lblNewLabel.setBounds(136, 90, 199, 33);
        contentPane.add(lblNewLabel);
        
        JButton btnNewButton = new JButton("Student Schedule");
        btnNewButton.setFont(new Font("Times New Roman", Font.BOLD, 13));
        btnNewButton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                SchoolStudSchedule s = new SchoolStudSchedule();
                s.setVisible(true);
            }
        });
        btnNewButton.setBounds(32, 133, 137, 33);
        contentPane.add(btnNewButton);
        
        JButton btnNewButton_1 = new JButton("Examiner Schedule");
        btnNewButton_1.setFont(new Font("Times New Roman", Font.BOLD, 13));
        btnNewButton_1.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                SchoolExaminerSchedule exam = new SchoolExaminerSchedule();
                exam.setVisible(true);
            }
        });
        btnNewButton_1.setBounds(32, 176, 162, 33);
        contentPane.add(btnNewButton_1);
        
        JButton btnNewButton_2 = new JButton("EXIT");
        btnNewButton_2.setFont(new Font("Times New Roman", Font.BOLD, 14));
        btnNewButton_2.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                System.exit(0);
            }
        });
        btnNewButton_2.setBounds(32, 219, 88, 34);
        contentPane.add(btnNewButton_2);
    }
}
