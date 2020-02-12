package com.example.githubservice.models;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "ref",
        "ref_type",
        "master_branch",
        "description",
        "pusher_type",
        "repository",
        "sender"
})
public class CreateHookModel {

    @JsonProperty("ref")
    private String ref;
    @JsonProperty("ref_type")
    private String refType;
    @JsonProperty("master_branch")
    private String masterBranch;
    @JsonProperty("description")
    private Object description;
    @JsonProperty("pusher_type")
    private String pusherType;
    @JsonProperty("repository")
    private Repository repository;
    @JsonProperty("sender")
    private Sender sender;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("ref")
    public String getRef() {
        return ref;
    }

    @JsonProperty("ref")
    public void setRef(String ref) {
        this.ref = ref;
    }

    @JsonProperty("ref_type")
    public String getRefType() {
        return refType;
    }

    @JsonProperty("ref_type")
    public void setRefType(String refType) {
        this.refType = refType;
    }

    @JsonProperty("master_branch")
    public String getMasterBranch() {
        return masterBranch;
    }

    @JsonProperty("master_branch")
    public void setMasterBranch(String masterBranch) {
        this.masterBranch = masterBranch;
    }

    @JsonProperty("description")
    public Object getDescription() {
        return description;
    }

    @JsonProperty("description")
    public void setDescription(Object description) {
        this.description = description;
    }

    @JsonProperty("pusher_type")
    public String getPusherType() {
        return pusherType;
    }

    @JsonProperty("pusher_type")
    public void setPusherType(String pusherType) {
        this.pusherType = pusherType;
    }

    @JsonProperty("repository")
    public Repository getRepository() {
        return repository;
    }

    @JsonProperty("repository")
    public void setRepository(Repository repository) {
        this.repository = repository;
    }

    @JsonProperty("sender")
    public Sender getSender() {
        return sender;
    }

    @JsonProperty("sender")
    public void setSender(Sender sender) {
        this.sender = sender;
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
