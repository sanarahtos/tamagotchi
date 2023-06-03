public class Pet
{
    private PetState state;
    public String petName;
    public int numFeeds;
    public int numPlays;
    private boolean hungry;
    private boolean bored;

    /**
     * Puppy constructor
     */
    public Pet(){
        state = new SleepState();
        petName = "";
        numFeeds = 0;
        numPlays = 0;
        hungry = true;
        bored = true;
    }

    /**
     * set State of puppy
     * @param s state of puppy
     */
    public void setState(PetState s){
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
     * true if pet is hungry 
     * (incFeeds % 3 != 0)
     * @return hungry bool
     */
    public boolean isHungry(){
        int feedsCount = numFeeds;
        if (feedsCount % 3 == 0){
            hungry = false;
        }
        else{
            hungry = true;
        }
        return hungry;
    }

    /**
     * reset num of feeds and plays of puppy
     */
    public void reset(){
        numPlays = 0;
        numFeeds = 0;
    }

}
