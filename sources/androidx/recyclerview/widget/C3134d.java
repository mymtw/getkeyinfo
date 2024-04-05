package androidx.recyclerview.widget;

import androidx.recyclerview.widget.C3167n;
import com.appboy.p043ui.C4950e;
import java.util.Collections;
import java.util.List;

/* renamed from: androidx.recyclerview.widget.d */
public final class C3134d implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ List f7202b;

    /* renamed from: c */
    public final /* synthetic */ List f7203c;

    /* renamed from: d */
    public final /* synthetic */ int f7204d;

    /* renamed from: e */
    public final /* synthetic */ Runnable f7205e;

    /* renamed from: f */
    public final /* synthetic */ C3139e f7206f;

    /* renamed from: androidx.recyclerview.widget.d$a */
    public class C3135a extends C3167n.C3169b {
        public C3135a() {
        }

        /* renamed from: a */
        public final boolean mo11830a(int i, int i2) {
            Object obj = C3134d.this.f7202b.get(i);
            Object obj2 = C3134d.this.f7203c.get(i2);
            if (obj != null && obj2 != null) {
                return C3134d.this.f7206f.f7216b.f7195b.mo11900a(obj, obj2);
            }
            if (obj == null && obj2 == null) {
                return true;
            }
            throw new AssertionError();
        }

        /* renamed from: b */
        public final boolean mo11831b(int i, int i2) {
            Object obj = C3134d.this.f7202b.get(i);
            Object obj2 = C3134d.this.f7203c.get(i2);
            return (obj == null || obj2 == null) ? obj == null && obj2 == null : C3134d.this.f7206f.f7216b.f7195b.mo11901b(obj, obj2);
        }

        /* renamed from: c */
        public final void mo11832c(int i, int i2) {
            Object obj = C3134d.this.f7202b.get(i);
            Object obj2 = C3134d.this.f7203c.get(i2);
            if (obj == null || obj2 == null) {
                throw new AssertionError();
            }
            C3134d.this.f7206f.f7216b.f7195b.getClass();
        }

        /* renamed from: d */
        public final int mo11833d() {
            return C3134d.this.f7203c.size();
        }

        /* renamed from: e */
        public final int mo11834e() {
            return C3134d.this.f7202b.size();
        }
    }

    /* renamed from: androidx.recyclerview.widget.d$b */
    public class C3136b implements Runnable {

        /* renamed from: b */
        public final /* synthetic */ C3167n.C3171d f7208b;

        public C3136b(C3167n.C3171d dVar) {
            this.f7208b = dVar;
        }

        public final void run() {
            C3134d dVar = C3134d.this;
            C3139e eVar = dVar.f7206f;
            if (eVar.f7221g == dVar.f7204d) {
                List<T> list = dVar.f7203c;
                C3167n.C3171d dVar2 = this.f7208b;
                Runnable runnable = dVar.f7205e;
                List<T> list2 = eVar.f7220f;
                eVar.f7219e = list;
                eVar.f7220f = Collections.unmodifiableList(list);
                dVar2.mo11899a(eVar.f7215a);
                eVar.mo11836a(list2, runnable);
            }
        }
    }

    public C3134d(C3139e eVar, List list, List list2, int i, C4950e eVar2) {
        this.f7206f = eVar;
        this.f7202b = list;
        this.f7203c = list2;
        this.f7204d = i;
        this.f7205e = eVar2;
    }

    public final void run() {
        this.f7206f.f7217c.execute(new C3136b(C3167n.m7760a(new C3135a())));
    }
}
