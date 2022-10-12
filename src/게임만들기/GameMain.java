package 게임만들기;

public class GameMain {
    public static void main(String[] args) {
        Character varian = new Character("바리안린", 1, 450, 10, 2, 0.8, 0.5);
        varian.infoCharacter();
        Character jaina = new Character("제이나", 2, 200, 2, 30, 0.5, 0.9);
        jaina.infoCharacter();
    }
}
