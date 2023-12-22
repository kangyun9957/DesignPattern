package creational_patterns.builder._01_after;

import creational_patterns.builder._01_before.TourPlan;

import java.time.LocalDate;

public interface TourPlanBuilder {
    TourPlanBuilder title(String title);
    TourPlanBuilder nightsAndDays(int nights, int days);
    TourPlanBuilder date(LocalDate startDate);
    TourPlanBuilder stay(String whereToStay);
    TourPlanBuilder addPlan(int day,String plan);

    TourPlan getPlan();
}
