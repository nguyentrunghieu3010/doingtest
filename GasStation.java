public class GasStation {

    private static final String IMPOSSIBLE = "impossible";

    public static String GasStation(String[] strArr) {
        int numberOfGasStation = Integer.parseInt(strArr[0]); // Retrieve number of gas stations

        //Initialize the array of Gas & Cost
        int[] gasArr = new int[numberOfGasStation];
        int[] costArr = new int[numberOfGasStation];

        for (int i = 1; i <= numberOfGasStation; i++) {
            String[] gasAndCost = strArr[i].split(":");
            gasArr[i - 1] = Integer.parseInt(gasAndCost[0]);
            costArr[i - 1] = Integer.parseInt(gasAndCost[1]);
        }

        for (int startGasStation = 0; startGasStation < numberOfGasStation; startGasStation++) {
            String smallestGasStation = getSmallestIndexGasStation(gasArr, costArr, startGasStation);
            if (!IMPOSSIBLE.equals(smallestGasStation)) return smallestGasStation;
        }
        return IMPOSSIBLE;
    }

    private static String getSmallestIndexGasStation(int[] gas, int[] costs, int startGasStation) {
        int gasSize = gas.length;
        int currentGasStation = startGasStation;
        int nextGasStation = startGasStation < (gasSize - 1) ? startGasStation + 1 : 0;
        int container = 0;
        for (int y = 0; y < gasSize; y++) {
            container = container + (gas[currentGasStation] - costs[currentGasStation]);
            if (container < 0) return IMPOSSIBLE;
            if (y == (gasSize - 1)) return String.valueOf(startGasStation + 1);//+1 because start with zero
            nextGasStation = nextGasStation < (gasSize - 1) ? nextGasStation + 1 : 0;
            currentGasStation = currentGasStation < (gasSize - 1) ? currentGasStation + 1 : 0;
        }
        return IMPOSSIBLE;
    }

    public static void main(String[] args) {
        System.out.println(GasStation(new String[] {"4","3:1","2:2","1:2","0:1"}) + " == 1");
        System.out.println(GasStation(new String[] {"4","1:1","2:2","1:2","0:1"}) + " == impossible");
        System.out.println(GasStation(new String[] {"4","0:1","2:2","1:2","3:1"}) + " == 4");
    }
}
