package myGUI;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.Font;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class HoaDon_Gui extends JPanel {
	
	public HoaDon_Gui() {
//		JPANEL
		JPanel pnMain = new JPanel();
		pnMain.setLayout(new BorderLayout());

//		HEADER
		JPanel headPn = new JPanel();
		JLabel headLb = new JLabel("Lập Hóa Đơn");
		Font fo = new Font("Times New Roman", Font.BOLD, 24);
		headLb.setFont(fo);
		headLb.setForeground(Color.blue);
		headPn.add(headLb);
		
//		CENTER
		
		JPanel pnCenter = new JPanel();
		pnCenter.setLayout(new BoxLayout(pnCenter, BoxLayout.Y_AXIS));
		JPanel pnCenterTop = new JPanel();
		pnCenterTop.setLayout(new BoxLayout(pnCenterTop, BoxLayout.X_AXIS));
		JPanel pnCenterBot = new JPanel();
		pnCenterBot.setLayout(new BoxLayout(pnCenterBot, BoxLayout.Y_AXIS));

		Box boxNhap = Box.createHorizontalBox();

//		Mã Thuốc
		JLabel lbMaThuoc = new JLabel("Mã Thuốc: ");
		lbMaThuoc.setPreferredSize(new Dimension(90,0));
		JTextField tfMaThuoc = new JTextField(15);
		
		boxNhap.add(Box.createHorizontalStrut(30));
		boxNhap.add(lbMaThuoc);
		boxNhap.add(Box.createHorizontalStrut(10));
		boxNhap.add(tfMaThuoc);
		boxNhap.add(Box.createHorizontalStrut(30));
		
//		Số lượng
		JLabel lbSoLuong = new JLabel("Số lượng: ");
		lbSoLuong.setPreferredSize(lbMaThuoc.getPreferredSize());
		JTextField tfSoLuong = new JTextField(15);
		boxNhap.add(Box.createHorizontalStrut(30));
		boxNhap.add(lbSoLuong);
		boxNhap.add(Box.createHorizontalStrut(10));
		boxNhap.add(tfSoLuong);
		boxNhap.add(Box.createHorizontalStrut(30));
		
//		Ngày Lập
		JLabel lbNgayLap = new JLabel("Ngày Lập HD: ");
		lbNgayLap.setPreferredSize(lbMaThuoc.getPreferredSize());
		JTextField tfNgayLap = new JTextField(15);
		tfNgayLap.setEditable(false);
		boxNhap.add(Box.createHorizontalStrut(30));
		boxNhap.add(lbNgayLap);
		boxNhap.add(Box.createHorizontalStrut(10));
		boxNhap.add(tfNgayLap);
		boxNhap.add(Box.createHorizontalStrut(30));
		
//		BUTTON Thêm thuốc vào danh sách
		JButton btnThem = new JButton("Thêm");
		boxNhap.add(Box.createHorizontalStrut(30));
		boxNhap.add(btnThem);
		btnThem.setBackground(new Color(0,160,255));
		btnThem.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		boxNhap.add(Box.createHorizontalStrut(30));
		
		pnCenterTop.add(boxNhap);
		
//		TABLE
		Box boxTable = Box.createHorizontalBox();
		String[] headers = "Mã thuốc;Tên thuốc;Loại;Đơn vị;Số lượng;Ngày xuất đơn;Thành tiền".split(";");
		DefaultTableModel model = new DefaultTableModel(headers, 0);
		JTable table = new JTable(model);
		JScrollPane scroll = new JScrollPane();
		scroll.setViewportView(table = new JTable(model));
		scroll.setPreferredSize(new Dimension(getWidth(), 310));  //SET CHIỀU CAO TABLE
		table.setRowHeight(20);
		boxTable.add(Box.createHorizontalStrut(10));
		boxTable.add(scroll);
		boxTable.add(Box.createHorizontalStrut(10));
		pnCenterBot.add(boxTable);
		pnCenterBot.add(Box.createVerticalStrut(10));
		
//		TOTAL AND CREATE
		JPanel pnEndHD = new JPanel();
		pnEndHD.setLayout(new BoxLayout(pnEndHD, BoxLayout.X_AXIS));

		Box boxTong = Box.createHorizontalBox();
		
		JLabel lbTong = new JLabel("Tổng thành tiền:");
		lbTong.setPreferredSize(new Dimension(100,0));
		JTextField tfTong = new JTextField();
		tfTong.setPreferredSize(new Dimension(getWidth(), 30)); //SET ĐỘ RỘNG JTEXTFIELD
		tfTong.setEditable(false);
		boxTong.add(Box.createHorizontalStrut(30));
		boxTong.add(lbTong);
		boxTong.add(Box.createHorizontalStrut(10));
		boxTong.add(tfTong);
		boxTong.add(Box.createHorizontalStrut(50));
		
		JLabel lbMaHD = new JLabel("Mã Hóa Đơn:");
		lbTong.setPreferredSize(new Dimension(100,0));
		JTextField tfMaHD = new JTextField();
		boxTong.add(Box.createHorizontalStrut(30));
		boxTong.add(lbMaHD);
		boxTong.add(Box.createHorizontalStrut(10));
		boxTong.add(tfMaHD);
		boxTong.add(Box.createHorizontalStrut(50));
		
		pnEndHD.add(boxTong);
		
		pnCenter.add(Box.createVerticalStrut(10));
		pnCenter.add(pnCenterTop);
		pnCenter.add(Box.createVerticalStrut(10));
		pnCenter.add(pnCenterBot);
		pnCenter.add(pnEndHD);
		pnCenter.add(Box.createVerticalStrut(20));
		
//		BUTTON LẬP HÓA ĐƠN
		JPanel pnSouth = new JPanel();		
		JButton btnLap = new JButton("Lập hóa đơn");
		btnLap.setBackground(new Color(0,160,255));
		btnLap.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnLap.setPreferredSize(new Dimension(110,35));
		pnSouth.add(btnLap);
		
		
//		ADD TOP
		pnMain.add(headPn, BorderLayout.NORTH);
		pnMain.add(pnCenter, BorderLayout.CENTER);
		
//		ADD BUTTON
		pnMain.add(pnSouth, BorderLayout.SOUTH);
		
//		END
		add(pnMain);
	}
}
