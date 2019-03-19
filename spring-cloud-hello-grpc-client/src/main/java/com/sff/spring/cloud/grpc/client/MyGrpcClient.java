package com.sff.spring.cloud.grpc.client;

import com.sff.spring.cloud.grpc.sdk.HelloRequest;
import com.sff.spring.cloud.grpc.sdk.HelloResponse;
import com.sff.spring.cloud.grpc.sdk.HelloServiceGrpc;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;

public class MyGrpcClient {

    public static void main(String[] args) {

        ManagedChannel channel = ManagedChannelBuilder.forAddress("127.0.0.1", 8088)
                .usePlaintext()
                .build();
        HelloServiceGrpc.HelloServiceBlockingStub stub = HelloServiceGrpc.newBlockingStub(channel);

        HelloResponse response = stub.hello(HelloRequest.newBuilder()
                .setAge(12)
                .setName("kate")
                .addHobbies("go shopping")
                .putTags("a", "bbb")
                .build());

        System.out.println("---->>>" + response);
        channel.shutdown();

    }

}
