package com.facebook.internal;

import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import com.etsy.android.lib.models.ResponseConstants;
import kotlin.jvm.internal.C19383o;
import p401mg.C13080a;

public abstract class PlatformServiceClient implements ServiceConnection {
    private final String applicationId;
    private final Context context;
    private final Handler handler;
    private C12262a listener;
    private final String nonce;
    private final int protocolVersion;
    private final int replyMessage;
    private final int requestMessage;
    private boolean running;
    private Messenger sender;

    /* renamed from: com.facebook.internal.PlatformServiceClient$a */
    public interface C12262a {
        /* renamed from: a */
        void mo39408a(Bundle bundle);
    }

    public PlatformServiceClient(Context context2, int i, int i2, int i3, String str, String str2) {
        C19383o.m32797g(context2, ResponseConstants.CONTEXT);
        C19383o.m32797g(str, "applicationId");
        Context applicationContext = context2.getApplicationContext();
        this.context = applicationContext != null ? applicationContext : context2;
        this.requestMessage = i;
        this.replyMessage = i2;
        this.applicationId = str;
        this.protocolVersion = i3;
        this.nonce = str2;
        this.handler = new Handler(this) {
            public final /* synthetic */ PlatformServiceClient this$0;

            {
                this.this$0 = r1;
            }

            public void handleMessage(Message message) {
                if (!C13080a.m20762b(this)) {
                    try {
                        C19383o.m32797g(message, "message");
                        this.this$0.handleMessage(message);
                    } catch (Throwable th) {
                        C13080a.m20761a(this, th);
                    }
                }
            }
        };
    }

    private final void callback(Bundle bundle) {
        if (this.running) {
            this.running = false;
            C12262a aVar = this.listener;
            if (aVar != null) {
                aVar.mo39408a(bundle);
            }
        }
    }

    private final void sendMessage() {
        Bundle bundle = new Bundle();
        bundle.putString("com.facebook.platform.extra.APPLICATION_ID", this.applicationId);
        String str = this.nonce;
        if (str != null) {
            bundle.putString("com.facebook.platform.extra.NONCE", str);
        }
        populateRequestBundle(bundle);
        Message obtain = Message.obtain((Handler) null, this.requestMessage);
        obtain.arg1 = this.protocolVersion;
        obtain.setData(bundle);
        obtain.replyTo = new Messenger(this.handler);
        try {
            Messenger messenger = this.sender;
            if (messenger != null) {
                messenger.send(obtain);
            }
        } catch (RemoteException unused) {
            callback((Bundle) null);
        }
    }

    public final void cancel() {
        this.running = false;
    }

    public final Context getContext() {
        return this.context;
    }

    public final String getNonce() {
        return this.nonce;
    }

    public final void handleMessage(Message message) {
        C19383o.m32797g(message, "message");
        if (message.what == this.replyMessage) {
            Bundle data = message.getData();
            if (data.getString("com.facebook.platform.status.ERROR_TYPE") != null) {
                callback((Bundle) null);
            } else {
                callback(data);
            }
            try {
                this.context.unbindService(this);
            } catch (IllegalArgumentException unused) {
            }
        }
    }

    public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        C19383o.m32797g(componentName, "name");
        C19383o.m32797g(iBinder, "service");
        this.sender = new Messenger(iBinder);
        sendMessage();
    }

    public void onServiceDisconnected(ComponentName componentName) {
        C19383o.m32797g(componentName, "name");
        this.sender = null;
        try {
            this.context.unbindService(this);
        } catch (IllegalArgumentException unused) {
        }
        callback((Bundle) null);
    }

    public abstract void populateRequestBundle(Bundle bundle);

    public final void setCompletedListener(C12262a aVar) {
        this.listener = aVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0041, code lost:
        return r1;
     */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x002d A[DONT_GENERATE] */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x002f A[SYNTHETIC, Splitter:B:21:0x002f] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean start() {
        /*
            r7 = this;
            monitor-enter(r7)
            boolean r0 = r7.running     // Catch:{ all -> 0x0042 }
            r1 = 0
            if (r0 == 0) goto L_0x0008
            monitor-exit(r7)
            return r1
        L_0x0008:
            int r0 = r7.protocolVersion     // Catch:{ all -> 0x0042 }
            java.lang.String r2 = p365hg.C12851e0.f28342a     // Catch:{ all -> 0x0042 }
            java.lang.Class<hg.e0> r2 = p365hg.C12851e0.class
            boolean r3 = p401mg.C13080a.m20762b(r2)     // Catch:{ all -> 0x0042 }
            r4 = 1
            if (r3 == 0) goto L_0x0016
            goto L_0x0029
        L_0x0016:
            hg.e0 r3 = p365hg.C12851e0.f28346e     // Catch:{ all -> 0x0025 }
            java.util.ArrayList r5 = p365hg.C12851e0.f28343b     // Catch:{ all -> 0x0025 }
            int[] r6 = new int[r4]     // Catch:{ all -> 0x0025 }
            r6[r1] = r0     // Catch:{ all -> 0x0025 }
            hg.e0$g r0 = r3.mo45632i(r5, r6)     // Catch:{ all -> 0x0025 }
            int r0 = r0.f28348a     // Catch:{ all -> 0x0025 }
            goto L_0x002a
        L_0x0025:
            r0 = move-exception
            p401mg.C13080a.m20761a(r2, r0)     // Catch:{ all -> 0x0042 }
        L_0x0029:
            r0 = r1
        L_0x002a:
            r2 = -1
            if (r0 != r2) goto L_0x002f
            monitor-exit(r7)
            return r1
        L_0x002f:
            android.content.Context r0 = r7.context     // Catch:{ all -> 0x0042 }
            android.content.Intent r0 = p365hg.C12851e0.m20505d(r0)     // Catch:{ all -> 0x0042 }
            if (r0 != 0) goto L_0x0038
            goto L_0x0040
        L_0x0038:
            r7.running = r4     // Catch:{ all -> 0x0042 }
            android.content.Context r1 = r7.context     // Catch:{ all -> 0x0042 }
            r1.bindService(r0, r7, r4)     // Catch:{ all -> 0x0042 }
            r1 = r4
        L_0x0040:
            monitor-exit(r7)
            return r1
        L_0x0042:
            r0 = move-exception
            monitor-exit(r7)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.internal.PlatformServiceClient.start():boolean");
    }
}
