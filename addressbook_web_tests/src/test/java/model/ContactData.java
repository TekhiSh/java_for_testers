package model;

public record ContactData (String firstName, String middleName, String lastName,
                          String nickname, String title, String company, String address,
                          String homePhone, String mobilePhone, String workPhone, String fax,
                          String email, String email2, String email3, String homepage) {

    public ContactData() {
        this("", "", "", "", "", "",
                "", "", "", "", "", "",
                "", "", "");
    }

    public ContactData withFirstName(String firstName) {
        return new ContactData(firstName, this.middleName, this.lastName, this.nickname,
                this.title, this.company, this.address, this.homePhone, this.mobilePhone,
                this.workPhone, this.fax, this.email, this.email2, this.email3, this.homepage);
    }

    public ContactData withMiddleName(String middleName) {
        return new ContactData(this.firstName, middleName, this.lastName, this.nickname,
                this.title, this.company, this.address, this.homePhone, this.mobilePhone,
                this.workPhone, this.fax, this.email, this.email2, this.email3, this.homepage);
    }

    public ContactData withLastName(String lastName) {
        return new ContactData(this.firstName, this.middleName, lastName, this.nickname,
                this.title, this.company, this.address, this.homePhone, this.mobilePhone,
                this.workPhone, this.fax, this.email, this.email2, this.email3, this.homepage);
    }
}
