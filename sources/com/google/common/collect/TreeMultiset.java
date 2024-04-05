package com.google.common.collect;

import com.etsy.android.lib.models.ResponseConstants;
import com.fasterxml.jackson.core.base.ParserMinimalBase;
import com.google.common.base.C15788i;
import com.google.common.base.C15794l;
import com.google.common.collect.C16178h1;
import com.google.common.collect.Multisets;
import com.google.common.primitives.Ints;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Comparator;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NavigableSet;
import java.util.NoSuchElementException;
import java.util.Set;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

public final class TreeMultiset<E> extends C16175h<E> implements Serializable {
    private static final long serialVersionUID = 1;

    /* renamed from: e */
    public final transient C16128e<C16127d<E>> f36193e;

    /* renamed from: f */
    public final transient GeneralRange<E> f36194f;

    /* renamed from: g */
    public final transient C16127d<E> f36195g;

    public enum Aggregate {
        SIZE {
            public int nodeAggregate(C16127d<?> dVar) {
                return dVar.f36204b;
            }

            public long treeAggregate(@NullableDecl C16127d<?> dVar) {
                if (dVar == null) {
                    return 0;
                }
                return dVar.f36206d;
            }
        },
        DISTINCT {
            public int nodeAggregate(C16127d<?> dVar) {
                return 1;
            }

            public long treeAggregate(@NullableDecl C16127d<?> dVar) {
                if (dVar == null) {
                    return 0;
                }
                return (long) dVar.f36205c;
            }
        };

        public abstract int nodeAggregate(C16127d<?> dVar);

        public abstract long treeAggregate(@NullableDecl C16127d<?> dVar);
    }

    /* renamed from: com.google.common.collect.TreeMultiset$a */
    public class C16124a implements Iterator<C16178h1.C16179a<E>> {

        /* renamed from: b */
        public C16127d<E> f36196b;
        @NullableDecl

        /* renamed from: c */
        public C16178h1.C16179a<E> f36197c;

        public C16124a() {
            this.f36196b = TreeMultiset.access$1200(TreeMultiset.this);
        }

        public final boolean hasNext() {
            if (this.f36196b == null) {
                return false;
            }
            if (!TreeMultiset.this.f36194f.tooHigh(this.f36196b.f36203a)) {
                return true;
            }
            this.f36196b = null;
            return false;
        }

        public final Object next() {
            if (hasNext()) {
                C16178h1.C16179a<E> access$1400 = TreeMultiset.access$1400(TreeMultiset.this, this.f36196b);
                this.f36197c = access$1400;
                if (this.f36196b.f36211i == TreeMultiset.this.f36195g) {
                    this.f36196b = null;
                } else {
                    this.f36196b = this.f36196b.f36211i;
                }
                return access$1400;
            }
            throw new NoSuchElementException();
        }

        public final void remove() {
            C16203o.m26218e(this.f36197c != null);
            TreeMultiset.this.setCount(this.f36197c.getElement(), 0);
            this.f36197c = null;
        }
    }

    /* renamed from: com.google.common.collect.TreeMultiset$b */
    public class C16125b implements Iterator<C16178h1.C16179a<E>> {

        /* renamed from: b */
        public C16127d<E> f36199b;

        /* renamed from: c */
        public C16178h1.C16179a<E> f36200c = null;

        public C16125b() {
            this.f36199b = TreeMultiset.access$1600(TreeMultiset.this);
        }

        public final boolean hasNext() {
            if (this.f36199b == null) {
                return false;
            }
            if (!TreeMultiset.this.f36194f.tooLow(this.f36199b.f36203a)) {
                return true;
            }
            this.f36199b = null;
            return false;
        }

        public final Object next() {
            if (hasNext()) {
                C16178h1.C16179a<E> access$1400 = TreeMultiset.access$1400(TreeMultiset.this, this.f36199b);
                this.f36200c = access$1400;
                if (this.f36199b.f36210h == TreeMultiset.this.f36195g) {
                    this.f36199b = null;
                } else {
                    this.f36199b = this.f36199b.f36210h;
                }
                return access$1400;
            }
            throw new NoSuchElementException();
        }

        public final void remove() {
            C16203o.m26218e(this.f36200c != null);
            TreeMultiset.this.setCount(this.f36200c.getElement(), 0);
            this.f36200c = null;
        }
    }

