public class Member {
    private String name;
    private String birthDate;
    private int memberId;
    private Book[] books=new Book[5];

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    public int getMemberId() {
        return memberId;
    }

    public void setMemberId(int memberId) {
        this.memberId = memberId;
    }

    public Member() {
        for (int i=0; i<5;i++){
            books[i]=new Book();
        }
    }
}
