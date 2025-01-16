import { useState } from "react";
import classes from "./NewPost.module.css";

function NewPost({ onCancel, onAddPost }) {
  const [enterBody, setEnterBody] = useState("");
  const [enterAuth, setEnterAuth] = useState("");

  function changeBodyEventHandler(event) {
    setEnterBody(event.target.value);
  }

  function changeAuthEventHandler(event) {
    setEnterAuth(event.target.value);
  }

  function summitHandler(event) {
    event.preventDefault();
    const postData = {
      body: enterBody,
      author: enterAuth,
    };
    onAddPost(postData);
    onCancel();
  }

  return (
    <form className={classes.form}>
      <p>
        <label htmlFor="body">Text</label>
        <textarea
          id="body"
          required
          rows={3}
          onChange={changeBodyEventHandler}
        />
      </p>
      <p>
        <label htmlFor="name">Your name</label>
        <input
          type="text"
          id="name"
          required
          onChange={changeAuthEventHandler}
        />
      </p>
      <p className={classes.actions}>
        <button type="button" onClick={onCancel}>
          Cancel
        </button>
        <button onClick={summitHandler}>Summit</button>
      </p>
    </form>
  );
}

export default NewPost;
