package org.reactivegrpcgradle.repository;

import org.reactivegrpcgradle.model.UserBlog;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;

public interface UserBlogRepository  extends ReactiveCrudRepository<UserBlog, Long> {

}
