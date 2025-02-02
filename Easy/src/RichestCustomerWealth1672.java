
public class RichestCustomerWealth1672 {
	
	public static void main(String[] args) {
        int[][] accounts = {
            {1, 2, 3},
            {3, 2, 1},
            {5, 1, 2}
        };

   
        int richestWealth = maximumWealth(accounts);
        System.out.println("Der reichste Kunde hat ein Vermögen von: " + richestWealth);
    }

    public static int maximumWealth(int[][] accounts) {
        int maxWealth = 0;

        for (int i = 0; i < accounts.length; i++) {
            int currentWealth = 0;
            for (int j = 0; j < accounts[i].length; j++) {
                currentWealth += accounts[i][j];
            }
            if (currentWealth > maxWealth) {
                maxWealth = currentWealth;
            }
        }

        return maxWealth;
    }
}
