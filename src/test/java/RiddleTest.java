import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class RiddleTest {
    Riddle myRiddle,myRiddle2;
    int solution;
    int level;
    String message;
    String name;
    String userGuess;

    @Before
    public void setUp() throws Exception {
        solution=8;
        level=1;
        name = "sequence of numbers ..";
        myRiddle = new Riddle(level,name);
        message = "What is the missing number: 1 1 2 3 5 _ 13 ";
        myRiddle.setMessage(message);
        myRiddle.setSolution(Integer.toString(solution));
        myRiddle2 = new Riddle(level,name);
        myRiddle2.setMessage(message);
        myRiddle2.setSolution(Integer.toString(solution));
        userGuess="8";
        myRiddle2.solveRiddle(userGuess);
    }

    @Test(expected = AlreadySolvedException.class)
    public void solveRiddleException() throws AlreadySolvedException  {
        userGuess="8";
        myRiddle2.solveRiddle(userGuess);
    }

    @Test
    public void solveRiddle() throws AlreadySolvedException {
        userGuess="8";
        boolean expected = myRiddle.solveRiddle(userGuess);
        assertTrue(expected);
    }
}