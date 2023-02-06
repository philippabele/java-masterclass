package section11abstraction.challengeabstractclasses;

/**
 * InnerOrderItem
 * int qty, ProductForSale product
 */
public record OrderItem(int quantity, ProductForSale product) {
}
