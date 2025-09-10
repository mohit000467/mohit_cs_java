class bank {
    private double balance;
    public double getbalace(){
        return balance;

    }
    public void deposit (double amount){
        if(amount > 0){
            balance += amount;
        }
        else{
            System.out.println("amount must be positive");
        }
    }

}