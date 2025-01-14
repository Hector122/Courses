import MainHeader from "./components/MainHeader";
import PostList from "./components/PostList";
import { useState } from "react";

function App() {
  const [modalIsVisible, setModalIsVisible] = useState(false);

  function shoModalHandler() {
    setModalIsVisible(true);
  }

  function hideModalHandler() {
    setModalIsVisible(false);
  }

  return (
    <>
      <MainHeader onCreatePost={shoModalHandler} />
      <main>
        <PostList
          isModalVisible={modalIsVisible}
          onCloseModal={hideModalHandler}
        />
      </main>
    </>
  );s
}

export default App;
