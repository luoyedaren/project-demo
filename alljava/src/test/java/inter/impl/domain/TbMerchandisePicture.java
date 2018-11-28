package inter.impl.domain;

import java.io.Serializable;
import java.util.Date;

/**
 * <p>
 * 商品图片表
 * </p>
 *
 * @author wsy
 * @since 2018-11-02
 */
public class TbMerchandisePicture implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * PK
     */
    private String merchandisePictureId;
    /**
     * 商品ID
     */
    private String merchandiseId;
    /**
     * 正面图片地址
     */
    private String frontPic;
    /**
     * 背面图片地址
     */
    private String backPic;
    /**
     * 45°角图片地址
     */
    private String fortyfivePic;
    /**
     * 拆包正面图片地址
     */
    private String disfrontPic;
    /**
     * 说明书图片地址
     */
    private String specificationPic;
    /**
     * 左侧面图片地址
     */
    private String leftsidePic;
    /**
     * 右测面图片地址
     */
    private String rightsidePic;
    /**
     * 上底面图片地址
     */
    private String upbasePic;
    /**
     * 下底面图片地址
     */
    private String downbasePic;
    /**
     * 拆包背面图片地址
     */
    private String packbackPic;
    /**
     * 拆包组合图片地址
     */
    private String packgroupPic;
    /**
     * 视频地址
     */
    private String video;
    /**
     * 商品详情手机端展示(多张用逗号隔开)
     */
    private String appdetailPic;
    /**
     * 尺寸类型(0:原始上传图,1:800*800,2:400*400,3:185*185)
     */
    private String dimensionType;
    /**
     * 创建时间
     */
    private Date createAt;
    /**
     * 更新时间
     */
    private Date updateAt;
    /**
     * 创建人
     */
    private String createBy;
    /**
     * 更新人
     */
    private String updateBy;


    public String getMerchandisePictureId() {
        return merchandisePictureId;
    }

    public void setMerchandisePictureId(String merchandisePictureId) {
        this.merchandisePictureId = merchandisePictureId;
    }

    public String getMerchandiseId() {
        return merchandiseId;
    }

    public void setMerchandiseId(String merchandiseId) {
        this.merchandiseId = merchandiseId;
    }

    public String getFrontPic() {
        return frontPic;
    }

    public void setFrontPic(String frontPic) {
        this.frontPic = frontPic;
    }

    public String getBackPic() {
        return backPic;
    }

    public void setBackPic(String backPic) {
        this.backPic = backPic;
    }

    public String getFortyfivePic() {
        return fortyfivePic;
    }

    public void setFortyfivePic(String fortyfivePic) {
        this.fortyfivePic = fortyfivePic;
    }

    public String getDisfrontPic() {
        return disfrontPic;
    }

    public void setDisfrontPic(String disfrontPic) {
        this.disfrontPic = disfrontPic;
    }

    public String getSpecificationPic() {
        return specificationPic;
    }

    public void setSpecificationPic(String specificationPic) {
        this.specificationPic = specificationPic;
    }

    public String getLeftsidePic() {
        return leftsidePic;
    }

    public void setLeftsidePic(String leftsidePic) {
        this.leftsidePic = leftsidePic;
    }

    public String getRightsidePic() {
        return rightsidePic;
    }

    public void setRightsidePic(String rightsidePic) {
        this.rightsidePic = rightsidePic;
    }

    public String getUpbasePic() {
        return upbasePic;
    }

    public void setUpbasePic(String upbasePic) {
        this.upbasePic = upbasePic;
    }

    public String getDownbasePic() {
        return downbasePic;
    }

    public void setDownbasePic(String downbasePic) {
        this.downbasePic = downbasePic;
    }

    public String getPackbackPic() {
        return packbackPic;
    }

    public void setPackbackPic(String packbackPic) {
        this.packbackPic = packbackPic;
    }

    public String getPackgroupPic() {
        return packgroupPic;
    }

    public void setPackgroupPic(String packgroupPic) {
        this.packgroupPic = packgroupPic;
    }

    public String getVideo() {
        return video;
    }

    public void setVideo(String video) {
        this.video = video;
    }

    public String getAppdetailPic() {
        return appdetailPic;
    }

    public void setAppdetailPic(String appdetailPic) {
        this.appdetailPic = appdetailPic;
    }

    public String getDimensionType() {
        return dimensionType;
    }

    public void setDimensionType(String dimensionType) {
        this.dimensionType = dimensionType;
    }

    public Date getCreateAt() {
        return createAt;
    }

    public void setCreateAt(Date createAt) {
        this.createAt = createAt;
    }

    public Date getUpdateAt() {
        return updateAt;
    }

    public void setUpdateAt(Date updateAt) {
        this.updateAt = updateAt;
    }

    public String getCreateBy() {
        return createBy;
    }

    public void setCreateBy(String createBy) {
        this.createBy = createBy;
    }

    public String getUpdateBy() {
        return updateBy;
    }

    public void setUpdateBy(String updateBy) {
        this.updateBy = updateBy;
    }

}
