package pl.sda.maniek.homeworkitem.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pl.sda.maniek.homeworkitem.dto.ItemDto;
import pl.sda.maniek.homeworkitem.service.ItemService;

import java.util.List;

@RestController
@RequestMapping("/items")
public class ItemController {

    private  static final Logger logger = LoggerFactory.getLogger(ItemController.class);

    private final ItemService itemService;

    public ItemController(ItemService itemService) {
        this.itemService = itemService;
    }


    @GetMapping
    public List <ItemDto> getAllItems(){

        logger.info("from method getAllItems");

        return itemService.findAllItems();
    }





}
