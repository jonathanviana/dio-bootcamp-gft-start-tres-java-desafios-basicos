package desafios.b;

public class DesafioB {
    public static void main(String[] args) {

        int bonus, attackPowerPlayerOne, defensePowerPlayerOne, levelPlayerOne, attackPowerPlayerTwo, defensePowerPlayerTwo, levelPlayerTwo, damagePlayerOne, damagePlayerTwo;

        attackPowerPlayerOne = 90;
        defensePowerPlayerOne = 50;
        levelPlayerOne = 46;

        attackPowerPlayerTwo = 100;
        defensePowerPlayerTwo = 40;
        levelPlayerTwo = 45;

        bonus = 100;

        damagePlayerOne = ((attackPowerPlayerOne + defensePowerPlayerOne) / 2) + (levelPlayerOne % 2 == 0 ? bonus : 0);
        damagePlayerTwo = ((attackPowerPlayerTwo + defensePowerPlayerTwo) / 2) + (levelPlayerTwo % 2 == 0 ? bonus : 0);

        if (damagePlayerOne > damagePlayerTwo) {
            System.out.println("Winner is Player One!");
            System.out.println("total damage player one: " + damagePlayerOne);
            System.out.println("total damage player two: " + damagePlayerTwo);

        } else if (damagePlayerTwo > damagePlayerOne) {
            System.out.println("Winner is Player Two!");
            System.out.println("total damage player two: " + damagePlayerTwo);
            System.out.println("total damage player one: " + damagePlayerOne);
        } else {
            System.out.println("Draw!");
            System.out.println("total damage player one: " + damagePlayerOne);
            System.out.println("total damage player two: " + damagePlayerTwo);
        }
    }
}

