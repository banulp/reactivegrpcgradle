package org.reactivegrpcgradle.service;

import org.reactivegrpcgradle.model.UserBlog;
import org.reactivegrpcgradle.proto.BlogPost;
import org.reactivegrpcgradle.proto.CreateBlogPostRequest;
import org.reactivegrpcgradle.proto.ReactorBlogServiceGrpc;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import reactor.core.publisher.Mono;

import java.util.concurrent.atomic.AtomicInteger;

public final class BlogService extends ReactorBlogServiceGrpc.BlogServiceImplBase {

    private static final Logger logger = LoggerFactory.getLogger(BlogService.class);
    private final AtomicInteger idGenerator = new AtomicInteger();
    private UserBlogService userBlogService;
    public void setUserBlogService(UserBlogService userBlogService) {
        this.userBlogService = userBlogService;
    }

    @Override
    public Mono<BlogPost> createBlogPost(Mono<CreateBlogPostRequest> request) {

        System.out.println("[[createBlogPost]]");

//        return request.map(r -> {
//            return userBlogService.save(new UserBlog(idGenerator.getAndIncrement(), r.getTitle(), r.getContent()));
//        }).map(userBlogMono -> {
//            return userBlogMono.map(userBlog -> {
//                return BlogPost.newBuilder()
//                        .setId(userBlog.getId())
//                        .setTitle(userBlog.getTitle())
//                        .setContent(userBlog.getContent())
//                        .build();
//            });
//        }).block();

        return request.map(r -> {
            return userBlogService.save(new UserBlog(idGenerator.getAndIncrement(), r.getTitle(), r.getContent()));
        }).map(userBlogMono -> {
            return userBlogMono.map(userBlog -> {
                return BlogPost.newBuilder()
                        .setId(userBlog.getId())
                        .setTitle(userBlog.getTitle())
                        .setContent(userBlog.getContent())
                        .build();
            });
        }).flatMap(userBlogMono -> userBlogMono);


//        return request.map(r -> {
//            return userBlogService.save(new UserBlog(idGenerator.getAndIncrement(), r.getTitle(), r.getContent())).block();
//        }).map(userBlog -> {
//            return BlogPost.newBuilder()
//                    .setId(userBlog.getId())
//                    .setTitle(userBlog.getTitle())
//                    .setContent(userBlog.getContent())
//                    .build();
//        });
    }


}