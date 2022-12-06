package data.repositories;

import data.models.PhoneBook;

public interface PhoneBookRepository {
    PhoneBook save(PhoneBook phoneBook);
    void delete(PhoneBook phoneBook);
    int count();

}
