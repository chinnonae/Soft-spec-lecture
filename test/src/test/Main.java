package test;

import java.net.UnknownHostException;

import com.mongodb.MongoClient;
import com.mongodb.MongoClientURI;

public class Main {
	public static void main(String[] args) throws UnknownHostException {
		MongoClient mc = new MongoClient(new MongoClientURI("mongodb://joinpa_B:softspec@chinnnoo.xyz:27017/joinpa"));
		System.out.println(mc.getDB("joinpa").getStats());
		
	}
}
