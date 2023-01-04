package service;

import java.util.List;

public interface GenericService <T>{
    String add(List<T> t);
    T getByld(Long id);
    String removeByName(String name);
    List<T> getAll();
    List<T> sortByName();
    List<T> filterByGender();
    List<T> clear();
}
