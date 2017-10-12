package gradle_Setup_trial;

import com.mongodb.client.FindIterable; 
import com.mongodb.MongoClient;
import com.mongodb.MongoCredential;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.MongoCollection;
import org.bson.Document;
import java.util.Iterator;

//Connect to database
public class DatabaseConnection {
	public static void main( String args[] ) {  
	      
	      // Creating a Mongo client 
	      MongoClient mongo = new MongoClient( "127.0.0.1" , 27017 ); 
	   
	      // Creating Credentials 
	      MongoCredential credential; 
	      credential = MongoCredential.createCredential("istm622", "team007",
	         "istm622".toCharArray()); 
	      System.out.println("Connected to the database successfully");  
	      
	      // Accessing the database 
	      MongoDatabase database = mongo.getDatabase("team007"); 
	      System.out.println("Credentials ::"+ credential);
	      
	    //Creating a collection 
	      database.createCollection("Team07-sampleCollection_006"); 
	      System.out.println("Collection created successfully");
	      
	   // Retrieving a collection 
	      MongoCollection<Document> collection = database.getCollection("tours"); 
	      System.out.println("Collection Team07-sampleCollection selected successfully");
	      
	   // Getting the iterable object 
	      FindIterable<Document> iterDoc = collection.find(); 
	      int i = 1; 

	      // Getting the iterator 
	      Iterator it = iterDoc.iterator(); 
	    
	      while (it.hasNext()) {  
	         System.out.println(it.next());  
	      i++;
	      
	   }
	
	
 }


 }





