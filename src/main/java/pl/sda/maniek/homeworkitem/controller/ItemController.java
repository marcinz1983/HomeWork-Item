package pl.sda.maniek.homeworkitem.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import pl.sda.maniek.homeworkitem.dto.ItemDto;
import pl.sda.maniek.homeworkitem.exception.ItemNotFoundException;
import pl.sda.maniek.homeworkitem.service.ItemService;

import javax.servlet.http.HttpServletRequest;
import java.time.Clock;
import java.time.LocalDateTime;
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


    @GetMapping("/{category}")
    public List<ItemDto>getItemByCategory(@PathVariable("category") String category){
        logger.info("from itemControler getItemByCategory [{}]", category);

       return itemService.findItemsByCategory(category);

    }






    @ExceptionHandler(ItemNotFoundException.class)
    public ResponseEntity<String> handleBookNotFoundException(Exception exception, HttpServletRequest request) {
        logger.warn(" ExceptionHandler some unexpected exception: ", exception);
        return ResponseEntity.badRequest().body(
             String.format("[%s],[%s],[%s],[%s],",

                     exception.getMessage(),
                     HttpStatus.BAD_REQUEST.value(),
                     exception.getClass().getName(),
                        request.getServletPath() )

        );
    }







}
