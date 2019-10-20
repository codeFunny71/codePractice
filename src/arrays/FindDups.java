package arrays;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FindDups {
    @Test
    public void returnsEmptyList(){
        int[] test = {};
        List<Integer> dups = findDups(test);
        Assertions.assertEquals(0, dups.size());
    }
    @Test
    public void returnsTrueIfHasDupes(){
        int[] test = {2,2};
        List<Integer> dups = findDups(test);
        Assertions.assertEquals(test.length, dups.size());
    }
    @Test
    private List<Integer> findDups(int[] test) {
        return new ArrayList<>();
    }
}
