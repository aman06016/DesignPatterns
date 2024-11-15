package com.example.design.designPatterns.creational.builderPattern.example1;

public class Order {

    // Required attributes
    private final String mainDish;

    // Optional attributes
    private final String sideDish;
    private final String drink;
    private final String dessert;
    private final boolean hasCutlery;
    private final boolean hasNapkin;

    // Private constructor accessible only via the Builder
    private Order(OrderBuilder builder) {
        this.mainDish = builder.mainDish;
        this.sideDish = builder.sideDish;
        this.drink = builder.drink;
        this.dessert = builder.dessert;
        this.hasCutlery = builder.hasCutlery;
        this.hasNapkin = builder.hasNapkin;
    }

    // Getters for each attribute (no setters, as the object is immutable)
    public String getMainDish() {
        return mainDish;
    }

    public String getSideDish() {
        return sideDish;
    }

    public String getDrink() {
        return drink;
    }

    public String getDessert() {
        return dessert;
    }

    public boolean hasCutlery() {
        return hasCutlery;
    }

    public boolean hasNapkin() {
        return hasNapkin;
    }

    @Override
    public String toString() {
        return "Order{" +
                "mainDish='" + mainDish + '\'' +
                ", sideDish='" + sideDish + '\'' +
                ", drink='" + drink + '\'' +
                ", dessert='" + dessert + '\'' +
                ", hasCutlery=" + hasCutlery +
                ", hasNapkin=" + hasNapkin +
                '}';
    }

    // Static inner Builder class
    public static class OrderBuilder {

        // Required attribute
        private final String mainDish;

        // Optional attributes
        private String sideDish;
        private String drink;
        private String dessert;
        private boolean hasCutlery;
        private boolean hasNapkin;

        // Constructor for required attribute
        public OrderBuilder(String mainDish) {
            this.mainDish = mainDish;
        }

        // Setter methods for optional attributes that return the builder itself
        public OrderBuilder sideDish(String sideDish) {
            this.sideDish = sideDish;
            return this;
        }

        public OrderBuilder drink(String drink) {
            this.drink = drink;
            return this;
        }

        public OrderBuilder dessert(String dessert) {
            this.dessert = dessert;
            return this;
        }

        public OrderBuilder hasCutlery(boolean hasCutlery) {
            this.hasCutlery = hasCutlery;
            return this;
        }

        public OrderBuilder hasNapkin(boolean hasNapkin) {
            this.hasNapkin = hasNapkin;
            return this;
        }

        // Build method that returns a new Order instance
        public Order build() {
            return new Order(this);
        }
    }
}
