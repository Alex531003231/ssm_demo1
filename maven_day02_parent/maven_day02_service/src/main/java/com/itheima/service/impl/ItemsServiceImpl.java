package com.itheima.service.impl;

import com.itheima.dao.ItemsDao;
import com.itheima.domain.Items;
import com.itheima.service.ItemsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ItemsServiceImpl implements ItemsService {

    @Autowired
    private ItemsDao itemsDao;

    public Items findById(Integer id) {
        return itemsDao.findById(id);
    }

    @Override

    public void deleteById(int id) {
        itemsDao.deleteById(id);
    }

    public void save(Items items) {
        System.out.println("service调用到保存");
        System.out.println("dao操作数据库进行保存");
        itemsDao.save(items);
    }
}
