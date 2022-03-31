/**
 * Die Klasse Gangster erbt von der Klasse Person.
 * Gangster haben ein zusätzliches Attribut "gefängnis", das speichert, ob ein Gangster schon mal im Gefängnis saß oder nicht. 
 */
public class Gangster extends Person
{
    
    
     /**
     * Konstruktor für Objekte der Klasse Gangster. Hier werden zunächst nur Name, Alter und Wohnort festgelegt.
     */
    public Gangster(String name, int alter, String wohnort)
    {
        super(name, alter, wohnort);
    }
    
    
}
