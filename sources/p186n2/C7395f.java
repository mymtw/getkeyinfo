package p186n2;

import android.annotation.SuppressLint;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.C2769j0;
import androidx.fragment.app.C2770k;
import java.util.ArrayList;
import java.util.List;
import p002a1.C0007b;
import p186n2.C7418m;

@SuppressLint({"RestrictedApi"})
/* renamed from: n2.f */
public class C7395f extends C2769j0 {

    /* renamed from: n2.f$a */
    public class C7396a implements C7418m.C7422d {

        /* renamed from: a */
        public final /* synthetic */ View f16519a;

        /* renamed from: b */
        public final /* synthetic */ ArrayList f16520b;

        public C7396a(View view, ArrayList arrayList) {
            this.f16519a = view;
            this.f16520b = arrayList;
        }

        public final void onTransitionCancel(C7418m mVar) {
        }

        public final void onTransitionEnd(C7418m mVar) {
            mVar.mo19793z(this);
            this.f16519a.setVisibility(8);
            int size = this.f16520b.size();
            for (int i = 0; i < size; i++) {
                ((View) this.f16520b.get(i)).setVisibility(0);
            }
        }

        public final void onTransitionPause(C7418m mVar) {
        }

        public final void onTransitionResume(C7418m mVar) {
        }

        public final void onTransitionStart(C7418m mVar) {
            mVar.mo19793z(this);
            mVar.mo19776a(this);
        }
    }

    /* renamed from: n2.f$b */
    public class C7397b extends C7418m.C7421c {

        /* renamed from: a */
        public final /* synthetic */ Rect f16521a;

        public C7397b(Rect rect) {
            this.f16521a = rect;
        }

        /* renamed from: a */
        public final Rect mo19748a() {
            Rect rect = this.f16521a;
            if (rect == null || rect.isEmpty()) {
                return null;
            }
            return this.f16521a;
        }
    }

    /* renamed from: a */
    public final void mo10539a(View view, Object obj) {
        ((C7418m) obj).mo19777b(view);
    }

    /* renamed from: b */
    public final void mo10540b(ArrayList arrayList, Object obj) {
        C7418m mVar = (C7418m) obj;
        if (mVar != null) {
            int i = 0;
            if (mVar instanceof C7429r) {
                C7429r rVar = (C7429r) mVar;
                int size = rVar.f16600z.size();
                while (i < size) {
                    mo10540b(arrayList, (i < 0 || i >= rVar.f16600z.size()) ? null : rVar.f16600z.get(i));
                    i++;
                }
                return;
            }
            if (!(!C2769j0.m6637h(mVar.f16564f) || !C2769j0.m6637h((List) null) || !C2769j0.m6637h((List) null)) && C2769j0.m6637h(mVar.f16565g)) {
                int size2 = arrayList.size();
                while (i < size2) {
                    mVar.mo19777b((View) arrayList.get(i));
                    i++;
                }
            }
        }
    }

    /* renamed from: c */
    public final void mo10541c(ViewGroup viewGroup, Object obj) {
        C7426q.m14342a(viewGroup, (C7418m) obj);
    }

    /* renamed from: e */
    public final boolean mo10542e(Object obj) {
        return obj instanceof C7418m;
    }

    /* renamed from: f */
    public final Object mo10543f(Object obj) {
        if (obj != null) {
            return ((C7418m) obj).clone();
        }
        return null;
    }

    /* renamed from: i */
    public final Object mo10544i(Object obj, Object obj2, Object obj3) {
        C7418m mVar = (C7418m) obj;
        C7418m mVar2 = (C7418m) obj2;
        C7418m mVar3 = (C7418m) obj3;
        if (mVar != null && mVar2 != null) {
            C7429r rVar = new C7429r();
            rVar.mo19802N(mVar);
            rVar.mo19802N(mVar2);
            rVar.mo19805Q(1);
            mVar = rVar;
        } else if (mVar == null) {
            mVar = mVar2 != null ? mVar2 : null;
        }
        if (mVar3 == null) {
            return mVar;
        }
        C7429r rVar2 = new C7429r();
        if (mVar != null) {
            rVar2.mo19802N(mVar);
        }
        rVar2.mo19802N(mVar3);
        return rVar2;
    }

