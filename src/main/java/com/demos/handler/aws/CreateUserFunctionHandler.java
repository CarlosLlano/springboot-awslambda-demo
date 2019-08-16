package com.demos.handler.aws;

import com.demos.model.CreateUserRequest;
import org.springframework.cloud.function.adapter.aws.SpringBootRequestHandler;

public class CreateUserFunctionHandler extends SpringBootRequestHandler<CreateUserRequest, CreateUserRequest> {
}
