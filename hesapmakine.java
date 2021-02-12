package hesapmakine;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;




public class hesapmakine implements ActionListener {

	static JFrame frame;
	static JPanel panel;
	static JButton button1,button2,button3,button4,button5,button6,button7,button8,button9,button0;
	static JButton buttonplus,buttonminus,buttondiv,buttonmult,buttonequ,buttonclr,buttonpoint;
	static JLabel baslik;	
	static JTextField text1;
	static String d1="",d2="",operator="",eskioperator="" ; 
	static double a1=0,a2=0;
	
	
	public static void rakambas() {
		
					
			String disp = text1.getText();
		
			d2 = disp;
			disp = d1+d2 ;
			text1.setText(disp);
			d1 = disp ;
			d2="";
			
			
			}
			

	
	public static void operbas() {
		
		
		double sonuc=0;
		String disp ="";
		
		
				
		if (operator.equals("+")) {
			
			disp = text1.getText();
			a2 = Double.valueOf(disp);
			sonuc= a1+a2;
		
					
		}
		
					
		if (operator.equals("x")) {
			if (a2==0) {
				a2=1 ;
				}
			if (a1==0) {
				a1=1;
				
			}
			disp = text1.getText();
			a2 = Double.valueOf(disp);
			sonuc= a1*a2;
					
			
		}
		
		if (operator.equals("eksi")) {
			
			disp = text1.getText();
			a2 = Double.valueOf(disp);
			sonuc= a2-a1;
					
			
		}
		
		if (operator.equals("/")) {
			
			if (a1==0) {
			
				a1=1;
			
			
			
			disp = text1.getText();
			a2 = Double.valueOf(disp);
			sonuc= a2/a1;
			a1=0;
			}
			if (a1!=0) {
			
			disp = text1.getText();
			a2 = Double.valueOf(disp);
			sonuc= a1/a2;
			}			
			
		}
						
			
		
        
		disp=Double.toString(sonuc);
		
		text1.setText(disp);
		eskioperator=operator;
		
		a1=sonuc;
		d1="";	
		
		
	}
	
