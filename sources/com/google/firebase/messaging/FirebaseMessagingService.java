package com.google.firebase.messaging;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.util.concurrent.NamedThreadFactory;
import com.paypal.pyplcheckout.constants.UrlConstantsKt;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import p517bn.C14106c;
import p517bn.C14128s;
import p517bn.C14130u;
import p517bn.C14133x;

public class FirebaseMessagingService extends EnhancedIntentService {
    public static final String ACTION_DIRECT_BOOT_REMOTE_INTENT = "com.google.firebase.messaging.RECEIVE_DIRECT_BOOT";
    private static final Queue<String> recentlyReceivedMessageIds = new ArrayDeque(10);

    private boolean alreadyReceivedMessage(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        Queue<String> queue = recentlyReceivedMessageIds;
        if (!queue.contains(str)) {
            if (queue.size() >= 10) {
                queue.remove();
            }
            queue.add(str);
            return false;
        } else if (!Log.isLoggable("FirebaseMessaging", 3)) {
            return true;
        } else {
            String valueOf = String.valueOf(str);
            Log.d("FirebaseMessaging", valueOf.length() != 0 ? "Received duplicate message: ".concat(valueOf) : new String("Received duplicate message: "));
            return true;
        }
    }

    private void dispatchMessage(Intent intent) {
        Bundle extras = intent.getExtras();
        if (extras == null) {
            extras = new Bundle();
        }
        extras.remove("androidx.content.wakelockid");
        if (C14130u.m21867k(extras)) {
            C14130u uVar = new C14130u(extras);
            ExecutorService newSingleThreadExecutor = Executors.newSingleThreadExecutor(new NamedThreadFactory("Firebase-Messaging-Network-Io"));
            try {
                if (!new C14106c(this, uVar, newSingleThreadExecutor).mo46979a()) {
                    newSingleThreadExecutor.shutdown();
                    if (C14128s.m21862c(intent)) {
                        C14128s.m21861b(intent.getExtras(), "_nf");
                    }
                } else {
                    return;
                }
            } finally {
                newSingleThreadExecutor.shutdown();
            }
        }
        onMessageReceived(new RemoteMessage(extras));
    }

    private String getMessageId(Intent intent) {
        String stringExtra = intent.getStringExtra("google.message_id");
        return stringExtra == null ? intent.getStringExtra("message_id") : stringExtra;
    }

