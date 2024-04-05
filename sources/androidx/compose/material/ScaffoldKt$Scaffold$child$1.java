package androidx.compose.material;

import androidx.compose.foundation.C0556g;
import androidx.compose.foundation.layout.C0759v;
import androidx.compose.p015ui.C1436d;
import androidx.compose.p015ui.graphics.C1530k0;
import androidx.compose.runtime.C1302d;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import p628nj.C18263b;
import p753kq.C19861p;
import p753kq.C19862q;

public final class ScaffoldKt$Scaffold$child$1 extends Lambda implements C19862q<C1436d, C1302d, Integer, C19394m> {
    public final /* synthetic */ int $$dirty;
    public final /* synthetic */ int $$dirty1;
    public final /* synthetic */ long $backgroundColor;
    public final /* synthetic */ C19861p<C1302d, Integer, C19394m> $bottomBar;
    public final /* synthetic */ C19862q<C0759v, C1302d, Integer, C19394m> $content;
    public final /* synthetic */ long $contentColor;
    public final /* synthetic */ C19861p<C1302d, Integer, C19394m> $floatingActionButton;
    public final /* synthetic */ int $floatingActionButtonPosition;
    public final /* synthetic */ boolean $isFloatingActionButtonDocked;
    public final /* synthetic */ C1216n1 $scaffoldState;
    public final /* synthetic */ C19862q<C1254t1, C1302d, Integer, C19394m> $snackbarHost;
    public final /* synthetic */ C19861p<C1302d, Integer, C19394m> $topBar;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ScaffoldKt$Scaffold$child$1(long j, long j2, int i, boolean z, int i2, C19861p<? super C1302d, ? super Integer, C19394m> pVar, C19862q<? super C0759v, ? super C1302d, ? super Integer, C19394m> qVar, C19861p<? super C1302d, ? super Integer, C19394m> pVar2, C19861p<? super C1302d, ? super Integer, C19394m> pVar3, int i3, C19862q<? super C1254t1, ? super C1302d, ? super Integer, C19394m> qVar2, C1216n1 n1Var) {
        super(3);
        this.$backgroundColor = j;
        this.$contentColor = j2;
        this.$$dirty1 = i;
        this.$isFloatingActionButtonDocked = z;
        this.$floatingActionButtonPosition = i2;
        this.$topBar = pVar;
        this.$content = qVar;
        this.$floatingActionButton = pVar2;
        this.$bottomBar = pVar3;
        this.$$dirty = i3;
        this.$snackbarHost = qVar2;
        this.$scaffoldState = n1Var;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        invoke((C1436d) obj, (C1302d) obj2, ((Number) obj3).intValue());
        return C19394m.f43287a;
    }

    public final void invoke(C1436d dVar, C1302d dVar2, int i) {
        int i2;
        C1436d dVar3 = dVar;
        C1302d dVar4 = dVar2;
        C19383o.m32797g(dVar3, "childModifier");
        if ((i & 14) == 0) {
            i2 = i | (dVar4.mo5408I(dVar3) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i2 & 91) != 18 || !dVar2.mo5442i()) {
            long j = this.$backgroundColor;
            long j2 = this.$contentColor;
            final boolean z = this.$isFloatingActionButtonDocked;
            final int i3 = this.$floatingActionButtonPosition;
            final C19861p<C1302d, Integer, C19394m> pVar = this.$topBar;
            final C19862q<C0759v, C1302d, Integer, C19394m> qVar = this.$content;
            C19861p<C1302d, Integer, C19394m> pVar2 = this.$floatingActionButton;
            C19861p<C1302d, Integer, C19394m> pVar3 = this.$bottomBar;
            int i4 = this.$$dirty;
            final int i5 = i4;
            final C19861p<C1302d, Integer, C19394m> pVar4 = pVar2;
            final C19861p<C1302d, Integer, C19394m> pVar5 = pVar3;
            final int i6 = this.$$dirty1;
            final C19862q<C1254t1, C1302d, Integer, C19394m> qVar2 = this.$snackbarHost;
            final C1216n1 n1Var = this.$scaffoldState;
            ComposableLambdaImpl A = C18263b.m30805A(dVar4, -1128984656, new C19861p<C1302d, Integer, C19394m>() {
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    invoke((C1302d) obj, ((Number) obj2).intValue());
                    return C19394m.f43287a;
                }

                public final void invoke(C1302d dVar, int i) {
                    if ((i & 11) != 2 || !dVar.mo5442i()) {
                        boolean z = z;
                        int i2 = i3;
                        C19861p<C1302d, Integer, C19394m> pVar = pVar;
                        C19862q<C0759v, C1302d, Integer, C19394m> qVar = qVar;
                        final C19862q<C1254t1, C1302d, Integer, C19394m> qVar2 = qVar2;
                        final C1216n1 n1Var = n1Var;
                        final int i3 = i5;
                        ComposableLambdaImpl A = C18263b.m30805A(dVar, 533782017, new C19861p<C1302d, Integer, C19394m>() {
                            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                                invoke((C1302d) obj, ((Number) obj2).intValue());
                                return C19394m.f43287a;
                            }

                            public final void invoke(C1302d dVar, int i) {
                                if ((i & 11) != 2 || !dVar.mo5442i()) {
                                    qVar2.invoke(n1Var.f2533b, dVar, Integer.valueOf((i3 >> 9) & 112));
                                } else {
                                    dVar.mo5396C();
                                }
                            }
                        });
                        C19861p<C1302d, Integer, C19394m> pVar2 = pVar4;
                        C19861p<C1302d, Integer, C19394m> pVar3 = pVar5;
                        int i4 = i5;
                        ScaffoldKt.m2209b(z, i2, pVar, qVar, A, pVar2, pVar3, dVar, ((i4 >> 21) & 14) | 24576 | ((i4 >> 15) & 112) | (i4 & 896) | ((i6 >> 12) & 7168) | (458752 & i4) | ((i4 << 9) & 3670016));
                        return;
                    }
                    dVar.mo5396C();
                }
            });
            int i7 = 1572864 | (i2 & 14);
            int i8 = this.$$dirty1 >> 9;
            SurfaceKt.m2234a(dVar, (C1530k0) null, j, j2, (C0556g) null, 0.0f, A, dVar2, i7 | (i8 & 896) | (i8 & 7168), 50);
            return;
        }
        dVar2.mo5396C();
    }
}
