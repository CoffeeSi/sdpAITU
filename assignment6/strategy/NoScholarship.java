package strategy;

import interfaces.IScholarshipStrategy;

public class NoScholarship implements IScholarshipStrategy {
    @Override
    public double calculate(double scholarship) {
        return 0;
    }
}
