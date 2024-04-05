package com.google.firebase.iid;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.cloudmessaging.CloudMessage;
import com.google.android.gms.cloudmessaging.CloudMessagingReceiver;
import java.util.concurrent.ExecutionException;
import p517bn.C14118i;
import p517bn.C14128s;
import p605kk.C18126j;

public final class FirebaseInstanceIdReceiver extends CloudMessagingReceiver {
    public final int onMessageReceive(Context context, CloudMessage cloudMessage) {
        try {
            return ((Integer) C18126j.m30613a(new C14118i(context).mo46995b(cloudMessage.getIntent()))).intValue();
        } catch (InterruptedException | ExecutionException e) {
            Log.e("FirebaseMessaging", "Failed to send message to service.", e);
            return 500;
        }
    }

    public final void onNotificationDismissed(Context context, Bundle bundle) {
        Intent putExtras = new Intent("com.google.firebase.messaging.NOTIFICATION_DISMISS").putExtras(bundle);
        if (C14128s.m21862c(putExtras)) {
            C14128s.m21861b(putExtras.getExtras(), "_nd");
        }
    }
}
