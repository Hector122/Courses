import { UnsplashImage } from "@/models/unsplash-image";
import Image from "next/image";
import Link from "next/link";
import { Alert } from "@/components/bootstrap";

export const metadata = {
  title: "static fetching - NextJS Image",
};

//export const revalidate = 15;

export default async function Page() {
  const response = await fetch(
    "https://api.unsplash.com/photos/random/?client_id=" +
      process.env.UNSPLASH_ACCESS_KEY,
    {
      //cache: "no-cache",
      next: { revalidate: 15 },
    }
  );
  const data: UnsplashImage = await response.json();
  console.log("data", data.alt_description);

  const width = Math.min(500, data.width);
  const height = (width / data.width) * data.height;
  const username = data.user.username;

  return (
    <div className="d-flex flex-column align-item-center">
      <Alert></Alert>
      <Image
        src={data.urls.raw}
        alt={data.alt_description}
        width={width}
        height={height}
        className="rounded mx-auto d-block"
      />
      By <Link href={"/users/" + username}>{username}</Link>
    </div>
  );
}