    /* renamed from: j */
    public final Object mo10545j(Object obj, Object obj2) {
        C7429r rVar = new C7429r();
        if (obj != null) {
            rVar.mo19802N((C7418m) obj);
        }
        rVar.mo19802N((C7418m) obj2);
        return rVar;
    }

    /* renamed from: k */
    public final void mo10546k(Object obj, View view, ArrayList<View> arrayList) {
        ((C7418m) obj).mo19776a(new C7396a(view, arrayList));
    }

    /* renamed from: l */
    public final void mo10547l(Object obj, Object obj2, ArrayList arrayList, Object obj3, ArrayList arrayList2) {
        ((C7418m) obj).mo19776a(new C7401g(this, obj2, arrayList, obj3, arrayList2));
    }

    /* renamed from: m */
    public final void mo10548m(View view, Object obj) {
        if (view != null) {
            Rect rect = new Rect();
            C2769j0.m6636g(view, rect);
            ((C7418m) obj).mo19769E(new C7393e(rect));
        }
    }

    /* renamed from: n */
    public final void mo10549n(Object obj, Rect rect) {
        ((C7418m) obj).mo19769E(new C7397b(rect));
    }

    /* renamed from: o */
    public final void mo10550o(Object obj, C0007b bVar, C2770k kVar) {
        C7418m mVar = (C7418m) obj;
        bVar.mo23b(new C7403h(mVar));
        mVar.mo19776a(new C7405i(kVar));
    }

    /* renamed from: p */
    public final void mo10551p(Object obj, View view, ArrayList<View> arrayList) {
        C7429r rVar = (C7429r) obj;
        ArrayList<View> arrayList2 = rVar.f16565g;
        arrayList2.clear();
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            C2769j0.m6635d(arrayList.get(i), arrayList2);
        }
        arrayList2.add(view);
        arrayList.add(view);
        mo10540b(arrayList, rVar);
    }

    /* renamed from: q */
    public final void mo10552q(Object obj, ArrayList<View> arrayList, ArrayList<View> arrayList2) {
        C7429r rVar = (C7429r) obj;
        if (rVar != null) {
            rVar.f16565g.clear();
            rVar.f16565g.addAll(arrayList2);
            mo19749s(rVar, arrayList, arrayList2);
        }
    }

    /* renamed from: r */
    public final Object mo10553r(Object obj) {
        if (obj == null) {
            return null;
        }
        C7429r rVar = new C7429r();
        rVar.mo19802N((C7418m) obj);
        return rVar;
    }

    /* renamed from: s */
    public final void mo19749s(Object obj, ArrayList<View> arrayList, ArrayList<View> arrayList2) {
        C7418m mVar = (C7418m) obj;
        int i = 0;
        if (mVar instanceof C7429r) {
            C7429r rVar = (C7429r) mVar;
            int size = rVar.f16600z.size();
            while (i < size) {
                mo19749s((i < 0 || i >= rVar.f16600z.size()) ? null : rVar.f16600z.get(i), arrayList, arrayList2);
                i++;
            }
            return;
        }
        if (!(!C2769j0.m6637h(mVar.f16564f) || !C2769j0.m6637h((List) null) || !C2769j0.m6637h((List) null))) {
            ArrayList<View> arrayList3 = mVar.f16565g;
            if (arrayList3.size() == arrayList.size() && arrayList3.containsAll(arrayList)) {
                int size2 = arrayList2 == null ? 0 : arrayList2.size();
                while (i < size2) {
                    mVar.mo19777b(arrayList2.get(i));
                    i++;
                }
                int size3 = arrayList.size();
                while (true) {
                    size3--;
                    if (size3 >= 0) {
                        mVar.mo19765A(arrayList.get(size3));
                    } else {
                        return;
                    }
                }
            }
        }
    }
}
