public class PaymentApp {
    public static void main(String[] args){

        Order ifGcash = new Order("keyboard", 10, 300, new GCash());

        System.out.println("Order item is " + ifGcash.getItem());
        System.out.println("Unit Price is "+ ifGcash.getUnitPrice());
        System.out.println("Quantity is " + ifGcash.getQuantity());

        System.out.println("\nPayment Order details if " + ifGcash.getMethod().getClass().getSimpleName());
        System.out.println("Discount rate is " + ifGcash.getMethod().getDiscountRate());
        System.out.println("Payment amount is " + ifGcash.getTotalAmount());

        Order ifMaya = new Order("keyboard", 10, 300, new Maya());

        System.out.println("\nPayment Order details if " + ifMaya.getMethod().getClass().getSimpleName());
        System.out.println("Discount rate is " + ifMaya.getMethod().getDiscountRate());
        System.out.println("Payment amount is " + ifMaya.getTotalAmount());

        Order ifShopeePay = new Order("keyboard", 10, 300, new ShopeePay());

        System.out.println("\nPayment Order details if " + ifShopeePay.getMethod().getClass().getSimpleName());
        System.out.println("Discount rate is " + ifShopeePay.getMethod().getDiscountRate());
        System.out.println("Payment amount is " + ifShopeePay.getTotalAmount());
    }
}
