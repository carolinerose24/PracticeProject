package choice.model;

public class Shark
{
			
	private String nameOfShark;
	private int numberOfHeads;
	private boolean hasModifications;


	
	
	public Shark()
	{
		
	}
	
	public Shark(String nameOfShark, int numberOfHeads, boolean hasModifications)
	{
		this.nameOfShark = nameOfShark;
		this.numberOfHeads = numberOfHeads;
		this.hasModifications = hasModifications;
	}
	
	
	
	public String getNameOfShark()
	{
		return nameOfShark;
	}
	public int getNumberOfHeads()
	{
		return numberOfHeads;
	}
	public boolean getHasModifications()
	{
		return hasModifications;
	}
	
	
	public void setNameOfShark(String nameOfShark)
	{
		this.nameOfShark = nameOfShark; 
	}	
	
	public void setNumberOfHeads(int numberOfHeads)
	{
		this.numberOfHeads = numberOfHeads; 
	}	
	
	public void setHasModifications(boolean hasModifications)
	{
		this.hasModifications = hasModifications; 
	}
}
