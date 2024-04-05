package p186n2;

import android.animation.TimeInterpolator;
import android.support.p013v4.media.C0073e;
import android.util.AndroidRuntimeException;
import android.view.View;
import android.view.ViewGroup;
import androidx.preference.C3039b;
import com.google.protobuf.C16910l;
import java.util.ArrayList;
import java.util.Iterator;
import p003a2.C0015b;
import p186n2.C7418m;

/* renamed from: n2.r */
public class C7429r extends C7418m {

    /* renamed from: A */
    public boolean f16596A = true;

    /* renamed from: B */
    public int f16597B;

    /* renamed from: C */
    public boolean f16598C = false;

    /* renamed from: D */
    public int f16599D = 0;

    /* renamed from: z */
    public ArrayList<C7418m> f16600z = new ArrayList<>();

    /* renamed from: n2.r$a */
    public class C7430a extends C7425p {

        /* renamed from: a */
        public final /* synthetic */ C7418m f16601a;

        public C7430a(C7418m mVar) {
            this.f16601a = mVar;
        }

        public final void onTransitionEnd(C7418m mVar) {
            this.f16601a.mo19767C();
            mVar.mo19793z(this);
        }
    }

    /* renamed from: n2.r$b */
    public static class C7431b extends C7425p {

        /* renamed from: a */
        public C7429r f16602a;

        public C7431b(C7429r rVar) {
            this.f16602a = rVar;
        }

        public final void onTransitionEnd(C7418m mVar) {
            C7429r rVar = this.f16602a;
            int i = rVar.f16597B - 1;
            rVar.f16597B = i;
            if (i == 0) {
                rVar.f16598C = false;
                rVar.mo19786p();
            }
            mVar.mo19793z(this);
        }

        public final void onTransitionStart(C7418m mVar) {
            C7429r rVar = this.f16602a;
            if (!rVar.f16598C) {
                rVar.mo19774K();
                this.f16602a.f16598C = true;
            }
        }
    }

    /* renamed from: A */
    public final void mo19765A(View view) {
        for (int i = 0; i < this.f16600z.size(); i++) {
            this.f16600z.get(i).mo19765A(view);
        }
        this.f16565g.remove(view);
    }

    /* renamed from: B */
    public final void mo19766B(ViewGroup viewGroup) {
        super.mo19766B(viewGroup);
        int size = this.f16600z.size();
        for (int i = 0; i < size; i++) {
            this.f16600z.get(i).mo19766B(viewGroup);
        }
    }

    /* renamed from: C */
    public final void mo19767C() {
        if (this.f16600z.isEmpty()) {
            mo19774K();
            mo19786p();
            return;
        }
        C7431b bVar = new C7431b(this);
        Iterator<C7418m> it = this.f16600z.iterator();
        while (it.hasNext()) {
            it.next().mo19776a(bVar);
        }
        this.f16597B = this.f16600z.size();
        if (!this.f16596A) {
            for (int i = 1; i < this.f16600z.size(); i++) {
                this.f16600z.get(i - 1).mo19776a(new C7430a(this.f16600z.get(i)));
            }
            C7418m mVar = this.f16600z.get(0);
            if (mVar != null) {
                mVar.mo19767C();
                return;
            }
            return;
        }
        Iterator<C7418m> it2 = this.f16600z.iterator();
        while (it2.hasNext()) {
            it2.next().mo19767C();
        }
    }

    /* renamed from: E */
    public final void mo19769E(C7418m.C7421c cVar) {
        this.f16579u = cVar;
        this.f16599D |= 8;
        int size = this.f16600z.size();
        for (int i = 0; i < size; i++) {
            this.f16600z.get(i).mo19769E(cVar);
        }
    }

    /* renamed from: H */
    public final void mo19771H(C16910l lVar) {
        super.mo19771H(lVar);
        this.f16599D |= 4;
        if (this.f16600z != null) {
            for (int i = 0; i < this.f16600z.size(); i++) {
                this.f16600z.get(i).mo19771H(lVar);
            }
        }
    }

    /* renamed from: I */
    public final void mo19772I(C3039b bVar) {
        this.f16578t = bVar;
        this.f16599D |= 2;
        int size = this.f16600z.size();
        for (int i = 0; i < size; i++) {
            this.f16600z.get(i).mo19772I(bVar);
        }
    }

    /* renamed from: J */
    public final void mo19773J(long j) {
        this.f16561c = j;
    }

    /* renamed from: L */
    public final String mo19775L(String str) {
        String L = super.mo19775L(str);
        for (int i = 0; i < this.f16600z.size(); i++) {
            StringBuilder k = C0073e.m211k(L, "\n");
            k.append(this.f16600z.get(i).mo19775L(str + "  "));
            L = k.toString();
        }
        return L;
    }

    /* renamed from: M */
    public final void mo19801M(C7418m.C7422d dVar) {
        super.mo19776a(dVar);
    }

