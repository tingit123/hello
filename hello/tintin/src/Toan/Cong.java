package Toan;

import java.awt.EventQueue;
import javax.swing.*;

public class Cong extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtSo1;
	private JTextField txtSo2;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Cong frame = new Cong();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public Cong() {
		setTitle("Máy tính đơn giản");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 500, 300);
		contentPane = new JPanel();
		contentPane.setLayout(null);
		setContentPane(contentPane);

		JLabel lblSo1 = new JLabel("Số thứ nhất:");
		lblSo1.setBounds(30, 30, 100, 25);
		contentPane.add(lblSo1);

		txtSo1 = new JTextField();
		txtSo1.setBounds(140, 30, 300, 25);
		contentPane.add(txtSo1);
		txtSo1.setColumns(10);

		JLabel lblSo2 = new JLabel("Số thứ hai:");
		lblSo2.setBounds(30, 70, 100, 25);
		contentPane.add(lblSo2);

		txtSo2 = new JTextField();
		txtSo2.setBounds(140, 70, 300, 25);
		contentPane.add(txtSo2);
		txtSo2.setColumns(10);
	}
}
