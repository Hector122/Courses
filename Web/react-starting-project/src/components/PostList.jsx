import { useState } from "react";
import NewPost from "./NewPost";
import Post from "./Post";
import Modal from "./Modal";
import classes from "./PostList.module.css";

function PostList({ isModalVisible, onCloseModal }) {
  const [posts, setPosts] = useState([]);

  function addPostHandler(postData) {
    fetch("http://localhost:8080/posts", {
      method: "POST",
      body: JSON.stringify(postData),
      headers: {
        "Content-Type": "application/json",
      },
    });

    setPosts((existingPosts) => [postData, ...existingPosts]);
  }

  return (
    <>
      {isModalVisible && (
        <Modal onClose={onCloseModal}>
          <NewPost onCancel={onCloseModal} onAddPost={addPostHandler} />
        </Modal>
      )}
      <ul className={classes.posts}>
        {posts.length > 0 &&
          posts.map((post) => (
            <Post key={post.body} author={post.author} body={post.body} />
          ))}
      </ul>
      {posts.length === 0 && (
        <div style={{ textAlign: "center", color: "white" }}>
          <h2>No posts yet.</h2>
          <p>Please add one</p>
        </div>
      )}
    </>
  );
}

export default PostList;
