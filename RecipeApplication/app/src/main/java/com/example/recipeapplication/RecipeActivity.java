package com.example.recipeapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class RecipeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recipe);

        TextView mRecipeName = (TextView) findViewById(R.id.text_recipe);
        TextView mRecipeIngrediets = (TextView) findViewById(R.id.ingredients);
        TextView mRecipeMethodTitle = (TextView) findViewById(R.id.method);
        TextView mRecipe = (TextView) findViewById(R.id.recipe);

        Intent intent = getIntent();
        String Title= intent.getExtras().getString( "RecipeName");
        String ingredients = intent.getExtras().getString ("RecipeIngredients");
        String MethodTitle = intent.getExtras().getString( "RecipeMethodTitle");
        String Recipe = intent.getExtras().getString( "Recipe");

        mRecipeName.setText(Title);
        mRecipeIngrediets.setText(ingredients);
        mRecipeMethodTitle.setText(MethodTitle);
        mRecipe.setText(Recipe);








    }
}