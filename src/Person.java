import java.sql.SQLOutput;
import java.util.ArrayList;

public class Person {

    private String name;

    private int age;

    private String sex;

    private String wantBuy;

    public String getWantBuy() {
        return wantBuy;
    }

    public void setWantBuy(String wantBuy) {
        this.wantBuy = wantBuy;
    }

    public void buy(ArrayList<Book> bookStore){
        for (Book book :bookStore){

            if (wantBuy.equals(book.getBookName())){
                System.out.println(this.name+"今年"+this.age+"，"+this.sex+"，"+"想买"+this.wantBuy);
            }


        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }
}
