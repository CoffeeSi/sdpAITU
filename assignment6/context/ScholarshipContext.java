package context;

import interfaces.IScholarshipStrategy;

public class ScholarshipContext {
    private IScholarshipStrategy strategy;

    public void setStrategy(IScholarshipStrategy strategy) {
        this.strategy = strategy;
    }

    public double executeStrategy(double scholarship) {
        if (strategy == null) {
            throw new IllegalStateException("Strategy is null");
        }
        return strategy.calculate(scholarship);
    }
}
