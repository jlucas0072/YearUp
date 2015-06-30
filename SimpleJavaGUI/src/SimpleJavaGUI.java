import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class SimpleJavaGUI {

	private JFrame frame;
	private JTextField nameTextField;
	private JLabel ageLabel;
	private JTextField ageTextField;
	private JLabel studentLabel;
	private JButton whoButton;
	private static String s_whoAreYou = "Who are you?";
	private static String s_clearMe = "Clear me!";

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SimpleJavaGUI window = new SimpleJavaGUI();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public SimpleJavaGUI() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel NameLabel = new JLabel("My name is");
		NameLabel.setFont(new Font("Tahoma", Font.PLAIN, 16));
		NameLabel.setBounds(23, 23, 100, 38);
		frame.getContentPane().add(NameLabel);
		
		nameTextField = new JTextField();
		nameTextField.setBounds(144, 23, 200, 50);
		frame.getContentPane().add(nameTextField);
		nameTextField.setColumns(10);
		
		ageLabel = new JLabel("I am");
		ageLabel.setFont(new Font("Tahoma", Font.PLAIN, 16));
		ageLabel.setBounds(23, 107, 100, 33);
		frame.getContentPane().add(ageLabel);
		
		ageTextField = new JTextField();
		ageTextField.setBounds(146, 94, 200, 50);
		frame.getContentPane().add(ageTextField);
		ageTextField.setColumns(10);
		
		studentLabel = new JLabel("I am a student of  Year Up!");
		studentLabel.setFont(new Font("Tahoma", Font.PLAIN, 16));
		studentLabel.setHorizontalAlignment(SwingConstants.CENTER);
		studentLabel.setBounds(82, 155, 224, 50);
		frame.getContentPane().add(studentLabel);
		
		whoButton = new JButton("Who are you?");
		whoButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(whoButton.getText().equals(s_whoAreYou))
						{
							nameTextField.setText("Jordan Lucas");
						ageTextField.setText("23");
							whoButton.setText(s_clearMe);
						}
				else if (whoButton.getText().equals(s_clearMe))
				{
					nameTextField.setText("");
					ageTextField.setText("");
					whoButton.setText(s_whoAreYou);
				}
			}
		});
		whoButton.setBounds(92, 201, 200, 50);
		frame.getContentPane().add(whoButton);
	}
}
