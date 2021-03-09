/*
 * Gitea API.
 * This documentation describes the Gitea API.
 *
 * OpenAPI spec version: 1.1.1
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package io.gitea.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * MigrateRepoOptions options for migrating repository&#39;s this is used to interact with api v1
 */
@ApiModel(description = "MigrateRepoOptions options for migrating repository's this is used to interact with api v1")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2021-03-09T09:42:23.110Z")
public class MigrateRepoOptions {
  @SerializedName("auth_password")
  private String authPassword = null;

  @SerializedName("auth_token")
  private String authToken = null;

  @SerializedName("auth_username")
  private String authUsername = null;

  @SerializedName("clone_addr")
  private String cloneAddr = null;

  @SerializedName("description")
  private String description = null;

  @SerializedName("issues")
  private Boolean issues = null;

  @SerializedName("labels")
  private Boolean labels = null;

  @SerializedName("milestones")
  private Boolean milestones = null;

  @SerializedName("mirror")
  private Boolean mirror = null;

  @SerializedName("private")
  private Boolean _private = null;

  @SerializedName("pull_requests")
  private Boolean pullRequests = null;

  @SerializedName("releases")
  private Boolean releases = null;

  @SerializedName("repo_name")
  private String repoName = null;

  @SerializedName("repo_owner")
  private String repoOwner = null;

  /**
   * Gets or Sets service
   */
  @JsonAdapter(ServiceEnum.Adapter.class)
  public enum ServiceEnum {
    GIT("git"),
    
    GITHUB("github"),
    
    GITEA("gitea"),
    
    GITLAB("gitlab");

    private String value;

    ServiceEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static ServiceEnum fromValue(String text) {
      for (ServiceEnum b : ServiceEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<ServiceEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final ServiceEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public ServiceEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return ServiceEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("service")
  private ServiceEnum service = null;

  @SerializedName("uid")
  private Long uid = null;

  @SerializedName("wiki")
  private Boolean wiki = null;

  public MigrateRepoOptions authPassword(String authPassword) {
    this.authPassword = authPassword;
    return this;
  }

   /**
   * Get authPassword
   * @return authPassword
  **/
  @ApiModelProperty(value = "")
  public String getAuthPassword() {
    return authPassword;
  }

  public void setAuthPassword(String authPassword) {
    this.authPassword = authPassword;
  }

  public MigrateRepoOptions authToken(String authToken) {
    this.authToken = authToken;
    return this;
  }

   /**
   * Get authToken
   * @return authToken
  **/
  @ApiModelProperty(value = "")
  public String getAuthToken() {
    return authToken;
  }

  public void setAuthToken(String authToken) {
    this.authToken = authToken;
  }

  public MigrateRepoOptions authUsername(String authUsername) {
    this.authUsername = authUsername;
    return this;
  }

   /**
   * Get authUsername
   * @return authUsername
  **/
  @ApiModelProperty(value = "")
  public String getAuthUsername() {
    return authUsername;
  }

  public void setAuthUsername(String authUsername) {
    this.authUsername = authUsername;
  }

  public MigrateRepoOptions cloneAddr(String cloneAddr) {
    this.cloneAddr = cloneAddr;
    return this;
  }

   /**
   * Get cloneAddr
   * @return cloneAddr
  **/
  @ApiModelProperty(required = true, value = "")
  public String getCloneAddr() {
    return cloneAddr;
  }

  public void setCloneAddr(String cloneAddr) {
    this.cloneAddr = cloneAddr;
  }

  public MigrateRepoOptions description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Get description
   * @return description
  **/
  @ApiModelProperty(value = "")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public MigrateRepoOptions issues(Boolean issues) {
    this.issues = issues;
    return this;
  }

   /**
   * Get issues
   * @return issues
  **/
  @ApiModelProperty(value = "")
  public Boolean isIssues() {
    return issues;
  }

  public void setIssues(Boolean issues) {
    this.issues = issues;
  }

  public MigrateRepoOptions labels(Boolean labels) {
    this.labels = labels;
    return this;
  }

   /**
   * Get labels
   * @return labels
  **/
  @ApiModelProperty(value = "")
  public Boolean isLabels() {
    return labels;
  }

  public void setLabels(Boolean labels) {
    this.labels = labels;
  }

  public MigrateRepoOptions milestones(Boolean milestones) {
    this.milestones = milestones;
    return this;
  }

   /**
   * Get milestones
   * @return milestones
  **/
  @ApiModelProperty(value = "")
  public Boolean isMilestones() {
    return milestones;
  }

  public void setMilestones(Boolean milestones) {
    this.milestones = milestones;
  }

  public MigrateRepoOptions mirror(Boolean mirror) {
    this.mirror = mirror;
    return this;
  }

   /**
   * Get mirror
   * @return mirror
  **/
  @ApiModelProperty(value = "")
  public Boolean isMirror() {
    return mirror;
  }

  public void setMirror(Boolean mirror) {
    this.mirror = mirror;
  }

  public MigrateRepoOptions _private(Boolean _private) {
    this._private = _private;
    return this;
  }

   /**
   * Get _private
   * @return _private
  **/
  @ApiModelProperty(value = "")
  public Boolean isPrivate() {
    return _private;
  }

  public void setPrivate(Boolean _private) {
    this._private = _private;
  }

  public MigrateRepoOptions pullRequests(Boolean pullRequests) {
    this.pullRequests = pullRequests;
    return this;
  }

   /**
   * Get pullRequests
   * @return pullRequests
  **/
  @ApiModelProperty(value = "")
  public Boolean isPullRequests() {
    return pullRequests;
  }

  public void setPullRequests(Boolean pullRequests) {
    this.pullRequests = pullRequests;
  }

  public MigrateRepoOptions releases(Boolean releases) {
    this.releases = releases;
    return this;
  }

   /**
   * Get releases
   * @return releases
  **/
  @ApiModelProperty(value = "")
  public Boolean isReleases() {
    return releases;
  }

  public void setReleases(Boolean releases) {
    this.releases = releases;
  }

  public MigrateRepoOptions repoName(String repoName) {
    this.repoName = repoName;
    return this;
  }

   /**
   * Get repoName
   * @return repoName
  **/
  @ApiModelProperty(required = true, value = "")
  public String getRepoName() {
    return repoName;
  }

  public void setRepoName(String repoName) {
    this.repoName = repoName;
  }

  public MigrateRepoOptions repoOwner(String repoOwner) {
    this.repoOwner = repoOwner;
    return this;
  }

   /**
   * Name of User or Organisation who will own Repo after migration
   * @return repoOwner
  **/
  @ApiModelProperty(value = "Name of User or Organisation who will own Repo after migration")
  public String getRepoOwner() {
    return repoOwner;
  }

  public void setRepoOwner(String repoOwner) {
    this.repoOwner = repoOwner;
  }

  public MigrateRepoOptions service(ServiceEnum service) {
    this.service = service;
    return this;
  }

   /**
   * Get service
   * @return service
  **/
  @ApiModelProperty(value = "")
  public ServiceEnum getService() {
    return service;
  }

  public void setService(ServiceEnum service) {
    this.service = service;
  }

  public MigrateRepoOptions uid(Long uid) {
    this.uid = uid;
    return this;
  }

   /**
   * deprecated (only for backwards compatibility)
   * @return uid
  **/
  @ApiModelProperty(value = "deprecated (only for backwards compatibility)")
  public Long getUid() {
    return uid;
  }

  public void setUid(Long uid) {
    this.uid = uid;
  }

  public MigrateRepoOptions wiki(Boolean wiki) {
    this.wiki = wiki;
    return this;
  }

   /**
   * Get wiki
   * @return wiki
  **/
  @ApiModelProperty(value = "")
  public Boolean isWiki() {
    return wiki;
  }

  public void setWiki(Boolean wiki) {
    this.wiki = wiki;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MigrateRepoOptions migrateRepoOptions = (MigrateRepoOptions) o;
    return Objects.equals(this.authPassword, migrateRepoOptions.authPassword) &&
        Objects.equals(this.authToken, migrateRepoOptions.authToken) &&
        Objects.equals(this.authUsername, migrateRepoOptions.authUsername) &&
        Objects.equals(this.cloneAddr, migrateRepoOptions.cloneAddr) &&
        Objects.equals(this.description, migrateRepoOptions.description) &&
        Objects.equals(this.issues, migrateRepoOptions.issues) &&
        Objects.equals(this.labels, migrateRepoOptions.labels) &&
        Objects.equals(this.milestones, migrateRepoOptions.milestones) &&
        Objects.equals(this.mirror, migrateRepoOptions.mirror) &&
        Objects.equals(this._private, migrateRepoOptions._private) &&
        Objects.equals(this.pullRequests, migrateRepoOptions.pullRequests) &&
        Objects.equals(this.releases, migrateRepoOptions.releases) &&
        Objects.equals(this.repoName, migrateRepoOptions.repoName) &&
        Objects.equals(this.repoOwner, migrateRepoOptions.repoOwner) &&
        Objects.equals(this.service, migrateRepoOptions.service) &&
        Objects.equals(this.uid, migrateRepoOptions.uid) &&
        Objects.equals(this.wiki, migrateRepoOptions.wiki);
  }

  @Override
  public int hashCode() {
    return Objects.hash(authPassword, authToken, authUsername, cloneAddr, description, issues, labels, milestones, mirror, _private, pullRequests, releases, repoName, repoOwner, service, uid, wiki);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MigrateRepoOptions {\n");
    
    sb.append("    authPassword: ").append(toIndentedString(authPassword)).append("\n");
    sb.append("    authToken: ").append(toIndentedString(authToken)).append("\n");
    sb.append("    authUsername: ").append(toIndentedString(authUsername)).append("\n");
    sb.append("    cloneAddr: ").append(toIndentedString(cloneAddr)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    issues: ").append(toIndentedString(issues)).append("\n");
    sb.append("    labels: ").append(toIndentedString(labels)).append("\n");
    sb.append("    milestones: ").append(toIndentedString(milestones)).append("\n");
    sb.append("    mirror: ").append(toIndentedString(mirror)).append("\n");
    sb.append("    _private: ").append(toIndentedString(_private)).append("\n");
    sb.append("    pullRequests: ").append(toIndentedString(pullRequests)).append("\n");
    sb.append("    releases: ").append(toIndentedString(releases)).append("\n");
    sb.append("    repoName: ").append(toIndentedString(repoName)).append("\n");
    sb.append("    repoOwner: ").append(toIndentedString(repoOwner)).append("\n");
    sb.append("    service: ").append(toIndentedString(service)).append("\n");
    sb.append("    uid: ").append(toIndentedString(uid)).append("\n");
    sb.append("    wiki: ").append(toIndentedString(wiki)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

