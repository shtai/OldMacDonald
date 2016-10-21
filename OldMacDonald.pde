void setup()
{
	size(500,500);
}

public void setup() {     
    Cow c = new Cow("cow", "moo");   
    System.out.println(c.getType() + " goes " + c.getSound());  
}

interface Animal
{
	public String getSound();
	public String getType();
}
