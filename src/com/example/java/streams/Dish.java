package com.example.java.streams;

import java.util.Arrays;

public class Dish {
    private final String name;
    private final boolean vegetarian;
    private final int calories;
    private final Type type;

    public Dish(String name, boolean vegetarian, int calories, Type type) {
        this.name = name;
        this.vegetarian = vegetarian;
        this.calories = calories;
        this.type = type;
    }
  

    public String getName() {
        return name;
    }

    public boolean isVegetarian() {
        return vegetarian;
    }

    public int getCalories() {
        return calories;
    }

    public Type getType() {
        return type;
    }

    @Override
    public String toString() {
        return name + "  " + calories;
    }

    public enum Type { MEAT, FISH, OTHER }
    
   public static java.util.List<Dish> getDishes(){
	 return Arrays.asList(
	    		 
	    		 new Dish("french fries", true, 530, Dish.Type.OTHER),
	    		 new Dish("rice", true, 350, Dish.Type.OTHER),
	    		 new Dish("pork", false, 100, Dish.Type.MEAT),
	    		 new Dish("pork1", false, 200, Dish.Type.MEAT),
	    		 new Dish("chicken", false, 400, Dish.Type.MEAT),
	    		 new Dish("season fruit", true, 120, Dish.Type.OTHER),
	    		 new Dish("pizza", true, 550, Dish.Type.OTHER),
	    		 new Dish("prawns", false, 300, Dish.Type.FISH),
	    		 new Dish("salmon", false, 450, Dish.Type.FISH),
	    		 new Dish("french fries", true, 530, Dish.Type.OTHER),
	    		 new Dish("rice", true, 350, Dish.Type.OTHER),
	    		 new Dish("pork", false, 100, Dish.Type.MEAT),
	    		 new Dish("pork1", false, 200, Dish.Type.MEAT),
	    		 new Dish("chicken", false, 400, Dish.Type.MEAT),
	    		 new Dish("season fruit", true, 120, Dish.Type.OTHER),
	    		 new Dish("pizza", true, 550, Dish.Type.OTHER),
	    		 new Dish("prawns", false, 300, Dish.Type.FISH),
	    		 new Dish("salmon", false, 450, Dish.Type.FISH),
	    		 new Dish("french fries", true, 530, Dish.Type.OTHER),
	    		 new Dish("rice", true, 350, Dish.Type.OTHER),
	    		 new Dish("pork", false, 100, Dish.Type.MEAT),
	    		 new Dish("pork1", false, 200, Dish.Type.MEAT),
	    		 new Dish("chicken", false, 400, Dish.Type.MEAT),
	    		 new Dish("season fruit", true, 120, Dish.Type.OTHER),
	    		 new Dish("pizza", true, 550, Dish.Type.OTHER),
	    		 new Dish("prawns", false, 300, Dish.Type.FISH),
	    		 new Dish("salmon", false, 450, Dish.Type.FISH)
	    		 );
   }
    
}

