package pl.sda.maniek.homeworkitem.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.sda.maniek.homeworkitem.model.Item;

public interface ItemJpaRepository extends JpaRepository <Item,Long> {
}
