export interface UnsplashImage {
  description: string;
  alt_description: string;
  urls: {
    raw: string;
  };
  user: {
    username: string;
  };
  width: number;
  height: number;
}
