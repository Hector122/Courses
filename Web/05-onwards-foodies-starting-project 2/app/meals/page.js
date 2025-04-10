import Link from "next/link";
import classes from "./page.module.css";
import { getMeals } from "../../lib/meals";
import MealsGrid from "@/components/meals/meal-grid";
import { Suspense } from "react";

async function Meals() {
  const meals = await getMeals();
  console.log("Meals data:", meals); // Add this line to debug

  return <MealsGrid meals={meals} />;
}

export default async function MealsPage() {
  return (
    <>
      <header className={classes.header}>
        <h1>
          Delicious Meals, created {""}{" "}
          <span className={classes.highlight}>by you</span>
        </h1>
        <p>
          Choose your favorite dish and enjoy a delicious lunch or dinner at
          home
        </p>
        <p className={classes.cta}>
          <Link href="/meals/share">Share Your Favorite Recipe</Link>
        </p>
      </header>
      <main>
        <Suspense
          fallback={<p className={classes.loading}>Fetching Meals ...</p>}
        >
          <Meals />
        </Suspense>
      </main>
    </>
  );
}
