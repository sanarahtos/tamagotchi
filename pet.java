public class Puppy
{
    private PuppyState state;
    private int numFeeds;
    private int numPlays;

    /**
     * Puppy constructor
     */
    public Puppy(){
        state = new AsleepState();
        numFeeds = 0;
        numPlays = 0;
    }

    /**
     * set State of puppy
     * @param s state of puppy
     */
    public void setState(PuppyState s){
        this.state = s;
    }

    /**
     * sets puppy state to play
     * @return play state
     */
    public String throwBall(){
        return state.play(this);
    }

    /**
     * sets puppy state to eat
     * @return eating state
     */
    public String giveFood(){
        return state.feed(this);
    }

    /**
     * increase num of feeds
     * @return num of feeds
     */
    public int incFeeds(){
        numFeeds++;
        return numFeeds;
    }

    /**
     * increase num of plays
     * @return num of plays
     */
    public int incPlays(){
        numPlays++;
        return numPlays;
    }

    /**
     * reset num of feeds and plays of puppy
     */
    public void reset(){
        numPlays = 0;
        numFeeds = 0;
    }

}
