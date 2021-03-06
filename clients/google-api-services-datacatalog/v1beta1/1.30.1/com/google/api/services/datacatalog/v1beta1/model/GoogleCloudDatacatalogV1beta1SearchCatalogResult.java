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

package com.google.api.services.datacatalog.v1beta1.model;

/**
 * A result that appears in the response of a search request. Each result captures details of one
 * entry that matches the search.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Google Cloud Data Catalog API. For a detailed
 * explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleCloudDatacatalogV1beta1SearchCatalogResult extends com.google.api.client.json.GenericJson {

  /**
   * The full name of the cloud resource the entry belongs to. See:
   * https://cloud.google.com/apis/design/resource_names#full_resource_name. Example:
   *
   *  * `//bigquery.googleapis.com/projects/projectId/datasets/datasetId/tables/tableId`
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String linkedResource;

  /**
   * The relative resource name of the resource in URL format. Examples:
   *
   *  *
   * `projects/{project_id}/locations/{location_id}/entryGroups/{entry_group_id}/entries/{entry_id}`
   * * `projects/{project_id}/tagTemplates/{tag_template_id}`
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String relativeResourceName;

  /**
   * Sub-type of the search result. This is a dot-delimited description of the resource's full type,
   * and is the same as the value callers would provide in the "type" search facet.  Examples:
   * `entry.table`, `entry.dataStream`, `tagTemplate`.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String searchResultSubtype;

  /**
   * Type of the search result. This field can be used to determine which Get method to call to
   * fetch the full resource.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String searchResultType;

  /**
   * The full name of the cloud resource the entry belongs to. See:
   * https://cloud.google.com/apis/design/resource_names#full_resource_name. Example:
   *
   *  * `//bigquery.googleapis.com/projects/projectId/datasets/datasetId/tables/tableId`
   * @return value or {@code null} for none
   */
  public java.lang.String getLinkedResource() {
    return linkedResource;
  }

  /**
   * The full name of the cloud resource the entry belongs to. See:
   * https://cloud.google.com/apis/design/resource_names#full_resource_name. Example:
   *
   *  * `//bigquery.googleapis.com/projects/projectId/datasets/datasetId/tables/tableId`
   * @param linkedResource linkedResource or {@code null} for none
   */
  public GoogleCloudDatacatalogV1beta1SearchCatalogResult setLinkedResource(java.lang.String linkedResource) {
    this.linkedResource = linkedResource;
    return this;
  }

  /**
   * The relative resource name of the resource in URL format. Examples:
   *
   *  *
   * `projects/{project_id}/locations/{location_id}/entryGroups/{entry_group_id}/entries/{entry_id}`
   * * `projects/{project_id}/tagTemplates/{tag_template_id}`
   * @return value or {@code null} for none
   */
  public java.lang.String getRelativeResourceName() {
    return relativeResourceName;
  }

  /**
   * The relative resource name of the resource in URL format. Examples:
   *
   *  *
   * `projects/{project_id}/locations/{location_id}/entryGroups/{entry_group_id}/entries/{entry_id}`
   * * `projects/{project_id}/tagTemplates/{tag_template_id}`
   * @param relativeResourceName relativeResourceName or {@code null} for none
   */
  public GoogleCloudDatacatalogV1beta1SearchCatalogResult setRelativeResourceName(java.lang.String relativeResourceName) {
    this.relativeResourceName = relativeResourceName;
    return this;
  }

  /**
   * Sub-type of the search result. This is a dot-delimited description of the resource's full type,
   * and is the same as the value callers would provide in the "type" search facet.  Examples:
   * `entry.table`, `entry.dataStream`, `tagTemplate`.
   * @return value or {@code null} for none
   */
  public java.lang.String getSearchResultSubtype() {
    return searchResultSubtype;
  }

  /**
   * Sub-type of the search result. This is a dot-delimited description of the resource's full type,
   * and is the same as the value callers would provide in the "type" search facet.  Examples:
   * `entry.table`, `entry.dataStream`, `tagTemplate`.
   * @param searchResultSubtype searchResultSubtype or {@code null} for none
   */
  public GoogleCloudDatacatalogV1beta1SearchCatalogResult setSearchResultSubtype(java.lang.String searchResultSubtype) {
    this.searchResultSubtype = searchResultSubtype;
    return this;
  }

  /**
   * Type of the search result. This field can be used to determine which Get method to call to
   * fetch the full resource.
   * @return value or {@code null} for none
   */
  public java.lang.String getSearchResultType() {
    return searchResultType;
  }

  /**
   * Type of the search result. This field can be used to determine which Get method to call to
   * fetch the full resource.
   * @param searchResultType searchResultType or {@code null} for none
   */
  public GoogleCloudDatacatalogV1beta1SearchCatalogResult setSearchResultType(java.lang.String searchResultType) {
    this.searchResultType = searchResultType;
    return this;
  }

  @Override
  public GoogleCloudDatacatalogV1beta1SearchCatalogResult set(String fieldName, Object value) {
    return (GoogleCloudDatacatalogV1beta1SearchCatalogResult) super.set(fieldName, value);
  }

  @Override
  public GoogleCloudDatacatalogV1beta1SearchCatalogResult clone() {
    return (GoogleCloudDatacatalogV1beta1SearchCatalogResult) super.clone();
  }

}
