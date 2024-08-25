package com.IndeedClone.server.service;

import com.IndeedClone.server.dto.PostDTO;
import com.IndeedClone.server.model.PostModel;
import com.IndeedClone.server.dao.PostDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PostServiceImpl implements PostService{

    @Autowired
    PostDao postDao;

    @Override
    public PostModel savePost(PostDTO postDTO){
        PostModel postModel = new PostModel();

        postModel.setProfile(postDTO.getProfile());
        postModel.setType(postDTO.getType());
        postModel.setSalary(postDTO.getSalary());
        postModel.setExperience(postDTO.getExperience());
        postModel.setDescription(postDTO.getDescription());
        postModel.setTechnology(postDTO.getTechnology());

        return postDao.save(postModel);
    }
}

