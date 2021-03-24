package com.lee.domain;

/**
 * @projectName：online_edu
 * @Description:
 * @Author limingheng
 * @Date -03-22  11:11
 */
public class WFConstant {
    public static final String TASK_STATE = "closed";
    public static final String READ_MARK = "readMark";
    public static final String BUSI_TYPE = "busiType"; //业务类型
    public static final String ACTIVITY_NAME= "activityName";//环节名称

    public static final String P_SORT_TYPE = "pSortType"; 	// 请求资源类型（类型:资源编号），多个类型间以逗号隔开
    public static final String DOT_SO = "dotSo"; 			// 审批/审核环节展示页面的.so资源字符串
    public static final String DOT_SO_NAME= "dotSoName"; 		// 资源对应的业务名称
    public static final String DOT_SO_LIST = "dotSoList"; 	// 请求资源list
    public static final String APPR_SORT_CODE = "01"; 		// 审批/审核
    public static final String APPR_APPR = "01";			// 审批标志
    public static final String APPR_AUDI = "02";			// 审核标志
    public static final String APPR_NAME= "apprName";
    public static final String APPR_NAME_VALUE= "审批";

    public static final String IS_HAVE_DOC_YES = "1";  //审批审核信息加载时有文档tab页
    public static final String IS_HAVE_DOC_NO = "0";  //审批审核信息加载时没有文档tab页
    public static final String DOC_FLAG_02 = "02";  //标识加载的页面是文档信息页

    public static final String INSTANCE_ID = "instanceId";
    public static final String APP_NO = "appNo";

    /**
     * 工作流
     */
    public static final String BUSINESSID = "businessID"; // 存放流程编号的字段 王鹏 2011-03-07
    public static final String REQ_ACT_DEF_ID = "reqActDefId"; // 存放流程编号的字段 王鹏 2011-03-07
    public static final String PRIMARY_KEY = "primaryKey";
    public static final String ACTIVITY_ID= "activityId";
    public static final String ACTIVITY_DEF_ID= "activityDefID"; // 活动环节定义ID 王鹏 2011-03-07
    public static final String PROC_DEF_ID= "procDefId";
    public static final String CUR_ACT_DEF_ID= "curActDefId";
    public static final String USER_ID= "userId";
    public static final String RESOURCE_TYPE= "resourceType";
    public static final String PROCESS_NAME= "processName";
    public static final String FORM_ID= "formId";
    public static final String ACTIVITY_USER_ID= "activityUserId";
    public static final String ACTIVITY_USER_TYPE= "activityUserType";
    public static final String PROCESS_INST_ID= "processInstID"; // 流程实例ID   王鹏 2011-03-07
    public static final String PROCESS_TYPE_ID= "processTypeId";
    public static final String PROCESS_DEF_NAME = "processDefName"; // 流程定义名称   王鹏 2011-03-07
    public static final String WF_APP_NO = "APP_NO";
    public static final String WF_MAIN_APP_NO = "MAIN_APP_NO";
    public static final String WF_BUSI_NO = "BUSI_NO";
    public static final String WF_BUSI_NAME = "BUSI_NAME";
    public static final String WF_REMARK = "REMARK";
    public static final String PROC_ORGAN = "PROC_ORGAN";
    public static final String ROLE_ID = "roleId";
    public static final String MAIN_PROCESS_TYPE = "mainProcessType";
    public static final String WF_BUSINESS_ID = "BUSINESS_ID";
    public static final String EXEC_ORGAN="EXEC_ORGAN";
    public static final String MAIN_APP_NO = "mainAppNo";
    public static final String NOT_ACCEPTE = "notAccepte";//没有签收
    public static final String ACCEPTED = "accepted";//已签收
    public static final String COULD_NOT_BACK = "couldNotBack";//不能回退
    public static final String PUB_P_APP_STATUS_RECORDED = "7";//流程状态为已归档
    public static final String PUB_P_APP_STATUS_STOP = "4";//流程状态为已失效（终止）
    public static final String WF_MESSAGE = "message";
    public static final String WF_SAVE_SUCCESS="保存成功！";
    public static final String WF_SAVE_FAILURE="保存失败！";
    public static final String WF_DEL_SUCCESS ="删除成功！";
    public static final String WF_DEL_FAILURE ="删除失败！";
    public static final String WF_SEND_SUCCESS="发送成功！";
    public static final String WF_SEND_FAILURE="发送失败！";
    public static final String WF_BACK_SUSSCESS = "退单成功";
    public static final String WF_BACK_FAIL = "退单失败";
    public static final String WF_NODE_VALUE="nodeValue";                //节点值
    public static final String WF_NODE_ID="nodeId";                      //节点
    public static final String WF_APP_NO_P="appNo";                      //节点
    public static final String WF_RULE_ID= "ruleId";//环节执行者规则
    /**
     * @description 工作项实例
     */
    public static final String WF_WORKITEM= "workitem";//工作项实例

