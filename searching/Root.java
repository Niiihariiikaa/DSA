class Solution {
    public int NthRoot(int N, int M) {
       double root= Math.pow(M, 1.0/N);
    int round= (int)Math.round(root);
    if(Math.pow(round,N)==M) return round;
    return -1;

        
    }
}
