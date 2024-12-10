import { Todo } from "../types/todo";

interface TodoSummaryProps {
  todos: Todo[];
  deleteAllCompleted: () => void;
}

export default function TodoSummary({
  todos,
  deleteAllCompleted,
}: TodoSummaryProps) {
  const completedTodos = todos.filter((todo) => todo.completed);

  return (
    <div className="text-center space-y-2">
      <p>
        {completedTodos.length} / {todos.length} todos completed
      </p>
      {completedTodos.length > 0 && (
        <button
          className="text-sm text-red-500 hover:text-gray-700 font-medium"
          onClick={deleteAllCompleted}
        >
          Delete all completed
        </button>
      )}
    </div>
  );
}
