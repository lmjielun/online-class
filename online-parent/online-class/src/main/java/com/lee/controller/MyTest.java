package com.lee.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @projectName：online_edu
 * @Description: 测试使用
 * @Author limingheng
 * @Date -03-15  09:27
 */
public class MyTest {
    public static void main(String[] args) {
        MyTest myTest = new MyTest();
        HashMap<String, Object> paraMap = new HashMap<>();
        paraMap.put("planYear","2013");
        myTest.a(paraMap);
        List paramList = new ArrayList<>();
        paramList.toArray();
    }


    public void a(Map<String, Object> paraMap){
        String planYear = (String) paraMap.get("planYear");
        String qrySql = "";
        qrySql = b(paraMap);
        List paramList = (List) paraMap.get("paramList");
        System.out.println(paramList.toArray());
    }

    private String b(Map<String, Object> paraMap) {
        String planYear = (String) paraMap.get("planYear");
        List paramList = new ArrayList();
        paramList.add(planYear);
        paramList.add("123456");
        paraMap.put("paramList",paramList);

        StringBuffer qrySql = new StringBuffer();

        String  table = "PL_ALP_RPT D INNER JOIN PM_PRJ_INFO P ON P.PRJ_ID = D.PRJ_ID ";
        List paList = new ArrayList();
        qrySql.append(" FROM "+table+"  ");
        // 可以改为
        qrySql.append(" FROM ? a");
        paList.add(table);









        return "123";
    }


}
