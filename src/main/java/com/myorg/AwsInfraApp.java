package com.myorg;

import software.amazon.awscdk.App;
import software.amazon.awscdk.StackProps;

public class AwsInfraApp {
    public static void main(final String[] args) {
        App app = new App();

        var vpcStack = new VpcStack(app, "Vpc");
        var clusterStack = new ClusterStack(app, "Cluster", vpcStack.getVpc());;
        clusterStack.addDependency(vpcStack);

        var serviceStack = new ServiceStack(app, "Service", clusterStack.getCluster());
        serviceStack.addDependency(clusterStack);
        app.synth();
    }
}

