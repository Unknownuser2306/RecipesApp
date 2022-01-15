package com.example.recipeapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    RecyclerView myrecyclerView;
    RecycleViewAdaptor myAdapter;

    List<Recipe> recipe1;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recipe1 = new ArrayList<>();
        recipe1.add(new Recipe("Chicken Roll", "Chicken Roll Recipe\n" +
                "Ingredients of Chicken Roll\n" +
                "2 Servings\n" +
                "200 gm chopped into cubes chicken\n" +
                "1 medium chopped tomato\n" +
                "1/2 pinch red chilli powder\n" +
                "2 tablespoon vegetable oil\n" +
                "1/2 cut into strips cucumber\n" +
                "1/2 tablespoon chopped coriander leaves\n" +
                "1 large thinly sliced onion\n" +
                "2 medium chopped green chilli\n" +
                "2 pinches garam masala powder\n" +
                "1 lemon wedges\n" +
                "1 teaspoon tomato ketchup\n" +
                "1 tablespoon green chilli sauce", "Method","Chicken Roll is a delectable North Indian recipe made using all purpose flour, stir-fried chicken, yoghurt and a variety of vegetables rolled into paranthas. On days you do not want to prepare an elaborate meal, this delectable dish can be a saviour. Rolls are quite popular across India and they are often a favourite evening snack. Egg Roll, Kathi Kebab Roll, Mutton Roll, Paneer Roll, Potato Roll and even Fish Roll are among its many variations. This easy roll recipe is made using chicken and has the unforgettable aroma of Indian spices. You can also utilize your leftover parathas and chapatis in making this recipe. If you do not like to use all-purpose flour or maida, you can make it with whole wheat flour too. In fact, it can be made even with leftover chicken. All you have to ensure is that you use the right amount of spices so that the flavour is not lost. Easy to pack and carry, you can also take it to office or prepare it for picnics and day trips. A must try roll recipe for all chicken lovers!\n",R.drawable.chicken_roll));
        recipe1.add(new Recipe("Donut","Donut Ingredient\n" +
                "1 ¼ cups milk\n" +
                "2 ¼ teaspoons (one package) active dry yeast\n" +
                "2 eggs\n" +
                "8 tablespoons (1 stick) butter, melted and cooled\n" +
                "¼ cup granulated sugar\n" +
                "1 teaspoon salt\n" +
                "4 ¼ cups all-purpose flour, plus more for rolling out the dough\n" +
                "2 quarts neutral oil, for frying, plus more for the bowl.","Method","Making homemade glazed doughnuts is easier than you think. Ready in about 2 hours, these taste like doughnuts from your favorite bakery, but they’re made in the comfort of your own home. For doughnut success, follow my step-by-step photos, helpful success tips, and foolproof recipe. Using this same doughnut dough, you can create other flavored frosted doughnuts too!\n", R.drawable.donut));
        recipe1.add(new Recipe("Pasta", "PASTA WITH TUNA (SPAGHETTI AL TONNO):\n" +
                "1. 1/4 cup extra virgin olive oil\n" +
                "2. 2 garlic cloves , crushed\n" +
                "3. 1/2 brown onion , diced\n" +
                "4. 14 oz/400g crushed tinned tomatoes\n" +
                "5. 5 oz/150g tinned tuna\n" +
                "6. 1/4 cup chopped parsley", "Method","homemade pasta recipe refers to the pasta maker attachment for the KitchenAid Stand Mixer, which is how we roll out our fresh pasta at home. If you don’t have a KitchenAid, don’t worry! You could also roll out this pasta dough according to the instructions on a regular pasta maker. However you make it, I hope you try this recipe. It’s an easy, fun way to spend an hour in the kitchen with someone you love, and at the end, you get to eat a big plate of chewy noodles with a perfect al dente bite.\n",R.drawable.pasta));
        recipe1.add(new Recipe("Pancakes","Ingredients Pancakes\n" +
                "\n" +
                "Ingredient Checklist\n" +
                "1 ½ cups all-purpose flour\n" +
                "3 ½ teaspoons baking powder\n" +
                "¼ teaspoon salt, or more to taste\n" +
                "1 tablespoon white sugar\n" +
                "1 ¼ cups milk\n" +
                "1 egg\n" +
                "3 tablespoons butter, melted","Method","Combine the milk, egg, sugar, vanilla extract, and melted butter in a large bowl.\n" +
                "Stir in the all-purpose flour, salt, and baking powder.\n" +
                "Heat a large buttered skillet over medium heat. Add 1/4 cup of the pancake batter to the skillet and cook for 2 minutes on each side.\n",R.drawable.pancake));



        myrecyclerView = (RecyclerView)findViewById(R.id.recycleView_id);

        myAdapter = new RecycleViewAdaptor(this,recipe1);

        myrecyclerView.setLayoutManager(new GridLayoutManager(this,1));

        myrecyclerView.setAdapter(myAdapter);
    }




}