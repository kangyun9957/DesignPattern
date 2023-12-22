package creational_patterns.builder._01_after;

import creational_patterns.builder._01_before.DetailPlan;
import creational_patterns.builder._01_before.TourPlan;

import java.time.LocalDate;

public class TourDirector {

    private TourPlanBuilder tourPlanBuilder;

    TourDirector(TourPlanBuilder tourPlanBuilder){
        this.tourPlanBuilder = tourPlanBuilder;
    }

    public TourPlan koreaTrip(){
        return tourPlanBuilder
                .title("한국여행")
                .nightsAndDays(3,10)
                .date(LocalDate.of(2023,3,10))
                .stay("5성급호텔")
                .addPlan(3,"체크인")
                .getPlan();
    }


    public TourPlan japanTrip(){
        return tourPlanBuilder
                .title("일본여행")
                .nightsAndDays(3,10)
                .date(LocalDate.of(2023,3,10))
                .stay("5성급호텔")
                .addPlan(3,"체크인")
                .getPlan();
    }


}
