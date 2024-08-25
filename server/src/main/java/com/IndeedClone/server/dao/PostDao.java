package com.IndeedClone.server.dao;

import com.IndeedClone.server.model.PostModel;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface PostDao extends MongoRepository<PostModel, String> {
}
