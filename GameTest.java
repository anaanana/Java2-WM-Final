

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * Die Test-Klasse GameTest.
 *
 * @author  (Ihr Name)
 * @version (eine Versionsnummer oder ein Datum)
 */
public class GameTest
{
    /**
     * Konstruktor fuer die Test-Klasse GameTest
     */
    public GameTest()
    {
    }

    /**
     *  Setzt das Testgerüst fuer den Test.
     *
     * Wird vor jeder Testfall-Methode aufgerufen.
     */
    @Before
    public void setUp()
    {
    }

    /**
     * Gibt das Testgerüst wieder frei.
     *
     * Wird nach jeder Testfall-Methode aufgerufen.
     */
    @After
    public void tearDown()
    {
    }

    @Test
    public void addGroup()
    {
        Game game2 = new Game();
        game2.addGroup("I");
    }

    @Test
    public void addNationToGroup()
    {
        Game game2 = new Game();
        game2.addNationToGroup("I", "Jemen", 0, 0);
    }

    @Test
    public void containsGroup()
    {
        Game game2 = new Game();
        assertEquals(true, game2.containsGroup("A"));
    }

    @Test
    public void gameResult()
    {
        Game game2 = new Game();
        game2.gameResults("A", "Russland", "Ägypten", 1, 1);
    }

    @Test
    public void getAllGroups()
    {
        Game game2 = new Game();
        assertNotNull(game2.getAllGroups());
    }

    @Test
    public void getAllKeys()
    {
        Game game2 = new Game();
        assertNotNull(game2.getAllKeys("A"));
    }

    @Test
    public void getAllKeysString()
    {
        Game game2 = new Game();
        game2.getAllNationsKeys();
    }

    @Test
    public void getAllValues()
    {
        Game game2 = new Game();
        game2.getAllNationsValues();
    }

    @Test
    public void getGames()
    {
        Game game2 = new Game();
        game2.getGames();
    }

    @Test
    public void getGames1Group()
    {
        Game game2 = new Game();
        game2.getGamesFor1Group("A");
    }

    @Test
    public void getNationDetails()
    {
        Game game2 = new Game();
        assertNotNull(game2.getNationDetails("A", "Russland"));
    }
}











