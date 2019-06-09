

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

			int valueInt = Integer.parseInt(argString);
			double valueDouble = Double.parseDouble(argString);
		
			if((double)valueInt == valueDouble) {
				System.out.println(" (double)valueInt == valueDouble ");
				argString = " " + valueInt + '.';
		        } else { 
				System.out.println(" (double)valueInt != valueDouble ");	
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
 
			//System.out.println("r: " + rightValue + "; l: " + leftValue + "; arg: " + argString);			

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
                //System.out.println("r: " + rightValue + "; l: " + leftValue + "; arg: " + argString);
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

