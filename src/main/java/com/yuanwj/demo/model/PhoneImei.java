package com.yuanwj.demo.model;

import java.util.Date;

public class PhoneImei {
    private Long imeiId;

    private Long tenantId;

    private String imeiNum;

    private Long recordUserId;

    private Date recordDate;

    public Long getImeiId() {
        return imeiId;
    }

    public void setImeiId(Long imeiId) {
        this.imeiId = imeiId;
    }

    public Long getTenantId() {
        return tenantId;
    }

    public void setTenantId(Long tenantId) {
        this.tenantId = tenantId;
    }

    public String getImeiNum() {
        return imeiNum;
    }

    public void setImeiNum(String imeiNum) {
        this.imeiNum = imeiNum == null ? null : imeiNum.trim();
    }

    public Long getRecordUserId() {
        return recordUserId;
    }

    public void setRecordUserId(Long recordUserId) {
        this.recordUserId = recordUserId;
    }

    public Date getRecordDate() {
        return recordDate;
    }

    public void setRecordDate(Date recordDate) {
        this.recordDate = recordDate;
    }
}