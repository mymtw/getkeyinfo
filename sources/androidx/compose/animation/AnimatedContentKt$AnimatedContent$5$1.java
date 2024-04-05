package androidx.compose.animation;

import androidx.compose.animation.AnimatedContentScope;
import androidx.compose.animation.core.Transition;
import androidx.compose.p015ui.C1436d;
import androidx.compose.p015ui.layout.C1686i0;
import androidx.compose.p015ui.layout.C1710u;
import androidx.compose.p015ui.layout.C1712w;
import androidx.compose.p015ui.layout.C1713x;
import androidx.compose.runtime.C1302d;
import androidx.compose.runtime.C1358r;
import androidx.compose.runtime.C1360s;
import androidx.compose.runtime.C1415u;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import com.google.android.play.core.assetpacks.C15588c1;
import kotlin.C19394m;
import kotlin.collections.C19294b0;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import p174m0.C7280a;
import p628nj.C18263b;
import p753kq.C19857l;
import p753kq.C19861p;
import p753kq.C19862q;
import p753kq.C19863r;

public final class AnimatedContentKt$AnimatedContent$5$1 extends Lambda implements C19861p<C1302d, Integer, C19394m> {
    public final /* synthetic */ int $$dirty;
    public final /* synthetic */ C19863r<C0468d, S, C1302d, Integer, C19394m> $content;
    public final /* synthetic */ SnapshotStateList<S> $currentlyVisible;
    public final /* synthetic */ AnimatedContentScope<S> $rootScope;
    public final /* synthetic */ S $stateForContent;
    public final /* synthetic */ Transition<S> $this_AnimatedContent;
    public final /* synthetic */ C19857l<AnimatedContentScope<S>, C0471g> $transitionSpec;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnimatedContentKt$AnimatedContent$5$1(Transition<S> transition, S s, int i, C19857l<? super AnimatedContentScope<S>, C0471g> lVar, AnimatedContentScope<S> animatedContentScope, C19863r<? super C0468d, ? super S, ? super C1302d, ? super Integer, C19394m> rVar, SnapshotStateList<S> snapshotStateList) {
        super(2);
        this.$this_AnimatedContent = transition;
        this.$stateForContent = s;
        this.$$dirty = i;
        this.$transitionSpec = lVar;
        this.$rootScope = animatedContentScope;
        this.$content = rVar;
        this.$currentlyVisible = snapshotStateList;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((C1302d) obj, ((Number) obj2).intValue());
        return C19394m.f43287a;
    }

