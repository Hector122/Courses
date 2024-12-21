import { UnsplashImage } from "@/models/unsplash-image";
import Image from "next/image";
import style from "./topic.module.css";

export const dynamicParams = true;

interface PagePros {
  params: { topic: string };
}

export function generateStaticParams() {
  return ["nature", "people", "food", "travel", "sports", "animals"].map(
    (topic) => ({ topic })
  );
}

export default async function Page({ params: { topic } }: PagePros) {
  const response = await fetch(
    `https://api.unsplash.com/photos/random/?query=${topic}&count=30&client_id=` +
      process.env.UNSPLASH_ACCESS_KEY
  );

  const images: UnsplashImage[] = await response.json();

  return (
    <div>
      <h1>{topic}</h1>
      {images.map((image) => (
        <Image
          src={image.urls.raw}
          width={500}
          height={500}
          key={image.urls.raw}
          alt={image.alt_description}
          className={style.image}
        />
      ))}
    </div>
  );
}
