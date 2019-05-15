package frogJmp;

class FrogJmpSolution {
    public int solution(int X, int Y, int D){
        int initialPosition = X;
        int targetPosition = Y;
        int jumpDistance = D;
        int distanceToTravel = targetPosition - initialPosition;
        int numberOfFullPossibleJumps = distanceToTravel / jumpDistance;

        return (canDoExactJumps(initialPosition, targetPosition, jumpDistance) ? numberOfFullPossibleJumps : numberOfFullPossibleJumps + 1);
    }

    private static boolean canDoExactJumps(int initialPosition, int targetPosition, int frogJumpDistance){
        return (targetPosition - initialPosition) % frogJumpDistance == 0;
    }
}