    /* renamed from: com.google.common.collect.TreeMultiset$c */
    public static /* synthetic */ class C16126c {

        /* renamed from: a */
        public static final /* synthetic */ int[] f36202a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|6) */
        /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        static {
            /*
                com.google.common.collect.BoundType[] r0 = com.google.common.collect.BoundType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f36202a = r0
                com.google.common.collect.BoundType r1 = com.google.common.collect.BoundType.OPEN     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f36202a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.google.common.collect.BoundType r1 = com.google.common.collect.BoundType.CLOSED     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.common.collect.TreeMultiset.C16126c.<clinit>():void");
        }
    }

    /* renamed from: com.google.common.collect.TreeMultiset$d */
    public static final class C16127d<E> {
        @NullableDecl

        /* renamed from: a */
        public final E f36203a;

        /* renamed from: b */
        public int f36204b;

        /* renamed from: c */
        public int f36205c;

        /* renamed from: d */
        public long f36206d;

        /* renamed from: e */
        public int f36207e;
        @NullableDecl

        /* renamed from: f */
        public C16127d<E> f36208f;
        @NullableDecl

        /* renamed from: g */
        public C16127d<E> f36209g;
        @NullableDecl

        /* renamed from: h */
        public C16127d<E> f36210h;
        @NullableDecl

        /* renamed from: i */
        public C16127d<E> f36211i;

        public C16127d(@NullableDecl E e, int i) {
            C15794l.m25613g(i > 0);
            this.f36203a = e;
            this.f36204b = i;
            this.f36206d = (long) i;
            this.f36205c = 1;
            this.f36207e = 1;
            this.f36208f = null;
            this.f36209g = null;
        }

        /* renamed from: a */
        public final C16127d<E> mo57520a(Comparator<? super E> comparator, @NullableDecl E e, int i, int[] iArr) {
            int compare = comparator.compare(e, this.f36203a);
            boolean z = true;
            if (compare < 0) {
                C16127d<E> dVar = this.f36208f;
                if (dVar == null) {
                    iArr[0] = 0;
                    mo57521b(i, e);
                    return this;
                }
                int i2 = dVar.f36207e;
                C16127d<E> a = dVar.mo57520a(comparator, e, i, iArr);
                this.f36208f = a;
                if (iArr[0] == 0) {
                    this.f36205c++;
                }
                this.f36206d += (long) i;
                return a.f36207e == i2 ? this : mo57527h();
            } else if (compare > 0) {
                C16127d<E> dVar2 = this.f36209g;
                if (dVar2 == null) {
                    iArr[0] = 0;
                    mo57522c(i, e);
                    return this;
                }
                int i3 = dVar2.f36207e;
                C16127d<E> a2 = dVar2.mo57520a(comparator, e, i, iArr);
                this.f36209g = a2;
                if (iArr[0] == 0) {
                    this.f36205c++;
                }
                this.f36206d += (long) i;
                return a2.f36207e == i3 ? this : mo57527h();
            } else {
                int i4 = this.f36204b;
                iArr[0] = i4;
                long j = (long) i;
                if (((long) i4) + j > ParserMinimalBase.MAX_INT_L) {
                    z = false;
                }
                C15794l.m25613g(z);
                this.f36204b += i;
                this.f36206d += j;
                return this;
            }
        }

        /* renamed from: b */
        public final void mo57521b(int i, Object obj) {
            C16127d<E> dVar = new C16127d<>(obj, i);
            this.f36208f = dVar;
            TreeMultiset.access$1700(this.f36210h, dVar, this);
            this.f36207e = Math.max(2, this.f36207e);
            this.f36205c++;
            this.f36206d += (long) i;
        }

        /* renamed from: c */
        public final void mo57522c(int i, Object obj) {
            C16127d<E> dVar = new C16127d<>(obj, i);
            this.f36209g = dVar;
            TreeMultiset.access$1700(this, dVar, this.f36211i);
            this.f36207e = Math.max(2, this.f36207e);
            this.f36205c++;
            this.f36206d += (long) i;
        }

        @NullableDecl
        /* renamed from: d */
        public final C16127d mo57523d(Object obj, Comparator comparator) {
            int compare = comparator.compare(obj, this.f36203a);
            if (compare < 0) {
                C16127d<E> dVar = this.f36208f;
                return dVar == null ? this : (C16127d) C15788i.m25602a(dVar.mo57523d(obj, comparator), this);
            } else if (compare == 0) {
                return this;
            } else {
                C16127d<E> dVar2 = this.f36209g;
                if (dVar2 == null) {
                    return null;
                }
                return dVar2.mo57523d(obj, comparator);
            }
        }

        /* renamed from: e */
        public final int mo57524e(Object obj, Comparator comparator) {
            int compare = comparator.compare(obj, this.f36203a);
            if (compare < 0) {
                C16127d<E> dVar = this.f36208f;
                if (dVar == null) {
                    return 0;
                }
                return dVar.mo57524e(obj, comparator);
            } else if (compare <= 0) {
                return this.f36204b;
            } else {
                C16127d<E> dVar2 = this.f36209g;
                if (dVar2 == null) {
                    return 0;
                }
                return dVar2.mo57524e(obj, comparator);
            }
        }

        /* renamed from: f */
        public final C16127d<E> mo57525f() {
            int i = this.f36204b;
            this.f36204b = 0;
            TreeMultiset.access$1800(this.f36210h, this.f36211i);
            C16127d<E> dVar = this.f36208f;
            if (dVar == null) {
                return this.f36209g;
            }
            C16127d<E> dVar2 = this.f36209g;
            if (dVar2 == null) {
                return dVar;
            }
            if (dVar.f36207e >= dVar2.f36207e) {
                C16127d<E> dVar3 = this.f36210h;
                dVar3.f36208f = dVar.mo57531l(dVar3);
                dVar3.f36209g = this.f36209g;
                dVar3.f36205c = this.f36205c - 1;
                dVar3.f36206d = this.f36206d - ((long) i);
                return dVar3.mo57527h();
            }
            C16127d<E> dVar4 = this.f36211i;
            dVar4.f36209g = dVar2.mo57532m(dVar4);
            dVar4.f36208f = this.f36208f;
            dVar4.f36205c = this.f36205c - 1;
            dVar4.f36206d = this.f36206d - ((long) i);
            return dVar4.mo57527h();
        }

        @NullableDecl
        /* renamed from: g */
        public final C16127d mo57526g(Object obj, Comparator comparator) {
            int compare = comparator.compare(obj, this.f36203a);
            if (compare > 0) {
                C16127d<E> dVar = this.f36209g;
                return dVar == null ? this : (C16127d) C15788i.m25602a(dVar.mo57526g(obj, comparator), this);
            } else if (compare == 0) {
                return this;
            } else {
                C16127d<E> dVar2 = this.f36208f;
                if (dVar2 == null) {
                    return null;
                }
                return dVar2.mo57526g(obj, comparator);
            }
        }

        /* renamed from: h */
        public final C16127d<E> mo57527h() {
            C16127d<E> dVar = this.f36208f;
            int i = 0;
            int i2 = dVar == null ? 0 : dVar.f36207e;
            C16127d<E> dVar2 = this.f36209g;
            int i3 = i2 - (dVar2 == null ? 0 : dVar2.f36207e);
            if (i3 == -2) {
                C16127d<E> dVar3 = dVar2.f36208f;
                int i4 = dVar3 == null ? 0 : dVar3.f36207e;
                C16127d<E> dVar4 = dVar2.f36209g;
                if (dVar4 != null) {
                    i = dVar4.f36207e;
                }
                if (i4 - i > 0) {
                    this.f36209g = dVar2.mo57534o();
                }
                return mo57533n();
            } else if (i3 != 2) {
                mo57529j();
                return this;
            } else {
                C16127d<E> dVar5 = dVar.f36208f;
                int i5 = dVar5 == null ? 0 : dVar5.f36207e;
                C16127d<E> dVar6 = dVar.f36209g;
                if (dVar6 != null) {
                    i = dVar6.f36207e;
                }
                if (i5 - i < 0) {
                    this.f36208f = dVar.mo57533n();
                }
                return mo57534o();
            }
        }

        /* renamed from: i */
        public final void mo57528i() {
            this.f36205c = TreeMultiset.distinctElements(this.f36209g) + TreeMultiset.distinctElements(this.f36208f) + 1;
            long j = (long) this.f36204b;
            C16127d<E> dVar = this.f36208f;
            long j2 = 0;
            long j3 = (dVar == null ? 0 : dVar.f36206d) + j;
            C16127d<E> dVar2 = this.f36209g;
            if (dVar2 != null) {
                j2 = dVar2.f36206d;
            }
            this.f36206d = j2 + j3;
            mo57529j();
        }

        /* renamed from: j */
        public final void mo57529j() {
            C16127d<E> dVar = this.f36208f;
            int i = 0;
            int i2 = dVar == null ? 0 : dVar.f36207e;
            C16127d<E> dVar2 = this.f36209g;
            if (dVar2 != null) {
                i = dVar2.f36207e;
            }
            this.f36207e = Math.max(i2, i) + 1;
        }

        /* renamed from: k */
        public final C16127d<E> mo57530k(Comparator<? super E> comparator, @NullableDecl E e, int i, int[] iArr) {
            int compare = comparator.compare(e, this.f36203a);
            if (compare < 0) {
                C16127d<E> dVar = this.f36208f;
                if (dVar == null) {
                    iArr[0] = 0;
                    return this;
                }
                this.f36208f = dVar.mo57530k(comparator, e, i, iArr);
                int i2 = iArr[0];
                if (i2 > 0) {
                    if (i >= i2) {
                        this.f36205c--;
                        this.f36206d -= (long) i2;
                    } else {
                        this.f36206d -= (long) i;
                    }
                }
                return i2 == 0 ? this : mo57527h();
            } else if (compare > 0) {
                C16127d<E> dVar2 = this.f36209g;
                if (dVar2 == null) {
                    iArr[0] = 0;
                    return this;
                }
                this.f36209g = dVar2.mo57530k(comparator, e, i, iArr);
                int i3 = iArr[0];
                if (i3 > 0) {
                    if (i >= i3) {
                        this.f36205c--;
                        this.f36206d -= (long) i3;
                    } else {
                        this.f36206d -= (long) i;
                    }
                }
                return mo57527h();
            } else {
                int i4 = this.f36204b;
                iArr[0] = i4;
                if (i >= i4) {
                    return mo57525f();
                }
                this.f36204b = i4 - i;
                this.f36206d -= (long) i;
                return this;
            }
        }

        /* renamed from: l */
        public final C16127d<E> mo57531l(C16127d<E> dVar) {
            C16127d<E> dVar2 = this.f36209g;
            if (dVar2 == null) {
                return this.f36208f;
            }
            this.f36209g = dVar2.mo57531l(dVar);
            this.f36205c--;
            this.f36206d -= (long) dVar.f36204b;
            return mo57527h();
        }

        /* renamed from: m */
        public final C16127d<E> mo57532m(C16127d<E> dVar) {
            C16127d<E> dVar2 = this.f36208f;
            if (dVar2 == null) {
                return this.f36209g;
            }
            this.f36208f = dVar2.mo57532m(dVar);
            this.f36205c--;
            this.f36206d -= (long) dVar.f36204b;
            return mo57527h();
        }

        /* renamed from: n */
        public final C16127d<E> mo57533n() {
            C15794l.m25623q(this.f36209g != null);
            C16127d<E> dVar = this.f36209g;
            this.f36209g = dVar.f36208f;
            dVar.f36208f = this;
            dVar.f36206d = this.f36206d;
            dVar.f36205c = this.f36205c;
            mo57528i();
            dVar.mo57529j();
            return dVar;
        }

        /* renamed from: o */
        public final C16127d<E> mo57534o() {
            C15794l.m25623q(this.f36208f != null);
            C16127d<E> dVar = this.f36208f;
            this.f36208f = dVar.f36209g;
            dVar.f36209g = this;
            dVar.f36206d = this.f36206d;
            dVar.f36205c = this.f36205c;
            mo57528i();
            dVar.mo57529j();
            return dVar;
        }

        /* renamed from: p */
        public final C16127d<E> mo57535p(Comparator<? super E> comparator, @NullableDecl E e, int i, int i2, int[] iArr) {
            int compare = comparator.compare(e, this.f36203a);
            if (compare < 0) {
                C16127d<E> dVar = this.f36208f;
                if (dVar == null) {
                    iArr[0] = 0;
                    if (i == 0 && i2 > 0) {
                        mo57521b(i2, e);
                    }
                    return this;
                }
                this.f36208f = dVar.mo57535p(comparator, e, i, i2, iArr);
                int i3 = iArr[0];
                if (i3 == i) {
                    if (i2 == 0 && i3 != 0) {
                        this.f36205c--;
                    } else if (i2 > 0 && i3 == 0) {
                        this.f36205c++;
                    }
                    this.f36206d += (long) (i2 - i3);
                }
                return mo57527h();
            } else if (compare > 0) {
                C16127d<E> dVar2 = this.f36209g;
                if (dVar2 == null) {
                    iArr[0] = 0;
                    if (i == 0 && i2 > 0) {
                        mo57522c(i2, e);
                    }
                    return this;
                }
                this.f36209g = dVar2.mo57535p(comparator, e, i, i2, iArr);
                int i4 = iArr[0];
                if (i4 == i) {
                    if (i2 == 0 && i4 != 0) {
                        this.f36205c--;
                    } else if (i2 > 0 && i4 == 0) {
                        this.f36205c++;
                    }
                    this.f36206d += (long) (i2 - i4);
                }
                return mo57527h();
            } else {
                int i5 = this.f36204b;
                iArr[0] = i5;
                if (i == i5) {
                    if (i2 == 0) {
                        return mo57525f();
                    }
                    this.f36206d += (long) (i2 - i5);
                    this.f36204b = i2;
                }
                return this;
            }
        }

        /* renamed from: q */
        public final C16127d<E> mo57536q(Comparator<? super E> comparator, @NullableDecl E e, int i, int[] iArr) {
            int compare = comparator.compare(e, this.f36203a);
            if (compare < 0) {
                C16127d<E> dVar = this.f36208f;
                if (dVar == null) {
                    iArr[0] = 0;
                    if (i > 0) {
                        mo57521b(i, e);
                    }
                    return this;
                }
                this.f36208f = dVar.mo57536q(comparator, e, i, iArr);
                if (i == 0 && iArr[0] != 0) {
                    this.f36205c--;
                } else if (i > 0 && iArr[0] == 0) {
                    this.f36205c++;
                }
                this.f36206d += (long) (i - iArr[0]);
                return mo57527h();
            } else if (compare > 0) {
                C16127d<E> dVar2 = this.f36209g;
                if (dVar2 == null) {
                    iArr[0] = 0;
                    if (i > 0) {
                        mo57522c(i, e);
                    }
                    return this;
                }
                this.f36209g = dVar2.mo57536q(comparator, e, i, iArr);
                if (i == 0 && iArr[0] != 0) {
                    this.f36205c--;
                } else if (i > 0 && iArr[0] == 0) {
                    this.f36205c++;
                }
                this.f36206d += (long) (i - iArr[0]);
                return mo57527h();
            } else {
                int i2 = this.f36204b;
                iArr[0] = i2;
                if (i == 0) {
                    return mo57525f();
                }
                this.f36206d += (long) (i - i2);
                this.f36204b = i;
                return this;
            }
        }

        public final String toString() {
            return new Multisets.ImmutableEntry(this.f36203a, this.f36204b).toString();
        }
    }

    /* renamed from: com.google.common.collect.TreeMultiset$e */
    public static final class C16128e<T> {
        @NullableDecl

        /* renamed from: a */
        public T f36212a;

        /* renamed from: a */
        public final void mo57538a(@NullableDecl C16127d dVar, C16127d dVar2) {
            if (this.f36212a == dVar) {
                this.f36212a = dVar2;
                return;
            }
            throw new ConcurrentModificationException();
        }
    }

    public TreeMultiset(C16128e<C16127d<E>> eVar, GeneralRange<E> generalRange, C16127d<E> dVar) {
        super(generalRange.comparator());
        this.f36193e = eVar;
        this.f36194f = generalRange;
        this.f36195g = dVar;
    }

    public static C16127d access$1200(TreeMultiset treeMultiset) {
        C16127d<E> dVar;
        if (((C16127d) treeMultiset.f36193e.f36212a) == null) {
            return null;
        }
        if (treeMultiset.f36194f.hasLowerBound()) {
            E lowerEndpoint = treeMultiset.f36194f.getLowerEndpoint();
            dVar = ((C16127d) treeMultiset.f36193e.f36212a).mo57523d(lowerEndpoint, treeMultiset.comparator());
            if (dVar == null) {
                return null;
            }
            if (treeMultiset.f36194f.getLowerBoundType() == BoundType.OPEN && treeMultiset.comparator().compare(lowerEndpoint, dVar.f36203a) == 0) {
                dVar = dVar.f36211i;
            }
        } else {
            dVar = treeMultiset.f36195g.f36211i;
        }
        if (dVar == treeMultiset.f36195g || !treeMultiset.f36194f.contains(dVar.f36203a)) {
            return null;
        }
        return dVar;
    }

    public static C16178h1.C16179a access$1400(TreeMultiset treeMultiset, C16127d dVar) {
        treeMultiset.getClass();
        return new C16166e2(treeMultiset, dVar);
    }

    public static C16127d access$1600(TreeMultiset treeMultiset) {
        C16127d<E> dVar;
        if (((C16127d) treeMultiset.f36193e.f36212a) == null) {
            return null;
        }
        if (treeMultiset.f36194f.hasUpperBound()) {
            E upperEndpoint = treeMultiset.f36194f.getUpperEndpoint();
            dVar = ((C16127d) treeMultiset.f36193e.f36212a).mo57526g(upperEndpoint, treeMultiset.comparator());
            if (dVar == null) {
                return null;
            }
            if (treeMultiset.f36194f.getUpperBoundType() == BoundType.OPEN && treeMultiset.comparator().compare(upperEndpoint, dVar.f36203a) == 0) {
                dVar = dVar.f36210h;
            }
        } else {
            dVar = treeMultiset.f36195g.f36210h;
        }
        if (dVar == treeMultiset.f36195g || !treeMultiset.f36194f.contains(dVar.f36203a)) {
            return null;
        }
        return dVar;
    }

    public static void access$1700(C16127d dVar, C16127d dVar2, C16127d dVar3) {
        dVar.f36211i = dVar2;
        dVar2.f36210h = dVar;
        dVar2.f36211i = dVar3;
        dVar3.f36210h = dVar2;
    }

    public static void access$1800(C16127d dVar, C16127d dVar2) {
        dVar.f36211i = dVar2;
        dVar2.f36210h = dVar;
    }

    public static <E extends Comparable> TreeMultiset<E> create() {
        return new TreeMultiset<>(Ordering.natural());
    }

    private void readObject(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        objectInputStream.defaultReadObject();
        Comparator comparator = (Comparator) objectInputStream.readObject();
        C16213q1.m26244a(C16175h.class, "comparator").mo57719a(this, comparator);
        C16213q1.m26244a(TreeMultiset.class, "range").mo57719a(this, GeneralRange.all(comparator));
        C16213q1.m26244a(TreeMultiset.class, "rootReference").mo57719a(this, new C16128e());
        C16127d<E> dVar = new C16127d<>(null, 1);
        C16213q1.m26244a(TreeMultiset.class, ResponseConstants.HEADER).mo57719a(this, dVar);
        dVar.f36211i = dVar;
        dVar.f36210h = dVar;
        C16213q1.m26247d(this, objectInputStream, objectInputStream.readInt());
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeObject(elementSet().comparator());
        C16213q1.m26250g(this, objectOutputStream);
    }

    /* renamed from: a */
    public final long mo57508a(Aggregate aggregate, @NullableDecl C16127d<E> dVar) {
        if (dVar == null) {
            return 0;
        }
        int compare = comparator().compare(this.f36194f.getUpperEndpoint(), dVar.f36203a);
        if (compare > 0) {
            return mo57508a(aggregate, dVar.f36209g);
        }
        if (compare == 0) {
            int i = C16126c.f36202a[this.f36194f.getUpperBoundType().ordinal()];
            if (i == 1) {
                return ((long) aggregate.nodeAggregate(dVar)) + aggregate.treeAggregate(dVar.f36209g);
            }
            if (i == 2) {
                return aggregate.treeAggregate(dVar.f36209g);
            }
            throw new AssertionError();
        }
        return mo57508a(aggregate, dVar.f36208f) + aggregate.treeAggregate(dVar.f36209g) + ((long) aggregate.nodeAggregate(dVar));
    }

    @CanIgnoreReturnValue
    public int add(@NullableDecl E e, int i) {
        C16203o.m26215b(i, "occurrences");
        if (i == 0) {
            return count(e);
        }
        C15794l.m25613g(this.f36194f.contains(e));
        C16127d dVar = (C16127d) this.f36193e.f36212a;
        if (dVar == null) {
            comparator().compare(e, e);
            C16127d<E> dVar2 = new C16127d<>(e, i);
            C16127d<E> dVar3 = this.f36195g;
            dVar3.f36211i = dVar2;
            dVar2.f36210h = dVar3;
            dVar2.f36211i = dVar3;
            dVar3.f36210h = dVar2;
            this.f36193e.mo57538a(dVar, dVar2);
            return 0;
        }
        int[] iArr = new int[1];
        this.f36193e.mo57538a(dVar, dVar.mo57520a(comparator(), e, i, iArr));
        return iArr[0];
    }

    /* renamed from: c */
    public final long mo57509c(Aggregate aggregate, @NullableDecl C16127d<E> dVar) {
        if (dVar == null) {
            return 0;
        }
        int compare = comparator().compare(this.f36194f.getLowerEndpoint(), dVar.f36203a);
        if (compare < 0) {
            return mo57509c(aggregate, dVar.f36208f);
        }
        if (compare == 0) {
            int i = C16126c.f36202a[this.f36194f.getLowerBoundType().ordinal()];
            if (i == 1) {
                return ((long) aggregate.nodeAggregate(dVar)) + aggregate.treeAggregate(dVar.f36208f);
            }
            if (i == 2) {
                return aggregate.treeAggregate(dVar.f36208f);
            }
            throw new AssertionError();
        }
        return mo57509c(aggregate, dVar.f36209g) + aggregate.treeAggregate(dVar.f36208f) + ((long) aggregate.nodeAggregate(dVar));
    }

    public void clear() {
        if (this.f36194f.hasLowerBound() || this.f36194f.hasUpperBound()) {
            Iterators.m25979b(entryIterator());
            return;
        }
        C16127d<E> dVar = this.f36195g.f36211i;
        while (true) {
            C16127d<E> dVar2 = this.f36195g;
            if (dVar != dVar2) {
                C16127d<E> dVar3 = dVar.f36211i;
                dVar.f36204b = 0;
                dVar.f36208f = null;
                dVar.f36209g = null;
                dVar.f36210h = null;
                dVar.f36211i = null;
                dVar = dVar3;
            } else {
                dVar2.f36211i = dVar2;
                dVar2.f36210h = dVar2;
                this.f36193e.f36212a = null;
                return;
            }
        }
    }

    public /* bridge */ /* synthetic */ Comparator comparator() {
        return super.comparator();
    }

    public /* bridge */ /* synthetic */ boolean contains(@NullableDecl Object obj) {
        return super.contains(obj);
    }

    public int count(@NullableDecl Object obj) {
        try {
            C16127d dVar = (C16127d) this.f36193e.f36212a;
            if (this.f36194f.contains(obj)) {
                if (dVar != null) {
                    return dVar.mo57524e(obj, comparator());
                }
            }
        } catch (ClassCastException | NullPointerException unused) {
        }
        return 0;
    }

    public Iterator<C16178h1.C16179a<E>> descendingEntryIterator() {
        return new C16125b();
    }

    public /* bridge */ /* synthetic */ C16231v1 descendingMultiset() {
        return super.descendingMultiset();
    }

    public int distinctElements() {
        return Ints.m26384b(mo57511e(Aggregate.DISTINCT));
    }

    /* renamed from: e */
    public final long mo57511e(Aggregate aggregate) {
        C16127d dVar = (C16127d) this.f36193e.f36212a;
        long treeAggregate = aggregate.treeAggregate(dVar);
        if (this.f36194f.hasLowerBound()) {
            treeAggregate -= mo57509c(aggregate, dVar);
        }
        return this.f36194f.hasUpperBound() ? treeAggregate - mo57508a(aggregate, dVar) : treeAggregate;
    }

    public Iterator<E> elementIterator() {
        return new C16185i1(entryIterator());
    }

    public /* bridge */ /* synthetic */ NavigableSet elementSet() {
        return super.elementSet();
    }

    public Iterator<C16178h1.C16179a<E>> entryIterator() {
        return new C16124a();
    }

    public /* bridge */ /* synthetic */ Set entrySet() {
        return super.entrySet();
    }

    public /* bridge */ /* synthetic */ C16178h1.C16179a firstEntry() {
        return super.firstEntry();
    }

    public C16231v1<E> headMultiset(@NullableDecl E e, BoundType boundType) {
        return new TreeMultiset(this.f36193e, this.f36194f.intersect(GeneralRange.upTo(comparator(), e, boundType)), this.f36195g);
    }

    public /* bridge */ /* synthetic */ boolean isEmpty() {
        return super.isEmpty();
    }

    public Iterator<E> iterator() {
        return Multisets.m26081d(this);
    }

    public /* bridge */ /* synthetic */ C16178h1.C16179a lastEntry() {
        return super.lastEntry();
    }

    public /* bridge */ /* synthetic */ C16178h1.C16179a pollFirstEntry() {
        return super.pollFirstEntry();
    }

    public /* bridge */ /* synthetic */ C16178h1.C16179a pollLastEntry() {
        return super.pollLastEntry();
    }

    @CanIgnoreReturnValue
    public int remove(@NullableDecl Object obj, int i) {
        C16203o.m26215b(i, "occurrences");
        if (i == 0) {
            return count(obj);
        }
        C16127d dVar = (C16127d) this.f36193e.f36212a;
        int[] iArr = new int[1];
        try {
            if (this.f36194f.contains(obj)) {
                if (dVar != null) {
                    this.f36193e.mo57538a(dVar, dVar.mo57530k(comparator(), obj, i, iArr));
                    return iArr[0];
                }
            }
        } catch (ClassCastException | NullPointerException unused) {
        }
        return 0;
    }

    @CanIgnoreReturnValue
    public int setCount(@NullableDecl E e, int i) {
        C16203o.m26215b(i, ResponseConstants.COUNT);
        boolean z = true;
        if (!this.f36194f.contains(e)) {
            if (i != 0) {
                z = false;
            }
            C15794l.m25613g(z);
            return 0;
        }
        C16127d dVar = (C16127d) this.f36193e.f36212a;
        if (dVar == null) {
            if (i > 0) {
                add(e, i);
            }
            return 0;
        }
        int[] iArr = new int[1];
        this.f36193e.mo57538a(dVar, dVar.mo57536q(comparator(), e, i, iArr));
        return iArr[0];
    }

    public int size() {
        return Ints.m26384b(mo57511e(Aggregate.SIZE));
    }

    public /* bridge */ /* synthetic */ C16231v1 subMultiset(@NullableDecl Object obj, BoundType boundType, @NullableDecl Object obj2, BoundType boundType2) {
        return super.subMultiset(obj, boundType, obj2, boundType2);
    }

    public C16231v1<E> tailMultiset(@NullableDecl E e, BoundType boundType) {
        return new TreeMultiset(this.f36193e, this.f36194f.intersect(GeneralRange.downTo(comparator(), e, boundType)), this.f36195g);
    }

    public static <E> TreeMultiset<E> create(@NullableDecl Comparator<? super E> comparator) {
        return comparator == null ? new TreeMultiset<>(Ordering.natural()) : new TreeMultiset<>(comparator);
    }

    public static int distinctElements(@NullableDecl C16127d<?> dVar) {
        if (dVar == null) {
            return 0;
        }
        return dVar.f36205c;
    }

    public static <E extends Comparable> TreeMultiset<E> create(Iterable<? extends E> iterable) {
        TreeMultiset<E> create = create();
        C16201n0.m26210a(iterable, create);
        return create;
    }

    public TreeMultiset(Comparator<? super E> comparator) {
        super(comparator);
        this.f36194f = GeneralRange.all(comparator);
        C16127d<E> dVar = new C16127d<>(null, 1);
        this.f36195g = dVar;
        dVar.f36211i = dVar;
        dVar.f36210h = dVar;
        this.f36193e = new C16128e<>();
    }

    @CanIgnoreReturnValue
    public boolean setCount(@NullableDecl E e, int i, int i2) {
        C16203o.m26215b(i2, "newCount");
        C16203o.m26215b(i, "oldCount");
        C15794l.m25613g(this.f36194f.contains(e));
        C16127d dVar = (C16127d) this.f36193e.f36212a;
        if (dVar != null) {
            int[] iArr = new int[1];
            this.f36193e.mo57538a(dVar, dVar.mo57535p(comparator(), e, i, i2, iArr));
            if (iArr[0] == i) {
                return true;
            }
            return false;
        } else if (i != 0) {
            return false;
        } else {
            if (i2 > 0) {
                add(e, i2);
            }
            return true;
        }
    }
}
