package androidx.compose.material;

import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.C0424f;
import androidx.compose.animation.core.VectorConvertersKt;
import androidx.compose.foundation.interaction.C0632b;
import androidx.compose.foundation.interaction.C0635e;
import androidx.compose.foundation.interaction.C0638h;
import androidx.compose.foundation.interaction.C0640j;
import androidx.compose.foundation.interaction.C0643m;
import androidx.compose.runtime.C1302d;
import androidx.compose.runtime.C1415u;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import kotlin.collections.C19327t;
import kotlin.coroutines.C19340c;
import kotlin.jvm.internal.C19383o;
import p174m0.C7284d;

/* renamed from: androidx.compose.material.b0 */
public final class C1168b0 implements C1263w0 {

    /* renamed from: a */
    public final float f2380a;

    /* renamed from: b */
    public final float f2381b;

    /* renamed from: c */
    public final float f2382c;

    /* renamed from: d */
    public final float f2383d;

    public C1168b0(float f, float f2, float f3, float f4) {
        this.f2380a = f;
        this.f2381b = f2;
        this.f2382c = f3;
        this.f2383d = f4;
    }

    /* renamed from: a */
    public final C0424f mo5230a(C0640j jVar, C1302d dVar, int i) {
        C19383o.m32797g(jVar, "interactionSource");
        dVar.mo5465u(-478475335);
        dVar.mo5465u(-492369756);
        Object v = dVar.mo5467v();
        C1302d.C1303a.C1304a aVar = C1302d.C1303a.f2828a;
        if (v == aVar) {
            v = new SnapshotStateList();
            dVar.mo5454o(v);
        }
        dVar.mo5406H();
        SnapshotStateList snapshotStateList = (SnapshotStateList) v;
        C1415u.m3031e(jVar, new DefaultFloatingActionButtonElevation$elevation$1(jVar, snapshotStateList, (C19340c<? super DefaultFloatingActionButtonElevation$elevation$1>) null), dVar);
        C0638h hVar = (C0638h) C19327t.m32646b1(snapshotStateList);
        float f = hVar instanceof C0643m ? this.f2381b : hVar instanceof C0635e ? this.f2382c : hVar instanceof C0632b ? this.f2383d : this.f2380a;
        dVar.mo5465u(-492369756);
        Object v2 = dVar.mo5467v();
        if (v2 == aVar) {
            v2 = new Animatable(new C7284d(f), VectorConvertersKt.f1078c, null);
            dVar.mo5454o(v2);
        }
        dVar.mo5406H();
        Animatable animatable = (Animatable) v2;
        C1415u.m3031e(new C7284d(f), new DefaultFloatingActionButtonElevation$elevation$2(animatable, this, f, hVar, (C19340c<? super DefaultFloatingActionButtonElevation$elevation$2>) null), dVar);
        C0424f<T, V> fVar = animatable.f1008c;
        dVar.mo5406H();
        return fVar;
    }
}
