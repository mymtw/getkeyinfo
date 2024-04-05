package androidx.compose.p015ui.tooling;

import android.view.View;
import androidx.compose.p015ui.platform.C1857n1;
import androidx.compose.p015ui.platform.ComposeView;
import androidx.compose.p015ui.tooling.animation.C2052c;
import androidx.compose.runtime.C1302d;
import androidx.compose.runtime.C1415u;
import androidx.compose.runtime.snapshots.C1406w;
import androidx.compose.runtime.snapshots.SnapshotKt;
import java.util.Set;
import kotlin.C19394m;
import kotlin.jvm.internal.Lambda;
import p165l0.C7211a;
import p628nj.C18263b;
import p753kq.C19846a;
import p753kq.C19861p;

/* renamed from: androidx.compose.ui.tooling.ComposeViewAdapter$init$3 */
public final class ComposeViewAdapter$init$3 extends Lambda implements C19861p<C1302d, Integer, C19394m> {
    public final /* synthetic */ long $animationClockStartTime;
    public final /* synthetic */ String $className;
    public final /* synthetic */ String $methodName;
    public final /* synthetic */ C19846a<C19394m> $onCommit;
    public final /* synthetic */ Class<? extends C7211a<?>> $parameterProvider;
    public final /* synthetic */ int $parameterProviderIndex;
    public final /* synthetic */ ComposeViewAdapter this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ComposeViewAdapter$init$3(C19846a<C19394m> aVar, ComposeViewAdapter composeViewAdapter, long j, String str, String str2, Class<? extends C7211a<?>> cls, int i) {
        super(2);
        this.$onCommit = aVar;
        this.this$0 = composeViewAdapter;
        this.$animationClockStartTime = j;
        this.$className = str;
        this.$methodName = str2;
        this.$parameterProvider = cls;
        this.$parameterProviderIndex = i;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((C1302d) obj, ((Number) obj2).intValue());
        return C19394m.f43287a;
    }

    public final void invoke(C1302d dVar, int i) {
        if ((i & 11) != 2 || !dVar.mo5442i()) {
            C1415u.m3033g(this.$onCommit, dVar);
            ComposeViewAdapter composeViewAdapter = this.this$0;
            final long j = this.$animationClockStartTime;
            final String str = this.$className;
            final String str2 = this.$methodName;
            final Class<? extends C7211a<?>> cls = this.$parameterProvider;
            final int i2 = this.$parameterProviderIndex;
            final ComposeViewAdapter composeViewAdapter2 = composeViewAdapter;
            composeViewAdapter.WrapPreview(C18263b.m30805A(dVar, 1938351266, new C19861p<C1302d, Integer, C19394m>() {
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    invoke((C1302d) obj, ((Number) obj2).intValue());
                    return C19394m.f43287a;
                }

                public final void invoke(C1302d dVar, int i) {
                    if ((i & 11) != 2 || !dVar.mo5442i()) {
                        ComposeViewAdapter$init$3$1$composable$1 composeViewAdapter$init$3$1$composable$1 = new ComposeViewAdapter$init$3$1$composable$1(str, str2, dVar, cls, i2, composeViewAdapter2);
                        if (j >= 0) {
                            final ComposeViewAdapter composeViewAdapter = composeViewAdapter2;
                            composeViewAdapter.setClock$ui_tooling_release(new C2052c(new C19846a<C19394m>() {
                                public final void invoke() {
                                    boolean z = false;
                                    View childAt = composeViewAdapter.getChildAt(0);
                                    if (childAt != null) {
                                        View childAt2 = ((ComposeView) childAt).getChildAt(0);
                                        C1857n1 n1Var = childAt2 instanceof C1857n1 ? (C1857n1) childAt2 : null;
                                        if (n1Var != null) {
                                            n1Var.invalidateDescendants();
                                        }
                                        synchronized (SnapshotKt.f2989c) {
                                            Set<C1406w> set = SnapshotKt.f2995i.get().f3012g;
                                            if (set != null && (!set.isEmpty())) {
                                                z = true;
                                            }
                                        }
                                        if (z) {
                                            SnapshotKt.m2902a();
                                            return;
                                        }
                                        return;
                                    }
                                    throw new NullPointerException("null cannot be cast to non-null type androidx.compose.ui.platform.ComposeView");
                                }
                            }));
                        }
                        composeViewAdapter$init$3$1$composable$1.invoke();
                        return;
                    }
                    dVar.mo5396C();
                }
            }), dVar, 70);
            return;
        }
        dVar.mo5396C();
    }
}
