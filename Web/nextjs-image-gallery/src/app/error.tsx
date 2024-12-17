"use client";

import Button from "react-bootstrap/Button";

interface ErrorProps {
  error: Error;
  reset: () => void;
}

export default function Error({ error, reset }: ErrorProps) {
  return (
    <div>
      <h1>Error Happen, Bazinga! </h1>
      <p>{error.message}</p>
      <p>{error.stack}</p>

      <p>Try again</p>
      <Button onClick={reset}>Try again</Button>
    </div>
  );
}
