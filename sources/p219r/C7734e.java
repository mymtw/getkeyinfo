package p219r;

import com.etsy.android.lib.models.ResponseConstants;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
import kotlin.collections.C19318k;
import kotlin.jvm.internal.C19382n;
import kotlin.jvm.internal.C19383o;
import p568fn.C17782b;
import p628nj.C18263b;
import p755lq.C19875a;
import p755lq.C19877c;

/* renamed from: r.e */
public final class C7734e<T> implements RandomAccess {

    /* renamed from: b */
    public T[] f17155b;

    /* renamed from: c */
    public C7735a f17156c;

    /* renamed from: d */
    public int f17157d = 0;

    /* renamed from: r.e$a */
    public static final class C7735a<T> implements List<T>, C19877c {

        /* renamed from: b */
        public final C7734e<T> f17158b;

        public C7735a(C7734e<T> eVar) {
            C19383o.m32797g(eVar, "vector");
            this.f17158b = eVar;
        }

        public final boolean add(T t) {
            this.f17158b.mo20232c(t);
            return true;
        }

        public final boolean addAll(int i, Collection<? extends T> collection) {
            C19383o.m32797g(collection, "elements");
            return this.f17158b.mo20234f(i, collection);
        }

        public final void clear() {
            this.f17158b.mo20235g();
        }

        public final boolean contains(Object obj) {
            return this.f17158b.mo20236j(obj);
        }

        public final boolean containsAll(Collection<? extends Object> collection) {
            C19383o.m32797g(collection, "elements");
            C7734e<T> eVar = this.f17158b;
            eVar.getClass();
            Iterator<T> it = collection.iterator();
            while (it.hasNext()) {
                if (!eVar.mo20236j(it.next())) {
                    return false;
                }
            }
            return true;
        }

        public final T get(int i) {
            C19382n.m32699B(i, this);
            return this.f17158b.f17155b[i];
        }

        public final int indexOf(Object obj) {
            return this.f17158b.mo20238l(obj);
        }

        public final boolean isEmpty() {
            return this.f17158b.mo20239m();
        }

        public final Iterator<T> iterator() {
            return new C7737c(0, this);
        }

        public final int lastIndexOf(Object obj) {
            C7734e<T> eVar = this.f17158b;
            int i = eVar.f17157d;
            if (i <= 0) {
                return -1;
            }
            int i2 = i - 1;
            T[] tArr = eVar.f17155b;
            while (!C19383o.m32792b(obj, tArr[i2])) {
                i2--;
                if (i2 < 0) {
                    return -1;
                }
            }
            return i2;
        }

        public final ListIterator<T> listIterator() {
            return new C7737c(0, this);
        }

        public final boolean remove(Object obj) {
            return this.f17158b.mo20241o(obj);
        }

        public final boolean removeAll(Collection<? extends Object> collection) {
            C19383o.m32797g(collection, "elements");
            C7734e<T> eVar = this.f17158b;
            eVar.getClass();
            if (collection.isEmpty()) {
                return false;
            }
            int i = eVar.f17157d;
            Iterator<T> it = collection.iterator();
            while (it.hasNext()) {
                eVar.mo20241o(it.next());
            }
            return i != eVar.f17157d;
        }

        public final boolean retainAll(Collection<? extends Object> collection) {
            C19383o.m32797g(collection, "elements");
            C7734e<T> eVar = this.f17158b;
            eVar.getClass();
            int i = eVar.f17157d;
            for (int i2 = i - 1; -1 < i2; i2--) {
                if (!collection.contains(eVar.f17155b[i2])) {
                    eVar.mo20243q(i2);
                }
            }
            return i != eVar.f17157d;
        }

        public final T set(int i, T t) {
            C19382n.m32699B(i, this);
            T[] tArr = this.f17158b.f17155b;
            T t2 = tArr[i];
            tArr[i] = t;
            return t2;
        }

        public final int size() {
            return this.f17158b.f17157d;
        }

        public final List<T> subList(int i, int i2) {
            C19382n.m32701C(this, i, i2);
            return new C7736b(this, i, i2);
        }

