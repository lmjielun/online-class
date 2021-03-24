package com.lee.domain;

import lombok.Data;

/**
 * @projectName：online_edu
 * @Description:
 * @Author limingheng
 * @Date -03-22  10:36
 */
@Data

public class WFWorkItemExt {
    private static final long serialVersionUID = -4353273972551619758L;
    private String appNo;//申请编号
    private String mainAppNo;//主申请编号
    private String busiNo;//业务编号
    private String busiName;//业务名称
    private String remark;//备注
    private String procOrgan;//创建单位
    private String execOrgan;//执行单位
    private String backReason;//退单原因
    private String extend1;
    private String extend2;
    private String extend3;
    private String extend4;
    private String processDefName;
    private String processChName;
    private String activityInstName;
    private String isTimeOut;
    private String participant;
    private Integer currentState;
}
