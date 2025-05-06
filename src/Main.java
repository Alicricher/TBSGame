public class Main {
    public static void main(String[] args) {
        Player player = new Player();
        Monster monster = new Monster();

        int round = 1;

        while (!player.isDead() && !monster.isDead()) {
            System.out.println("\n--- Раунд " + round + " ---");

            //player nacinaet
            player.takeTurn(monster);
            if (monster.isDead()) {
                System.out.println(player.getName()+" ez pz for player with " + player.getHealth() + " health лефт");
                break;
            }
            // monster nacinaet
            monster.takeTurn(player);
            if (player.isDead()) {
                System.out.println(player.getName()+" as lemon sqz for Monster with " + monster.getHealth() + " health лефт");
                break;
            }
            round++;
        }
        System.out.println("\n Вот и сказочке конец, а победитель молодец");
    }
}