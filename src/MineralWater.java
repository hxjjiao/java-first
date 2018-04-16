import java.util.Date;

/**
 * 矿泉水
 */
public class MineralWater {
    //品牌
    private String brand;
    //产地
    private String origin;
    //保质期
    private Date expirationDate;
    //净含量
    private int netContent;
    //包装方式
    private String kindOfPackage;

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
    public void setExpirationDate(Date expirationDate) {
        this.expirationDate = expirationDate;
    }

    //保质期读取
    public Date getExpirationDate(){
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
}