    /**
     * @description 工作项实例ID
     */
    public static final String WF_WORKITEM_ID= "workItemID";//工作项实例ID
    /**
     * @description 工作流权限 全部
     */
    public static final String WF_PERMISSION_ALL= "ALL";//全部
    /**
     * @description 工作流权限 公共
     */
    public static final String WF_PERMISSION_PUBLIC= "PUBLIC";//公共
    /**
     * @description 工作流权限 个人
     */
    public static final String WF_PERMISSION_PRIVATE= "PRIVATE";//个人
    /**
     * @description 工作流任务来源 全部
     */
    public static final String WF_SCOPE_ALL = "ALL";//全部
    /**
     * @description 工作流任务来源 自己
     */
    public static final String WF_SCOPE_SELF = "SELF";//自己
    /**
     * @description 工作流任务来源 全部代理
     */
    public static final String WF_SCOPE_AGENT = "AGENT";//代理
    /**
     * @description 工作流任务来源 代办
     */
    public static final String WF_SCOPE_DELEG = "DELEG";//代办
    /**
     * @description 工作流任务来源 协办
     */
    public static final String WF_SCOPE_HELP = "HELP";//协办
    /**
     * @description 分页属性
     */
    public static final String WF_PageCond = "PageCond";//分页属性
    /**
     * @description 工作项状态   待领取
     */
    public static final String WF_WAITING_RECEIVE = "4";//工作项状态_待领取
    /**
     * @description 工作项状态   执行
     */
    public static final String WF_WORKITEM_EXEC = "10";//工作项状态_执行
    /**
     * @description 工作项状态   完成
     */
    public static final String WF_WORKITEM_FINISH = "12";//工作项状态_完成

