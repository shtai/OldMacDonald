class Chick implements Animal 
{     
    private String myType;     
     private String mySound;   
        private String myName;    
     public Chick(String type, String name, String sound)     
     {         
         myType = type;         
         mySound = sound; 
         myName = name;    
     }     
     public Chick()     {         
         myType = "unknown";         
         mySound = "unknown";  
         myName = "blah";   
     }      
     public String getSound(){return mySound;}     
     public String getType(){return myType;}
     public String getName(){return myName;}
 } 