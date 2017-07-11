package me.johnboyer.aws.samples.lambda;

import java.io.IOException;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.amazonaws.services.lambda.runtime.Context;

/**
 * A simple test harness for locally invoking your Lambda function handler.
 */
public class DynamoDBLambdaFunctionHandlerTest {


    @Before
    public void createInput() throws IOException {
        // TODO: set up your sample input object here.

    }

    private Context createContext() {
        TestContext ctx = new TestContext();

        // TODO: customize your context here if needed.
        ctx.setFunctionName("Your Function Name");

        return ctx;
    }

    @Test
   public void testHandler() {
    	String output = new DynamoDBFunctionHandler().handleRequest(null, null);
    	System.out.println(output);
    	Assert.assertTrue(output != null && output.startsWith("{Items: [{last_name="));
   }
}
