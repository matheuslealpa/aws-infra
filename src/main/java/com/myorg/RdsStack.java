//package com.myorg;
//
//import software.amazon.awscdk.CfnParameter;
//import software.amazon.awscdk.Stack;
//import software.amazon.awscdk.StackProps;
//import software.amazon.awscdk.services.ec2.Vpc;
//import software.amazon.awscdk.services.ecs.Cluster;
//import software.amazon.awscdk.services.ecs.ContainerImage;
//import software.amazon.awscdk.services.ecs.patterns.ApplicationLoadBalancedFargateService;
//import software.amazon.awscdk.services.ecs.patterns.ApplicationLoadBalancedTaskImageOptions;
//import software.constructs.Construct;
//// import software.amazon.awscdk.Duration;
//// import software.amazon.awscdk.services.sqs.Queue;
//
//public class RdsStack extends Stack {
//    public RdsStack(final Construct scope, final String id, final Vpc vpc) {
//        this(scope, id, null, vpc);
//    }
//
//    public RdsStack(final Construct scope, final String id, final StackProps props, final Vpc vpc) {
//        super(scope, id, props);
//
//        CfnParameter passwd = CfnParameter.Builder.create(this, "senha")
//                .type("String")
//                .description("Senha do banco de dados")
//                .build();
//
//
//
//    }
//}
