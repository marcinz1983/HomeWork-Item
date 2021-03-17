package pl.sda.maniek.homeworkitem.converter;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import pl.sda.maniek.homeworkitem.dto.ItemDto;
import pl.sda.maniek.homeworkitem.model.Item;

@Component
public class ItemMapper implements Mapper<Item, ItemDto> {

    private static final Logger logger = LoggerFactory.getLogger(ItemMapper.class);


    @Override
    public ItemDto fromEntityToDto(Item entity) {
        var result = new ItemDto(entity.getId(),entity.getCategory(),entity.getPrice(),entity.getItemName());
        logger.info("converting entity [{}] to DTO [{}]",entity,result);
        return result;
    }


    @Override
    public Item fromDtoToEntity(ItemDto dto) {
        var result = new Item(dto.getId(),dto.getCategory(),dto.getPrice(), dto.getItemName());
        logger.debug("converting dto [{}] to entity [{}] ", dto,result);
        return result;

    }
}
