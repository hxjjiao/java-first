import java.util.Date;
import java.util.Calendar;
/**
 * 矿泉水
 */
public class MineralWater {
    //品牌
    private String brand;
    //产地
    private String origin;
    //保质期
    private int expirationDate;
    //净含量
    private int netContent;
    //包装方式
    private String kindOfPackage;
    //生产日期
    private Date productionDate;

    public MineralWater(){

    }

    public MineralWater(String brand,String origin,int expirationDate,int netContent,String kindOfPackage,Date productionDate){
        this.brand=brand;
        this.origin=origin;
        this.expirationDate=expirationDate;
        this.netContent=netContent;
        this.kindOfPackage=kindOfPackage;
        this.productionDate=productionDate;
    }
    //品牌写入
    public void setBrand(String brand){
        this.brand=brand;
    }

    //品牌读取
    public String getBrand(){
        return this.brand;
    }

    //产地写入
    public void setOrigin(String origin){
        this.origin=origin;
    }

    //产地读取
    public String getOrigin(){
        return this.origin;
    }

    //保质期写入
    public void setExpirationDate(int expirationDate) {
        this.expirationDate = expirationDate;
    }

    //保质期读取
    public int getExpirationDate(){
        return this.expirationDate;
    }

    //净含量写入
    public void setNetContent(int netContent) {
        this.netContent = netContent;
    }

    //净含量读取
    public int getNetContent() {
        return netContent;
    }

    //包装方式写入

    public void setKindOfPackage(String kindOfPackage) {
        this.kindOfPackage = kindOfPackage;
    }

    //包装方式读取

    public String getKindOfPackage() {
        return kindOfPackage;
    }

    //生产日期写入

    public Date getProductionDate() {
        return productionDate;
    }

    //生产日期读取
    public void setProductionDate(Date productionDate) {
        this.productionDate = productionDate;
    }
}
