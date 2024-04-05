package com.google.firebase.appindexing;

import com.google.firebase.FirebaseException;

public class FirebaseAppIndexingException extends FirebaseException {
    public FirebaseAppIndexingException(String str) {
        super(str);
    }

    public FirebaseAppIndexingException(String str, Throwable th) {
        super(str, th);
    }
}
