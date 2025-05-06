import java.util.Scanner;
public class Player extends Entity {
    public Player() {
        setName("Игрок");

    }
    Scanner input = new Scanner(System.in);
    @Override
    public void takeTurn(Entity monster) {
        System.out.println("Будь мужиком и сделай выбор \n 1. Attack \n 2. Heal \n 3.Skip \n Ииии?");
        String choice = input.nextLine();
        switch (choice) {
            case "1":
                Attack(monster);
                break;
            case "2":
                Heal(25.0);
                break;
            case "3":
                Skip();
                break;
            default:
                System.out.println("Нихера не понятно");
                takeTurn(monster);

        }

    }

}
