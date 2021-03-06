package com.tripleaxe.monitor.model;

import org.springframework.data.annotation.Id;

import java.util.Date;

public class RequestDetail {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column request_detail.id
     *
     * @mbg.generated
     */
    @Id
    private String id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column request_detail.duration
     *
     * @mbg.generated
     */
    private Long duration;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column request_detail.method_name
     *
     * @mbg.generated
     */
    private String methodName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column request_detail.ip_address
     *
     * @mbg.generated
     */
    private String ipAddress;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column request_detail.server_ip
     *
     * @mbg.generated
     */
    private String serverIp;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column request_detail.request_uri
     *
     * @mbg.generated
     */
    private String requestUri;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column request_detail.request_url
     *
     * @mbg.generated
     */
    private String requestUrl;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column request_detail.query_string
     *
     * @mbg.generated
     */
    private String queryString;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column request_detail.request_time
     *
     * @mbg.generated
     */
    private Date requestTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column request_detail.source
     *
     * @mbg.generated
     */
    private String source;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column request_detail.user_agent
     *
     * @mbg.generated
     */
    private String userAgent;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column request_detail.os_name
     *
     * @mbg.generated
     */
    private String osName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column request_detail.device_name
     *
     * @mbg.generated
     */
    private String deviceName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column request_detail.agent_type_name
     *
     * @mbg.generated
     */
    private String agentTypeName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column request_detail.project_code
     *
     * @mbg.generated
     */
    private String projectCode;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column request_detail.create_time
     *
     * @mbg.generated
     */
    private Date createTime;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column request_detail.id
     *
     * @return the value of request_detail.id
     *
     * @mbg.generated
     */
    public String getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column request_detail.id
     *
     * @param id the value for request_detail.id
     *
     * @mbg.generated
     */
    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column request_detail.duration
     *
     * @return the value of request_detail.duration
     *
     * @mbg.generated
     */
    public Long getDuration() {
        return duration;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column request_detail.duration
     *
     * @param duration the value for request_detail.duration
     *
     * @mbg.generated
     */
    public void setDuration(Long duration) {
        this.duration = duration;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column request_detail.method_name
     *
     * @return the value of request_detail.method_name
     *
     * @mbg.generated
     */
    public String getMethodName() {
        return methodName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column request_detail.method_name
     *
     * @param methodName the value for request_detail.method_name
     *
     * @mbg.generated
     */
    public void setMethodName(String methodName) {
        this.methodName = methodName == null ? null : methodName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column request_detail.ip_address
     *
     * @return the value of request_detail.ip_address
     *
     * @mbg.generated
     */
    public String getIpAddress() {
        return ipAddress;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column request_detail.ip_address
     *
     * @param ipAddress the value for request_detail.ip_address
     *
     * @mbg.generated
     */
    public void setIpAddress(String ipAddress) {
        this.ipAddress = ipAddress == null ? null : ipAddress.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column request_detail.server_ip
     *
     * @return the value of request_detail.server_ip
     *
     * @mbg.generated
     */
    public String getServerIp() {
        return serverIp;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column request_detail.server_ip
     *
     * @param serverIp the value for request_detail.server_ip
     *
     * @mbg.generated
     */
    public void setServerIp(String serverIp) {
        this.serverIp = serverIp == null ? null : serverIp.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column request_detail.request_uri
     *
     * @return the value of request_detail.request_uri
     *
     * @mbg.generated
     */
    public String getRequestUri() {
        return requestUri;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column request_detail.request_uri
     *
     * @param requestUri the value for request_detail.request_uri
     *
     * @mbg.generated
     */
    public void setRequestUri(String requestUri) {
        this.requestUri = requestUri == null ? null : requestUri.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column request_detail.request_url
     *
     * @return the value of request_detail.request_url
     *
     * @mbg.generated
     */
    public String getRequestUrl() {
        return requestUrl;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column request_detail.request_url
     *
     * @param requestUrl the value for request_detail.request_url
     *
     * @mbg.generated
     */
    public void setRequestUrl(String requestUrl) {
        this.requestUrl = requestUrl == null ? null : requestUrl.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column request_detail.query_string
     *
     * @return the value of request_detail.query_string
     *
     * @mbg.generated
     */
    public String getQueryString() {
        return queryString;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column request_detail.query_string
     *
     * @param queryString the value for request_detail.query_string
     *
     * @mbg.generated
     */
    public void setQueryString(String queryString) {
        this.queryString = queryString == null ? null : queryString.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column request_detail.request_time
     *
     * @return the value of request_detail.request_time
     *
     * @mbg.generated
     */
    public Date getRequestTime() {
        return requestTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column request_detail.request_time
     *
     * @param requestTime the value for request_detail.request_time
     *
     * @mbg.generated
     */
    public void setRequestTime(Date requestTime) {
        this.requestTime = requestTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column request_detail.source
     *
     * @return the value of request_detail.source
     *
     * @mbg.generated
     */
    public String getSource() {
        return source;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column request_detail.source
     *
     * @param source the value for request_detail.source
     *
     * @mbg.generated
     */
    public void setSource(String source) {
        this.source = source == null ? null : source.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column request_detail.user_agent
     *
     * @return the value of request_detail.user_agent
     *
     * @mbg.generated
     */
    public String getUserAgent() {
        return userAgent;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column request_detail.user_agent
     *
     * @param userAgent the value for request_detail.user_agent
     *
     * @mbg.generated
     */
    public void setUserAgent(String userAgent) {
        this.userAgent = userAgent == null ? null : userAgent.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column request_detail.os_name
     *
     * @return the value of request_detail.os_name
     *
     * @mbg.generated
     */
    public String getOsName() {
        return osName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column request_detail.os_name
     *
     * @param osName the value for request_detail.os_name
     *
     * @mbg.generated
     */
    public void setOsName(String osName) {
        this.osName = osName == null ? null : osName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column request_detail.device_name
     *
     * @return the value of request_detail.device_name
     *
     * @mbg.generated
     */
    public String getDeviceName() {
        return deviceName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column request_detail.device_name
     *
     * @param deviceName the value for request_detail.device_name
     *
     * @mbg.generated
     */
    public void setDeviceName(String deviceName) {
        this.deviceName = deviceName == null ? null : deviceName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column request_detail.agent_type_name
     *
     * @return the value of request_detail.agent_type_name
     *
     * @mbg.generated
     */
    public String getAgentTypeName() {
        return agentTypeName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column request_detail.agent_type_name
     *
     * @param agentTypeName the value for request_detail.agent_type_name
     *
     * @mbg.generated
     */
    public void setAgentTypeName(String agentTypeName) {
        this.agentTypeName = agentTypeName == null ? null : agentTypeName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column request_detail.project_code
     *
     * @return the value of request_detail.project_code
     *
     * @mbg.generated
     */
    public String getProjectCode() {
        return projectCode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column request_detail.project_code
     *
     * @param projectCode the value for request_detail.project_code
     *
     * @mbg.generated
     */
    public void setProjectCode(String projectCode) {
        this.projectCode = projectCode == null ? null : projectCode.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column request_detail.create_time
     *
     * @return the value of request_detail.create_time
     *
     * @mbg.generated
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column request_detail.create_time
     *
     * @param createTime the value for request_detail.create_time
     *
     * @mbg.generated
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}