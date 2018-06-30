import java.util.HashMap;
import java.util.ArrayList;

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
 *  Die Klasse Groups regelt die Datenverwaltung von Informationen zu teilnehmenden 
 *  Spielgruppen der Weltmeisterschaft. Sie bezieht sich teilweise auf Methoden 
 *  der Klasse Nation. 
 */

public class Groups
{
    /* 
     * Instanzvariablen 
     * 
     * An dieser Stelle werden die Instanzvariablen festgelegt:
     * 1. Wichtige Eigenschaften einer Gruppe wie Gruppengröße und Gruppenname
     * 2. Eine HashMap mit Namen nations, in der der Key ein String und der 
     *    Value ein Objekt des Typs Nation ist
     * 3. 2 ArrayLists results und gameResults, welche für die Spielergebnisse und Paarungen 
     *    wichtig sind
     *    
     */ 

    private int groupSize;
    private String groupName; 
    private HashMap<String, Nation> nations; 
    private ArrayList <String> gameResults; 
    private ArrayList <String> results;

  

    /*
     * Konstruktor
     * 
     * Im Konstruktor werden die Attribute initialisiert.
     * 
     * Beim Erzeugen einer Instanz soll über Parametereingabe der Gruppenname
     * (String groupName) übergeben werden. Dieser Parameterwert wird dem Instanz-
     * attribut groupName zugewiesen (this.groupName= groupName). Die Zuweisung ist
     * für die aufzurufende Methode setGroup() von essentieller Bedeutung. 
     * 
     * Außerdem wird eine neue HashMap mit dem Namen nations erzeugt.
     * 
     */

    public Groups(String groupName)
    {
        this.groupName= groupName;
        nations = new HashMap<String,Nation>();
        gameResults = new ArrayList<>();
        results = new ArrayList <>();
        setGroup();
    }

    /* 
     * Die Methode setGroup() besteht aus verschiedenen if-Abfragen, welche die 
     * Inhalte der HashMap nations über den Gruppennamen regeln. Im Konstruktor wird
     * über einen String Parameter der Gruppenname übergeben. Dieser Wert wird in 
     * der Instanzvariable groupName gespeichert, welche in den if-Abfragen mit 
     * den tatsächlichen Gruppennamen A-H verglichen wird. Entspricht der Wert 
     * des groupName einem der Buchstaben, werden gruppenspezifische Informa-
     * tionen in die nations HashMap eingefügt. Dabei ist der Schlüssel ein String 
     * mit dem Nationennamen und der Wert ein Objekt des Typs Nation. Das Nation-
     * objekt benötigt die Parameterwerte für Nationenname, Gesamttore und 
     * -punkte (Nation(String nationName, int nationGoals, int nationPoints)).
     * 
     * Ist keiner der Buchstaben A-H gleich der Instanzvariable groupName, werden 
     * keine Inhalte in die HashMap eingefügt. Mit der Methode addNationToGroup() 
     * kann man die HashMap befüllen.
     * 
     * WIESO PRIVAT
     * Ergänzung nur Buchstaben
     */

    private void setGroup()
    {     
        if (groupName == "A") 
        {
            nations.put("Russland",new Nation("Russland",0, 0,0));
            nations.put("Uruguay",new Nation("Uruguay",0, 0,0));
            nations.put("Ägypten",new Nation("Ägypten",0, 0,0));
            nations.put("Saudi-Arabien",new Nation("Saudi-Arabien",0, 0,0));
        }
        else if (this.groupName == "B")
        {
            nations.put("Iran", new Nation ("Iran",0, 0,0));
            nations.put("Portugal", new Nation ("Portugal",0, 0,0));
            nations.put("Spanien", new Nation ("Spanien",0, 0,0));
            nations.put("Marokko", new Nation ("Marokko",0, 0,0));
        }
        else if (groupName == "C")
        {
            nations.put("Frankreich", new Nation ("Frankreich",0, 0,0));
            nations.put ("Dänemark", new Nation ("Dänemark",0, 0,0));
            nations.put ("Australien", new Nation ("Australien",0, 0,0));
            nations.put("Peru", new Nation ("Peru",0, 0,0));
        }
        else if (groupName == "D")
        {
            nations.put("Kroatien", new Nation ("Kroatien",0, 0,0));
            nations.put ("Argentinien",new Nation ("Argentinien",0, 0,0));
            nations.put("Island", new Nation ("Island",0, 0,0));
            nations.put("Nigeria",new Nation ("Nigeria",0, 0,0));
        }
        else if (groupName =="E")
        {
            nations.put("Serbien",new Nation ("Serbien",0, 0,0));
            nations.put("Brasilien", new Nation ("Brasilien",0, 0,0));
            nations.put("Schweiz",new Nation ("Schweiz",0, 0,0));
            nations.put("Costa Rica", new Nation ("Costa Rica",0, 0,0));
        }
        else if (groupName == "F")
        {
            nations.put("Mexiko", new Nation ("Mexiko",0, 0,0));
            nations.put ("Schweden", new Nation ("Schweden",0, 0,0));
            nations.put("Südkorea", new Nation ("Südkorea",0, 0,0));
            nations.put("Deutschland", new Nation ("Deutschland",0, 0,0));
        }
        else if (groupName == "G")
        {
            nations.put("Belgien", new Nation ("Belgien",0, 0,0));
            nations.put("Panama" , new Nation ("Panama",0, 0,0));
            nations.put("Tunesien", new Nation ("Tunesien",0, 0,0));
            nations.put("England", new Nation ("England",0, 0,0));
        }
        else if (groupName == "H")
        {
            nations.put("Polen", new Nation ("Polen",0, 0,0));
            nations.put("Senegal", new Nation ("Senegal",0, 0,0));
            nations.put("Kolumbien", new Nation ("Kolumbien",0, 0,0));
            nations.put("Japan", new Nation ("Japan",0, 0,0));
        }
        else {
            // nur H zulassen, keine Zahlen, Methode neue Gruppe erstellen aufrufen
            System.out.println("Du hast eine neue Gruppe mit dem Namen " + groupName + " erstellt.");
        }
    }

