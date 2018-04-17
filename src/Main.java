import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello World!");


        MineralWater mineralWater=new MineralWater();
        mineralWater.setBrand("农夫山泉");
        System.out.println(mineralWater.getBrand());

        Calendar calendar = Calendar.getInstance();

        MineralWater [] mineralWaters = new MineralWater[3];

        calendar.set(2017,7,1);
        Date date=calendar.getTime();

        MineralWater mineralWater1=new MineralWater("农夫山泉","中国大陆",540,11000,"瓶装",date
        );

        mineralWaters[0]=mineralWater1;

        calendar.clear();

        calendar.set(2018,2,1);
        Date  date2=calendar.getTime();
        MineralWater mineralWater2=new MineralWater("百岁山","中国大陆",365,570,"包装",date2
        );

        mineralWaters[1]=mineralWater2;

        calendar.clear();

        calendar.set(2018,0,1);
        Date date3=calendar.getTime();
        MineralWater mineralWater3=new MineralWater("天地精华","中国大陆",720,550,"包装",date3);

        mineralWaters[2]=mineralWater3;

        System.out.println(mineralWaters[0].getBrand()+":"+mineralWaters[0].getOrigin()+":"+mineralWaters[0].getExpirationDate()+":"+mineralWaters[0].getNetContent()+":"+mineralWaters[0].getKindOfPackage()+":"+mineralWaters[0].getProductionDate());
        System.out.println(mineralWaters[1].getBrand()+":"+mineralWaters[1].getOrigin()+":"+mineralWaters[1].getExpirationDate()+":"+mineralWaters[1].getNetContent()+":"+mineralWaters[1].getKindOfPackage()+":"+mineralWaters[1].getProductionDate());
        System.out.println(mineralWaters[2].getBrand()+":"+mineralWaters[2].getOrigin()+":"+mineralWaters[2].getExpirationDate()+":"+mineralWaters[2].getNetContent()+":"+mineralWaters[2].getKindOfPackage()+":"+mineralWaters[2].getProductionDate());

        System.out.println("我拥有 "+mineralWaters.length+" 瓶矿泉水，他们是");

        for(MineralWater mineralWater4:mineralWaters){
            System.out.println(mineralWater4.getBrand()+":"+mineralWater4.getOrigin()+":"+mineralWater4.getExpirationDate()+":"+mineralWater4.getNetContent()+":"+mineralWater4.getKindOfPackage()+":"+mineralWater4.getProductionDate());

        }

        calendar.clear();

        ArrayList <Bike> list = new ArrayList();

        Bike bike = new Bike();

        Bike bike1 = new Bike();
        bike1.setBrand("捷安特");
        bike1.setType("山地车");
        bike1.setMall(true);
        calendar.set(2018,3,1);
        bike1.setPublishTime(calendar.getTime());

        Bike bike2 = new Bike();
        bike2.setBrand("捷安特");
        bike2.setType("山地车");
        bike2.setMall(false);
        calendar.set(2018,0,1);
        bike2.setPublishTime(calendar.getTime());

        Bike bike3 = new Bike();
        bike3.setBrand("永久");
        bike3.setType("山地车");
        bike3.setMall(true);
        calendar.set(2018,3,1);
        bike3.setPublishTime(calendar.getTime());

        list.add(bike1);
        list.add(bike2);
        list.add(bike3);

        System.out.println("我拥有"+ list.size()+" 辆自行车，他们是");
        for (Bike bike0:list){
            System.out.println(bike0.getBrand()+":"+bike0.getType()+":"+bike0.isMall()+":"+bike0.getPublishTime());
        }
    }


}

