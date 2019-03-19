package com.sff.spring.cloud.grpc.server;

import io.grpc.Server;
import io.grpc.ServerBuilder;

public class MyGrpcServer {

    public static void main(String[] args) throws Exception {
        Server server = ServerBuilder.forPort(8088)
                .addService(new HelloService())
                .build();

        System.out.println("....... start server .......");
        server.start();
        System.out.println("....... server started .......");

        server.awaitTermination();
    }

}
