package dao;

import model.Animal;
import model.Person;

import java.awt.geom.Area;
import java.util.ArrayList;

public class DataBase {
    ArrayList<Person> people = new ArrayList<>();
    ArrayList<Animal> animal = new ArrayList<>();

    public DataBase() {
    }

    public DataBase(ArrayList<Person> people, ArrayList<Animal> animal) {
        this.people = people;
        this.animal = animal;
    }

    public ArrayList<Animal> getAnimal() {
        return animal;
    }

    public void setAnimal(ArrayList<Animal> animal) {
        this.animal = animal;
    }

    public ArrayList<Person> getPeople() {
        return people;
    }

    public void setPeople(ArrayList<Person> people) {
        this.people = people;
    }
}
