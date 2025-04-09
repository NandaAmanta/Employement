package com.example.employement.common.constant;

public class RouteModuleV1Constant {

    public static final String API_V1 = "/api/v1";

    public static final String USER_PREFIX = "/user";
    public static final String EMPLOYEE_PREFIX = "/employee";

    public static final String USER_AUTH = API_V1 + USER_PREFIX+"/auth";
    public static final String USER_COMPANY = API_V1 + USER_PREFIX+"/companies";


    public static final String EMPLOYEE_AUTH = API_V1 + EMPLOYEE_PREFIX+ "/auth/employee";
    public static final String EMPLOYEE_COMPANY = API_V1 + EMPLOYEE_PREFIX+"/companies";

}
