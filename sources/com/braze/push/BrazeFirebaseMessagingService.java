package com.braze.push;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.appboy.Constants;
import com.braze.Braze;
import com.braze.C5381b;
import com.braze.configuration.BrazeConfigurationProvider;
import com.braze.support.BrazeLogger;
import com.etsy.android.lib.models.ResponseConstants;
import com.google.firebase.messaging.FirebaseMessagingService;
import com.google.firebase.messaging.RemoteMessage;
import java.util.Map;
import kotlin.jvm.internal.C19383o;

public class BrazeFirebaseMessagingService extends FirebaseMessagingService {
    public static final Companion Companion = new Companion();

    public static final class Companion {
        /* renamed from: b */
        public static boolean m11193b(RemoteMessage remoteMessage) {
            C19383o.m32797g(remoteMessage, "remoteMessage");
            Map<String, String> data = remoteMessage.getData();
            C19383o.m32796f(data, "remoteMessage.data");
            return C19383o.m32792b("true", data.get(Constants.APPBOY_PUSH_APPBOY_KEY));
        }

        /* renamed from: a */
        public final boolean mo16048a(Context context, RemoteMessage remoteMessage) {
            C19383o.m32797g(context, ResponseConstants.CONTEXT);
            C19383o.m32797g(remoteMessage, "remoteMessage");
            if (!m11193b(remoteMessage)) {
                BrazeLogger.m11282d(BrazeLogger.f11932a, this, BrazeLogger.Priority.I, (Throwable) null, new C5502xe25b0a02(remoteMessage), 6);
                return false;
            }
            Map<String, String> data = remoteMessage.getData();
            C19383o.m32796f(data, "remoteMessage.data");
            BrazeLogger.m11282d(BrazeLogger.f11932a, this, BrazeLogger.Priority.I, (Throwable) null, new C5503xe25b0a03(data), 6);
            Intent intent = new Intent(BrazePushReceiver.FIREBASE_MESSAGING_SERVICE_ROUTING_ACTION);
            Bundle bundle = new Bundle();
            for (Map.Entry next : data.entrySet()) {
                String str = (String) next.getKey();
                String str2 = (String) next.getValue();
                BrazeLogger.m11282d(BrazeLogger.f11932a, this, BrazeLogger.Priority.V, (Throwable) null, new C5504xe25b0a04(str, str2), 6);
                bundle.putString(str, str2);
            }
            intent.putExtras(bundle);
            BrazePushReceiver.Companion.mo16059f(context, intent, true);
            return true;
        }
    }

    public static final boolean handleBrazeRemoteMessage(Context context, RemoteMessage remoteMessage) {
        return Companion.mo16048a(context, remoteMessage);
    }

    public static final boolean isBrazePushNotification(RemoteMessage remoteMessage) {
        Companion.getClass();
        return Companion.m11193b(remoteMessage);
    }

    public void onMessageReceived(RemoteMessage remoteMessage) {
        C19383o.m32797g(remoteMessage, "remoteMessage");
        super.onMessageReceived(remoteMessage);
        Companion.mo16048a(this, remoteMessage);
    }

    public void onNewToken(String str) {
        C19383o.m32797g(str, "newToken");
        super.onNewToken(str);
        C5381b.m10962b(this).mo15495j();
        BrazeConfigurationProvider brazeConfigurationProvider = new BrazeConfigurationProvider(this);
        Braze.Companion companion = Braze.f11170m;
        String e = companion.mo15514e(brazeConfigurationProvider);
        if (e == null || e.length() == 0) {
            BrazeLogger.m11282d(BrazeLogger.f11932a, this, BrazeLogger.Priority.V, (Throwable) null, new BrazeFirebaseMessagingService$onNewToken$1(str), 6);
        } else if (!brazeConfigurationProvider.isFirebaseMessagingServiceOnNewTokenRegistrationEnabled()) {
            BrazeLogger.m11282d(BrazeLogger.f11932a, this, BrazeLogger.Priority.V, (Throwable) null, new BrazeFirebaseMessagingService$onNewToken$2(str), 6);
        } else {
            BrazeLogger.m11282d(BrazeLogger.f11932a, this, BrazeLogger.Priority.V, (Throwable) null, new BrazeFirebaseMessagingService$onNewToken$3(str), 6);
            companion.mo15515f(this).mo15490c(str);
        }
    }
}
