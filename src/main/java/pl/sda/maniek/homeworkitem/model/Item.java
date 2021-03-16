package pl.sda.maniek.homeworkitem.model;

import javax.persistence.*;

@Table(name = "Items")
@Entity(name = "Items")
public class Item {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name ="kategoria")
    private String category;

    @Column(name = "cena")
    private String price;

    @Column(name = "nazwa")
    private String itemName;

    public Item(Long id, String category, String price, String itemName) {
        this.id = id;
        this.category = category;
        this.price = price;
        this.itemName = itemName;
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    @Override
    public String toString() {
        return "Item{" +
                "id=" + id +
                ", category='" + category + '\'' +
                ", price='" + price + '\'' +
                ", itemName='" + itemName + '\'' +
                '}';
    }
}
