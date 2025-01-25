import { useState, useEffect } from "react";
import NewPost from "../router/NewPost";
import Post from "./Post";
import Modal from "./Modal";
import classes from "./PostList.module.css";

function PostList() {
  const [posts, setPosts] = useState([]);
  const [isFetching, setFetching] = useState(false);

  useEffect(() => {
    async function fetchPosts() {
      setFetching(true);
      const response = await fetch("http://localhost:8080/posts");
      const resData = await response.json();
      console.log("fetchData:", resData.posts);
      setPosts(resData.posts);
      setFetching(false);
    }

    fetchPosts();
  }, []);

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
      <ul className={classes.posts}>
        {!isFetching &&
          posts.length > 0 &&
          posts.map((post) => (
            <Post key={post.body} author={post.author} body={post.body} />
          ))}
      </ul>
      {!isFetching && posts.length === 0 && (
        <div style={{ textAlign: "center", color: "white" }}>
          <h2>No posts yet.</h2>
          <p>Please add one</p>
        </div>
      )}
      {isFetching && (
        <div style={{ textAlign: "center", color: "white" }}>
          <p>Loading posts...</p>
        </div>
      )}
    </>
  );
}

export default PostList;
