

import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.*;

public class GameClient extends JFrame{
	GamePanel panel2 = new GamePanel(10);
	JButton button1 = new JButton("Try again"); //重来一局
	JButton button2 = new JButton("Exit");//退出
	static JTextField textField = new JTextField(10);

	public GameClient(){
		JLabel label1 = new JLabel("elimination blocks");//已消去方块数量
		JPanel panel = new JPanel(new BorderLayout());
		JPanel panel3 = new JPanel(new BorderLayout());
		textField.setEditable(false);

		panel2.setLayout(new BorderLayout());
		panel.setLayout(new FlowLayout());
		panel.add(label1);
		panel.add(textField);
		panel.add(button1);
		panel.add(button2);
		this.getContentPane().setLayout(new BorderLayout());
		this.getContentPane().add(panel,BorderLayout.SOUTH);
		this.getContentPane().add(panel2,BorderLayout.CENTER);
		this.getContentPane().add(panel3,BorderLayout.SOUTH);
		this.setSize(900,800);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setTitle("JavaGame");//连连看游戏
		this.setVisible(true);
		button1.setEnabled(true);
		button2.setEnabled(true);

		button1.addMouseListener(new MouseAdapter(){
			public void mouseClicked(MouseEvent e){
				textField.setText("0");
				panel2.beginNewGame();
			}
		});

		button2.addMouseListener(new MouseAdapter(){
			public void mouseClicked(MouseEvent e){
				System.exit(0);
			}
		});
	}


	public static void main(String[] args) {
		new GameClient();
	}

}
