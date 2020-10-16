public class ATM {
    private int atmMoney;

    public ATM(int atmMoney, int clientMoney) {
        this.atmMoney = atmMoney;
    }

    public int getAtmMoney() {
        return atmMoney;
    }

    public int takeMoney(int clientMoney) {
        atmMoney = atmMoney + clientMoney;
        return atmMoney;
    }

    public int getMoney(int clientMoney) {
        if (atmMoney < clientMoney) {
            System.out.println("Error text");
            return atmMoney;
        }

        atmMoney = atmMoney - clientMoney;
        return atmMoney;
    }

}
