package net.andeh;

public class Main {

    public static void main(String[] args) {
        int playerPosition = 3;

        switch(playerPosition) {
            case 1: System.out.println("GOLD MEDAL"); break;
            case 2: System.out.println("SILVER MEDAL"); break;
            case 3: System.out.println("BRONZE MEDAL"); break;
            default: System.out.println("NO MEDAL"); break;
        }
    }
}
