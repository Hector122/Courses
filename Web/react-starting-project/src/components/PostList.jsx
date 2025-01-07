import NewPost from "./NewPost";
import Post from "./Post";
import classes from "./PostList.module.css";
import { useState } from "react";

function PostList() {
  const [enterBody, setEnterBody] = useState("");
  const [enterAuth, setEnterAuth] = useState("");

  function changeBodyEventHandler(event) {
    setEnterBody(event.target.value);
  }

  function changeAuthEventHandler(event) {
    setEnterAuth(event.target.value);
  }

  return (
    <>
      <NewPost
        onEnterBody={changeBodyEventHandler}
        onEnterAuth={changeAuthEventHandler}
      />
      <ul className={classes.posts}>
        <Post author={enterAuth} body={enterBody} />
        <Post author="Alex" body="No say that  is the new way to go" />
        <Post author="Alex" body="No say that  is the new way to go" />
      </ul>
    </>
  );
}

export default PostList;
