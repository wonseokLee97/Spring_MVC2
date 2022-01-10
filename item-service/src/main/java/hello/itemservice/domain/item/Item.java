package hello.itemservice.domain.item;
import lombok.Data;


@Data
public class Item {

    private Long id;
    private String itemName;
    private Integer price;  // nullable
    private Integer quantity; // nullable


    public Item() {
    }

    public Item(String itemName, Integer price, Integer quantity) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }

}
