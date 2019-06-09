
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class Controller implements ActionListener {

	Model model;

	Controller(Viewer viewer) {
		model = new Model(viewer);
	}


	public void actionPerformed(ActionEvent event) {

		String command = event.getActionCommand();

		//System.out.println("" + command);		

		if(command.equals("equal")) {
			model.doAction('=');
	        
		} else if(command.equals("plus")) {
			model.doAction('+');
	        
		} else if(command.equals("minus")) {
			model.doAction('-');
	        
		} else if(command.equals("multiplication")) {
			model.doAction('*');
	        
		} else if(command.equals("division")) {
			model.doAction('/');
	        
		} else if(command.equals("dot")) {
			model.pasteDot();
	        
		} else if(command.equals("reset")) {
			model.reset();
		
		} else {
			model.takeDigit(command.charAt(0));
		}
        	
	}
}

