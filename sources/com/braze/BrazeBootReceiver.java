package com.braze;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.support.p013v4.media.C0072d;
import com.braze.support.BrazeLogger;
import com.etsy.android.lib.models.ResponseConstants;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import p030bo.app.C3977n1;
import p753kq.C19846a;

public class BrazeBootReceiver extends BroadcastReceiver {
    private static final String BOOT_COMPLETE_ACTION = "android.intent.action.BOOT_COMPLETED";
    public static final C5320a Companion = new C5320a();

    /* renamed from: com.braze.BrazeBootReceiver$a */
    public static final class C5320a {
    }

    /* renamed from: com.braze.BrazeBootReceiver$b */
    public static final class C5321b extends Lambda implements C19846a<String> {

        /* renamed from: b */
        public final /* synthetic */ Intent f11454b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C5321b(Intent intent) {
            super(0);
            this.f11454b = intent;
        }

        /* renamed from: a */
        public final String invoke() {
            return C19383o.m32802l(this.f11454b, "Received broadcast message. Message: ");
        }
    }

    /* renamed from: com.braze.BrazeBootReceiver$c */
    public static final class C5322c extends Lambda implements C19846a<String> {

        /* renamed from: b */
        public static final C5322c f11455b = new C5322c();

        public C5322c() {
            super(0);
        }

        /* renamed from: a */
        public final String invoke() {
            return "Boot complete intent received. Initializing.";
        }
    }

    /* renamed from: com.braze.BrazeBootReceiver$d */
    public static final class C5323d extends Lambda implements C19846a<String> {

        /* renamed from: b */
        public final /* synthetic */ Intent f11456b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C5323d(Intent intent) {
            super(0);
            this.f11456b = intent;
        }

        /* renamed from: a */
        public final String invoke() {
            StringBuilder h = C0072d.m201h("Unknown intent ");
            h.append(this.f11456b);
            h.append(" received. Doing nothing.");
            return h.toString();
        }
    }

    public final boolean handleIncomingIntent(Context context, Intent intent) {
        C19383o.m32797g(context, ResponseConstants.CONTEXT);
        C19383o.m32797g(intent, "intent");
        BrazeLogger brazeLogger = BrazeLogger.f11932a;
        BrazeLogger.Priority priority = BrazeLogger.Priority.I;
        BrazeLogger.m11282d(brazeLogger, this, priority, (Throwable) null, new C5321b(intent), 6);
        if (C19383o.m32792b(BOOT_COMPLETE_ACTION, intent.getAction())) {
            BrazeLogger.m11282d(brazeLogger, this, priority, (Throwable) null, C5322c.f11455b, 6);
            C3977n1.m9195a(context);
            Braze.f11170m.mo15515f(context);
            return true;
        }
        BrazeLogger.m11282d(brazeLogger, this, BrazeLogger.Priority.W, (Throwable) null, new C5323d(intent), 6);
        return false;
    }

    public void onReceive(Context context, Intent intent) {
        C19383o.m32797g(context, ResponseConstants.CONTEXT);
        C19383o.m32797g(intent, "intent");
        handleIncomingIntent(context, intent);
    }
}
