
import java.lang.NumberFormatException;

class Model {

	Viewer viewer;
    	String argString;
   	String leftValue; 
	String rightValue;
    	char action;
  
	Model(Viewer viewer) {
		
		this.viewer = viewer;
        	argString = "";
        	leftValue = "";
		rightValue = "";
        	action = ' ';
	
	}

	public void takeDigit(char digit) {
		
		argString = argString + digit;

		viewer.updateValue(argString);
	}
        

	public void pasteDot() {
		
		if(argString == "") {
			argString = "0.";
			
		} else {		
			
			double valueDouble = Double.parseDouble(argString);
			
		        int valueInt =  (int)valueDouble;

			if((double)valueInt == valueDouble) {
				argString = " " + valueInt + '.';
		        
			}
		}

		viewer.updateValue(argString);
	}

	
	public void doAction(char command) {

		if(argString == "") {
			return;
		}
		
		if(command != '=') {
 
			leftValue = argString;
			rightValue = "";
			argString = "";

			viewer.updateCommand(leftValue + " " + command);
		        action = command;
			
		} else {
                       
			viewer.updateCommand("");
 
			if(rightValue == "") {
				rightValue = argString;
			}
			        	
			double value = 0;
	
			double numLeft = Double.parseDouble(leftValue);
			double numRight = Double.parseDouble(rightValue);

			switch(action) {
					
				case '+':
					value = numLeft + numRight;
					break;	
			
				case '-':
					value = numLeft - numRight;
					break;

				case '*':
					value = numLeft * numRight;
					break;

				case '/':
					value = numLeft / numRight;
					break;

			}
			
			if(value != 0) {
				
				argString = "" + value;
				
				if(value == (int)value) {
					argString = "" + (int)value;
				}
				
				leftValue = argString;
			}

		}

		viewer.updateValue(argString);
	
	}

	public void reset() {
		leftValue = "";
		rightValue = "";
		argString = "";
		action = ' ';
		viewer.updateValue(argString);
		viewer.updateCommand("");
	}

}

