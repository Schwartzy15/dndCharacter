import java.util.Arrays;
import java.util.Random;

class DnDCharacter {

    private int strength, dexterity, constitution, intelligence, wisdom, charisma, hitpoints;

    public DnDCharacter() { 
        strength = ability();
        dexterity = ability();
        constitution = ability();
        intelligence = ability();
        wisdom = ability();
        charisma = ability();
        hitpoints = 10 + modifier(constitution);
    }
    int ability() {
        Random rand = new Random();
        int[] rolls = new int[4];

        for(int i = 0; i < 4;i++) {
            rolls[i] = 1 + rand.nextInt(6);
        }
        Arrays.sort(rolls);  //sort array from least to greatest
        return (rolls[1] + rolls[2] + rolls[3]);    //only sum three largest rolls
    }

    int modifier(int input) {
        return Math.floorDiv((input - 10), 2);
    }

    int getStrength() {
        return strength;
    }

    int getDexterity() {
        return dexterity;
    }

    int getConstitution() {
        return constitution;
    }

    int getIntelligence() {
        return intelligence;
    }

    int getWisdom() {
        return wisdom;
    }

    int getCharisma() {
        return charisma;
    }

    int getHitpoints() {
        return hitpoints;
    }
}