import java.io.*;

/**
 * Random guessing player.
 * This player is for task B.
 *
 * You may implement/extend other interfaces or classes, but ensure ultimately
 * that this class implements the Player interface (directly or indirectly).
 */
public class RandomGuessPlayer implements Player
{

    /**
     * Loads the game configuration from gameFilename, and also store the chosen
     * person.
     *
     * @param gameFilename Filename of game configuration.
     * @param chosenName Name of the chosen person for this player.
     * @throws IOException If there are IO issues with loading of gameFilename.
     *    Note you can handle IOException within the constructor and remove
     *    the "throws IOException" method specification, but make sure your
     *    implementation exits gracefully if an IOException is thrown.
     */
    public RandomGuessPlayer(String gameFilename, String chosenName)
        throws IOException
    {
        
        /*  here you have to read data from config file and load in to data structures
        
            for ex - 
        
            BufferedReader assignedReader = new BufferedReader(new FileReader(assignedFilename));

            String line;
            String player1AssignedName = null;
            String player2AssignedName = null;
            while ((line = assignedReader.readLine()) != null) {
        
                String[] fields = line.split(" ");
                if (fields.length != 2) {
                        throw new IOException(assignedFilename + ": Misformed field line: " + line);
                }
            }

           ******** use hashmaps and ArrayList s to load data-- you  need to laod attribute values 
            to a hashmap and personattribute values to another hash map*****
        
        */
        
        
        
        
    } // end of RandomGuessPlayer()


    public Guess guess() {

        
        /*
        
         here you have to randomly select a attribute  and a value from loaded hashmap data 
         
        use random command to select randomly..  but make sure atleast you get rid of atleast one person from the
        
        person list .
        
        
        return that person as the guess you are making (see the return value of this function to 
        build your return value.
      
        
        
        */
        
        
        // placeholder, replace
        return new Guess(Guess.GuessType.Person, "", "Placeholder");
    } // end of guess()


    public boolean answer(Guess currGuess) {

        /* 
        
        here you analyse the other players answer and return true if thats the right person the 
        
        opponent guessed. otherwise if that guess is wrong return false as the return value
        
        
        */
                
         // placeholder, replace
        return false;
    } // end of answer()


	public boolean receiveAnswer(Guess currGuess, boolean answer) {

            
            /* 
             here you have to pass the guess you made randomly as a parameter and 
            
            your answer to opponents guess (true/ false) to the opponent
            
            this part is easy..you only need to pass the made guess and answer
            
            */
        // placeholder, replace
        return true;
    } // end of receiveAnswer()

} // end of class RandomGuessPlayer
