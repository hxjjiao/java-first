import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.concurrent.Callable;

public class Test {

    public static void main(String[] args) {

        ArrayList<Bike> list = new ArrayList();

        Calendar calendar = Calendar.getInstance();

        Bike bike = new Bike("捷安特");
        bike.setType("山地车");
        bike.setMall(true);
        calendar.set(2017, 2, 1);
        bike.setPublishTime(calendar.getTime());

        calendar.clear();

        Bike bike2 = new Bike("捷安特");
        bike2.setType("山地车");
        bike2.setMall(false);
        calendar.set(2018, 0, 1);
        bike2.setPublishTime(calendar.getTime());

        calendar.clear();

        Bike bike3 = new Bike("永久");
        bike3.setType("山地车");
        bike3.setMall(true);
        calendar.set(2018, 2, 1);
        bike3.setPublishTime(calendar.getTime());

        list.add(bike);
        list.add(bike2);
        list.add(bike3);

        System.out.println("我拥有 " + list.size() + " 辆自行车，他们是");
        System.out.println("品牌 | 类型 | 上市时间 | 是否商场同款");

        calendar.clear();
        calendar.set(2018, 0, 0);
        Date compareDate = calendar.getTime();

        calendar.clear();
        calendar.set(2019, 0, 0);
        Date compareDate2 = calendar.getTime();

        for (Bike bike1 : list) {
            if (bike1.getPublishTime().compareTo(compareDate) >= 0 &&
                    bike1.getPublishTime().compareTo(compareDate2) < 0) {
                System.out.println(bike1.getBrand() + "|" + bike1.getType() + "|" + bike1.getPublishTime() + "|" + bike1.isMall());
            }
        }

    }


}