	public static void esittir() {
		
		double sonuc = 0;
		String disp = text1.getText();
		a2 = Double.valueOf(disp);
		if (operator.equals("+")) {
		sonuc= a1+a2;
		}
		if (operator.equals("x")) {
			if (a2==0) {
				a2=1 ;
				}
			if (a1==0) {
				a1=1;
				
			}
			
			sonuc= a1*a2;
			}
		
		if (operator.equals("eksi")) {
			sonuc= a1-a2;
				
			}
		if (operator.equals("/")) {
			
			if (a1==0) {
				a1=1;
				disp = text1.getText();
				a2 = Double.valueOf(disp);
				sonuc= a2/a1;
				a1=0;
			}
			
			if (a1!=0) {
				
				disp = text1.getText();
				a2 = Double.valueOf(disp);
				sonuc= a1/a2;
				}			
					
			
		}	
			
		
		disp=Double.toString(sonuc);
	
		text1.setText(disp);
		a2=0;
		a1=0;
		d1="";
		d2="";
		
		
		
	}
	

	
	private enum actions {
	    bir,iki,uc,dort,bes,alti,yedi,sekiz,dokuz,sifir,arti,eksi,bolu,carpi,esit,clr,nokta
	  }
		
	
	public static void main(String[] args) {
		frame=new JFrame();
		panel=new JPanel();
		button1 = new JButton("1");
		button2 = new JButton("2");
		button3 = new JButton("3");
		button4 = new JButton("4");
		button5 = new JButton("5");
		button6 = new JButton("6");
		button7 = new JButton("7");
		button8 = new JButton("8");
		button9 = new JButton("9");
		button0 = new JButton("0");
		buttonplus = new JButton("+");
		buttonminus = new JButton("-");
		buttondiv = new JButton("/");
		buttonmult = new JButton("x");
	    buttonequ = new JButton("=");
		buttonclr = new JButton("CLR");
		buttonpoint = new JButton(".");
		
		baslik = new JLabel("HESAP MAKÝNESÝ");
		text1 = new JTextField ();
		text1.setHorizontalAlignment(SwingConstants.RIGHT);
		
		
		text1.setFont(new Font("Serif", Font.PLAIN, 30));
		baslik.setFont(new Font("Serif", Font.PLAIN, 25));
		
		buttondiv.setFont (new Font("Serif", Font.PLAIN, 25));
		buttondiv.addActionListener(new hesapmakine());
		buttondiv.setActionCommand(actions.bolu.name());
		
		buttonmult.setFont(new Font("Serif", Font.PLAIN, 25));
		buttonmult.addActionListener(new hesapmakine());
		buttonmult.setActionCommand(actions.carpi.name());
		
		
		buttonequ.setFont(new Font("Serif", Font.PLAIN, 25));
		buttonequ.addActionListener(new hesapmakine());
		buttonequ.setActionCommand(actions.esit.name());
			
		
		buttonplus.setFont(new Font("Serif", Font.PLAIN, 25));
		buttonplus.addActionListener(new hesapmakine());
		buttonplus.setActionCommand(actions.arti.name());
		
		
		buttonpoint.setFont(new Font("Serif", Font.PLAIN, 25));
		buttonpoint.addActionListener(new hesapmakine());
		buttonpoint.setActionCommand(actions.nokta.name());
		
		button1.setFont(new Font("Serif", Font.PLAIN, 25));
		button1.addActionListener(new hesapmakine());
		button1.setActionCommand(actions.bir.name());
			
		
		button2.setFont(new Font("Serif", Font.PLAIN, 25));
		button2.addActionListener(new hesapmakine());
		button2.setActionCommand(actions.iki.name());
		
		button3.setFont(new Font("Serif", Font.PLAIN, 25));
		button3.addActionListener(new hesapmakine());
		button3.setActionCommand(actions.uc.name());
		
		button4.setFont(new Font("Serif", Font.PLAIN, 25));
		button4.addActionListener(new hesapmakine());
		button4.setActionCommand(actions.dort.name());
		
		button5.setFont(new Font("Serif", Font.PLAIN, 25));
		button5.addActionListener(new hesapmakine());
		button5.setActionCommand(actions.bes.name());
		
		button6.setFont(new Font("Serif", Font.PLAIN, 25));
		button6.addActionListener(new hesapmakine());
		button6.setActionCommand(actions.alti.name());
		
		button7.setFont(new Font("Serif", Font.PLAIN, 25));
		button7.addActionListener(new hesapmakine());
		button7.setActionCommand(actions.yedi.name());
		
		button8.setFont(new Font("Serif", Font.PLAIN, 25));
		button8.addActionListener(new hesapmakine());
		button8.setActionCommand(actions.sekiz.name());
		
		button9.setFont(new Font("Serif", Font.PLAIN, 25));
		button9.addActionListener(new hesapmakine());
		button9.setActionCommand(actions.dokuz.name());
		
		button0.setFont(new Font("Serif", Font.PLAIN, 25));
		button0.addActionListener(new hesapmakine());
		button0.setActionCommand(actions.sifir.name());
		
		buttonminus.setFont(new Font("Serif", Font.PLAIN, 25));
		buttonminus.addActionListener(new hesapmakine());
		buttonminus.setActionCommand(actions.eksi.name());
		
		buttonclr.setFont(new Font("Serif", Font.PLAIN, 25));
		buttonclr.addActionListener(new hesapmakine());
		buttonclr.setActionCommand(actions.clr.name());
		
		frame.setSize(450,500);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		panel.setLayout(null);
		
		baslik.setBounds(120, 10, 250, 20);
		text1.setBounds(60, 60, 310, 40);
		button7.setBounds(60,120,50,50);
		button8.setBounds(130,120,50,50);
		button9.setBounds(200,120,50,50);
		buttondiv.setBounds(320,120,50,50);
		button4.setBounds(60,190,50,50);
		button5.setBounds(130,190,50,50);
		button6.setBounds(200,190,50,50);
		buttonmult.setBounds(320,190,50,50);
		button1.setBounds(60,260,50,50);
		button2.setBounds(130,260,50,50);
		button3.setBounds(200,260,50,50);
		buttonminus.setBounds(320,260,50,50);
		button0.setBounds(60,330,50,50);
		buttonpoint.setBounds(130,330,50,50);
		buttonequ.setBounds(200,330,50,50);
		buttonplus.setBounds(320,330,50,50);
		buttonclr.setBounds(60,400,90,50);
		
		frame.add(panel);
		//panel.add(baslik);
		panel.add(button0);
		panel.add(button1);
		panel.add(button2);
		panel.add(button3);
		panel.add(button4);
		panel.add(button5);
		panel.add(button6);
		panel.add(button7);
		panel.add(button8);
		panel.add(button9);
		panel.add(button0);
		panel.add(buttonclr);
		panel.add(buttondiv);
		panel.add(buttonminus);
		panel.add(buttonmult);
		panel.add(buttonplus);
		panel.add(buttonequ);
		panel.add(buttonpoint);
		panel.add(text1);
		
		
		
				
		frame.setVisible(true);
		
						
		

	}


