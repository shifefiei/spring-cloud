package com.sff.spring.cloud.grpc.server;

import com.google.protobuf.Empty;
import com.sff.spring.cloud.grpc.sdk.HelloRequest;
import com.sff.spring.cloud.grpc.sdk.HelloResponse;
import com.sff.spring.cloud.grpc.sdk.HelloServiceGrpc;
import io.grpc.stub.StreamObserver;

public class HelloService extends HelloServiceGrpc.HelloServiceImplBase {


    @Override
    public void hello(HelloRequest request, StreamObserver<HelloResponse> responseObserver) {
        System.out.println(request);

        String greeting = "Hi" + request.getName()
                + " you are " + request.getAge()
                + " ,you are hobby " + request.getHobbiesList()
                + "," + request.getTagsMap();

        HelloResponse response = HelloResponse.newBuilder()
                .setCode(0)
                .setMessage(greeting).build();

        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }

    @Override
    public void sayHello(HelloRequest request, StreamObserver<Empty> responseObserver) {
        System.out.println("------------result api---------------");
    }
}
