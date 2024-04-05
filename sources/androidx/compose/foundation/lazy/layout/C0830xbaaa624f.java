package androidx.compose.foundation.lazy.layout;

import androidx.compose.foundation.lazy.layout.C0839c;
import androidx.compose.runtime.C1302d;
import androidx.compose.runtime.C1358r;
import androidx.compose.runtime.C1360s;
import androidx.compose.runtime.C1415u;
import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import p628nj.C18263b;
import p753kq.C19857l;
import p753kq.C19861p;

/* renamed from: androidx.compose.foundation.lazy.layout.LazyLayoutItemContentFactory$CachedItemContent$createContentLambda$1 */
final class C0830xbaaa624f extends Lambda implements C19861p<C1302d, Integer, C19394m> {
    public final /* synthetic */ C0839c this$0;
    public final /* synthetic */ C0839c.C0840a this$1;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C0830xbaaa624f(C0839c cVar, C0839c.C0840a aVar) {
        super(2);
        this.this$0 = cVar;
        this.this$1 = aVar;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((C1302d) obj, ((Number) obj2).intValue());
        return C19394m.f43287a;
    }

    public final void invoke(C1302d dVar, int i) {
        final int i2;
        if ((i & 11) != 2 || !dVar.mo5442i()) {
            final C0841d invoke = this.this$0.f1797b.invoke();
            Integer num = invoke.mo4200d().get(this.this$1.f1801a);
            if (num != null) {
                this.this$1.f1803c.setValue(Integer.valueOf(num.intValue()));
                i2 = num.intValue();
            } else {
                i2 = ((Number) this.this$1.f1803c.getValue()).intValue();
            }
            dVar.mo5465u(-715769699);
            if (i2 < invoke.getItemCount()) {
                Object e = invoke.mo4201e(i2);
                if (C19383o.m32792b(e, this.this$1.f1801a)) {
                    this.this$0.f1796a.mo5916a(e, C18263b.m30805A(dVar, -1238863364, new C19861p<C1302d, Integer, C19394m>() {
                        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                            invoke((C1302d) obj, ((Number) obj2).intValue());
                            return C19394m.f43287a;
                        }

                        public final void invoke(C1302d dVar, int i) {
                            if ((i & 11) != 2 || !dVar.mo5442i()) {
                                invoke.mo4199c(i2, dVar, 0);
                            } else {
                                dVar.mo5396C();
                            }
                        }
                    }), dVar, 568);
                }
            }
            dVar.mo5406H();
            final C0839c.C0840a aVar = this.this$1;
            C1415u.m3028b(aVar.f1801a, new C19857l<C1360s, C1358r>() {

                /* renamed from: androidx.compose.foundation.lazy.layout.LazyLayoutItemContentFactory$CachedItemContent$createContentLambda$1$2$a */
                public static final class C0833a implements C1358r {

                    /* renamed from: a */
                    public final /* synthetic */ C0839c.C0840a f1786a;

                    public C0833a(C0839c.C0840a aVar) {
                        this.f1786a = aVar;
                    }

                    public final void dispose() {
                        this.f1786a.f1804d = null;
                    }
                }

                public final C1358r invoke(C1360s sVar) {
                    C19383o.m32797g(sVar, "$this$DisposableEffect");
                    return new C0833a(aVar);
                }
            }, dVar);
            return;
        }
        dVar.mo5396C();
    }
}
