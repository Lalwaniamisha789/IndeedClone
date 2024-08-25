package com.IndeedClone.server.controller;

import com.IndeedClone.server.constants.APIConstants;
import com.IndeedClone.server.dto.PostDTO;
import com.IndeedClone.server.model.PostModel;
import com.IndeedClone.server.service.PostService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@Slf4j
@RequiredArgsConstructor
public class PostController {


    final PostService postService;

//    @GetMapping(APIConstants.GET_ALL_POSTS)
//    public List<PostModel> getAllPosts() {
//        log.info("Getting all the posts #####");
//        return this.postService.getAllPosts();
//    }

    @PostMapping(APIConstants.SAVE_POST)
    public PostModel savePost(@Valid @RequestBody PostDTO postDTORequest) {
        log.info("Saving post #####");
        return this.postService.savePost(postDTORequest);
    }
}