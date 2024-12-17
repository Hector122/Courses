interface PagePros {
  params: { topic: string };
}

export default function Page({ params: { topic } }: PagePros) {
  return <h1>My Page: {topic}</h1>;
}
