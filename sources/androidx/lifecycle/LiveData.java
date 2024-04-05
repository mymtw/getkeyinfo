package androidx.lifecycle;

import android.os.Looper;
import androidx.lifecycle.Lifecycle;
import java.util.Iterator;
import java.util.Map;
import p010a9.C0048b;
import p121h.C6900a;
import p133i.C6971b;

public abstract class LiveData<T> {
    public static final Object NOT_SET = new Object();
    public static final int START_VERSION = -1;
    public int mActiveCount;
    private boolean mChangingActiveState;
    private volatile Object mData;
    public final Object mDataLock;
    private boolean mDispatchInvalidated;
    private boolean mDispatchingValue;
    private C6971b<C2843a0<? super T>, LiveData<T>.c> mObservers;
    public volatile Object mPendingData;
    private final Runnable mPostValueRunnable;
    private int mVersion;

    public class LifecycleBoundObserver extends LiveData<T>.c implements C2885q {

        /* renamed from: f */
        public final C2887s f6436f;

        public LifecycleBoundObserver(C2887s sVar, C2843a0<? super T> a0Var) {
            super(a0Var);
            this.f6436f = sVar;
        }

        /* renamed from: b */
        public final void mo10764b() {
            this.f6436f.getLifecycle().mo10735c(this);
        }

        /* renamed from: c */
        public final boolean mo10765c(C2887s sVar) {
            return this.f6436f == sVar;
        }

        /* renamed from: d */
        public final boolean mo10766d() {
            return this.f6436f.getLifecycle().mo10734b().isAtLeast(Lifecycle.State.STARTED);
        }

        public final void onStateChanged(C2887s sVar, Lifecycle.Event event) {
            Lifecycle.State b = this.f6436f.getLifecycle().mo10734b();
            if (b == Lifecycle.State.DESTROYED) {
                LiveData.this.removeObserver(this.f6439b);
                return;
            }
            Lifecycle.State state = null;
            while (state != b) {
                mo10768a(mo10766d());
                state = b;
                b = this.f6436f.getLifecycle().mo10734b();
            }
        }
    }

    /* renamed from: androidx.lifecycle.LiveData$a */
    public class C2831a implements Runnable {
        public C2831a() {
        }

        public final void run() {
            Object obj;
            synchronized (LiveData.this.mDataLock) {
                obj = LiveData.this.mPendingData;
                LiveData.this.mPendingData = LiveData.NOT_SET;
            }
            LiveData.this.setValue(obj);
        }
    }

    /* renamed from: androidx.lifecycle.LiveData$b */
    public class C2832b extends LiveData<T>.c {
        public C2832b(LiveData liveData, C2843a0<? super T> a0Var) {
            super(a0Var);
        }

        /* renamed from: d */
        public final boolean mo10766d() {
            return true;
        }
    }

    /* renamed from: androidx.lifecycle.LiveData$c */
    public abstract class C2833c {

        /* renamed from: b */
        public final C2843a0<? super T> f6439b;

        /* renamed from: c */
        public boolean f6440c;

        /* renamed from: d */
        public int f6441d = -1;

        public C2833c(C2843a0<? super T> a0Var) {
            this.f6439b = a0Var;
        }

        /* renamed from: a */
        public final void mo10768a(boolean z) {
            if (z != this.f6440c) {
                this.f6440c = z;
                LiveData.this.changeActiveCounter(z ? 1 : -1);
                if (this.f6440c) {
                    LiveData.this.dispatchingValue(this);
                }
            }
        }

        /* renamed from: b */
        public void mo10764b() {
        }

        /* renamed from: c */
        public boolean mo10765c(C2887s sVar) {
            return false;
        }

        /* renamed from: d */
        public abstract boolean mo10766d();
    }

    public LiveData(T t) {
        this.mDataLock = new Object();
        this.mObservers = new C6971b<>();
        this.mActiveCount = 0;
        this.mPendingData = NOT_SET;
        this.mPostValueRunnable = new C2831a();
        this.mData = t;
        this.mVersion = 0;
    }

    public static void assertMainThread(String str) {
        C6900a.m13347u0().f15278c.getClass();
        if (!(Looper.getMainLooper().getThread() == Thread.currentThread())) {
            throw new IllegalStateException(C0048b.m163a("Cannot invoke ", str, " on a background thread"));
        }
    }

    private void considerNotify(LiveData<T>.c cVar) {
        if (cVar.f6440c) {
            if (!cVar.mo10766d()) {
                cVar.mo10768a(false);
                return;
            }
            int i = cVar.f6441d;
            int i2 = this.mVersion;
            if (i < i2) {
                cVar.f6441d = i2;
                cVar.f6439b.onChanged(this.mData);
            }
        }
    }

