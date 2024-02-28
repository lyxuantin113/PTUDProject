package myGUI;

import java.awt.*;
import java.awt.event.*;
import java.io.File;

import javax.swing.*;

public class ManHinh_GUI extends JFrame {

	final JMenuBar menuBar;
	private CardLayout cardLayout;
	private JPanel cardPanel;
	
	public static void main(String[] args) {
		new ManHinh_GUI();
	}
	
	public ManHinh_GUI() {
		super("Hệ Thống Quản Lý Hiệu Thuốc");
		setSize(1070, 600);
		setVisible(true);
		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setResizable(false);
		
		setJMenuBar(menuBar = new JMenuBar());		
		showMenu();		
		
//		Add vào card
		cardLayout = new CardLayout();
		cardPanel = new JPanel(cardLayout);
		
		cardPanel.add(new NhanVien_Gui(), "Quản Lý Nhân Viên");
		cardPanel.add(new KhachHang_Gui(), "Quản Lý Khách Hàng");
		cardPanel.add(new Thuoc_Gui(), "Quản Lý Thuốc");
		cardPanel.add(new HoaDon_Gui(), "Quản Lý Hóa Đơn");
		cardPanel.add(new DonDat_Gui(), "Quản Lý Đơn Đặt Thuốc");
		cardPanel.add(new ThongKeKetCa_Gui(), "Thống Kê Kết Ca");
		cardPanel.add(new XemThongKe_Gui(), "Xem Thống Kê");
		cardPanel.add(new TrangChu_Gui(), "Trang Chủ");
		
		setContentPane(cardPanel);
	}
	
