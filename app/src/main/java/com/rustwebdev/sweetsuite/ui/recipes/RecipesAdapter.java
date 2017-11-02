package com.rustwebdev.sweetsuite.ui.recipes;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.rustwebdev.sweetsuite.R;
import com.rustwebdev.sweetsuite.datasource.webservice.recipes.dto.DtoRecipe;
import java.util.List;

public class RecipesAdapter extends RecyclerView.Adapter<RecipesAdapter.ViewHolder> {
  private final List<DtoRecipe> recipes;
  private final RecipeItemListener itemListener;

  public RecipesAdapter(List<DtoRecipe> recipes, RecipeItemListener itemListener) {
    this.recipes = recipes;
    this.itemListener = itemListener;
  }

  @Override public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
    View v =
        LayoutInflater.from(parent.getContext()).inflate(R.layout.recipe_list_item, parent, false);
    return new ViewHolder(v, this.itemListener);
  }

  @Override public void onBindViewHolder(ViewHolder holder, int position) {
    DtoRecipe recipe = recipes.get(position);
    holder.recipeNameTv.setText(recipe.getName());
  }

  @Override public int getItemCount() {
    return recipes.size();
  }

  public class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
    @BindView(R.id.recipe_list_view_name) TextView recipeNameTv;
    final RecipeItemListener itemListener;

    public ViewHolder(View itemView, RecipeItemListener itemListener) {
      super(itemView);
      ButterKnife.bind(this, itemView);
      this.itemListener = itemListener;
      itemView.setOnClickListener(this);
    }

    @Override public void onClick(View view) {
      DtoRecipe recipe = recipes.get(getAdapterPosition());
      this.itemListener.onRecipeClick(recipe);
    }
  }

  public interface RecipeItemListener {
    void onRecipeClick(DtoRecipe recipe);
  }
}