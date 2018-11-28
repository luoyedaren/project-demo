package inter.impl.domain;


import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * <p>
 * 订单主表
 * </p>
 *
 * @author wsy
 * @since 2018-11-02
 */
public class TbOrderMain  {


    /**
     * 订单id
     */
    private Long orderId;
    /**
     * user_agent_id
     */
    private Long userAgentId;
    /**
     * 站点ID
     */
    private Long siteId;
    /**
     * 店铺ID
     */
    private Long storeId;
    /**
     * 客户id
     */
    private Long custId;
    /**
     * 订单编号
     */
    private String orderCode;
    /**
     * 备注
     */
    private String notes;
    /**
     * 订单总金额
     */
    private BigDecimal totalPrice;
    /**
     * 联系人
     */
    private String linkMan;
    /**
     * 联系人电话
     */
    private String linkTel;
    /**
     * 实际收货地址
     */
    private String linkAddress;
    /**
     * 是否在线支付:1-在线支付,0-线下结算
     */
    private Integer isOnlinePay;
    /**
     * 支付状态:0-待支付,1-已支付,2-已取消,3-退款中,4-已退款
     */
    private Integer payStatus;
    /**
     * 客户一次提交关联的订单编号，取第一个订单
     */
    private String mainLinkOrder;
    /**
     * 订单状态0-待提交,待补充
     */
    private Integer orderStatus;
    /**
     * 订单来源,401-pc,403-wap,406-iso,407-android
     */
    private String orderSource;
    /**
     * 是否开发票(1-是,0否)
     */
    private String isInvoice;
    /**
     * 发票类型(1-普通发票,2-专用发票)
     */
    private String invoiceType;
    /**
     * 发票-公司名称
     */
    private String invoiceCompany;
    /**
     * 发票-纳税人识别号
     */
    private String invoiceNo;
    /**
     * 发票-开户银行
     */
    private String invoiceBank;
    /**
     * 发票-开户银行号
     */
    private String invoiceBankno;
    /**
     * 发票-注册地址
     */
    private String invoiceAddress;
    /**
     * 发票-注册电话
     */
    private String invoiceTel;
    /**
     * 支付方式(0-在线支付，1-余额支付+在线支付，2-余额支付), 3-线下结算
     */
    private String payType;
    /**
     * 直接在线支付金额
     */
    private BigDecimal directPayPrice;
    /**
     * 余额支付金额
     */
    private BigDecimal balancePayPrice;
    /**
     * 余额抵扣率
     */
    private BigDecimal yedkl;
    private Date createAt;
    private Date updateAt;


    public Long getOrderId() {
        return orderId;
    }

    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }

    public Long getUserAgentId() {
        return userAgentId;
    }

    public void setUserAgentId(Long userAgentId) {
        this.userAgentId = userAgentId;
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

    public Long getCustId() {
        return custId;
    }

    public void setCustId(Long custId) {
        this.custId = custId;
    }

    public String getOrderCode() {
        return orderCode;
    }

    public void setOrderCode(String orderCode) {
        this.orderCode = orderCode;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public BigDecimal getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(BigDecimal totalPrice) {
        this.totalPrice = totalPrice;
    }

    public String getLinkMan() {
        return linkMan;
    }

    public void setLinkMan(String linkMan) {
        this.linkMan = linkMan;
    }

    public String getLinkTel() {
        return linkTel;
    }

    public void setLinkTel(String linkTel) {
        this.linkTel = linkTel;
    }

    public String getLinkAddress() {
        return linkAddress;
    }

    public void setLinkAddress(String linkAddress) {
        this.linkAddress = linkAddress;
    }

    public Integer getIsOnlinePay() {
        return isOnlinePay;
    }

    public void setIsOnlinePay(Integer isOnlinePay) {
        this.isOnlinePay = isOnlinePay;
    }

    public Integer getPayStatus() {
        return payStatus;
    }

    public void setPayStatus(Integer payStatus) {
        this.payStatus = payStatus;
    }

    public String getMainLinkOrder() {
        return mainLinkOrder;
    }

    public void setMainLinkOrder(String mainLinkOrder) {
        this.mainLinkOrder = mainLinkOrder;
    }

    public Integer getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(Integer orderStatus) {
        this.orderStatus = orderStatus;
    }

    public String getOrderSource() {
        return orderSource;
    }

    public void setOrderSource(String orderSource) {
        this.orderSource = orderSource;
    }

    public String getIsInvoice() {
        return isInvoice;
    }

    public void setIsInvoice(String isInvoice) {
        this.isInvoice = isInvoice;
    }

    public String getInvoiceType() {
        return invoiceType;
    }

    public void setInvoiceType(String invoiceType) {
        this.invoiceType = invoiceType;
    }

    public String getInvoiceCompany() {
        return invoiceCompany;
    }

    public void setInvoiceCompany(String invoiceCompany) {
        this.invoiceCompany = invoiceCompany;
    }

    public String getInvoiceNo() {
        return invoiceNo;
    }

    public void setInvoiceNo(String invoiceNo) {
        this.invoiceNo = invoiceNo;
    }

    public String getInvoiceBank() {
        return invoiceBank;
    }

    public void setInvoiceBank(String invoiceBank) {
        this.invoiceBank = invoiceBank;
    }

    public String getInvoiceBankno() {
        return invoiceBankno;
    }

    public void setInvoiceBankno(String invoiceBankno) {
        this.invoiceBankno = invoiceBankno;
    }

    public String getInvoiceAddress() {
        return invoiceAddress;
    }

    public void setInvoiceAddress(String invoiceAddress) {
        this.invoiceAddress = invoiceAddress;
    }

    public String getInvoiceTel() {
        return invoiceTel;
    }

    public void setInvoiceTel(String invoiceTel) {
        this.invoiceTel = invoiceTel;
    }

    public String getPayType() {
        return payType;
    }

    public void setPayType(String payType) {
        this.payType = payType;
    }

    public BigDecimal getDirectPayPrice() {
        return directPayPrice;
    }

    public void setDirectPayPrice(BigDecimal directPayPrice) {
        this.directPayPrice = directPayPrice;
    }

    public BigDecimal getBalancePayPrice() {
        return balancePayPrice;
    }

    public void setBalancePayPrice(BigDecimal balancePayPrice) {
        this.balancePayPrice = balancePayPrice;
    }

    public BigDecimal getYedkl() {
        return yedkl;
    }

    public void setYedkl(BigDecimal yedkl) {
        this.yedkl = yedkl;
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


}