	public void showMenu() {
		
//		Tạo Menu và Icon
		JMenu trangChuMenu = new JMenu("Trang Chủ");
		trangChuMenu.setPreferredSize(new Dimension(100, 50));
		ImageIcon iconTrangChu = new ImageIcon("src//Icon//home.png");
		Image imageTrangChu = iconTrangChu.getImage().getScaledInstance(25, 25, Image.SCALE_SMOOTH);
		iconTrangChu = new ImageIcon(imageTrangChu);
		trangChuMenu.setIcon(iconTrangChu);
		
		JMenu qlNhanVien = new JMenu("Quản Lý Nhân Viên");
		qlNhanVien.setPreferredSize(new Dimension(155, 50));
		ImageIcon iconNhanVien = new ImageIcon("src//Icon//nhanvien.png");
		Image imageNhanVien = iconNhanVien.getImage().getScaledInstance(25, 25, Image.SCALE_SMOOTH);
		iconNhanVien = new ImageIcon(imageNhanVien);
		qlNhanVien.setIcon(iconNhanVien);
		
		JMenu qlThuoc = new JMenu("Quản Lý Thuốc");
		qlThuoc.setPreferredSize(new Dimension(130, 50));
		ImageIcon iconThuoc = new ImageIcon("src//Icon//thuoc.png");
		Image imageThuoc = iconThuoc.getImage().getScaledInstance(25, 25, Image.SCALE_SMOOTH);
		iconThuoc = new ImageIcon(imageThuoc);
		qlThuoc.setIcon(iconThuoc);
		
		JMenu qlHoaDon = new JMenu("Quản Lý Hóa Đơn");
		qlHoaDon.setPreferredSize(new Dimension(145, 50));
		ImageIcon iconHoaDon = new ImageIcon("src//Icon//hoadon.png");
		Image imageHoaDon = iconHoaDon.getImage().getScaledInstance(25, 25, Image.SCALE_SMOOTH);
		iconHoaDon = new ImageIcon(imageHoaDon);
		qlHoaDon.setIcon(iconHoaDon);
		
		JMenu qlDonDat = new JMenu("Quản Lý Đơn Đặt Thuốc");
		qlDonDat.setPreferredSize(new Dimension(180, 50));
		ImageIcon iconDonDat = new ImageIcon("src//Icon//dathang.png");
		Image imageDonDat = iconDonDat.getImage().getScaledInstance(25, 25, Image.SCALE_SMOOTH);
		iconDonDat = new ImageIcon(imageDonDat);
		qlDonDat.setIcon(iconDonDat);
		
		JMenu qlKhachHang = new JMenu("Quản Lý Khách Hàng");
		qlKhachHang.setPreferredSize(new Dimension(165, 50));
		ImageIcon iconKH = new ImageIcon("src//Icon//khach.png");
		Image imageKH = iconKH.getImage().getScaledInstance(25, 25, Image.SCALE_SMOOTH);
		iconKH = new ImageIcon(imageKH);
		qlKhachHang.setIcon(iconKH);
		
		JMenu qlThongKe = new JMenu("<html><body>Quản Lý Thống Kê <b>&#x25BC;</b></body></html>");
		qlThongKe.setPreferredSize(new Dimension(160, 50));
		ImageIcon iconThongKe = new ImageIcon("src//Icon//thongke.png");
		Image imageThongKe = iconThongKe.getImage().getScaledInstance(25, 25, Image.SCALE_SMOOTH);
		iconThongKe = new ImageIcon(imageThongKe);
		qlThongKe.setIcon(iconThongKe);
		
//		Menu Item
		JMenuItem tkKetCa = new JMenuItem("Thống Kê Kết Ca");
		ImageIcon iconKetCa = new ImageIcon("src//Icon//ketca.png");
		Image imageKetCa = iconKetCa.getImage().getScaledInstance(35, 25, Image.SCALE_SMOOTH);
		iconKetCa = new ImageIcon(imageKetCa);
		tkKetCa.setIcon(iconKetCa);
		
		JMenuItem xemThongKe = new JMenuItem("Xem Thống Kê");
		ImageIcon iconXemTK = new ImageIcon("src//Icon//xemTK.png");
		Image imageXemTK = iconXemTK.getImage().getScaledInstance(35, 25, Image.SCALE_SMOOTH);
		iconXemTK = new ImageIcon(imageXemTK);
		xemThongKe.setIcon(iconXemTK);
		
//		add Menu Item
		qlThongKe.add(tkKetCa);
		tkKetCa.setPreferredSize(new Dimension(160, 50));
		
		qlThongKe.add(xemThongKe);
		xemThongKe.setPreferredSize(new Dimension(160, 50));
		
//		Set Phím Tắt
		trangChuMenu.setMnemonic(KeyEvent.VK_A);
		qlNhanVien.setMnemonic(KeyEvent.VK_N);
		qlKhachHang.setMnemonic(KeyEvent.VK_K);
		qlHoaDon.setMnemonic(KeyEvent.VK_H);
		qlDonDat.setMnemonic(KeyEvent.VK_D);
		qlThuoc.setMnemonic(KeyEvent.VK_T);
		tkKetCa.setMnemonic(KeyEvent.VK_E); //End
		xemThongKe.setMnemonic(KeyEvent.VK_X);

//		ADD JMENU
		menuBar.add(trangChuMenu);
		menuBar.add(new JLabel("|"));
		menuBar.add(qlNhanVien);
		menuBar.add(new JLabel("|"));
		menuBar.add(qlThuoc);
		menuBar.add(new JLabel("|"));
		menuBar.add(qlHoaDon);
		menuBar.add(new JLabel("|"));
		menuBar.add(qlDonDat);
		menuBar.add(new JLabel("|"));
		menuBar.add(qlKhachHang);
		menuBar.add(new JLabel("|"));
		menuBar.add(qlThongKe);	
		
//		END MENU

//		MOUSE EVENT
		trangChuMenu.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				cardLayout.show(cardPanel, "Trang Chủ");
			}
		});
		
		qlNhanVien.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				cardLayout.show(cardPanel, "Quản Lý Nhân Viên");
			}
		});
		
		qlKhachHang.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				cardLayout.show(cardPanel, "Quản Lý Khách Hàng");
			}
		});
		
		qlDonDat.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				cardLayout.show(cardPanel, "Quản Lý Đơn Đặt Thuốc");
			}
		});
		
		qlHoaDon.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				cardLayout.show(cardPanel, "Quản Lý Hóa Đơn");
			}
		});
		
		qlThuoc.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				cardLayout.show(cardPanel, "Quản Lý Thuốc");
			}
		});
		
		tkKetCa.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				cardLayout.show(cardPanel, "Thống Kê Kết Ca");
			}
		});
		
		xemThongKe.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				cardLayout.show(cardPanel, "Xem Thống Kê");
			}
		});
		
//		END
		setJMenuBar(menuBar);
		setVisible(true);
	}
}
