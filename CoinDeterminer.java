public class CoinDeterminer {

    private static int coinDeterminer(int num) {
        int[] systemCoins = {11, 9, 7, 5, 1};
        int temp = num;
        int counter = 0;
        for (int coin : systemCoins) {
            double coinResult = Math.floor(temp / coin);
            if ((temp / coinResult) > 0) {
                counter += coinResult;
                temp -= (coin * coinResult);
            }
        }
        return counter;
    }
    public static void main(String[] args) {
        System.out.println(coinDeterminer(25));
    }
}
