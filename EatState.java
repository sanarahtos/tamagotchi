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
        return p.petName + " looks up from their food and chases the ball you threw.";
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
            return p.petName + " continues to eat as you add another scoop of kibble to " +
                    "their bowl.\n" + p.petName + " ate so much they fell asleep!";
        }
        p.setState(new EatState());
        return p.petName + " continues to eat as you add another scoop of kibble to " +
                "their bowl.";
    }
}
