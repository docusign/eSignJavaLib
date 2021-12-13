package com.docusign.esign.model;

import java.util.Objects;
import java.util.Arrays;
import com.docusign.esign.model.ScheduledSendingApiModel;
import com.docusign.esign.model.WorkflowStep;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * Workflow.
 *
 */

public class Workflow {
  @JsonProperty("currentWorkflowStepId")
  private String currentWorkflowStepId = null;

  @JsonProperty("resumeDate")
  private String resumeDate = null;

  @JsonProperty("scheduledSending")
  private ScheduledSendingApiModel scheduledSending = null;

  @JsonProperty("workflowStatus")
  private String workflowStatus = null;

  @JsonProperty("workflowSteps")
  private java.util.List<WorkflowStep> workflowSteps = null;


  /**
   * currentWorkflowStepId.
   *
   * @return Workflow
   **/
  public Workflow currentWorkflowStepId(String currentWorkflowStepId) {
    this.currentWorkflowStepId = currentWorkflowStepId;
    return this;
  }

  /**
   * .
   * @return currentWorkflowStepId
   **/
  @ApiModelProperty(value = "")
  public String getCurrentWorkflowStepId() {
    return currentWorkflowStepId;
  }

  /**
   * setCurrentWorkflowStepId.
   **/
  public void setCurrentWorkflowStepId(String currentWorkflowStepId) {
    this.currentWorkflowStepId = currentWorkflowStepId;
  }


  /**
   * resumeDate.
   *
   * @return Workflow
   **/
  public Workflow resumeDate(String resumeDate) {
    this.resumeDate = resumeDate;
    return this;
  }

  /**
   * .
   * @return resumeDate
   **/
  @ApiModelProperty(value = "")
  public String getResumeDate() {
    return resumeDate;
  }

  /**
   * setResumeDate.
   **/
  public void setResumeDate(String resumeDate) {
    this.resumeDate = resumeDate;
  }


  /**
   * scheduledSending.
   *
   * @return Workflow
   **/
  public Workflow scheduledSending(ScheduledSendingApiModel scheduledSending) {
    this.scheduledSending = scheduledSending;
    return this;
  }

  /**
   * Get scheduledSending.
   * @return scheduledSending
   **/
  @ApiModelProperty(value = "")
  public ScheduledSendingApiModel getScheduledSending() {
    return scheduledSending;
  }

  /**
   * setScheduledSending.
   **/
  public void setScheduledSending(ScheduledSendingApiModel scheduledSending) {
    this.scheduledSending = scheduledSending;
  }


  /**
   * workflowStatus.
   *
   * @return Workflow
   **/
  public Workflow workflowStatus(String workflowStatus) {
    this.workflowStatus = workflowStatus;
    return this;
  }

  /**
   * .
   * @return workflowStatus
   **/
  @ApiModelProperty(value = "")
  public String getWorkflowStatus() {
    return workflowStatus;
  }

  /**
   * setWorkflowStatus.
   **/
  public void setWorkflowStatus(String workflowStatus) {
    this.workflowStatus = workflowStatus;
  }


  /**
   * workflowSteps.
   *
   * @return Workflow
   **/
  public Workflow workflowSteps(java.util.List<WorkflowStep> workflowSteps) {
    this.workflowSteps = workflowSteps;
    return this;
  }
  
  /**
   * addWorkflowStepsItem.
   *
   * @return Workflow
   **/
  public Workflow addWorkflowStepsItem(WorkflowStep workflowStepsItem) {
    if (this.workflowSteps == null) {
      this.workflowSteps = new java.util.ArrayList<WorkflowStep>();
    }
    this.workflowSteps.add(workflowStepsItem);
    return this;
  }

  /**
   * .
   * @return workflowSteps
   **/
  @ApiModelProperty(value = "")
  public java.util.List<WorkflowStep> getWorkflowSteps() {
    return workflowSteps;
  }

  /**
   * setWorkflowSteps.
   **/
  public void setWorkflowSteps(java.util.List<WorkflowStep> workflowSteps) {
    this.workflowSteps = workflowSteps;
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
    Workflow workflow = (Workflow) o;
    return Objects.equals(this.currentWorkflowStepId, workflow.currentWorkflowStepId) &&
        Objects.equals(this.resumeDate, workflow.resumeDate) &&
        Objects.equals(this.scheduledSending, workflow.scheduledSending) &&
        Objects.equals(this.workflowStatus, workflow.workflowStatus) &&
        Objects.equals(this.workflowSteps, workflow.workflowSteps);
  }

  /**
   * Returns the HashCode.
   */
  @Override
  public int hashCode() {
    return Objects.hash(currentWorkflowStepId, resumeDate, scheduledSending, workflowStatus, workflowSteps);
  }


  /**
   * Converts the given object to string.
   */
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Workflow {\n");
    
    sb.append("    currentWorkflowStepId: ").append(toIndentedString(currentWorkflowStepId)).append("\n");
    sb.append("    resumeDate: ").append(toIndentedString(resumeDate)).append("\n");
    sb.append("    scheduledSending: ").append(toIndentedString(scheduledSending)).append("\n");
    sb.append("    workflowStatus: ").append(toIndentedString(workflowStatus)).append("\n");
    sb.append("    workflowSteps: ").append(toIndentedString(workflowSteps)).append("\n");
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

