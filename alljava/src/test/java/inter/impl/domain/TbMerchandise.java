package inter.impl.domain;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * <p>
 * 商品表
 * </p>
 *
 * @author wsy
 * @since 2018-11-02
 */
public class TbMerchandise implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 商品ID
     */
    private Long merchandiseId;
    /**
     * 站点ID
     */
    private Long siteId;
    /**
     * 店铺ID
     */
    private Long storeId;
    /**
     * 店铺商品编码
     */
    private String storeProdNo;
    /**
     * 平台商品编码
     */
    private String siteProdNo;
    /**
     * erp编码
     */
    private String erpNo;
    /**
     * 产品名称
     */
    private String prodName;
    /**
     * 通用名
     */
    private String prodLocalName;
    /**
     * 生产厂家
     */
    private String manufacture;
    /**
     * 厂家简称
     */
    private String manufactureShort;
    /**
     * 所属类目
     */
    private String category;
    /**
     * 批准文号
     */
    private String approvalNumber;
    /**
     * 批准文号效期
     */
    private Date approvalNumberValidity;
    /**
     * 处方分类
     */
    private Long prescriptionClassification;
    /**
     * 商品分类
     */
    private Long goodsCategory;
    /**
     * 剂型
     */
    private String dosageForm;
    /**
     * 英文名
     */
    private String dosageFormEn;
    /**
     * 有效期
     */
    private String validity;
    /**
     * 税务编码
     */
    private Long taxId;
    /**
     * 税务名称
     */
    private String taxName;
    /**
     * 品牌
     */
    private String brand;
    /**
     * 性状
     */
    private String character;
    /**
     * 成分
     */
    private String composition;
    /**
     * 适应症
     */
    private String indications;
    /**
     * 不良反应
     */
    private String adverseReactions;
    /**
     * 禁忌
     */
    private String taboo;
    /**
     * 贮藏
     */
    private String storage;
    /**
     * 注意事项
     */
    private String mattersNeedingAttention;
    /**
     * 药物相互作用
     */
    private String drugInteraction;
    /**
     * 包装单位
     */
    private String packageUnit;
    /**
     * 中包装数量
     */
    private BigDecimal midpackageQuantity;
    /**
     * 大包装数量
     */
    private BigDecimal bigpackageQuantity;
    /**
     * 库存数量
     */
    private BigDecimal storageNumber;
    /**
     * 占存数量
     */
    private BigDecimal depositStorageNumber;
    /**
     * 销售价格
     */
    private BigDecimal salePrice;
    /**
     * 成本价
     */
    private BigDecimal costPrice;
    /**
     * 零售价
     */
    private BigDecimal retailPrice;
    /**
     * 用法,用量
     */
    private String usageDosage;
    /**
     * 小包装条码
     */
    private String smlpackageBarcode;
    /**
     * 中包装条码
     */
    private String midpackageBarcode;
    /**
     * 大包装条码
     */
    private String bigpackageBarcode;
    /**
     * 经营简码
     */
    private String prodscopenoId;
    /**
     * 商品规格
     */
    private String prodSpecification;
    /**
     * 有效期
     */
    private String prodValidtime;
    /**
     * 是否拆零
     */
    private String isUnpick;
    /**
     * 是否上架(0-待上架,1-已上架,2-已下架)
     */
    private String isSell;
    /**
     * 上下架时间
     */
    private Date sellDate;
    /**
     * 下架原因
     */
    private String unsellReason;
    /**
     * 是否需要认证
     */
    private String platformAuthFlag;
    /**
     * 删除标识(0:正常,1:已删除)
     */
    private String deleteFlag;
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
    /**
     * 外部创建人
     */
    private String appId;
    /**
     * 1-平台商品，2-店铺商品
     */
    private String merchandiseBizType;


    public Long getMerchandiseId() {
        return merchandiseId;
    }

    public void setMerchandiseId(Long merchandiseId) {
        this.merchandiseId = merchandiseId;
    }

    public Long getSiteId() {
        return siteId;
    }

    public void setSiteId(Long siteId) {
        this.siteId = siteId;
    }

    public Long getStoreId() {
        return storeId;
    }

    public void setStoreId(Long storeId) {
        this.storeId = storeId;
    }

    public String getStoreProdNo() {
        return storeProdNo;
    }

    public void setStoreProdNo(String storeProdNo) {
        this.storeProdNo = storeProdNo;
    }

    public String getSiteProdNo() {
        return siteProdNo;
    }

    public void setSiteProdNo(String siteProdNo) {
        this.siteProdNo = siteProdNo;
    }

    public String getErpNo() {
        return erpNo;
    }

    public void setErpNo(String erpNo) {
        this.erpNo = erpNo;
    }

    public String getProdName() {
        return prodName;
    }

    public void setProdName(String prodName) {
        this.prodName = prodName;
    }

    public String getProdLocalName() {
        return prodLocalName;
    }

    public void setProdLocalName(String prodLocalName) {
        this.prodLocalName = prodLocalName;
    }

    public String getManufacture() {
        return manufacture;
    }

    public void setManufacture(String manufacture) {
        this.manufacture = manufacture;
    }

    public String getManufactureShort() {
        return manufactureShort;
    }

    public void setManufactureShort(String manufactureShort) {
        this.manufactureShort = manufactureShort;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getApprovalNumber() {
        return approvalNumber;
    }

    public void setApprovalNumber(String approvalNumber) {
        this.approvalNumber = approvalNumber;
    }

    public Date getApprovalNumberValidity() {
        return approvalNumberValidity;
    }

    public void setApprovalNumberValidity(Date approvalNumberValidity) {
        this.approvalNumberValidity = approvalNumberValidity;
    }

    public Long getPrescriptionClassification() {
        return prescriptionClassification;
    }

    public void setPrescriptionClassification(Long prescriptionClassification) {
        this.prescriptionClassification = prescriptionClassification;
    }

    public Long getGoodsCategory() {
        return goodsCategory;
    }

    public void setGoodsCategory(Long goodsCategory) {
        this.goodsCategory = goodsCategory;
    }

    public String getDosageForm() {
        return dosageForm;
    }

    public void setDosageForm(String dosageForm) {
        this.dosageForm = dosageForm;
    }

    public String getDosageFormEn() {
        return dosageFormEn;
    }

    public void setDosageFormEn(String dosageFormEn) {
        this.dosageFormEn = dosageFormEn;
    }

    public String getValidity() {
        return validity;
    }

    public void setValidity(String validity) {
        this.validity = validity;
    }

    public Long getTaxId() {
        return taxId;
    }

    public void setTaxId(Long taxId) {
        this.taxId = taxId;
    }

    public String getTaxName() {
        return taxName;
    }

    public void setTaxName(String taxName) {
        this.taxName = taxName;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getCharacter() {
        return character;
    }

    public void setCharacter(String character) {
        this.character = character;
    }

    public String getComposition() {
        return composition;
    }

    public void setComposition(String composition) {
        this.composition = composition;
    }

    public String getIndications() {
        return indications;
    }

    public void setIndications(String indications) {
        this.indications = indications;
    }

    public String getAdverseReactions() {
        return adverseReactions;
    }

    public void setAdverseReactions(String adverseReactions) {
        this.adverseReactions = adverseReactions;
    }

    public String getTaboo() {
        return taboo;
    }

    public void setTaboo(String taboo) {
        this.taboo = taboo;
    }

    public String getStorage() {
        return storage;
    }

    public void setStorage(String storage) {
        this.storage = storage;
    }

    public String getMattersNeedingAttention() {
        return mattersNeedingAttention;
    }

    public void setMattersNeedingAttention(String mattersNeedingAttention) {
        this.mattersNeedingAttention = mattersNeedingAttention;
    }

    public String getDrugInteraction() {
        return drugInteraction;
    }

    public void setDrugInteraction(String drugInteraction) {
        this.drugInteraction = drugInteraction;
    }

    public String getPackageUnit() {
        return packageUnit;
    }

    public void setPackageUnit(String packageUnit) {
        this.packageUnit = packageUnit;
    }

    public BigDecimal getMidpackageQuantity() {
        return midpackageQuantity;
    }

    public void setMidpackageQuantity(BigDecimal midpackageQuantity) {
        this.midpackageQuantity = midpackageQuantity;
    }

    public BigDecimal getBigpackageQuantity() {
        return bigpackageQuantity;
    }

    public void setBigpackageQuantity(BigDecimal bigpackageQuantity) {
        this.bigpackageQuantity = bigpackageQuantity;
    }

    public BigDecimal getStorageNumber() {
        return storageNumber;
    }

    public void setStorageNumber(BigDecimal storageNumber) {
        this.storageNumber = storageNumber;
    }

    public BigDecimal getDepositStorageNumber() {
        return depositStorageNumber;
    }

    public void setDepositStorageNumber(BigDecimal depositStorageNumber) {
        this.depositStorageNumber = depositStorageNumber;
    }

    public BigDecimal getSalePrice() {
        return salePrice;
    }

    public void setSalePrice(BigDecimal salePrice) {
        this.salePrice = salePrice;
    }

    public BigDecimal getCostPrice() {
        return costPrice;
    }

    public void setCostPrice(BigDecimal costPrice) {
        this.costPrice = costPrice;
    }

    public BigDecimal getRetailPrice() {
        return retailPrice;
    }

    public void setRetailPrice(BigDecimal retailPrice) {
        this.retailPrice = retailPrice;
    }

    public String getUsageDosage() {
        return usageDosage;
    }

    public void setUsageDosage(String usageDosage) {
        this.usageDosage = usageDosage;
    }

    public String getSmlpackageBarcode() {
        return smlpackageBarcode;
    }

    public void setSmlpackageBarcode(String smlpackageBarcode) {
        this.smlpackageBarcode = smlpackageBarcode;
    }

    public String getMidpackageBarcode() {
        return midpackageBarcode;
    }

    public void setMidpackageBarcode(String midpackageBarcode) {
        this.midpackageBarcode = midpackageBarcode;
    }

    public String getBigpackageBarcode() {
        return bigpackageBarcode;
    }

    public void setBigpackageBarcode(String bigpackageBarcode) {
        this.bigpackageBarcode = bigpackageBarcode;
    }

    public String getProdscopenoId() {
        return prodscopenoId;
    }

    public void setProdscopenoId(String prodscopenoId) {
        this.prodscopenoId = prodscopenoId;
    }

    public String getProdSpecification() {
        return prodSpecification;
    }

    public void setProdSpecification(String prodSpecification) {
        this.prodSpecification = prodSpecification;
    }

    public String getProdValidtime() {
        return prodValidtime;
    }

    public void setProdValidtime(String prodValidtime) {
        this.prodValidtime = prodValidtime;
    }

    public String getIsUnpick() {
        return isUnpick;
    }

    public void setIsUnpick(String isUnpick) {
        this.isUnpick = isUnpick;
    }

    public String getIsSell() {
        return isSell;
    }

    public void setIsSell(String isSell) {
        this.isSell = isSell;
    }

    public Date getSellDate() {
        return sellDate;
    }

    public void setSellDate(Date sellDate) {
        this.sellDate = sellDate;
    }

    public String getUnsellReason() {
        return unsellReason;
    }

    public void setUnsellReason(String unsellReason) {
        this.unsellReason = unsellReason;
    }

    public String getPlatformAuthFlag() {
        return platformAuthFlag;
    }

    public void setPlatformAuthFlag(String platformAuthFlag) {
        this.platformAuthFlag = platformAuthFlag;
    }

    public String getDeleteFlag() {
        return deleteFlag;
    }

    public void setDeleteFlag(String deleteFlag) {
        this.deleteFlag = deleteFlag;
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

    public String getAppId() {
        return appId;
    }

    public void setAppId(String appId) {
        this.appId = appId;
    }

    public String getMerchandiseBizType() {
        return merchandiseBizType;
    }

    public void setMerchandiseBizType(String merchandiseBizType) {
        this.merchandiseBizType = merchandiseBizType;
    }


}
