package Chat2;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class chat_client {

	private JFrame frame;
	private JTextField msg_text;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					chat_client window = new chat_client();
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
	public chat_client() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame("Client");
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JTextArea msg_area = new JTextArea();
		msg_area.setBounds(10, 11, 414, 192);
		frame.getContentPane().add(msg_area);
		
		msg_text = new JTextField();
		msg_text.setBounds(10, 214, 309, 36);
		frame.getContentPane().add(msg_text);
		msg_text.setColumns(10);
		
		JButton msg_send = new JButton("Send");
		msg_send.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		msg_send.setBounds(329, 214, 95, 36);
		frame.getContentPane().add(msg_send);
	}

}
