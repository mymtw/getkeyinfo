package androidx.lifecycle;

import android.annotation.SuppressLint;
import android.os.Looper;
import android.support.p013v4.media.C0072d;
import androidx.lifecycle.Lifecycle;
import java.lang.ref.WeakReference;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import p010a9.C0048b;
import p121h.C6900a;
import p133i.C6970a;
import p133i.C6971b;

/* renamed from: androidx.lifecycle.t */
public final class C2888t extends Lifecycle {

    /* renamed from: b */
    public C6970a<C2886r, C2889a> f6516b;

    /* renamed from: c */
    public Lifecycle.State f6517c;

    /* renamed from: d */
    public final WeakReference<C2887s> f6518d;

    /* renamed from: e */
    public int f6519e;

    /* renamed from: f */
    public boolean f6520f;

    /* renamed from: g */
    public boolean f6521g;

    /* renamed from: h */
    public ArrayList<Lifecycle.State> f6522h;

    /* renamed from: i */
    public final boolean f6523i;

    /* renamed from: androidx.lifecycle.t$a */
    public static class C2889a {

        /* renamed from: a */
        public Lifecycle.State f6524a;

        /* renamed from: b */
        public C2885q f6525b;

        public C2889a(C2886r rVar, Lifecycle.State state) {
            C2885q qVar;
            HashMap hashMap = C2891v.f6526a;
            boolean z = rVar instanceof C2885q;
            boolean z2 = rVar instanceof C2877l;
            if (z && z2) {
                qVar = new FullLifecycleObserverAdapter((C2877l) rVar, (C2885q) rVar);
            } else if (z2) {
                qVar = new FullLifecycleObserverAdapter((C2877l) rVar, (C2885q) null);
            } else if (z) {
                qVar = (C2885q) rVar;
            } else {
                Class<?> cls = rVar.getClass();
                if (C2891v.m6821c(cls) == 2) {
                    List list = (List) C2891v.f6527b.get(cls);
                    if (list.size() == 1) {
                        qVar = new SingleGeneratedAdapterObserver(C2891v.m6819a((Constructor) list.get(0), rVar));
                    } else {
                        C2879m[] mVarArr = new C2879m[list.size()];
                        for (int i = 0; i < list.size(); i++) {
                            mVarArr[i] = C2891v.m6819a((Constructor) list.get(i), rVar);
                        }
                        qVar = new CompositeGeneratedAdaptersObserver(mVarArr);
                    }
                } else {
                    qVar = new ReflectiveGenericLifecycleObserver(rVar);
                }
            }
            this.f6525b = qVar;
            this.f6524a = state;
        }

        /* renamed from: a */
        public final void mo10841a(C2887s sVar, Lifecycle.Event event) {
            Lifecycle.State targetState = event.getTargetState();
            Lifecycle.State state = this.f6524a;
            if (targetState != null && targetState.compareTo(state) < 0) {
                state = targetState;
            }
            this.f6524a = state;
            this.f6525b.onStateChanged(sVar, event);
            this.f6524a = targetState;
        }
    }

    public C2888t() {
        throw null;
    }

    public C2888t(C2887s sVar, boolean z) {
        this.f6516b = new C6970a<>();
        this.f6519e = 0;
        this.f6520f = false;
        this.f6521g = false;
        this.f6522h = new ArrayList<>();
        this.f6518d = new WeakReference<>(sVar);
        this.f6517c = Lifecycle.State.INITIALIZED;
        this.f6523i = z;
    }

    /* renamed from: a */
    public final void mo10733a(C2886r rVar) {
        C2887s sVar;
        mo10836e("addObserver");
        Lifecycle.State state = this.f6517c;
        Lifecycle.State state2 = Lifecycle.State.DESTROYED;
        if (state != state2) {
            state2 = Lifecycle.State.INITIALIZED;
        }
        C2889a aVar = new C2889a(rVar, state2);
        if (this.f6516b.mo19126c(rVar, aVar) == null && (sVar = this.f6518d.get()) != null) {
            boolean z = this.f6519e != 0 || this.f6520f;
            Lifecycle.State d = mo10835d(rVar);
            this.f6519e++;
            while (aVar.f6524a.compareTo(d) < 0 && this.f6516b.f15451f.containsKey(rVar)) {
                this.f6522h.add(aVar.f6524a);
                Lifecycle.Event upFrom = Lifecycle.Event.upFrom(aVar.f6524a);
                if (upFrom != null) {
                    aVar.mo10841a(sVar, upFrom);
                    ArrayList<Lifecycle.State> arrayList = this.f6522h;
                    arrayList.remove(arrayList.size() - 1);
                    d = mo10835d(rVar);
                } else {
                    StringBuilder h = C0072d.m201h("no event up from ");
                    h.append(aVar.f6524a);
                    throw new IllegalStateException(h.toString());
                }
            }
            if (!z) {
                mo10840i();
            }
            this.f6519e--;
        }
    }

    /* renamed from: b */
    public final Lifecycle.State mo10734b() {
        return this.f6517c;
    }

    /* renamed from: c */
    public final void mo10735c(C2886r rVar) {
        mo10836e("removeObserver");
        this.f6516b.mo19127e(rVar);
    }

