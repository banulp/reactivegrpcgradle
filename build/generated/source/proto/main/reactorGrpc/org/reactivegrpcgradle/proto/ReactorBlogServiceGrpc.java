package org.reactivegrpcgradle.proto;

import static org.reactivegrpcgradle.proto.BlogServiceGrpc.getServiceDescriptor;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;


@javax.annotation.Generated(
value = "by ReactorGrpc generator",
comments = "Source: blog.proto")
public final class ReactorBlogServiceGrpc {
    private ReactorBlogServiceGrpc() {}

    public static ReactorBlogServiceStub newReactorStub(io.grpc.Channel channel) {
        return new ReactorBlogServiceStub(channel);
    }

    public static final class ReactorBlogServiceStub extends io.grpc.stub.AbstractStub<ReactorBlogServiceStub> {
        private BlogServiceGrpc.BlogServiceStub delegateStub;

        private ReactorBlogServiceStub(io.grpc.Channel channel) {
            super(channel);
            delegateStub = BlogServiceGrpc.newStub(channel);
        }

        private ReactorBlogServiceStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
            super(channel, callOptions);
            delegateStub = BlogServiceGrpc.newStub(channel).build(channel, callOptions);
        }

        @Override
        protected ReactorBlogServiceStub build(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
            return new ReactorBlogServiceStub(channel, callOptions);
        }

        public reactor.core.publisher.Mono<org.reactivegrpcgradle.proto.BlogPost> createBlogPost(reactor.core.publisher.Mono<org.reactivegrpcgradle.proto.CreateBlogPostRequest> reactorRequest) {
            return com.salesforce.reactorgrpc.stub.ClientCalls.oneToOne(reactorRequest, delegateStub::createBlogPost, getCallOptions());
        }

        public reactor.core.publisher.Mono<org.reactivegrpcgradle.proto.BlogPost> getBlogPost(reactor.core.publisher.Mono<org.reactivegrpcgradle.proto.GetBlogPostRequest> reactorRequest) {
            return com.salesforce.reactorgrpc.stub.ClientCalls.oneToOne(reactorRequest, delegateStub::getBlogPost, getCallOptions());
        }

        public reactor.core.publisher.Mono<org.reactivegrpcgradle.proto.ListBlogPostsResponse> listBlogPosts(reactor.core.publisher.Mono<org.reactivegrpcgradle.proto.ListBlogPostsRequest> reactorRequest) {
            return com.salesforce.reactorgrpc.stub.ClientCalls.oneToOne(reactorRequest, delegateStub::listBlogPosts, getCallOptions());
        }

        public reactor.core.publisher.Mono<org.reactivegrpcgradle.proto.BlogPost> updateBlogPost(reactor.core.publisher.Mono<org.reactivegrpcgradle.proto.UpdateBlogPostRequest> reactorRequest) {
            return com.salesforce.reactorgrpc.stub.ClientCalls.oneToOne(reactorRequest, delegateStub::updateBlogPost, getCallOptions());
        }

        public reactor.core.publisher.Mono<com.google.protobuf.Empty> deleteBlogPost(reactor.core.publisher.Mono<org.reactivegrpcgradle.proto.DeleteBlogPostRequest> reactorRequest) {
            return com.salesforce.reactorgrpc.stub.ClientCalls.oneToOne(reactorRequest, delegateStub::deleteBlogPost, getCallOptions());
        }

        public reactor.core.publisher.Mono<org.reactivegrpcgradle.proto.BlogPost> createBlogPost(org.reactivegrpcgradle.proto.CreateBlogPostRequest reactorRequest) {
           return com.salesforce.reactorgrpc.stub.ClientCalls.oneToOne(reactor.core.publisher.Mono.just(reactorRequest), delegateStub::createBlogPost, getCallOptions());
        }

        public reactor.core.publisher.Mono<org.reactivegrpcgradle.proto.BlogPost> getBlogPost(org.reactivegrpcgradle.proto.GetBlogPostRequest reactorRequest) {
           return com.salesforce.reactorgrpc.stub.ClientCalls.oneToOne(reactor.core.publisher.Mono.just(reactorRequest), delegateStub::getBlogPost, getCallOptions());
        }

