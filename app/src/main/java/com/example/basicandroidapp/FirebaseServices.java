package com.example.basicandroidapp;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.firestore.FirebaseFirestore;
import com.google.firebase.storage.FirebaseStorage;

public class FirebaseServices {

    private static FirebaseServices instance;


    private final FirebaseAuth Auth;
    private final FirebaseFirestore db;
    private final FirebaseStorage storage;

    public FirebaseAuth getAuth() {
        return Auth;
    }

    public FirebaseFirestore getDb() {
        return db;
    }

    public FirebaseStorage getStorage() {
        return storage;
    }

    private FirebaseServices() {
        Auth = FirebaseAuth.getInstance();
        db=FirebaseFirestore.getInstance();
        storage=FirebaseStorage.getInstance();
    }

   public static FirebaseServices getInstance() {
    if (instance==null){instance=new FirebaseServices();}


       return instance;
   }

}
