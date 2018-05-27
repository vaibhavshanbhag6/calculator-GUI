
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class CalculatorFrame extends JFrame {

	private JPanel contentPane;
	private JTextField txtText;
	private JButton button_10,button_13;
	private Calculation c;
	private int flag;
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CalculatorFrame frame = new CalculatorFrame();
					frame.setVisible(true);
					frame.setTitle("calculator");
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	
	public CalculatorFrame() {
		c=new Calculation();
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 329, 382);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		this.setMaximizedBounds(getBounds());
		
		txtText = new JTextField();
		txtText.setFont(new Font("Tahoma", Font.BOLD, 39));
		txtText.setBounds(10, 21, 293, 48);
		contentPane.add(txtText);
		txtText.setColumns(10);
		txtText.setEditable(false);
		
		
		JButton button = new JButton("1");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				txtText.setText(txtText.getText()+"1");
			}
		});
		
		button.setFont(new Font("Tahoma", Font.BOLD, 15));
		button.setBounds(10, 245, 70, 40);
		contentPane.add(button);
		
		JButton button_1 = new JButton("2");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				txtText.setText(txtText.getText()+"2");
			}
		});
		button_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		button_1.setBounds(90, 245, 70, 40);
		contentPane.add(button_1);
		
		JButton button_2 = new JButton("3");
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				txtText.setText(txtText.getText()+"3");
			}
		});
		button_2.setFont(new Font("Tahoma", Font.BOLD, 15));
		button_2.setBounds(170, 245, 70, 40);
		contentPane.add(button_2);
		
		JButton button_3 = new JButton("4");
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				txtText.setText(txtText.getText()+"4");
			}
		});
		button_3.setFont(new Font("Tahoma", Font.BOLD, 15));
		button_3.setBounds(10, 194, 70, 40);
		contentPane.add(button_3);
		
		JButton button_4 = new JButton("5");
		button_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				txtText.setText(txtText.getText()+"5");
			}
		});
		button_4.setFont(new Font("Tahoma", Font.BOLD, 15));
		button_4.setBounds(90, 194, 70, 40);
		contentPane.add(button_4);
		
		JButton button_5 = new JButton("6");
		button_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				txtText.setText(txtText.getText()+"6");
			}
		});
		button_5.setFont(new Font("Tahoma", Font.BOLD, 15));
		button_5.setBounds(170, 194, 70, 40);
		contentPane.add(button_5);
		
		JButton button_6 = new JButton("7");
		button_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				txtText.setText(txtText.getText()+"7");
			}
		});
		button_6.setFont(new Font("Tahoma", Font.BOLD, 15));
		button_6.setBounds(10, 143, 70, 40);
		contentPane.add(button_6);
		
		JButton button_7 = new JButton("8");
		button_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				txtText.setText(txtText.getText()+"8");
			}
		});
		button_7.setFont(new Font("Tahoma", Font.BOLD, 15));
		button_7.setBounds(90, 143, 70, 40);
		contentPane.add(button_7);
		
		JButton button_8 = new JButton("9");
		button_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				txtText.setText(txtText.getText()+"9");
			}
		});
		button_8.setFont(new Font("Tahoma", Font.BOLD, 15));
		button_8.setBounds(170, 143, 70, 40);
		contentPane.add(button_8);
		
		JButton button_9 = new JButton("0");
		button_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				txtText.setText(txtText.getText()+"0");
				
			}
		});
		button_9.setFont(new Font("Tahoma", Font.BOLD, 15));
		button_9.setBounds(10, 296, 150, 40);
		contentPane.add(button_9);
		
		button_10 = new JButton(".");
		button_10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				txtText.setText(txtText.getText()+".");
				button_10.setEnabled(false);
			}
		});
		
		button_10.setFont(new Font("Tahoma", Font.BOLD, 15));
		button_10.setBounds(170, 296, 70, 40);
		contentPane.add(button_10);
		
		JButton button_11 = new JButton("=");
		button_11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(flag==1)
				{
					
					c.setSum(Double.parseDouble(txtText.getText()));
				}
				if(flag==2)
					{
					c.setSubtraction(c.getAns(),Double.parseDouble(txtText.getText()));
					}
				if(flag==3)
				{
					c.setProduct(Double.parseDouble(txtText.getText()));
					
				}
				if(flag==4)
				{
					c.setDivision(2,Double.parseDouble(txtText.getText()));
					
				}

				flag=0;
				txtText.setText(""+c.getAns());
				c.setAns(0);
				button_10.setEnabled(true);
			}
		});
		button_11.setFont(new Font("Tahoma", Font.BOLD, 19));
		button_11.setBounds(250, 245, 53, 91);
		contentPane.add(button_11);
		
		JButton button_12 = new JButton("+");
		button_12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(flag!=0)
				{
					if(flag==1)
					{
						c.setSum(Double.parseDouble(txtText.getText()));
						txtText.setText("");
					}
					if(flag==2)
					{
						c.setSubtraction(c.getAns(),Double.parseDouble(txtText.getText()));
						txtText.setText("");
					}
					if(flag==3)
					{
						c.setProduct(Double.parseDouble(txtText.getText()));
						txtText.setText("");
					}
					if(flag==4)
					{
						c.setDivision(2,Double.parseDouble(txtText.getText()));
						txtText.setText("");
					}
				
				
			   flag=1;
			
			   c.setSum(Double.parseDouble(txtText.getText()));
			   }
				if(flag==0)
				{
				flag=1;
				c.setSum(Double.parseDouble(txtText.getText()));
				txtText.setText("");
				}
				button_10.setEnabled(true);
			}
			
		});
		button_12.setFont(new Font("Tahoma", Font.BOLD, 15));
		button_12.setBounds(250, 194, 53, 40);
		contentPane.add(button_12);
		
		button_13 = new JButton("-");
		button_13.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				if("".equals(txtText.getText()))
					txtText.setText("-");
				else
				{
					if(flag!=0)
					{
						if(flag==1)
						{
							c.setSum(Double.parseDouble(txtText.getText()));
							txtText.setText("");
						}
						if(flag==2)
						{
							c.setSubtraction(c.getAns(),Double.parseDouble(txtText.getText()));
							txtText.setText("");
						}
						if(flag==3)
						{
							c.setProduct(Double.parseDouble(txtText.getText()));
							txtText.setText("");
						}
						if(flag==4)
						{
							c.setDivision(2,Double.parseDouble(txtText.getText()));
							txtText.setText("");
						}
					
					
				   flag=2;
				
				   c.setSubtraction(c.getAns(),Double.parseDouble(txtText.getText()));
					}
					if(flag==0)
					{
						c.setSubtraction(Double.parseDouble(txtText.getText()),0);
						
						txtText.setText("");
						flag=2;
						
						   c.setSubtraction(Double.parseDouble(txtText.getText()),0);
						
					}
				
				}
				button_10.setEnabled(true);
			}
		});
		button_13.setFont(new Font("Tahoma", Font.BOLD, 18));
		button_13.setBounds(250, 143, 53, 40);
		contentPane.add(button_13);
		
		JButton btnC = new JButton("C");
		btnC.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				c.init();
				txtText.setText("");
				button_10.setEnabled(true);
				flag=0;
			}
		});
		btnC.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnC.setBounds(10, 92, 70, 40);
		contentPane.add(btnC);
		
		JButton btnX = new JButton("*");
		btnX.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(flag!=0)
				{
					if(flag==1)
					{
						c.setSum(Double.parseDouble(txtText.getText()));
						txtText.setText("");
					}
					if(flag==2)
					{
						c.setSubtraction(c.getAns(),Double.parseDouble(txtText.getText()));
						txtText.setText("");
					}
					if(flag==3)
					{
						c.setProduct(Double.parseDouble(txtText.getText()));
						txtText.setText("");
					}
					if(flag==4)
					{
						c.setDivision(2,Double.parseDouble(txtText.getText()));
						txtText.setText("");
					}
				
				
			   flag=3;
			
			   c.setProduct(Double.parseDouble(txtText.getText()));
				}
				if(flag==0)
				{
					c.setProduct(Double.parseDouble(txtText.getText()));
					
					txtText.setText("");
					flag=3;
					
					c.setProduct(Double.parseDouble(txtText.getText()));
				
			}
				button_10.setEnabled(true);
			}
		});
		btnX.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnX.setBounds(90, 92, 70, 40);
		contentPane.add(btnX);
		
		JButton button_14 = new JButton("/");
		button_14.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				if(flag!=0)
				{
					if(flag==1)
					{
						c.setSum(Double.parseDouble(txtText.getText()));
						txtText.setText("");
					}
					if(flag==2)
					{
						c.setSubtraction(c.getAns(),Double.parseDouble(txtText.getText()));
						txtText.setText("");
					}
					if(flag==3)
					{
						c.setProduct(Double.parseDouble(txtText.getText()));
						txtText.setText("");
					}
					
					if(flag==4)
					{
						c.setDivision(2,Double.parseDouble(txtText.getText()));
						txtText.setText("");
					}
					flag=4;
					c.setDivision(2,Double.parseDouble(txtText.getText()));
					
				}
				if(flag==0)
				{
					c.setDivision(1,Double.parseDouble(txtText.getText()));
					txtText.setText("");
					flag=4;
				}
				button_10.setEnabled(true);
			}
		});
		button_14.setFont(new Font("Tahoma", Font.BOLD, 15));
		button_14.setBounds(170, 92, 70, 40);
		contentPane.add(button_14);
		
		JButton button_15 = new JButton("<-");
		button_15.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String s=txtText.getText();
				txtText.setText("");
	            for(int i=0;i<s.length()-1;i++)
	            txtText.setText(txtText.getText()+s.charAt(i));
			}
		});
		button_15.setFont(new Font("Tahoma", Font.BOLD, 15));
		button_15.setBounds(252, 92, 53, 40);
		contentPane.add(button_15);
		
		
	}
}
