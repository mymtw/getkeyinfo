package com.appsflyer;

import com.appsflyer.internal.C5049bp;
import com.google.firebase.messaging.FirebaseMessagingService;

public class FirebaseMessagingServiceListener extends FirebaseMessagingService {
    public void onNewToken(String str) {
        new C5049bp(getApplicationContext()).AFInAppEventType(str);
    }
}
