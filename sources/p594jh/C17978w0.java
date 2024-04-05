package p594jh;

import android.os.Handler;
import android.os.Looper;
import android.util.Pair;
import com.google.android.exoplayer2.drm.C14216b;
import com.google.android.exoplayer2.source.C14300f;
import com.google.android.exoplayer2.source.C14301g;
import com.google.android.exoplayer2.source.C14304h;
import com.google.android.exoplayer2.source.C14344i;
import com.google.android.exoplayer2.source.C14347j;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;
import p505aj.C14014t;
import p513bj.C14049b0;
import p595ji.C17992d;
import p595ji.C17993e;
import p595ji.C18001m;
import p602kh.C18086u0;

/* renamed from: jh.w0 */
public final class C17978w0 {

    /* renamed from: a */
    public final ArrayList f39279a = new ArrayList();

    /* renamed from: b */
    public final IdentityHashMap<C14304h, C17981c> f39280b = new IdentityHashMap<>();

    /* renamed from: c */
    public final HashMap f39281c = new HashMap();

    /* renamed from: d */
    public final C17982d f39282d;

    /* renamed from: e */
    public final C14347j.C14348a f39283e;

    /* renamed from: f */
    public final C14216b.C14217a f39284f;

    /* renamed from: g */
    public final HashMap<C17981c, C17980b> f39285g;

    /* renamed from: h */
    public final HashSet f39286h;

    /* renamed from: i */
    public C18001m f39287i = new C18001m.C18002a();

    /* renamed from: j */
    public boolean f39288j;

    /* renamed from: k */
    public C14014t f39289k;

    /* renamed from: jh.w0$a */
    public final class C17979a implements C14347j, C14216b {

        /* renamed from: b */
        public final C17981c f39290b;

        /* renamed from: c */
        public C14347j.C14348a f39291c;

        /* renamed from: d */
        public C14216b.C14217a f39292d;

        public C17979a(C17981c cVar) {
            this.f39291c = C17978w0.this.f39283e;
            this.f39292d = C17978w0.this.f39284f;
            this.f39290b = cVar;
        }

        /* renamed from: A */
        public final void mo47323A(int i, C14344i.C14345a aVar, int i2) {
            if (mo69544a(i, aVar)) {
                this.f39292d.mo47332d(i2);
            }
        }

        /* renamed from: B */
        public final void mo47324B(int i, C14344i.C14345a aVar) {
            if (mo69544a(i, aVar)) {
                this.f39292d.mo47334f();
            }
        }

        /* renamed from: D */
        public final void mo47325D(int i, C14344i.C14345a aVar) {
            if (mo69544a(i, aVar)) {
                this.f39292d.mo47331c();
            }
        }

        /* renamed from: a */
        public final boolean mo69544a(int i, C14344i.C14345a aVar) {
            C14344i.C14345a aVar2 = null;
            if (aVar != null) {
                C17981c cVar = this.f39290b;
                int i2 = 0;
                while (true) {
                    if (i2 >= cVar.f39299c.size()) {
                        break;
                    } else if (((C14344i.C14345a) cVar.f39299c.get(i2)).f39349d == aVar.f39349d) {
                        Object obj = aVar.f39346a;
                        Object obj2 = cVar.f39298b;
                        int i3 = C17882a.f38837e;
                        aVar2 = aVar.mo47785b(Pair.create(obj2, obj));
                        break;
                    } else {
                        i2++;
                    }
                }
                if (aVar2 == null) {
                    return false;
                }
            }
            int i4 = i + this.f39290b.f39300d;
            C14347j.C14348a aVar3 = this.f39291c;
            if (aVar3.f32161a != i4 || !C14049b0.m21628a(aVar3.f32162b, aVar2)) {
                this.f39291c = new C14347j.C14348a(C17978w0.this.f39283e.f32163c, i4, aVar2);
            }
            C14216b.C14217a aVar4 = this.f39292d;
            if (aVar4.f31564a == i4 && C14049b0.m21628a(aVar4.f31565b, aVar2)) {
                return true;
            }
            this.f39292d = new C14216b.C14217a(C17978w0.this.f39284f.f31566c, i4, aVar2);
            return true;
        }

        /* renamed from: c */
        public final void mo47326c(int i, C14344i.C14345a aVar) {
            if (mo69544a(i, aVar)) {
                this.f39292d.mo47330b();
            }
        }