    public final void invoke(C1302d dVar, int i) {
        C1302d dVar2 = dVar;
        if ((i & 11) != 2 || !dVar.mo5442i()) {
            C19857l<AnimatedContentScope<S>, C0471g> lVar = this.$transitionSpec;
            AnimatedContentScope<S> animatedContentScope = this.$rootScope;
            dVar2.mo5465u(-492369756);
            Object v = dVar.mo5467v();
            Object obj = C1302d.C1303a.f2828a;
            if (v == obj) {
                v = lVar.invoke(animatedContentScope);
                dVar2.mo5454o(v);
            }
            dVar.mo5406H();
            final C0471g gVar = (C0471g) v;
            Boolean valueOf = Boolean.valueOf(C19383o.m32792b(this.$this_AnimatedContent.mo3411c().mo3269a(), this.$stateForContent));
            C19857l<AnimatedContentScope<S>, C0471g> lVar2 = this.$transitionSpec;
            AnimatedContentScope<S> animatedContentScope2 = this.$rootScope;
            dVar2.mo5465u(1157296644);
            boolean I = dVar2.mo5408I(valueOf);
            Object v2 = dVar.mo5467v();
            if (I || v2 == obj) {
                v2 = lVar2.invoke(animatedContentScope2).f1212b;
                dVar2.mo5454o(v2);
            }
            dVar.mo5406H();
            C0475k kVar = (C0475k) v2;
            S s = this.$stateForContent;
            Transition<S> transition = this.$this_AnimatedContent;
            dVar2.mo5465u(-492369756);
            Object v3 = dVar.mo5467v();
            if (v3 == obj) {
                v3 = new AnimatedContentScope.C0377a(C19383o.m32792b(s, transition.mo3412d()));
                dVar2.mo5454o(v3);
            }
            dVar.mo5406H();
            AnimatedContentScope.C0377a aVar = (AnimatedContentScope.C0377a) v3;
            C0473i iVar = gVar.f1211a;
            C1436d v0 = C15588c1.m25352v0(C1436d.C1437a.f3125b, new C19862q<C1713x, C1710u, C7280a, C1712w>() {
                public /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                    return m34611invoke3p2s80s((C1713x) obj, (C1710u) obj2, ((C7280a) obj3).f16152a);
                }

                /* renamed from: invoke-3p2s80s  reason: not valid java name */
                public final C1712w m34611invoke3p2s80s(C1713x xVar, C1710u uVar, long j) {
                    C19383o.m32797g(xVar, "$this$layout");
                    C19383o.m32797g(uVar, "measurable");
                    final C1686i0 J = uVar.mo6665J(j);
                    int i = J.f3722b;
                    int i2 = J.f3723c;
                    final C0471g gVar = gVar;
                    return xVar.mo4387Z(i, i2, C19294b0.m32559p0(), new C19857l<C1686i0.C1687a, C19394m>() {
                        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                            invoke((C1686i0.C1687a) obj);
                            return C19394m.f43287a;
                        }

                        public final void invoke(C1686i0.C1687a aVar) {
                            C19383o.m32797g(aVar, "$this$layout");
                            C1686i0.C1687a.m3581c(J, 0, 0, ((Number) gVar.f1213c.getValue()).floatValue());
                        }
                    });
                }
            });
            aVar.f972b = C19383o.m32792b(this.$stateForContent, this.$this_AnimatedContent.mo3412d());
            C1436d i0 = v0.mo6148i0(aVar);
            Transition<S> transition2 = this.$this_AnimatedContent;
            final S s2 = this.$stateForContent;
            C03733 r2 = new C19857l<S, Boolean>() {
                public final Boolean invoke(S s) {
                    return Boolean.valueOf(C19383o.m32792b(s, s2));
                }
            };
            final AnimatedContentScope<S> animatedContentScope3 = this.$rootScope;
            final S s3 = this.$stateForContent;
            final C19863r<C0468d, S, C1302d, Integer, C19394m> rVar = this.$content;
            final int i2 = this.$$dirty;
            final SnapshotStateList<S> snapshotStateList = this.$currentlyVisible;
            AnimatedVisibilityKt.m1027c(transition2, r2, i0, iVar, kVar, C18263b.m30805A(dVar2, -1816907410, new C19862q<C0468d, C1302d, Integer, C19394m>() {
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                    invoke((C0468d) obj, (C1302d) obj2, ((Number) obj3).intValue());
                    return C19394m.f43287a;
                }

                public final void invoke(C0468d dVar, C1302d dVar2, int i) {
                    C19383o.m32797g(dVar, "$this$AnimatedVisibility");
                    if ((i & 14) == 0) {
                        i |= dVar2.mo5408I(dVar) ? 4 : 2;
                    }
                    if ((i & 91) != 18 || !dVar2.mo5442i()) {
                        final SnapshotStateList<S> snapshotStateList = snapshotStateList;
                        final S s = s3;
                        final AnimatedContentScope<S> animatedContentScope = animatedContentScope3;
                        C1415u.m3028b(dVar, new C19857l<C1360s, C1358r>() {

                            /* renamed from: androidx.compose.animation.AnimatedContentKt$AnimatedContent$5$1$4$1$a */
                            public static final class C0376a implements C1358r {

                                /* renamed from: a */
                                public final /* synthetic */ SnapshotStateList f960a;

                                /* renamed from: b */
                                public final /* synthetic */ Object f961b;

                                /* renamed from: c */
                                public final /* synthetic */ AnimatedContentScope f962c;

                                public C0376a(SnapshotStateList snapshotStateList, Object obj, AnimatedContentScope animatedContentScope) {
                                    this.f960a = snapshotStateList;
                                    this.f961b = obj;
                                    this.f962c = animatedContentScope;
                                }

                                public final void dispose() {
                                    this.f960a.remove(this.f961b);
                                    this.f962c.f967d.remove(this.f961b);
                                }
                            }

                            public final C1358r invoke(C1360s sVar) {
                                C19383o.m32797g(sVar, "$this$DisposableEffect");
                                return new C0376a(snapshotStateList, s, animatedContentScope);
                            }
                        }, dVar2);
                        animatedContentScope3.f967d.put(s3, ((C0469e) dVar).f1206b);
                        rVar.invoke(dVar, s3, dVar2, Integer.valueOf((i & 14) | ((i2 >> 9) & 896)));
                        return;
                    }
                    dVar2.mo5396C();
                }
            }), dVar, (this.$$dirty & 14) | 196608, 0);
            return;
        }
        dVar.mo5396C();
    }
}