        public reactor.core.publisher.Mono<org.reactivegrpcgradle.proto.ListBlogPostsResponse> listBlogPosts(org.reactivegrpcgradle.proto.ListBlogPostsRequest reactorRequest) {
           return com.salesforce.reactorgrpc.stub.ClientCalls.oneToOne(reactor.core.publisher.Mono.just(reactorRequest), delegateStub::listBlogPosts, getCallOptions());
        }

        public reactor.core.publisher.Mono<org.reactivegrpcgradle.proto.BlogPost> updateBlogPost(org.reactivegrpcgradle.proto.UpdateBlogPostRequest reactorRequest) {
           return com.salesforce.reactorgrpc.stub.ClientCalls.oneToOne(reactor.core.publisher.Mono.just(reactorRequest), delegateStub::updateBlogPost, getCallOptions());
        }

        public reactor.core.publisher.Mono<com.google.protobuf.Empty> deleteBlogPost(org.reactivegrpcgradle.proto.DeleteBlogPostRequest reactorRequest) {
           return com.salesforce.reactorgrpc.stub.ClientCalls.oneToOne(reactor.core.publisher.Mono.just(reactorRequest), delegateStub::deleteBlogPost, getCallOptions());
        }

    }

    public static abstract class BlogServiceImplBase implements io.grpc.BindableService {

        public reactor.core.publisher.Mono<org.reactivegrpcgradle.proto.BlogPost> createBlogPost(reactor.core.publisher.Mono<org.reactivegrpcgradle.proto.CreateBlogPostRequest> request) {
            throw new io.grpc.StatusRuntimeException(io.grpc.Status.UNIMPLEMENTED);
        }

        public reactor.core.publisher.Mono<org.reactivegrpcgradle.proto.BlogPost> getBlogPost(reactor.core.publisher.Mono<org.reactivegrpcgradle.proto.GetBlogPostRequest> request) {
            throw new io.grpc.StatusRuntimeException(io.grpc.Status.UNIMPLEMENTED);
        }

        public reactor.core.publisher.Mono<org.reactivegrpcgradle.proto.ListBlogPostsResponse> listBlogPosts(reactor.core.publisher.Mono<org.reactivegrpcgradle.proto.ListBlogPostsRequest> request) {
            throw new io.grpc.StatusRuntimeException(io.grpc.Status.UNIMPLEMENTED);
        }

        public reactor.core.publisher.Mono<org.reactivegrpcgradle.proto.BlogPost> updateBlogPost(reactor.core.publisher.Mono<org.reactivegrpcgradle.proto.UpdateBlogPostRequest> request) {
            throw new io.grpc.StatusRuntimeException(io.grpc.Status.UNIMPLEMENTED);
        }

        public reactor.core.publisher.Mono<com.google.protobuf.Empty> deleteBlogPost(reactor.core.publisher.Mono<org.reactivegrpcgradle.proto.DeleteBlogPostRequest> request) {
            throw new io.grpc.StatusRuntimeException(io.grpc.Status.UNIMPLEMENTED);
        }

        @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
            return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
                    .addMethod(
                            org.reactivegrpcgradle.proto.BlogServiceGrpc.getCreateBlogPostMethod(),
                            asyncUnaryCall(
                                    new MethodHandlers<
                                            org.reactivegrpcgradle.proto.CreateBlogPostRequest,
                                            org.reactivegrpcgradle.proto.BlogPost>(
                                            this, METHODID_CREATE_BLOG_POST)))
                    .addMethod(
                            org.reactivegrpcgradle.proto.BlogServiceGrpc.getGetBlogPostMethod(),
                            asyncUnaryCall(
                                    new MethodHandlers<
                                            org.reactivegrpcgradle.proto.GetBlogPostRequest,
                                            org.reactivegrpcgradle.proto.BlogPost>(
                                            this, METHODID_GET_BLOG_POST)))
                    .addMethod(
                            org.reactivegrpcgradle.proto.BlogServiceGrpc.getListBlogPostsMethod(),
                            asyncUnaryCall(
                                    new MethodHandlers<
                                            org.reactivegrpcgradle.proto.ListBlogPostsRequest,
                                            org.reactivegrpcgradle.proto.ListBlogPostsResponse>(
                                            this, METHODID_LIST_BLOG_POSTS)))
                    .addMethod(
                            org.reactivegrpcgradle.proto.BlogServiceGrpc.getUpdateBlogPostMethod(),
                            asyncUnaryCall(
                                    new MethodHandlers<
                                            org.reactivegrpcgradle.proto.UpdateBlogPostRequest,
                                            org.reactivegrpcgradle.proto.BlogPost>(
                                            this, METHODID_UPDATE_BLOG_POST)))
                    .addMethod(
                            org.reactivegrpcgradle.proto.BlogServiceGrpc.getDeleteBlogPostMethod(),
                            asyncUnaryCall(
                                    new MethodHandlers<
                                            org.reactivegrpcgradle.proto.DeleteBlogPostRequest,
                                            com.google.protobuf.Empty>(
                                            this, METHODID_DELETE_BLOG_POST)))
                    .build();
        }

        protected io.grpc.CallOptions getCallOptions(int methodId) {
            return null;
        }

    }

    public static final int METHODID_CREATE_BLOG_POST = 0;
    public static final int METHODID_GET_BLOG_POST = 1;
    public static final int METHODID_LIST_BLOG_POSTS = 2;
    public static final int METHODID_UPDATE_BLOG_POST = 3;
    public static final int METHODID_DELETE_BLOG_POST = 4;

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
                    com.salesforce.reactorgrpc.stub.ServerCalls.oneToOne((org.reactivegrpcgradle.proto.CreateBlogPostRequest) request,
                            (io.grpc.stub.StreamObserver<org.reactivegrpcgradle.proto.BlogPost>) responseObserver,
                            serviceImpl::createBlogPost);
                    break;
                case METHODID_GET_BLOG_POST:
                    com.salesforce.reactorgrpc.stub.ServerCalls.oneToOne((org.reactivegrpcgradle.proto.GetBlogPostRequest) request,
                            (io.grpc.stub.StreamObserver<org.reactivegrpcgradle.proto.BlogPost>) responseObserver,
                            serviceImpl::getBlogPost);
                    break;
                case METHODID_LIST_BLOG_POSTS:
                    com.salesforce.reactorgrpc.stub.ServerCalls.oneToOne((org.reactivegrpcgradle.proto.ListBlogPostsRequest) request,
                            (io.grpc.stub.StreamObserver<org.reactivegrpcgradle.proto.ListBlogPostsResponse>) responseObserver,
                            serviceImpl::listBlogPosts);
                    break;
                case METHODID_UPDATE_BLOG_POST:
                    com.salesforce.reactorgrpc.stub.ServerCalls.oneToOne((org.reactivegrpcgradle.proto.UpdateBlogPostRequest) request,
                            (io.grpc.stub.StreamObserver<org.reactivegrpcgradle.proto.BlogPost>) responseObserver,
                            serviceImpl::updateBlogPost);
                    break;
                case METHODID_DELETE_BLOG_POST:
                    com.salesforce.reactorgrpc.stub.ServerCalls.oneToOne((org.reactivegrpcgradle.proto.DeleteBlogPostRequest) request,
                            (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver,
                            serviceImpl::deleteBlogPost);
                    break;
                default:
                    throw new java.lang.AssertionError();
            }
        }

        @java.lang.Override
        @java.lang.SuppressWarnings("unchecked")
        public io.grpc.stub.StreamObserver<Req> invoke(io.grpc.stub.StreamObserver<Resp> responseObserver) {
            switch (methodId) {
                default:
                    throw new java.lang.AssertionError();
            }
        }
    }

}