        /* renamed from: j */
        public final void mo47687j(int i, C14344i.C14345a aVar, C17993e eVar) {
            if (mo69544a(i, aVar)) {
                this.f39291c.mo47789c(eVar);
            }
        }

        /* renamed from: m */
        public final void mo47688m(int i, C14344i.C14345a aVar, C17992d dVar, C17993e eVar) {
            if (mo69544a(i, aVar)) {
                this.f39291c.mo47798l(dVar, eVar);
            }
        }

        /* renamed from: n */
        public final void mo47327n(int i, C14344i.C14345a aVar, Exception exc) {
            if (mo69544a(i, aVar)) {
                this.f39292d.mo47333e(exc);
            }
        }

        /* renamed from: r */
        public final void mo47689r(int i, C14344i.C14345a aVar, C17993e eVar) {
            if (mo69544a(i, aVar)) {
                this.f39291c.mo47799m(eVar);
            }
        }

        /* renamed from: t */
        public final void mo47690t(int i, C14344i.C14345a aVar, C17992d dVar, C17993e eVar) {
            if (mo69544a(i, aVar)) {
                this.f39291c.mo47791e(dVar, eVar);
            }
        }

        /* renamed from: v */
        public final void mo47328v(int i, C14344i.C14345a aVar) {
            if (mo69544a(i, aVar)) {
                this.f39292d.mo47329a();
            }
        }

        /* renamed from: w */
        public final void mo47691w(int i, C14344i.C14345a aVar, C17992d dVar, C17993e eVar) {
            if (mo69544a(i, aVar)) {
                this.f39291c.mo47793g(dVar, eVar);
            }
        }

        /* renamed from: z */
        public final void mo47692z(int i, C14344i.C14345a aVar, C17992d dVar, C17993e eVar, IOException iOException, boolean z) {
            if (mo69544a(i, aVar)) {
                this.f39291c.mo47796j(dVar, eVar, iOException, z);
            }
        }
    }

    /* renamed from: jh.w0$b */
    public static final class C17980b {

        /* renamed from: a */
        public final C14344i f39294a;

        /* renamed from: b */
        public final C14344i.C14346b f39295b;

        /* renamed from: c */
        public final C17979a f39296c;

        public C17980b(C14301g gVar, C17976v0 v0Var, C17979a aVar) {
            this.f39294a = gVar;
            this.f39295b = v0Var;
            this.f39296c = aVar;
        }
    }

    /* renamed from: jh.w0$c */
    public static final class C17981c implements C17974u0 {

        /* renamed from: a */
        public final C14301g f39297a;

        /* renamed from: b */
        public final Object f39298b = new Object();

        /* renamed from: c */
        public final ArrayList f39299c = new ArrayList();

        /* renamed from: d */
        public int f39300d;

        /* renamed from: e */
        public boolean f39301e;

        public C17981c(C14344i iVar, boolean z) {
            this.f39297a = new C14301g(iVar, z);
        }

        /* renamed from: a */
        public final Object mo69394a() {
            return this.f39298b;
        }

        /* renamed from: b */
        public final C17939k1 mo69395b() {
            return this.f39297a.f31823n;
        }
    }

    /* renamed from: jh.w0$d */
    public interface C17982d {
    }

    public C17978w0(C17982d dVar, C18086u0 u0Var, Handler handler) {
        this.f39282d = dVar;
        C14347j.C14348a aVar = new C14347j.C14348a();
        this.f39283e = aVar;
        C14216b.C14217a aVar2 = new C14216b.C14217a();
        this.f39284f = aVar2;
        this.f39285g = new HashMap<>();
        this.f39286h = new HashSet();
        if (u0Var != null) {
            aVar.f32163c.add(new C14347j.C14348a.C14349a(handler, u0Var));
            aVar2.f31566c.add(new C14216b.C14217a.C14218a(handler, u0Var));
        }
    }

