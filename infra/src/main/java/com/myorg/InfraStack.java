package com.myorg;

import software.amazon.awscdk.Duration;
import software.amazon.awscdk.services.lambda.Code;
import software.amazon.awscdk.services.lambda.Function;
import software.amazon.awscdk.services.lambda.Runtime;
import software.constructs.Construct;
import software.amazon.awscdk.Stack;
import software.amazon.awscdk.StackProps;


public class InfraStack extends Stack {
    public InfraStack(final Construct scope, final String id) {
        this(scope, id, null);
    }

    public InfraStack(final Construct scope, final String id, final StackProps props) {
        super(scope, id, props);

        Function.Builder.create(this, "hello-world-lambda")
                .runtime(Runtime.JAVA_11)
                .handler("org.example.HelloWorldLambda")
                .memorySize(128)
                .timeout(Duration.seconds(20))
                .functionName("JackTestLambda")
                .code(Code.fromAsset("../assets/function.jar"))
                .build();
        Function.Builder.create(this, "sum-lambda")
                .runtime(Runtime.JAVA_11)
                .handler("org.example.SumLambda")
                .memorySize(128)
                .timeout(Duration.seconds(20))
                .functionName("TestSumLambda")
                .code(Code.fromAsset("../assets/function.jar"))
                .build();
    }


}
