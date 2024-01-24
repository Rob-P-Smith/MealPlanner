package foods;

import java.util.HashMap;

public class Meals {
    private int servings;
    private int pageNumber;
    private int calories;
    private double protein;
    private double fats;
    private double netCarbs;
    private HashMap<String, String> ingredients = new HashMap<String, String>();

    public Meals() {
    servings = 1;
    pageNumber = 0;
    calories = 0;
    protein = 0;
    fats = 0;
    netCarbs = 0;
    ingredients = new HashMap<String, String>();
    }

    public Meals(int servings, int pageNumber, int calories, double protein, double fats, double netCarbs, HashMap<String, String> ingredients) {
        this.servings = servings;
        this.pageNumber = pageNumber;
        this.calories = calories;
        this.protein = protein;
        this.fats = fats;
        this.netCarbs = netCarbs;
        this.ingredients = ingredients;
    }

    public int getServings() {
        return servings;
    }

    public int getPageNumber() {
        return pageNumber;
    }

    public int getCalories() {
        return calories;
    }

    public double getProtein() {
        return protein;
    }

    public double getFats() {
        return fats;
    }

    public double getNetCarbs() {
        return netCarbs;
    }

    public HashMap<String, String> getIngredients() {
        return ingredients;
    }

    public void setServings(int servings) {
        this.servings = servings;
    }

    public void setPageNumber(int pageNumber) {
        this.pageNumber = pageNumber;
    }

    public void setCalories(int calories) {
        this.calories = calories;
    }

    public void setProtein(double protein) {
        this.protein = protein;
    }

    public void setFats(double fats) {
        this.fats = fats;
    }

    public void setNetCarbs(double netCarbs) {
        this.netCarbs = netCarbs;
    }

    public void setIngredients(HashMap<String, String> ingredients) {
        this.ingredients = ingredients;
    }

    @Override
    public String toString() {
        return "Meals{" +
                "servings=" + servings +
                ", pageNumber=" + pageNumber +
                ", calories=" + calories +
                ", protein=" + protein +
                ", fats=" + fats +
                ", netCarbs=" + netCarbs +
                ", ingredients=" + ingredients +
                '}';
    }
}
