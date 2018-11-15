package com.itheima.dao;

import com.itheima.domain.Items;

public interface ItemsDao {
    public Items findById(Integer id);

    public void deleteById(int id);


    void save(Items items);


}
