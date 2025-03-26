"use client";
import { use, useRef } from "react";
import classes from "./image-picker.module.css";

export default function ImagePicker({ label, name }) {
  const imagePicker = useRef();

  function handleImageChange() {
    imagePicker.current.click();
  }

  return (
    <div className={classes.picker}>
      <label htmlFor="image">{label}</label>
      <div className={classes.controls}>
        <input
          className={classes.input}
          type="file"
          id={name}
          name={name}
          accept=".jpg,.jpeg,.png"
          ref={imagePicker}
        />
        <button
          className={classes.button}
          type="button"
          onClick={handleImageChange}
        >
          Pick an Image
        </button>
      </div>
    </div>
  );
}
