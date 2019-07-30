package codility.lesson6_sorting_MaxProductOfThree;

/**
 * MaxProductOfThree
 * <p>
 * https://app.codility.com/programmers/lessons/6-sorting/max_product_of_three/
 * <p>
 * A non-empty array A consisting of N integers is given. The product of triplet (P, Q, R) equates to A[P] * A[Q] * A[R] (0 ≤ P < Q < R < N).
 * <p>
 * For example, array A such that:
 * <p>
 * A[0] = -3
 * A[1] = 1
 * A[2] = 2
 * A[3] = -2
 * A[4] = 5
 * A[5] = 6
 * contains the following example triplets:
 * <p>
 * (0, 1, 2), product is −3 * 1 * 2 = −6
 * (1, 2, 4), product is 1 * 2 * 5 = 10
 * (2, 4, 5), product is 2 * 5 * 6 = 60
 * Your goal is to find the maximal product of any triplet.
 * <p>
 * Write a function:
 * <p>
 * class Solution { public int solution(int[] A); }
 * <p>
 * that, given a non-empty array A, returns the value of the maximal product of any triplet.
 * <p>
 * For example, given array A such that:
 * <p>
 * A[0] = -3
 * A[1] = 1
 * A[2] = 2
 * A[3] = -2
 * A[4] = 5
 * A[5] = 6
 * the function should return 60, as the product of triplet (2, 4, 5) is maximal.
 * <p>
 * Write an efficient algorithm for the following assumptions:
 * <p>
 * N is an integer within the range [3..100,000];
 * each element of array A is an integer within the range [−1,000..1,000].
 */

public class MaxProductOfThree {
    private static int firstHighest;
    private static int secondHighest;
    private static int thirdHighest;
    private static int negativeFirstLowest;
    private static int negativeSecondLowest;

    public int solution(int[] A) {
        firstHighest = -1000;
        secondHighest = -1000;
        thirdHighest = -1000;
        negativeFirstLowest = 0;
        negativeSecondLowest = 0;

        findNumbersForCalculatingResult(A);

        if (A.length == 3){
            return A[0] * A[1] * A[2];
        }

        int onlyPositives = firstHighest * secondHighest * thirdHighest;
        int PositivesAndNegatives = firstHighest * negativeFirstLowest * negativeSecondLowest;

        return onlyPositives > PositivesAndNegatives ? onlyPositives : PositivesAndNegatives;
    }

    private void findNumbersForCalculatingResult(final int[] A) {
        for (int number : A) {
            if (number > firstHighest) {
                thirdHighest = secondHighest;
                secondHighest = firstHighest;
                firstHighest = number;
            } else if (number > secondHighest) {
                thirdHighest = secondHighest;
                secondHighest = number;
            } else if (number > thirdHighest) {
                thirdHighest = number;
            }

            if (number < 0 && number < negativeFirstLowest) {
                negativeSecondLowest = negativeFirstLowest;
                negativeFirstLowest = number;
            } else if (number < 0 && number < negativeSecondLowest) {
                negativeSecondLowest = number;
            }
        }
    }
}
