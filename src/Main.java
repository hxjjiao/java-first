import java.util.Calendar;
import java.util.Date;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello World!");


        MineralWater mineralWater=new MineralWater();
        mineralWater.setBrand("农夫山泉");
        System.out.println(mineralWater.getBrand());

        Calendar calendar = Calendar.getInstance();
        calendar.set(2017,7,1);
        Date  date=calendar.getTime();

        MineralWater mineralWater1=new MineralWater("农夫山泉","中国大陆",540,11000,"瓶装",date
        );
        calendar.clear();

        calendar.set(2018,2,1);
        Date  date2=calendar.getTime();
        MineralWater mineralWater2=new MineralWater("百岁山","中国大陆",365,570,"包装",date2
        );
        calendar.clear();

        calendar.set(2018,0,1);
        Date date3=calendar.getTime();
        MineralWater mineralWater3=new MineralWater("天地精华","中国大陆",720,550,"包装",date3);

        System.out.println("品牌|产地|保质期|净含量|包装方式|生产日期");
        System.out.println(mineralWater1.getBrand()+"|"+mineralWater1.getOrigin()+"|"+mineralWater1.getExpirationDate()+"|"+mineralWater1.getNetContent()+"|"+mineralWater1.getKindOfPackage()+"|"+mineralWater1.getProductionDate());
        System.out.println(mineralWater2.getBrand()+"|"+mineralWater2.getOrigin()+"|"+mineralWater2.getExpirationDate()+"|"+mineralWater2.getNetContent()+"|"+mineralWater2.getKindOfPackage()+"|"+mineralWater2.getProductionDate());
        System.out.println(mineralWater3.getBrand()+"|"+mineralWater3.getOrigin()+"|"+mineralWater3.getExpirationDate()+"|"+mineralWater3.getNetContent()+"|"+mineralWater3.getKindOfPackage()+"|"+mineralWater3.getProductionDate());

    }


}

