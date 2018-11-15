package com.itheima.service;

import com.itheima.domain.Items;

public interface ItemsService {
    public Items findById(Integer id);
    public void deleteById(int id);
}
