/**
 * 
 */
package me.johnboyer.aws.samples.lambda;

import com.amazonaws.regions.Regions;
import com.amazonaws.services.dynamodbv2.AmazonDynamoDB;
import com.amazonaws.services.dynamodbv2.AmazonDynamoDBClientBuilder;
import com.amazonaws.services.dynamodbv2.model.ScanRequest;
import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;

/**
 * 
 * DynamoDBFunctionHandler class
 * @author John Boyer
 *
 */
public class DynamoDBFunctionHandler implements RequestHandler<DynamoDBFunctionHandler.EmptyInput, String> {
	
	/**
	 * EmptyInput POJO
	 *
	 */
	public static class EmptyInput {
		private String input;

		public String getInput() {
			return input;
		}

		public void setInput(String input) {
			this.input = input;
		}
		
	}
	
	private static final String TABLE = "customer";
	AmazonDynamoDB sDynamoDB = AmazonDynamoDBClientBuilder.standard().withRegion(Regions.US_WEST_2).build();

	@Override
	public String handleRequest(EmptyInput arg0, Context arg1) {
		return sDynamoDB.scan(new ScanRequest(TABLE)).toString();
	}

}
