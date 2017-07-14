# AWS Lambda Demo

## Overview
This AWS Lambda function project queries the `customer` table created in the [AWS DynamoDB Demo](https://github.com/johnboyer/aws-dynamodb-demo-java/blob/master/README.md) project and returns the results as a JSON string. This project is a companion to my blog post: [How to Build a Serverless API With AWS Dynamodb, Lambda, and API Gateway](https://jeboyer.wordpress.com/2017/07/13/how-to-build-a-serverless-api-with-aws-dynamodb-lambda-and-api-gateway/).

## Prerequisites
1. An AWS Account and AWS CLI configured. Learn more [here](https://docs.aws.amazon.com/lambda/latest/dg/setup.html).
2. Git is installed and configured, click [here](https://git-scm.com/book/en/v2/Getting-Started-Installing-Git) for instructions.
3. Maven is installed and configured, click [here](http://maven.apache.org/install.html) for instructions.

## Package and Unit Test the Lambda Function
1. Follow the steps in the AWS DynamoDB demo project [here](https://github.com/johnboyer/aws-dynamodb-demo-java/blob/master/README.md).
2. Clone the project: `$ git clone https://github.com/johnboyer/aws-lambda-demo-java.git`
3. From the `aws-lambda-demo-java/lambda-demo` directory, package the project: `$ mvn package`
4. To learn how to deploy and test the Lambda function click [here](https://jeboyer.wordpress.com/2017/07/13/how-to-build-a-serverless-api-with-aws-dynamodb-lambda-and-api-gateway) and scroll to the Create a Lambda Function section.