    /* renamed from: N */
    public final void mo19802N(C7418m mVar) {
        this.f16600z.add(mVar);
        mVar.f16568j = this;
        long j = this.f16562d;
        if (j >= 0) {
            mVar.mo19768D(j);
        }
        if ((this.f16599D & 1) != 0) {
            mVar.mo19770F(this.f16563e);
        }
        if ((this.f16599D & 2) != 0) {
            mVar.mo19772I(this.f16578t);
        }
        if ((this.f16599D & 4) != 0) {
            mVar.mo19771H(this.f16580v);
        }
        if ((this.f16599D & 8) != 0) {
            mVar.mo19769E(this.f16579u);
        }
    }

    /* renamed from: O */
    public final void mo19768D(long j) {
        ArrayList<C7418m> arrayList;
        this.f16562d = j;
        if (j >= 0 && (arrayList = this.f16600z) != null) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                this.f16600z.get(i).mo19768D(j);
            }
        }
    }

    /* renamed from: P */
    public final void mo19770F(TimeInterpolator timeInterpolator) {
        this.f16599D |= 1;
        ArrayList<C7418m> arrayList = this.f16600z;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                this.f16600z.get(i).mo19770F(timeInterpolator);
            }
        }
        this.f16563e = timeInterpolator;
    }

    /* renamed from: Q */
    public final void mo19805Q(int i) {
        if (i == 0) {
            this.f16596A = true;
        } else if (i == 1) {
            this.f16596A = false;
        } else {
            throw new AndroidRuntimeException(C0015b.m88g("Invalid parameter for TransitionSet ordering: ", i));
        }
    }

    /* renamed from: a */
    public final void mo19776a(C7418m.C7422d dVar) {
        super.mo19776a(dVar);
    }

    /* renamed from: b */
    public final void mo19777b(View view) {
        for (int i = 0; i < this.f16600z.size(); i++) {
            this.f16600z.get(i).mo19777b(view);
        }
        this.f16565g.add(view);
    }

    public final void cancel() {
        super.cancel();
        int size = this.f16600z.size();
        for (int i = 0; i < size; i++) {
            this.f16600z.get(i).cancel();
        }
    }

    /* renamed from: d */
    public final void mo19719d(C7433t tVar) {
        if (mo19791w(tVar.f16607b)) {
            Iterator<C7418m> it = this.f16600z.iterator();
            while (it.hasNext()) {
                C7418m next = it.next();
                if (next.mo19791w(tVar.f16607b)) {
                    next.mo19719d(tVar);
                    tVar.f16608c.add(next);
                }
            }
        }
    }

    /* renamed from: h */
    public final void mo19781h(C7433t tVar) {
        super.mo19781h(tVar);
        int size = this.f16600z.size();
        for (int i = 0; i < size; i++) {
            this.f16600z.get(i).mo19781h(tVar);
        }
    }

    /* renamed from: i */
    public final void mo19720i(C7433t tVar) {
        if (mo19791w(tVar.f16607b)) {
            Iterator<C7418m> it = this.f16600z.iterator();
            while (it.hasNext()) {
                C7418m next = it.next();
                if (next.mo19791w(tVar.f16607b)) {
                    next.mo19720i(tVar);
                    tVar.f16608c.add(next);
                }
            }
        }
    }

    /* renamed from: l */
    public final C7418m clone() {
        C7429r rVar = (C7429r) super.clone();
        rVar.f16600z = new ArrayList<>();
        int size = this.f16600z.size();
        for (int i = 0; i < size; i++) {
            C7418m l = this.f16600z.get(i).clone();
            rVar.f16600z.add(l);
            l.f16568j = rVar;
        }
        return rVar;
    }

    /* renamed from: o */
    public final void mo19785o(ViewGroup viewGroup, C7434u uVar, C7434u uVar2, ArrayList<C7433t> arrayList, ArrayList<C7433t> arrayList2) {
        long j = this.f16561c;
        int size = this.f16600z.size();
        for (int i = 0; i < size; i++) {
            C7418m mVar = this.f16600z.get(i);
            if (j > 0 && (this.f16596A || i == 0)) {
                long j2 = mVar.f16561c;
                if (j2 > 0) {
                    mVar.mo19773J(j2 + j);
                } else {
                    mVar.mo19773J(j);
                }
            }
            mVar.mo19785o(viewGroup, uVar, uVar2, arrayList, arrayList2);
        }
    }

    /* renamed from: q */
    public final void mo19787q(ViewGroup viewGroup) {
        super.mo19787q(viewGroup);
        int size = this.f16600z.size();
        for (int i = 0; i < size; i++) {
            this.f16600z.get(i).mo19787q(viewGroup);
        }
    }

    /* renamed from: y */
    public final void mo19792y(View view) {
        super.mo19792y(view);
        int size = this.f16600z.size();
        for (int i = 0; i < size; i++) {
            this.f16600z.get(i).mo19792y(view);
        }
    }

    /* renamed from: z */
    public final void mo19793z(C7418m.C7422d dVar) {
        super.mo19793z(dVar);
    }
}
