package p030bo.app;

import android.content.Context;
import com.braze.Braze;
import com.braze.support.BrazeLogger;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import p753kq.C19846a;

/* renamed from: bo.app.b5 */
public final class C3591b5 implements C4035o2 {

    /* renamed from: a */
    private final Context f8253a;

    /* renamed from: bo.app.b5$a */
    public static final class C3592a extends Lambda implements C19846a<String> {

        /* renamed from: b */
        public static final C3592a f8254b = new C3592a();

        public C3592a() {
            super(0);
        }

        /* renamed from: a */
        public final String invoke() {
            return "Content Cards enabled in server config. Requesting Content Cards refresh.";
        }
    }

    public C3591b5(Context context) {
        C19383o.m32797g(context, "applicationContext");
        this.f8253a = context;
    }

    /* renamed from: a */
    public void mo13146a() {
        BrazeLogger.m11282d(BrazeLogger.f11932a, this, (BrazeLogger.Priority) null, (Throwable) null, C3592a.f8254b, 7);
        Braze.f11170m.mo15515f(this.f8253a).mo15509y(false);
    }
}
