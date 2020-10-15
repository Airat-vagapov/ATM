public class ATM {
    private int atmMoney;
    private int clientMoney;

    public ATM(int atmMoney, int clientMoney) {
        this.atmMoney = atmMoney;
        this.clientMoney = clientMoney;
    }

    public int getAtmMoney() {
        return atmMoney;
    }

    public int getClientMoney() {
        return clientMoney;
    }

    public int takeMoney() {
        atmMoney = atmMoney + clientMoney;
        return atmMoney;
    }

    public int getMoney() {
        if (atmMoney < clientMoney) {
            return atmMoney;
        }
        atmMoney = atmMoney - clientMoney;
        return clientMoney;

    }


}
