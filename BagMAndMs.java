
/**
 * Write a description of class BagMAndMs here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class BagMAndMs
{
    String type = "Unknown";
    private int numRed = 5, numGreen = 5, numBlue = 5;
    private int numBrown = 5, numYellow = 5, numOrange = 5; 


    /*#
     * Write the constructor for objects of class BagMAndMs
     * Should include a string to hold the type of M&Ms (like plain,
     * crispy, etc) and integers numRed, numOrange, numYellow, 
     * numGreen, numBlue, and numBrown to represent how many candies
     * of each color are in the bag. The only input to the constructor 
     * is the type. All the numbers should be initialized to zero.
     */
    public BagMAndMs (String style)
    {
        type= style;
        numRed = 0;
        numGreen = 0;
        numBlue = 0;
        numBrown = 0;
        numYellow = 0;
        numOrange = 0;
    }
    
    
    /** This method adds one red candy to a bag 
    */
    public void addRed()
    {
        numRed ++;
    }
    
    /** This method fills a candy bag object with the given number
     * of candies in each color. It returns the total number of
     * candies in the bag.
     */
    public int addCandy (int red, int orange, int yellow, int green, int blue, int brown)
    {
        numRed += red;
        numOrange += orange;
        numYellow += yellow;
        numGreen += green;
        numBlue += blue;
        numBrown += brown;
        return (numRed+numYellow+numOrange+numGreen+numBlue+numBrown);
    }
    
    /*# use the method above as a model to create a new method called
     * eatCandy. This method takes in the number of each color eaten
     * and adjusts the total remaining. We will assume for today
     * that we can't eat more than there are (no need to add a bunch
     * of error checking). As with the addCandy method, this method
     * should return how many candies total are in the bag after you
     * have eaten some of them.
     */
    public void eatCandy(int eatenRed, int eatenOrange, int eatenYellow, int eatenGreen, int eatenBlue, int eatenBrown)
    {
        numRed -= eatenRed;
        numOrange -= eatenOrange;
        numYellow -= eatenYellow;
        numGreen -= eatenGreen;
        numBlue -= eatenBlue;
        numBrown -= eatenBrown;
        return;
    }
    
    

    /** This is the toString method for the BagOfMAndMs class
     * 
     */public String toString()
    {
        // Note that the extra lines here make this more readable
        // and provide a rough approximation of what the output 
        // will actually look like.
        return("This bag of "+type+" M &Ms has:\n"+
                numRed + " Reds\n"+
                numOrange + " Oranges\n"+
                numYellow + " Yellows\n"+
                numGreen + " Greens\n"+
                numBlue + " Blues\n"+
                numBrown+ " Browns\n");
    }
}
