
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JFrame;

class Viewer {

	JTextField value;
        JLabel textCommand;

	Viewer() {
		
		Controller controller = new Controller(this);

		value = new JTextField();
		value.setBounds(10, 30, 215, 20);
        	value.setHorizontalAlignment(JTextField.RIGHT);

 		textCommand = new JLabel("");
		textCommand.setBounds(10, 5, 215, 20);
        	textCommand.setHorizontalAlignment(JTextField.RIGHT);

		JButton buttonCE = new JButton("CE");
        	buttonCE.setBounds(230, 30, 50, 20);
        	buttonCE.addActionListener(controller);
        	buttonCE.setActionCommand("reset");

		JButton button0 = new JButton("0");
        	button0.setBounds(10, 235, 105, 50);
        	button0.addActionListener(controller);
        	button0.setActionCommand("0");
 
		JButton button1 = new JButton("1");
        	button1.setBounds(10, 180, 50, 50);
        	button1.addActionListener(controller);
        	button1.setActionCommand("1");

                JButton button2 = new JButton("2");
        	button2.setBounds(65, 180, 50, 50);
        	button2.addActionListener(controller);
        	button2.setActionCommand("2");

                JButton button3 = new JButton("3");
        	button3.setBounds(120, 180, 50, 50);
        	button3.addActionListener(controller);
        	button3.setActionCommand("3");
                
		JButton button4 = new JButton("4");
        	button4.setBounds(10, 125, 50, 50);
        	button4.addActionListener(controller);
        	button4.setActionCommand("4");

		JButton button5 = new JButton("5");
        	button5.setBounds(65, 125, 50, 50);
        	button5.addActionListener(controller);
        	button5.setActionCommand("5");

		JButton button6 = new JButton("6");
        	button6.setBounds(120, 125, 50, 50);
        	button6.addActionListener(controller);
        	button6.setActionCommand("6");

		JButton button7 = new JButton("7");
        	button7.setBounds(10, 70, 50, 50);
        	button7.addActionListener(controller);
        	button7.setActionCommand("7");

		JButton button8 = new JButton("8");
        	button8.setBounds(65, 70, 50, 50);
        	button8.addActionListener(controller);
        	button8.setActionCommand("8");

		JButton button9 = new JButton("9");
        	button9.setBounds(120, 70, 50, 50);
        	button9.addActionListener(controller);
        	button9.setActionCommand("9");

		JButton buttonPlus = new JButton("+");
        	buttonPlus.setBounds(230, 125, 50, 50);
        	buttonPlus.addActionListener(controller);
        	buttonPlus.setActionCommand("plus");

		JButton buttonMinus = new JButton("-");
        	buttonMinus.setBounds(175, 125, 50, 50);
        	buttonMinus.addActionListener(controller);
        	buttonMinus.setActionCommand("minus");

		JButton buttonMultiplication = new JButton("*");
        	buttonMultiplication.setBounds(230, 70, 50, 50);
        	buttonMultiplication.addActionListener(controller);
        	buttonMultiplication.setActionCommand("multiplication");

		JButton buttonDivision = new JButton("/");
        	buttonDivision.setBounds(175, 70, 50, 50);
        	buttonDivision.addActionListener(controller);
        	buttonDivision.setActionCommand("division");

		JButton buttonDot = new JButton(",");
        	buttonDot.setBounds(120, 235, 50, 50);
        	buttonDot.addActionListener(controller);
        	buttonDot.setActionCommand("dot");

		JButton buttonEqual = new JButton("=");
        	buttonEqual.setBounds(230, 180, 50, 105);
        	buttonEqual.addActionListener(controller);
        	buttonEqual.setActionCommand("equal");

		JLabel label1 = new JLabel("feature 1:   command indicator");
		label1.setBounds(10, 300, 200, 15);
        	label1.setForeground(java.awt.Color.blue);

		JLabel label2 = new JLabel("feature 2:   5 + 2 ===== 15");
		label2.setBounds(10, 320, 200, 15);
        	label2.setForeground(java.awt.Color.blue);

		JLabel label3 = new JLabel("feature 3:   CE -> . -> 0.");
		label3.setBounds(10, 340, 200, 15);
        	label3.setForeground(java.awt.Color.blue);

		JLabel label4 = new JLabel("Frolov Dmitrii");
		label4.setBounds(10, 350, 250, 15);
        	label4.setForeground(java.awt.Color.red);
                label4.setHorizontalAlignment(JTextField.RIGHT);
                
		
		JFrame frame = new JFrame("Calc");
        	frame.setSize(300, 400);
		frame.setLocation(400, 100);
        	frame.setLayout(null);
        	frame.setResizable(false);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                
        	frame.add(value);
		frame.add(textCommand);
		frame.add(buttonCE);
 		
		frame.add(button0);
 		frame.add(button1);
 		frame.add(button2);
 		frame.add(button3);
 		frame.add(button4);
 		frame.add(button5);
 		frame.add(button6);
 		frame.add(button7);
 		frame.add(button8);
 		frame.add(button9);
 		
		frame.add(buttonPlus);
		frame.add(buttonMinus);
		frame.add(buttonMultiplication);
		frame.add(buttonDivision);
		
		frame.add(buttonDot);
		frame.add(buttonEqual);

		frame.add(label1);
		frame.add(label2);
		frame.add(label3);
		frame.add(label4);

		
		frame.setVisible(true);
	}

	public void updateValue(String text) {
        	value.setText(text);
    	}

	public void updateCommand(String text) {
        	textCommand.setText(text);
    	}
}

