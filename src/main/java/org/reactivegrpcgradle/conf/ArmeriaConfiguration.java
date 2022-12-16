package org.reactivegrpcgradle.conf;

import com.linecorp.armeria.server.Server;
import com.linecorp.armeria.server.docs.DocService;
import com.linecorp.armeria.server.grpc.GrpcService;
import com.linecorp.armeria.server.logging.AccessLogWriter;
import com.linecorp.armeria.server.logging.LoggingService;
import com.linecorp.armeria.spring.ArmeriaServerConfigurator;
import org.reactivegrpcgradle.exeption.GrpcExceptionHandler;
import org.reactivegrpcgradle.service.BlogService;
import org.reactivegrpcgradle.service.UserBlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * An example of a configuration which provides beans for customizing the server and client.
 */
@Configuration
public class ArmeriaConfiguration {

//    @Autowired
//    private UserBlogRepository userBlogRepository;

    @Autowired
    private UserBlogService userBlogService;
    /**
     * A user can configure a {@link Server} by providing an {@link ArmeriaServerConfigurator} bean.
     */
    @Bean
    public ArmeriaServerConfigurator armeriaServerConfigurator() {
        // Customize the server using the given ServerBuilder. For example:
        return builder -> {
            // Add DocService that enables you to send Thrift and gRPC requests from web browser.
            builder.serviceUnder("/docs", new DocService());

            // Log every message which the server receives and responds.
            builder.decorator(LoggingService.newDecorator());

            // Write access log after completing a request.
            builder.accessLogWriter(AccessLogWriter.combined(), false);

            // You can also bind annotated HTTP services and asynchronous RPC services such as Thrift and gRPC:
            // builder.annotatedService("/rest", service);
            // builder.service("/thrift", THttpService.of(...));
            // builder.service(GrpcService.builder()...build());

            BlogService blogService = new BlogService();
            blogService.setUserBlogService(userBlogService);

            GrpcService grpcService = GrpcService.builder()
//                    .addService(new BlogService())
                    .addService(blogService)
                    .exceptionMapping(new GrpcExceptionHandler())
                    // All service methods will be run within
                    // the blocking executor.
                    // 이러면 grpc 쓰는 의미가 있나
//                    .useBlockingTaskExecutor(true)
                    .build();

            builder.service(grpcService);
        };
    }

}
