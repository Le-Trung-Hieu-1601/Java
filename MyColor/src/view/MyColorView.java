package view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import controller.ColorListener;
import model.MyColorModel;

public class MyColorView extends JFrame {
	private MyColorModel myColorView;
	private JLabel jLabel;

	public MyColorView() {
		this.myColorView = new MyColorModel();
		this.init();
		// TODO Auto-generated constructor stub
	}

	private void init() {
		this.setTitle("MyColor");
		// TODO Auto-generated method stub
		this.setSize(800, 600);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Font font_text = new Font("Arial", Font.BOLD, 100);
		ColorListener ac =new ColorListener(this);
		jLabel = new JLabel("TEXT .....");
		JPanel jPanel = new JPanel();
		jPanel.setLayout(new GridLayout(2, 3));
		Font font = new Font("Arial", Font.BOLD, 20);
		JButton jbutton_text_red = new JButton("Red Text");
        jbutton_text_red.addActionListener(ac);
		jbutton_text_red.setFont(font);
		jbutton_text_red.setForeground(Color.RED);

		JButton jbutton_text_yellow = new JButton("Yellow Text");
		jbutton_text_yellow.addActionListener(ac);
		jbutton_text_yellow.setFont(font);
		jbutton_text_yellow.setForeground(Color.YELLOW);
		JButton jbutton_text_green = new JButton("Green Text");
		jbutton_text_green.addActionListener(ac);
		jbutton_text_green.setFont(font);
		jbutton_text_green.setForeground(Color.GREEN);

		JButton jbutton_Background_red = new JButton("Red background");
		jbutton_Background_red.addActionListener(ac);
		jbutton_Background_red.setFont(font);
		jbutton_Background_red.setBackground(Color.RED);
		JButton jbutton_Background_yellow = new JButton("Yellow background");
		jbutton_Background_yellow.setFont(font);
		jbutton_Background_yellow.addActionListener(ac);
		jbutton_Background_yellow.setBackground(Color.YELLOW);
		JButton jbutton_Background_green = new JButton("Green background");
		jbutton_Background_green.setFont(font);
		jbutton_Background_green.setBackground(Color.GREEN);
		jbutton_Background_green.addActionListener(ac);
		jPanel.add(jbutton_text_red);
		jPanel.add(jbutton_text_yellow);
		jPanel.add(jbutton_text_green);
		jPanel.add(jbutton_Background_red);
		jPanel.add(jbutton_Background_yellow);
		jPanel.add(jbutton_Background_green);
        jLabel.setFont(font_text);
		this.setLayout(new BorderLayout());
		this.add(jLabel, BorderLayout.NORTH);
		this.add(jPanel, BorderLayout.CENTER);

		this.setVisible(true);

	}
	public void changeColorRed() {
		this.jLabel.setForeground(Color.RED);
	}
	public void changeColorYellow() {
		this.jLabel.setForeground(Color.YELLOW);
	}
	public void changeColorGreen() {
		this.jLabel.setForeground(Color.GREEN);
	}
	public void changeBackgroundColor(Color color) {
		this.jLabel.setBackground(color);
		this.jLabel.setOpaque(true);
	}
}