    private void handleMessageIntent(Intent intent) {
        if (!alreadyReceivedMessage(intent.getStringExtra("google.message_id"))) {
            passMessageIntentToSdk(intent);
        }
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Removed duplicated region for block: B:123:0x01fe  */
    /* JADX WARNING: Removed duplicated region for block: B:124:0x0200  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void passMessageIntentToSdk(android.content.Intent r25) {
        /*
            r24 = this;
            r1 = r24
            r2 = r25
            java.lang.String r0 = "message_type"
            java.lang.String r0 = r2.getStringExtra(r0)
            java.lang.String r3 = "gcm"
            if (r0 != 0) goto L_0x000f
            r0 = r3
        L_0x000f:
            int r4 = r0.hashCode()
            r5 = 0
            r6 = 3
            r7 = 2
            r8 = 1
            switch(r4) {
                case -2062414158: goto L_0x0037;
                case 102161: goto L_0x002f;
                case 814694033: goto L_0x0025;
                case 814800675: goto L_0x001b;
                default: goto L_0x001a;
            }
        L_0x001a:
            goto L_0x0041
        L_0x001b:
            java.lang.String r3 = "send_event"
            boolean r3 = r0.equals(r3)
            if (r3 == 0) goto L_0x0041
            r3 = r7
            goto L_0x0042
        L_0x0025:
            java.lang.String r3 = "send_error"
            boolean r3 = r0.equals(r3)
            if (r3 == 0) goto L_0x0041
            r3 = r6
            goto L_0x0042
        L_0x002f:
            boolean r3 = r0.equals(r3)
            if (r3 == 0) goto L_0x0041
            r3 = r5
            goto L_0x0042
        L_0x0037:
            java.lang.String r3 = "deleted_messages"
            boolean r3 = r0.equals(r3)
            if (r3 == 0) goto L_0x0041
            r3 = r8
            goto L_0x0042
        L_0x0041:
            r3 = -1
        L_0x0042:
            java.lang.String r4 = "google.message_id"
            java.lang.String r9 = "FirebaseMessaging"
            if (r3 == 0) goto L_0x0083
            if (r3 == r8) goto L_0x007f
            if (r3 == r7) goto L_0x0077
            if (r3 == r6) goto L_0x0064
            java.lang.String r2 = "Received message with unknown type: "
            int r3 = r0.length()
            if (r3 == 0) goto L_0x005b
            java.lang.String r0 = r2.concat(r0)
            goto L_0x0060
        L_0x005b:
            java.lang.String r0 = new java.lang.String
            r0.<init>(r2)
        L_0x0060:
            android.util.Log.w(r9, r0)
            return
        L_0x0064:
            java.lang.String r0 = r24.getMessageId(r25)
            com.google.firebase.messaging.SendException r3 = new com.google.firebase.messaging.SendException
            java.lang.String r4 = "error"
            java.lang.String r2 = r2.getStringExtra(r4)
            r3.<init>(r2)
            r1.onSendError(r0, r3)
            return
        L_0x0077:
            java.lang.String r0 = r2.getStringExtra(r4)
            r1.onMessageSent(r0)
            return
        L_0x007f:
            r24.onDeletedMessages()
            return
        L_0x0083:
            boolean r0 = p517bn.C14128s.m21862c(r25)
            if (r0 == 0) goto L_0x0092
            android.os.Bundle r0 = r25.getExtras()
            java.lang.String r3 = "_nr"
            p517bn.C14128s.m21861b(r0, r3)
        L_0x0092:
            java.lang.String r0 = r25.getAction()
            java.lang.String r3 = "com.google.firebase.messaging.RECEIVE_DIRECT_BOOT"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x00a0
            r0 = r5
            goto L_0x00a4
        L_0x00a0:
            boolean r0 = p517bn.C14128s.m21860a()
        L_0x00a4:
            if (r0 == 0) goto L_0x0233
            com.google.firebase.messaging.reporting.MessagingClientEvent$Event r21 = com.google.firebase.messaging.reporting.MessagingClientEvent.Event.MESSAGE_DELIVERED
            com.google.android.datatransport.e r3 = com.google.firebase.messaging.FirebaseMessaging.getTransportFactory()
            if (r3 != 0) goto L_0x00b5
            java.lang.String r0 = "TransportFactory is null. Skip exporting message delivery metrics to Big Query"
            android.util.Log.e(r9, r0)
            goto L_0x0233
        L_0x00b5:
            android.os.Bundle r0 = r25.getExtras()
            if (r0 != 0) goto L_0x00bd
            android.os.Bundle r0 = android.os.Bundle.EMPTY
        L_0x00bd:
            int r6 = com.google.firebase.messaging.reporting.MessagingClientEvent.f36809p
            java.lang.String r6 = ""
            com.google.firebase.messaging.reporting.MessagingClientEvent$MessageType r10 = com.google.firebase.messaging.reporting.MessagingClientEvent.MessageType.UNKNOWN
            com.google.firebase.messaging.reporting.MessagingClientEvent$SDKPlatform r10 = com.google.firebase.messaging.reporting.MessagingClientEvent.SDKPlatform.UNKNOWN_OS
            java.lang.String r10 = "google.ttl"
            java.lang.Object r10 = r0.get(r10)
            boolean r11 = r10 instanceof java.lang.Integer
            if (r11 == 0) goto L_0x00d6
            java.lang.Integer r10 = (java.lang.Integer) r10
            int r5 = r10.intValue()
            goto L_0x00ef
        L_0x00d6:
            boolean r11 = r10 instanceof java.lang.String
            if (r11 == 0) goto L_0x00ef
            r11 = r10
            java.lang.String r11 = (java.lang.String) r11     // Catch:{ NumberFormatException -> 0x00e2 }
            int r5 = java.lang.Integer.parseInt(r11)     // Catch:{ NumberFormatException -> 0x00e2 }
            goto L_0x00ef
        L_0x00e2:
            java.lang.String r10 = java.lang.String.valueOf(r10)
            java.lang.String r11 = "Invalid TTL: "
            java.lang.String r10 = r11.concat(r10)
            android.util.Log.w(r9, r10)
        L_0x00ef:
            r19 = r5
            java.lang.String r5 = "google.to"
            java.lang.String r5 = r0.getString(r5)
            boolean r10 = android.text.TextUtils.isEmpty(r5)
            if (r10 != 0) goto L_0x00ff
        L_0x00fd:
            r14 = r5
            goto L_0x0122
        L_0x00ff:
            gm.c r5 = p575gm.C17793c.m29919b()     // Catch:{ ExecutionException -> 0x022c, InterruptedException -> 0x022a }
            java.lang.Object r10 = com.google.firebase.installations.C16560c.f36744m     // Catch:{ ExecutionException -> 0x022c, InterruptedException -> 0x022a }
            java.lang.String r10 = "Null is not a valid value of FirebaseApp."
            com.google.android.gms.common.internal.Preconditions.checkArgument(r8, r10)     // Catch:{ ExecutionException -> 0x022c, InterruptedException -> 0x022a }
            java.lang.Class<com.google.firebase.installations.d> r10 = com.google.firebase.installations.C16563d.class
            r5.mo69021a()     // Catch:{ ExecutionException -> 0x022c, InterruptedException -> 0x022a }
            pm.j r5 = r5.f38675d     // Catch:{ ExecutionException -> 0x022c, InterruptedException -> 0x022a }
            java.lang.Object r5 = r5.get(r10)     // Catch:{ ExecutionException -> 0x022c, InterruptedException -> 0x022a }
            com.google.firebase.installations.c r5 = (com.google.firebase.installations.C16560c) r5     // Catch:{ ExecutionException -> 0x022c, InterruptedException -> 0x022a }
            kk.a0 r5 = r5.getId()     // Catch:{ ExecutionException -> 0x022c, InterruptedException -> 0x022a }
            java.lang.Object r5 = p605kk.C18126j.m30613a(r5)     // Catch:{ ExecutionException -> 0x022c, InterruptedException -> 0x022a }
            java.lang.String r5 = (java.lang.String) r5     // Catch:{ ExecutionException -> 0x022c, InterruptedException -> 0x022a }
            goto L_0x00fd
        L_0x0122:
            gm.c r5 = p575gm.C17793c.m29919b()
            r5.mo69021a()
            android.content.Context r5 = r5.f38672a
            java.lang.String r17 = r5.getPackageName()
            com.google.firebase.messaging.reporting.MessagingClientEvent$SDKPlatform r16 = com.google.firebase.messaging.reporting.MessagingClientEvent.SDKPlatform.ANDROID
            boolean r5 = p517bn.C14130u.m21867k(r0)
            if (r5 == 0) goto L_0x013a
            com.google.firebase.messaging.reporting.MessagingClientEvent$MessageType r5 = com.google.firebase.messaging.reporting.MessagingClientEvent.MessageType.DISPLAY_NOTIFICATION
            goto L_0x013c
        L_0x013a:
            com.google.firebase.messaging.reporting.MessagingClientEvent$MessageType r5 = com.google.firebase.messaging.reporting.MessagingClientEvent.MessageType.DATA_MESSAGE
        L_0x013c:
            r15 = r5
            java.lang.String r4 = r0.getString(r4)
            if (r4 != 0) goto L_0x0149
            java.lang.String r4 = "message_id"
            java.lang.String r4 = r0.getString(r4)
        L_0x0149:
            if (r4 == 0) goto L_0x014d
            r13 = r4
            goto L_0x014e
        L_0x014d:
            r13 = r6
        L_0x014e:
            java.lang.String r4 = "from"
            java.lang.String r4 = r0.getString(r4)
            if (r4 == 0) goto L_0x015f
            java.lang.String r5 = "/topics/"
            boolean r5 = r4.startsWith(r5)
            if (r5 == 0) goto L_0x015f
            goto L_0x0160
        L_0x015f:
            r4 = 0
        L_0x0160:
            if (r4 == 0) goto L_0x0165
            r20 = r4
            goto L_0x0167
        L_0x0165:
            r20 = r6
        L_0x0167:
            java.lang.String r4 = "collapse_key"
            java.lang.String r4 = r0.getString(r4)
            if (r4 == 0) goto L_0x0172
            r18 = r4
            goto L_0x0174
        L_0x0172:
            r18 = r6
        L_0x0174:
            java.lang.String r4 = "google.c.a.m_l"
            java.lang.String r4 = r0.getString(r4)
            if (r4 == 0) goto L_0x017f
            r22 = r4
            goto L_0x0181
        L_0x017f:
            r22 = r6
        L_0x0181:
            java.lang.String r4 = "google.c.a.c_l"
            java.lang.String r4 = r0.getString(r4)
            if (r4 == 0) goto L_0x018c
            r23 = r4
            goto L_0x018e
        L_0x018c:
            r23 = r6
        L_0x018e:
            java.lang.String r4 = "google.c.sender.id"
            boolean r5 = r0.containsKey(r4)
            r10 = 0
            if (r5 == 0) goto L_0x01a7
            java.lang.String r0 = r0.getString(r4)     // Catch:{ NumberFormatException -> 0x01a1 }
            long r4 = java.lang.Long.parseLong(r0)     // Catch:{ NumberFormatException -> 0x01a1 }
            goto L_0x01fa
        L_0x01a1:
            r0 = move-exception
            java.lang.String r4 = "error parsing project number"
            android.util.Log.w(r9, r4, r0)
        L_0x01a7:
            gm.c r4 = p575gm.C17793c.m29919b()
            r4.mo69021a()
            gm.e r0 = r4.f38674c
            java.lang.String r0 = r0.f38688e
            if (r0 == 0) goto L_0x01c0
            long r4 = java.lang.Long.parseLong(r0)     // Catch:{ NumberFormatException -> 0x01b9 }
            goto L_0x01fa
        L_0x01b9:
            r0 = move-exception
            r5 = r0
            java.lang.String r0 = "error parsing sender ID"
            android.util.Log.w(r9, r0, r5)
        L_0x01c0:
            r4.mo69021a()
            gm.e r0 = r4.f38674c
            java.lang.String r0 = r0.f38685b
            java.lang.String r4 = "1:"
            boolean r4 = r0.startsWith(r4)
            java.lang.String r5 = "error parsing app ID"
            if (r4 != 0) goto L_0x01dc
            long r4 = java.lang.Long.parseLong(r0)     // Catch:{ NumberFormatException -> 0x01d6 }
            goto L_0x01fa
        L_0x01d6:
            r0 = move-exception
            r4 = r0
            android.util.Log.w(r9, r5, r4)
            goto L_0x01f9
        L_0x01dc:
            java.lang.String r4 = ":"
            java.lang.String[] r0 = r0.split(r4)
            int r4 = r0.length
            if (r4 >= r7) goto L_0x01e6
            goto L_0x01f9
        L_0x01e6:
            r0 = r0[r8]
            boolean r4 = r0.isEmpty()
            if (r4 == 0) goto L_0x01ef
            goto L_0x01f9
        L_0x01ef:
            long r4 = java.lang.Long.parseLong(r0)     // Catch:{ NumberFormatException -> 0x01f4 }
            goto L_0x01fa
        L_0x01f4:
            r0 = move-exception
            r4 = r0
            android.util.Log.w(r9, r5, r4)
        L_0x01f9:
            r4 = r10
        L_0x01fa:
            int r0 = (r4 > r10 ? 1 : (r4 == r10 ? 0 : -1))
            if (r0 <= 0) goto L_0x0200
            r11 = r4
            goto L_0x0201
        L_0x0200:
            r11 = r10
        L_0x0201:
            com.google.firebase.messaging.reporting.MessagingClientEvent r0 = new com.google.firebase.messaging.reporting.MessagingClientEvent
            r10 = r0
            r10.<init>(r11, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23)
            java.lang.String r4 = "FCM_CLIENT_EVENT_LOGGING"
            java.lang.String r5 = "proto"
            com.google.android.datatransport.a r6 = new com.google.android.datatransport.a     // Catch:{ RuntimeException -> 0x0223 }
            r6.<init>(r5)     // Catch:{ RuntimeException -> 0x0223 }
            kotlinx.coroutines.e0 r5 = kotlinx.coroutines.C19543e0.f43492e     // Catch:{ RuntimeException -> 0x0223 }
            com.google.android.datatransport.runtime.r r3 = r3.mo18642a(r4, r6, r5)     // Catch:{ RuntimeException -> 0x0223 }
            cn.a r4 = new cn.a     // Catch:{ RuntimeException -> 0x0223 }
            r4.<init>(r0)     // Catch:{ RuntimeException -> 0x0223 }
            com.google.android.datatransport.b r0 = com.google.android.datatransport.C6494b.ofTelemetry(r4)     // Catch:{ RuntimeException -> 0x0223 }
            r3.mo18729a(r0)     // Catch:{ RuntimeException -> 0x0223 }
            goto L_0x0233
        L_0x0223:
            r0 = move-exception
            java.lang.String r3 = "Failed to send big query analytics payload."
            android.util.Log.w(r9, r3, r0)
            goto L_0x0233
        L_0x022a:
            r0 = move-exception
            goto L_0x022d
        L_0x022c:
            r0 = move-exception
        L_0x022d:
            java.lang.RuntimeException r2 = new java.lang.RuntimeException
            r2.<init>(r0)
            throw r2
        L_0x0233:
            r24.dispatchMessage(r25)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.messaging.FirebaseMessagingService.passMessageIntentToSdk(android.content.Intent):void");
    }

    public Intent getStartCommandIntent(Intent intent) {
        return (Intent) C14133x.m21880a().f31137d.poll();
    }

    public void handleIntent(Intent intent) {
        String action = intent.getAction();
        if ("com.google.android.c2dm.intent.RECEIVE".equals(action) || ACTION_DIRECT_BOOT_REMOTE_INTENT.equals(action)) {
            handleMessageIntent(intent);
        } else if ("com.google.firebase.messaging.NEW_TOKEN".equals(action)) {
            onNewToken(intent.getStringExtra(UrlConstantsKt.URL_PARAM_CHECKOUT_TOKEN));
        } else {
            String valueOf = String.valueOf(intent.getAction());
            Log.d("FirebaseMessaging", valueOf.length() != 0 ? "Unknown intent action: ".concat(valueOf) : new String("Unknown intent action: "));
        }
    }

    public void onDeletedMessages() {
    }

    public void onMessageReceived(RemoteMessage remoteMessage) {
    }

    public void onMessageSent(String str) {
    }

    public void onNewToken(String str) {
    }

    public void onSendError(String str, Exception exc) {
    }
}
