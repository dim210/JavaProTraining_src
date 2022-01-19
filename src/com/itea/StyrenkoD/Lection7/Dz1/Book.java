package com.itea.StyrenkoD.Lection7.Dz1;

public class Book {
    private String name;
    private String author;
    private String publisher;
    private double price;
    private final int minPrice = 10;

    public Book(String name, String author, String publisher, double price) {
        this.setName(name);
        this.setAuthor(author);
        this.setPublisher(publisher);
        this.setPrice(price);
    }

    public String getName() {
        return name;
    }

    private void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    private void setAuthor(String author) {
        this.author = author;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if (price <this.minPrice ){
            System.out.println("Минимальная стоимость книги "+this.minPrice);
            this.price = this.minPrice;
        } else {
            this.price = price;
        }
    }

    public void getInfo(){
        System.out.println("Книга: "+this.getName()+", автор: "+ this.getAuthor()+", идательство: "+this.getPublisher()+", цена: "+this.getPrice());
    }
}
