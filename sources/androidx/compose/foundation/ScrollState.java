package androidx.compose.foundation;

import androidx.compose.foundation.gestures.C0614l;
import androidx.compose.foundation.gestures.C0615m;
import androidx.compose.foundation.gestures.DefaultScrollableState;
import androidx.compose.foundation.interaction.C0641k;
import androidx.compose.foundation.layout.C0761x;
import androidx.compose.runtime.C1351n1;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import androidx.compose.runtime.saveable.C1374h;
import androidx.compose.runtime.saveable.SaverKt;
import com.google.android.gms.common.api.Api;
import kotlin.C19394m;
import kotlin.coroutines.C19340c;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import p753kq.C19861p;

public final class ScrollState implements C0615m {

    /* renamed from: f */
    public static final C1374h f1279f = SaverKt.m2861a(ScrollState$Companion$Saver$1.INSTANCE, ScrollState$Companion$Saver$2.INSTANCE);

    /* renamed from: a */
    public final ParcelableSnapshotMutableState f1280a;

    /* renamed from: b */
    public final C0641k f1281b = new C0641k();

    /* renamed from: c */
    public ParcelableSnapshotMutableState f1282c;

    /* renamed from: d */
    public float f1283d;

    /* renamed from: e */
    public final DefaultScrollableState f1284e;

    public ScrollState(int i) {
        Integer valueOf = Integer.valueOf(i);
        C1351n1 n1Var = C1351n1.f2948a;
        this.f1280a = C0761x.m1751w0(valueOf, n1Var);
        this.f1282c = C0761x.m1751w0(Integer.valueOf(Api.BaseClientBuilder.API_PRIORITY_OTHER), n1Var);
        this.f1284e = new DefaultScrollableState(new ScrollState$scrollableState$1(this));
    }

    /* renamed from: a */
    public final Object mo3690a(MutatePriority mutatePriority, C19861p<? super C0614l, ? super C19340c<? super C19394m>, ? extends Object> pVar, C19340c<? super C19394m> cVar) {
        Object a = this.f1284e.mo3690a(mutatePriority, pVar, cVar);
        return a == CoroutineSingletons.COROUTINE_SUSPENDED ? a : C19394m.f43287a;
    }

    /* renamed from: b */
    public final boolean mo3691b() {
        return this.f1284e.mo3691b();
    }

    /* renamed from: d */
    public final float mo3692d(float f) {
        return this.f1284e.mo3692d(f);
    }

    /* renamed from: e */
    public final int mo3693e() {
        return ((Number) this.f1280a.getValue()).intValue();
    }
}
