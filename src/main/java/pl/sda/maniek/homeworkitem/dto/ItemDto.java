package pl.sda.maniek.homeworkitem.dto;

import com.fasterxml.jackson.annotation.JsonProperty;



public class ItemDto {


    private Long id;

    @JsonProperty("kategoria")
    private String category;

    @JsonProperty("cena")
    private String price;

    @JsonProperty("nazwa")
    private String itemName;


    public ItemDto(Long id, String category, String price, String itemName) {
        this.id = id;
        this.category = category;
        this.price = price;
        this.itemName = itemName;
    }

    public Long getId() {
        return id;
    }


    public String getCategory() {
        return category;
    }



    public String getPrice() {
        return price;
    }



    public String getItemName() {
        return itemName;
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


