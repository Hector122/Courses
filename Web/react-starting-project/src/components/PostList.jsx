import NewPost from "./NewPost";
import Post from "./Post";
import classes from "./PostList.module.css";
import { useState } from "react";
import Modal from "./Modal";

function PostList({ isModalVisible, onCloseModal }) {
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
      {isModalVisible && (
        <Modal onClose={onCloseModal}>
          <NewPost
            onEnterBody={changeBodyEventHandler}
            onEnterAuth={changeAuthEventHandler}
          />
        </Modal>
      )}

      <ul className={classes.posts}>
        <Post author={enterAuth} body={enterBody} />
        <Post author="Alex" body="No say that  is the new way to go" />
        <Post author="Alex" body="No say that  is the new way to go" />
      </ul>
    </>
  );
}

export default PostList;
