package creational_patterns.builder._01_after;

public class App {

    public static void main(String[] args){
        TourDirector tourDirector = new TourDirector(new DefaultTourPlanBuilder());
        tourDirector.koreaTrip();
        tourDirector.japanTrip();
    }
}
