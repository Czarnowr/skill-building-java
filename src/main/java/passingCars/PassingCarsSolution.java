package passingCars;

class PassingCarsSolution {
    int solution(int[] A) {

        int result = 0;
        // each '0' in the array is a car going east
        int numberOfCarsPassing = 0;

        for (int car : A) {
            //if the car is going east, increase the car counter
            if (car == 0) {
                numberOfCarsPassing++;
                // if the car is going west, increase the result by the number of passing cars already counted
            } else {
                result += numberOfCarsPassing;
            }

            // if exceeds limit, return -1
            if (result > 1000000000) {
                return -1;
            }
        }
        return result;
    }
}
