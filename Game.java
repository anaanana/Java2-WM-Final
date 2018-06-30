import java.util.HashMap;
import java.util.ArrayList;

//Rainer.Hoenle@hs-aalen.de

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
 *  Die Klasse Game ist für Informationen zu teilnehmenden Spielnationen der 
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

public class Game
{
    // Instanzvariablen - ersetzen Sie das folgende Beispiel mit Ihren Variablen
    private HashMap<String,Groups> groups;
    private ArrayList <String> gameResults;

    /**
     * Konstruktor für Objekte der Klasse Spiel
     */
    public Game()
    {
        // Instanzvariable initialisieren
        groups = new HashMap<>();
        gameResults = new ArrayList <> ();
        addGroupsToGame();
        getGames();
    }

    /*
     * Die HashMap groups wird befüllt
     */
    private void addGroupsToGame()
    {
        groups.put("A",new Groups("A"));
        groups.put("B",new Groups("B"));
        groups.put("C",new Groups("C"));
        groups.put("D",new Groups("D"));
        groups.put("E",new Groups("E"));
        groups.put("F",new Groups("F"));
        groups.put("G",new Groups("G"));
        groups.put("H",new Groups("H"));
    }

    /*
     * Es wird geprüft, ob eine Gruppe (Key) in der HashMap ist
     * 
     */
    private boolean containsGroup(String key)

    {
        if (groups.containsKey(key))
        {
            return true;
        }
        else {
            return false;
        }
    }

    /*
     * Es werden alle teilnehmenden Gruppen als ArrayList ausgegeben.
     * 
     */
    public ArrayList<String> getAllGroups()
    {
        ArrayList <String> allGroups = new ArrayList<>();
        for (String key : groups.keySet())
        {
            allGroups.add(key);
        }
        return allGroups;
    }

    /*
     * Eine Gruppe wird hinzugefügt.
     */
    public void addGroup(String newGroup)
    {
        groups.put(newGroup,new Groups(newGroup));
    }

    /*
     * Eine Nation wird zu einer Gruppe hinzugefügt.
     * Fehleingabe berücksichtigt.
     */
    public void addNationToGroup(String groupName, String nationName, int nationGoals, int nationPoints)
    {
        if (nationGoals == 0){
            if (nationPoints == 0){ groups.put(groupName, new Groups (groupName));
                Groups groupNew = groups.get(groupName);
                System.out.println(groupNew.addNationToGroup(nationName, nationGoals, nationPoints));
            } else {System.out.println("Check Input. Eine neue Nation muss mit 0 Punkten beginnen.");}

        } else {System.out.println("Check Input. Eine neue Nation muss mit 0 Gesamttoren beginnen.");}
    }

    /*
     * Alle Nationen Keys - also alle Nationennamen - werden ausgegeben.
     */
    public void getAllNationsKeys()
    {
        ArrayList <Groups> keys = new ArrayList<>();
        for (String key: groups.keySet()) {
            keys.add(groups.get(key));
        }
        for (int i=0;i<keys.size();i++) {
            Groups values = keys.get(i);
            System.out.println(values.getAllNations());
        }
    }

    /*
     * Alle Nationen Values - also alle Informationen zu Nationen - werden ausgegeben.
     */
    public void getAllNationsValues()
    {
        ArrayList <Groups> keys = new ArrayList<>();

        for (String key: groups.keySet()) {
            keys.add(groups.get(key));
        }
        for (int i=0;i<keys.size();i++) {
            keys.get(i);
            System.out.println(keys.get(i).getAllValues());

        }

    }

    /*
     * Zu einer bestimmten Nation können Informationen abgerufen werden.
     * Fehleingaben teilweise berücksichtigt. Es fehlt die Überprüfung, ob nationName in der HashMap
     * eingetragen ist.
     */
    public String getNationDetails(String groupName, String nationName ) 
    {

        if (containsGroup(groupName) == true ){ 
            Groups nationDetail = groups.get(groupName);
            return nationDetail.getNationInformation(nationName);
        } else { System.out.println("Diese Gruppe spielt nicht mit.");
        }
        return nationName;
    }

    /*
     * Alle Spielpaarungen für alle Gruppen.
     */
    public void getGames()
    {
        ArrayList <Groups> group = new ArrayList<>();
        for (String key : groups.keySet())
        {
            group.add(groups.get(key));
        }
        for (int i=0;i<group.size();i++) {
            Groups values = group.get(i);
            System.out.println(values.getGamePossibilities()); 
        }
    }

    /*
     * Alle Spielpaarungen für 1 Gruppe.
     */
    public void getGamesFor1Group(String groupName)
    {
        Groups groupGame = groups.get(groupName);
        System.out.println(groupGame.getGamePossibilities());
    }

    /*
     * Alle eingetragenen Ergebnisse werden angezeigt.
     */
    public void getResults()
    {
        ArrayList <Groups> group = new ArrayList<>();
        for (String key : groups.keySet())
        {
            group.add(groups.get(key));
        }
        for (int i=0;i<group.size();i++) {
            Groups values = group.get(i);
            System.out.println(values.getResults()); 
        }
    }

    /*
     * Ergebnisse für ein Spiel können gesetzt werden. 
     * Fehleingaben teilweise berücksichtigt. Leider lassen sich noch Spiele mehrfach eintragen,
     * d.h. konkret sie werden nicht überschrieben sondern hinzugefügt. Ich bräuchte dafür eine Suche, die
     * checkt, ob der String im Array die Spielkombination bereits beinhaltet. Dafür hätte ich, mit mehr Zeit,
     * die split() Methode verwenden können. 
     * 
     */
    public void setResults (String groupName, String nation1, String nation2, int goals1, int goals2)
    {
        ArrayList <Groups> group = new ArrayList<>();

        if (nation1 != nation2)
        {
            if(goals1>=0 && goals2 >=0){
                for (String key : groups.keySet())
                {
                    group.add(groups.get(key));
                }
                for (int i=0;i<group.size();i++) {
                    Groups values = group.get(i);
                    System.out.println(values.setResult(nation1, nation2, goals1, goals2)); 
                }
            } else {System.out.println("Check Input. Tore können keine negativen Zahlen sein.");

            }
        } else {System.out.println("Check Input. Nationen können nicht gegen sich selbst spielen.");

        }
    }
}

