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


    public static List<Item> findAllItems() {

        return ItemJpaRepository.findAllItems();
    }
}
