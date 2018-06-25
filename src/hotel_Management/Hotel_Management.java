package hotel_Management;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JSlider;
import javax.swing.JScrollBar;
import javax.swing.JProgressBar;
import javax.swing.JSeparator;
import javax.swing.JTree;
import javax.swing.JTable;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JTabbedPane;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.awt.event.ActionEvent;
import javax.swing.JTextArea;
import javax.swing.JSpinner;
import javax.swing.JComboBox;
import javax.swing.JCheckBox;
import javax.swing.JToggleButton;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JMenuItem;

public class Hotel_Management {

	private JFrame frame;
	private JTable table;
	private JTextField textDisplay;
	private JTextField txtOreoShake;
	private JTextField txtPizza;
	private JTextField txtBurger;
	private JTextField txtFriedRice;
	private JTextField txtChooseDrink;
	private JTextField txtEnterCurrency;
    private double firstnum;
    private double secondnum, result;
    private String operations;
    
    
    double CUsa= 2.00;
    double CChina= 3.00;
    double CBritain= 4.00;
    double CSpain= 5.00;
    
    
    private JLabel lblClock;
    
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Hotel_Management window = new Hotel_Management();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	
	public void datetime()
	{
		Thread datetime = new Thread()
				{
			      public void run()
			      {
			    	  try
			  		{
			    		  for(;;)
			    		  {
			    			  Calendar cal= new GregorianCalendar();
			    			  int day=cal.get(Calendar.DAY_OF_MONTH);
			    			  int month=cal.get(Calendar.MONTH);
			    			  int year=cal.get(Calendar.YEAR);
			    			  
			    			  int second=cal.get(Calendar.SECOND);
			    			  int minute=cal.get(Calendar.MINUTE);
			    			  int hour= cal.get(Calendar.HOUR);
			    			  
			    			  lblClock.setText("Time- " + hour + ":" + minute + ":" + second + "     " + "Date- " +  day +"/" + month + "/" + year);
			    			  sleep(1000);//this is in ms
			    		  }
			  			
			  			
			  		}
			  		catch(Exception a)
			  		{
			  			
			  		}
			      }
			      
				};
		datetime.start();
		
		
		
		
	}

	
	
	
	
	
	
	
	
	
	

	/**
	 * Create the application.
	 */
	public Hotel_Management() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(0, 0, 1390, 890);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(9, 198, 409, 640);
		panel.setBorder(new LineBorder(new Color(0, 0, 0), 10));
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(12, 13, 385, 614);
		panel.add(tabbedPane);
		
		JPanel panel_4 = new JPanel();
		tabbedPane.addTab("Receipt", null, panel_4, null);
		panel_4.setLayout(null);
		
		JTextArea receiptArea = new JTextArea();
		receiptArea.setBounds(0, 0, 380, 584);
		panel_4.add(receiptArea);
		
		JPanel panel_3 = new JPanel();
		tabbedPane.addTab("Calculator", null, panel_3, null);
		panel_3.setLayout(null);
		
		textDisplay = new JTextField();
		textDisplay.setHorizontalAlignment(SwingConstants.RIGHT);
		textDisplay.setFont(new Font("Tahoma", Font.BOLD, 30));
		textDisplay.setColumns(10);
		textDisplay.setBounds(12, 13, 365, 83);
		panel_3.add(textDisplay);
		
