
public class MainMenu
{
    public static void main (String[] args){
        Pet p = new Pet();
        int choice;

        System.out.println("Congratulations on your new puppy!");
        while ((choice = menuOpt()) != 3){
            if(choice == 1){
                System.out.println(p.giveFood());
            }
            else{
                System.out.println(p.throwBall());
            }
        }
    }

    /**
     * menu choice for what user wants to do with puppy
     * @return menu choice from user
     */
    public static int menuOpt(){
        System.out.println("What would you like to do?" +
                "\n1. Feed \n2. Play \n3. Quit");
        return CheckInput.getIntRange(1, 3);
    }
}
