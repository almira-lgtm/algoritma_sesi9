public class getDiscount {
    public static void main(String[] args) {
        double totalPayment = 100000.00;
        double money = 150000.00;
        double discount = 0;
        if(totalPayment > 200000.00) {
            discount = totalPayment-(totalPayment*0.20);
        }else if(totalPayment > 50000.00) {
            discount = totalPayment-(totalPayment*0.10);
        }else {
            discount = totalPayment-(totalPayment*0.00);
        }
        double exhange = money-discount;
        System.out.println(exhange);

    }   
}
