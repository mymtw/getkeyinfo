package androidx.compose.foundation;

import androidx.compose.p015ui.graphics.C1533m;
import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import p288y.C8341a;
import p288y.C8347f;
import p297z.C8406a;
import p297z.C8410c;
import p297z.C8412e;
import p297z.C8416i;
import p753kq.C19857l;

final class BorderKt$drawRoundRectBorder$1 extends Lambda implements C19857l<C8410c, C19394m> {
    public final /* synthetic */ long $borderSize;
    public final /* synthetic */ C8416i $borderStroke;
    public final /* synthetic */ C1533m $brush;
    public final /* synthetic */ long $cornerRadius;
    public final /* synthetic */ boolean $fillArea;
    public final /* synthetic */ float $halfStroke;
    public final /* synthetic */ float $strokeWidth;
    public final /* synthetic */ long $topLeft;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BorderKt$drawRoundRectBorder$1(boolean z, C1533m mVar, long j, float f, float f2, long j2, long j3, C8416i iVar) {
        super(1);
        this.$fillArea = z;
        this.$brush = mVar;
        this.$cornerRadius = j;
        this.$halfStroke = f;
        this.$strokeWidth = f2;
        this.$topLeft = j2;
        this.$borderSize = j3;
        this.$borderStroke = iVar;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((C8410c) obj);
        return C19394m.f43287a;
    }

    public final void invoke(C8410c cVar) {
        C19383o.m32797g(cVar, "$this$onDrawWithContent");
        cVar.mo6911O0();
        if (this.$fillArea) {
            C8412e.m16783H0(cVar, this.$brush, 0, 0, this.$cornerRadius, (C8416i) null, 246);
            return;
        }
        float b = C8341a.m16635b(this.$cornerRadius);
        float f = this.$halfStroke;
        if (b < f) {
            float f2 = this.$strokeWidth;
            float d = C8347f.m16656d(cVar.mo6913b()) - this.$strokeWidth;
            float b2 = C8347f.m16654b(cVar.mo6913b()) - this.$strokeWidth;
            C1533m mVar = this.$brush;
            long j = this.$cornerRadius;
            C8406a.C8408b C0 = cVar.mo6900C0();
            long b3 = C0.mo20992b();
            C0.mo20991a().mo6264r();
            C0.f18430a.mo20995b(f2, f2, d, b2, 0);
            C8412e.m16783H0(cVar, mVar, 0, 0, j, (C8416i) null, 246);
            C0.mo20991a().mo6261m();
            C0.mo20993c(b3);
            return;
        }
        C8412e.m16783H0(cVar, this.$brush, this.$topLeft, this.$borderSize, C0555f.m1344c(this.$cornerRadius, f), this.$borderStroke, 208);
    }
}
