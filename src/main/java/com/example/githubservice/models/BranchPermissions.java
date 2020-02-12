package com.example.githubservice.models;

import com.fasterxml.jackson.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "required_status_checks",
        "enforce_admins",
        "required_pull_request_reviews",
        "restrictions",
        "required_linear_history",
        "allow_force_pushes",
        "allow_deletions"
})
public class BranchPermissions {

    @JsonProperty("required_status_checks")
    private RequiredStatusChecks requiredStatusChecks;
    @JsonProperty("enforce_admins")
    private Boolean enforceAdmins;
    @JsonProperty("required_pull_request_reviews")
    private RequiredPullRequestReviews requiredPullRequestReviews;
    @JsonProperty("restrictions")
    private Restrictions restrictions;
    @JsonProperty("required_linear_history")
    private Boolean requiredLinearHistory;
    @JsonProperty("allow_force_pushes")
    private Boolean allowForcePushes;
    @JsonProperty("allow_deletions")
    private Boolean allowDeletions;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("required_status_checks")
    public RequiredStatusChecks getRequiredStatusChecks() {
        return requiredStatusChecks;
    }

    @JsonProperty("required_status_checks")
    public void setRequiredStatusChecks(RequiredStatusChecks requiredStatusChecks) {
        this.requiredStatusChecks = requiredStatusChecks;
    }

    @JsonProperty("enforce_admins")
    public Boolean getEnforceAdmins() {
        return enforceAdmins;
    }

    @JsonProperty("enforce_admins")
    public void setEnforceAdmins(Boolean enforceAdmins) {
        this.enforceAdmins = enforceAdmins;
    }

    @JsonProperty("required_pull_request_reviews")
    public RequiredPullRequestReviews getRequiredPullRequestReviews() {
        return requiredPullRequestReviews;
    }

    @JsonProperty("required_pull_request_reviews")
    public void setRequiredPullRequestReviews(RequiredPullRequestReviews requiredPullRequestReviews) {
        this.requiredPullRequestReviews = requiredPullRequestReviews;
    }

    @JsonProperty("restrictions")
    public Restrictions getRestrictions() {
        return restrictions;
    }

    @JsonProperty("restrictions")
    public void setRestrictions(Restrictions restrictions) {
        this.restrictions = restrictions;
    }

    @JsonProperty("required_linear_history")
    public Boolean getRequiredLinearHistory() {
        return requiredLinearHistory;
    }

    @JsonProperty("required_linear_history")
    public void setRequiredLinearHistory(Boolean requiredLinearHistory) {
        this.requiredLinearHistory = requiredLinearHistory;
    }

    @JsonProperty("allow_force_pushes")
    public Boolean getAllowForcePushes() {
        return allowForcePushes;
    }

    @JsonProperty("allow_force_pushes")
    public void setAllowForcePushes(Boolean allowForcePushes) {
        this.allowForcePushes = allowForcePushes;
    }

    @JsonProperty("allow_deletions")
    public Boolean getAllowDeletions() {
        return allowDeletions;
    }

    @JsonProperty("allow_deletions")
    public void setAllowDeletions(Boolean allowDeletions) {
        this.allowDeletions = allowDeletions;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
