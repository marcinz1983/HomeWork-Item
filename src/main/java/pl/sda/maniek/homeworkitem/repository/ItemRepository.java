package pl.sda.maniek.homeworkitem.repository;

import org.springframework.stereotype.Repository;
import pl.sda.maniek.homeworkitem.dto.ItemDto;
import pl.sda.maniek.homeworkitem.model.Item;

import java.util.List;

@Repository
public class ItemRepository {

    private  final ItemJpaRepository itemJpaRepository;

    public ItemRepository(ItemJpaRepository itemJpaRepository) {
        this.itemJpaRepository = itemJpaRepository;
    }


    public List<Item> findAllItems() {

       return itemJpaRepository.findAllItems();

//        List<Item> rzeczy = List.of(new Item(1l,"owoce",5d,"cytryna"));
//        return rzeczy;
    }
}