        public final Object[] toArray() {
            return C18263b.m30861p0(this);
        }

        public final <T> T[] toArray(T[] tArr) {
            C19383o.m32797g(tArr, "array");
            return C18263b.m30863q0(this, tArr);
        }

        public final void add(int i, T t) {
            this.f17158b.mo20231a(i, t);
        }

        public final boolean addAll(Collection<? extends T> collection) {
            C19383o.m32797g(collection, "elements");
            C7734e<T> eVar = this.f17158b;
            eVar.getClass();
            return eVar.mo20234f(eVar.f17157d, collection);
        }

        public final ListIterator<T> listIterator(int i) {
            return new C7737c(i, this);
        }

        public final T remove(int i) {
            C19382n.m32699B(i, this);
            return this.f17158b.mo20243q(i);
        }
    }

    /* renamed from: r.e$b */
    public static final class C7736b<T> implements List<T>, C19877c {

        /* renamed from: b */
        public final List<T> f17159b;

        /* renamed from: c */
        public final int f17160c;

        /* renamed from: d */
        public int f17161d;

        public C7736b(List<T> list, int i, int i2) {
            C19383o.m32797g(list, ResponseConstants.LIST);
            this.f17159b = list;
            this.f17160c = i;
            this.f17161d = i2;
        }

        public final boolean add(T t) {
            List<T> list = this.f17159b;
            int i = this.f17161d;
            this.f17161d = i + 1;
            list.add(i, t);
            return true;
        }

        public final boolean addAll(int i, Collection<? extends T> collection) {
            C19383o.m32797g(collection, "elements");
            this.f17159b.addAll(i + this.f17160c, collection);
            this.f17161d = collection.size() + this.f17161d;
            return collection.size() > 0;
        }

        public final void clear() {
            int i = this.f17161d - 1;
            int i2 = this.f17160c;
            if (i2 <= i) {
                while (true) {
                    this.f17159b.remove(i);
                    if (i == i2) {
                        break;
                    }
                    i--;
                }
            }
            this.f17161d = this.f17160c;
        }

        public final boolean contains(Object obj) {
            int i = this.f17161d;
            for (int i2 = this.f17160c; i2 < i; i2++) {
                if (C19383o.m32792b(this.f17159b.get(i2), obj)) {
                    return true;
                }
            }
            return false;
        }

        public final boolean containsAll(Collection<? extends Object> collection) {
            C19383o.m32797g(collection, "elements");
            Iterator<T> it = collection.iterator();
            while (it.hasNext()) {
                if (!contains(it.next())) {
                    return false;
                }
            }
            return true;
        }

        public final T get(int i) {
            C19382n.m32699B(i, this);
            return this.f17159b.get(i + this.f17160c);
        }

        public final int indexOf(Object obj) {
            int i = this.f17161d;
            for (int i2 = this.f17160c; i2 < i; i2++) {
                if (C19383o.m32792b(this.f17159b.get(i2), obj)) {
                    return i2 - this.f17160c;
                }
            }
            return -1;
        }

        public final boolean isEmpty() {
            return this.f17161d == this.f17160c;
        }

        public final Iterator<T> iterator() {
            return new C7737c(0, this);
        }

        public final int lastIndexOf(Object obj) {
            int i = this.f17161d - 1;
            int i2 = this.f17160c;
            if (i2 > i) {
                return -1;
            }
            while (!C19383o.m32792b(this.f17159b.get(i), obj)) {
                if (i == i2) {
                    return -1;
                }
                i--;
            }
            return i - this.f17160c;
        }

        public final ListIterator<T> listIterator() {
            return new C7737c(0, this);
        }

        public final boolean remove(Object obj) {
            int i = this.f17161d;
            for (int i2 = this.f17160c; i2 < i; i2++) {
                if (C19383o.m32792b(this.f17159b.get(i2), obj)) {
                    this.f17159b.remove(i2);
                    this.f17161d--;
                    return true;
                }
            }
            return false;
        }

        public final boolean removeAll(Collection<? extends Object> collection) {
            C19383o.m32797g(collection, "elements");
            int i = this.f17161d;
            Iterator<T> it = collection.iterator();
            while (it.hasNext()) {
                remove((Object) it.next());
            }
            return i != this.f17161d;
        }

