package com.zhuinden.simplestack;

import com.zhuinden.simplestack.C17518a;
import com.zhuinden.simplestack.PendingStateChange;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

/* renamed from: com.zhuinden.simplestack.i */
public final class C17532i {

    /* renamed from: a */
    public final ArrayList f38342a;

    /* renamed from: b */
    public final List<Object> f38343b;

    /* renamed from: c */
    public ArrayList f38344c;

    /* renamed from: d */
    public ArrayList f38345d;

    /* renamed from: e */
    public LinkedList<PendingStateChange> f38346e = new LinkedList<>();

    /* renamed from: f */
    public C17546p f38347f;

    /* renamed from: g */
    public final long f38348g = Thread.currentThread().getId();

    /* renamed from: h */
    public LinkedList<C17518a.C17521c> f38349h = new LinkedList<>();

    public C17532i(List<?> list) {
        ArrayList arrayList = new ArrayList();
        this.f38342a = arrayList;
        this.f38345d = arrayList;
        if (list == null) {
            throw new NullPointerException("Initial key list should not be null");
        } else if (list.size() > 0) {
            List<Object> unmodifiableList = Collections.unmodifiableList(new ArrayList(list));
            this.f38343b = unmodifiableList;
            ArrayList arrayList2 = new ArrayList(unmodifiableList);
            if (arrayList2.size() > 0) {
                this.f38344c = new ArrayList(arrayList2);
                return;
            }
            throw new IllegalArgumentException("At least one initial key must be defined");
        } else {
            throw new IllegalArgumentException("Initial key list should contain at least one element");
        }
    }

    /* renamed from: a */
    public final void mo68747a() {
        if (Thread.currentThread().getId() != this.f38348g) {
            throw new IllegalStateException("The backstack is not thread-safe, and must be manipulated only from the thread where it was originally created.");
        }
    }

    /* renamed from: b */
    public final boolean mo68748b() {
        mo68747a();
        if (this.f38347f != null) {
            mo68747a();
            if (!this.f38346e.isEmpty()) {
                PendingStateChange first = this.f38346e.getFirst();
                if (first.f38316e == PendingStateChange.Status.ENQUEUED) {
                    first.mo68694a(PendingStateChange.Status.IN_PROGRESS);
                    C17545o oVar = new C17545o(Collections.unmodifiableList(first.f38314c ? Collections.emptyList() : new ArrayList(this.f38345d)), Collections.unmodifiableList(first.f38312a), first.f38313b);
                    C17531h hVar = new C17531h(this, first, oVar);
                    first.f38317f = hVar;
                    this.f38347f.mo37061a(oVar, hVar);
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: c */
    public final void mo68749c(AbstractList abstractList, int i, boolean z, boolean z2, boolean z3) {
        this.f38346e.add(new PendingStateChange(abstractList, i, z, z2));
        mo68748b();
    }

    /* renamed from: d */
    public final void mo68750d(AbstractList abstractList, int i, boolean z, boolean z2) {
        if (!abstractList.isEmpty()) {
            mo68747a();
            if (this.f38346e.isEmpty() || !this.f38346e.peekLast().f38315d || z2) {
                mo68749c(abstractList, i, false, z, z2);
                return;
            }
            return;
        }
        throw new IllegalArgumentException("New history cannot be null or empty");
    }

    /* renamed from: e */
    public final List<?> mo68751e() {
        return (!this.f38345d.isEmpty() || this.f38346e.size() > 0) ? this.f38346e.size() <= 0 ? this.f38345d : this.f38346e.getLast().f38312a : this.f38344c;
    }

    /* renamed from: f */
    public final void mo68752f(C17518a.C17519a aVar, int i) {
        if (aVar != null) {
            mo68747a();
            this.f38347f = aVar;
            if (i != 0 || (this.f38346e.size() > 1 && !this.f38345d.isEmpty())) {
                mo68748b();
            } else if (!mo68748b()) {
                ArrayList arrayList = new ArrayList(mo68751e());
                if (this.f38345d.isEmpty()) {
                    this.f38345d = this.f38344c;
                }
                mo68749c(arrayList, 0, true, false, true);
            }
        } else {
            throw new NullPointerException("New state changer cannot be null");
        }
    }
}
