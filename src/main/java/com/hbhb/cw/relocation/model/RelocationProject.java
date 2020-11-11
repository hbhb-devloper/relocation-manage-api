package com.hbhb.cw.relocation.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class RelocationProject {
    private Long id;

    private Integer unitId;

    private String projectName;

    private String projectNum;

    private String projectType;

    private String projectYear;

    private String projectMonth;

    private String eomsRepairNum;

    private String eomsCutNum;

    private Date planStartTime;

    private Date planEndTime;

    private Date actualEndTime;

    private String networkHierarchy;

    private BigDecimal constructionBudget;

    private BigDecimal constructionCost;

    private BigDecimal constructionAuditCost;

    private String constructionUnit;

    private BigDecimal materialBudget;

    private BigDecimal materialCost;

    private String oppositeUnit;

    private String oppositeContacts;

    private String oppositeContactsNum;

    private Boolean hasCompensation;

    private String compensationType;

    private BigDecimal compensationAmount;

    private Integer compensationSate;

    private String compensationRemake;

    private String contractNum;

    private String contractType;

    private String contractName;

    private Integer contractDuration;

    private Boolean isInitiative;

    private BigDecimal anticipatePayable;

    private BigDecimal anticipatePayment;

    private BigDecimal finalPayment;

    private String cause;

  }