package androidx.compose.material;

import androidx.compose.p015ui.graphics.C1545s;
import androidx.compose.p015ui.graphics.C1546t;
import androidx.compose.p015ui.unit.LayoutDirection;
import androidx.compose.runtime.C1342k1;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.C19394m;
import kotlin.collections.C19322o;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.C19421p;
import p288y.C8343c;
import p288y.C8347f;
import p297z.C8412e;
import p628nj.C18263b;
import p753kq.C19857l;

public final class SliderKt$Track$1 extends Lambda implements C19857l<C8412e, C19394m> {
    public final /* synthetic */ C1342k1<C1545s> $activeTickColor;
    public final /* synthetic */ C1342k1<C1545s> $activeTrackColor;
    public final /* synthetic */ C1342k1<C1545s> $inactiveTickColor;
    public final /* synthetic */ C1342k1<C1545s> $inactiveTrackColor;
    public final /* synthetic */ float $positionFractionEnd;
    public final /* synthetic */ float $positionFractionStart;
    public final /* synthetic */ float $thumbPx;
    public final /* synthetic */ List<Float> $tickFractions;
    public final /* synthetic */ float $trackStrokeWidth;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SliderKt$Track$1(float f, C1342k1<C1545s> k1Var, float f2, float f3, float f4, C1342k1<C1545s> k1Var2, List<Float> list, C1342k1<C1545s> k1Var3, C1342k1<C1545s> k1Var4) {
        super(1);
        this.$thumbPx = f;
        this.$inactiveTrackColor = k1Var;
        this.$trackStrokeWidth = f2;
        this.$positionFractionEnd = f3;
        this.$positionFractionStart = f4;
        this.$activeTrackColor = k1Var2;
        this.$tickFractions = list;
        this.$inactiveTickColor = k1Var3;
        this.$activeTickColor = k1Var4;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((C8412e) obj);
        return C19394m.f43287a;
    }

    public final void invoke(C8412e eVar) {
        C19383o.m32797g(eVar, "$this$Canvas");
        boolean z = eVar.getLayoutDirection() == LayoutDirection.Rtl;
        long q = C19421p.m32952q(this.$thumbPx, C8343c.m16643d(eVar.mo6907K0()));
        long q2 = C19421p.m32952q(C8347f.m16656d(eVar.mo6913b()) - this.$thumbPx, C8343c.m16643d(eVar.mo6907K0()));
        long j = z ? q2 : q;
        long j2 = z ? q : q2;
        long j3 = j;
        C8412e.m16787d0(eVar, this.$inactiveTrackColor.getValue().f3366a, j, j2, this.$trackStrokeWidth, 1, 480);
        C8412e.m16787d0(eVar, this.$activeTrackColor.getValue().f3366a, C19421p.m32952q(((C8343c.m16642c(j2) - C8343c.m16642c(j3)) * this.$positionFractionStart) + C8343c.m16642c(j3), C8343c.m16643d(eVar.mo6907K0())), C19421p.m32952q(((C8343c.m16642c(j2) - C8343c.m16642c(j3)) * this.$positionFractionEnd) + C8343c.m16642c(j3), C8343c.m16643d(eVar.mo6907K0())), this.$trackStrokeWidth, 1, 480);
        List<Float> list = this.$tickFractions;
        float f = this.$positionFractionEnd;
        float f2 = this.$positionFractionStart;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (T next : list) {
            float floatValue = ((Number) next).floatValue();
            Boolean valueOf = Boolean.valueOf(floatValue > f || floatValue < f2);
            Object obj = linkedHashMap.get(valueOf);
            if (obj == null) {
                obj = new ArrayList();
                linkedHashMap.put(valueOf, obj);
            }
            ((List) obj).add(next);
        }
        C1342k1<C1545s> k1Var = this.$inactiveTickColor;
        C1342k1<C1545s> k1Var2 = this.$activeTickColor;
        float f3 = this.$trackStrokeWidth;
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            boolean booleanValue = ((Boolean) entry.getKey()).booleanValue();
            List<Number> list2 = (List) entry.getValue();
            ArrayList arrayList = new ArrayList(C19322o.m32624F0(list2));
            for (Number floatValue2 : list2) {
                arrayList.add(new C8343c(C19421p.m32952q(C8343c.m16642c(C19421p.m32929S(j3, floatValue2.floatValue(), j2)), C8343c.m16643d(eVar.mo6907K0()))));
            }
            long j4 = j2;
            long j5 = j3;
            eVar.mo6916h0(arrayList, (booleanValue ? k1Var : k1Var2).getValue().f3366a, f3, 1, (C18263b) null, 1.0f, (C1546t) null, 3);
            j3 = j5;
            j2 = j4;
        }
    }
}
