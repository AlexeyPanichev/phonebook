import org.example.PhoneBook;
import org.junit.Test;


public class PhoneBookTest {
    @Test
    public void testAdd() {
        PhoneBook phoneBook = new PhoneBook();
        int count = phoneBook.add("Biba", "123456");
        assert count == 1;
        count = phoneBook.add("Luba", "654321");
        assert count == 2;
        count = phoneBook.add("Biba", "123456");
        assert count == 2;
    }

    @Test
    public void testFindByNumber() {
        PhoneBook phoneBook = new PhoneBook();
        phoneBook.add("Biba", "123456");
        phoneBook.add("Luba", "654321");
        String name = phoneBook.findByNumber("123456");
        assert name.equals("Biba");
        name = phoneBook.findByNumber("654321");
        assert name.equals("Luba");
        name = phoneBook.findByNumber("999999");
        assert name == null;
    }

    @Test
        public void testFindByName() {
            PhoneBook phoneBook = new PhoneBook();
            phoneBook.add("Biba", "123456");
            phoneBook.add("Luba", "654321");
            String number = phoneBook.findByName("Biba");
            assert number.equals("123456");
            number = phoneBook.findByName("Luba");
            assert number.equals("654321");
            number = phoneBook.findByName("Boba");
            assert number == null;
    }

    @Test
    public void testPrintAllNames() {
        PhoneBook phoneBook = new PhoneBook();
        phoneBook.add("Biba", "123456");
        phoneBook.add("Luba", "654321");
        phoneBook.add("Alice", "345678");
        phoneBook.printAllNames();

    }
}