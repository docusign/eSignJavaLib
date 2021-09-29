package com.docusign.esign.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * ListItem.
 *
 */

public class ListItem {
  @JsonProperty("selected")
  private String selected = null;

  @JsonProperty("text")
  private String text = null;

  @JsonProperty("value")
  private String value = null;


  /**
   * selected.
   *
   * @return ListItem
   **/
  public ListItem selected(String selected) {
    this.selected = selected;
    return this;
  }

  /**
   * When set to **true**, indicates that this item is the default selection shown to a signer.   Only one selection can be set as the default..
   * @return selected
   **/
  @ApiModelProperty(value = "When set to **true**, indicates that this item is the default selection shown to a signer.   Only one selection can be set as the default.")
  public String getSelected() {
    return selected;
  }

  /**
   * setSelected.
   **/
  public void setSelected(String selected) {
    this.selected = selected;
  }


  /**
   * text.
   *
   * @return ListItem
   **/
  public ListItem text(String text) {
    this.text = text;
    return this;
  }

  /**
   * Specifies the text that is shown in the dropdown list. .
   * @return text
   **/
  @ApiModelProperty(value = "Specifies the text that is shown in the dropdown list. ")
  public String getText() {
    return text;
  }

  /**
   * setText.
   **/
  public void setText(String text) {
    this.text = text;
  }


  /**
   * value.
   *
   * @return ListItem
   **/
  public ListItem value(String value) {
    this.value = value;
    return this;
  }

  /**
   * Specifies the value that is used when the list item is selected..
   * @return value
   **/
  @ApiModelProperty(value = "Specifies the value that is used when the list item is selected.")
  public String getValue() {
    return value;
  }

  /**
   * setValue.
   **/
  public void setValue(String value) {
    this.value = value;
  }


  /**
   * Compares objects.
   *
   * @return true or false depending on comparison result.
   */
  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ListItem listItem = (ListItem) o;
    return Objects.equals(this.selected, listItem.selected) &&
        Objects.equals(this.text, listItem.text) &&
        Objects.equals(this.value, listItem.value);
  }

  /**
   * Returns the HashCode.
   */
  @Override
  public int hashCode() {
    return Objects.hash(selected, text, value);
  }


  /**
   * Converts the given object to string.
   */
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ListItem {\n");
    
    sb.append("    selected: ").append(toIndentedString(selected)).append("\n");
    sb.append("    text: ").append(toIndentedString(text)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
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

