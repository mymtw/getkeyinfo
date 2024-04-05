package androidx.compose.material;

import androidx.compose.p015ui.semantics.C1894a;
import androidx.compose.p015ui.semantics.C1902i;
import androidx.compose.p015ui.semantics.C1908o;
import androidx.compose.p015ui.semantics.C1910q;
import java.util.List;
import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.C19410j;
import p753kq.C19857l;
import p764pq.C20053e;

public final class SliderKt$sliderSemantics$1 extends Lambda implements C19857l<C1910q, C19394m> {
    public final /* synthetic */ float $coerced;
    public final /* synthetic */ boolean $enabled;
    public final /* synthetic */ C19857l<Float, C19394m> $onValueChange;
    public final /* synthetic */ int $steps;
    public final /* synthetic */ List<Float> $tickFractions;
    public final /* synthetic */ C20053e<Float> $valueRange;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SliderKt$sliderSemantics$1(boolean z, C20053e<Float> eVar, int i, List<Float> list, float f, C19857l<? super Float, C19394m> lVar) {
        super(1);
        this.$enabled = z;
        this.$valueRange = eVar;
        this.$steps = i;
        this.$tickFractions = list;
        this.$coerced = f;
        this.$onValueChange = lVar;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((C1910q) obj);
        return C19394m.f43287a;
    }

    public final void invoke(C1910q qVar) {
        C19383o.m32797g(qVar, "$this$semantics");
        if (!this.$enabled) {
            C1908o.m4195b(qVar);
        }
        final C20053e<Float> eVar = this.$valueRange;
        final int i = this.$steps;
        final List<Float> list = this.$tickFractions;
        final float f = this.$coerced;
        final C19857l<Float, C19394m> lVar = this.$onValueChange;
        C11261 r1 = new C19857l<Float, Boolean>() {
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                return invoke(((Number) obj).floatValue());
            }

            /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v3, resolved type: java.lang.Number} */
            /* JADX WARNING: Multi-variable type inference failed */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final java.lang.Boolean invoke(float r7) {
                /*
                    r6 = this;
                    pq.e<java.lang.Float> r0 = r2
                    java.lang.Comparable r0 = r0.mo74309c()
                    java.lang.Number r0 = (java.lang.Number) r0
                    float r0 = r0.floatValue()
                    pq.e<java.lang.Float> r1 = r2
                    java.lang.Comparable r1 = r1.mo74311g()
                    java.lang.Number r1 = (java.lang.Number) r1
                    float r1 = r1.floatValue()
                    float r7 = kotlin.jvm.internal.C19388s.m32831L(r7, r0, r1)
                    int r0 = r3
                    if (r0 <= 0) goto L_0x00ac
                    java.util.List<java.lang.Float> r0 = r4
                    pq.e<java.lang.Float> r1 = r2
                    java.util.ArrayList r2 = new java.util.ArrayList
                    int r3 = kotlin.collections.C19322o.m32624F0(r0)
                    r2.<init>(r3)
                    java.util.Iterator r0 = r0.iterator()
                L_0x0031:
                    boolean r3 = r0.hasNext()
                    if (r3 == 0) goto L_0x0061
                    java.lang.Object r3 = r0.next()
                    java.lang.Number r3 = (java.lang.Number) r3
                    float r3 = r3.floatValue()
                    java.lang.Comparable r4 = r1.mo74309c()
                    java.lang.Number r4 = (java.lang.Number) r4
                    float r4 = r4.floatValue()
                    java.lang.Comparable r5 = r1.mo74311g()
                    java.lang.Number r5 = (java.lang.Number) r5
                    float r5 = r5.floatValue()
                    float r3 = com.google.android.play.core.assetpacks.C15588c1.m25354w0(r4, r5, r3)
                    java.lang.Float r3 = java.lang.Float.valueOf(r3)
                    r2.add(r3)
                    goto L_0x0031
                L_0x0061:
                    java.util.Iterator r0 = r2.iterator()
                    boolean r1 = r0.hasNext()
                    if (r1 != 0) goto L_0x006d
                    r0 = 0
                    goto L_0x00a4
                L_0x006d:
                    java.lang.Object r1 = r0.next()
                    boolean r2 = r0.hasNext()
                    if (r2 != 0) goto L_0x0079
                L_0x0077:
                    r0 = r1
                    goto L_0x00a4
                L_0x0079:
                    r2 = r1
                    java.lang.Number r2 = (java.lang.Number) r2
                    float r2 = r2.floatValue()
                    float r2 = r2 - r7
                    float r2 = java.lang.Math.abs(r2)
                L_0x0085:
                    java.lang.Object r3 = r0.next()
                    r4 = r3
                    java.lang.Number r4 = (java.lang.Number) r4
                    float r4 = r4.floatValue()
                    float r4 = r4 - r7
                    float r4 = java.lang.Math.abs(r4)
                    int r5 = java.lang.Float.compare(r2, r4)
                    if (r5 <= 0) goto L_0x009d
                    r1 = r3
                    r2 = r4
                L_0x009d:
                    boolean r3 = r0.hasNext()
                    if (r3 != 0) goto L_0x0085
                    goto L_0x0077
                L_0x00a4:
                    java.lang.Float r0 = (java.lang.Float) r0
                    if (r0 == 0) goto L_0x00ac
                    float r7 = r0.floatValue()
                L_0x00ac:
                    float r0 = r5
                    int r0 = (r7 > r0 ? 1 : (r7 == r0 ? 0 : -1))
                    r1 = 1
                    r2 = 0
                    if (r0 != 0) goto L_0x00b6
                    r0 = r1
                    goto L_0x00b7
                L_0x00b6:
                    r0 = r2
                L_0x00b7:
                    if (r0 == 0) goto L_0x00bb
                    r1 = r2
                    goto L_0x00c4
                L_0x00bb:
                    kq.l<java.lang.Float, kotlin.m> r0 = r6
                    java.lang.Float r7 = java.lang.Float.valueOf(r7)
                    r0.invoke(r7)
                L_0x00c4:
                    java.lang.Boolean r7 = java.lang.Boolean.valueOf(r1)
                    return r7
                */
                throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.SliderKt$sliderSemantics$1.C11261.invoke(float):java.lang.Boolean");
            }
        };
        C19410j<Object>[] jVarArr = C1908o.f4253a;
        qVar.mo7342a(C1902i.f4235f, new C1894a((String) null, r1));
    }
}
