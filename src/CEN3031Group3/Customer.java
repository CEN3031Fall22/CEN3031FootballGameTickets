package CEN3031Group3;
import javax.swing.JFrame;

import java.awt.GridLayout;

import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.JCheckBox;
import javax.swing.JPanel;
import javax.swing.JRadioButton;


public class Customer extends JPanel{
	
		
		private static final double StudentPrice = 10.00;
		private static final double StaffPrice = 7.50;
		private static final double GuestPrice = 12.00;
		
		
		private JRadioButton StudentButton;
		private JRadioButton StaffButton;
		private JRadioButton GuestButton;

	public double getAddOnsCost() {
		
		
		

		if (StudentButton.isSelected())
			return StudentPrice;
		

		else if (StaffButton.isSelected())
			return StaffPrice;
		
		else if (GuestButton.isSelected())
			return GuestPrice;
		else
		return 0;
		
		
		
	}
	public Customer() 
	{
		super();
		setLayout(new GridLayout(3,1));
		setBorder(BorderFactory.createTitledBorder("Customer"));
		
		StudentButton = new JRadioButton("Student", true);
		GuestButton = new JRadioButton("Guest");
		StaffButton = new JRadioButton("Staff");
		
		ButtonGroup gameGroup = new ButtonGroup();
		 gameGroup.add(StudentButton);
		 gameGroup.add(GuestButton);
		 gameGroup.add(StaffButton);
		
		add(StudentButton);
		add(StaffButton);
		add(GuestButton);
		
	}
	 


}