    public void changeActiveCounter(int i) {
        int i2 = this.mActiveCount;
        this.mActiveCount = i + i2;
        if (!this.mChangingActiveState) {
            this.mChangingActiveState = true;
            while (true) {
                try {
                    int i3 = this.mActiveCount;
                    if (i2 != i3) {
                        boolean z = i2 == 0 && i3 > 0;
                        boolean z2 = i2 > 0 && i3 == 0;
                        if (z) {
                            onActive();
                        } else if (z2) {
                            onInactive();
                        }
                        i2 = i3;
                    } else {
                        return;
                    }
                } finally {
                    this.mChangingActiveState = false;
                }
            }
        }
    }

    public void dispatchingValue(LiveData<T>.c cVar) {
        if (this.mDispatchingValue) {
            this.mDispatchInvalidated = true;
            return;
        }
        this.mDispatchingValue = true;
        do {
            this.mDispatchInvalidated = false;
            if (cVar == null) {
                C6971b<C2843a0<? super T>, LiveData<T>.c> bVar = this.mObservers;
                bVar.getClass();
                C6971b.C6975d dVar = new C6971b.C6975d();
                bVar.f15454d.put(dVar, Boolean.FALSE);
                while (dVar.hasNext()) {
                    considerNotify((C2833c) ((Map.Entry) dVar.next()).getValue());
                    if (this.mDispatchInvalidated) {
                        break;
                    }
                }
            } else {
                considerNotify(cVar);
                cVar = null;
            }
        } while (this.mDispatchInvalidated);
        this.mDispatchingValue = false;
    }

    public T getValue() {
        T t = this.mData;
        if (t != NOT_SET) {
            return t;
        }
        return null;
    }

    public int getVersion() {
        return this.mVersion;
    }

    public boolean hasActiveObservers() {
        return this.mActiveCount > 0;
    }

    public boolean hasObservers() {
        return this.mObservers.f15455e > 0;
    }

    public void observe(C2887s sVar, C2843a0<? super T> a0Var) {
        assertMainThread("observe");
        if (sVar.getLifecycle().mo10734b() != Lifecycle.State.DESTROYED) {
            LifecycleBoundObserver lifecycleBoundObserver = new LifecycleBoundObserver(sVar, a0Var);
            C2833c c = this.mObservers.mo19126c(a0Var, lifecycleBoundObserver);
            if (c != null && !c.mo10765c(sVar)) {
                throw new IllegalArgumentException("Cannot add the same observer with different lifecycles");
            } else if (c == null) {
                sVar.getLifecycle().mo10733a(lifecycleBoundObserver);
            }
        }
    }

    public void observeForever(C2843a0<? super T> a0Var) {
        assertMainThread("observeForever");
        C2832b bVar = new C2832b(this, a0Var);
        C2833c c = this.mObservers.mo19126c(a0Var, bVar);
        if (c instanceof LifecycleBoundObserver) {
            throw new IllegalArgumentException("Cannot add the same observer with different lifecycles");
        } else if (c == null) {
            bVar.mo10768a(true);
        }
    }

    public void onActive() {
    }

    public void onInactive() {
    }

    public void postValue(T t) {
        boolean z;
        synchronized (this.mDataLock) {
            z = this.mPendingData == NOT_SET;
            this.mPendingData = t;
        }
        if (z) {
            C6900a.m13347u0().mo19013v0(this.mPostValueRunnable);
        }
    }

    public void removeObserver(C2843a0<? super T> a0Var) {
        assertMainThread("removeObserver");
        C2833c e = this.mObservers.mo19127e(a0Var);
        if (e != null) {
            e.mo10764b();
            e.mo10768a(false);
        }
    }

    public void removeObservers(C2887s sVar) {
        assertMainThread("removeObservers");
        Iterator<Map.Entry<C2843a0<? super T>, LiveData<T>.c>> it = this.mObservers.iterator();
        while (true) {
            C6971b.C6976e eVar = (C6971b.C6976e) it;
            if (eVar.hasNext()) {
                Map.Entry entry = (Map.Entry) eVar.next();
                if (((C2833c) entry.getValue()).mo10765c(sVar)) {
                    removeObserver((C2843a0) entry.getKey());
                }
            } else {
                return;
            }
        }
    }

    public void setValue(T t) {
        assertMainThread("setValue");
        this.mVersion++;
        this.mData = t;
        dispatchingValue((LiveData<T>.c) null);
    }

    public LiveData() {
        this.mDataLock = new Object();
        this.mObservers = new C6971b<>();
        this.mActiveCount = 0;
        Object obj = NOT_SET;
        this.mPendingData = obj;
        this.mPostValueRunnable = new C2831a();
        this.mData = obj;
        this.mVersion = -1;
    }
}
