package com.mindscript.core_java_basics.GUI;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import java.awt.*;
public class Calculator {
	public static void main(String[] args) {
		JFrame f = new JFrame("Calculator");
		
		ImageIcon i = new ImageIcon("C:\\Users\\hpcnd\\eclipse-workspace\\core_java_basics\\src\\com\\mindscript\\core_java_basics\\GUI\\images.png");
		f.setIconImage(i.getImage());
		
		
//		JPanel p = new JPanel();
//		p.setLayout(null);
//		p.setBounds(0,0,300,420);
		
		JTextField t = new JTextField();
		t.setBounds(10,20,270,40);
		t.setBackground(Color.gray);
		t.setForeground(Color.white);
		t.setFont(new Font("Arial",Font.ITALIC,20));
		t.setEditable(false);
		t.setHorizontalAlignment(SwingConstants.RIGHT);
		f.add(t);
		
		JButton mod = new JButton("%");
		mod.setBounds(10,70,60,40);
		mod.setBackground(Color.gray);
		mod.setForeground(Color.white);
		f.add(mod);
		
		JButton ce = new JButton("CE");
		ce.setBounds(80,70,60,40);
		ce.setBackground(Color.gray);
		ce.setForeground(Color.white);
		f.add(ce);
		
		JButton c = new JButton("C");
		c.setBounds(150,70,60,40);
		c.setBackground(Color.gray);
		c.setForeground(Color.white);
		f.add(c);
		
		JButton del = new JButton("⌫");
		del.setBounds(220,70,60,40);
		del.setBackground(Color.gray);
		del.setForeground(Color.white);
		f.add(del);
		
		JButton onebyx = new JButton("1/x");
		onebyx.setBounds(10,120,60,40);
		onebyx.setBackground(Color.gray);
		onebyx.setForeground(Color.white);
		f.add(onebyx);
		
		JButton square = new JButton("x²");
		square.setBounds(80,120,60,40);
		square.setBackground(Color.gray);
		square.setForeground(Color.white);
		f.add(square);
		
		JButton squareroot = new JButton("2√x");
		squareroot.setBounds(150,120,60,40);
		squareroot.setBackground(Color.gray);
		squareroot.setForeground(Color.white);
		f.add(squareroot);
		
		JButton div = new JButton("÷");
		div.setBounds(220,120,60,40);
		div.setBackground(Color.gray);
		div.setForeground(Color.white);
		f.add(div);
		
		JButton seven = new JButton("7");
		seven.setBounds(10,170,60,40);
		seven.setBackground(Color.gray);
		seven.setForeground(Color.white);
		f.add(seven);
		
		JButton eight = new JButton("8");
		eight.setBounds(80,170,60,40);
		eight.setBackground(Color.gray);
		eight.setForeground(Color.white);
		f.add(eight);
		
		JButton nine = new JButton("9");
		nine.setBounds(150,170,60,40);
		nine.setBackground(Color.gray);
		nine.setForeground(Color.white);
		f.add(nine);
		
		JButton mul = new JButton("×");
		mul.setBounds(220,170,60,40);
		mul.setBackground(Color.gray);
		mul.setForeground(Color.white);
		f.add(mul);
		
		JButton four = new JButton("4");
		four.setBounds(10,220,60,40);
		four.setBackground(Color.gray);
		four.setForeground(Color.white);
		f.add(four);
		
		JButton five = new JButton("5");
		five.setBounds(80,220,60,40);
		five.setBackground(Color.gray);
		five.setForeground(Color.white);
		f.add(five);
		
		JButton six = new JButton("6");
		six.setBounds(150,220,60,40);
		six.setBackground(Color.gray);
		six.setForeground(Color.white);
		f.add(six);
		
		JButton minus = new JButton("-");
		minus.setBounds(220,220,60,40);
		minus.setBackground(Color.gray);
		minus.setForeground(Color.white);
		f.add(minus);
		
		JButton one = new JButton("1");
		one.setBounds(10,270,60,40);
		one.setBackground(Color.gray);
		one.setForeground(Color.white);
		f.add(one);
		
		JButton two = new JButton("2");
		two.setBounds(80,270,60,40);
		two.setBackground(Color.gray);
		two.setForeground(Color.white);
		f.add(two);
		
		JButton three = new JButton("3");
		three.setBounds(150,270,60,40);
		three.setBackground(Color.gray);
		three.setForeground(Color.white);
		f.add(three);
		
		JButton plus = new JButton("+");
		plus.setBounds(220,270,60,40);
		plus.setBackground(Color.gray);
		plus.setForeground(Color.white);
		f.add(plus);
		
		JButton posinega = new JButton("+/-");
		posinega.setBounds(10,320,60,40);
		posinega.setBackground(Color.gray);
		posinega.setForeground(Color.white);
		f.add(posinega);
		
		JButton zero = new JButton("0");
		zero.setBounds(80,320,60,40);
		zero.setBackground(Color.gray);
		zero.setForeground(Color.white);
		f.add(zero);
		
		JButton dot = new JButton(".");
		dot.setBounds(150,320,60,40);
		dot.setBackground(Color.gray);
		dot.setForeground(Color.white);
		f.add(dot);
		
		JButton equalto = new JButton("=");
		equalto.setBounds(220,320,60,40);
		equalto.setBackground(Color.gray);
		equalto.setForeground(Color.white);
		f.add(equalto);
		
		
		f.getContentPane().setBackground(Color.black);
		f.getContentPane().setLayout(null);
		f.setResizable(false);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setSize(300,420);
		
		
		ActionListener buttonListener = new ActionListener() {
			private String operator = "";
			private double firstOperand = 0;
			private boolean isNewOperation = true;
			@Override
			public void actionPerformed(ActionEvent e) {
				String command = e.getActionCommand();
				if("0123456789.".contains(command)){
					if(isNewOperation) {
						t.setText(command);
						isNewOperation=false;
					}
					else {
						t.setText(t.getText() + command);
					}
				}
				else if(command.equals("C")){
					t.setText("");
					operator = "";
					firstOperand = 0;
					isNewOperation = true;
				}
				else if(command.equals("⌫")) {
					String text = t.getText();
					if(text.length()>0) {
						t.setText(text.substring(0,text.length()-1));
					}
				}
				else if(command.equals("=")) {
					double secondOperand = Double.parseDouble(t.getText());
					double result = 0;
					
					switch(operator) {
					case "+":
						result = firstOperand + secondOperand;
						break;
					case "-":
						result = firstOperand - secondOperand;
						break;
					case "÷":
						if(secondOperand!=0) {
						result = firstOperand / secondOperand;
						}
						else {
							t.setText("Error");
							return;
						}
						break;
					case "×":
						result = firstOperand * secondOperand;
						break;
					case "1/x":
						if(firstOperand!=0) {
						result = 1/firstOperand;
						}
						else {
							t.setText("Error");
							return;
						}
						break;
					case "%":
						result = firstOperand % secondOperand;
						break;
					case "x²":
						result = Math.pow(secondOperand, 2);
						break;
					case "2√x":
						result = Math.sqrt(secondOperand);
						break;
					}
					t.setText(String.valueOf(result));
					operator = "";
					isNewOperation = true;
				}
				else {
					if(!operator.isEmpty()) {
						firstOperand = Double.parseDouble(t.getText());
						t.setText("");
					}
					operator = command;
					isNewOperation = true;
				}
			}
		};
		
		zero.setActionCommand("0");
		one.setActionCommand("1");
		two.setActionCommand("2");
		three.setActionCommand("3");
		four.setActionCommand("4");
		five.setActionCommand("5");
		six.setActionCommand("6");
		seven.setActionCommand("7");
		eight.setActionCommand("8");
		nine.setActionCommand("9");
		mod.setActionCommand("%");
		ce.setActionCommand("CE");
		c.setActionCommand("C");
		del.setActionCommand("⌫");
		onebyx.setActionCommand("1/x");
		square.setActionCommand("x²");
		squareroot.setActionCommand("2√x");
		div.setActionCommand("÷");
		mul.setActionCommand("×");
		minus.setActionCommand("-");
		plus.setActionCommand("+");
		posinega.setActionCommand("+/-");
		dot.setActionCommand(".");
		equalto.setActionCommand("=");
		
		zero.addActionListener(buttonListener);
		one.addActionListener(buttonListener);
		two.addActionListener(buttonListener);
		three.addActionListener(buttonListener);
		four.addActionListener(buttonListener);
		five.addActionListener(buttonListener);
		six.addActionListener(buttonListener);
		seven.addActionListener(buttonListener);
		eight.addActionListener(buttonListener);
		nine.addActionListener(buttonListener);
		mod.addActionListener(buttonListener);
		ce.addActionListener(buttonListener);
		c.addActionListener(buttonListener);
		del.addActionListener(buttonListener);
		onebyx.addActionListener(buttonListener);
		square.addActionListener(buttonListener);
		squareroot.addActionListener(buttonListener);
		div.addActionListener(buttonListener);
		mul.addActionListener(buttonListener);
		minus.addActionListener(buttonListener);
		plus.addActionListener(buttonListener);
		posinega.addActionListener(buttonListener);
		dot.addActionListener(buttonListener);
		equalto.addActionListener(buttonListener);
		

		f.setVisible(true);
		
	}
}