    /**
     * @description 参与者类型 角色
     */
    public static final String WF_PARTITYPE_ROLE = "02";
    /**
     * @description 参与者类型 人员
     */
    public static final String WF_PARTITYPE_PERSON = "01";
    /**
     * @description 扩展字段_审评编号
     */
    public static final String WF_PRC_APP_NO = "APP_NO";
    /**
     * @description 扩展字段_主申请编号
     */
    public static final String WF_PRC_MAIN_APP_NO = "MAIN_APP_NO";
    /**
     * @description 扩展字段_编号
     */
    public static final String WF_PRC_BUSI_NO = "BUSI_NO";
    /**
     * @description 扩展字段_名称
     */
    public static final String WF_PRC_BUSI_NAME = "BUSI_NAME";
    /**
     * @description 扩展字段_备注
     */
    public static final String WF_PRC_REMARK = "REMARK";
    /**
     * @description 扩展字段_创建单位code
     */
    public static final String WF_PRC_PROC_ORGAN = "PROC_ORGAN";
    /**
     * @description 扩展字段_创建单位名称
     */
    public static final String WF_PRC_EXTEND1 = "EXTEND1";
    /**
     * @description 扩展字段_未使用
     */
    public static final String WF_PRC_EXTEND2 = "EXTEND2";
    /**
     * @description 扩展字段_未使用
     */
    public static final String WF_PRC_EXTEND3 = "EXTEND3";
    /**
     * @description 扩展字段_未使用
     */
    public static final String WF_PRC_EXTEND4 = "EXTEND4";
    /**
     * @description 扩展字段_执行单位code
     */
    public static final String WF_PRC_EXEC_ORGAN = "EXEC_ORGAN";
    /**
     * @description 扩展字段_退单原因
     */
    public static final String WF_PRC_BACK_REASON = "BACK_REASON";
    /**
     * @description 退单方式—直接回退
     */
    public static final String WF_BACKTYPE_DIRECT = "01";
    /**
     * @description 退单方式—原路重走
     */
    public static final String WF_BACKTYPE_ORIGINAL = "02";
    /**
     * 流程定义ID
     */
    /**
     * @description 文件名称
     */
    public static final String WF_FILENAME="fileName";                  //文件名称
    /**
     * @description 文件路径
     */
    public static final String WF_FILEPATH="filePath";                  //文件路径
    /**
     * @description 文件显示名称
     */
    public static final String WF_FILEDISNAME="fileDisName";            //文件显示名称
    public static final String WF_APPR_VERI_FLAG = "apprVeriFlag";
    public static final String WF_APPR_RSLT= "apprRslt";
    /**
     * @description 审批结果,通过
     */
    public static String WF_APPLY_PASS_RESULT_Y = "1";					//审批结果,通过
    public static String WF_APPLY_PASS = "同意";							//审批结果,通过
    public static String WF_APPLY_AGREE = "同意";						//审批结果,同意
    public static String WF_TEST_PASS = "通过";							//测试结果,通过
    /**
     * @description 审批结果,不通过
     */
    public static String WF_APPLY_PASS_RESULT_N= "0";                   //审批结果,不通过
    public static String WF_APPLY_NOT_PASS = "不同意";					//审批结果,不通过
    public static String WF_APPLY_NOT_AGREE = "不同意";					//审批结果,不同意
    public static String WF_TEST_NOT_PASS = "不通过";					//测试结果,不通过
    /**
     * @description 审批结果,修改可研
     */
    public static String WF_APPLY_PASS_RESULT_U= "2";                   //审批结果,修改可研
    /**
     * @description 待审
     */
    public static String WF_APPLY_STAY= "01";                           //待审
    /**
     * @description 已审
     */
    public static String WF_APPLY_END= "02";                            //已审
    /**
     * @description 发送数量
     */
    public static final String SEND_NUM= "sendNum";                     //发送数量
    /**
     * @description 是否需要派工： 0.不需要、1.需要
     */
    public static final String HAVE_TASK_ASSIGN = "haveTaskAssign";     //是否需要派工： 0.不需要、1.需要

    /**
     * 流程类型
     */
    /**
     * @description 项目建议流程
     */
    public static final String WF_ADVICE = "P01001";
    /**
     * @description 项目可研流程
     */
    public static final String WF_RESEARCH = "P01002";
    /**
     * @description 项目研究测评流程
     */
    public static final String WF_BUILD_RES = "P01003";
    /**
     * @description 项目研发
     */
    public static final String WF_BUILD_DEV = "P01004";
    /**
     * @description 项目实施
     */
    public static final String WF_BUILD_PEF = "P01005";
    /**
     * @description 基础设施建设
     */
    public static final String WF_BUILD_BASE = "P01006";

    /**
     * @description 储备项目上报
     */
    public static final String WF_STORE_REPORT = "P01007";

    /**
     * @description 年度计划流程
     */
    public static final String WF_ANNUAL_PLAN = "P01008";

    /**
     * @description 投资月报
     */
    public static final String WF_IMR_REPORT = "P01009";

    /**
     * @description 项目计划
     */
    public static final String WF_PROJ_PLAN = "P01010";

    /**
     * @description 项目变更流程
     */
    public static final String WF_PROJ_CHANGE = "P01011";

    /**
     * @description 里程碑计划上报
     */
    public static final String WF_MIST_REPORT = "P01012";

    /**
     * @description 项目典设
     */
    public static final String WF_BUILD_MOD = "P01016";

