
/**
 * 
 *   Ana Keser 
 *   3.Semester
 *   Internet der Dinge 
 *   HfG Schwäbisch Gmünd
 *   
 *   Projektabgabe
 *   Programmiersprachen 2: Java
 *   
 *   Dieser Code ist die Prüfungsleistung für das Fach 
 *   Programmiersprachen 2. 
 *   
 */

/*
 *  Die Klasse Nation ist für Informationen zu teilnehmenden Spielnationen der 
 *  Weltmeisterschaft verantwortlich. Sowohl die Klasse Groups, als auch die 
 *  Klasse Game beziehen sich auf Methoden der Klasse Nation, um landesspezi-
 *  fische Details zu erhalten.
 * 
 *  Folgende Methoden sind in der Klasse Nation implementiert:
 *  - setInformation(int nationGoals, int nationPoints);
 *  - getInformation();
 *  - getInformationArray();
 *  
 */

public class Nation
{
    
    /* 
     * Instanzvariablen 
     * 
     * An dieser Stelle werden die Instanzvariablen festgelegt:
     * 1. Essentielle Eigenschaften wie der Nationenname,
     *    die erreichten Punkte und Tortreffer einer teilnehmenden Nation 
     * 2. ein Array, in dem die Informationen gesammelt gespeichert
     *    werden sollen. Es hat 3 Speicherplätze
     *    
     */
    
    private String nationName; // Nationenname als Datentyp String
    private int nationGoals; // Gesamttore einer Nation als Datentyp Integer
    private int gameGoals;
    private int nationPoints;  // Gesamtpunkte einer Nation als Datentyp Integer

    /*
     * Konstruktor
     * 
     * Im Konstruktor werden die Attribute initialisiert.
     * 
     * Beim Erzeugen einer Instanz sollen über Parameter der Nationenname
     * (String nationName), die Gesamttore (int nationGoals) und die Gesamt-
     * punkte (int nationPoints) übergeben werden. Den Instanzvariablen wird
     * dafür der Wert der Parametereingaben zugewiesen. Dies geschieht im Falle
     * des Nationennamen direkt im Konstruktur (this.nationName = nationName).
     * Gesamtpunktzahl und -tore werden indirekt zugewiesen, indem sie zu Parametern 
     * der Methode setInformation() werden. Auch diese wird beim Erzeugen einer 
     * neuen Instanz aufgerufen (Informationen zur Methode weiter unten). 
     *
     * Außerdem wird eine ArrayList mit dem Namen nationInfo erzeugt.
     * 
     */
    
    public Nation(String nationName, int gameGoals, int nationGoals, int nationPoints)
    {
        this.nationName = nationName;
        this.gameGoals = 0;
        setInformation(nationGoals,nationPoints);
    }

    /*
     * Die Methode setInformation() liefert als Rückgabe das Array info
     * mit Strings. Das Array wird in dieser Methode erstellt. Es beinhaltet
     * die landesspezifischen Detailinformationen wie Nationenname, Gesamttore und
     * -punkte. Da Tore und Punkte vom Datentyp Integer sind, müssen diese zu 
     * Strings umgewandelt werden (z.B. Integer.toString(this.nationGoals)). Würde
     * man dies nicht tun, könnte aufgrund der unterschiedlichen Datentypen kein 
     * String-Array zurückgeliefert werden können.
     * 
     * Zuvor wurden die Übergabeparameter int nationGoals und int nationPoints
     * den Instanzvariablen nationGoals bzw. nationPoints zugewiesen. Dies ist 
     * notwendig, um die Methode im Konstruktor sinnvoll einzubinden. Dort erfolgt 
     * die Initialisierung der Instanzvariablen indirekt über diese Methode.
     * 
     */
    
    public void setInformation(int nationGoals, int nationPoints)
    {
        this.nationGoals = nationGoals;
        this.nationPoints = nationPoints;
    }

    /*
     * Die Methode getInformation() besitzt den Rückgabetyp String. Sie liefert
     * die wichtigen Instanzattribute gesammelt als String zurück. 
     * Auch hier müssen die Integer nationGoals und nationPoints zu Strings 
     * umgewandelt werden, damit eine einheitliche Rückgabe möglich ist.
     * 
     */
    
    public String getInformation ()
    {
        return nationName + "," + Integer.toString(this.nationGoals) + "," + Integer.toString(this.nationPoints);
    }
 
    /*
     * Diese Methode ist der vorherigen sehr ähnlich. Beide liefern bei Aufruf die 
     * selben Informationen. Im Gegensatz zu getInformation() wird hier jedoch kein 
     * String zurückgegeben, sondern ein Array mit Strings. Ich habe bewusst 
     * beide Methoden geschrieben, um in anderen Klassen je nach Bedarf auf eine 
     * der beiden Methoden zurückgreifen zu können.
     * 
     * nationName, nationGoals und nationPoints werden zum Array nationInfo mithilfe
     * des Index hinzugefügt(z.B. nationInfo[0]=this.nationName;) und am Ende 
     * der Methode mit dem Returnstatement zurückgegeben. Auch hier müssen die Tore
     * und Punkte in Strings umgewandelt werden. 
     * 
     * An dieser Stelle könnte auch eine ArrayList verwenden werden. Ich habe mich 
     * jedoch für ein Array entschieden, da die Anzahl der Instanzmerkmale fix ist
     * und im Laufe des Spiels keine weiteren definiert und ergänzt werden.
     * 
     */
    
    public String[] getInformationArray ()
    {
        String[] nationInfo = {"","",""};
        nationInfo[0]=this.nationName;
        nationInfo[1]=Integer.toString(this.nationGoals); 
        nationInfo[2]=Integer.toString(this.nationPoints);
        return nationInfo;
    }
    
    public String setUpdatedInfo (int newGoals, int newPoints)
    {
        this.nationGoals += newGoals;
        this.nationPoints += newPoints;
        return getInformation();
    }
    
    public String setGameGoals(int goals)
    {
      this.gameGoals = goals;
      return Integer.toString(gameGoals);
    }
    
     public String getGameGoals (int gameGoals)
    {
        this.gameGoals = gameGoals;
        return getGameInformation();
    }
    
    public String getGameInformation ()
    {
        return Integer.toString(this.nationGoals) + Integer.toString(this.nationPoints);
    }
    
    public int getGoalsNation()
    {
        return this.nationGoals;
    }
}
