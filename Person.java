/**
 * Jede Person hat einen Namen, ein gewisses Alter und einen Wohnort.
 * 
 * Start des Projekts: C.P.
 * Weiterführung des Projekts: (trage hier deinen Namen bzw. deine Initialen ein)
 */
public class Person
{
   protected String name;
   protected int alter; 
   protected String wohnort;  

    /** 
     * Konstruktor für Objekte der Klasse Person.
     * Der Name, das Alter und der Wohnort müssen übergeben werden. 
     */ 
    public Person(String name, int alter, String wohnort) 
    { 
        this.name = name;
        this.alter = alter; 
        this.wohnort = wohnort;
    } 

    /**
     * Das Alter wird zurückgegeben.
     * @return: alter
     */
    public int getAlter()
    {
        return alter; 
    } 
}
