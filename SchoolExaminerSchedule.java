package Project;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JScrollPane;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.SwingConstants;

public class SchoolExaminerSchedule extends JFrame {

    private JPanel contentPane;
    private JTextField txtExaminerSchedule;
    private JScrollPane scrollPane;
    private JTable table;

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    SchoolExaminerSchedule frame = new SchoolExaminerSchedule();
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
    public SchoolExaminerSchedule() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 450, 300);
        contentPane = new JPanel();
        contentPane.setBackground(new Color(204, 204, 255));
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);
        
        txtExaminerSchedule = new JTextField();
        txtExaminerSchedule.setHorizontalAlignment(SwingConstants.CENTER);
        txtExaminerSchedule.setFont(new Font("Times New Roman", Font.BOLD, 17));
        txtExaminerSchedule.setText("INVIGILATION");
        txtExaminerSchedule.setBounds(141, 21, 176, 27);
        contentPane.add(txtExaminerSchedule);
        txtExaminerSchedule.setColumns(10);
        
        JButton btnNewButton = new JButton("Back");
        btnNewButton.setFont(new Font("Times New Roman", Font.BOLD, 14));
        btnNewButton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                SchoolHome home = new SchoolHome();
                home.setVisible(true);
            }
        });
        btnNewButton.setBounds(32, 214, 84, 21);
        contentPane.add(btnNewButton);
        
        scrollPane = new JScrollPane();
        scrollPane.setBounds(32, 68, 377, 124);
        contentPane.add(scrollPane);
        
        table = new JTable();
        table.setBackground(Color.LIGHT_GRAY);
        table.setModel(new DefaultTableModel(
            new Object[][] {
                {null, null},
                {null, null},
            },
            new String[] {
                "Examiner ID", "Date of Exam"
            }
        ));
        scrollPane.setViewportView(table);
    }

}