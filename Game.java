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

    /**
     * Ein Beispiel einer Methode - ersetzen Sie diesen Kommentar mit Ihrem eigenen
     * 
     * @param  y    ein Beispielparameter für eine Methode
     * @return        die Summe aus x und y
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

    public ArrayList<String> getAllGroups()
    {
        ArrayList <String> allGroups = new ArrayList<>();
        for (String key : groups.keySet())
        {
            allGroups.add(key);
        }
        return allGroups;
    }

    public void addGroup(String newGroup)
    {
        groups.put(newGroup,new Groups(newGroup));
    }

    public void addNationToGroup(String groupName, String nationName, int nationGoals, int nationPoints)
    {
        groups.put(groupName, new Groups (groupName));
        Groups groupNew = groups.get(groupName);
        System.out.println(groupNew.addNationToGroup(nationName, nationGoals, nationPoints));
    }

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

    public ArrayList <String> getAllNationsValues()
    {
        ArrayList <Groups> keys = new ArrayList<>();
        ArrayList <String> keys2 = new ArrayList<>();
        for (String key: groups.keySet()) {
            keys.add(groups.get(key));
        }
        for (int i=0;i<keys.size();i++) {
            Groups values = keys.get(i);
            keys2 = values.getAllValues();
           
        }
        return keys2;
    }

    public String getNationDetails(String groupName, String nationName ) 
    {
        Groups nationDetail = groups.get(groupName);
        return nationDetail.getNationInformation(nationName);
    }

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

    public void getGamesFor1Group(String groupName)
    {
        ArrayList <Groups> games = new ArrayList<>();
        Groups groupGame = groups.get(groupName);
        for (String key : groups.keySet())
        {
            games.add(groups.get(key));
        }
        System.out.println(groupGame.getGamePossibilities());
    }

    /*public void setResults (String groupName, String nation1, String nation2, int goals1, int goals2)
    {
    int points1 = 0;
    int points2 = 0;

    ArrayList<String> nation1Results = new ArrayList<>();
    ArrayList<String> nation2Results = new ArrayList<>();

    if (goals1 > goals2) 
    {points1=3;}
    if (goals1 < goals2) 
    {points2=3;}
    if(goals1 == goals2){
    points1=1;
    points2=1;
    }

    Groups groupNew = groups.get(groupName);
    //nation1Results.add(groupNew.setResult(nation1, goals1,points1));
    nation1Results.add(groupNew.getNationInformation(nation1));
    //nation2Results.add(groupNew.setResult(nation2,goals2,points2));

    }*/

    /*public void setGameResult( String groupName, String nation1, String nation2, int goals1, int goals2)
    {
    //Groups groupNew = groups.get(groupName);
    ArrayList <Groups> keys = new ArrayList<>();
    Groups groupGame = groups.get(groupName);
    for (String key: groups.keySet()) {
    keys.add(groups.get(key));
    System.out.println(keys);
    }
    for (int i=0;i<keys.size();i++) {
    groupGame = keys.get(i);
    groupGame.setResult(nation1, nation2, goals1,goals2);
    System.out.println(groupGame.setResult(nation1, nation2, goals1,goals2));
    }

    }*/
    public ArrayList <String> setResult()
    {
       ArrayList <String> games = new ArrayList<>();
       games = getAllNationsValues();
       return games;
    }
}