    /* renamed from: a */
    public final C17939k1 mo69536a(int i, List<C17981c> list, C18001m mVar) {
        if (!list.isEmpty()) {
            this.f39287i = mVar;
            for (int i2 = i; i2 < list.size() + i; i2++) {
                C17981c cVar = list.get(i2 - i);
                if (i2 > 0) {
                    C17981c cVar2 = (C17981c) this.f39279a.get(i2 - 1);
                    C14301g.C14302a aVar = cVar2.f39297a.f31823n;
                    cVar.f39300d = aVar.mo47701o() + cVar2.f39300d;
                    cVar.f39301e = false;
                    cVar.f39299c.clear();
                } else {
                    cVar.f39300d = 0;
                    cVar.f39301e = false;
                    cVar.f39299c.clear();
                }
                mo69537b(i2, cVar.f39297a.f31823n.mo47701o());
                this.f39279a.add(i2, cVar);
                this.f39281c.put(cVar.f39298b, cVar);
                if (this.f39288j) {
                    mo69541f(cVar);
                    if (this.f39280b.isEmpty()) {
                        this.f39286h.add(cVar);
                    } else {
                        C17980b bVar = this.f39285g.get(cVar);
                        if (bVar != null) {
                            bVar.f39294a.mo47655i(bVar.f39295b);
                        }
                    }
                }
            }
        }
        return mo69538c();
    }

    /* renamed from: b */
    public final void mo69537b(int i, int i2) {
        while (i < this.f39279a.size()) {
            ((C17981c) this.f39279a.get(i)).f39300d += i2;
            i++;
        }
    }

    /* renamed from: c */
    public final C17939k1 mo69538c() {
        if (this.f39279a.isEmpty()) {
            return C17939k1.f39097a;
        }
        int i = 0;
        for (int i2 = 0; i2 < this.f39279a.size(); i2++) {
            C17981c cVar = (C17981c) this.f39279a.get(i2);
            cVar.f39300d = i;
            i += cVar.f39297a.f31823n.mo47701o();
        }
        return new C17899c1(this.f39279a, this.f39287i);
    }

    /* renamed from: d */
    public final void mo69539d() {
        Iterator it = this.f39286h.iterator();
        while (it.hasNext()) {
            C17981c cVar = (C17981c) it.next();
            if (cVar.f39299c.isEmpty()) {
                C17980b bVar = this.f39285g.get(cVar);
                if (bVar != null) {
                    bVar.f39294a.mo47655i(bVar.f39295b);
                }
                it.remove();
            }
        }
    }

    /* renamed from: e */
    public final void mo69540e(C17981c cVar) {
        if (cVar.f39301e && cVar.f39299c.isEmpty()) {
            C17980b remove = this.f39285g.remove(cVar);
            remove.getClass();
            remove.f39294a.mo47650a(remove.f39295b);
            remove.f39294a.mo47652c(remove.f39296c);
            remove.f39294a.mo47657k(remove.f39296c);
            this.f39286h.remove(cVar);
        }
    }

    /* renamed from: f */
    public final void mo69541f(C17981c cVar) {
        C14301g gVar = cVar.f39297a;
        C17976v0 v0Var = new C17976v0(this);
        C17979a aVar = new C17979a(cVar);
        this.f39285g.put(cVar, new C17980b(gVar, v0Var, aVar));
        int i = C14049b0.f30913a;
        Looper myLooper = Looper.myLooper();
        if (myLooper == null) {
            myLooper = Looper.getMainLooper();
        }
        gVar.mo47651b(new Handler(myLooper, (Handler.Callback) null), aVar);
        Looper myLooper2 = Looper.myLooper();
        if (myLooper2 == null) {
            myLooper2 = Looper.getMainLooper();
        }
        gVar.mo47656j(new Handler(myLooper2, (Handler.Callback) null), aVar);
        gVar.mo47653d(v0Var, this.f39289k);
    }

    /* renamed from: g */
    public final void mo69542g(C14304h hVar) {
        C17981c remove = this.f39280b.remove(hVar);
        remove.getClass();
        remove.f39297a.mo47623f(hVar);
        remove.f39299c.remove(((C14300f) hVar).f31812b);
        if (!this.f39280b.isEmpty()) {
            mo69539d();
        }
        mo69540e(remove);
    }

    /* renamed from: h */
    public final void mo69543h(int i, int i2) {
        for (int i3 = i2 - 1; i3 >= i; i3--) {
            C17981c cVar = (C17981c) this.f39279a.remove(i3);
            this.f39281c.remove(cVar.f39298b);
            mo69537b(i3, -cVar.f39297a.f31823n.mo47701o());
            cVar.f39301e = true;
            if (this.f39288j) {
                mo69540e(cVar);
            }
        }
    }
}