		JButton butBac = new JButton("\uF0E7");
		butBac.setFont(new Font("Dialog", Font.BOLD, 30));
		butBac.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(textDisplay.getText().length()>0)
		{
					String backspace=null;
					StringBuilder str8= new StringBuilder(textDisplay.getText());
					str8.deleteCharAt(textDisplay.getText().length()-1);
					backspace = str8.toString();
					textDisplay.setText(backspace);
			
		}
			}
		});
		butBac.setBounds(12, 109, 89, 93);
		panel_3.add(butBac);
		
		JButton butCle = new JButton("C");
		butCle.setFont(new Font("Tahoma", Font.BOLD, 30));
		butCle.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
		       textDisplay.setText(null);
			}			
			});
		butCle.setBounds(106, 109, 89, 93);
		panel_3.add(butCle);
		
		JButton butMod = new JButton("%");
          butMod.addActionListener(new ActionListener() {
			

			public void actionPerformed(ActionEvent e) {
			 firstnum = Double.parseDouble(textDisplay.getText());
				textDisplay.setText("");
			 	operations = "%";
			}
		});
 		butMod.setFont(new Font("Tahoma", Font.BOLD, 30));
		butMod.setBounds(197, 109, 89, 93);
		panel_3.add(butMod);
		
		JButton butAdd = new JButton("+");
		butAdd.setFont(new Font("Tahoma", Font.BOLD, 30));
		butAdd.addActionListener(new ActionListener() {
			
     	   public void actionPerformed(ActionEvent e) {
			 firstnum = Double.parseDouble(textDisplay.getText());
				textDisplay.setText("");
			 	operations = "+";
			}
		});
		butAdd.setBounds(288, 109, 89, 93);
		panel_3.add(butAdd);
		
		JButton butSub = new JButton("-");
		  butSub.addActionListener(new ActionListener() {
				

				public void actionPerformed(ActionEvent e) {
				 firstnum = Double.parseDouble(textDisplay.getText());
					textDisplay.setText("");
				 	operations = "-";
				}
			});
		butSub.setFont(new Font("Tahoma", Font.BOLD, 30));
		butSub.setBounds(288, 203, 89, 93);
		panel_3.add(butSub);
		
		JButton but9 = new JButton("9");
		but9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String EnterValue = textDisplay.getText() + but9.getText();
				textDisplay.setText(EnterValue);
			}
		});
		but9.setFont(new Font("Tahoma", Font.BOLD, 30));
		but9.setBounds(197, 203, 89, 93);
		panel_3.add(but9);
		
		JButton but8 = new JButton("8");
		but8.setFont(new Font("Tahoma", Font.BOLD, 30));
		but8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String EnterValue = textDisplay.getText() + but8.getText();
				textDisplay.setText(EnterValue);
			}
		});
		but8.setBounds(106, 203, 89, 93);
		panel_3.add(but8);
		
		JButton but7 = new JButton("7");
		but7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterValue = textDisplay.getText() + but7.getText();
				textDisplay.setText(EnterValue);
			}
		});
		but7.setFont(new Font("Tahoma", Font.BOLD, 30));
		but7.setBounds(12, 203, 89, 93);
		panel_3.add(but7);
		
		JButton but4 = new JButton("4");
		but4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String EnterValue = textDisplay.getText() + but4.getText();
				textDisplay.setText(EnterValue);
			}
		});
		but4.setFont(new Font("Tahoma", Font.BOLD, 30));
		but4.setBounds(12, 299, 89, 93);
		panel_3.add(but4);
		
		JButton but5 = new JButton("5");
		but5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String EnterValue = textDisplay.getText() + but5.getText();
				textDisplay.setText(EnterValue);
			}
		});
		but5.setFont(new Font("Tahoma", Font.BOLD, 30));
		but5.setBounds(106, 299, 89, 93);
		panel_3.add(but5);
		
		JButton but2 = new JButton("2");
		but2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String EnterValue = textDisplay.getText() + but2.getText();
				textDisplay.setText(EnterValue);
			}
		});
		but2.setFont(new Font("Tahoma", Font.BOLD, 30));
		but2.setBounds(106, 397, 89, 93);
		panel_3.add(but2);
		
		JButton but1 = new JButton("1");
		but1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String EnterValue = textDisplay.getText() + but1.getText();
				textDisplay.setText(EnterValue);
			}
		});
		but1.setFont(new Font("Tahoma", Font.BOLD, 30));
		but1.setBounds(12, 397, 89, 93);
		panel_3.add(but1);
		
		JButton but0 = new JButton("0");
		but0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String EnterValue = textDisplay.getText() + but0.getText();
				textDisplay.setText(EnterValue);
			}
		});
		but0.setFont(new Font("Tahoma", Font.BOLD, 30));
		but0.setBounds(12, 491, 89, 93);
		panel_3.add(but0);
		
		JButton butDot = new JButton(".");
		butDot.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String EnterValue = textDisplay.getText() + butDot.getText();
				textDisplay.setText(EnterValue);
			}
		});
		butDot.setFont(new Font("Tahoma", Font.BOLD, 30));
		butDot.setBounds(106, 491, 89, 93);
		panel_3.add(butDot);
		
		JButton butPlu = new JButton("\u00B1");
		butPlu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 double plusminus=0.0;
				 plusminus = Double.parseDouble(String.valueOf(textDisplay.getText()));
				plusminus= plusminus* (-1);
				textDisplay.setText(String.valueOf(plusminus));
			}
		});
		butPlu.setFont(new Font("Tahoma", Font.BOLD, 30));
		butPlu.setBounds(197, 491, 89, 93);
		panel_3.add(butPlu);
		
		JButton butEqa = new JButton("=");
		
		butEqa.setFont(new Font("Tahoma", Font.BOLD, 30));
		 butEqa.addActionListener(new ActionListener() {
				

				public void actionPerformed(ActionEvent e) {
				 String answer;
				double  secondnum = Double.parseDouble(textDisplay.getText());
				 
				 if(operations == "+") {
					 result= firstnum + secondnum;
					 answer = String.format("%.2f", result);
					 textDisplay.setText(answer);
					 
				 }
				 
				 else if(operations == "-") {
					 result= firstnum - secondnum;
					 answer = String.format("%.2f", result);
					 textDisplay.setText(answer);
					 
				 }
				 
				 else if(operations == "X") {
					 result= firstnum * secondnum;
					 answer = String.format("%.2f", result);
					 textDisplay.setText(answer);
					 
				 }
				 
				 else if(operations == "/") {
					 result= (firstnum / secondnum);
					 answer = String.format("%.2f", result);
					 textDisplay.setText(answer);
					 
				 }
				 
				 else if(operations == "%") {
					 result= firstnum % secondnum;
					 answer = String.format("%.2f", result);
					 textDisplay.setText(answer);
					 
				 }
				}
			});
		butEqa.setBounds(288, 491, 89, 93);
		panel_3.add(butEqa);
		
		JButton butDiv = new JButton("/");
		  butDiv.addActionListener(new ActionListener() {
				

				public void actionPerformed(ActionEvent e) {
				 firstnum = Double.parseDouble(textDisplay.getText());
					textDisplay.setText("");
				 	operations = "/";
				}
			});
		butDiv.setFont(new Font("Tahoma", Font.BOLD, 30));
		butDiv.setBounds(288, 397, 89, 93);
		panel_3.add(butDiv);
		
		JButton but3 = new JButton("3");
		but3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String EnterValue = textDisplay.getText() + but3.getText();
				textDisplay.setText(EnterValue);
			}
		});
		but3.setFont(new Font("Tahoma", Font.BOLD, 30));
		but3.setBounds(197, 397, 89, 93);
		panel_3.add(but3);
		
		JButton but6 = new JButton("6");
		but6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String EnterValue = textDisplay.getText() + but6.getText();
				textDisplay.setText(EnterValue);
			}
		});
		but6.setFont(new Font("Tahoma", Font.BOLD, 30));
		but6.setBounds(197, 299, 89, 93);
		panel_3.add(but6);
		
		JButton butMul = new JButton("X");
		 butMul.addActionListener(new ActionListener() {
				

				public void actionPerformed(ActionEvent e) {
				 firstnum = Double.parseDouble(textDisplay.getText());
					textDisplay.setText("");
				 	operations = "X";
				}
			});
		butMul.setFont(new Font("Tahoma", Font.BOLD, 30));
		butMul.setBounds(288, 299, 89, 93);
		panel_3.add(butMul);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(423, 198, 942, 359);
		panel_1.setBorder(new LineBorder(new Color(0, 0, 0), 10));
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("Menu");
		lblNewLabel_1.setBounds(32, 24, 141, 37);
		lblNewLabel_1.setForeground(Color.BLUE);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 30));
		panel_1.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Qty");
		lblNewLabel_2.setBounds(246, 24, 121, 37);
		lblNewLabel_2.setForeground(Color.BLUE);
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 30));
		panel_1.add(lblNewLabel_2);
		
		JLabel lblPrice = new JLabel("Price");
		lblPrice.setBounds(401, 24, 99, 37);
		lblPrice.setForeground(Color.BLUE);
		lblPrice.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 30));
		panel_1.add(lblPrice);
		
		JLabel btnOreoShake = new JLabel("Oreo Shake");
		btnOreoShake.setBounds(36, 87, 115, 22);
		btnOreoShake.setFont(new Font("Tahoma", Font.PLAIN, 20));
		panel_1.add(btnOreoShake);
		
		JLabel btnPizza = new JLabel("Pizza");
		btnPizza.setBounds(36, 122, 115, 22);
		btnPizza.setFont(new Font("Tahoma", Font.PLAIN, 20));
		panel_1.add(btnPizza);
		
		JLabel btnBurger = new JLabel("Burger");
		btnBurger.setBounds(36, 157, 115, 22);
		btnBurger.setFont(new Font("Tahoma", Font.PLAIN, 20));
		panel_1.add(btnBurger);
		
		JLabel btnFriedRice = new JLabel("Fried Rice");
		btnFriedRice.setBounds(36, 192, 115, 22);
		btnFriedRice.setFont(new Font("Tahoma", Font.PLAIN, 20));
		panel_1.add(btnFriedRice);
		
		txtOreoShake = new JTextField();
		txtOreoShake.setFont(new Font("Tahoma", Font.BOLD, 20));
		txtOreoShake.setBounds(221, 90, 116, 22);
		panel_1.add(txtOreoShake);
		txtOreoShake.setColumns(10);
		
		txtPizza = new JTextField();
		txtPizza.setFont(new Font("Tahoma", Font.BOLD, 20));
		txtPizza.setBounds(221, 125, 116, 22);
		txtPizza.setColumns(10);
		panel_1.add(txtPizza);
		
		txtBurger = new JTextField();
		txtBurger.setFont(new Font("Tahoma", Font.BOLD, 20));
		txtBurger.setBounds(221, 160, 116, 22);
		txtBurger.setColumns(10);
		panel_1.add(txtBurger);
		
		txtFriedRice = new JTextField();
		txtFriedRice.setFont(new Font("Tahoma", Font.BOLD, 20));
		txtFriedRice.setBounds(221, 195, 116, 22);
		txtFriedRice.setColumns(10);
		panel_1.add(txtFriedRice);
		
		JLabel label = new JLabel("130");
		label.setBounds(416, 87, 115, 22);
		label.setFont(new Font("Tahoma", Font.PLAIN, 20));
		panel_1.add(label);
		
		JLabel label_1 = new JLabel("190");
		label_1.setBounds(417, 122, 115, 22);
		label_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		panel_1.add(label_1);
		
		JLabel label_2 = new JLabel("  70");
		label_2.setBounds(416, 157, 115, 22);
		label_2.setFont(new Font("Tahoma", Font.PLAIN, 20));
		panel_1.add(label_2);
		
		JLabel label_3 = new JLabel("110");
		label_3.setBounds(416, 192, 115, 22);
		label_3.setFont(new Font("Tahoma", Font.PLAIN, 20));
		panel_1.add(label_3);
		
		JCheckBox btnDelivery = new JCheckBox("Delivery");
		btnDelivery.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnDelivery.setBounds(34, 311, 119, 25);
		panel_1.add(btnDelivery);
		
		JComboBox btnChooseDrink = new JComboBox();
		btnChooseDrink.setBounds(32, 238, 121, 22);
		btnChooseDrink.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnChooseDrink.setModel(new DefaultComboBoxModel(new String[] {"Choose a drink", "Coca cola", "Sprite", "Heineken", "Fizz"}));
		panel_1.add(btnChooseDrink);
		
		txtChooseDrink = new JTextField();
		txtChooseDrink.setFont(new Font("Tahoma", Font.BOLD, 20));
		txtChooseDrink.setBounds(221, 238, 116, 22);
		txtChooseDrink.setColumns(10);
		panel_1.add(txtChooseDrink);
		
		JLabel label_4 = new JLabel("-");
		label_4.setBounds(426, 238, 56, 16);
		label_4.setFont(new Font("Tahoma", Font.BOLD, 20));
		panel_1.add(label_4);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(512, 13, -14, 333);
		separator.setOrientation(SwingConstants.VERTICAL);
		panel_1.add(separator);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(543, 87, 1, 2);
		panel_1.add(separator_1);
		
		JSeparator separator_2 = new JSeparator();
		separator_2.setBounds(556, 36, -12, 224);
		separator_2.setOrientation(SwingConstants.VERTICAL);
		panel_1.add(separator_2);
		
		JSeparator separator_3 = new JSeparator();
		separator_3.setBounds(622, 68, -44, 74);
		panel_1.add(separator_3);
		
		JSeparator separator_4 = new JSeparator();
		separator_4.setOrientation(SwingConstants.VERTICAL);
		separator_4.setForeground(Color.BLACK);
		separator_4.setBackground(Color.BLACK);
		separator_4.setBounds(543, 24, 14, 310);
		panel_1.add(separator_4);
		
		JSeparator separator_5 = new JSeparator();
		separator_5.setForeground(Color.BLACK);
		separator_5.setBackground(Color.BLACK);
		separator_5.setBounds(499, 280, -442, 98);
		panel_1.add(separator_5);
		
		JSeparator separator_6 = new JSeparator();
		separator_6.setBackground(Color.BLACK);
		separator_6.setBounds(32, 273, 468, 7);
		panel_1.add(separator_6);
		
		JComboBox btnChooseRoom = new JComboBox();
		btnChooseRoom.setModel(new DefaultComboBoxModel(new String[] {"Choose a room", "AC", "Non-AC"}));
		btnChooseRoom.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnChooseRoom.setBounds(32, 280, 121, 22);
		panel_1.add(btnChooseRoom);
		
		JCheckBox btnTax = new JCheckBox("Tax");
		btnTax.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnTax.setBounds(221, 280, 119, 25);
		panel_1.add(btnTax);
		
	
		
		
		
		JLabel lblCurrencyConverter = new JLabel("Currency Converter");
		lblCurrencyConverter.setForeground(Color.BLUE);
		lblCurrencyConverter.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 30));
		lblCurrencyConverter.setBounds(595, 24, 311, 37);
		panel_1.add(lblCurrencyConverter);
		
		JComboBox btnChooseCountry = new JComboBox();
		btnChooseCountry.setModel(new DefaultComboBoxModel(new String[] {"Choose your Country", "India", "USA", "China", "Britain", "Spain"}));
		btnChooseCountry.setFont(new Font("Tahoma", Font.BOLD, 23));
		btnChooseCountry.setBounds(605, 79, 273, 37);
		panel_1.add(btnChooseCountry);
		
		txtEnterCurrency = new JTextField();
		txtEnterCurrency.setFont(new Font("Tahoma", Font.BOLD, 20));
		txtEnterCurrency.setColumns(10);
		txtEnterCurrency.setBounds(605, 148, 273, 42);
		panel_1.add(txtEnterCurrency);
		
		JLabel txtCurrencyOutput = new JLabel("");
		txtCurrencyOutput.setBorder(new LineBorder(new Color(0, 0, 0), 1));
		txtCurrencyOutput.setBounds(605, 213, 273, 41);
		panel_1.add(txtCurrencyOutput);
		
		JButton btnConvert = new JButton("Convert");
		btnConvert.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				double INR = Double.parseDouble(txtEnterCurrency.getText());
				
				if (btnChooseCountry.getSelectedItem().equals("USA"))
				{
					String CUsaC = String.format("%.2f", INR*CUsa);
					txtCurrencyOutput.setText(CUsaC);
				}
				
				
				if (btnChooseCountry.getSelectedItem().equals("China"))
				{
					String CChinaC = String.format("%.2f", INR*CChina);
					txtCurrencyOutput.setText(CChinaC);
				}
				
				
				if (btnChooseCountry.getSelectedItem().equals("Britain"))
				{
					String CBritainC = String.format("%.2f", INR*CBritain);
					txtCurrencyOutput.setText(CBritainC);
				}
				
				
				if (btnChooseCountry.getSelectedItem().equals("Spain"))
				{
					String CSpainC = String.format("%.2f", INR*CSpain);
					txtCurrencyOutput.setText(CSpainC);
				}
			
			
			}
		});
		btnConvert.setFont(new Font("Tahoma", Font.BOLD, 25));
		btnConvert.setBounds(604, 274, 141, 25);
		panel_1.add(btnConvert);
		
		JButton btnReset2 = new JButton("Reset");
		btnReset2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				txtCurrencyOutput.setText(null);
				txtEnterCurrency.setText(null);
				btnChooseCountry.setSelectedItem("Choose your Country");
				
			}
		});
		btnReset2.setFont(new Font("Tahoma", Font.BOLD, 25));
		btnReset2.setBounds(737, 274, 141, 25);
		panel_1.add(btnReset2);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBounds(423, 559, 942, 279);
		panel_2.setBorder(new LineBorder(new Color(0, 0, 0), 10));
		frame.getContentPane().add(panel_2);
		panel_2.setLayout(null);
		
		JLabel btnTotalMeal = new JLabel("Total Cost of Meal");
		btnTotalMeal.setFont(new Font("Tahoma", Font.PLAIN, 22));
		btnTotalMeal.setBounds(30, 43, 220, 33);
		panel_2.add(btnTotalMeal);
		
		JLabel btnTotalDrink = new JLabel("Total Cost of Drink");
		btnTotalDrink.setFont(new Font("Tahoma", Font.PLAIN, 22));
		btnTotalDrink.setBounds(30, 102, 220, 33);
		panel_2.add(btnTotalDrink);
		
		JLabel btnTotalDelivery = new JLabel("Cost of Delivery");
		btnTotalDelivery.setFont(new Font("Tahoma", Font.PLAIN, 22));
		btnTotalDelivery.setBounds(30, 161, 220, 33);
		panel_2.add(btnTotalDelivery);
		
		JLabel btnTotalRoom = new JLabel("Cost of Room");
		btnTotalRoom.setFont(new Font("Tahoma", Font.PLAIN, 22));
		btnTotalRoom.setBounds(30, 219, 220, 33);
		panel_2.add(btnTotalRoom);
		
		JLabel txtTotalMeal = new JLabel("");
		txtTotalMeal.setBorder(new LineBorder(new Color(0, 0, 0), 1));
		txtTotalMeal.setBounds(242, 43, 273, 41);
		panel_2.add(txtTotalMeal);
		
		JLabel txtTotalDrink = new JLabel("");
		txtTotalDrink.setBorder(new LineBorder(new Color(0, 0, 0), 1));
		txtTotalDrink.setBounds(242, 94, 273, 41);
		panel_2.add(txtTotalDrink);
		
		JLabel txtTotalDelivery = new JLabel("");
		txtTotalDelivery.setBorder(new LineBorder(new Color(0, 0, 0), 1));
		txtTotalDelivery.setBounds(242, 153, 273, 41);
		panel_2.add(txtTotalDelivery);
		
		JLabel txtTotalRoom = new JLabel("");
		txtTotalRoom.setBorder(new LineBorder(new Color(0, 0, 0), 1));
		txtTotalRoom.setBounds(242, 211, 273, 41);
		panel_2.add(txtTotalRoom);
		
		JSeparator separator_7 = new JSeparator();
		separator_7.setOrientation(SwingConstants.VERTICAL);
		separator_7.setForeground(Color.BLACK);
		separator_7.setBackground(Color.BLACK);
		separator_7.setBounds(547, 25, 14, 241);
		panel_2.add(separator_7);
		
		JLabel btnTax1 = new JLabel("Tax");
		btnTax1.setFont(new Font("Tahoma", Font.PLAIN, 22));
		btnTax1.setBounds(573, 74, 50, 33);
		panel_2.add(btnTax1);
		
		JLabel lblTotal_1 = new JLabel("Sub Total");
		lblTotal_1.setFont(new Font("Tahoma", Font.PLAIN, 22));
		lblTotal_1.setBounds(569, 136, 108, 33);
		panel_2.add(lblTotal_1);
		
		JLabel lblTotal = new JLabel("Total");
		lblTotal.setFont(new Font("Tahoma", Font.PLAIN, 22));
		lblTotal.setBounds(568, 198, 82, 33);
		panel_2.add(lblTotal);
		
		JLabel txtTax1 = new JLabel("");
		txtTax1.setBorder(new LineBorder(new Color(0, 0, 0), 1));
		txtTax1.setBounds(668, 74, 220, 33);
		panel_2.add(txtTax1);
		
		JLabel txtSubTotal = new JLabel("");
		txtSubTotal.setBorder(new LineBorder(new Color(0, 0, 0), 1));
		txtSubTotal.setBounds(668, 136, 220, 33);
		panel_2.add(txtSubTotal);
		
		JLabel txtTotal = new JLabel("");
		txtTotal.setBorder(new LineBorder(new Color(0, 0, 0), 1));
		txtTotal.setBounds(668, 198, 220, 33);
		panel_2.add(txtTotal);
		
		JLabel lblClock = new JLabel("Clock");
		lblClock.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblClock.setBounds(559, 28, 324, 33);
		panel_2.add(lblClock);
		
		JLabel lblNewLabel = new JLabel("Hotel Management System");
		lblNewLabel.setBounds(15, 39, 1337, 133);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 99));
		frame.getContentPane().add(lblNewLabel);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBounds(5, 5, 1902, 38);
		frame.getContentPane().add(menuBar);
		
		JMenu mnFile = new JMenu("File");
		menuBar.add(mnFile);
		mnFile.setFont(new Font("Arial", Font.BOLD, 20));
		
		JMenu mnNew = new JMenu("New");
		mnNew.setFont(new Font("Segoe UI", Font.BOLD, 16));
		mnFile.add(mnNew);
		
		JMenuItem mntmReceipt = new JMenuItem("Receipt");
		mntmReceipt.setFont(new Font("Segoe UI", Font.BOLD, 19));
		mntmReceipt.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				double invoice1 = Double.parseDouble(txtOreoShake.getText());
				double invoice2 = Double.parseDouble(txtPizza.getText());
				double invoice3 = Double.parseDouble(txtBurger.getText());
				double invoice4 = Double.parseDouble(txtFriedRice.getText());
				double invoice5 = Double.parseDouble(txtChooseDrink.getText());
				
				receiptArea.append( "\t\n Hotel Management System: \n"
						+  "\n Oreo Shake:  \t\t"   + invoice1
						+  "\n Pizza:  \t\t"   + invoice2
						+  "\n Burger:  \t\t"   + invoice3
						+  "\n Fried Rice:  \t\t"   + invoice4
						+ "\n" + btnChooseDrink.getSelectedItem() + ":\t\t" + invoice5
						+  "\nTotal: \t\t"     + txtTotal.getText()
						+  "\n\n Welcome and Thankyou for your patronage"
						);
				
				
				
			}
		});
		mnNew.add(mntmReceipt);
		
		JMenuItem mntmReset = new JMenuItem("Reset");
		mntmReset.setFont(new Font("Segoe UI", Font.BOLD, 19));
		mntmReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				txtOreoShake.setText(null);	
            	txtPizza.setText(null);
            	txtBurger.setText(null);
            	txtFriedRice.setText(null);
            	txtTotalMeal.setText(null);
            	txtTotalDrink.setText(null);
            	txtTotalDelivery.setText(null);
            	txtTax1.setText(null);
            	txtSubTotal.setText(null);
            	txtEnterCurrency.setText(null);
            	txtCurrencyOutput.setText(null);
            	textDisplay.setText(null);
            	btnChooseDrink.setSelectedItem("Choose a drink");
            	btnChooseRoom.setSelectedItem("Choose a room");
            	btnChooseCountry.setSelectedItem("Country");
            	receiptArea.setText(null);
			
			

				txtCurrencyOutput.setText(null);
				txtEnterCurrency.setText(null);
				btnChooseCountry.setSelectedItem("Choose your Country");
			}
		});
		mnNew.add(mntmReset);
		
		JMenuItem mntmConvert = new JMenuItem("Convert");
		mntmConvert.setFont(new Font("Segoe UI", Font.BOLD, 19));
		mntmConvert.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
