package pheptoan;

import java.awt.EventQueue;
import javax.swing.*;
import java.awt.event.*;
import java.awt.Font;

public class Cong extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtSo1;
	private JTextField txtSo2;
	private JTextField txtKetQua;

	public static void main(String[] args) {
		EventQueue.invokeLater(() -> {
			try {
				Cong frame = new Cong();
				frame.setVisible(true);
			} catch (Exception e) {
				e.printStackTrace();
			}
		});
	}

	public Cong() {
		setTitle("Máy tính cộng tự động");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 500, 250);
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

		// Khi nhấn Enter trong txtSo2 -> tự động tính
		txtSo2.addActionListener(e -> tinhCong());

		// Nút Tính
		JButton btnTinh = new JButton("Tính");
		btnTinh.setBounds(190, 110, 100, 30);
		contentPane.add(btnTinh);
		btnTinh.addActionListener(e -> tinhCong());

		JLabel lblKetQua = new JLabel("Kết quả:");
		lblKetQua.setBounds(30, 160, 100, 25);
		contentPane.add(lblKetQua);

		txtKetQua = new JTextField();
		txtKetQua.setFont(new Font("Tahoma", Font.BOLD, 14));
		txtKetQua.setBounds(140, 160, 300, 30);
		txtKetQua.setEditable(false);
		contentPane.add(txtKetQua);
	}

	private void tinhCong() {
		try {
			double so1 = Double.parseDouble(txtSo1.getText());
			double so2 = Double.parseDouble(txtSo2.getText());
			double ketQua = so1 + so2;
			txtKetQua.setText(String.valueOf(ketQua));
		} catch (NumberFormatException e) {
			txtKetQua.setText("Vui lòng nhập số hợp lệ");
		}
	}
}
