
In this challenge, you need to build an

application, that can be a store front, for any imaginable item for sale.

Instead of the Main class we usually create, create a Store class, with a main method.


# Store Class

The Store class should:

- manage a list of products for sale, including displaying the product details.

- manage an order, which can just be a list of OrderItem objects.

- have methods to add an item to the order

- print the ordered items, so it looks like a sales receipt.

# ProductForSale Class

- Create A ProductForSale class that should have at least three fields:
    - type,
    - price, 
    - and a description
- and should have methods to:
    - get a Sales Price, a concrete method, which takes a quantity, and returns the quantity * the price.
    - print a Priced Line Item, a concrete method, which takes a quantity, and should print an itemized line item for an order, with quantity and line item price.
    - show Details, an abstract method, which represents what might be displayed on a product page, product type, description, price, and so on.

# OrderItem Type

- Create an OrderItem type, that has at a minimum 2 fields,
    - quantity
    - and a Product for Sale.

# Extend ProductForSale class

- You should create two or three classes that extend the ProductForSale class, that will be products in your store.

All right, so I know that sounds like a lot of work, but you have actually worked on all the parts of this, and seen examples.