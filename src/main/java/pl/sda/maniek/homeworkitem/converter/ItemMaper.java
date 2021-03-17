package pl.sda.maniek.homeworkitem.converter;

import pl.sda.maniek.homeworkitem.dto.ItemDto;
import pl.sda.maniek.homeworkitem.model.Item;

public class ItemMaper implements Mapper<Item, ItemDto> {


    @Override
    public ItemDto fromEntityToDto(Item entity) {
        return null;
    }

    @Override
    public Item fromDtoToEntity(ItemDto dto) {
        return null;
    }
}
