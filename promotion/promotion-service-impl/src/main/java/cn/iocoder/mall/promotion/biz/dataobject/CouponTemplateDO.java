package cn.iocoder.mall.promotion.biz.dataobject;

import cn.iocoder.common.framework.dataobject.BaseDO;

import java.util.Date;

/**
 * 优惠劵（码）模板 DO
 *
 * 当用户领取时，会生成 {@link CouponCardDO} 优惠劵（码）。
 */
public class CouponTemplateDO extends BaseDO {

    // ========== 基本信息 BEGIN ==========
    /**
     * 模板编号，自增唯一。
     */
    private Integer id;
    /**
     * 标题
     */
    private String title;
    /**
     * 使用说明
     */
    private String description;
    /**
     * 类型
     *
     * 1-优惠劵
     * 2-优惠码
     */
    private Integer type;
    /**
     * 码类型
     *
     * 1-一卡一码（UNIQUE）
     * 2-通用码（GENERAL）
     *
     * 【优惠码独有】 @see CouponCodeDO
     */
    private Integer codeType;
    /**
     * 优惠码状态
     *
     * 1-开启中
     * 2-禁用中
     * 3-已过期
     *
     * 当优惠劵（码）开启中，可以手动操作，设置禁用中。
     */
    private Integer status;
//    /**
//     * 是否可分享领取链接
//     */
//    private Boolean isShare;
//    /**
//     * 设置为失效时间
//     */
//    private Date invalidTime;
//    /**
//     * 删除时间
//     */
//    private Date deleteTime;

    // ========== 基本信息 END ==========

    // ========== 领取规则 BEGIN ==========
//    /**
//     * 是否限制领用者的等级
//     *
//     * 0-不限制
//     * 大于0-领用者必须是这个等级编号
//     *
//     * 【优惠劵独有】
//     */
//    private Integer needUserLevel;
    /**
     * 每人限领个数
     *
     * null - 则表示不限制
     */
    private Integer quota;
    /**
     * 发行总量
     */
    private Integer total;
    // ========== 领取规则 END ==========

    // ========== 使用规则 BEGIN ==========
//    /**
//     * 是否仅原价购买商品时可用
//     *
//     * true-是
//     * false-否
//     */
//    private Boolean isForbidPreference;
    /**
     * 是否设置满多少金额可用，单位：分
     *
     * 0-不限制
     * 大于0-多少金额可用
     */
    private Integer priceAvailable;
    /**
     * 可用范围的类型
     *
     * 10-全部（ALL）：所有可用
     * 20-部分（PART）：部分商品可用，或指定商品可用
     * 21-部分（PART）：部分商品不可用，或指定商品可用
     * 30-部分（PART）：部分分类可用，或指定商品可用
     * 31-部分（PART）：部分分类不可用，或指定商品可用
     */
    private Integer rangeType;
    /**
     * 指定商品 / 分类列表，使用逗号分隔商品编号
     */
    private String rangeValues;
    /**
     * 生效日期类型
     *
     * 1-固定日期
     * 2-领取日期：领到券 {@link #fixedStartTerm} 日开始 N 天内有效
     */
    private Integer dateType;
    /**
     * 固定日期-生效开始时间
     */
    private Date validStartTime;
    /**
     * 固定日期-生效结束时间
     */
    private Date validEndTime;
    /**
     * 领取日期-开始天数
     *
     * 例如，0-当天；1-次天
     */
    private Integer fixedStartTerm;
    /**
     * 领取日期-结束天数
     */
    private Integer fixedEndTerm;
//    /**
//     * 是否到期前4天发送提醒
//     *
//     * true-发送
//     * false-不发送
//     */
//    private Boolean expireNotice;
    // ========== 使用规则 END ==========

    // ========== 使用效果 BEGIN ==========
    /**
     * 优惠类型
     *
     * 1-代金卷
     * 2-折扣卷
     */
    private Integer preferentialType;
    /**
     * 折扣百分比。
     *
     * 例如，80% 为 80。
     * 当 100% 为 100 ，则代表免费。
     */
    private Integer percentOff;
//    /**
//     * 是否是随机优惠券
//     *
//     * true-随机
//     * false-不随机
//     *
//     * 【优惠劵独有】
//     */
//    private Boolean isRandom;
    /**
     * 优惠金额，单位：分
     */
//  * 当 {@link #isRandom} 为 true 时，代表随机优惠金额的下限
    private Integer priceOff;
//    /**
//     * 优惠金额上限
//     *
//     * 【优惠劵独有】
//     */
//    private Integer valueRandomTo;
    /**
     * 折扣上限，仅在 {@link #preferentialType} 等于 2 时生效。
     *
     * 例如，折扣上限为 20 元，当使用 8 折优惠券，订单金额为 1000 元时，最高只可折扣 20 元，而非 80  元。
     */
    private Integer discountPriceLimit;
    // ========== 使用效果 END ==========

