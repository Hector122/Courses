package structural.bridge.movie;

public class BridgeDemoMovie {
    public static void main(String[] args) {
        Movie movie = new Movie();
        movie.setClassification("Action - R");
        movie.setTitle("John wick");
        movie.setRuntime("2:15");
        movie.setYear("2014");

        Printer moviePrinter = new MoviePrinter(movie);

        Formatter formatter = new PrintFormatter();
        String printerMaterial = moviePrinter.print(formatter);
        System.out.println(printerMaterial);

        Formatter htmlFormatter = new HtmlFormatter();
        String printHtml = moviePrinter.print(htmlFormatter);

        System.out.println(printHtml);
    }
}
