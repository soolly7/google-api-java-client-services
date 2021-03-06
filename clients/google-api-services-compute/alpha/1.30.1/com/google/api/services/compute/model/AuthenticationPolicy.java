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

package com.google.api.services.compute.model;

/**
 * The authentication settings for the backend service.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Compute Engine API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class AuthenticationPolicy extends com.google.api.client.json.GenericJson {

  /**
   * List of authentication methods that can be used for origin authentication. Similar to peers,
   * these will be evaluated in order the first valid one will be used to set origin identity. If
   * none of these methods pass, the request will be rejected with authentication failed error
   * (401). Leave the list empty if origin authentication is not required.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<OriginAuthenticationMethod> origins;

  /**
   * List of authentication methods that can be used for peer authentication. They will be evaluated
   * in order the first valid one will be used to set peer identity. If none of these methods pass,
   * the request will be rejected with authentication failed error (401). Leave the list empty if
   * peer authentication is not required.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<PeerAuthenticationMethod> peers;

  /**
   * Define whether peer or origin identity should be used for principal. Default value is USE_PEER.
   * If peer (or origin) identity is not available, either because peer/origin authentication is not
   * defined, or failed, principal will be left unset. In other words, binding rule does not affect
   * the decision to accept or reject request. This field can be set to one of the following:
   * USE_PEER: Principal will be set to the identity from peer authentication. USE_ORIGIN: Principal
   * will be set to the identity from origin authentication.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String principalBinding;

  /**
   * Configures the mechanism to obtain server-side security certificates and identity information.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private TlsContext serverTlsContext;

  /**
   * List of authentication methods that can be used for origin authentication. Similar to peers,
   * these will be evaluated in order the first valid one will be used to set origin identity. If
   * none of these methods pass, the request will be rejected with authentication failed error
   * (401). Leave the list empty if origin authentication is not required.
   * @return value or {@code null} for none
   */
  public java.util.List<OriginAuthenticationMethod> getOrigins() {
    return origins;
  }

  /**
   * List of authentication methods that can be used for origin authentication. Similar to peers,
   * these will be evaluated in order the first valid one will be used to set origin identity. If
   * none of these methods pass, the request will be rejected with authentication failed error
   * (401). Leave the list empty if origin authentication is not required.
   * @param origins origins or {@code null} for none
   */
  public AuthenticationPolicy setOrigins(java.util.List<OriginAuthenticationMethod> origins) {
    this.origins = origins;
    return this;
  }

  /**
   * List of authentication methods that can be used for peer authentication. They will be evaluated
   * in order the first valid one will be used to set peer identity. If none of these methods pass,
   * the request will be rejected with authentication failed error (401). Leave the list empty if
   * peer authentication is not required.
   * @return value or {@code null} for none
   */
  public java.util.List<PeerAuthenticationMethod> getPeers() {
    return peers;
  }

  /**
   * List of authentication methods that can be used for peer authentication. They will be evaluated
   * in order the first valid one will be used to set peer identity. If none of these methods pass,
   * the request will be rejected with authentication failed error (401). Leave the list empty if
   * peer authentication is not required.
   * @param peers peers or {@code null} for none
   */
  public AuthenticationPolicy setPeers(java.util.List<PeerAuthenticationMethod> peers) {
    this.peers = peers;
    return this;
  }

  /**
   * Define whether peer or origin identity should be used for principal. Default value is USE_PEER.
   * If peer (or origin) identity is not available, either because peer/origin authentication is not
   * defined, or failed, principal will be left unset. In other words, binding rule does not affect
   * the decision to accept or reject request. This field can be set to one of the following:
   * USE_PEER: Principal will be set to the identity from peer authentication. USE_ORIGIN: Principal
   * will be set to the identity from origin authentication.
   * @return value or {@code null} for none
   */
  public java.lang.String getPrincipalBinding() {
    return principalBinding;
  }

  /**
   * Define whether peer or origin identity should be used for principal. Default value is USE_PEER.
   * If peer (or origin) identity is not available, either because peer/origin authentication is not
   * defined, or failed, principal will be left unset. In other words, binding rule does not affect
   * the decision to accept or reject request. This field can be set to one of the following:
   * USE_PEER: Principal will be set to the identity from peer authentication. USE_ORIGIN: Principal
   * will be set to the identity from origin authentication.
   * @param principalBinding principalBinding or {@code null} for none
   */
  public AuthenticationPolicy setPrincipalBinding(java.lang.String principalBinding) {
    this.principalBinding = principalBinding;
    return this;
  }

  /**
   * Configures the mechanism to obtain server-side security certificates and identity information.
   * @return value or {@code null} for none
   */
  public TlsContext getServerTlsContext() {
    return serverTlsContext;
  }

  /**
   * Configures the mechanism to obtain server-side security certificates and identity information.
   * @param serverTlsContext serverTlsContext or {@code null} for none
   */
  public AuthenticationPolicy setServerTlsContext(TlsContext serverTlsContext) {
    this.serverTlsContext = serverTlsContext;
    return this;
  }

  @Override
  public AuthenticationPolicy set(String fieldName, Object value) {
    return (AuthenticationPolicy) super.set(fieldName, value);
  }

  @Override
  public AuthenticationPolicy clone() {
    return (AuthenticationPolicy) super.clone();
  }

}
