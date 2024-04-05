package com.braze.models.inappmessage;

import com.braze.enums.inappmessage.MessageType;
import com.braze.support.BrazeLogger;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import org.json.JSONObject;
import p030bo.app.C3787j;
import p030bo.app.C4208t1;
import p030bo.app.C4274x1;
import p753kq.C19846a;

public final class InAppMessageControl extends InAppMessageBase {

    /* renamed from: z */
    public final AtomicBoolean f11795z = new AtomicBoolean(false);

    /* renamed from: com.braze.models.inappmessage.InAppMessageControl$a */
    public static final class C5463a extends Lambda implements C19846a<String> {

        /* renamed from: b */
        public static final C5463a f11796b = new C5463a();

        public C5463a() {
            super(0);
        }

        /* renamed from: a */
        public final String invoke() {
            return "Control impression already logged for this in-app message. Ignoring.";
        }
    }

    /* renamed from: com.braze.models.inappmessage.InAppMessageControl$b */
    public static final class C5464b extends Lambda implements C19846a<String> {

        /* renamed from: b */
        public static final C5464b f11797b = new C5464b();

        public C5464b() {
            super(0);
        }

        /* renamed from: a */
        public final String invoke() {
            return "Trigger Id not found (this is expected for test sends). Not logging in-app message control impression.";
        }
    }

    /* renamed from: com.braze.models.inappmessage.InAppMessageControl$c */
    public static final class C5465c extends Lambda implements C19846a<String> {

        /* renamed from: b */
        public static final C5465c f11798b = new C5465c();

        public C5465c() {
            super(0);
        }

        /* renamed from: a */
        public final String invoke() {
            return "Cannot log an in-app message control impression because the BrazeManager is null.";
        }
    }

    /* renamed from: com.braze.models.inappmessage.InAppMessageControl$d */
    public static final class C5466d extends Lambda implements C19846a<String> {

        /* renamed from: b */
        public static final C5466d f11799b = new C5466d();

        public C5466d() {
            super(0);
        }

        /* renamed from: a */
        public final String invoke() {
            return "Logging control in-app message impression event";
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public InAppMessageControl(JSONObject jSONObject, C4274x1 x1Var) {
        super(jSONObject, x1Var);
        C19383o.m32797g(jSONObject, "jsonObject");
        C19383o.m32797g(x1Var, "brazeManager");
    }

    /* renamed from: R */
    public final MessageType mo16002R() {
        return MessageType.CONTROL;
    }

    public final boolean logImpression() {
        if (this.f11795z.get()) {
            BrazeLogger.m11282d(BrazeLogger.f11932a, this, BrazeLogger.Priority.I, (Throwable) null, C5463a.f11796b, 6);
            return false;
        }
        String c0 = mo15971c0();
        if (c0 == null || c0.length() == 0) {
            BrazeLogger.m11282d(BrazeLogger.f11932a, this, BrazeLogger.Priority.W, (Throwable) null, C5464b.f11797b, 6);
            return false;
        } else if (this.f11773x == null) {
            BrazeLogger.m11282d(BrazeLogger.f11932a, this, BrazeLogger.Priority.W, (Throwable) null, C5465c.f11798b, 6);
            return false;
        } else {
            BrazeLogger.m11282d(BrazeLogger.f11932a, this, BrazeLogger.Priority.V, (Throwable) null, C5466d.f11799b, 6);
            String c02 = mo15971c0();
            C4208t1 h = c02 == null ? null : C3787j.f8608h.mo13487h(c02);
            if (h != null) {
                C4274x1 x1Var = this.f11773x;
                if (x1Var != null) {
                    x1Var.mo13838a(h);
                }
                this.f11795z.set(true);
            }
            return true;
        }
    }
}
