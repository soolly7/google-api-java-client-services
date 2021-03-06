/*
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied. See the License for the specific language governing permissions and limitations under
 * the License.
 */
/*
 * This code was generated by https://github.com/googleapis/google-api-java-client-services/
 * Modify at your own risk.
 */

package com.google.api.services.civicinfo.model;

/**
 * Model definition for LivegraphBacktraceRecordInfo.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Google Civic Information API. For a detailed
 * explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class LivegraphBacktraceRecordInfo extends com.google.api.client.json.GenericJson {

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long dataSourcePublishMsec;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String expId;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private LivegraphBacktraceRecordInfoExpInfo expInfo;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean isRecon;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean isWlmThrottled;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long numberOfTriples;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String priority;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String process;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long proxyReceiveMsec;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long proxySentMsec;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String recordId;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean shouldMonitorLatency;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long subscriberReceiveMsec;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long topicBuildFinishMsec;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long topicBuildStartMsec;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String version;

  /**
   * @return value or {@code null} for none
   */
  public java.lang.Long getDataSourcePublishMsec() {
    return dataSourcePublishMsec;
  }

  /**
   * @param dataSourcePublishMsec dataSourcePublishMsec or {@code null} for none
   */
  public LivegraphBacktraceRecordInfo setDataSourcePublishMsec(java.lang.Long dataSourcePublishMsec) {
    this.dataSourcePublishMsec = dataSourcePublishMsec;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getExpId() {
    return expId;
  }

  /**
   * @param expId expId or {@code null} for none
   */
  public LivegraphBacktraceRecordInfo setExpId(java.lang.String expId) {
    this.expId = expId;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public LivegraphBacktraceRecordInfoExpInfo getExpInfo() {
    return expInfo;
  }

  /**
   * @param expInfo expInfo or {@code null} for none
   */
  public LivegraphBacktraceRecordInfo setExpInfo(LivegraphBacktraceRecordInfoExpInfo expInfo) {
    this.expInfo = expInfo;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getIsRecon() {
    return isRecon;
  }

  /**
   * @param isRecon isRecon or {@code null} for none
   */
  public LivegraphBacktraceRecordInfo setIsRecon(java.lang.Boolean isRecon) {
    this.isRecon = isRecon;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getIsWlmThrottled() {
    return isWlmThrottled;
  }

  /**
   * @param isWlmThrottled isWlmThrottled or {@code null} for none
   */
  public LivegraphBacktraceRecordInfo setIsWlmThrottled(java.lang.Boolean isWlmThrottled) {
    this.isWlmThrottled = isWlmThrottled;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.Long getNumberOfTriples() {
    return numberOfTriples;
  }

  /**
   * @param numberOfTriples numberOfTriples or {@code null} for none
   */
  public LivegraphBacktraceRecordInfo setNumberOfTriples(java.lang.Long numberOfTriples) {
    this.numberOfTriples = numberOfTriples;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getPriority() {
    return priority;
  }

  /**
   * @param priority priority or {@code null} for none
   */
  public LivegraphBacktraceRecordInfo setPriority(java.lang.String priority) {
    this.priority = priority;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getProcess() {
    return process;
  }

  /**
   * @param process process or {@code null} for none
   */
  public LivegraphBacktraceRecordInfo setProcess(java.lang.String process) {
    this.process = process;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.Long getProxyReceiveMsec() {
    return proxyReceiveMsec;
  }

  /**
   * @param proxyReceiveMsec proxyReceiveMsec or {@code null} for none
   */
  public LivegraphBacktraceRecordInfo setProxyReceiveMsec(java.lang.Long proxyReceiveMsec) {
    this.proxyReceiveMsec = proxyReceiveMsec;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.Long getProxySentMsec() {
    return proxySentMsec;
  }

  /**
   * @param proxySentMsec proxySentMsec or {@code null} for none
   */
  public LivegraphBacktraceRecordInfo setProxySentMsec(java.lang.Long proxySentMsec) {
    this.proxySentMsec = proxySentMsec;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getRecordId() {
    return recordId;
  }

  /**
   * @param recordId recordId or {@code null} for none
   */
  public LivegraphBacktraceRecordInfo setRecordId(java.lang.String recordId) {
    this.recordId = recordId;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getShouldMonitorLatency() {
    return shouldMonitorLatency;
  }

  /**
   * @param shouldMonitorLatency shouldMonitorLatency or {@code null} for none
   */
  public LivegraphBacktraceRecordInfo setShouldMonitorLatency(java.lang.Boolean shouldMonitorLatency) {
    this.shouldMonitorLatency = shouldMonitorLatency;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.Long getSubscriberReceiveMsec() {
    return subscriberReceiveMsec;
  }

  /**
   * @param subscriberReceiveMsec subscriberReceiveMsec or {@code null} for none
   */
  public LivegraphBacktraceRecordInfo setSubscriberReceiveMsec(java.lang.Long subscriberReceiveMsec) {
    this.subscriberReceiveMsec = subscriberReceiveMsec;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.Long getTopicBuildFinishMsec() {
    return topicBuildFinishMsec;
  }

  /**
   * @param topicBuildFinishMsec topicBuildFinishMsec or {@code null} for none
   */
  public LivegraphBacktraceRecordInfo setTopicBuildFinishMsec(java.lang.Long topicBuildFinishMsec) {
    this.topicBuildFinishMsec = topicBuildFinishMsec;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.Long getTopicBuildStartMsec() {
    return topicBuildStartMsec;
  }

  /**
   * @param topicBuildStartMsec topicBuildStartMsec or {@code null} for none
   */
  public LivegraphBacktraceRecordInfo setTopicBuildStartMsec(java.lang.Long topicBuildStartMsec) {
    this.topicBuildStartMsec = topicBuildStartMsec;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getVersion() {
    return version;
  }

  /**
   * @param version version or {@code null} for none
   */
  public LivegraphBacktraceRecordInfo setVersion(java.lang.String version) {
    this.version = version;
    return this;
  }

  @Override
  public LivegraphBacktraceRecordInfo set(String fieldName, Object value) {
    return (LivegraphBacktraceRecordInfo) super.set(fieldName, value);
  }

  @Override
  public LivegraphBacktraceRecordInfo clone() {
    return (LivegraphBacktraceRecordInfo) super.clone();
  }

}
