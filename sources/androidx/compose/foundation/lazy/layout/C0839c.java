package androidx.compose.foundation.lazy.layout;

import androidx.activity.C0114h;
import androidx.compose.foundation.layout.C0761x;
import androidx.compose.runtime.C1302d;
import androidx.compose.runtime.C1351n1;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.saveable.C1367c;
import androidx.compose.runtime.saveable.SaveableStateHolderImpl;
import java.util.LinkedHashMap;
import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import p174m0.C7282b;
import p174m0.C7283c;
import p628nj.C18263b;
import p753kq.C19846a;
import p753kq.C19861p;

/* renamed from: androidx.compose.foundation.lazy.layout.c */
public final class C0839c {

    /* renamed from: a */
    public final C1367c f1796a;

    /* renamed from: b */
    public final C19846a<C0841d> f1797b;

    /* renamed from: c */
    public final LinkedHashMap f1798c = new LinkedHashMap();

    /* renamed from: d */
    public C7282b f1799d = new C7283c(0.0f, 0.0f);

    /* renamed from: e */
    public long f1800e = C0114h.m315r(0, 0, 15);

    /* renamed from: androidx.compose.foundation.lazy.layout.c$a */
    public final class C0840a {

        /* renamed from: a */
        public final Object f1801a;

        /* renamed from: b */
        public final Object f1802b;

        /* renamed from: c */
        public final ParcelableSnapshotMutableState f1803c;

        /* renamed from: d */
        public C19861p<? super C1302d, ? super Integer, C19394m> f1804d;

        /* renamed from: e */
        public final /* synthetic */ C0839c f1805e;

        public C0840a(C0839c cVar, int i, Object obj, Object obj2) {
            C19383o.m32797g(obj, "key");
            this.f1805e = cVar;
            this.f1801a = obj;
            this.f1802b = obj2;
            this.f1803c = C0761x.m1751w0(Integer.valueOf(i), C1351n1.f2948a);
        }
    }

    public C0839c(SaveableStateHolderImpl saveableStateHolderImpl, C19846a aVar) {
        C19383o.m32797g(saveableStateHolderImpl, "saveableStateHolder");
        this.f1796a = saveableStateHolderImpl;
        this.f1797b = aVar;
    }

    /* renamed from: a */
    public final C19861p<C1302d, Integer, C19394m> mo4384a(int i, Object obj) {
        C19383o.m32797g(obj, "key");
        C0840a aVar = (C0840a) this.f1798c.get(obj);
        Object a = this.f1797b.invoke().mo4197a(i);
        if (aVar == null || ((Number) aVar.f1803c.getValue()).intValue() != i || !C19383o.m32792b(aVar.f1802b, a)) {
            C0840a aVar2 = new C0840a(this, i, obj, a);
            this.f1798c.put(obj, aVar2);
            C19861p<? super C1302d, ? super Integer, C19394m> pVar = aVar2.f1804d;
            if (pVar != null) {
                return pVar;
            }
            ComposableLambdaImpl B = C18263b.m30807B(new C0830xbaaa624f(aVar2.f1805e, aVar2), 1403994769, true);
            aVar2.f1804d = B;
            return B;
        }
        C19861p<? super C1302d, ? super Integer, C19394m> pVar2 = aVar.f1804d;
        if (pVar2 != null) {
            return pVar2;
        }
        ComposableLambdaImpl B2 = C18263b.m30807B(new C0830xbaaa624f(aVar.f1805e, aVar), 1403994769, true);
        aVar.f1804d = B2;
        return B2;
    }

    /* renamed from: b */
    public final Object mo4385b(Object obj) {
        C0840a aVar = (C0840a) this.f1798c.get(obj);
        if (aVar != null) {
            return aVar.f1802b;
        }
        C0841d invoke = this.f1797b.invoke();
        Integer num = invoke.mo4200d().get(obj);
        if (num != null) {
            return invoke.mo4197a(num.intValue());
        }
        return null;
    }
}
