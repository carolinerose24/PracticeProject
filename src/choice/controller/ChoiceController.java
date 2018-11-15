package choice.controller;

import javax.swing.JOptionPane;

import choice.model.Shark;

public class ChoiceController
{
	
	private Shark myShark;
	
	public ChoiceController()
	{
		myShark = new Shark("Sharktopus", 1, true);
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
		String nameOfShark = JOptionPane.showInputDialog("What is the name of your shark?");
		String numberOfHeads = JOptionPane.showInputDialog("How many heads does your shark have?");
		String hasModifications = JOptionPane.showInputDialog("Does your shark have modifications?");

	}
}
