public interface PetState
{
    /**
     * puppy play state
     * @param p puppy variable
     * @return string description of puppy playing
     */
    String play(Pet p);

    /**
     * puppy eating state
     * @param p puppy variable
     * @return string description of puppy eating
     */
    String feed(Pet p);
}
