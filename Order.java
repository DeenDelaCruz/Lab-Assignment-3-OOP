
public class Order {
	
	   private String item;
	    private Integer quantity;
	    private double unitPrice;
	    private double totalAmount;
	    private PaymentMode paymentMethod;

	    public Order(String item, Integer quantity, double unitPrice, PaymentMode paymentMethod) {
	        this.item = item;
	        this.quantity = quantity;
	        this.unitPrice = unitPrice;
	        this.paymentMethod=paymentMethod;
	    }

	    public String getItem() {
	        return item;
	    }

	    public void setItem(String item) {
	        this.item = item;
	    }

	    public Integer getQuantity() {
	        return quantity;
	    }

	    public void setQuantity(Integer quantity) {
	        this.quantity = quantity;
	    }

	    public double getUnitPrice() {
	        return unitPrice;
	    }

	    public void setUnitPrice(double unitPrice) {
	        this.unitPrice = unitPrice;
	    }

	    public double getTotalAmount() {
	        return (unitPrice*quantity)*(1-paymentMethod.getDiscountRate());
	    }


	    public PaymentMode getMethod() {
	        return paymentMethod;
	    }

	    public void setMode(PaymentMode paymentMethod) {
	        this.paymentMethod = paymentMethod;
	    }

	}
