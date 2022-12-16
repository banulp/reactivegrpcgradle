package org.reactivegrpcgradle.service;

import org.reactivegrpcgradle.model.UserBlog;
import org.reactivegrpcgradle.repository.UserBlogRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;

@Service
public class UserBlogService {
    @Autowired
    private UserBlogRepository userBlogRepository;

    public Mono<UserBlog> save(UserBlog userBlog) {
        return userBlogRepository.save(userBlog);
    }
}
