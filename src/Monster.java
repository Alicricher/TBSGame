public class Monster extends Entity {
    public Monster() {
        setName("Монстр");

    }
    @Override
    public void takeTurn(Entity player) {
        try {
            System.out.println(getName() + " думает...");
            Thread.sleep(2000); // тут он типа думает
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        int choice = rand.nextInt(3);
        switch (choice) {
            case 0:
                Attack(player);
                break;
            case 1:
                Heal(25);
                break;
            case 2:
                Skip();
                break;
        }
    }
}
