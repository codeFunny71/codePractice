package arrays;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

import java.util.ArrayList;
import java.util.List;

public class FindDups {
    @Test
    public void returnsEmptyList(){
        int[] test = {};
        List<Integer> dups = findDups(test);
        Assertions.assertEquals(0, dups.size());
    }

    private List<Integer> findDups(int[] test) {
        return new ArrayList<>();
    }
}
