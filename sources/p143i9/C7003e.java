package p143i9;

import android.app.Activity;
import android.os.Handler;
import android.os.Looper;
import com.etsy.android.lib.logger.C8672b;
import com.etsy.android.lib.logger.C8703p;
import com.google.android.play.core.review.C15734a;
import com.google.android.play.core.review.C15736c;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.C19383o;
import p145io.reactivex.internal.operators.single.SingleCreate;

/* renamed from: i9.e */
public final class C7003e {

    /* renamed from: a */
    public final C7007f f15555a;

    /* renamed from: b */
    public final C8672b f15556b;

    /* renamed from: c */
    public final C15734a f15557c;

    /* renamed from: d */
    public final Handler f15558d = new Handler(Looper.getMainLooper());

    /* renamed from: i9.e$a */
    public static abstract class C7004a {

        /* renamed from: i9.e$a$a */
        public static final class C7005a extends C7004a {

            /* renamed from: a */
            public static final C7005a f15559a = new C7005a();
        }

        /* renamed from: i9.e$a$b */
        public static final class C7006b extends C7004a {

            /* renamed from: a */
            public static final C7006b f15560a = new C7006b();
        }
    }

    public C7003e(C7007f fVar, C8703p pVar, C15736c cVar) {
        C19383o.m32797g(fVar, "eligibility");
        C19383o.m32797g(pVar, "analyticsTracker");
        this.f15555a = fVar;
        this.f15556b = pVar;
        this.f15557c = cVar;
    }

    /* renamed from: a */
    public final SingleCreate mo19183a(Activity activity) {
        C19383o.m32797g(activity, "activity");
        return new SingleCreate(new C6999a(this, new WeakReference(activity)));
    }
}
