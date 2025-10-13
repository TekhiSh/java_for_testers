package tests;

import model.ContactData;
import org.junit.jupiter.api.Test;

public class ContactCreationTests extends TestBase {

    @Test
    public void canCreateContact() {
        app.contacts().createContact(new ContactData("first name", "", "last name",
                "nickname", "", "", "address",
                "", "+12223334455", "", "",
                "email@email.ai", "", "", "http://localhost/addressbook/"));
    }

    @Test
    public void canCreateEmptyContact() {
        app.contacts().createEmptyContact();
    }

    @Test
    public void canCreateContactWithLastNameOnly() {
        app.contacts().createContact(new ContactData().withLastName("some last name"));
    }
}
