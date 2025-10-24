package strategy;

import interfaces.IScholarshipStrategy;

public class RegularScholarship implements IScholarshipStrategy {
    @Override
    public double calculate(double scholarship) {
        return scholarship;
    }
}
