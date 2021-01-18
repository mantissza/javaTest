package com.company;

public abstract class Animal {  // absztrakt osztályt többé önmagában nem példányosíthatok
    private String name;
    private int weight;

    protected void makeSound(){  // A kiterjesztett osztályok használhatják ezt a metódust
        System.out.println("WRAAAARGH");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

}