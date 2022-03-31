/**
 * Die Klasse Detektiv erbt von der Klasse Person.
 * Detektive haben ein zusätzliches Attribut "detektivbüro", das den Namen der Detektei speichert. 
 */
public class Detektiv extends Person
{
        private String detektivbüro;
    
    /**
     * Konstruktor für Objekte der Klasse Detektiv. Hier werden zunächst nur Name, Alter und Wohnort festgelegt, 
     * da nicht jeder Detektiv auch sofort einen Namen für sein Detektivbüro hat.
     */
    public Detektiv(String name, int alter, String wohnort)
    {
        super(name, alter, wohnort);
    }
    
    /**
     * Der Name der Detektei wird festgelegt.
     * 
     * @param: detektivbüro
     */
    public void setDetektivbüro(String detektivbüro) 
    {
        this.detektivbüro = detektivbüro;
    }
    
    /**
     * Der Name der Detektei wird zurückgegeben.
     * 
     * @return: detektivbüro
     */
    public String getDetektivbüro()
    {
        return detektivbüro;
    }
}
