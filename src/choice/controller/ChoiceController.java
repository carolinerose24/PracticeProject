package choice.controller;

import javax.swing.JOptionPane;
import javax.swing.ImageIcon;

import choice.model.Shark;

public class ChoiceController
{
	
	private Shark myShark;
	private Shark [] Sharky = new Shark [3];
	private ImageIcon [] icons = new ImageIcon [6];
	

	private void arrayInitialization()
	{
		JOptionPane.showMessageDialog(null, "THE MEG IS HERE!!", "Shark Week", JOptionPane.INFORMATION_MESSAGE, icons [0]);
		JOptionPane.showMessageDialog(null, "MegaShark v MechaShark!!", "Shark Week", JOptionPane.INFORMATION_MESSAGE, icons [1]);
		
		
		for (int index = 0; index < Sharky.length; index ++)
		{
			if (index % 2 == 0)
			{
				Sharky[index] = new Shark();
			}
			else
			{
			//	Sharky[index] = new Shark(index * 30);
			}
		}
	}
	
	//Double click left near number to add a breakpoint
	
	
	
	public ChoiceController()
	{
		//myShark = new Shark("Sharktopus", 1, true);
		
		icons[0] = new ImageIcon(getClass().getResource("/choice/view/images/MegImage.jpg"));
		icons[1] = new ImageIcon(getClass().getResource("/choice/view/images/MMSharkImage.jpg"));
		icons[2] = new ImageIcon(getClass().getResource("/choice/view/images/SantaJaws2.jpg"));
		icons[3] = new ImageIcon(getClass().getResource("/choice/view/images/SantaJawsImage.jpg"));
		icons[4] = new ImageIcon(getClass().getResource("/choice/view/images/shark11.png"));
		icons[5] = new ImageIcon(getClass().getResource("/choice/view/images/Sharktopus.JPG"));

		Sharky[0] = new Shark ("THE MEG", 1 , false);
		Sharky[1] = new Shark ("SHARKTOPUS", 1 , true);
		Sharky[2] = new Shark ("5 HEADED SHARK", 5 , false);


	}
	
	public Shark getShark()
	{
		return myShark;
	}
	
	public void setShark(Shark myShark)
	{
		this.myShark = myShark;
	}
	
	
	public void start()
	{
		arrayInitialization();
//		String nameOfShark = JOptionPane.showInputDialog("What is the name of your shark?");
//		String numberOfHeads = JOptionPane.showInputDialog("How many heads does your shark have?");
//		String hasModifications = JOptionPane.showInputDialog("Does your shark have modifications?");

	}
}
