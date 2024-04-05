package androidx.compose.material;

import androidx.compose.p015ui.text.C2023s;
import androidx.compose.runtime.C1302d;
import androidx.compose.runtime.C1412t0;
import androidx.compose.runtime.CompositionLocalKt;
import kotlin.C19394m;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.C19543e0;
import p628nj.C18263b;
import p753kq.C19861p;

public final class SnackbarKt$Snackbar$1 extends Lambda implements C19861p<C1302d, Integer, C19394m> {
    public final /* synthetic */ int $$dirty;
    public final /* synthetic */ C19861p<C1302d, Integer, C19394m> $action;
    public final /* synthetic */ boolean $actionOnNewLine;
    public final /* synthetic */ C19861p<C1302d, Integer, C19394m> $content;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SnackbarKt$Snackbar$1(C19861p<? super C1302d, ? super Integer, C19394m> pVar, C19861p<? super C1302d, ? super Integer, C19394m> pVar2, int i, boolean z) {
        super(2);
        this.$action = pVar;
        this.$content = pVar2;
        this.$$dirty = i;
        this.$actionOnNewLine = z;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((C1302d) obj, ((Number) obj2).intValue());
        return C19394m.f43287a;
    }

    public final void invoke(C1302d dVar, int i) {
        if ((i & 11) != 2 || !dVar.mo5442i()) {
            C1412t0[] t0VarArr = {ContentAlphaKt.f2198a.mo5908b(Float.valueOf(C19543e0.m33301S(dVar)))};
            final C19861p<C1302d, Integer, C19394m> pVar = this.$action;
            final C19861p<C1302d, Integer, C19394m> pVar2 = this.$content;
            final int i2 = this.$$dirty;
            final boolean z = this.$actionOnNewLine;
            CompositionLocalKt.m2530a(t0VarArr, C18263b.m30805A(dVar, 1939362236, new C19861p<C1302d, Integer, C19394m>() {
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    invoke((C1302d) obj, ((Number) obj2).intValue());
                    return C19394m.f43287a;
                }

                public final void invoke(C1302d dVar, int i) {
                    if ((i & 11) != 2 || !dVar.mo5442i()) {
                        C2023s sVar = ((C1178d2) dVar.mo5410J(TypographyKt.f2371a)).f2411j;
                        final C19861p<C1302d, Integer, C19394m> pVar = pVar;
                        final C19861p<C1302d, Integer, C19394m> pVar2 = pVar2;
                        final int i2 = i2;
                        final boolean z = z;
                        TextKt.m2282a(sVar, C18263b.m30805A(dVar, 225114541, new C19861p<C1302d, Integer, C19394m>() {
                            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                                invoke((C1302d) obj, ((Number) obj2).intValue());
                                return C19394m.f43287a;
                            }

                            public final void invoke(C1302d dVar, int i) {
                                if ((i & 11) == 2 && dVar.mo5442i()) {
                                    dVar.mo5396C();
                                } else if (pVar == null) {
                                    dVar.mo5465u(59708346);
                                    SnackbarKt.m2231e(pVar2, dVar, (i2 >> 21) & 14);
                                    dVar.mo5406H();
                                } else if (z) {
                                    dVar.mo5465u(59708411);
                                    C19861p<C1302d, Integer, C19394m> pVar = pVar2;
                                    C19861p<C1302d, Integer, C19394m> pVar2 = pVar;
                                    int i2 = i2;
                                    SnackbarKt.m2229c(pVar, pVar2, dVar, (i2 & 112) | ((i2 >> 21) & 14));
                                    dVar.mo5406H();
                                } else {
                                    dVar.mo5465u(59708478);
                                    C19861p<C1302d, Integer, C19394m> pVar3 = pVar2;
                                    C19861p<C1302d, Integer, C19394m> pVar4 = pVar;
                                    int i3 = i2;
                                    SnackbarKt.m2230d(pVar3, pVar4, dVar, (i3 & 112) | ((i3 >> 21) & 14));
                                    dVar.mo5406H();
                                }
                            }
                        }), dVar, 48);
                        return;
                    }
                    dVar.mo5396C();
                }
            }), dVar, 56);
            return;
        }
        dVar.mo5396C();
    }
}
