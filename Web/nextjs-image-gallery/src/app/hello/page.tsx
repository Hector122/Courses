export default async function Page() {
  await new Promise((resolve) => setTimeout(resolve, 2000));

  throw new Error("Bazinga");

  return (
    <div>
      <h1>Hello World</h1>
    </div>
  );
}
