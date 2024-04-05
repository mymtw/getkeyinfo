package androidx.compose.foundation.text;

import androidx.activity.C0114h;
import androidx.compose.foundation.text.selection.C1018l;
import androidx.compose.p015ui.layout.AlignmentLineKt;
import androidx.compose.p015ui.layout.C1710u;
import androidx.compose.p015ui.layout.C1711v;
import androidx.compose.p015ui.layout.C1712w;
import androidx.compose.p015ui.layout.C1713x;
import androidx.compose.p015ui.node.LayoutNode;
import androidx.compose.p015ui.text.C2021q;
import androidx.compose.p015ui.text.MultiParagraphIntrinsics;
import com.google.android.gms.common.api.Api;
import java.util.ArrayList;
import java.util.List;
import kotlin.C19394m;
import kotlin.Pair;
import kotlin.collections.C19294b0;
import kotlin.jvm.internal.C19383o;
import kotlin.reflect.C19421p;
import p173m.C7279a;
import p174m0.C7287g;
import p174m0.C7290i;
import p288y.C8345d;

public final class TextController$measurePolicy$1 implements C1711v {

    /* renamed from: a */
    public final /* synthetic */ TextController f1934a;

    public TextController$measurePolicy$1(TextController textController) {
        this.f1934a = textController;
    }

    /* renamed from: a */
    public final int mo3259a(LayoutNode.C1725f fVar, List list, int i) {
        C19383o.m32797g(fVar, "<this>");
        this.f1934a.f1923b.f1961a.mo4576b(fVar.f3844b.f3834s);
        MultiParagraphIntrinsics multiParagraphIntrinsics = this.f1934a.f1923b.f1961a.f2021i;
        if (multiParagraphIntrinsics != null) {
            return (int) ((float) Math.ceil((double) multiParagraphIntrinsics.mo7364b()));
        }
        throw new IllegalStateException("layoutIntrinsics must be called first");
    }

    /* renamed from: b */
    public final C1712w mo3260b(C1713x xVar, List<? extends C1710u> list, long j) {
        C1018l lVar;
        C19383o.m32797g(xVar, "$this$measure");
        C19383o.m32797g(list, "measurables");
        TextState textState = this.f1934a.f1923b;
        C2021q qVar = textState.f1966f;
        C2021q a = textState.f1961a.mo4575a(j, xVar.getLayoutDirection(), qVar);
        if (!C19383o.m32792b(qVar, a)) {
            this.f1934a.f1923b.f1963c.invoke(a);
            if (qVar != null) {
                TextController textController = this.f1934a;
                if (!C19383o.m32792b(qVar.f4589a.f4556a, a.f4589a.f4556a) && (lVar = textController.f1924c) != null) {
                    lVar.mo4717f(textController.f1923b.f1962b);
                }
            }
        }
        TextState textState2 = this.f1934a.f1923b;
        textState2.getClass();
        textState2.f1969i.setValue(C19394m.f43287a);
        textState2.f1966f = a;
        if (list.size() >= a.f4594f.size()) {
            ArrayList arrayList = a.f4594f;
            ArrayList arrayList2 = new ArrayList(arrayList.size());
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                C8345d dVar = (C8345d) arrayList.get(i);
                Pair pair = dVar != null ? new Pair(((C1710u) list.get(i)).mo6665J(C0114h.m315r((int) ((float) Math.floor((double) (dVar.f18303c - dVar.f18301a))), (int) ((float) Math.floor((double) (dVar.f18304d - dVar.f18302b))), 5)), new C7287g(C19421p.m32949o(C7279a.m13954l(dVar.f18301a), C7279a.m13954l(dVar.f18302b)))) : null;
                if (pair != null) {
                    arrayList2.add(pair);
                }
            }
            long j2 = a.f4591c;
            return xVar.mo4387Z((int) (j2 >> 32), C7290i.m13995b(j2), C19294b0.m32562s0(new Pair(AlignmentLineKt.f3694a, Integer.valueOf(C7279a.m13954l(a.f4592d))), new Pair(AlignmentLineKt.f3695b, Integer.valueOf(C7279a.m13954l(a.f4593e)))), new TextController$measurePolicy$1$measure$2(arrayList2));
        }
        throw new IllegalStateException("Check failed.".toString());
    }

    /* renamed from: c */
    public final int mo3261c(LayoutNode.C1725f fVar, List list, int i) {
        C19383o.m32797g(fVar, "<this>");
        this.f1934a.f1923b.f1961a.mo4576b(fVar.f3844b.f3834s);
        MultiParagraphIntrinsics multiParagraphIntrinsics = this.f1934a.f1923b.f1961a.f2021i;
        if (multiParagraphIntrinsics != null) {
            return (int) ((float) Math.ceil((double) multiParagraphIntrinsics.mo7365c()));
        }
        throw new IllegalStateException("layoutIntrinsics must be called first");
    }

    /* renamed from: d */
    public final int mo3262d(LayoutNode.C1725f fVar, List list, int i) {
        C19383o.m32797g(fVar, "<this>");
        return C7290i.m13995b(this.f1934a.f1923b.f1961a.mo4575a(C0114h.m313q(0, i, 0, Api.BaseClientBuilder.API_PRIORITY_OTHER), fVar.f3844b.f3834s, (C2021q) null).f4591c);
    }

    /* renamed from: e */
    public final int mo3263e(LayoutNode.C1725f fVar, List list, int i) {
        C19383o.m32797g(fVar, "<this>");
        return C7290i.m13995b(this.f1934a.f1923b.f1961a.mo4575a(C0114h.m313q(0, i, 0, Api.BaseClientBuilder.API_PRIORITY_OTHER), fVar.f3844b.f3834s, (C2021q) null).f4591c);
    }
}
