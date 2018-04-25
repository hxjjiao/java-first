import java.util.ArrayList;

public class TestBook {
    public static void main(String[] args) {

        ArrayList<Book> bookStore=new ArrayList();

        Book a = new Book();
        a.setBookName("Java编程思想（第4版）");
        a.setPrice(85.7);

        Book b = new Book();
        b.setBookName("Head First Java（中文版）（第2版）" );
        b.setPrice(53.66);

        Book c = new Book();
        c.setBookName("人类简史");
        c.setPrice(46.24);

        Book d = new Book();
        d.setBookName("三体");
        d.setPrice(17.1);

        Book e = new Book();
        e.setBookName("算法导论");
        e.setPrice(101.9);

        bookStore.add(a);
        bookStore.add(b);
        bookStore.add(c);
        bookStore.add(d);
        bookStore.add(e);

        Person one = new Person();
        one.setName("小Q");
        one.setAge(22);
        one.setSex("男");
        one.setWantBuy("算法导论");
        one.buy(bookStore);


        Person two = new Person();
        two.setName("小M");
        two.setAge(18);
        two.setSex("女");
        two.setWantBuy("三体");
        two.buy(bookStore);

    }
}
