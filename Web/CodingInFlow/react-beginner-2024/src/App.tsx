import "./index.css";
import TodoList from "./components/TodoList";
import TodoSummary from "./components/TodoSummary";
import AddTodoForm from "./components/AddTodoForm";
import useTodos from "./hooks/useTodos";

function App() {
  const { todos, setTodoCompleted, addTodo, deleteTodo, deleteAllCompleted } =
    useTodos();

  return (
    <main className="py-10 h-screen space-y-5 overflow-auto">
      <h1 className="font-bold text-3xl text-center">Yours Todos</h1>
      <div className="max-w-lg mx-auto bg-slate-100 rounded-md p-5 space-y-5">
        <AddTodoForm addTodo={addTodo} />
        <TodoList
          todos={todos}
          onCompletedChange={setTodoCompleted}
          onDeleteItem={deleteTodo}
        />
      </div>
      <TodoSummary todos={todos} deleteAllCompleted={deleteAllCompleted} />
    </main>
  );
}

export default App;
