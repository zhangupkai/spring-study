package org.example.pojo;

import java.util.*;

/**
 * @Description
 * @Author Kai
 * @Date 2020/12/18 22:01
 */
public class Student {
    private String name;
    private Address address;
    private String[] books;
    private List<String> bobbies;
    private Map<String, String> card;
    private Set<String> games;
    private Properties info;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public String[] getBooks() {
        return books;
    }

    public void setBooks(String[] books) {
        this.books = books;
    }

    public List<String> getBobbies() {
        return bobbies;
    }

    public void setBobbies(List<String> bobbies) {
        this.bobbies = bobbies;
    }

    public Map<String, String> getCard() {
        return card;
    }

    public void setCard(Map<String, String> card) {
        this.card = card;
    }

    public Set<String> getGames() {
        return games;
    }

    public void setGames(Set<String> games) {
        this.games = games;
    }

    public Properties getInfo() {
        return info;
    }

    public void setInfo(Properties info) {
        this.info = info;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", address=" + address +
                ", books=" + Arrays.toString(books) +
                ", bobbies=" + bobbies +
                ", card=" + card +
                ", games=" + games +
                ", info=" + info +
                '}';
    }
}
