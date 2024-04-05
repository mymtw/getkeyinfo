package androidx.compose.foundation.text.selection;

import androidx.compose.p015ui.unit.LayoutDirection;
import androidx.compose.p015ui.window.C2092e;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.C19383o;
import kotlin.reflect.C19421p;
import p174m0.C7287g;
import p174m0.C7289h;

/* renamed from: androidx.compose.foundation.text.selection.c */
public final class C1006c implements C2092e {

    /* renamed from: a */
    public final HandleReferencePoint f2115a;

    /* renamed from: b */
    public final long f2116b;

    /* renamed from: androidx.compose.foundation.text.selection.c$a */
    public /* synthetic */ class C1007a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f2117a;

        static {
            int[] iArr = new int[HandleReferencePoint.values().length];
            iArr[HandleReferencePoint.TopLeft.ordinal()] = 1;
            iArr[HandleReferencePoint.TopRight.ordinal()] = 2;
            iArr[HandleReferencePoint.TopMiddle.ordinal()] = 3;
            f2117a = iArr;
        }
    }

    public C1006c(HandleReferencePoint handleReferencePoint, long j) {
        this.f2115a = handleReferencePoint;
        this.f2116b = j;
    }

    /* renamed from: a */
    public final long mo4694a(C7289h hVar, long j, LayoutDirection layoutDirection, long j2) {
        C19383o.m32797g(layoutDirection, "layoutDirection");
        int i = C1007a.f2117a[this.f2115a.ordinal()];
        if (i == 1) {
            int i2 = hVar.f16167a;
            long j3 = this.f2116b;
            int i3 = C7287g.f16165c;
            return C19421p.m32949o(i2 + ((int) (j3 >> 32)), C7287g.m13992b(j3) + hVar.f16168b);
        } else if (i == 2) {
            int i4 = hVar.f16167a;
            long j4 = this.f2116b;
            int i5 = C7287g.f16165c;
            return C19421p.m32949o((i4 + ((int) (j4 >> 32))) - ((int) (j2 >> 32)), C7287g.m13992b(j4) + hVar.f16168b);
        } else if (i == 3) {
            int i6 = hVar.f16167a;
            long j5 = this.f2116b;
            int i7 = C7287g.f16165c;
            return C19421p.m32949o((i6 + ((int) (j5 >> 32))) - (((int) (j2 >> 32)) / 2), C7287g.m13992b(j5) + hVar.f16168b);
        } else {
            throw new NoWhenBranchMatchedException();
        }
    }
}
