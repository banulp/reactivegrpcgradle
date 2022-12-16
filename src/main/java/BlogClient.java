import com.linecorp.armeria.client.grpc.GrpcClients;
import com.linecorp.armeria.client.logging.LoggingClient;
import io.grpc.StatusRuntimeException;

import org.reactivegrpcgradle.proto.BlogPost;
import org.reactivegrpcgradle.proto.CreateBlogPostRequest;
import org.reactivegrpcgradle.proto.ReactorBlogServiceGrpc;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class BlogClient {
    private static final Logger logger = LoggerFactory.getLogger(BlogClient.class);
    static ReactorBlogServiceGrpc.ReactorBlogServiceStub serviceStub;

    public static void main(String[] args) throws Exception {

        serviceStub = GrpcClients.builder("http://127.0.0.1:8080/")
                .decorator(LoggingClient.newDecorator())  // add this
                .build(ReactorBlogServiceGrpc.ReactorBlogServiceStub.class);

        BlogClient blogClient = new BlogClient();

        // post
        System.out.println("[[ BlogClient ]]");
        blogClient.createBlogPost("first", "banulp is smart.");
        blogClient.createBlogPost("second", "banulp is kind.");
        blogClient.createBlogPost("third", "banulp is holly.");
        blogClient.createBlogPost("fourth", "banulp is good.");
        blogClient.createBlogPost("fifth", "banulp is fair.");

        // get 1
//        System.out.println("hrerererererer of client get");
//        blogClient.getBlogPost(1);

//        // list
//        blogClient.listBlogPosts();
//
//        // update
//        blogClient.updateBlogPost(1, "THE GREAT BANULP", "IS WONDERFUL.");
//        blogClient.getBlogPost(1);
//
//        // make exception
//        blogClient.updateBlogPost(100, "THE GREAT BANULP", "IS WONDERFUL.");
//        blogClient.getBlogPost(100);
//
//        // delete
//        blogClient.deleteBlogPost(2);
//        blogClient.listBlogPosts();
    }

    void createBlogPost(String title, String content) {
        final CreateBlogPostRequest request = CreateBlogPostRequest.newBuilder()
                        .setTitle(title)
                        .setContent(content)
                        .build();
        BlogPost block = serviceStub.createBlogPost(request).block();

        logger.info("[Create response] Id: {} Title: {} Content: {}",
                block.getId(), block.getTitle(), block.getContent());
    }

//    void getBlogPost(int id){
//        final com.banulp.grpc.proto.BlogPost blogPost = client.getBlogPost(com.banulp.grpc.proto.GetBlogPostRequest.newBuilder().setId(id).build());
//        logger.info("[getBlogPost]  Title: {} Content: {}", blogPost.getTitle(), blogPost.getContent());
//    }
//
//    void listBlogPosts() {
//        final com.banulp.grpc.proto.ListBlogPostsResponse
//                response = client.listBlogPosts(com.banulp.grpc.proto.ListBlogPostsRequest.newBuilder().setDescending(false).build());
//
//        final List<com.banulp.grpc.proto.BlogPost> blogs = response.getBlogsList();
//
//        logger.info("[listBlogPosts] blogs: {}", blogs.size());
//
//    }
//
//    void updateBlogPost(Integer id, String newTitle, String newContent){
//        final com.banulp.grpc.proto.UpdateBlogPostRequest request = com.banulp.grpc.proto.UpdateBlogPostRequest.newBuilder()
//                .setId(id)
//                .setTitle(newTitle)
//                .setContent(newContent)
//                .build();
//        final com.banulp.grpc.proto.BlogPost updated = client.updateBlogPost(request);
//
//        logger.info("[updateBlogPost] updated: {}", updated.getTitle(), updated.getContent());
//    }
//
//    void deleteBlogPost(int id) {
//        final com.banulp.grpc.proto.DeleteBlogPostRequest request = com.banulp.grpc.proto.DeleteBlogPostRequest.newBuilder().setId(id).build();
//        try {
//            client.deleteBlogPost(request);
//        } catch (StatusRuntimeException statusException) {
//            // Handle exception
//        }
//    }

}
