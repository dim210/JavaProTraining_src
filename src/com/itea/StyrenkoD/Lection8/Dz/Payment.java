package com.itea.StyrenkoD.Lection8.Dz;

public class Payment {
    private Order order;
    private double paymentSum = 0;

    public Payment() {
        this.order = new Order();
    } //делаем алгоритм только на один заказ

    public void addProductToOrder(int id, String name, double cost) {
        this.order.addProduct(id, name, cost);
    }

    public void toPayOrder() {
        if (this.order.isPayed) {
            System.out.println("Order is already paid!");
        } else {
            this.paymentSum = this.paymentSum + this.order.getTotalCost();
            this.order.setPayed(true);
        }
    }

    @Override
    public String toString() {
        return this.order.toString() + "\nStatus: " + (this.order.isPayed() ? "Paid" : "Not paid");
    }

    public class Order {
        private double totalCost = 0;
        private boolean isPayed = false;
        private final int MAXPRODUCTCOUNT = 10;
        private int productCount = 0;
        private Product[] products = new Product[MAXPRODUCTCOUNT];

        private void addProduct(int id, String name, double cost) {
            if (productCount < MAXPRODUCTCOUNT) {
                this.products[this.productCount] = new Product(id, name, cost);
                this.productCount++;
                this.totalCost = this.totalCost + cost;
            } else {
                System.out.println("Больше 10 товаров добавлять в один заказ добавить нельзя!");
            }
        }

        public double getTotalCost() {
            return totalCost;
        }

        public boolean isPayed() {
            return isPayed;
        }

        public void setPayed(boolean payed) {
            isPayed = payed;
        }

        @Override
        public String toString() {
            String allProducts = "-- Order: --\n";
            for (int i = 0; i < this.products.length; i++) {
                if (this.products[i] != null) {
                    allProducts = allProducts + (i + 1) + " " + this.products[i] + "\n";
                }
            }
            return allProducts + "-----------\nTotal cost: " + this.getTotalCost();
        }

        private class Product {
            private int id;
            private String name;
            private double cost;

            public int getId() {
                return id;
            }

            public String getName() {
                return name;
            }

            public double getCost() {
                return cost;
            }

            public Product(int id, String name, double cost) {
                this.id = id;
                this.name = name;
                this.cost = cost;
            }

            @Override
            public String toString() {
                return "product id:" + this.getId() + ", '" + this.getName() + "', cost:" + this.getCost();
            }
        }
    }
}
