package androidx.compose.p015ui.tooling;

import androidx.compose.foundation.interaction.C0640j;
import androidx.compose.foundation.layout.C0739i;
import androidx.compose.foundation.layout.C0759v;
import androidx.compose.foundation.layout.C0761x;
import androidx.compose.material.C1216n1;
import androidx.compose.material.C1254t1;
import androidx.compose.material.C1263w0;
import androidx.compose.material.FloatingActionButtonKt;
import androidx.compose.material.ScaffoldKt;
import androidx.compose.p015ui.C1436d;
import androidx.compose.p015ui.graphics.C1530k0;
import androidx.compose.runtime.C1302d;
import androidx.compose.runtime.C1338j0;
import androidx.compose.runtime.C1351n1;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import kotlin.C19394m;
import kotlin.jvm.internal.C19382n;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import p628nj.C18263b;
import p753kq.C19846a;
import p753kq.C19861p;
import p753kq.C19862q;

/* renamed from: androidx.compose.ui.tooling.PreviewActivity$setParameterizedContent$1 */
public final class PreviewActivity$setParameterizedContent$1 extends Lambda implements C19861p<C1302d, Integer, C19394m> {
    public final /* synthetic */ String $className;
    public final /* synthetic */ String $methodName;
    public final /* synthetic */ Object[] $previewParameters;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PreviewActivity$setParameterizedContent$1(Object[] objArr, String str, String str2) {
        super(2);
        this.$previewParameters = objArr;
        this.$className = str;
        this.$methodName = str2;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((C1302d) obj, ((Number) obj2).intValue());
        return C19394m.f43287a;
    }

    public final void invoke(C1302d dVar, int i) {
        C1302d dVar2 = dVar;
        if ((i & 11) != 2 || !dVar.mo5442i()) {
            dVar2.mo5465u(-492369756);
            Object v = dVar.mo5467v();
            if (v == C1302d.C1303a.f2828a) {
                v = C0761x.m1751w0(0, C1351n1.f2948a);
                dVar2.mo5454o(v);
            }
            dVar.mo5406H();
            final C1338j0 j0Var = (C1338j0) v;
            final Object[] objArr = this.$previewParameters;
            ComposableLambdaImpl A = C18263b.m30805A(dVar2, 2137630662, new C19861p<C1302d, Integer, C19394m>() {
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    invoke((C1302d) obj, ((Number) obj2).intValue());
                    return C19394m.f43287a;
                }

                public final void invoke(C1302d dVar, int i) {
                    if ((i & 11) != 2 || !dVar.mo5442i()) {
                        ComposableLambdaImpl composableLambdaImpl = ComposableSingletons$PreviewActivityKt.f4628a;
                        final C1338j0<Integer> j0Var = j0Var;
                        final Object[] objArr = objArr;
                        FloatingActionButtonKt.m2182a(composableLambdaImpl, new C19846a<C19394m>() {
                            public final void invoke() {
                                C1338j0<Integer> j0Var = j0Var;
                                j0Var.setValue(Integer.valueOf((j0Var.getValue().intValue() + 1) % objArr.length));
                            }
                        }, (C1436d) null, (C19861p<? super C1302d, ? super Integer, C19394m>) null, (C0640j) null, (C1530k0) null, 0, 0, (C1263w0) null, dVar, 6, 508);
                        return;
                    }
                    dVar.mo5396C();
                }
            });
            final String str = this.$className;
            final String str2 = this.$methodName;
            final Object[] objArr2 = this.$previewParameters;
            ScaffoldKt.m2208a((C1436d) null, (C1216n1) null, (C19861p<? super C1302d, ? super Integer, C19394m>) null, (C19861p<? super C1302d, ? super Integer, C19394m>) null, (C19862q<? super C1254t1, ? super C1302d, ? super Integer, C19394m>) null, A, 0, false, (C19862q<? super C0739i, ? super C1302d, ? super Integer, C19394m>) null, false, (C1530k0) null, 0.0f, 0, 0, 0, 0, 0, C18263b.m30805A(dVar2, -1578412612, new C19862q<C0759v, C1302d, Integer, C19394m>() {
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                    invoke((C0759v) obj, (C1302d) obj2, ((Number) obj3).intValue());
                    return C19394m.f43287a;
                }

                public final void invoke(C0759v vVar, C1302d dVar, int i) {
                    C19383o.m32797g(vVar, "it");
                    if ((i & 81) != 16 || !dVar.mo5442i()) {
                        C19382n.m32759m0(str, str2, dVar, objArr2[j0Var.getValue().intValue()]);
                        return;
                    }
                    dVar.mo5396C();
                }
            }), dVar, 196608, 12582912, 131039);
            return;
        }
        dVar.mo5396C();
    }
}
