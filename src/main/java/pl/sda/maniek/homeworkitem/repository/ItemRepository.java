package pl.sda.maniek.homeworkitem.repository;

import org.springframework.stereotype.Repository;

@Repository
public class ItemRepository {

    private  final ItemJpaRepository itemJpaRepository;

    public ItemRepository(ItemJpaRepository itemJpaRepository) {
        this.itemJpaRepository = itemJpaRepository;
    }


}
