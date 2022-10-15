package creational.prototype;

public class PrototypeDemo {
    public static void main(String [] args){
        Registry registry = new Registry();
        Movie movie = (Movie) registry.createItem(ItemType.MOVIE);
        movie.setTitle("Creatinal patters in Java");

        System.out.println(movie + "\n" +
                movie.getTitle() + "\n" +
                movie.getRuntime() + "\n" +
                movie.getPrice() + "\n" +
                movie.getUrl());

        Movie anotherMovie = (Movie) registry.createItem(ItemType.BOOK);
        anotherMovie.setTitle("Gang of Four");

        System.out.println(anotherMovie + "\n" +
                anotherMovie.getTitle() + "\n" +
                anotherMovie.getRuntime() + "\n" +
                anotherMovie.getPrice() + "\n" +
                anotherMovie.getUrl());

    }
}