        public final boolean retainAll(Collection<? extends Object> collection) {
            C19383o.m32797g(collection, "elements");
            int i = this.f17161d;
            int i2 = i - 1;
            int i3 = this.f17160c;
            if (i3 <= i2) {
                while (true) {
                    if (!collection.contains(this.f17159b.get(i2))) {
                        this.f17159b.remove(i2);
                        this.f17161d--;
                    }
                    if (i2 == i3) {
                        break;
                    }
                    i2--;
                }
            }
            return i != this.f17161d;
        }

        public final T set(int i, T t) {
            C19382n.m32699B(i, this);
            return this.f17159b.set(i + this.f17160c, t);
        }

        public final int size() {
            return this.f17161d - this.f17160c;
        }

        public final List<T> subList(int i, int i2) {
            C19382n.m32701C(this, i, i2);
            return new C7736b(this, i, i2);
        }

        public final Object[] toArray() {
            return C18263b.m30861p0(this);
        }

        public final <T> T[] toArray(T[] tArr) {
            C19383o.m32797g(tArr, "array");
            return C18263b.m30863q0(this, tArr);
        }

        public final void add(int i, T t) {
            this.f17159b.add(i + this.f17160c, t);
            this.f17161d++;
        }

        public final ListIterator<T> listIterator(int i) {
            return new C7737c(i, this);
        }

        public final boolean addAll(Collection<? extends T> collection) {
            C19383o.m32797g(collection, "elements");
            this.f17159b.addAll(this.f17161d, collection);
            this.f17161d = collection.size() + this.f17161d;
            return collection.size() > 0;
        }

        public final T remove(int i) {
            C19382n.m32699B(i, this);
            this.f17161d--;
            return this.f17159b.remove(i + this.f17160c);
        }
    }

    /* renamed from: r.e$c */
    public static final class C7737c<T> implements ListIterator<T>, C19875a {

        /* renamed from: b */
        public final List<T> f17162b;

        /* renamed from: c */
        public int f17163c;

        public C7737c(int i, List list) {
            C19383o.m32797g(list, ResponseConstants.LIST);
            this.f17162b = list;
            this.f17163c = i;
        }

        public final void add(T t) {
            this.f17162b.add(this.f17163c, t);
            this.f17163c++;
        }

        public final boolean hasNext() {
            return this.f17163c < this.f17162b.size();
        }

        public final boolean hasPrevious() {
            return this.f17163c > 0;
        }

        public final T next() {
            List<T> list = this.f17162b;
            int i = this.f17163c;
            this.f17163c = i + 1;
            return list.get(i);
        }

        public final int nextIndex() {
            return this.f17163c;
        }

        public final T previous() {
            int i = this.f17163c - 1;
            this.f17163c = i;
            return this.f17162b.get(i);
        }

        public final int previousIndex() {
            return this.f17163c - 1;
        }

        public final void remove() {
            int i = this.f17163c - 1;
            this.f17163c = i;
            this.f17162b.remove(i);
        }

        public final void set(T t) {
            this.f17162b.set(this.f17163c, t);
        }
    }

    public C7734e(Object[] objArr) {
        this.f17155b = objArr;
    }

    /* renamed from: a */
    public final void mo20231a(int i, T t) {
        mo20237k(this.f17157d + 1);
        T[] tArr = this.f17155b;
        int i2 = this.f17157d;
        if (i != i2) {
            C19318k.m32603U0(tArr, i + 1, tArr, i, i2);
        }
        tArr[i] = t;
        this.f17157d++;
    }

    /* renamed from: c */
    public final void mo20232c(Object obj) {
        mo20237k(this.f17157d + 1);
        T[] tArr = this.f17155b;
        int i = this.f17157d;
        tArr[i] = obj;
        this.f17157d = i + 1;
    }

