package genomicRangeQuery;

class GenomicRangeQuerySolution {
    int[] solution(String S, int[] P, int[] Q) {
        int[] result = new int[P.length];

        // for every instruction set
        for (int i = 0; i < P.length; i++) {
            String substring;
            // create a substring
            if(Q[i] == S.length()){
                substring = S.substring(P[i]);
            }else{
                substring = S.substring(P[i], Q[i]+1);
            }

            // search substring for chosen value
            if(substring.contains("A")){
                result[i] = 1;
            }else if(substring.contains("C")){
                result[i] = 2;
            }else if(substring.contains("G")){
                result[i] = 3;
            }else{
                result[i] = 4;
            }
        }
        return result;
    }
}
