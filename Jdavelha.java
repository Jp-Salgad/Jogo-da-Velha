
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import  java.awt.event.ActionEvent ;
import  java.awt.event.ActionListener ;

import  javax.swing.JButton ;


import java.awt.Color;

import java.awt.Font;

import javax.swing.Action;

import javax.swing.JTextField;
public class Jdavelha extends JFrame {
	
	public boolean joga=true;
	public boolean jogb=true;
	public int contpos=0;
	public int k=0,i=0;
	int op;
	public String linha1, linha2, linha3, coluna1, coluna2, coluna3, diagonal1, diagonal2;
	String[][]posvetor=new String [3][3];
	

	private JPanel contentPane;
	
	private JTextField textvisor;
	private Action action;
	private JTextField txtVisor;
	private static JButton btn1;
	private static JButton btn2;
	private static JButton btn3;
	private static JButton btn4;
	private static JButton btn6;
	private static JButton btn5;
	private static JButton btn7;
	private static JButton btn8;
	private static JButton btn9;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Jdavelha frame = new Jdavelha();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	

	/**
	 * Create the frame.
	 */
	public Jdavelha() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 444, 502);
		contentPane = new JPanel();
		contentPane.setBackground(Color.BLACK);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		btn1 = new JButton("");
		btn1.setFont(new Font("Tahoma", Font.BOLD, 90));
		btn1.setBackground(Color.WHITE);
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				verificarjogador();
				if(op==1) {
				btn1.setText("X");
				posvetor[0][0]="x";
			}else {
				
				btn1.setText("O");
				posvetor[0][0]="O";
				
			}
				btn1.setEnabled(false);
				verificarc();
				verificarvencedor();
			}
		});
		btn1.setBounds(10, 81, 129, 115);
		contentPane.add(btn1);
		
		btn2 = new JButton("");
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				verificarjogador();
				if(op==1) {
				btn2.setText("X");
				posvetor[0][1]="x";
			}else {
				
				btn2.setText("O");
				posvetor[0][1]="O";
				
			}
				btn2.setEnabled(false);
				verificarc();
				verificarvencedor();
				
			}
		});
		btn2.setFont(new Font("Tahoma", Font.BOLD, 90));
		btn2.setBackground(Color.WHITE);
		btn2.setBounds(149, 81, 129, 115);
		contentPane.add(btn2);
		
		btn3 = new JButton("");
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				verificarjogador();
				if(op==1) {
				btn3.setText("X");
				posvetor[0][2]="x";
			}else {
				
				btn3.setText("O");
				posvetor[0][2]="O";
				
			}
				btn3.setEnabled(false);
				verificarc();
				verificarvencedor();
				
			}
		});
		btn3.setFont(new Font("Tahoma", Font.BOLD, 90));
		btn3.setBackground(Color.WHITE);
		btn3.setBounds(288, 81, 129, 115);
		contentPane.add(btn3);
		
		btn4 = new JButton("");
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				verificarjogador();
				if(op==1) {
				btn4.setText("X");
				posvetor[1][0]="x";
			}else {
				
				btn4.setText("O");
				posvetor[1][0]="O";
				
			}
				btn4.setEnabled(false);
				verificarc();
				verificarvencedor();
				
			}
			
			
				
				
				
			
			
		});
		btn4.setFont(new Font("Tahoma", Font.BOLD, 90));
		btn4.setBackground(Color.WHITE);
		btn4.setBounds(10, 207, 129, 115);
		contentPane.add(btn4);
		
		btn5 = new JButton("");
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				verificarjogador();
				if(op==1) {
				btn5.setText("X");
				posvetor[1][1]="x";
			}else {
				
				btn5.setText("O");
				posvetor[1][1]="O";
				
			}
				btn5.setEnabled(false);
				verificarc();
				verificarvencedor();
				
			}
		});
		btn5.setFont(new Font("Tahoma", Font.BOLD, 90));
		btn5.setBackground(Color.WHITE);
		btn5.setBounds(149, 207, 129, 115);
		contentPane.add(btn5);
		
		btn6 = new JButton("");
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				verificarjogador();
				if(op==1) {
				btn6.setText("X");
				posvetor[1][2]="x";
			}else {
				
				btn6.setText("O");
				posvetor[1][2]="O";
				
			}
				btn6.setEnabled(false);
				verificarc();
				verificarvencedor();
				
			}
		});
		btn6.setFont(new Font("Tahoma", Font.BOLD, 90));
		btn6.setBackground(Color.WHITE);
		btn6.setBounds(288, 207, 129, 115);
		contentPane.add(btn6);
		
		btn7 = new JButton("");
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				verificarjogador();
				if(op==1) {
				btn7.setText("X");
				posvetor[2][0]="x";
			}else {
				
				btn7.setText("O");
				posvetor[2][0]="O";
				
			}
				btn7.setEnabled(false);
				verificarc();

				verificarvencedor();
							}
		});
		btn7.setFont(new Font("Tahoma", Font.BOLD, 90));
		btn7.setBackground(Color.WHITE);
		btn7.setBounds(10, 333, 129, 115);
		contentPane.add(btn7);
		
		btn8 = new JButton("");
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				verificarjogador();
				if(op==1) {
				btn8.setText("X");
				posvetor[2][1]="x";
			}else {
				
				btn8.setText("O");
				posvetor[2][1]="O";
				
			}
				btn8.setEnabled(false);
				verificarc();
				verificarvencedor();
				
			}
		});
		btn8.setFont(new Font("Tahoma", Font.BOLD, 90));
		btn8.setBackground(Color.WHITE);
		btn8.setBounds(149, 333, 129, 115);
		contentPane.add(btn8);
		
		btn9 = new JButton("");
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				verificarjogador();
				if(op==1) {
				btn9.setText("X");
				posvetor[2][2]="x";
			}else {
				
				btn9.setText("O");
				posvetor[2][2]="O";
				
			}
				btn9.setEnabled(false);
				verificarc();
				verificarvencedor();
				
			}
		});
		btn9.setFont(new Font("Tahoma", Font.BOLD, 90));
		btn9.setBackground(Color.WHITE);
		btn9.setBounds(288, 333, 129, 115);
		contentPane.add(btn9);
		
		txtVisor = new JTextField();
		txtVisor.setForeground(Color.GREEN);
		txtVisor.setFont(new Font("Tahoma", Font.BOLD, 20));
		txtVisor.setBounds(10, 11, 202, 41);
		contentPane.add(txtVisor);
		txtVisor.setColumns(10);
		
		JButton btnNewButton = new JButton("Reiniciar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				btn1.setText("");
				btn1.setEnabled(true);
				btn2.setText("");
				btn2.setEnabled(true);
				btn3.setText("");
				btn3.setEnabled(true);
				btn4.setText("");
				btn4.setEnabled(true);
				btn5.setText("");
				btn5.setEnabled(true);
				btn6.setText("");
				btn6.setEnabled(true);
				btn7.setText("");
				btn7.setEnabled(true);
				btn8.setText("");
				btn8.setEnabled(true);
				btn9.setText("");
				btn9.setEnabled(true);
				limparposicao();
				txtVisor.setText("");
				joga=true;
				jogb=true;
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 17));
		btnNewButton.setBounds(246, 11, 160, 41);
		contentPane.add(btnNewButton);
		
	
	
		
	
		
		
		
	}



		public void verificarjogador() {
			
			if(joga&&jogb) {
				op=1;
				joga=false;
				jogb=true;
				txtVisor.setText("Vez do Jogador O");
			}else if(joga&&jogb==false) {
				this.op=1;
				joga=false;
				jogb=true;
				txtVisor.setText("Vez do Jogador O");
			}else{
				this.op=2;
				joga=true;
				jogb=false;
				txtVisor.setText("Vez do Jogador X");
			}}	
		
		public void verificarc() {
			contpos=0;
			for (i=0;i<3;i++) {
				for (k=0;k<3;k++) {
					if(posvetor[i][k]=="x"|posvetor[i][k]=="O") {
						contpos+=1;
					}
				}}

					
				
			}
			
			
		
			
			public static void desativarbtn() {
				
				btn1.setEnabled(false);
				btn2.setEnabled(false);
				btn3.setEnabled(false);
				btn4.setEnabled(false);
				btn5.setEnabled(false);
				btn6.setEnabled(false);
				btn7.setEnabled(false);
				btn8.setEnabled(false);
				btn9.setEnabled(false);
			
			}
			
		public void limparposicao() {
			
			for (i=0;i<3;i++) {
				for (k=0;k<3;k++) {
					posvetor[i][k]="";
				}}
			}
			
		public void verificarvencedor() {
			
			linha1=posvetor[0][0]+posvetor[0][1]+posvetor[0][2];
			linha2=posvetor[1][0]+posvetor[1][1]+posvetor[1][2];
			linha3=posvetor[2][0]+posvetor[2][1]+posvetor[2][2];
			
			coluna1=posvetor[0][0]+posvetor[1][0]+posvetor[2][0];
			coluna2=posvetor[0][1]+posvetor[1][1]+posvetor[2][1];
			coluna3=posvetor[0][2]+posvetor[1][2]+posvetor[2][2];
			
			diagonal1=posvetor[0][0]+posvetor[1][1]+posvetor[2][2];
			diagonal2=posvetor[0][2]+posvetor[1][1]+posvetor[2][0];
			
			if(linha1.equals("xxx")|linha2.equals("xxx")|linha3.equals("xxx")|coluna1.equals("xxx")|coluna2.equals("xxx")|coluna3.equals("xxx")|diagonal1.equals("xxx")|diagonal2.equals("xxx")) {
				txtVisor.setText("O vencedor é o X!");
				desativarbtn();
			
			}else if(linha1.equals("OOO")|linha2.equals("OOO")|linha3.equals("OOO")|coluna1.equals("OOO")|coluna2.equals("OOO")|coluna3.equals("OOO")|diagonal1.equals("OOO")|diagonal2.equals("OOO")) {
				txtVisor.setText("O vencedor é o O!");
				desativarbtn();
				
			}else if(contpos==9){ 
				txtVisor.setText("Deu velha!");
			
	}
		}
			
	public JButton getBtn1() {
		return btn1;
	}
	public JButton getBtn2() {
		return btn2;
	}
	public JButton getBtn3() {
		return btn3;
	}
	public JButton getBtn4() {
		return btn4;
	}
	public JButton getBtn6() {
		return btn6;
	}
	public JButton getBtn5() {
		return btn5;
	}
	public JButton getBtn7() {
		return btn7;
	}
	public JButton getBtn8() {
		return btn8;
	}
	public JButton getBtn9() {
		return btn9;
	}
	}

