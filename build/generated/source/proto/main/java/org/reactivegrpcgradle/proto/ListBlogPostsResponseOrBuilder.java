// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: blog.proto

package org.reactivegrpcgradle.proto;

public interface ListBlogPostsResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:org.reactivegrpcgradle.proto.ListBlogPostsResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>repeated .org.reactivegrpcgradle.proto.BlogPost blogs = 1;</code>
   */
  java.util.List<org.reactivegrpcgradle.proto.BlogPost> 
      getBlogsList();
  /**
   * <code>repeated .org.reactivegrpcgradle.proto.BlogPost blogs = 1;</code>
   */
  org.reactivegrpcgradle.proto.BlogPost getBlogs(int index);
  /**
   * <code>repeated .org.reactivegrpcgradle.proto.BlogPost blogs = 1;</code>
   */
  int getBlogsCount();
  /**
   * <code>repeated .org.reactivegrpcgradle.proto.BlogPost blogs = 1;</code>
   */
  java.util.List<? extends org.reactivegrpcgradle.proto.BlogPostOrBuilder> 
      getBlogsOrBuilderList();
  /**
   * <code>repeated .org.reactivegrpcgradle.proto.BlogPost blogs = 1;</code>
   */
  org.reactivegrpcgradle.proto.BlogPostOrBuilder getBlogsOrBuilder(
      int index);
}
