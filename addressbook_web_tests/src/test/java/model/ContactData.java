package model;

public record ContactData (String id, String firstName, String middleName, String lastName,
                           String nickname, String photo, String title, String company, String address,
                           String homePhone, String mobilePhone, String workPhone, String fax,
                           String email, String email2, String email3, String homepage) {

    public ContactData() {
        this("", "", "", "", "", "", "",
                "", "", "", "", "", "",
                "", "", "", "");
    }

    public ContactData withFirstName(String firstName) {
        return new ContactData(this.id, firstName, this.middleName, this.lastName, this.nickname, this.photo,
                this.title, this.company, this.address, this.homePhone, this.mobilePhone,
                this.workPhone, this.fax, this.email, this.email2, this.email3, this.homepage);
    }

    public ContactData withId(String id) {
        return new ContactData(id, this.firstName, this.middleName, this.lastName, this.nickname, this.photo,
                this.title, this.company, this.address, this.homePhone, this.mobilePhone,
                this.workPhone, this.fax, this.email, this.email2, this.email3, this.homepage);
    }

    public ContactData withMiddleName(String middleName) {
        return new ContactData(this.id, this.firstName, middleName, this.lastName, this.nickname, this.photo,
                this.title, this.company, this.address, this.homePhone, this.mobilePhone,
                this.workPhone, this.fax, this.email, this.email2, this.email3, this.homepage);
    }

    public ContactData withLastName(String lastName) {
        return new ContactData(this.id, this.firstName, this.middleName, lastName, this.nickname, this.photo,
                this.title, this.company, this.address, this.homePhone, this.mobilePhone,
                this.workPhone, this.fax, this.email, this.email2, this.email3, this.homepage);
    }

    public ContactData withNickname(String nickname) {
        return new ContactData(this.id, this.firstName, this.middleName, this.lastName, nickname, this.photo,
                this.title, this.company, this.address, this.homePhone, this.mobilePhone,
                this.workPhone, this.fax, this.email, this.email2, this.email3, this.homepage);
    }

    public ContactData withTitle(String title) {
        return new ContactData(this.id, this.firstName, this.middleName, this.lastName, this.nickname, this.photo,
                title, this.company, this.address, this.homePhone, this.mobilePhone,
                this.workPhone, this.fax, this.email, this.email2, this.email3, this.homepage);
    }

    public ContactData withCompany(String company) {
        return new ContactData(this.id, this.firstName, this.middleName, this.lastName, this.nickname, this.photo,
                this.title, company, this.address, this.homePhone, this.mobilePhone,
                this.workPhone, this.fax, this.email, this.email2, this.email3, this.homepage);
    }

    public ContactData withAddress(String address) {
        return new ContactData(this.id, this.firstName, this.middleName, this.lastName, this.nickname, this.photo,
                this.title, this.company, address, this.homePhone, this.mobilePhone,
                this.workPhone, this.fax, this.email, this.email2, this.email3, this.homepage);
    }

    public ContactData withEmail(String email) {
        return new ContactData(this.id, this.firstName, this.middleName, this.lastName, this.nickname, this.photo,
                this.title, this.company, this.address, this.homePhone, this.mobilePhone,
                this.workPhone, this.fax, email, this.email2, this.email3, this.homepage);
    }

    public ContactData withHomepage(String homepage) {
        return new ContactData(this.id, this.firstName, this.middleName, this.lastName, this.nickname, this.photo,
                this.title, this.company, this.address, this.homePhone, this.mobilePhone,
                this.workPhone, this.fax, this.email, this.email2, this.email3, homepage);
    }

    public ContactData withMobilePhone(String mobilePhone) {
        return new ContactData(this.id, this.firstName, this.middleName, this.lastName, this.nickname, this.photo,
                this.title, this.company, this.address, this.homePhone, mobilePhone,
                this.workPhone, this.fax, this.email, this.email2, this.email3, this.homepage);
    }

    public ContactData withPhoto(String photo) {
        return new ContactData(this.id, this.firstName, this.middleName, this.lastName, this.nickname, photo,
                this.title, this.company, this.address, this.homePhone, this.mobilePhone,
                this.workPhone, this.fax, this.email, this.email2, this.email3, this.homepage);
    }
}
