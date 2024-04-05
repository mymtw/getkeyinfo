package com.braze.models.inappmessage;

import android.support.p013v4.media.C0072d;
import com.braze.enums.inappmessage.MessageType;
import com.braze.support.BrazeLogger;
import java.util.Map;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import kotlin.text.C19457k;
import org.json.JSONObject;
import p030bo.app.C3549a3;
import p030bo.app.C3787j;
import p030bo.app.C4173s2;
import p030bo.app.C4208t1;
import p030bo.app.C4274x1;
import p753kq.C19846a;

public abstract class InAppMessageHtmlBase extends InAppMessageBase implements C5484b {

    /* renamed from: A */
    public boolean f11800A;

    /* renamed from: B */
    public String f11801B;

    /* renamed from: z */
    public String f11802z;

    /* renamed from: com.braze.models.inappmessage.InAppMessageHtmlBase$a */
    public static final class C5467a extends Lambda implements C19846a<String> {

        /* renamed from: b */
        public final /* synthetic */ String f11803b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C5467a(String str) {
            super(0);
            this.f11803b = str;
        }

        /* renamed from: a */
        public final String invoke() {
            return C19383o.m32802l(this.f11803b, "Trigger id not found (this is expected for test sends). Not logging html in-app message button click for id: ");
        }
    }

    /* renamed from: com.braze.models.inappmessage.InAppMessageHtmlBase$b */
    public static final class C5468b extends Lambda implements C19846a<String> {

        /* renamed from: b */
        public static final C5468b f11804b = new C5468b();

        public C5468b() {
            super(0);
        }

        /* renamed from: a */
        public final String invoke() {
            return "Button Id was null or blank for this html in-app message. Ignoring.";
        }
    }

    /* renamed from: com.braze.models.inappmessage.InAppMessageHtmlBase$c */
    public static final class C5469c extends Lambda implements C19846a<String> {

        /* renamed from: b */
        public static final C5469c f11805b = new C5469c();

        public C5469c() {
            super(0);
        }

        /* renamed from: a */
        public final String invoke() {
            return "Button click already logged for this html in-app message. Ignoring.";
        }
    }

    /* renamed from: com.braze.models.inappmessage.InAppMessageHtmlBase$d */
    public static final class C5470d extends Lambda implements C19846a<String> {

        /* renamed from: b */
        public static final C5470d f11806b = new C5470d();

        public C5470d() {
            super(0);
        }

        /* renamed from: a */
        public final String invoke() {
            return "Cannot log an html in-app message button click because the BrazeManager is null.";
        }
    }

    /* renamed from: com.braze.models.inappmessage.InAppMessageHtmlBase$e */
    public static final class C5471e extends Lambda implements C19846a<String> {

        /* renamed from: b */
        public final /* synthetic */ String f11807b;

        /* renamed from: c */
        public final /* synthetic */ String f11808c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C5471e(String str, String str2) {
            super(0);
            this.f11807b = str;
            this.f11808c = str2;
        }

        /* renamed from: a */
        public final String invoke() {
            StringBuilder h = C0072d.m201h("Logged button click for button id: ");
            h.append(this.f11807b);
            h.append(" and trigger id: ");
            h.append(this.f11808c);
            return h.toString();
        }
    }

    public InAppMessageHtmlBase() {
        this.f11755f = true;
    }

    /* renamed from: B */
    public final String mo16007B() {
        return this.f11802z;
    }

    /* renamed from: C */
    public final void mo16008C(String str) {
        this.f11802z = str;
    }

    /* renamed from: G */
    public void mo15954G(Map<String, String> map) {
        C19383o.m32797g(map, "remotePathToLocalAssetMap");
        if (!map.isEmpty()) {
            Object[] array = map.values().toArray(new String[0]);
            if (array != null) {
                this.f11802z = ((String[]) array)[0];
                return;
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        }
    }

    /* renamed from: J */
    public final boolean mo16009J(String str) {
        C19383o.m32797g(str, "buttonId");
        String c0 = mo15971c0();
        C4274x1 x1Var = this.f11773x;
        if (c0 == null || c0.length() == 0) {
            BrazeLogger.m11282d(BrazeLogger.f11932a, this, (BrazeLogger.Priority) null, (Throwable) null, new C5467a(str), 7);
            return false;
        } else if (C19457k.m33020X0(str)) {
            BrazeLogger.m11282d(BrazeLogger.f11932a, this, BrazeLogger.Priority.I, (Throwable) null, C5468b.f11804b, 6);
            return false;
        } else if (this.f11800A && mo16002R() != MessageType.HTML) {
            BrazeLogger.m11282d(BrazeLogger.f11932a, this, BrazeLogger.Priority.I, (Throwable) null, C5469c.f11805b, 6);
            return false;
        } else if (x1Var == null) {
            BrazeLogger.m11282d(BrazeLogger.f11932a, this, BrazeLogger.Priority.W, (Throwable) null, C5470d.f11806b, 6);
            return false;
        } else {
            C4208t1 d = C3787j.f8608h.mo13480d(c0, str);
            if (d != null) {
                x1Var.mo13838a(d);
            }
            this.f11801B = str;
            this.f11800A = true;
            BrazeLogger.m11282d(BrazeLogger.f11932a, this, (BrazeLogger.Priority) null, (Throwable) null, new C5471e(str, c0), 7);
            return true;
        }
    }

    /* renamed from: Z */
    public final void mo15968Z() {
        C4274x1 x1Var;
        super.mo15968Z();
        if (this.f11800A) {
            String c0 = mo15971c0();
            boolean z = false;
            if (!(c0 == null || C19457k.m33020X0(c0))) {
                String str = this.f11801B;
                if (str == null || C19457k.m33020X0(str)) {
                    z = true;
                }
                if (!z && (x1Var = this.f11773x) != null) {
                    x1Var.mo13829a((C4173s2) new C3549a3(mo15971c0(), this.f11801B));
                }
            }
        }
    }

    public /* bridge */ /* synthetic */ Object forJsonPut() {
        return forJsonPut();
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public InAppMessageHtmlBase(JSONObject jSONObject, C4274x1 x1Var) {
        super(jSONObject, x1Var);
        C19383o.m32797g(jSONObject, "jsonObject");
        C19383o.m32797g(x1Var, "brazeManager");
        this.f11755f = jSONObject.optBoolean("use_webview", true);
    }
}