double INR = Double.parseDouble(txtEnterCurrency.getText());
				
				if (btnChooseCountry.getSelectedItem().equals("USA"))
				{
					String CUsaC = String.format("%.2f", INR*CUsa);
					txtCurrencyOutput.setText(CUsaC);
				}
				
				
				if (btnChooseCountry.getSelectedItem().equals("China"))
				{
					String CChinaC = String.format("%.2f", INR*CChina);
					txtCurrencyOutput.setText(CChinaC);
				}
				
				
				if (btnChooseCountry.getSelectedItem().equals("Britain"))
				{
					String CBritainC = String.format("%.2f", INR*CBritain);
					txtCurrencyOutput.setText(CBritainC);
				}
				
				
				if (btnChooseCountry.getSelectedItem().equals("Spain"))
				{
					String CSpainC = String.format("%.2f", INR*CSpain);
					txtCurrencyOutput.setText(CSpainC);
				}
			}
		});
		mnFile.add(mntmConvert);
		
		JMenuItem mntmNewMenuItem = new JMenuItem("Refresh");
		mntmNewMenuItem.setFont(new Font("Segoe UI", Font.BOLD, 19));
		mntmNewMenuItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				txtOreoShake.setText(null);	
            	txtPizza.setText(null);
            	txtBurger.setText(null);
            	txtFriedRice.setText(null);
            	txtTotalMeal.setText(null);
            	txtTotalDrink.setText(null);
            	txtTotalDelivery.setText(null);
            	txtTax1.setText(null);
            	txtSubTotal.setText(null);
            	txtEnterCurrency.setText(null);
            	txtCurrencyOutput.setText(null);
            	textDisplay.setText(null);
            	btnChooseDrink.setSelectedItem("Choose a drink");
            	btnChooseRoom.setSelectedItem("Choose a room");
            	btnChooseCountry.setSelectedItem("Country");
            	receiptArea.setText(null);
			
			

				txtCurrencyOutput.setText(null);
				txtEnterCurrency.setText(null);
				btnChooseCountry.setSelectedItem("Choose your Country");
			}
		});
		mnFile.add(mntmNewMenuItem);
		
		JMenuItem mntmExit = new JMenuItem("Exit");
		mntmExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				System.exit(0);
			}
		});
		mntmExit.setForeground(Color.RED);
		mntmExit.setFont(new Font("Segoe UI", Font.BOLD, 19));
		mnFile.add(mntmExit);
		
		JMenuItem mntmConvert_1 = new JMenuItem("Convert");
		mntmConvert_1.setFont(new Font("Segoe UI", Font.BOLD, 19));
		mntmConvert_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
               double INR = Double.parseDouble(txtEnterCurrency.getText());
				
				if (btnChooseCountry.getSelectedItem().equals("USA"))
				{
					String CUsaC = String.format("%.2f", INR*CUsa);
					txtCurrencyOutput.setText(CUsaC);
				}
				
				
				if (btnChooseCountry.getSelectedItem().equals("China"))
				{
					String CChinaC = String.format("%.2f", INR*CChina);
					txtCurrencyOutput.setText(CChinaC);
				}
				
				
				if (btnChooseCountry.getSelectedItem().equals("Britain"))
				{
					String CBritainC = String.format("%.2f", INR*CBritain);
					txtCurrencyOutput.setText(CBritainC);
				}
				
				
				if (btnChooseCountry.getSelectedItem().equals("Spain"))
				{
					String CSpainC = String.format("%.2f", INR*CSpain);
					txtCurrencyOutput.setText(CSpainC);
				}
			}
		});
		menuBar.add(mntmConvert_1);
		
		
		
	
		
		JMenuItem btnExit = new JMenuItem("Exit");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		
		JMenuItem mntmReceipt_1 = new JMenuItem("Receipt");
		mntmReceipt_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				double invoice1 = Double.parseDouble(txtOreoShake.getText());
				double invoice2 = Double.parseDouble(txtPizza.getText());
				double invoice3 = Double.parseDouble(txtBurger.getText());
				double invoice4 = Double.parseDouble(txtFriedRice.getText());
				double invoice5 = Double.parseDouble(txtChooseDrink.getText());
				
				receiptArea.append( "\t\n Hotel Management System: \n"
						+  "\n Oreo Shake:  \t\t"   + invoice1
						+  "\n Pizza:  \t\t"   + invoice2
						+  "\n Burger:  \t\t"   + invoice3
						+  "\n Fried Rice:  \t\t"   + invoice4
						+ "\n" + btnChooseDrink.getSelectedItem() + ":\t\t" + invoice5
						+  "\nTotal: \t\t"     + txtTotal.getText()
						+  "\n\n Welcome and Thankyou for your patronage"
						);
			}
		});
		
		JMenuItem mntmReset_1 = new JMenuItem("Reset");
		mntmReset_1.setFont(new Font("Segoe UI", Font.BOLD, 19));
		mntmReset_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				txtOreoShake.setText(null);	
            	txtPizza.setText(null);
            	txtBurger.setText(null);
            	txtFriedRice.setText(null);
            	txtTotalMeal.setText(null);
            	txtTotalDrink.setText(null);
            	txtTotalDelivery.setText(null);
            	txtTax1.setText(null);
            	txtSubTotal.setText(null);
            	txtEnterCurrency.setText(null);
            	txtCurrencyOutput.setText(null);
            	textDisplay.setText(null);
            	btnChooseDrink.setSelectedItem("Choose a drink");
            	btnChooseRoom.setSelectedItem("Choose a room");
            	btnChooseCountry.setSelectedItem("Country");
            	receiptArea.setText(null);
			
			

				txtCurrencyOutput.setText(null);
				txtEnterCurrency.setText(null);
				btnChooseCountry.setSelectedItem("Choose your Country");
				
			}
		});
		menuBar.add(mntmReset_1);
		mntmReceipt_1.setFont(new Font("Segoe UI", Font.BOLD, 19));
		menuBar.add(mntmReceipt_1);
		btnExit.setFont(new Font("Segoe UI", Font.BOLD, 20));
		btnExit.setForeground(Color.RED);
		menuBar.add(btnExit);
		
		JButton btnSubmit = new JButton("Submit");
		btnSubmit.setFont(new Font("Tahoma", Font.BOLD, 25));
		btnSubmit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				///"Choose a drink", "Coca cola", "Sprite", "Heineken", "Fizz"
		////////////////////------------ Drink -------------------------------------
				double Drink = Double.parseDouble(txtChooseDrink.getText());
			    double CocaCola = 15*Drink;
			    double Sprite =    15*Drink;
			    double Heineken = 250*Drink;
			    double Fizz = 35*Drink;
			    
			    if(btnChooseDrink.getSelectedItem().equals("Coca cola"))
			    	
			    {
			    	String pCoca_cola = String.format("%.3f",  CocaCola);
			    	txtTotalDrink.setText(pCoca_cola);
			    }
			    
                if(btnChooseDrink.getSelectedItem().equals("Sprite"))
			    	
			    {
			    	String pSprite = String.format("%.3f",  Sprite);
			    	txtTotalDrink.setText(pSprite);
			    }

                 if(btnChooseDrink.getSelectedItem().equals("Heineken"))
	
                   {
	                      String pHeineken = String.format("%.3f",  Heineken);
	                          txtTotalDrink.setText(pHeineken);
                 }

                 if(btnChooseDrink.getSelectedItem().equals("Fizz"))
	
                 {
	               String pFizz = String.format("%.3f",  Fizz);
                  	txtTotalDrink.setText(pFizz);
                   }
                 
                 if(btnChooseDrink.getSelectedItem().equals("Choose a drink"))
                		
                 {
	               
                  	txtTotalDrink.setText("0.000");
                   }
			    ////////////////////////////  ------------meals-------------
                 double FriedRice = Double.parseDouble(txtFriedRice.getText());
                 double pFriedRice = 110.00;
                 double getFriedRice;
                 getFriedRice = (FriedRice * pFriedRice);
                 String TotalFriedRice =  String.format("%.3f", getFriedRice);
                 txtTotalMeal.setText(TotalFriedRice);
                 
                 double OreoShake = Double.parseDouble(txtOreoShake.getText());
                 double pOreoShake = 130.00;
                 double getOreoShake;
                 getOreoShake = (OreoShake * pOreoShake);
                 String TotalOreoShake =  String.format("%.3f", getOreoShake + getFriedRice);
                 txtTotalMeal.setText(TotalOreoShake);
                 
                 double Pizza = Double.parseDouble(txtPizza.getText());
                 double pPizza = 190.00;
                 double getPizza;
                 getPizza = (Pizza * pPizza);
                 String TotalPizza =  String.format("%.3f", getPizza + getOreoShake + getFriedRice);
                 txtTotalMeal.setText(TotalPizza);
                 
                 double Burger = Double.parseDouble(txtBurger.getText());
                 double pBurger = 70.00;
                 double getBurger ;
                 getBurger = (Burger * pBurger);
                 String TotalBurger =  String.format("%.3f", getBurger + getPizza + getOreoShake + getFriedRice);
                 txtTotalMeal.setText(TotalBurger);
                 
                 
     /////////////---------------- Delivery----------
                 
                 
                 double cDelivery = 40;
                 if(btnDelivery.isSelected())
                 {
                	 String pDelivery = String.format("%.3f", cDelivery);
                	 txtTotalDelivery.setText(pDelivery);
                 }
                 else
                 {
                	 txtTotalDelivery.setText("0.000");
                 }
                 
        ///////////////---------Tax-------------
                 
                 double pTotal1 = Double.parseDouble(txtTotalMeal.getText());
                 double pTotal2 = Double.parseDouble(txtTotalDrink.getText());
                 double pTotal3 = Double.parseDouble(txtTotalDelivery.getText());
                 double cTotal = (pTotal1 + pTotal2 + pTotal3)/100;
                 
                 if(btnTax.isSelected())
                 {
                	 String xTotal = String.format("%.3f", cTotal);
                	 txtTax1.setText(xTotal);
                	 
                 }
                 
   //////////////////----------------Total------------------
                 
                 double pTotal4 = Double.parseDouble(txtTax1.getText());
                 String zTaxTotal = String.format("%.3f", pTotal4);
                 txtTax1.setText(zTaxTotal);
                 
                 double subTotal = (pTotal1 + pTotal2 + pTotal3);
                 String pSubTotal = String.format("%.3f", subTotal);
                 txtSubTotal.setText(pSubTotal);
                 
                 double xTotal = (pTotal1 + pTotal2 + pTotal3 + pTotal4);
                 String yTotal = String.format("%.3f", xTotal);
                 txtTotal.setText(yTotal);
                                    
			}
		});
		btnSubmit.setBounds(199, 311, 141, 25);
		panel_1.add(btnSubmit);
				
	
	
	
	
                  	JButton btnReset = new JButton("Reset");
       	            btnReset.addActionListener(new ActionListener() {
		            public void actionPerformed(ActionEvent e) {
		             
		            	txtOreoShake.setText(null);	
		            	txtPizza.setText(null);
		            	txtBurger.setText(null);
		            	txtFriedRice.setText(null);
		            	txtTotalMeal.setText(null);
		            	txtTotalDrink.setText(null);
		            	txtTotalDelivery.setText(null);
		            	txtTax1.setText(null);
		            	txtSubTotal.setText(null);
		            	txtEnterCurrency.setText(null);
		            	txtCurrencyOutput.setText(null);
		            	textDisplay.setText(null);
		            	btnChooseDrink.setSelectedItem("Choose a drink");
		            	btnChooseRoom.setSelectedItem("Choose a room");
		            	btnChooseCountry.setSelectedItem("Country");
		            	receiptArea.setText(null);
		            } 
		
	});
	btnReset.setFont(new Font("Tahoma", Font.BOLD, 25));
	btnReset.setBounds(369, 311, 141, 25);
	panel_1.add(btnReset);
	
	JMenuItem menuItem = new JMenuItem("");
	menuItem.setBounds(124, 100, 151, 24);
	frame.getContentPane().add(menuItem);
}
	
	
	
	
	
}