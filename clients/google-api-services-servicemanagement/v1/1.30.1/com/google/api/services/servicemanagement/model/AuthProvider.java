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

package com.google.api.services.servicemanagement.model;

/**
 * Configuration for an authentication provider, including support for [JSON Web Token
 * (JWT)](https://tools.ietf.org/html/draft-ietf-oauth-json-web-token-32).
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Service Management API. For a detailed explanation
 * see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class AuthProvider extends com.google.api.client.json.GenericJson {

  /**
   * The list of JWT [audiences](https://tools.ietf.org/html/draft-ietf-oauth-json-web-
   * token-32#section-4.1.3). that are allowed to access. A JWT containing any of these audiences
   * will be accepted. When this setting is absent, only JWTs with audience
   * "https://Service_name/API_name" will be accepted. For example, if no audiences are in the
   * setting, LibraryService API will only accept JWTs with the following audience "https://library-
   * example.googleapis.com/google.example.library.v1.LibraryService".
   *
   * Example:
   *
   *     audiences: bookstore_android.apps.googleusercontent.com,
   * bookstore_web.apps.googleusercontent.com
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String audiences;

  /**
   * Redirect URL if JWT token is required but not present or is expired. Implement authorizationUrl
   * of securityDefinitions in OpenAPI spec.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String authorizationUrl;

  /**
   * The unique identifier of the auth provider. It will be referred to by
   * `AuthRequirement.provider_id`.
   *
   * Example: "bookstore_auth".
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String id;

  /**
   * Identifies the principal that issued the JWT. See https://tools.ietf.org/html/draft-ietf-oauth-
   * json-web-token-32#section-4.1.1 Usually a URL or an email address.
   *
   * Example: https://securetoken.google.com Example: 1234567-compute@developer.gserviceaccount.com
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String issuer;

  /**
   * URL of the provider's public key set to validate signature of the JWT. See [OpenID
   * Discovery](https://openid.net/specs/openid-connect-discovery-1_0.html#ProviderMetadata).
   * Optional if the key set document:  - can be retrieved from    [OpenID
   * Discovery](https://openid.net/specs/openid-connect-discovery-1_0.html of    the issuer.  - can
   * be inferred from the email domain of the issuer (e.g. a Google  service account).
   *
   * Example: https://www.googleapis.com/oauth2/v1/certs
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String jwksUri;

  /**
   * Defines the locations to extract the JWT.
   *
   * JWT locations can be either from HTTP headers or URL query parameters. The rule is that the
   * first match wins. The checking order is: checking all headers first, then URL query parameters.
   *
   * If not specified,  default to use following 3 locations:    1) Authorization: Bearer    2) x
   * -goog-iap-jwt-assertion    3) access_token query parameter
   *
   * Default locations can be specified as followings:    jwt_locations:    - header: Authorization
   * value_prefix: "Bearer "    - header: x-goog-iap-jwt-assertion    - query: access_token
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<JwtLocation> jwtLocations;

  /**
   * The list of JWT [audiences](https://tools.ietf.org/html/draft-ietf-oauth-json-web-
   * token-32#section-4.1.3). that are allowed to access. A JWT containing any of these audiences
   * will be accepted. When this setting is absent, only JWTs with audience
   * "https://Service_name/API_name" will be accepted. For example, if no audiences are in the
   * setting, LibraryService API will only accept JWTs with the following audience "https://library-
   * example.googleapis.com/google.example.library.v1.LibraryService".
   *
   * Example:
   *
   *     audiences: bookstore_android.apps.googleusercontent.com,
   * bookstore_web.apps.googleusercontent.com
   * @return value or {@code null} for none
   */
  public java.lang.String getAudiences() {
    return audiences;
  }

  /**
   * The list of JWT [audiences](https://tools.ietf.org/html/draft-ietf-oauth-json-web-
   * token-32#section-4.1.3). that are allowed to access. A JWT containing any of these audiences
   * will be accepted. When this setting is absent, only JWTs with audience
   * "https://Service_name/API_name" will be accepted. For example, if no audiences are in the
   * setting, LibraryService API will only accept JWTs with the following audience "https://library-
   * example.googleapis.com/google.example.library.v1.LibraryService".
   *
   * Example:
   *
   *     audiences: bookstore_android.apps.googleusercontent.com,
   * bookstore_web.apps.googleusercontent.com
   * @param audiences audiences or {@code null} for none
   */
  public AuthProvider setAudiences(java.lang.String audiences) {
    this.audiences = audiences;
    return this;
  }

  /**
   * Redirect URL if JWT token is required but not present or is expired. Implement authorizationUrl
   * of securityDefinitions in OpenAPI spec.
   * @return value or {@code null} for none
   */
  public java.lang.String getAuthorizationUrl() {
    return authorizationUrl;
  }

  /**
   * Redirect URL if JWT token is required but not present or is expired. Implement authorizationUrl
   * of securityDefinitions in OpenAPI spec.
   * @param authorizationUrl authorizationUrl or {@code null} for none
   */
  public AuthProvider setAuthorizationUrl(java.lang.String authorizationUrl) {
    this.authorizationUrl = authorizationUrl;
    return this;
  }

  /**
   * The unique identifier of the auth provider. It will be referred to by
   * `AuthRequirement.provider_id`.
   *
   * Example: "bookstore_auth".
   * @return value or {@code null} for none
   */
  public java.lang.String getId() {
    return id;
  }

  /**
   * The unique identifier of the auth provider. It will be referred to by
   * `AuthRequirement.provider_id`.
   *
   * Example: "bookstore_auth".
   * @param id id or {@code null} for none
   */
  public AuthProvider setId(java.lang.String id) {
    this.id = id;
    return this;
  }

  /**
   * Identifies the principal that issued the JWT. See https://tools.ietf.org/html/draft-ietf-oauth-
   * json-web-token-32#section-4.1.1 Usually a URL or an email address.
   *
   * Example: https://securetoken.google.com Example: 1234567-compute@developer.gserviceaccount.com
   * @return value or {@code null} for none
   */
  public java.lang.String getIssuer() {
    return issuer;
  }

  /**
   * Identifies the principal that issued the JWT. See https://tools.ietf.org/html/draft-ietf-oauth-
   * json-web-token-32#section-4.1.1 Usually a URL or an email address.
   *
   * Example: https://securetoken.google.com Example: 1234567-compute@developer.gserviceaccount.com
   * @param issuer issuer or {@code null} for none
   */
  public AuthProvider setIssuer(java.lang.String issuer) {
    this.issuer = issuer;
    return this;
  }

  /**
   * URL of the provider's public key set to validate signature of the JWT. See [OpenID
   * Discovery](https://openid.net/specs/openid-connect-discovery-1_0.html#ProviderMetadata).
   * Optional if the key set document:  - can be retrieved from    [OpenID
   * Discovery](https://openid.net/specs/openid-connect-discovery-1_0.html of    the issuer.  - can
   * be inferred from the email domain of the issuer (e.g. a Google  service account).
   *
   * Example: https://www.googleapis.com/oauth2/v1/certs
   * @return value or {@code null} for none
   */
  public java.lang.String getJwksUri() {
    return jwksUri;
  }

  /**
   * URL of the provider's public key set to validate signature of the JWT. See [OpenID
   * Discovery](https://openid.net/specs/openid-connect-discovery-1_0.html#ProviderMetadata).
   * Optional if the key set document:  - can be retrieved from    [OpenID
   * Discovery](https://openid.net/specs/openid-connect-discovery-1_0.html of    the issuer.  - can
   * be inferred from the email domain of the issuer (e.g. a Google  service account).
   *
   * Example: https://www.googleapis.com/oauth2/v1/certs
   * @param jwksUri jwksUri or {@code null} for none
   */
  public AuthProvider setJwksUri(java.lang.String jwksUri) {
    this.jwksUri = jwksUri;
    return this;
  }

  /**
   * Defines the locations to extract the JWT.
   *
   * JWT locations can be either from HTTP headers or URL query parameters. The rule is that the
   * first match wins. The checking order is: checking all headers first, then URL query parameters.
   *
   * If not specified,  default to use following 3 locations:    1) Authorization: Bearer    2) x
   * -goog-iap-jwt-assertion    3) access_token query parameter
   *
   * Default locations can be specified as followings:    jwt_locations:    - header: Authorization
   * value_prefix: "Bearer "    - header: x-goog-iap-jwt-assertion    - query: access_token
   * @return value or {@code null} for none
   */
  public java.util.List<JwtLocation> getJwtLocations() {
    return jwtLocations;
  }

  /**
   * Defines the locations to extract the JWT.
   *
   * JWT locations can be either from HTTP headers or URL query parameters. The rule is that the
   * first match wins. The checking order is: checking all headers first, then URL query parameters.
   *
   * If not specified,  default to use following 3 locations:    1) Authorization: Bearer    2) x
   * -goog-iap-jwt-assertion    3) access_token query parameter
   *
   * Default locations can be specified as followings:    jwt_locations:    - header: Authorization
   * value_prefix: "Bearer "    - header: x-goog-iap-jwt-assertion    - query: access_token
   * @param jwtLocations jwtLocations or {@code null} for none
   */
  public AuthProvider setJwtLocations(java.util.List<JwtLocation> jwtLocations) {
    this.jwtLocations = jwtLocations;
    return this;
  }

  @Override
  public AuthProvider set(String fieldName, Object value) {
    return (AuthProvider) super.set(fieldName, value);
  }

  @Override
  public AuthProvider clone() {
    return (AuthProvider) super.clone();
  }

}
