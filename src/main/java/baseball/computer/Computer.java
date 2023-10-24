package baseball.computer;

import camp.nextstep.edu.missionutils.Randoms;

import java.util.ArrayList;
import java.util.List;

public class Computer {
    public static List<Integer> getNumbers(){
        List<Integer> numbers = new ArrayList<>();
        int randomNumber = Randoms.pickNumberInRange(1, 9);
        while (numbers.size() < 3) {
            if (!numbers.contains(randomNumber)) {
                numbers.add(randomNumber);
            }
        }
        return numbers;
    }
}