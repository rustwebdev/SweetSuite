package com.rustwebdev.sweetsuite;

public final class Constants {
  private Constants(){
    throw new AssertionError("No Constants Instances for you!");

  }
  public static final String BASE_URL =
      "http://d17h27t6h515a5.cloudfront.net/topher/2017/May/59121517_baking/";

  public static final String RECIPE_PARCELABLE = "recipe";
  public static final String RECIPE_FRAGMENT_PARCELABLE = "step";
  public static final String STEP_PARCELABLE = "step";

  public static final String FRAGMENT_TAG = "fragment_tag";

  public static final String VIEW_PAGER_POSITION = "position";

  public static final String INGREDIENTS_PARCELABLE = "ingredients";

  public static final String INGREDIENTS_ARRAY = "ingredient_array";
  public static final String STEPS_ARRAY = "steps_array";

  public static final String APP_WIDGET_CURRENT_POSITION = "current";
  public static final String POSITION_INCREMENT = "position-increment" ;
}