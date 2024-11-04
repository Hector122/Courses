import { useState } from "react";

interface AddTodoFormProps {
  addTodo: (title: string) => void;
}

export default function AddTodoForm({ addTodo }: AddTodoFormProps) {
  const [input, setInput] = useState("");

  function handleSubmit(e: React.FormEvent) {
    e.preventDefault();

    if (!input.trim()) return;

    addTodo(input);
    setInput("");
  }

  return (
    <form className="flex" onSubmit={handleSubmit}>
      <input
        value={input}
        onChange={(e) => setInput(e.target.value)}
        placeholder="Add a new todo"
        className="rounded-s-md grow border border-gray-400j p-2"
        type="text"
      />
      <button
        type="submit"
        className="w-16 rounded-e-md bg-slate-900 text-white hover:bg-slate-400"
      >
        Add
      </button>
    </form>
  );
}