    /* renamed from: d */
    public final Lifecycle.State mo10835d(C2886r rVar) {
        C6970a<C2886r, C2889a> aVar = this.f6516b;
        Lifecycle.State state = null;
        C6971b.C6974c<K, V> cVar = aVar.f15451f.containsKey(rVar) ? aVar.f15451f.get(rVar).f15459e : null;
        Lifecycle.State state2 = cVar != null ? ((C2889a) cVar.f15457c).f6524a : null;
        if (!this.f6522h.isEmpty()) {
            ArrayList<Lifecycle.State> arrayList = this.f6522h;
            state = arrayList.get(arrayList.size() - 1);
        }
        Lifecycle.State state3 = this.f6517c;
        if (state2 == null || state2.compareTo(state3) >= 0) {
            state2 = state3;
        }
        return (state == null || state.compareTo(state2) >= 0) ? state2 : state;
    }

    @SuppressLint({"RestrictedApi"})
    /* renamed from: e */
    public final void mo10836e(String str) {
        if (this.f6523i) {
            C6900a.m13347u0().f15278c.getClass();
            if (!(Looper.getMainLooper().getThread() == Thread.currentThread())) {
                throw new IllegalStateException(C0048b.m163a("Method ", str, " must be called on the main thread"));
            }
        }
    }

    /* renamed from: f */
    public final void mo10837f(Lifecycle.Event event) {
        mo10836e("handleLifecycleEvent");
        mo10838g(event.getTargetState());
    }

    /* renamed from: g */
    public final void mo10838g(Lifecycle.State state) {
        if (this.f6517c != state) {
            this.f6517c = state;
            if (this.f6520f || this.f6519e != 0) {
                this.f6521g = true;
                return;
            }
            this.f6520f = true;
            mo10840i();
            this.f6520f = false;
        }
    }

    /* renamed from: h */
    public final void mo10839h(Lifecycle.State state) {
        mo10836e("setCurrentState");
        mo10838g(state);
    }

    /* renamed from: i */
    public final void mo10840i() {
        Lifecycle.State state;
        C2887s sVar = this.f6518d.get();
        if (sVar != null) {
            while (true) {
                C6970a<C2886r, C2889a> aVar = this.f6516b;
                boolean z = true;
                if (!(aVar.f15455e == 0 || (((C2889a) aVar.f15452b.f15457c).f6524a == (state = ((C2889a) aVar.f15453c.f15457c).f6524a) && this.f6517c == state))) {
                    z = false;
                }
                if (!z) {
                    this.f6521g = false;
                    if (this.f6517c.compareTo(((C2889a) aVar.f15452b.f15457c).f6524a) < 0) {
                        C6970a<C2886r, C2889a> aVar2 = this.f6516b;
                        C6971b.C6973b bVar = new C6971b.C6973b(aVar2.f15453c, aVar2.f15452b);
                        aVar2.f15454d.put(bVar, Boolean.FALSE);
                        while (bVar.hasNext() && !this.f6521g) {
                            Map.Entry entry = (Map.Entry) bVar.next();
                            C2889a aVar3 = (C2889a) entry.getValue();
                            while (aVar3.f6524a.compareTo(this.f6517c) > 0 && !this.f6521g) {
                                if (!this.f6516b.f15451f.containsKey((C2886r) entry.getKey())) {
                                    continue;
                                    break;
                                }
                                Lifecycle.Event downFrom = Lifecycle.Event.downFrom(aVar3.f6524a);
                                if (downFrom != null) {
                                    this.f6522h.add(downFrom.getTargetState());
                                    aVar3.mo10841a(sVar, downFrom);
                                    ArrayList<Lifecycle.State> arrayList = this.f6522h;
                                    arrayList.remove(arrayList.size() - 1);
                                } else {
                                    StringBuilder h = C0072d.m201h("no event down from ");
                                    h.append(aVar3.f6524a);
                                    throw new IllegalStateException(h.toString());
                                }
                            }
                        }
                    }
                    C6971b.C6974c<K, V> cVar = this.f6516b.f15453c;
                    if (!this.f6521g && cVar != null && this.f6517c.compareTo(((C2889a) cVar.f15457c).f6524a) > 0) {
                        C6970a<C2886r, C2889a> aVar4 = this.f6516b;
                        aVar4.getClass();
                        C6971b.C6975d dVar = new C6971b.C6975d();
                        aVar4.f15454d.put(dVar, Boolean.FALSE);
                        while (dVar.hasNext() && !this.f6521g) {
                            Map.Entry entry2 = (Map.Entry) dVar.next();
                            C2889a aVar5 = (C2889a) entry2.getValue();
                            while (aVar5.f6524a.compareTo(this.f6517c) < 0 && !this.f6521g) {
                                if (!this.f6516b.f15451f.containsKey((C2886r) entry2.getKey())) {
                                    continue;
                                    break;
                                }
                                this.f6522h.add(aVar5.f6524a);
                                Lifecycle.Event upFrom = Lifecycle.Event.upFrom(aVar5.f6524a);
                                if (upFrom != null) {
                                    aVar5.mo10841a(sVar, upFrom);
                                    ArrayList<Lifecycle.State> arrayList2 = this.f6522h;
                                    arrayList2.remove(arrayList2.size() - 1);
                                } else {
                                    StringBuilder h2 = C0072d.m201h("no event up from ");
                                    h2.append(aVar5.f6524a);
                                    throw new IllegalStateException(h2.toString());
                                }
                            }
                        }
                    }
                } else {
                    this.f6521g = false;
                    return;
                }
            }
        } else {
            throw new IllegalStateException("LifecycleOwner of this LifecycleRegistry is alreadygarbage collected. It is too late to change lifecycle state.");
        }
    }
}
