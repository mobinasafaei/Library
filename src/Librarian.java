public class Librarian {
    public static void addBook(String name, int count) {
        Book[] books = new Book[count];
        Library library = new Library();
        for (int i = 0; i < count; i++) {
            library.setBooks(books[i], i);
            library.getBooks(i).setBookId(i);
            library.getBooks(i).setBookName(name);
        }
    }

    public static void addMember(String name, String birthDate) {
        Member member = new Member();
        member.setBirthDate(birthDate);
        //member.setMemberId();
        Library library = new Library();
        library.setMembers(member, member.getMemberId());//not complete

    }

    public static void giveMemberBook(int memberId, int bookId) {
        Member member = new Member();
        member.setMemberId(memberId);


    }
}
