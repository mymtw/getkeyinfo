package androidx.compose.p015ui.platform;

import android.view.View;
import androidx.compose.runtime.C1300c0;
import androidx.compose.runtime.PausableMonotonicFrameClock;
import androidx.compose.runtime.Recomposer;
import androidx.lifecycle.C2885q;
import androidx.lifecycle.C2887s;
import androidx.lifecycle.Lifecycle;
import java.util.List;
import kotlin.C19394m;
import kotlin.Result;
import kotlin.coroutines.C19340c;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlinx.coroutines.C19525d0;
import kotlinx.coroutines.C19697g;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.internal.C19721f;

/* renamed from: androidx.compose.ui.platform.WindowRecomposer_androidKt$createLifecycleAwareWindowRecomposer$2 */
public final class C1802xff837ba9 implements C2885q {

    /* renamed from: b */
    public final /* synthetic */ C19525d0 f4052b;

    /* renamed from: c */
    public final /* synthetic */ PausableMonotonicFrameClock f4053c;

    /* renamed from: d */
    public final /* synthetic */ Recomposer f4054d;

    /* renamed from: e */
    public final /* synthetic */ Ref$ObjectRef<C1868r0> f4055e;

    /* renamed from: f */
    public final /* synthetic */ View f4056f;

    /* renamed from: androidx.compose.ui.platform.WindowRecomposer_androidKt$createLifecycleAwareWindowRecomposer$2$a */
    public /* synthetic */ class C1803a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f4057a;

        static {
            int[] iArr = new int[Lifecycle.Event.values().length];
            iArr[Lifecycle.Event.ON_CREATE.ordinal()] = 1;
            iArr[Lifecycle.Event.ON_START.ordinal()] = 2;
            iArr[Lifecycle.Event.ON_STOP.ordinal()] = 3;
            iArr[Lifecycle.Event.ON_DESTROY.ordinal()] = 4;
            iArr[Lifecycle.Event.ON_PAUSE.ordinal()] = 5;
            iArr[Lifecycle.Event.ON_RESUME.ordinal()] = 6;
            iArr[Lifecycle.Event.ON_ANY.ordinal()] = 7;
            f4057a = iArr;
        }
    }

    public C1802xff837ba9(C19721f fVar, PausableMonotonicFrameClock pausableMonotonicFrameClock, Recomposer recomposer, Ref$ObjectRef ref$ObjectRef, View view) {
        this.f4052b = fVar;
        this.f4053c = pausableMonotonicFrameClock;
        this.f4054d = recomposer;
        this.f4055e = ref$ObjectRef;
        this.f4056f = view;
    }

    public final void onStateChanged(C2887s sVar, Lifecycle.Event event) {
        boolean z;
        int i = C1803a.f4057a[event.ordinal()];
        if (i != 1) {
            if (i == 2) {
                PausableMonotonicFrameClock pausableMonotonicFrameClock = this.f4053c;
                if (pausableMonotonicFrameClock != null) {
                    C1300c0 c0Var = pausableMonotonicFrameClock.f2770c;
                    synchronized (c0Var.f2816a) {
                        synchronized (c0Var.f2816a) {
                            z = c0Var.f2819d;
                        }
                        if (!z) {
                            List<C19340c<C19394m>> list = c0Var.f2817b;
                            c0Var.f2817b = c0Var.f2818c;
                            c0Var.f2818c = list;
                            c0Var.f2819d = true;
                            int size = list.size();
                            for (int i2 = 0; i2 < size; i2++) {
                                list.get(i2).resumeWith(Result.m35480constructorimpl(C19394m.f43287a));
                            }
                            list.clear();
                            C19394m mVar = C19394m.f43287a;
                        }
                    }
                }
            } else if (i == 3) {
                PausableMonotonicFrameClock pausableMonotonicFrameClock2 = this.f4053c;
                if (pausableMonotonicFrameClock2 != null) {
                    C1300c0 c0Var2 = pausableMonotonicFrameClock2.f2770c;
                    synchronized (c0Var2.f2816a) {
                        c0Var2.f2819d = false;
                        C19394m mVar2 = C19394m.f43287a;
                    }
                }
            } else if (i == 4) {
                this.f4054d.mo5575y();
            }
        } else {
            C19697g.m33468f(this.f4052b, (CoroutineContext) null, CoroutineStart.UNDISPATCHED, new C1804x149b840a(this.f4055e, this.f4054d, sVar, this, this.f4056f, (C19340c<? super C1804x149b840a>) null), 1);
        }
    }
}
