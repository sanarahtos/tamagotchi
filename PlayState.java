public class PlayState implements PetState
{
    /**
     * puppy continues to play until tired
     * @param p puppy variable
     * @return string description of puppy playing
     */
    @Override
    public String play(Pet p){
        p.setState(new PlayState());
        if (p.incPlays() >= 2){
            p.reset();
            p.setState(new SleepState());
            return "You throw the ball again and " + p.petName + " excitedly chases it.\n" 
            + p.petName + " played so much they fell asleep!";
        }
        return "You throw the ball again and " + p.petName + " excitedly chases it.";
    }

    /**
     * puppy stops playing to eat
     * @param p puppy variable
     * @return string description of puppy eating
     */
    public String feed(Pet p){
        p.setState(new EatState());
        return p.petName + " stops playing and comes running to eat.";
    }
}
