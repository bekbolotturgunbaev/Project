package service.impl;

import dao.DataBase;
import service.GenericService;

import java.util.List;

public class AnimalServiceImpl implements GenericService {
    private DataBase dataBase = new DataBase();
    @Override
    public String add(List t) {
        return null;
    }

    @Override
    public Object getByld(Long id) {
        return null;
    }

    @Override
    public String removeByName(String name) {
        return null;
    }

    @Override
    public List getAll() {
        return null;
    }

    @Override
    public List sortByName() {
        return null;
    }

    @Override
    public List filterByGender() {
        return null;
    }

    @Override
    public List clear() {
        return null;
    }
}
