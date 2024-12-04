import { Trash2 } from "lucide-react";
import { Todo } from "../types/todo";

interface TodoItemProps {
  todo: Todo;
  onCompletedChange: (id: number, completed: boolean) => void;
  onDeleteItem: (id: number) => void;
}

export default function TodoItem({
  todo,
  onCompletedChange,
  onDeleteItem,
}: TodoItemProps) {
  return (
    <div className="flex space-x-2">
      <label className="flex items-center space-x-2 gan-2 border rounded-md p-2 border-gray-400 bg-white hover:bg-slate-50 grow">
        <input
          type="checkbox"
          className="scale-125"
          checked={todo.completed}
          onChange={(e) => onCompletedChange(todo.id, e.target.checked)}
        />
        <span className={todo.completed ? "line-through text-gray-400" : ""}>
          {todo.title}
        </span>
      </label>
      <button
        className="ml-auto text-sm text-gray-400 hover:text-red-500"
        onClick={() => onDeleteItem(todo.id)}
      >
        <Trash2 size={20} className=""></Trash2>
      </button>
    </div>
  );
}