    /**
     * @description 准入制面试申报
     */
    public static final String WF_ADMTC_INVITE = "P01021";

    /**
     * @description 中级评定申报流程
     */
    public static final String WF_GRADE_APPLICATION = "P01023";

    //GZX 20110328 标志当前流程是终止、挂起或者是恢复
    public static final String STOPPROCESS = "01";     // 流程终止
    public static final String SUSPENDPROCESS = "02";     // 流程挂起
    public static final String RESUMEPROCESS = "03";     // 流程恢复
    //以下常量用于验证拽回退单操作
    /**
     * 退回工作项操作
     */
    public static final String PUSHBACKWORKITEM = "01";
    /**
     *拽回工作向操作
     */
    public static final String DRAWBACKWORKITEM = "02";

    /**
     * 源环节
     */
    public static final String SRC_ACT = "0";

    /**
     * 目标环节
     */
    public static final String TAR_ACT = "1";
    //以上常量用于验证拽回退单操作
    /**
     * @description 可研上报
     */
    public static final String WF_ACT_RES_REPORT = "A010";

    /**
     * @description 内部审查
     */
    public static final String WF_ACT_RES_PASS = "A020";

    /**
     * @description 可研评审
     */
    public static final String WF_ACT_RES_GIST = "A030";

    /**
     * @description 可研批复
     */
    public static final String WF_ACT_RES_AGREE = "A040";

    /**
     * @description 可研初审(分部)
     */
    public static final String WF_ACT_RES_SUB = "A050";


    /**
     * @description 综合管理流程定义
     */
    public static final String WF_WM = "P02001";         //周会管理
    public static final String WF_WM_PREP = "P02004";    //周会准备流程定义
    public static final String WF_WM_EXT = "P02020";         //例会管理
    public static final String WF_WM_EXT_PREP = "P02021";    //例会准备流程定义
    public static final String WF_ANCE = "P02002";       //公告管理流程定义
    public static final String WF_ANCE_RECV = "P02007";  //公告接受子流程流程定义
    public static final String WF_AW = "P02003";         //办件管理流程定义
    public static final String WF_OMR = "P02005";        //各单位月报流程定义
    public static final String WF_OMR_RPT = "P02006";    //各单位月报上报流程定义
    public static final String WF_HQMR = "P02008";       //总部月报流程定义
    public static final String WF_PNC_CTB = "P02012";    //宣传稿件投递流程定义

    /**
     * @description 综合管理流程名称
     */
    public static final String WF_WM_NAME = "周会管理";         //周会管理
    public static final String WF_WM_PREP_NAME = "周会准备";    //周会准备流程定义
    public static final String WF_WM_EXT_NAME = "例会管理";         //例会管理
    public static final String WF_WM_EXT_PREP_NAME = "例会准备";    //例会准备流程定义
    public static final String WF_ANCE_NAME = "公告管理";       //公告管理流程定义
    public static final String WF_ANCE_RECV_NAME = "公告接受";  //公告接受子流程流程定义
    public static final String WF_AW_NAME = "办件管理";         //办件管理流程定义
    public static final String WF_OMR_NAME = "各单位月报";        //各单位月报流程定义
    public static final String WF_OMR_RPT_NAME = "各单位月报上报";    //各单位月报上报流程定义
    public static final String WF_HQMR_NAME = "总部月报";       //总部月报流程定义
    public static final String WF_PNC_CTB_NAME = "宣传稿件投递"; //宣传稿件投递流程定义

    /**
     * @description 流程环节
     */
    public static final String WF_ACT_OMR_APPROVE = "A030"; //总部审核子流程 环节
    public final static String WF_ACT_WM_FORACT = "A030"; //周会管理 待激活环节名称
    public final static String WF_ACT_PNC_CTBMAIL = "A010"; //宣传投稿稿件投递环节名称
    public final static String WF_ACT_PNC_MAILAUDIT = "A020"; //宣传投稿审核环节名称

    public final static String VALID_FLAG_NOT = "0";      // 无效（项目建议）
    public final static String VALID_FLAG_YES = "1";      // 有效（项目建议）

