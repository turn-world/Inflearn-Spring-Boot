package hello.core.order;

public class Order {
    private Long memberId;
    private String itemName;
    private int Priceitem;
    private int discountPrice;

    public Order(Long memberId, String itemName, int priceitem, int discountPrice) {

        this.memberId = memberId;
        this.itemName = itemName;
        Priceitem = priceitem;
        this.discountPrice = discountPrice;
    }

    public int calculatePrice(){
        return Priceitem - discountPrice;
    }
    public Long getMemberId() {
        return memberId;
    }

    public void setMemberId(Long memberId) {
        this.memberId = memberId;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public int getPriceitem() {
        return Priceitem;
    }

    public void setPriceitem(int priceitem) {
        Priceitem = priceitem;
    }

    public int getDiscountPrice() {
        return discountPrice;
    }

    public void setDiscountPrice(int discountPrice) {
        this.discountPrice = discountPrice;
    }

    @Override
    public String toString() {
        return "Order{" +
                "memberId=" + memberId +
                ", itemName='" + itemName + '\'' +
                ", Priceitem=" + Priceitem +
                ", discountPrice=" + discountPrice +
                '}';
    }
}
