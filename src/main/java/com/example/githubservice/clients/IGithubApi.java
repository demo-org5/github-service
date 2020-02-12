package com.example.githubservice.clients;

import com.example.githubservice.constants.Contants;
import com.example.githubservice.models.BranchPermissions;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;

import java.util.Map;

@Component
@FeignClient(decode404 = true, name = "GithubApi", url = Contants.GITHUB_ENDPOINT)
public interface IGithubApi {

    //PUT /repos/:owner/:repo/branches/:branch/protection
    @PutMapping(value = "/repos/{ownerName}/repo/{repoName}/branches/{branchName}/protection",
            consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)
    ResponseEntity updateBranchPermissions(
            @RequestHeader(value = "headers") Map<String, Object> headerMap,
            @RequestBody BranchPermissions branchPermissions,
            @PathVariable(value = "repoName") String repoName,
            @PathVariable(value = "branchName") String branchName,
            @PathVariable(value = "ownerName") String ownerName);
}
