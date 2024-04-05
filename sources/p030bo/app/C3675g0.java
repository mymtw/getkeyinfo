package p030bo.app;

import android.content.Context;
import com.braze.configuration.BrazeConfigurationProvider;
import com.etsy.android.lib.models.ResponseConstants;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: bo.app.g0 */
public final class C3675g0 extends BrazeConfigurationProvider {

    /* renamed from: a */
    public static final C3676a f8429a = new C3676a((DefaultConstructorMarker) null);

    /* renamed from: bo.app.g0$a */
    public static final class C3676a {
        private C3676a() {
        }

        public /* synthetic */ C3676a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C3675g0(Context context) {
        super(context);
        C19383o.m32797g(context, ResponseConstants.CONTEXT);
    }

    /* renamed from: a */
    public final long mo13311a() {
        return ((long) getIntValue(BrazeConfigurationProvider.C5384b.DATA_SYNC_BAD_NETWORK_INTERVAL_KEY.mo15858b(), 60)) * 1000;
    }

    /* renamed from: b */
    public final long mo13312b() {
        return ((long) getIntValue(BrazeConfigurationProvider.C5384b.DATA_SYNC_GOOD_NETWORK_INTERVAL_KEY.mo15858b(), 30)) * 1000;
    }

    /* renamed from: c */
    public final long mo13313c() {
        return ((long) getIntValue(BrazeConfigurationProvider.C5384b.DATA_SYNC_GREAT_NETWORK_INTERVAL_KEY.mo15858b(), 10)) * 1000;
    }
}
