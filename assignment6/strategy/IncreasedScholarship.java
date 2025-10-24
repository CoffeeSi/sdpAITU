package strategy;

import interfaces.IScholarshipStrategy;

public class IncreasedScholarship implements IScholarshipStrategy {
    private static final double DEFAULT_MULTIPLIER = 1.3;
    private final double scholarshipMultiplier;

    public IncreasedScholarship() {
        this.scholarshipMultiplier = DEFAULT_MULTIPLIER;
    }

    public IncreasedScholarship(double multiplier) {
        this.scholarshipMultiplier = multiplier;
    }

    @Override
    public double calculate(double scholarship) {
        return scholarship * scholarshipMultiplier;
    }

    public double getScholarshipMultiplier() {
        return scholarshipMultiplier;
    }
}
