package codeFlight;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Created by rijogeorge on 6/15/18.
 */
public class roverTourTest {
    RoverTour roverTour;
    @Before
    public void setUp() throws Exception {
        roverTour = new RoverTour();
    }

    @After
    public void tearDown() throws Exception {
        roverTour = null;
    }

    @Test
    public void roverTour() throws Exception {
        int[] terrainDifficulty = new int[]{3, 5, 4, 2, 3, 1, 5, 3, 4};
        int energy = 11;
        int travel = roverTour.roverTour(terrainDifficulty, energy);
        assertEquals(travel, 4);
    }

}