    /*
     * Prüft, ob eine Nation (ein Key) in der HashMap ist.
     * 
     */
    public boolean containsNation (String nationName)
    {
        if (nations.containsKey(nationName))
        {
            return true;
        }
        else 
        {
            return false;
        }
    }

    /*
     * Mit dieser Methode kann man alle Informationen zu einer Nation abfragen.
     * Sie prüft zunächst mithilfe der containsKey()-Methode der HashMap Library 
     * über eine if-Abfrage, ob eine Nation bzw. ein Schlüssel in der HashMap 
     * enthalten ist. Falls der Key enthalten ist, wird über die get()-Methode der
     * zugewiesene Wert aus der HashMap geholt und zurückgegeben.
     * 
     * Der String Rückgabetyp der Methode erwartet ein Returnstatement, deshalb
     * muss am Ende return stehen.
     */

    public String getNationInformation(String key)
    {
        if (containsNation(key) == false)
        {
            System.out.println("Check Input. Keine Informationen zu dieser Nation verfügbar.");
        }
        else  {
            Nation nationInfo = nations.get(key);
            return nationInfo.getInformation();
        }
        return null;
    }

    /*
     * Die Methode getGroupSize() liefert über die size()-Methode die Anzahl der 
     * Elemente in der HashMap nations. 
     */

    public int getGroupSize()
    {
        return nations.size();
    }

    /*
     * Möchte man eine Nation einer Spielgruppe hinzufügen, hilft die Methode 
     * addNationToGroup() weiter. Es wird ein neuer HashMap Inhalt erzeugt, der wie
     * zuvor auch als Key einen Datentyp String und ein neues Objekt vom Typ Nation
     * als Wert erhält. 
     * 
     * Mit dieser Methode können Nationen zu jeder Instanz hinzugefügt werden. Dabei 
     * spielt es keine Rolle, ob die HashMap bereits Einträge beinhaltet oder nicht.
     */

    public int addNationToGroup(String nationName, int nationGoals, int nationPoints)
    {
        nations.put(nationName, new Nation(nationName, 0, nationGoals, nationPoints));
        return getGroupSize();
    }

    /*
     * Eine Nation kann aus einer Gruppe entfernt werden.
     * 
     */public int removeNationFromGroup(String nationName)
    {
        nations.remove(nationName);
        return getGroupSize();
    }

    /*
     * Ein Update zu den Details einer Nation kann man mit dieser Methode erreichen. 
     * Es werden String nationName, int newGoals und int newPoints als Parameter über-
     * geben. In das Nation-Objekt nationUpdate wird mithilfe der get()-Methode und
     * dem Parameter nationName (entspricht einem Schlüssel der HashMap nations) der
     * entsprechende HashMap Wert gespeichert. Die Methode getUpdatedInfo() benötigt
     * 2 Integer Parameter für Tore und Punkte, die zum alten Stand addiert werden. 
     * Hier werden newGoals und newPoints eingesetzt. Es wird ein Array aus Strings 
     * zurückgeliefert. 
     * 
     */

    public String updateNationInfo(String nationName, int newGoals, int newPoints)
    {
        Nation nationUpdate = nations.get(nationName);
        return nationUpdate.setUpdatedInfo(newGoals, newPoints);
    }

