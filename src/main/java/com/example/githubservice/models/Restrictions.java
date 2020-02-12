package com.example.githubservice.models;

import com.fasterxml.jackson.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "users",
        "teams",
        "apps"
})
public class Restrictions {

    @JsonProperty("users")
    private List<String> users = null;
    @JsonProperty("teams")
    private List<String> teams = null;
    @JsonProperty("apps")
    private List<String> apps = null;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("users")
    public List<String> getUsers() {
        return users;
    }

    @JsonProperty("users")
    public void setUsers(List<String> users) {
        this.users = users;
    }

    @JsonProperty("teams")
    public List<String> getTeams() {
        return teams;
    }

    @JsonProperty("teams")
    public void setTeams(List<String> teams) {
        this.teams = teams;
    }

    @JsonProperty("apps")
    public List<String> getApps() {
        return apps;
    }

    @JsonProperty("apps")
    public void setApps(List<String> apps) {
        this.apps = apps;
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
