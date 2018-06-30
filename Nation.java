
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
 */

public class Nation
{

    /* 
     * Instanzvariablen 
     * 
     * An dieser Stelle werden die Instanzvariablen festgelegt:
     * 1. Essentielle Eigenschaften wie der Nationenname,
     *    die erreichten Gesamtpunkte und Tortreffer einer teilnehmenden Nation 
     *       
     * 2. ein Array, in dem die Informationen gesammelt gespeichert
     *    werden sollen. Es hat 3 Speicherplätze
     *    
     */

    private String nationName; // Nationenname als Datentyp String
    private int nationGoals; // Gesamttore einer Nation als Datentyp Integer
    private int gameGoals; // Tore für ein Spiel als Datentyp Integer
    private int nationPoints;  // Gesamtpunkte einer Nation als Datentyp Integer

    /*
     * Konstruktor
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
     * Update der Punkte und Tore einer Nation
     * 
     */

    public String setUpdatedInfo (int newGoals, int newPoints)
    {
        this.nationGoals += newGoals;
        this.nationPoints += newPoints;
        return getInformation();
    }

    /*
     * Die Tore einer Nation werden gesetzt
     * 
     */

    public String setGameGoals(int goals)
    {
        this.gameGoals = goals;
        return Integer.toString(gameGoals);
    }

}
