package p030bo.app;

import android.support.p013v4.media.C0071c;
import android.support.p013v4.media.C0072d;
import androidx.core.widget.NestedScrollView;
import com.braze.support.BrazeLogger;
import java.util.Random;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref$IntRef;
import p753kq.C19846a;

/* renamed from: bo.app.d1 */
public final class C3615d1 implements C4172s1 {

    /* renamed from: e */
    public static final C3616a f8321e = new C3616a((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final int f8322a;

    /* renamed from: b */
    private final int f8323b;

    /* renamed from: c */
    private final Random f8324c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public int f8325d;

    /* renamed from: bo.app.d1$a */
    public static final class C3616a {
        private C3616a() {
        }

        public /* synthetic */ C3616a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final int mo13192a(Random random, int i, int i2) {
            C19383o.m32797g(random, "random");
            return Math.min(i, i2) + random.nextInt(Math.abs(i - i2) + 1);
        }
    }

    /* renamed from: bo.app.d1$b */
    public static final class C3617b extends Lambda implements C19846a<String> {

        /* renamed from: b */
        public final /* synthetic */ Ref$IntRef f8326b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C3617b(Ref$IntRef ref$IntRef) {
            super(0);
            this.f8326b = ref$IntRef;
        }

        /* renamed from: a */
        public final String invoke() {
            return C0071c.m191c(C0072d.m201h("Sleep time too small: "), this.f8326b.element, " increasing to 250");
        }
    }

    /* renamed from: bo.app.d1$c */
    public static final class C3618c extends Lambda implements C19846a<String> {

        /* renamed from: b */
        public final /* synthetic */ C3615d1 f8327b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C3618c(C3615d1 d1Var) {
            super(0);
            this.f8327b = d1Var;
        }

        /* renamed from: a */
        public final String invoke() {
            return C19383o.m32802l(Integer.valueOf(this.f8327b.f8325d), "Computing new sleep delay. Previous sleep delay: ");
        }
    }

    /* renamed from: bo.app.d1$d */
    public static final class C3619d extends Lambda implements C19846a<String> {

        /* renamed from: b */
        public final /* synthetic */ C3615d1 f8328b;

        /* renamed from: c */
        public final /* synthetic */ Ref$IntRef f8329c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C3619d(C3615d1 d1Var, Ref$IntRef ref$IntRef) {
            super(0);
            this.f8328b = d1Var;
            this.f8329c = ref$IntRef;
        }

        /* renamed from: a */
        public final String invoke() {
            StringBuilder h = C0072d.m201h("New sleep duration: ");
            h.append(this.f8328b.f8325d);
            h.append(" ms. Default sleep duration: ");
            h.append(this.f8329c.element);
            h.append(" ms. Max sleep: ");
            h.append(this.f8328b.f8322a);
            h.append(" ms.");
            return h.toString();
        }
    }

    public C3615d1(int i, int i2) {
        this.f8322a = i;
        this.f8323b = i2;
        this.f8324c = new Random();
    }

    /* renamed from: c */
    public void mo13191c() {
        this.f8325d = 0;
    }

    /* renamed from: a */
    public int mo13188a() {
        return mo13189a(this.f8323b);
    }

    /* renamed from: b */
    public boolean mo13190b() {
        return this.f8325d != 0;
    }

    /* renamed from: a */
    public int mo13189a(int i) {
        Ref$IntRef ref$IntRef = new Ref$IntRef();
        ref$IntRef.element = i;
        if (i < 250) {
            BrazeLogger.m11282d(BrazeLogger.f11932a, this, (BrazeLogger.Priority) null, (Throwable) null, new C3617b(ref$IntRef), 7);
            ref$IntRef.element = NestedScrollView.ANIMATED_SCROLL_GAP;
        }
        if (this.f8325d == 0) {
            this.f8325d = NestedScrollView.ANIMATED_SCROLL_GAP;
        }
        BrazeLogger brazeLogger = BrazeLogger.f11932a;
        BrazeLogger.m11282d(brazeLogger, this, (BrazeLogger.Priority) null, (Throwable) null, new C3618c(this), 7);
        this.f8325d = Math.min(this.f8322a, f8321e.mo13192a(this.f8324c, Math.max(ref$IntRef.element, this.f8325d), this.f8325d * 3));
        BrazeLogger.m11282d(brazeLogger, this, (BrazeLogger.Priority) null, (Throwable) null, new C3619d(this, ref$IntRef), 7);
        return this.f8325d;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C3615d1(int i, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, (i3 & 2) != 0 ? (int) TimeUnit.SECONDS.toMillis(1) : i2);
    }
}
