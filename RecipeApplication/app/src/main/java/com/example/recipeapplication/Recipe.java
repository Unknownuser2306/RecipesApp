package com.example.recipeapplication;

public class Recipe {

    private final String RecipeName;
    private final String RecipeIngredient;
    private final String RecipeMethodTitle;
    private final String Recipe;
    private final int Thumbnail;

    public Recipe (String name, String recipeIngredients, String recipeMethodTitle,String recipe, int thumbnail) {

        RecipeName = name;
        RecipeIngredient = recipeIngredients;
        RecipeMethodTitle = recipeMethodTitle;
        Recipe = recipe;
        Thumbnail = thumbnail;

    }

    public String getRecipeName(){

        return RecipeName;
    }
    public String getRecipeIngredient(){
        return RecipeIngredient;
    }
    public String getRecipeMethodTitle(){
        return RecipeMethodTitle;
    }
    public String getRecipe(){
        return Recipe;
    }
    public int getThumbnail() {
        return Thumbnail;
    }
}
