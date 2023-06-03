
public class MainMenu
{
    public static String petName;
    private static int hungryCount;
    public static void main (String[] args){
        Pet p = new Pet();
        int choice;

        System.out.println("Congratulations on your new pet! \nWhat would you like to name them?");
        p.petName = CheckInput.getString();

        while ((choice = menuOpt(p)) != 3){
            if(choice == 1){
                System.out.println(p.giveFood());
                p.incFeeds();
            }
            else{
                System.out.println(p.throwBall());
                p.incPlays();
            }

        // hungry and bored counter with numFeeds and numPlays
        if (choice != 1){
            hungryCount++;
        }
        else if(p.isHungry() == false){
            hungryCount = 0;
        }
        else if (p.isHungry() == true){
            hungryCount++;
        }
    

        System.out.println("Hungry: " + hungryCount);
        System.out.println("Num of Feeds: " + p.numFeeds + " Num of Plays: " + p.numPlays);
        }

        p.reset();
    }

    /**
     * menu choice for what user wants to do with puppy
     * @return menu choice from user
     */
    public static int menuOpt(Pet p){
        System.out.println("What would you like to do with " + p.petName + "? \n"+
                "\n1. Feed \n2. Play \n3. Quit");
        return CheckInput.getIntRange(1, 3);
    }
}
