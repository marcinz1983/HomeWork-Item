package pl.sda.maniek.homeworkitem.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import pl.sda.maniek.homeworkitem.converter.ItemMapper;
import pl.sda.maniek.homeworkitem.dto.ItemDto;
import pl.sda.maniek.homeworkitem.exception.ItemNotFoundException;
import pl.sda.maniek.homeworkitem.model.Item;
import pl.sda.maniek.homeworkitem.repository.ItemRepository;

import java.util.List;
import java.util.Locale;
import java.util.Objects;

import static java.util.stream.Collectors.toList;

@Service
public class ItemService {

    private static final Logger logger = LoggerFactory.getLogger(ItemService.class);

    private  final ItemMapper itemMapper;
    private final ItemRepository itemRepository;

    public ItemService(ItemMapper itemMapper, ItemRepository itemRepository) {
        this.itemMapper = itemMapper;
        this.itemRepository = itemRepository;
    }

    public  List<ItemDto> findAllItems() {

        logger.debug("method findAllItems from ItemService");
        var result = itemRepository.findAllItems()
                .stream()
                .map(item -> itemMapper.fromEntityToDto(item))
                .collect(toList());
        return result;

    }

    public List<ItemDto> findItemsByCategory(String category) {
        logger.info("from service findItemByCategory : [{}]", category);

        Objects.requireNonNull(category,"category can't by null");

      var result = itemRepository.findAllItems()
                .stream()
                .filter(Items -> Items.getCategory().equals(category.toUpperCase()))
                .collect(toList());

          if(result.isEmpty()) {
           throw new ItemNotFoundException(String.format("no Item with category:[%s]",category));
        }else
              return result.stream()
                .map(item -> itemMapper.fromEntityToDto(item))
               .collect(toList());

    }
}
