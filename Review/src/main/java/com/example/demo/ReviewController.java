package com.example.demo;
import java.io.IOException;
import java.util.concurrent.ExecutionException;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.google.api.core.ApiFuture;
import com.google.auth.oauth2.GoogleCredentials;
import com.google.cloud.firestore.DocumentReference;
import com.google.cloud.firestore.DocumentSnapshot;
import com.google.cloud.firestore.Firestore;
import com.google.cloud.firestore.FirestoreOptions;
import com.google.cloud.firestore.WriteResult;



@RestController
public class ReviewController {

	Firestore db = db();

	public Firestore db() {
		FirestoreOptions firestoreOptions = null;
		try {
			firestoreOptions = FirestoreOptions.getDefaultInstance().toBuilder()
					.setProjectId("swe443-reviews")
					.setCredentials(GoogleCredentials.getApplicationDefault())
					.build();
		} catch (IOException e) {
			e.printStackTrace();
		}
		Firestore db = firestoreOptions.getService();

		return db;
	}




	@GetMapping("/abc")
	public String viewHome() {
		return "index";

	}
	
	@GetMapping("/data/{reviewID}/{content}/{movieRating}/{dateTimeMilli}/{likes}/{movie}/{user}")
	public String viewome(@PathVariable long reviewID, @PathVariable String content, @PathVariable int movieRating, @PathVariable long dateTimeMilli, @PathVariable int likes, @PathVariable String movie, @PathVariable String user) throws InterruptedException, ExecutionException {
		DocumentReference docRef = db.collection(movie).document(user);
		// Add document data  with id "alovelace" using a hashmap
		Review reviewthing = new Review(reviewID, content, movieRating, dateTimeMilli, likes);
		//asynchronously write data
		ApiFuture<WriteResult> result = docRef.set(reviewthing);
		// ...
		// result.get() blocks on response
		System.out.println("Update time : " + result.get().getUpdateTime());
		return "index";

	}
	
	@GetMapping("/grab/{movie}/{user}") 
	public Review thing(@PathVariable String movie, @PathVariable String user) throws InterruptedException, ExecutionException {
		DocumentSnapshot reading = db.collection(movie).document(user).get().get();
		return reading.toObject(Review.class);
		
		
	}




}
