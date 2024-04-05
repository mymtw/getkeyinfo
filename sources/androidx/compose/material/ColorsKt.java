package androidx.compose.material;

import androidx.compose.p015ui.graphics.C1545s;
import androidx.compose.runtime.C1302d;
import androidx.compose.runtime.C1345l1;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.internal.C19383o;
import p628nj.C18263b;

public final class ColorsKt {

    /* renamed from: a */
    public static final C1345l1 f2187a = CompositionLocalKt.m2532c(ColorsKt$LocalColors$1.INSTANCE);

    /* renamed from: a */
    public static final long m2173a(C1259v vVar, long j) {
        C19383o.m32797g(vVar, "$this$contentColorFor");
        return C1545s.m3357c(j, vVar.mo5359f()) ? vVar.mo5356c() : C1545s.m3357c(j, vVar.mo5360g()) ? vVar.mo5356c() : C1545s.m3357c(j, vVar.mo5361h()) ? vVar.mo5357d() : C1545s.m3357c(j, vVar.mo5362i()) ? vVar.mo5357d() : C1545s.m3357c(j, vVar.mo5354a()) ? ((C1545s) vVar.f2641j.getValue()).f3366a : C1545s.m3357c(j, vVar.mo5363j()) ? vVar.mo5358e() : C1545s.m3357c(j, vVar.mo5355b()) ? ((C1545s) vVar.f2643l.getValue()).f3366a : C1545s.f3364i;
    }

    /* renamed from: b */
    public static final long m2174b(long j, C1302d dVar) {
        long a = m2173a((C1259v) dVar.mo5410J(f2187a), j);
        return (a > C1545s.f3364i ? 1 : (a == C1545s.f3364i ? 0 : -1)) != 0 ? a : ((C1545s) dVar.mo5410J(ContentColorKt.f2199a)).f3366a;
    }

    /* renamed from: c */
    public static final long m2175c(C1259v vVar) {
        C19383o.m32797g(vVar, "<this>");
        return vVar.mo5364k() ? vVar.mo5359f() : vVar.mo5363j();
    }

    /* renamed from: d */
    public static C1259v m2176d(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, int i) {
        int i2 = i;
        return new C1259v((i2 & 1) != 0 ? C18263b.m30836c(4284612846L) : j, (i2 & 2) != 0 ? C18263b.m30836c(4281794739L) : j2, (i2 & 4) != 0 ? C18263b.m30836c(4278442694L) : j3, (i2 & 8) != 0 ? C18263b.m30836c(4278290310L) : 0, (i2 & 16) != 0 ? C1545s.f3358c : j4, (i2 & 32) != 0 ? C1545s.f3358c : j5, (i2 & 64) != 0 ? C18263b.m30836c(4289724448L) : j6, (i2 & 128) != 0 ? C1545s.f3358c : j7, (i2 & 256) != 0 ? C1545s.f3357b : j8, (i2 & RecyclerView.C3084b0.FLAG_ADAPTER_POSITION_UNKNOWN) != 0 ? C1545s.f3357b : j9, (i2 & RecyclerView.C3084b0.FLAG_ADAPTER_FULLUPDATE) != 0 ? C1545s.f3357b : j10, (i2 & RecyclerView.C3084b0.FLAG_MOVED) != 0 ? C1545s.f3358c : j11, true);
    }
}
