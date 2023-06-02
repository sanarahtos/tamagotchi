public class SleepState implements PetState
{
    /**
     * puppy is still asleep is user wants to play with puppy
     * @param p puppy variable
     * @return string that says puppy is asleep
     */
    @Override
    public String play(Pet p){
        return p.petName + " is asleep. They don't want to play right now.";
    }

    /**
     * puppy state becomes eating
     * @param p puppy variable
     * @return string description of puppy waking up to eat
     */
    @Override
    public String feed(Pet p){
        p.setState(new EatState());
        return p.petName + " wakes up and comes running to eat.";
    }
}