    public final static String SELF_FLAG = "self";      // 有效（项目建议）

    public final static String USER_TYPE = "userType";      // 有效（项目建议）

    //投稿计划下达页面
    public static final String WF_PNC_PLAN_DOWN = "投稿计划下达";       //投稿计划下达
    public static final String WF_PNC_PLAN_SIGN = "投稿计划签收";       //投稿计划签收
    public static final String WF_PNC_PLAN_DOWN_NO = "P02010";       //投稿计划下达no
    public static final String WF_PNC_PLAN_SIGN_NO = "P02013";       //投稿计划签收no

    //系统应用情况
    public static final String JHC="总部计划处";
    public static final String AJC="总部安技处";
    public static final String JSC="总部建设处";
    public static final String YXC="总部运行处";
    public static final String DDC="总部调度处";
    public static final String TXC="电力通信处";
    public static final String ZHC="总部综合处";
    public static final String SYS="安全实验室";
    public static final String ZDPH="中电普华";
    public static final String ZDZB="中电装备";
    public static final String DKY="国网电科院";
    public static final String XT="国网信通";

    public static final String JHC_ID="10010003";
    public static final String AJC_ID="10010004";
    public static final String JSC_ID="10010005";
    public static final String YXC_ID="10010006";
    public static final String ZHC_ID="10010007";
    public static final String DDC_ID="10010008";
    public static final String TXC_ID="10010009";
    public static final String SYS_ID="10170115";
    public static final String ZDPH_ID="101724";
    public static final String ZDZB_ID="103000";
    public static final String DKY_ID="101900";
    public static final String XT_ID="101500";


    /* 当前阶段结束标志 */
    public final static String PROG_END_FLAG_YES = "0";   	// 0：已结束；
    public final static String PROG_END_FLAG_NO = "1";		// 1：未结束；

    /* 项目阶段    */
    public final static String PROG_CODE_01 = "01"; //项目前期
    public final static String PROG_CODE_02 = "02"; //储备阶段
    public final static String PROG_CODE_03 = "03"; //年度计划
    public final static String PROG_CODE_04 = "04"; //建设阶段
    public final static String PROG_CODE_05 = "05"; //运行阶段

    /* 流程环节定义id */
    public final static String ACTIVITYDEFID_A010 = "A010";
    public final static String ACTIVITYDEFID_A020 = "A020";
    public final static String ACTIVITYDEFID_A030 = "A030";
    public final static String ACTIVITYDEFID_A040 = "A040";
    public final static String ACTIVITYDEFID_A050 = "A050";
    public final static String ACTIVITYDEFID_A060 = "A060";
    public final static String ACTIVITYDEFID_A070 = "A070";
    public final static String ACTIVITYDEFID_A130 = "A130";
    public final static String ACTIVITYDEFID_A140 = "A140";
    public final static String ACTIVITYDEFID_A210 = "A210";
    public final static String ACTIVITYDEFID_A230 = "A230";
    public final static String ACTIVITYDEFID_A180 = "A180";

    public final static String ALP_RTP_STATUS_CODE_03 = "03"; // 年度计划上报 状态  03 已退回
    public final static String STORE_RPT_STATUS_CODE_03 = "03"; // 储备项目上报 状态  03 已退回

    /**
     * @description 年度计划审核流程
     */
    public static final String WF_ANNUAL_PLAN_APPROVE = "P01014";

    /**
     * @description 储备项目上报审核 流程
     */
    public static final String WF_STORE_REPORT_APPROVE = "P01013";

    /**
     *  @description  保密机申请
     */
    public static final String WF_SECDEV_APP = "P04004"; //保密设备使用申请流程定义
    public static final String WF_SECDEV_APP_NAME = "保密设备使用申请"; //保密设备使用申请流程定义