	@Override
	public void actionPerformed(ActionEvent e) {
		
		
		if (e.getActionCommand()==actions.bir.name()) {
			text1.setText("1");
			rakambas();	
		}
		
		if (e.getActionCommand()==actions.iki.name()) {
			text1.setText("2");
			rakambas();	
		}
		
		if (e.getActionCommand()==actions.uc.name()) {
			text1.setText("3");
			rakambas();	
						
	     }
		if (e.getActionCommand()==actions.dort.name()) {
			text1.setText("4");
			rakambas();	
		 }
		if (e.getActionCommand()==actions.bes.name()) {
			text1.setText("5");
			rakambas();	
		}
		
		if (e.getActionCommand()==actions.alti.name()) {
			text1.setText("6");
			rakambas();	
		}
		
		if (e.getActionCommand()==actions.yedi.name()) {
			text1.setText("7");
			rakambas();	
		}
		
		if (e.getActionCommand()==actions.sekiz.name()) {
			text1.setText("8");
			rakambas();	
		}
		
		if (e.getActionCommand()==actions.dokuz.name()) {
			text1.setText("9");
			rakambas();	
		}
		
		if (e.getActionCommand()==actions.sifir.name()) {
			text1.setText("0");
			rakambas();	
		}
		
			
		
		if (e.getActionCommand()==actions.nokta.name()) {
			
			
			String disp = text1.getText();
			int y =disp.indexOf(".");
			if  (y==-1)  {
				text1.setText(".");
				rakambas ();
				
		                }
		
	    }
		
		if (e.getActionCommand()==actions.esit.name()) {
			
			
			esittir();
			
			
			
		}
		
		if (e.getActionCommand()==actions.arti.name()) {
			
			  operator="+";
			  operbas();
			  
				
		}
		
		if (e.getActionCommand()==actions.bolu.name()) {
			
			  operator="/";
			  operbas();
			  
				
		}
		
		if (e.getActionCommand()==actions.eksi.name()) {
			
			  operator="eksi";
			  operbas();
			  
				
		}
		
		if (e.getActionCommand()==actions.carpi.name()) {
			
			  operator="x";
			  operbas();
			  
				
		}
		
		if (e.getActionCommand()==actions.clr.name()) {
			
			text1.setText("0");
			a1=0;
			a2=0;
			d1="";
			d2="";
			operator="";
			
			  
}
}
		
}

		
		
		
