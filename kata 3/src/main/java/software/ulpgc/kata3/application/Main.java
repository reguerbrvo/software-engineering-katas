package software.ulpgc.kata3.application;

import software.ulpgc.kata3.model.Movie;
import software.ulpgc.kata3.tasks.HistogramBuilder;
import software.ulpgc.kata3.viewmodel.Histogram;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Movie> movies = new RemoteMovieLoader(Main::fromTsv).loadAll();
        Histogram histogram = new HistogramBuilder(movies).build( m->(m.year() / 10) * 10);
        for (int bin : histogram) {
            System.out.println(bin + ": " + histogram.count(bin));
        }
    }

    public static Movie fromTsv(String line) {
        return fromTsv(line.split("\t"));
    }

    public static Movie fromTsv(String[] split) {
        return new Movie(
                split[2],
                toInt(split[5]),
                toInt(split[7])
        );
    }

    private static int toInt(String s) {
        if (s.equals("\\N")) return -1;
        return Integer.parseInt(s);
    }
}
