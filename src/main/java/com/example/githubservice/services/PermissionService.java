package com.example.githubservice.services;

import com.example.githubservice.clients.IGithubApi;
import com.example.githubservice.models.BranchPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.util.HashMap;

@Service
public class PermissionService {

    @Autowired
    private IGithubApi githubApi;

    @Value("${github.token.id}")
    private String token;

    public void updatePermissionsSettings(String user, String repo, String branch){
        BranchPermissions branchPermissions = new BranchPermissions();
        branchPermissions.setAllowDeletions(false); // set a permission change

        HashMap<String,Object> map = new HashMap<String,Object>();
        map.put("Accept","application/vnd.github.v3+json");
        map.put("X-GitHub-Media-Type","application/vnd.github.v3+json");
        map.put("Authorization",token);

        githubApi.updateBranchPermissions(map,branchPermissions,repo,branch,user);
    }
}
