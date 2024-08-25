package com.IndeedClone.server.service;

import com.IndeedClone.server.dto.PostDTO;
import com.IndeedClone.server.model.PostModel;

public interface PostService {

//    public List<PostModel> getAllPosts();

    public PostModel savePost(PostDTO post);
}