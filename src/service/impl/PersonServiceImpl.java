package service.impl;

import dao.DataBase;
import model.Person;
import service.GenericService;

import java.util.List;

public class PersonServiceImpl implements GenericService {
    private DataBase dataBase = new DataBase();

    @Override
    public String add(List t) {
        dataBase.getPeople().add((Person)t);
        return String.valueOf(t);
    }

    @Override
    public Object getByld(Long id) {
        for (int i = 0; i < dataBase.getPeople().size(); i++) {
            if (dataBase.getPeople().get(i).getId() == id) {
                return dataBase.getPeople().get(i);
            }
        }
        return id;
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
