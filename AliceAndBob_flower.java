class AliceAndBob_flower {
    public long flowerGame(int n, int m) {
        long n_num_even = n / 2;
        long n_num_odd = (n+1) / 2;
        long m_num_even = m / 2;
        long m_num_odd = (m+1) / 2;

        long result1 = n_num_odd * m_num_even;
        long result2 = n_num_even * m_num_odd;

        return result1 + result2;
    }
}
