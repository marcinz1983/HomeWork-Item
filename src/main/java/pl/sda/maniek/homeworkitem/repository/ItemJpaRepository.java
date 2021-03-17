package pl.sda.maniek.homeworkitem.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import pl.sda.maniek.homeworkitem.dto.ItemDto;
import pl.sda.maniek.homeworkitem.model.Item;

import java.util.List;

public interface ItemJpaRepository extends JpaRepository <Item,Long> {

    @Query("from Items")
    List<Item> findAllItems();
}
