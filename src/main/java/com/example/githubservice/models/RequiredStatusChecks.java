package com.example.githubservice.models;

import com.fasterxml.jackson.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "strict",
        "contexts"
})
public class RequiredStatusChecks {

    @JsonProperty("strict")
    private Boolean strict;
    @JsonProperty("contexts")
    private List<String> contexts = null;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("strict")
    public Boolean getStrict() {
        return strict;
    }

    @JsonProperty("strict")
    public void setStrict(Boolean strict) {
        this.strict = strict;
    }

    @JsonProperty("contexts")
    public List<String> getContexts() {
        return contexts;
    }

    @JsonProperty("contexts")
    public void setContexts(List<String> contexts) {
        this.contexts = contexts;
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
