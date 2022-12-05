package com.example.javaformpractice;

import com.example.javaformpractice.exceptions.DeadKnightException;

public class BlackKnight implements Comparable<BlackKnight>{
    private byte arms = 2;
    private byte legs = 2;
    private byte head = 1;
    private boolean alive = true;
    private String name;

    public static int numOfAliveKnights = 0;
    public static int numOfDeadKnights = 0;

    private static  int DEFAULT_KNIGHT_LIST_SIZE = 10;

    public static BlackKnight[] allKnights  = new BlackKnight[DEFAULT_KNIGHT_LIST_SIZE];

    public String getName() {
        return name;
    }

    public byte getArms() {
        return arms;
    }

    public byte getLegs() {
        return legs;
    }

    public byte getHead() {
        return head;
    }

    public boolean isAlive(){
        return alive;
    }

    public void cutOffArm(){
        arms--;
    }

    public void cutOffLeg(){
        legs--;
    }

    public void cutOffHead(){
        head--;
    }

    @Override
    public String toString(){
        return "BlackKnight { " + "\n"+
                    "name: "+name+ "\n"+
                    "arms: "+ arms+ "\n"+
                    "legs: "+ legs+ "\n"+
                    "head: "+ head+ "\n"+
                    "alive: "+ alive+ "\n"+
                " }";
    }

    public void strike(){
        if(alive){
            if(arms > 0){
                cutOffArm();
            }else if(legs > 0){
                cutOffLeg();
            }else {
                cutOffHead();
                alive = false;
                numOfAliveKnights--;
                numOfDeadKnights++;
            }
        }else {
            throw new DeadKnightException("Knight is already dead");
        }
    }

    public BlackKnight(String name){
        this.name = name;
    }

    // constructor overload
    public BlackKnight(){
        this.name = "Anonymous Knight";
    }

    public static boolean createKnight(String name){
        BlackKnight knight = new BlackKnight(name);

        return insertKnightIntoArray(knight);
    }

    public static boolean createKnight(){
        BlackKnight knight = new BlackKnight();

        return insertKnightIntoArray(knight);
    }

    public static boolean insertKnightIntoArray(BlackKnight knight){
        for(int i = 0;i < allKnights.length; i++){
            if(allKnights[i] == null){
                allKnights[i] = knight;
                BlackKnight.numOfAliveKnights++;
                return true;
            }
        }

        return false;
    }

    public static BlackKnight getLatestKnight(){
        for(int i = 0; i < allKnights.length; i++){
            if(allKnights[i] == null){
                return allKnights[i - 1];
            }
        }

        return allKnights[DEFAULT_KNIGHT_LIST_SIZE - 1];
    }

    @Override
    public boolean equals(Object o){
        if(this == o) return true; //check for self
        if( o == null || getClass() != o.getClass())  return false;
        BlackKnight knight = (BlackKnight) o;

        return (arms == knight.getArms()) &&
                (legs == knight.getLegs()) &&
                (head == knight.getHead()) &&
                (alive == knight.isAlive()) &&
                (name.equals(knight.getName()));
    }

    @Override
    public int hashCode(){
        int result = 31 * name.hashCode() +
                ((Byte) arms).hashCode() +
                ((Byte) legs).hashCode() +
                ((Byte) head).hashCode() +
                ((Boolean) alive).hashCode();


        return result;
    }

    @Override
    public int compareTo(BlackKnight knight){
        return this.name.charAt(1) - knight.getName().charAt(1);
    }

}
