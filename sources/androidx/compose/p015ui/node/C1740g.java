package androidx.compose.p015ui.node;

import androidx.compose.p015ui.layout.AlignmentLineKt;
import androidx.compose.p015ui.layout.C1665a;
import androidx.compose.p015ui.layout.C1679f;
import java.util.HashMap;
import kotlin.collections.C19294b0;
import kotlin.jvm.internal.C19383o;
import kotlin.reflect.C19421p;
import p173m.C7279a;
import p288y.C8343c;

/* renamed from: androidx.compose.ui.node.g */
public final class C1740g {

    /* renamed from: a */
    public final LayoutNode f3908a;

    /* renamed from: b */
    public boolean f3909b = true;

    /* renamed from: c */
    public boolean f3910c;

    /* renamed from: d */
    public boolean f3911d;

    /* renamed from: e */
    public boolean f3912e;

    /* renamed from: f */
    public boolean f3913f;

    /* renamed from: g */
    public boolean f3914g;

    /* renamed from: h */
    public LayoutNode f3915h;

    /* renamed from: i */
    public final HashMap f3916i = new HashMap();

    public C1740g(LayoutNode layoutNode) {
        C19383o.m32797g(layoutNode, "layoutNode");
        this.f3908a = layoutNode;
    }

    /* renamed from: b */
    public static final void m3827b(C1740g gVar, C1665a aVar, int i, LayoutNodeWrapper layoutNodeWrapper) {
        float f = (float) i;
        long q = C19421p.m32952q(f, f);
        while (true) {
            q = layoutNodeWrapper.mo6808s1(q);
            layoutNodeWrapper = layoutNodeWrapper.f3851g;
            C19383o.m32794d(layoutNodeWrapper);
            if (C19383o.m32792b(layoutNodeWrapper, gVar.f3908a.f3800D)) {
                break;
            } else if (layoutNodeWrapper.mo6789Z0().mo4345d().containsKey(aVar)) {
                float M = (float) layoutNodeWrapper.mo6661M(aVar);
                q = C19421p.m32952q(M, M);
            }
        }
        int l = aVar instanceof C1679f ? C7279a.m13954l(C8343c.m16643d(q)) : C7279a.m13954l(C8343c.m16642c(q));
        HashMap hashMap = gVar.f3916i;
        if (hashMap.containsKey(aVar)) {
            int intValue = ((Number) C19294b0.m32560q0(aVar, gVar.f3916i)).intValue();
            C1679f fVar = AlignmentLineKt.f3694a;
            C19383o.m32797g(aVar, "<this>");
            l = aVar.f3708a.invoke(Integer.valueOf(intValue), Integer.valueOf(l)).intValue();
        }
        hashMap.put(aVar, Integer.valueOf(l));
    }

    /* renamed from: a */
    public final boolean mo6898a() {
        return this.f3910c || this.f3912e || this.f3913f || this.f3914g;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0041, code lost:
        r0 = r0.f3836u;
     */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo6899c() {
        /*
            r2 = this;
            boolean r0 = r2.mo6898a()
            if (r0 == 0) goto L_0x0009
            androidx.compose.ui.node.LayoutNode r0 = r2.f3908a
            goto L_0x0049
        L_0x0009:
            androidx.compose.ui.node.LayoutNode r0 = r2.f3908a
            androidx.compose.ui.node.LayoutNode r0 = r0.mo6766w()
            if (r0 != 0) goto L_0x0012
            return
        L_0x0012:
            androidx.compose.ui.node.g r0 = r0.f3836u
            androidx.compose.ui.node.LayoutNode r0 = r0.f3915h
            if (r0 == 0) goto L_0x0021
            androidx.compose.ui.node.g r1 = r0.f3836u
            boolean r1 = r1.mo6898a()
            if (r1 == 0) goto L_0x0021
            goto L_0x0049
        L_0x0021:
            androidx.compose.ui.node.LayoutNode r0 = r2.f3915h
            if (r0 == 0) goto L_0x004b
            androidx.compose.ui.node.g r1 = r0.f3836u
            boolean r1 = r1.mo6898a()
            if (r1 == 0) goto L_0x002e
            goto L_0x004b
        L_0x002e:
            androidx.compose.ui.node.LayoutNode r1 = r0.mo6766w()
            if (r1 == 0) goto L_0x003b
            androidx.compose.ui.node.g r1 = r1.f3836u
            if (r1 == 0) goto L_0x003b
            r1.mo6899c()
        L_0x003b:
            androidx.compose.ui.node.LayoutNode r0 = r0.mo6766w()
            if (r0 == 0) goto L_0x0048
            androidx.compose.ui.node.g r0 = r0.f3836u
            if (r0 == 0) goto L_0x0048
            androidx.compose.ui.node.LayoutNode r0 = r0.f3915h
            goto L_0x0049
        L_0x0048:
            r0 = 0
        L_0x0049:
            r2.f3915h = r0
        L_0x004b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.p015ui.node.C1740g.mo6899c():void");
    }
}
