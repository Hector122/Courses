import { Todo } from "../types/todo";
import TodoItem from "./TodoItem";

interface TodoListProps {
  todos: Todo[];
  onCompletedChange: (id: number, completed: boolean) => void;
  onDeleteItem: (id: number) => void;
}

export default function TodoList({
  todos,
  onCompletedChange,
  onDeleteItem,
}: TodoListProps) {
  const todosSorted = todos.sort((a, b) => {
    if (a.completed === b.completed) {
      return a.id - b.id;
    }
    return a.completed ? 1 : -1;
  });

  return (
    <>
      <div className="space-y-2">
        {todosSorted.map((todo) => (
          <TodoItem
            key={todo.id}
            todo={todo}
            onCompletedChange={onCompletedChange}
            onDeleteItem={onDeleteItem}
          />
        ))}

        {todos.length === 0 && (
          <p className="text-sm text-gray-500 text-center">
            No todos yet. Please add one
          </p>
        )}
      </div>
    </>
  );
}
