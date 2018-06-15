/*
It's a beautiful day, and you've decided to take your solar-powered rover out for a tour of the Martian landscape.

From the Hellas impact basin to the Elysium volcanic province, there's quite a variety of terrain on Mars, so each kilometre of your trip may cost a different amount of solar energy to travel through.

Given an array terrainDifficulty, representing the energy cost for each kilometre of the trip, you'd like to find the longest strip of land you can travel across with your current energy. Return the length of this trip (in kilometres).

Example

For terrainDifficulty = [3, 5, 4, 2, 3, 1, 5, 3, 4] and energy = 11, the output should be roverTour(terrainDifficulty, energy) = 4.

The longest stretch of terrain you can cover is over the interval from index 2 to index 5 (4 + 2 + 3 + 1 = 10, which is less than energy).

Input / Output

[execution time limit] 3 seconds (java)

[input] array.integer terrainDifficulty

An array of integers representing the energy cost for each kilometre of terrain.

Guaranteed constraints:
0 ≤ terrainDifficulty.length ≤ 3 · 105
0 ≤ terrainDifficulty[i] ≤ 106

[input] integer energy

An integer representing the amount of solar energy your rover has available.

Guaranteed constraints:
0 ≤ energy ≤ 108

[output] integer

An integer representing the length of the longest stretch of terrain that your rover can travel over with your current amount of energy.
 */


package codeFlight;

/**
 * Created by rijogeorge on 6/15/18.
 */
public class RoverTour {

    int roverTour(int[] terrainDifficulty, int energy) {
        int backIndex=0, forwardIndex=0, range=0, maxTravel=0;
        while(forwardIndex<terrainDifficulty.length){
            if(range+terrainDifficulty[forwardIndex]<=energy){
                range+=terrainDifficulty[forwardIndex];
                forwardIndex++;
                if(maxTravel<forwardIndex-backIndex)
                    maxTravel=forwardIndex-backIndex;
            } else {
                range-=terrainDifficulty[backIndex];
                backIndex++;
            }
        }
        return maxTravel;
    }

}
