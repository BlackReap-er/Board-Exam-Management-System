package Project;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JTextArea;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Login extends JFrame {

	private JPanel contentPane;
	private JPasswordField passwordField;
	private JTextField txtLogin;
	public static void main(String[] args) {
		String jdbcURL = "jdbc:postgresql://localhost:5432/Board Examination";
        String username = "postgres";
        String password = "snehasreechicku";
        try {
            Class.forName("org.postgresql.Driver");
        } catch (ClassNotFoundException e1) {
            // TODO Auto-generated catch block
            e1.printStackTrace();
        }
        try {
        Connection connection = DriverManager.getConnection(jdbcURL, username, password);
        System.out.print("Connected");
        }
        catch(SQLException e) {
        System.out.println("Error in connection");
        e.printStackTrace();
        }
        
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    Login frame = new Login();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login frame = new Login();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	public Login() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(204, 204, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JTextArea txtrEnterUsername = new JTextArea();
		txtrEnterUsername.setBounds(179, 83, 192, 22);
		contentPane.add(txtrEnterUsername);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(179, 133, 192, 20);
		contentPane.add(passwordField);
		
		JButton login_btn = new JButton("Login");
		login_btn.setFont(new Font("Times New Roman", Font.BOLD, 14));
		login_btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String uid = txtrEnterUsername.getText();
                String pass = passwordField.getText();
                if (uid.equals("AD001")&&pass.equals("admin"))
                {
                    JOptionPane.showMessageDialog(login_btn,"Login Successful");
                    AdminHome home = new AdminHome();
                    home.setVisible(true);
                }
                else if (uid.equals("ST001")&&pass.equals("student"))
                { 
                    JOptionPane.showMessageDialog(login_btn,"Login Successful");
                    StudentHome home = new StudentHome();
                    home.setVisible(true);
                }
                else if (uid.equals("SC001")&&pass.equals("school"))
                {
                    JOptionPane.showMessageDialog(login_btn,"Login Successful");
                    SchoolHome home = new SchoolHome();
                    home.setVisible(true);
                }
                else if (uid.equals("EX001")&&pass.equals("examiner"))
                {
                    JOptionPane.showMessageDialog(login_btn,"Login Successful");
                    ExaminerHome home = new ExaminerHome();
                    home.setVisible(true);
                }
                else
                {
                    JOptionPane.showMessageDialog(login_btn,"Invalid Username or Password");
                }
			}
			
		});
		login_btn.setBounds(243, 185, 89, 23);
		contentPane.add(login_btn);
		
		JButton sign_btn = new JButton("Sign Up");
		sign_btn.setFont(new Font("Times New Roman", Font.BOLD, 14));
		sign_btn.setForeground(new Color(0, 0, 0));
		sign_btn.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Register register = new Register();
                register.setVisible(true);
			}
		});
		sign_btn.setBounds(121, 185, 89, 23);
		contentPane.add(sign_btn);
		
		JLabel username_label = new JLabel("User ID ");
		username_label.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 15));
		username_label.setForeground(Color.BLACK);
		username_label.setBounds(97, 86, 83, 17);
		contentPane.add(username_label);
		
		JLabel password_label = new JLabel("Password");
		password_label.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 16));
		password_label.setForeground(Color.BLACK);
		password_label.setBounds(86, 134, 83, 17);
		contentPane.add(password_label);
		
		txtLogin = new JTextField();
		txtLogin.setHorizontalAlignment(SwingConstants.CENTER);
		txtLogin.setFont(new Font("Times New Roman", Font.BOLD, 17));
		txtLogin.setForeground(new Color(0, 0, 0));
		txtLogin.setText("LOGIN");
		txtLogin.setBounds(169, 24, 94, 23);
		contentPane.add(txtLogin);
		txtLogin.setColumns(10);
	}

}