    // ========== 统计信息 BEGIN ==========
//    /**
//     * 领取优惠券的人数
//     */
//    private Integer statFetchUserNum;
    /**
     * 领取优惠券的次数
     */
    private Integer statFetchNum;
//    /**
//     * 使用优惠券的次数
//     */
//    private Integer statUseNum;
    // ========== 统计信息 END ==========


    public Integer getId() {
        return id;
    }

    public CouponTemplateDO setId(Integer id) {
        this.id = id;
        return this;
    }

    public String getTitle() {
        return title;
    }

    public CouponTemplateDO setTitle(String title) {
        this.title = title;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public CouponTemplateDO setDescription(String description) {
        this.description = description;
        return this;
    }

    public Integer getType() {
        return type;
    }

    public CouponTemplateDO setType(Integer type) {
        this.type = type;
        return this;
    }

    public Integer getCodeType() {
        return codeType;
    }

    public CouponTemplateDO setCodeType(Integer codeType) {
        this.codeType = codeType;
        return this;
    }

    public Integer getStatus() {
        return status;
    }

    public CouponTemplateDO setStatus(Integer status) {
        this.status = status;
        return this;
    }

    public Integer getQuota() {
        return quota;
    }

    public CouponTemplateDO setQuota(Integer quota) {
        this.quota = quota;
        return this;
    }

    public Integer getTotal() {
        return total;
    }

    public CouponTemplateDO setTotal(Integer total) {
        this.total = total;
        return this;
    }

    public Integer getPriceAvailable() {
        return priceAvailable;
    }

    public CouponTemplateDO setPriceAvailable(Integer priceAvailable) {
        this.priceAvailable = priceAvailable;
        return this;
    }

    public Integer getRangeType() {
        return rangeType;
    }

    public CouponTemplateDO setRangeType(Integer rangeType) {
        this.rangeType = rangeType;
        return this;
    }

    public String getRangeValues() {
        return rangeValues;
    }

    public CouponTemplateDO setRangeValues(String rangeValues) {
        this.rangeValues = rangeValues;
        return this;
    }

    public Integer getDateType() {
        return dateType;
    }

    public CouponTemplateDO setDateType(Integer dateType) {
        this.dateType = dateType;
        return this;
    }

    public Date getValidStartTime() {
        return validStartTime;
    }

    public CouponTemplateDO setValidStartTime(Date validStartTime) {
        this.validStartTime = validStartTime;
        return this;
    }

    public Date getValidEndTime() {
        return validEndTime;
    }

    public CouponTemplateDO setValidEndTime(Date validEndTime) {
        this.validEndTime = validEndTime;
        return this;
    }

    public Integer getFixedStartTerm() {
        return fixedStartTerm;
    }

    public CouponTemplateDO setFixedStartTerm(Integer fixedStartTerm) {
        this.fixedStartTerm = fixedStartTerm;
        return this;
    }

    public Integer getFixedEndTerm() {
        return fixedEndTerm;
    }

    public CouponTemplateDO setFixedEndTerm(Integer fixedEndTerm) {
        this.fixedEndTerm = fixedEndTerm;
        return this;
    }

    public Integer getPreferentialType() {
        return preferentialType;
    }

    public CouponTemplateDO setPreferentialType(Integer preferentialType) {
        this.preferentialType = preferentialType;
        return this;
    }

    public Integer getPercentOff() {
        return percentOff;
    }

    public CouponTemplateDO setPercentOff(Integer percentOff) {
        this.percentOff = percentOff;
        return this;
    }

    public Integer getPriceOff() {
        return priceOff;
    }

    public CouponTemplateDO setPriceOff(Integer priceOff) {
        this.priceOff = priceOff;
        return this;
    }

    public Integer getDiscountPriceLimit() {
        return discountPriceLimit;
    }

    public CouponTemplateDO setDiscountPriceLimit(Integer discountPriceLimit) {
        this.discountPriceLimit = discountPriceLimit;
        return this;
    }

    public Integer getStatFetchNum() {
        return statFetchNum;
    }

    public CouponTemplateDO setStatFetchNum(Integer statFetchNum) {
        this.statFetchNum = statFetchNum;
        return this;
    }
}