    /* renamed from: e */
    public final void mo20233e(int i, C7734e eVar) {
        C19383o.m32797g(eVar, "elements");
        if (!eVar.mo20239m()) {
            mo20237k(this.f17157d + eVar.f17157d);
            T[] tArr = this.f17155b;
            int i2 = this.f17157d;
            if (i != i2) {
                C19318k.m32603U0(tArr, eVar.f17157d + i, tArr, i, i2);
            }
            C19318k.m32603U0(eVar.f17155b, i, tArr, 0, eVar.f17157d);
            this.f17157d += eVar.f17157d;
        }
    }

    /* renamed from: f */
    public final boolean mo20234f(int i, Collection<? extends T> collection) {
        C19383o.m32797g(collection, "elements");
        int i2 = 0;
        if (collection.isEmpty()) {
            return false;
        }
        mo20237k(collection.size() + this.f17157d);
        T[] tArr = this.f17155b;
        if (i != this.f17157d) {
            C19318k.m32603U0(tArr, collection.size() + i, tArr, i, this.f17157d);
        }
        for (T next : collection) {
            int i3 = i2 + 1;
            if (i2 >= 0) {
                tArr[i2 + i] = next;
                i2 = i3;
            } else {
                C17782b.m29877o0();
                throw null;
            }
        }
        this.f17157d = collection.size() + this.f17157d;
        return true;
    }

    /* renamed from: g */
    public final void mo20235g() {
        T[] tArr = this.f17155b;
        int i = this.f17157d;
        while (true) {
            i--;
            if (-1 < i) {
                tArr[i] = null;
            } else {
                this.f17157d = 0;
                return;
            }
        }
    }

    /* renamed from: j */
    public final boolean mo20236j(T t) {
        int i = this.f17157d - 1;
        if (i >= 0) {
            int i2 = 0;
            while (!C19383o.m32792b(this.f17155b[i2], t)) {
                if (i2 != i) {
                    i2++;
                }
            }
            return true;
        }
        return false;
    }

    /* renamed from: k */
    public final void mo20237k(int i) {
        T[] tArr = this.f17155b;
        if (tArr.length < i) {
            T[] copyOf = Arrays.copyOf(tArr, Math.max(i, tArr.length * 2));
            C19383o.m32796f(copyOf, "copyOf(this, newSize)");
            this.f17155b = copyOf;
        }
    }

    /* renamed from: l */
    public final int mo20238l(T t) {
        int i = this.f17157d;
        if (i <= 0) {
            return -1;
        }
        int i2 = 0;
        T[] tArr = this.f17155b;
        while (!C19383o.m32792b(t, tArr[i2])) {
            i2++;
            if (i2 >= i) {
                return -1;
            }
        }
        return i2;
    }

    /* renamed from: m */
    public final boolean mo20239m() {
        return this.f17157d == 0;
    }

    /* renamed from: n */
    public final boolean mo20240n() {
        return this.f17157d != 0;
    }

    /* renamed from: o */
    public final boolean mo20241o(T t) {
        int l = mo20238l(t);
        if (l < 0) {
            return false;
        }
        mo20243q(l);
        return true;
    }

    /* renamed from: p */
    public final void mo20242p(C7734e eVar) {
        C19383o.m32797g(eVar, "elements");
        int i = eVar.f17157d - 1;
        if (i >= 0) {
            int i2 = 0;
            while (true) {
                mo20241o(eVar.f17155b[i2]);
                if (i2 != i) {
                    i2++;
                } else {
                    return;
                }
            }
        }
    }

    /* renamed from: q */
    public final T mo20243q(int i) {
        T[] tArr = this.f17155b;
        T t = tArr[i];
        int i2 = this.f17157d;
        if (i != i2 - 1) {
            C19318k.m32603U0(tArr, i, tArr, i + 1, i2);
        }
        int i3 = this.f17157d - 1;
        this.f17157d = i3;
        tArr[i3] = null;
        return t;
    }

    /* renamed from: s */
    public final void mo20244s(Comparator<T> comparator) {
        C19383o.m32797g(comparator, "comparator");
        T[] tArr = this.f17155b;
        int i = this.f17157d;
        C19383o.m32797g(tArr, "<this>");
        Arrays.sort(tArr, 0, i, comparator);
    }
}
