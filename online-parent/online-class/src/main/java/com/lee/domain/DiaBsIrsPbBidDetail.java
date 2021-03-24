package com.lee.domain;

import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;

/**
 * @projectName：online_edu
 * @Description:
 * @Author limingheng
 * @Date -03-08  09:40
 */
@Data
public class DiaBsIrsPbBidDetail {
  private  String bakId;
  private  String verId;
  private  String prjId;
  private  String planYear;
  private  BigDecimal releaseFund;
  private  BigDecimal sumTotalFund;
  private  BigDecimal totalFund;
  private  BigDecimal capitalFund;
  private  BigDecimal costFund;
  private  BigDecimal softFund;
  private  BigDecimal hardFund;
  private  BigDecimal devepFund;
  private  BigDecimal pefFund;
  private  String resReplyNo;
  private  String storePrjGrade;
  private  String gwScore;
  private  String sjScore;
  private  String dsScore;
  private  BigDecimal otherFund;
  private  BigDecimal jTotalFund;
  private  BigDecimal jCapitalFund;
  private  BigDecimal jCostFund;
  private  BigDecimal jSoftFund;
  private  BigDecimal jHadFund;
  private  BigDecimal jDevepFund;
  private  BigDecimal jPefFund;
  private  BigDecimal jOtherFund;
  private  String adjustReason;
  private  String adjustType;
  private  String inveExp;
  private  String prjCode;
  private  String prjName;
  private  String blgOrgNo;
  private  String blgOrgName;
  private  String dutyRoomNo;
  private  String dutyRoomName;
  private  String promoteFlag;
  private  String splitFlag;
  private  String promotePrjCode;
  private  String pefTypeCode;
  private  String prjSortCode;
  private  String refFlag;
  private  String prjScale;
  private  String prjNature;
  private  String pefScope ;
  private  String prjContent;
  private  String prjTarget ;
  private  String prjPlan ;
  private Date resReplyDate;
  private  String deptName;
  private  String contactName;
  private  String prjTypeCode;
  private  String dutyUserNo;
  private  String prjSourceCode;
  private  String appOrgNo;
  private  String appDeptNo;
  private  String appEmpNo;
  private  Date appDate;
  private  String remark ;
  private  String prjStage ;
  private  Date planStartDate;
  private  Date planEndDate;
  private  String dutyOrgNo;
  private  String dutyDeptNo;
  private  String prjSplitFlag;
  private  String splitPrjId;
  private  String connectPrj;
  private  String buidOrgNo;
  private  String dutyDeptName;
  private  String dutyOrgName;
  private  String buidOrgName;
  private  String pefModel;
  private  String dutyUserName;
  private  String buidDutyNo;
  private  String buidDutyName;
  private  String splitUprFlag;
  private  String splitUprNo;
  private  String splitUprName;
  private  BigDecimal sumCapitalFund;
  private  BigDecimal sumCostFund;
  private  BigDecimal sumHardFund;
  private  BigDecimal sumSoftFund;
  private  BigDecimal sumDevelopFund;
  private  BigDecimal sumPefFund;
  private  BigDecimal sumUtherFund;
  private  BigDecimal resTotalFund;
  private  BigDecimal resCapitalFund;
  private  BigDecimal resCostFund;
  private  BigDecimal resHardFund;
  private  BigDecimal resSoftFund;
  private  BigDecimal resDevelopFund;
  private  BigDecimal resPefFund;
  private  BigDecimal resUtherFund;
  private  String closeFlag;
  private  String closeReason;
  private  String storePlanYear;
  private  String alpPlanYear;
  private  BigDecimal prjScore;
  private  String fundType;
  private  BigDecimal includeHardFund;
  private  BigDecimal includeSoftFund;
  private  BigDecimal includeDevelopFund;
  private  BigDecimal includePefFund;
  private  BigDecimal includeUtherFund;
  private  String fundTypeSplitFlag;
  private  String isNewTech;
  private  String prjNewTech;
  private  String prjCategory;
  private  String isInternet;
  private  String isMicroservices;
}
