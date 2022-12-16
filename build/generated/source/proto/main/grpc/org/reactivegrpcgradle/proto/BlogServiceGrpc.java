package org.reactivegrpcgradle.proto;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.47.0)",
    comments = "Source: blog.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class BlogServiceGrpc {

  private BlogServiceGrpc() {}

  public static final String SERVICE_NAME = "org.reactivegrpcgradle.proto.BlogService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<org.reactivegrpcgradle.proto.CreateBlogPostRequest,
      org.reactivegrpcgradle.proto.BlogPost> getCreateBlogPostMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateBlogPost",
      requestType = org.reactivegrpcgradle.proto.CreateBlogPostRequest.class,
      responseType = org.reactivegrpcgradle.proto.BlogPost.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.reactivegrpcgradle.proto.CreateBlogPostRequest,
      org.reactivegrpcgradle.proto.BlogPost> getCreateBlogPostMethod() {
    io.grpc.MethodDescriptor<org.reactivegrpcgradle.proto.CreateBlogPostRequest, org.reactivegrpcgradle.proto.BlogPost> getCreateBlogPostMethod;
    if ((getCreateBlogPostMethod = BlogServiceGrpc.getCreateBlogPostMethod) == null) {
      synchronized (BlogServiceGrpc.class) {
        if ((getCreateBlogPostMethod = BlogServiceGrpc.getCreateBlogPostMethod) == null) {
          BlogServiceGrpc.getCreateBlogPostMethod = getCreateBlogPostMethod =
              io.grpc.MethodDescriptor.<org.reactivegrpcgradle.proto.CreateBlogPostRequest, org.reactivegrpcgradle.proto.BlogPost>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateBlogPost"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.reactivegrpcgradle.proto.CreateBlogPostRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.reactivegrpcgradle.proto.BlogPost.getDefaultInstance()))
              .setSchemaDescriptor(new BlogServiceMethodDescriptorSupplier("CreateBlogPost"))
              .build();
        }
      }
    }
    return getCreateBlogPostMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.reactivegrpcgradle.proto.GetBlogPostRequest,
      org.reactivegrpcgradle.proto.BlogPost> getGetBlogPostMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetBlogPost",
      requestType = org.reactivegrpcgradle.proto.GetBlogPostRequest.class,
      responseType = org.reactivegrpcgradle.proto.BlogPost.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.reactivegrpcgradle.proto.GetBlogPostRequest,
      org.reactivegrpcgradle.proto.BlogPost> getGetBlogPostMethod() {
    io.grpc.MethodDescriptor<org.reactivegrpcgradle.proto.GetBlogPostRequest, org.reactivegrpcgradle.proto.BlogPost> getGetBlogPostMethod;
    if ((getGetBlogPostMethod = BlogServiceGrpc.getGetBlogPostMethod) == null) {
      synchronized (BlogServiceGrpc.class) {
        if ((getGetBlogPostMethod = BlogServiceGrpc.getGetBlogPostMethod) == null) {
          BlogServiceGrpc.getGetBlogPostMethod = getGetBlogPostMethod =
              io.grpc.MethodDescriptor.<org.reactivegrpcgradle.proto.GetBlogPostRequest, org.reactivegrpcgradle.proto.BlogPost>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetBlogPost"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.reactivegrpcgradle.proto.GetBlogPostRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.reactivegrpcgradle.proto.BlogPost.getDefaultInstance()))
              .setSchemaDescriptor(new BlogServiceMethodDescriptorSupplier("GetBlogPost"))
              .build();
        }
      }
    }
    return getGetBlogPostMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.reactivegrpcgradle.proto.ListBlogPostsRequest,
      org.reactivegrpcgradle.proto.ListBlogPostsResponse> getListBlogPostsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListBlogPosts",
      requestType = org.reactivegrpcgradle.proto.ListBlogPostsRequest.class,
      responseType = org.reactivegrpcgradle.proto.ListBlogPostsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.reactivegrpcgradle.proto.ListBlogPostsRequest,
      org.reactivegrpcgradle.proto.ListBlogPostsResponse> getListBlogPostsMethod() {
    io.grpc.MethodDescriptor<org.reactivegrpcgradle.proto.ListBlogPostsRequest, org.reactivegrpcgradle.proto.ListBlogPostsResponse> getListBlogPostsMethod;
    if ((getListBlogPostsMethod = BlogServiceGrpc.getListBlogPostsMethod) == null) {
      synchronized (BlogServiceGrpc.class) {
        if ((getListBlogPostsMethod = BlogServiceGrpc.getListBlogPostsMethod) == null) {
          BlogServiceGrpc.getListBlogPostsMethod = getListBlogPostsMethod =
              io.grpc.MethodDescriptor.<org.reactivegrpcgradle.proto.ListBlogPostsRequest, org.reactivegrpcgradle.proto.ListBlogPostsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListBlogPosts"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.reactivegrpcgradle.proto.ListBlogPostsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.reactivegrpcgradle.proto.ListBlogPostsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new BlogServiceMethodDescriptorSupplier("ListBlogPosts"))
              .build();
        }
      }
    }
    return getListBlogPostsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.reactivegrpcgradle.proto.UpdateBlogPostRequest,
      org.reactivegrpcgradle.proto.BlogPost> getUpdateBlogPostMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateBlogPost",
      requestType = org.reactivegrpcgradle.proto.UpdateBlogPostRequest.class,
      responseType = org.reactivegrpcgradle.proto.BlogPost.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.reactivegrpcgradle.proto.UpdateBlogPostRequest,
      org.reactivegrpcgradle.proto.BlogPost> getUpdateBlogPostMethod() {
    io.grpc.MethodDescriptor<org.reactivegrpcgradle.proto.UpdateBlogPostRequest, org.reactivegrpcgradle.proto.BlogPost> getUpdateBlogPostMethod;
    if ((getUpdateBlogPostMethod = BlogServiceGrpc.getUpdateBlogPostMethod) == null) {
      synchronized (BlogServiceGrpc.class) {
        if ((getUpdateBlogPostMethod = BlogServiceGrpc.getUpdateBlogPostMethod) == null) {
          BlogServiceGrpc.getUpdateBlogPostMethod = getUpdateBlogPostMethod =
              io.grpc.MethodDescriptor.<org.reactivegrpcgradle.proto.UpdateBlogPostRequest, org.reactivegrpcgradle.proto.BlogPost>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateBlogPost"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.reactivegrpcgradle.proto.UpdateBlogPostRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.reactivegrpcgradle.proto.BlogPost.getDefaultInstance()))
              .setSchemaDescriptor(new BlogServiceMethodDescriptorSupplier("UpdateBlogPost"))
              .build();
        }
      }
    }
    return getUpdateBlogPostMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.reactivegrpcgradle.proto.DeleteBlogPostRequest,
      com.google.protobuf.Empty> getDeleteBlogPostMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteBlogPost",
      requestType = org.reactivegrpcgradle.proto.DeleteBlogPostRequest.class,
      responseType = com.google.protobuf.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.reactivegrpcgradle.proto.DeleteBlogPostRequest,
      com.google.protobuf.Empty> getDeleteBlogPostMethod() {
    io.grpc.MethodDescriptor<org.reactivegrpcgradle.proto.DeleteBlogPostRequest, com.google.protobuf.Empty> getDeleteBlogPostMethod;
    if ((getDeleteBlogPostMethod = BlogServiceGrpc.getDeleteBlogPostMethod) == null) {
      synchronized (BlogServiceGrpc.class) {
        if ((getDeleteBlogPostMethod = BlogServiceGrpc.getDeleteBlogPostMethod) == null) {
          BlogServiceGrpc.getDeleteBlogPostMethod = getDeleteBlogPostMethod =
              io.grpc.MethodDescriptor.<org.reactivegrpcgradle.proto.DeleteBlogPostRequest, com.google.protobuf.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteBlogPost"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.reactivegrpcgradle.proto.DeleteBlogPostRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setSchemaDescriptor(new BlogServiceMethodDescriptorSupplier("DeleteBlogPost"))
              .build();
        }
      }
    }
    return getDeleteBlogPostMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static BlogServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<BlogServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<BlogServiceStub>() {
        @java.lang.Override
        public BlogServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new BlogServiceStub(channel, callOptions);
        }
      };
    return BlogServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static BlogServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<BlogServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<BlogServiceBlockingStub>() {
        @java.lang.Override
        public BlogServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new BlogServiceBlockingStub(channel, callOptions);
        }
      };
    return BlogServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static BlogServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<BlogServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<BlogServiceFutureStub>() {
        @java.lang.Override
        public BlogServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new BlogServiceFutureStub(channel, callOptions);
        }
      };
    return BlogServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class BlogServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void createBlogPost(org.reactivegrpcgradle.proto.CreateBlogPostRequest request,
        io.grpc.stub.StreamObserver<org.reactivegrpcgradle.proto.BlogPost> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateBlogPostMethod(), responseObserver);
    }

    /**
     */
    public void getBlogPost(org.reactivegrpcgradle.proto.GetBlogPostRequest request,
        io.grpc.stub.StreamObserver<org.reactivegrpcgradle.proto.BlogPost> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetBlogPostMethod(), responseObserver);
    }

    /**
     */
    public void listBlogPosts(org.reactivegrpcgradle.proto.ListBlogPostsRequest request,
        io.grpc.stub.StreamObserver<org.reactivegrpcgradle.proto.ListBlogPostsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListBlogPostsMethod(), responseObserver);
    }

    /**
     */
    public void updateBlogPost(org.reactivegrpcgradle.proto.UpdateBlogPostRequest request,
        io.grpc.stub.StreamObserver<org.reactivegrpcgradle.proto.BlogPost> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateBlogPostMethod(), responseObserver);
    }

    /**
     */
    public void deleteBlogPost(org.reactivegrpcgradle.proto.DeleteBlogPostRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteBlogPostMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getCreateBlogPostMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                org.reactivegrpcgradle.proto.CreateBlogPostRequest,
                org.reactivegrpcgradle.proto.BlogPost>(
                  this, METHODID_CREATE_BLOG_POST)))
          .addMethod(
            getGetBlogPostMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                org.reactivegrpcgradle.proto.GetBlogPostRequest,
                org.reactivegrpcgradle.proto.BlogPost>(
                  this, METHODID_GET_BLOG_POST)))
          .addMethod(
            getListBlogPostsMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                org.reactivegrpcgradle.proto.ListBlogPostsRequest,
                org.reactivegrpcgradle.proto.ListBlogPostsResponse>(
                  this, METHODID_LIST_BLOG_POSTS)))
          .addMethod(
            getUpdateBlogPostMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                org.reactivegrpcgradle.proto.UpdateBlogPostRequest,
                org.reactivegrpcgradle.proto.BlogPost>(
                  this, METHODID_UPDATE_BLOG_POST)))
          .addMethod(
            getDeleteBlogPostMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                org.reactivegrpcgradle.proto.DeleteBlogPostRequest,
                com.google.protobuf.Empty>(
                  this, METHODID_DELETE_BLOG_POST)))
          .build();
    }
  }

  /**
   */
  public static final class BlogServiceStub extends io.grpc.stub.AbstractAsyncStub<BlogServiceStub> {
    private BlogServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected BlogServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new BlogServiceStub(channel, callOptions);
    }

    /**
     */
    public void createBlogPost(org.reactivegrpcgradle.proto.CreateBlogPostRequest request,
        io.grpc.stub.StreamObserver<org.reactivegrpcgradle.proto.BlogPost> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateBlogPostMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getBlogPost(org.reactivegrpcgradle.proto.GetBlogPostRequest request,
        io.grpc.stub.StreamObserver<org.reactivegrpcgradle.proto.BlogPost> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetBlogPostMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void listBlogPosts(org.reactivegrpcgradle.proto.ListBlogPostsRequest request,
        io.grpc.stub.StreamObserver<org.reactivegrpcgradle.proto.ListBlogPostsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListBlogPostsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void updateBlogPost(org.reactivegrpcgradle.proto.UpdateBlogPostRequest request,
        io.grpc.stub.StreamObserver<org.reactivegrpcgradle.proto.BlogPost> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateBlogPostMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void deleteBlogPost(org.reactivegrpcgradle.proto.DeleteBlogPostRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteBlogPostMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class BlogServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<BlogServiceBlockingStub> {
    private BlogServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected BlogServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new BlogServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public org.reactivegrpcgradle.proto.BlogPost createBlogPost(org.reactivegrpcgradle.proto.CreateBlogPostRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateBlogPostMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.reactivegrpcgradle.proto.BlogPost getBlogPost(org.reactivegrpcgradle.proto.GetBlogPostRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetBlogPostMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.reactivegrpcgradle.proto.ListBlogPostsResponse listBlogPosts(org.reactivegrpcgradle.proto.ListBlogPostsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListBlogPostsMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.reactivegrpcgradle.proto.BlogPost updateBlogPost(org.reactivegrpcgradle.proto.UpdateBlogPostRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateBlogPostMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.google.protobuf.Empty deleteBlogPost(org.reactivegrpcgradle.proto.DeleteBlogPostRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteBlogPostMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class BlogServiceFutureStub extends io.grpc.stub.AbstractFutureStub<BlogServiceFutureStub> {
    private BlogServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected BlogServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new BlogServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.reactivegrpcgradle.proto.BlogPost> createBlogPost(
        org.reactivegrpcgradle.proto.CreateBlogPostRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateBlogPostMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.reactivegrpcgradle.proto.BlogPost> getBlogPost(
        org.reactivegrpcgradle.proto.GetBlogPostRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetBlogPostMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.reactivegrpcgradle.proto.ListBlogPostsResponse> listBlogPosts(
        org.reactivegrpcgradle.proto.ListBlogPostsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListBlogPostsMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.reactivegrpcgradle.proto.BlogPost> updateBlogPost(
        org.reactivegrpcgradle.proto.UpdateBlogPostRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateBlogPostMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> deleteBlogPost(
        org.reactivegrpcgradle.proto.DeleteBlogPostRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteBlogPostMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_CREATE_BLOG_POST = 0;
  private static final int METHODID_GET_BLOG_POST = 1;
  private static final int METHODID_LIST_BLOG_POSTS = 2;
  private static final int METHODID_UPDATE_BLOG_POST = 3;
  private static final int METHODID_DELETE_BLOG_POST = 4;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final BlogServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(BlogServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_CREATE_BLOG_POST:
          serviceImpl.createBlogPost((org.reactivegrpcgradle.proto.CreateBlogPostRequest) request,
              (io.grpc.stub.StreamObserver<org.reactivegrpcgradle.proto.BlogPost>) responseObserver);
          break;
        case METHODID_GET_BLOG_POST:
          serviceImpl.getBlogPost((org.reactivegrpcgradle.proto.GetBlogPostRequest) request,
              (io.grpc.stub.StreamObserver<org.reactivegrpcgradle.proto.BlogPost>) responseObserver);
          break;
        case METHODID_LIST_BLOG_POSTS:
          serviceImpl.listBlogPosts((org.reactivegrpcgradle.proto.ListBlogPostsRequest) request,
              (io.grpc.stub.StreamObserver<org.reactivegrpcgradle.proto.ListBlogPostsResponse>) responseObserver);
          break;
        case METHODID_UPDATE_BLOG_POST:
          serviceImpl.updateBlogPost((org.reactivegrpcgradle.proto.UpdateBlogPostRequest) request,
              (io.grpc.stub.StreamObserver<org.reactivegrpcgradle.proto.BlogPost>) responseObserver);
          break;
        case METHODID_DELETE_BLOG_POST:
          serviceImpl.deleteBlogPost((org.reactivegrpcgradle.proto.DeleteBlogPostRequest) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class BlogServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    BlogServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return org.reactivegrpcgradle.proto.Blog.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("BlogService");
    }
  }

  private static final class BlogServiceFileDescriptorSupplier
      extends BlogServiceBaseDescriptorSupplier {
    BlogServiceFileDescriptorSupplier() {}
  }

  private static final class BlogServiceMethodDescriptorSupplier
      extends BlogServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    BlogServiceMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (BlogServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new BlogServiceFileDescriptorSupplier())
              .addMethod(getCreateBlogPostMethod())
              .addMethod(getGetBlogPostMethod())
              .addMethod(getListBlogPostsMethod())
              .addMethod(getUpdateBlogPostMethod())
              .addMethod(getDeleteBlogPostMethod())
              .build();
        }
      }
    }
    return result;
  }
}
