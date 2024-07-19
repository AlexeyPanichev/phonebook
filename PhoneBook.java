package org.example;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class PhoneBook {
    private Map<String, String> contactsByName = new HashMap<>();
    private Map<String, String> contactsByNumber = new HashMap<>();
    private Map<String, String> contactsTree = new TreeMap<>();

    public int add(String name, String number) {
        if (!contactsByName.containsKey(name)) {
            contactsByName.put(name, number);
            contactsByNumber.put(number, name);
            contactsTree.put(name, number);
            return contactsByName.size();
        }
        return contactsByName.size();
    }

    public String findByNumber(String number) {
        return contactsByNumber.get(number);
    }

    public String findByName(String name) {
        return contactsByName.get(name);
    }

    public void printAllNames() {
        for (String name : contactsTree.keySet()) {
            System.out.println(name);
        }
    }
}