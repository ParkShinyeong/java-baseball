package baseball;

import java.util.ArrayList;
import java.util.List;

public class BaseballNumber {
    protected List<Integer> baseballNumber = new ArrayList<>();
    public boolean isValidBaseballNumber (List<Integer> baseballNumber) {
        return true;
    };

    public List<Integer> getBaseballNumber() {
        return baseballNumber;
    }

    public void setBaseballNumber(List<Integer> baseballNumber) {
        this.baseballNumber = baseballNumber;
    }
}
