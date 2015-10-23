class NamedCow extends Cow
{
	protected String myName;
	public NamedCow(String type, String name, String sound)
	{
		myType = type;
		myName = name;
		mySound = sound;
	}
	public String getType(){return myType;}
	public String getName(){return myName;}
	public String getSound(){return mySound;}
}