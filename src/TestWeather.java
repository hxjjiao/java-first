import java.util.ArrayList;

public class TestWeather {

    public static void main(String[] args) {

        ArrayList<Date>list=new ArrayList();

        Date date = new Date("今天");
        Weather weather=new Weather(30,false);
        date.setWeather(weather);

        list.add(date);

        Date date1=new Date("明天");
        Weather weather1=new Weather(20,true);
        date1.setWeather(weather1);


        list.add(date1);

        for (Date date2:list){
            if (date2.getWeather().isIsrain()){
                System.out.println(date1.getTime()+ "下大雨，"+"要打伞不说，还要穿外套");
            }
            else {
                if (date2.getWeather().getTemperature() >= 30) {
                    System.out.println("最近天气反复无常，"+date.getTime()+date.getWeather().getTemperature()+"度（"+""+"热的要穿短袖"+"）");
                }
            }
        }





    }

}
