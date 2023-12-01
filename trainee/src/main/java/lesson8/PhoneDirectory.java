package lesson8;

import java.util.*;

public class PhoneDirectory {
    private Map<String, List<String>> contacts;

    public PhoneDirectory() {
        contacts = new HashMap<>();
    }

    public void add(String name, String phone) {
        if (contacts.containsKey(name)) {
            contacts.get(name).add(phone);
        } else {
            List<String> phones = new ArrayList<>();
            phones.add(phone);
            contacts.put(name, phones);
        }
    }

    public void get(String name) {
        if (contacts.containsKey(name)) {
            System.out.println(name + ": " + contacts.get(name));
        } else {
            System.out.println(name + ": Данный человек отсутствует в телефонном справочнике");
        }
    }

}
