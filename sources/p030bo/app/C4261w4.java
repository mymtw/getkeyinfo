package p030bo.app;

import android.content.Context;
import android.content.SharedPreferences;
import com.braze.support.BrazeLogger;
import com.etsy.android.lib.models.ResponseConstants;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Lambda;
import p753kq.C19846a;

/* renamed from: bo.app.w4 */
public final class C4261w4 {

    /* renamed from: b */
    public static final C4262a f9408b = new C4262a((DefaultConstructorMarker) null);

    /* renamed from: a */
    private final SharedPreferences f9409a;

    /* renamed from: bo.app.w4$a */
    public static final class C4262a {
        private C4262a() {
        }

        public /* synthetic */ C4262a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: bo.app.w4$b */
    public static final class C4263b extends Lambda implements C19846a<String> {

        /* renamed from: b */
        public final /* synthetic */ boolean f9410b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C4263b(boolean z) {
            super(0);
            this.f9410b = z;
        }

        /* renamed from: a */
        public final String invoke() {
            return C19383o.m32802l(Boolean.valueOf(this.f9410b), "Setting Braze SDK disabled to: ");
        }
    }

    public C4261w4(Context context) {
        C19383o.m32797g(context, ResponseConstants.CONTEXT);
        this.f9409a = new C3630e(context, "persistent.com.appboy.storage.sdk_enabled_cache");
    }

    /* renamed from: a */
    public final boolean mo14147a() {
        return this.f9409a.getBoolean("appboy_sdk_disabled", false);
    }

    /* renamed from: a */
    public final void mo14146a(boolean z) {
        BrazeLogger.m11282d(BrazeLogger.f11932a, this, BrazeLogger.Priority.I, (Throwable) null, new C4263b(z), 6);
        this.f9409a.edit().putBoolean("appboy_sdk_disabled", z).apply();
    }
}
