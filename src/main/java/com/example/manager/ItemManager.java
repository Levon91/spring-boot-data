package com.example.manager;

import com.example.model.Item;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by levont on 12/09/2016.
 */
@Repository
public interface ItemManager extends PagingAndSortingRepository<Item, Integer> {

    @Override
    Item save(Item u);

    @Override
    void delete(Integer i);
}
