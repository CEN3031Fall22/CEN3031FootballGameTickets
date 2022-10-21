package CEN3031Group3;

import javax.swing.JFrame;

import java.awt.GridLayout;

import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

public class GameSelector extends JPanel {
	private static final double GAME1 = 5.00;	
	private static final double GAME2 = 5.00;
	private static final double GAME3 = 5.00;

	private JRadioButton game1Button;
	private JRadioButton game2Button;
	private JRadioButton game3Button;


	public double getGameCost() {
		if(game1Button.isSelected())
		return GAME1;
		
		else if (game2Button.isSelected())
			return GAME2;
		else if (game3Button.isSelected())
			return GAME3;
	else
		return 0.0;
		
		
		
	}

	public GameSelector() {
		
		super();
		
		setLayout(new GridLayout(3,1));
		setBorder(BorderFactory.createTitledBorder("Home Game Selector"));
		
		game1Button = new JRadioButton("Knights VS Panthers", true);
		game2Button = new JRadioButton("Knights VS Dragons");
		game3Button = new JRadioButton("Knights VS Mages");
		
		ButtonGroup gameGroup = new ButtonGroup();
		 gameGroup.add(game1Button);
		 gameGroup.add(game2Button);
		 gameGroup.add(game3Button);
		 
		add(game1Button);
		add(game2Button);
		add(game3Button);
		
		
	}


}
