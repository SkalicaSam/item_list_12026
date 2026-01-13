package com.example.ItemsList;

import org.hibernate.cache.spi.support.AbstractReadWriteAccess;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/items")
public class ItemController {

    @Autowired
    private  ItemRepository itemRepository;

     @PostMapping
    public Item createItem(@RequestBody Item item) {
         return  itemRepository.save(item);
     }

     @GetMapping
    public List<Item> getAllItems(){
         return itemRepository.findAll();
     }

}
