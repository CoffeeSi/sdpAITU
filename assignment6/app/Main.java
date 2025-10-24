package app;

import context.ScholarshipContext;
import strategy.IncreasedScholarship;
import strategy.NoScholarship;
import strategy.RegularScholarship;

public class Main {
    public static void main(String[] args) {
        double scholarship = 52123;
        double averageGrade = 91;

        ScholarshipContext scholarshipContext = new ScholarshipContext();

        if (averageGrade >= 90) {
            scholarshipContext.setStrategy(new IncreasedScholarship(2));
        } else if (averageGrade >= 70) {
            scholarshipContext.setStrategy(new RegularScholarship());
        } else {
            scholarshipContext.setStrategy(new NoScholarship());
        }
        System.out.println(scholarshipContext.executeStrategy(scholarship));
    }
}
