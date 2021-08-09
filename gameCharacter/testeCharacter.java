package gameCharacter;

public class testeCharacter {
    public static void main(String[] args) {
        CharacterGame characterGame = new King();

        characterGame.fight();
        characterGame.setWeapon(new SwordBehavior());
        characterGame.fight();

    }
}
