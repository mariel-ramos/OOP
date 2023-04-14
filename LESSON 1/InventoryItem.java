public class InventoryItem {
    private String itemNumber;
    private String itemDescription;
    private double unitPrice;
    private int quantity;

    public InventoryItem(String itemNumber, String itemDescription, double unitPrice, int quantity) {
        this.itemNumber = itemNumber;
        this.itemDescription = itemDescription;
        this.unitPrice = unitPrice;
        this.quantity = quantity;
    }

    public void displayItemInfo() {
        System.out.println("Item number: " + this.itemNumber);
        System.out.println("Item description: " + this.itemDescription);
        System.out.println("Unit price: " + this.unitPrice);
        System.out.println("Quantity: " + this.quantity);
    }

    public void computeInventory() {
        double inventoryValue = this.quantity * this.unitPrice;
        System.out.println("Inventory value: " + inventoryValue);
    }

    // Example usage:
    public static void main(String[] args) {
        InventoryItem item = new InventoryItem("001", "Product A", 10.0, 5);
        item.displayItemInfo();
        item.computeInventory();
    }
}