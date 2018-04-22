import java.util.Date;

/**
 * 自行车对象
 */
public class Bike {
    //品牌
    private String brand;
    //自行车类型
    private String type;
    //上市时间
    private Date publishTime;
    //是否商店同款
    private boolean isMall;
    //车架材质
    private String frameMaterial;
    //轮径尺寸
    private int diameterSize;
    //颜色
    private String color;
    //速别
    private int speed;
    //货号
    private int productCode;
    //制动系统
    private String brakingSystem;
    //车架类型
    private String frameType;
    //前叉类型
    private String frontForkType;

    public Bike(String brand){
        this.brand=brand;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Date getPublishTime() {
        return publishTime;
    }

    public void setPublishTime(Date publishTime) {
        this.publishTime = publishTime;
    }

    public boolean isMall() {
        return isMall;
    }

    public void setMall(boolean mall) {
        isMall = mall;
    }

    public String getFrameMaterial() {
        return frameMaterial;
    }

    public void setFrameMaterial(String frameMaterial) {
        this.frameMaterial = frameMaterial;
    }

    public int getDiameterSize() {
        return diameterSize;
    }

    public void setDiameterSize(int diameterSize) {
        this.diameterSize = diameterSize;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getProductCode() {
        return productCode;
    }

    public void setProductCode(int productCode) {
        this.productCode = productCode;
    }

    public String getBrakingSystem() {
        return brakingSystem;
    }

    public void setBrakingSystem(String brakingSystem) {
        this.brakingSystem = brakingSystem;
    }

    public String getFrameType() {
        return frameType;
    }

    public void setFrameType(String frameType) {
        this.frameType = frameType;
    }

    public String getFrontForkType() {
        return frontForkType;
    }

    public void setFrontForkType(String frontForkType) {
        this.frontForkType = frontForkType;
    }
}
