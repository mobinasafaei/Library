public class Library {
    private Book[] books = new Book[50];
    private Member[] members = new Member[50];


    public Library() {
        for (int i = 0; i < 50; i++) {
            books[i] = new Book();
        }
        for (int i = 0; i < 50; i++) {
            members[i] = new Member();

        }
    }

    public Book getBooks(int i) {
        return books[i];
    }

    public void setBooks(Book books, int i) {
        this.books[i] = books;
    }

    public Member getMembers(int id) {
        return members[id];
    }

    public void setMembers(Member member,int id) {
        this.members[id] = member;
    }

}
