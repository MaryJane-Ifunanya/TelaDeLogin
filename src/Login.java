
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.Font;
import javax.swing.ImageIcon;

public class Login extends JFrame {

	private JPanel contentPane;
	private JTextField usuario;
	private JPasswordField senha;
	private JLabel lblNewLabel_2;
	private JLabel lblNewLabel_3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
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

	/**
	 * Create the frame.
	 */
	public Login() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(Color.GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		usuario = new JTextField();
		usuario.setText(" ");
		usuario.setBounds(134, 86, 219, 27);
		contentPane.add(usuario);
		usuario.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Usu\u00E1rio:");
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setBounds(48, 92, 57, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Senha:");
		lblNewLabel_1.setForeground(Color.WHITE);
		lblNewLabel_1.setBounds(48, 144, 46, 14);
		contentPane.add(lblNewLabel_1);
		
		senha = new JPasswordField();
		senha.setBounds(134, 138, 219, 27);
		contentPane.add(senha);
		
		
		JButton btnNewButton_1 = new JButton("Entrar");
		btnNewButton_1.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				if(usuario.getText().equals("ibm123") && senha.getText().equals("1234")) {
					JOptionPane.showMessageDialog(null,"Acesso Permitido!" );
				}else {
					JOptionPane.showMessageDialog(null, "Acesso Negado! (Senha IncorretaS)");
					}
				}
		});
		btnNewButton_1.setForeground(Color.WHITE);
		btnNewButton_1.setBackground(Color.BLUE);
		btnNewButton_1.setBounds(196, 190, 103, 23);
		contentPane.add(btnNewButton_1);
		
		lblNewLabel_2 = new JLabel("Bem vindo(a) ao sistema.");
		lblNewLabel_2.setForeground(Color.WHITE);
		lblNewLabel_2.setFont(new Font("Times New Roman", Font.BOLD, 25));
		lblNewLabel_2.setBounds(111, 36, 272, 27);
		contentPane.add(lblNewLabel_2);
		
		lblNewLabel_3 = new JLabel("imagem");
		lblNewLabel_3.setIcon(new ImageIcon("C:\\Users\\user\\Downloads\\painel-login.png"));
		lblNewLabel_3.setBounds(-50, 0, 501, 261);
		contentPane.add(lblNewLabel_3);
	}
}