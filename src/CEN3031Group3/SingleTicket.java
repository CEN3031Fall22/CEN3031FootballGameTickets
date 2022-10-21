package CEN3031Group3;

import java.awt.GridLayout;

import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

public class SingleTicket extends JPanel{
	private static final double SingleTicket = 10.00;
	private static final double SeasonPass = 125.00;

	private JRadioButton singleTicketButton;
	private JRadioButton seasonPassButton;

	public double getTicketCost() {
		if(singleTicketButton.isSelected())
		return SingleTicket;
		
		else if (seasonPassButton.isSelected())
			return SeasonPass;
	else
		return 0.0;
		
		
		}

	public SingleTicket() {
		
		super();
		
		setLayout(new GridLayout(2,1));
		setBorder(BorderFactory.createTitledBorder("Tickets"));
		
		singleTicketButton = new JRadioButton("Single Ticket", true);
		seasonPassButton = new JRadioButton("Season Pass");
		
		ButtonGroup ticketGroup = new ButtonGroup();
		ticketGroup.add(singleTicketButton);
		ticketGroup.add(seasonPassButton);
		add(singleTicketButton);
		add(seasonPassButton);
		
		
		
	}


}