    //保密设备使用确认
    public static final String WF_SM_SEC_DEV_PRO_NAME = "保密设备使用确认";       //保密设备使用确认
    public static final String WF_SM_SEC_DEV_PRO_NO = "P04005";       //保密设备使用确认
    public static final String WF_SM_SEC_DEV_PRO_1 = "A010";       //使用情况录入
    public static final String WF_SM_SEC_DEV_PRO_2 = "A020";       //使用人确认
    public static final String WF_SM_SEC_DEV_PRO_3 = "A030";       //专责修改
    public static final String WF_SM_SEC_DEV_PRO_4 = "A040";       //最终确认
    public static final String WF_SM_SEC_DEV_PRO_5 = "A050";       //专责确认

    public final static String PROMOTE_FLAG_YES = "1"; //统推项目
    public final static String PROMOTE_FLAG_NOT = "0"; //自建项目
    public final static String PM_STORE_DATA_STATUS_CUR ="1";  // 1：当前数据
    public final static String PM_STORE_STATUS_CODE_01 = "01"; // 项目储备库 状态   系统入库
    public final static String PM_STORE_STATUS_CODE_03 = "03"; // 项目储备库 状态   手动入库
    public final static String PM_STORE_STATUS_CODE_04 = "04"; // 项目储备库 状态   手动出库
    public final static String BUDGET_TYPE_CODE_ESTIMATE = "02";   // 估算（资金）
    public final static String BUDGET_TYPE_CODE_INVESTPLAN = "05";   // 投资计划（资金）

    //GZX 保密联络员变更流程
    public static final String WF_SM_LIA_CHANGE_NO = "P04007";       //保密联络员变更流程id
    public static final String WF_SM_LIA_CHANGE_NAME = "保密联络员变更";     //保密联络员变更流程名称
    public static final String WF_SM_LIA_CHANGE_SATATUS_1 = "A010";       //变更申请
    public static final String WF_SM_LIA_CHANGE_SATATUS_2 = "A020";       //专责确认
    public static final String WF_SM_LIA_CHANGE_SATATUS_3 = "A030";       //保密组长审核
    public static final String WF_SM_LIA_CHANGE_SATATUS_4 = "A040";       //委员会审定

    public static final String WF_P01012 = "P01012";       //储备项目变更

    public static final String WF_SOFEWARE_PUBLISH = "P03002";  //软件发布
    public static final String WF_SOFEWARE_DEPLOY = "P03003";  //软件安装部署

    public static final String WF_EMP_POST_PRODEFID = "P02016";  //岗位申请
    public static final String WF_EMP_POST_PRODEFNAME = "岗位管理";  //岗位申请

    public static final String WF_PM_MIST_EDIT_ID = "P01019";  //里程碑计划上报
    public static final String WF_PM_MIST_EDIT_NAME = "里程碑计划上报";  //里程碑计划上报

    public static final String WF_TM_EDITION_PLAN_APP = "P05001";  //版本升级计划
    public static final String P_SORT_CODE_07010013 = "07010013";  //是否调用门户
    public static final String P_SORT_CODE_07010013_1 = "1";  //调用门户

    public static final String WF_BUILD_DEV_A090 = "A090"; //项目研发流程确认测试节点

    public static final String TASK_REC_TYPE_01 = "01"; //任务接受方式：个人接受
    public static final String TASK_REC_TYPE_02 = "02"; //02角色接收不签收到个人
    public static final String TASK_REC_TYPE_03 = "03"; //角色接收可签收到个人
    public static final String TASK_REC_TYPE_05 = "05"; //接收与否根据sql判定
    public static final String TASK_READ_FLAG_0 = "0"; //任务尚未阅读
    public static final String TASK_READ_FLAG_1 = "1"; //任务已阅读
    public static final String TASK_DEAL_FLAG_0 = "0"; //任务在处理
    public static final String TASK_DEAL_FLAG_1 = "1"; //任务处理完成
    public static final String TASK_SIGN_UNSUCC = "签收失败！"; //任务签收失败
    public static final String TASK_SIGN_SUCC = "签收成功！"; //任务签收成功
    public static final String TASK_UNSIGN_UNSUCC = "取消签收失败！"; //任务签收失败
    public static final String TASK_UNSIGN_SUCC = "取消签收成功！"; //任务签收成功
}
