package com.docusign.esign.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * AccountPasswordLockoutDurationType
 */

public class AccountPasswordLockoutDurationType {
  @JsonProperty("options")
  private java.util.List<String> options = null;

  public AccountPasswordLockoutDurationType options(java.util.List<String> options) {
    this.options = options;
    return this;
  }

  public AccountPasswordLockoutDurationType addOptionsItem(String optionsItem) {
    if (this.options == null) {
      this.options = new java.util.ArrayList<String>();
    }
    this.options.add(optionsItem);
    return this;
  }

   /**
   * 
   * @return options
  **/
  @ApiModelProperty(value = "")
  public java.util.List<String> getOptions() {
    return options;
  }

  public void setOptions(java.util.List<String> options) {
    this.options = options;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AccountPasswordLockoutDurationType accountPasswordLockoutDurationType = (AccountPasswordLockoutDurationType) o;
    return Objects.equals(this.options, accountPasswordLockoutDurationType.options);
  }

  @Override
  public int hashCode() {
    return Objects.hash(options);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AccountPasswordLockoutDurationType {\n");
    
    sb.append("    options: ").append(toIndentedString(options)).append("\n");
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

