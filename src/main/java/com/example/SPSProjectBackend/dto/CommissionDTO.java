package com.example.SPSProjectBackend.dto;

public class CommissionDTO {
    private String projectNo;
    private String estimateNo;
    private Long totalCost;
    private String deptId;
    private String description;
    private String orderCardNo;
    private Short status;

    public CommissionDTO() {
    }

    public CommissionDTO(
            String projectNo,
            String estimateNo,
            Number totalCost,
            String deptId,
            String description,
            String orderCardNo,
            Number status) {
        this.projectNo = projectNo;
        this.estimateNo = estimateNo;
        this.totalCost = (totalCost == null) ? null : totalCost.longValue();
        this.deptId = deptId;
        this.description = description;
        this.orderCardNo = orderCardNo;
        this.status = (status == null) ? null : status.shortValue();
    }

    public CommissionDTO(
            String projectNo,
            String estimateNo,
            Number totalCost,
            String deptId,
            String description,
            Number status) {
        this(projectNo, estimateNo, totalCost, deptId, description, null, status);
    }

    // Getters and Setters
    public String getEstimateNo() {
        return estimateNo;
    }

    public void setEstimateNo(String estimateNo) {
        this.estimateNo = estimateNo;
    }

    public Long getTotalCost() {
        return totalCost;
    }

    public void setTotalCost(Long totalCost) {
        this.totalCost = totalCost;
    }

    public String getDeptId() {
        return deptId;
    }

    public void setDeptId(String deptId) {
        this.deptId = deptId;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getOrderCardNo() {
        return orderCardNo;
    }

    public void setOrderCardNo(String orderCardNo) {
        this.orderCardNo = orderCardNo;
    }

    public Short getStatus() {
        return status;
    }

    public void setStatus(Short status) {
        this.status = status;
    }

    public String getProjectNo() {
        return projectNo;
    }
}