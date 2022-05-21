/*
 * Gitea API.
 * This documentation describes the Gitea API.
 *
 * OpenAPI spec version: 1.17.0-SNAPSHOT
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
import org.threeten.bp.OffsetDateTime;

/**
 * Cron represents a Cron task
 */
@ApiModel(description = "Cron represents a Cron task")

public class Cron {
  @SerializedName("exec_times")
  private Long execTimes = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("next")
  private OffsetDateTime next = null;

  @SerializedName("prev")
  private OffsetDateTime prev = null;

  @SerializedName("schedule")
  private String schedule = null;

  public Cron execTimes(Long execTimes) {
    this.execTimes = execTimes;
    return this;
  }

   /**
   * Get execTimes
   * @return execTimes
  **/
  @ApiModelProperty(value = "")
  public Long getExecTimes() {
    return execTimes;
  }

  public void setExecTimes(Long execTimes) {
    this.execTimes = execTimes;
  }

  public Cron name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @ApiModelProperty(value = "")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Cron next(OffsetDateTime next) {
    this.next = next;
    return this;
  }

   /**
   * Get next
   * @return next
  **/
  @ApiModelProperty(value = "")
  public OffsetDateTime getNext() {
    return next;
  }

  public void setNext(OffsetDateTime next) {
    this.next = next;
  }

  public Cron prev(OffsetDateTime prev) {
    this.prev = prev;
    return this;
  }

   /**
   * Get prev
   * @return prev
  **/
  @ApiModelProperty(value = "")
  public OffsetDateTime getPrev() {
    return prev;
  }

  public void setPrev(OffsetDateTime prev) {
    this.prev = prev;
  }

  public Cron schedule(String schedule) {
    this.schedule = schedule;
    return this;
  }

   /**
   * Get schedule
   * @return schedule
  **/
  @ApiModelProperty(value = "")
  public String getSchedule() {
    return schedule;
  }

  public void setSchedule(String schedule) {
    this.schedule = schedule;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Cron cron = (Cron) o;
    return Objects.equals(this.execTimes, cron.execTimes) &&
        Objects.equals(this.name, cron.name) &&
        Objects.equals(this.next, cron.next) &&
        Objects.equals(this.prev, cron.prev) &&
        Objects.equals(this.schedule, cron.schedule);
  }

  @Override
  public int hashCode() {
    return Objects.hash(execTimes, name, next, prev, schedule);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Cron {\n");
    
    sb.append("    execTimes: ").append(toIndentedString(execTimes)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    next: ").append(toIndentedString(next)).append("\n");
    sb.append("    prev: ").append(toIndentedString(prev)).append("\n");
    sb.append("    schedule: ").append(toIndentedString(schedule)).append("\n");
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

