public class EatState implements PetState
{
    /**
     * puppy state of playing until tired
     * @param p puppy variable
     * @return string description of puppy playing
     */
    @Override
    public String play(Pet p){
        p.setState(new PlayState());
        return "The puppy looks up from its food and chases the ball you threw.";
    }

    /**
     * puppy eats after playing
     * @param p puppy variable
     * @return string description of puppy eating
     */
    @Override
    public String feed(Pet p){
        if (p.incFeeds() >= 2){
            p.reset();
            p.setState(new SleepState());
            return "The puppy continues to eat as you add another scoop of kibble to " +
                    "its bowl. \nThe puppy ate so much it fell asleep!";
        }
        p.setState(new EatState());
        return "The puppy continues to eat as you add another scoop of kibble to " +
                "its bowl.";
    }
}
