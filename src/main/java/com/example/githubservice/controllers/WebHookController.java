package com.example.githubservice.controllers;

import com.example.githubservice.models.CreateHookModel;
import com.example.githubservice.services.PermissionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin
@RestController
public class WebHookController implements IWebHookController<CreateHookModel> {

    @Autowired
    private PermissionService permissionService;

    @Override
    public ResponseEntity createWebHookEvent(CreateHookModel createHookModel) {
       String user = createHookModel.getSender().getLogin();
       String repoName = createHookModel.getRepository().getName();
       String branchName = createHookModel.getMasterBranch();

       permissionService.updatePermissionsSettings(user,repoName,branchName);
       return ResponseEntity.ok().build();
    }
}
