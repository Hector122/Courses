import MealItem from "./meal-item";

export default function MealsGrid({ meals }) {
  return (
    <ul className={classes.grid}>
      {meals.map((meal) => (
        <li key={meal.id}>
          <MealItem {...meal} />
        </li>
      ))}
    </ul>
  );
}