     /* 
     * Die Methode getAllNations() liefert eine ArrayList, in der alle Nationen 
     * beinhaltet sind. So kann man sich einen Überblick verschaffen, welche 
     * Nationen in einer Gruppe zu finden sind. 
     * 
     * Die For-Each Schleife läuft einmal alle Schlüssel der HashMap nations durch.
     * Dabei hilft die Methode keySet() der HashMap Library. Jeder Key wird zur 
     * lokalen ArrayList allNationsKeys als String hinzugefügt. Die komplette 
     * ArrayList wird am Ende der Methode zurückgeliefert.
     * 
     * Man hätte an dieser Stelle auch ein Array verwenden können. Allerdings bietet 
     * die ArrayList den Vorteil beliebig viele Nationen zurückzugeben. Problematisch
     * wäre eine Array Rückgabe, wenn es mehr Nationen als Speicherplätze im Array 
     * gäbe. Dann würden nicht alle Teilnehmer gezeigt werden. Man könnte dem vor-
     * beugen, in dem man mit einer if-Abfrage in der Methode addNationToGroup()
     * festlegt, dass nur eine bestimmte Anzahl an Nationen pro Gruppe erlaubt sind
     * (size()-Methode).Wird dieser Wert erreicht, wird keine weitere Nation 
     * zugelassen.
     * 
     */
    
    public ArrayList <String> getAllNations(){
        ArrayList <String> allNations = new ArrayList<>();
        for (String key : nations.keySet())
        {
            allNations.add(key);
        }
        return allNations;
    }

    /*
     * Hier werden alle Werte der nations HashMap ausgegeben.
     * 
     */

    public ArrayList <String> getAllValues()
    {
        ArrayList <Nation> nationKeys = new ArrayList<>();
        ArrayList <String> info = new ArrayList<>();
        for (String key: nations.keySet()) {
            nationKeys.add(nations.get(key));
        }
        for (int i = 0; i<nationKeys.size();i++) {
            Nation values = nationKeys.get(i);
            info.add(values.getInformation());
        }
        return info;
    }

    /*
     * Ein Spielergebnis wird in einer ArrayList gespeichert und die Nationeninformationen
     * bekommen ein Update.
     * 
     */
    
    public ArrayList <String> setResult(String nation1, String nation2, int goals1, int goals2)
    {
        ArrayList <String> savedKeys = new ArrayList<>();
        ArrayList <Nation> nation = new ArrayList<>();

        int points1=0;
        int points2=0;

       
        if (goals1 > goals2) 
        {points1=3;}
        if (goals1 < goals2) 
        {points2=3;}
        if(goals1 == goals2){
            points1=1;
            points2=1;
        }

        for (String key : nations.keySet())
        {
            savedKeys.add(key);
        }
        for (String key: nations.keySet()) {
            nation.add(nations.get(key));
        }
        for (int i=0; i<nations.size();i++){
            for(int s=0; s<nations.size();s++){ 
                if (nation1==savedKeys.get(i) && nation2==savedKeys.get(s) && nation1!=nation2){
                    gameResults.add((savedKeys.get(i)) + " " + nation.get(i).setGameGoals(goals1)+ " : " + nation.get(s).setGameGoals(goals2)+ " " +(savedKeys.get(s)));
                    nation.get(i).setUpdatedInfo(goals1,points1);
                    nation.get(s).setUpdatedInfo(goals2,points2);
                }
            }
        }

        return gameResults;

    }

     /*
     * Die Resultate werden in einer ArrayList ausgegeben
     * 
     */
    public ArrayList <String> getResults()
    {
        String game = "";
        ArrayList <String> results = new ArrayList <>();
        for(int i = 0; i<gameResults.size();i++){
            game = gameResults.get(i);
            results.add(game);
        }
        return results;
    }

    
     /*
     * Die Methode getGamePossibilities berechnet alle möglichen Spiele innerhalb
     * einer Spielgruppe. Dafür werden drei ArrayLists benötigt. Die ArrayList 
     * savedKeys bekommt die Werte der vorherigen Methode getAllNations() zugeordnet.
     * Sie beinhaltet also alle Keys bzw. teilnehmenden Nationen. Eine zweite 
     * ArrayList, die ebenfalls Strings beinhalten soll, wird erzeugt.
     * 
     * In einer äußeren For-Schleife wird ein Iterator i bis zur Anzahl von Einträgen
     * der HashMap hochgezählt. Eine innere Schleife besitzt ebenfalls einen Iterator,
     * der s=i+1 ist. Damit fängt die innere Schleife immer den nächsten Wert (i+1) 
     * der HashMap ab. Solange i<nations.size() und s<nations.size(), werden in der 
     * ArrayList nationKeyList die i und s entsprechenden Werte hinzugefügt. Gibt es 
     * keinen nächsten Wert mehr (kein s), stoppen die Schleifen und in der Konsole 
     * wird die ArrayList pairings ausgegeben. 
     * 
     *  */
    
    public ArrayList <String> getGamePossibilities()
    
    {
        ArrayList <String> savedKeys = new ArrayList<>();
        ArrayList <Nation> nation = new ArrayList<>();
        ArrayList <String> pairings = new ArrayList<>();

        for (String key : nations.keySet())
        {
            savedKeys.add(key);
        }
        for (String key: nations.keySet()) {
            nation.add(nations.get(key));
        }
        for (int i=0; i<nations.size();i++){
            for(int s=i+1; s<nations.size();s++){ 

                pairings.add(savedKeys.get(i) + " : " + savedKeys.get(s));

            }
        }
        return pairings;
    }

}

