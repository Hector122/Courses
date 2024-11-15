import "./ui/global.css";
import { montserrat } from "./ui/fonts";

export default function RootLayout({
  children,
}: {
  children: React.ReactNode;
}) {
  return (
    <html lang="en">
      <body className={`${montserrat.className} antialiased`}>
        <h1>This is part of the Layout for all the pages.</h1>
        <div style={{ border: "1px solid #000" }}>{children}</div>
        <footer className="text-center text-sm text-gray-500 p-4">
          Hecho con ❤️ por Vercel y Next.js
        </footer>
      </body>
    </html>
  );
}
