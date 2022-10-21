package CEN3031Group3;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;



public class FootballTicketOrderCalculation extends JFrame{

	private static final double FlordiaTax = 0.075;
	private SingleTicket singleTicketPanel;
	private Customer othersPanel;
    private GameSelector gamesPanel;
	private JPanel buttonPanel;
	private JPanel centerPanel;
	private JButton totalButton;
	private JButton closeButton;
	
	public FootballTicketOrderCalculation(){
		
		super("Football Ticket Calculator");
		setLayout(new BorderLayout());
		singleTicketPanel = new SingleTicket();
		othersPanel = new Customer();
		gamesPanel = new GameSelector();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		buildButtonPanel();
		add(singleTicketPanel, BorderLayout.WEST);
		add(othersPanel, BorderLayout.CENTER);
		add(gamesPanel, BorderLayout.EAST);
		add(buttonPanel, BorderLayout.SOUTH);
		pack();
		setVisible(true);
	}

	

	private void buildButtonPanel() {
		// TODO Auto-generated method stub
		buttonPanel = new JPanel();
		totalButton = new JButton("Calculate");
		closeButton = new JButton("Exit");
		
		buttonPanel.add(totalButton);
		buttonPanel.add(closeButton);
		
		totalButton.addActionListener(new TotalButtonListener());
		closeButton.addActionListener(new CloseButtonListener());
		}

	
	public class TotalButtonListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			double subTotal = singleTicketPanel.getTicketCost() + othersPanel.getAddOnsCost() + gamesPanel.getGameCost();
			double salesTax = subTotal * FlordiaTax;
			double finalTotal = subTotal + salesTax;
			
			String recipt = String.format("Subtotal: $%.2f\nTax: $%.2f\nTotal: $%.2f",subTotal,salesTax,finalTotal);
			JOptionPane.showMessageDialog(null, recipt);
		}
	}
		
	public class CloseButtonListener implements ActionListener {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				System.exit(0);
			}
		
	}
	
}
