package androidx.databinding;

import android.annotation.TargetApi;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.support.p013v4.media.C0072d;
import android.util.Log;
import android.util.LongSparseArray;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.util.SparseIntArray;
import android.util.SparseLongArray;
import android.view.Choreographer;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.databinding.C2442c;
import androidx.databinding.C2451i;
import androidx.databinding.C2453j;
import androidx.databinding.C2455k;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.C2843a0;
import androidx.lifecycle.C2845b0;
import androidx.lifecycle.C2886r;
import androidx.lifecycle.C2887s;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LiveData;
import com.etsy.android.R;
import com.google.android.material.shadow.ShadowDrawableWrapper;
import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
import java.util.List;
import java.util.Map;
import p193o.C7498f;

public abstract class ViewDataBinding extends C2439a {
    private static final int BINDING_NUMBER_START = 8;
    public static final String BINDING_TAG_PREFIX = "binding_";
    private static final C2444d CREATE_LIST_LISTENER = new C2425b();
    private static final C2444d CREATE_LIVE_DATA_LISTENER = new C2427d();
    private static final C2444d CREATE_MAP_LISTENER = new C2426c();
    private static final C2444d CREATE_PROPERTY_LISTENER = new C2424a();
    private static final int HALTED = 2;
    private static final int REBIND = 1;
    private static final C2442c.C2443a<C2460m, ViewDataBinding, Void> REBIND_NOTIFIER = new C2428e();
    private static final int REBOUND = 3;
    /* access modifiers changed from: private */
    public static final View.OnAttachStateChangeListener ROOT_REATTACHED_LISTENER = new C2429f();
    public static int SDK_INT = Build.VERSION.SDK_INT;
    private static final boolean USE_CHOREOGRAPHER = true;
    private static final ReferenceQueue<ViewDataBinding> sReferenceQueue = new ReferenceQueue<>();
    public final DataBindingComponent mBindingComponent;
    private Choreographer mChoreographer;
    private ViewDataBinding mContainingBinding;
    private final Choreographer.FrameCallback mFrameCallback;
    private boolean mInLiveDataRegisterObserver;
    public boolean mInStateFlowRegisterObserver;
    private boolean mIsExecutingPendingBindings;
    private C2887s mLifecycleOwner;
    private C2464p[] mLocalFieldObservers;
    private OnStartListener mOnStartListener;
    /* access modifiers changed from: private */
    public boolean mPendingRebind;
    private C2442c<C2460m, ViewDataBinding, Void> mRebindCallbacks;
    /* access modifiers changed from: private */
    public boolean mRebindHalted;
    /* access modifiers changed from: private */
    public final Runnable mRebindRunnable;
    /* access modifiers changed from: private */
    public final View mRoot;
    private Handler mUIThreadHandler;

    public static class OnStartListener implements C2886r {

        /* renamed from: b */
        public final WeakReference<ViewDataBinding> f5696b;

        public OnStartListener(ViewDataBinding viewDataBinding) {
            this.f5696b = new WeakReference<>(viewDataBinding);
        }

        @C2845b0(Lifecycle.Event.ON_START)
        public void onStart() {
            ViewDataBinding viewDataBinding = this.f5696b.get();
            if (viewDataBinding != null) {
                viewDataBinding.executePendingBindings();
            }
        }
    }

    /* renamed from: androidx.databinding.ViewDataBinding$a */
    public class C2424a implements C2444d {
        /* renamed from: a */
        public final C2464p mo9260a(ViewDataBinding viewDataBinding, int i, ReferenceQueue<ViewDataBinding> referenceQueue) {
            return new C2437n(viewDataBinding, i, referenceQueue).f5703b;
        }
    }

    /* renamed from: androidx.databinding.ViewDataBinding$b */
    public class C2425b implements C2444d {
        /* renamed from: a */
        public final C2464p mo9260a(ViewDataBinding viewDataBinding, int i, ReferenceQueue<ViewDataBinding> referenceQueue) {
            return new C2435l(viewDataBinding, i, referenceQueue).f5701b;
        }
    }

    /* renamed from: androidx.databinding.ViewDataBinding$c */
    public class C2426c implements C2444d {
        /* renamed from: a */
        public final C2464p mo9260a(ViewDataBinding viewDataBinding, int i, ReferenceQueue<ViewDataBinding> referenceQueue) {
            return new C2436m(viewDataBinding, i, referenceQueue).f5702b;
        }
    }

    /* renamed from: androidx.databinding.ViewDataBinding$d */
    public class C2427d implements C2444d {
        /* renamed from: a */
        public final C2464p mo9260a(ViewDataBinding viewDataBinding, int i, ReferenceQueue<ViewDataBinding> referenceQueue) {
            return new C2433j(viewDataBinding, i, referenceQueue).f5699b;
        }
    }

    /* renamed from: androidx.databinding.ViewDataBinding$e */
    public class C2428e extends C2442c.C2443a<C2460m, ViewDataBinding, Void> {
        /* renamed from: a */
        public final void mo9261a(Object obj, int i, Object obj2, Object obj3) {
            C2460m mVar = (C2460m) obj;
            ViewDataBinding viewDataBinding = (ViewDataBinding) obj2;
            Void voidR = (Void) obj3;
            if (i == 1) {
                mVar.getClass();
            } else if (i == 2) {
                mVar.getClass();
            } else if (i == 3) {
                mVar.getClass();
            }
        }
    }

    /* renamed from: androidx.databinding.ViewDataBinding$f */
    public class C2429f implements View.OnAttachStateChangeListener {
        @TargetApi(19)
        public final void onViewAttachedToWindow(View view) {
            ViewDataBinding.getBinding(view).mRebindRunnable.run();
            view.removeOnAttachStateChangeListener(this);
        }

        public final void onViewDetachedFromWindow(View view) {
        }
    }

    /* renamed from: androidx.databinding.ViewDataBinding$g */
    public class C2430g implements Runnable {
        public C2430g() {
        }

        public final void run() {
            synchronized (this) {
                boolean unused = ViewDataBinding.this.mPendingRebind = false;
            }
            ViewDataBinding.processReferenceQueue();
            if (!ViewDataBinding.this.mRoot.isAttachedToWindow()) {
                ViewDataBinding.this.mRoot.removeOnAttachStateChangeListener(ViewDataBinding.ROOT_REATTACHED_LISTENER);
                ViewDataBinding.this.mRoot.addOnAttachStateChangeListener(ViewDataBinding.ROOT_REATTACHED_LISTENER);
                return;
            }
            ViewDataBinding.this.executePendingBindings();
        }
    }

    /* renamed from: androidx.databinding.ViewDataBinding$h */
    public class C2431h implements Choreographer.FrameCallback {
        public C2431h() {
        }

        public final void doFrame(long j) {
            ViewDataBinding.this.mRebindRunnable.run();
        }
    }

    /* renamed from: androidx.databinding.ViewDataBinding$i */
    public static class C2432i {
    }

    /* renamed from: androidx.databinding.ViewDataBinding$j */
    public static class C2433j implements C2843a0, C2457l<LiveData<?>> {

        /* renamed from: b */
        public final C2464p<LiveData<?>> f5699b;

        /* renamed from: c */
        public WeakReference<C2887s> f5700c = null;

        public C2433j(ViewDataBinding viewDataBinding, int i, ReferenceQueue<ViewDataBinding> referenceQueue) {
            this.f5699b = new C2464p<>(viewDataBinding, i, this, referenceQueue);
        }

        /* renamed from: b */
        public final void mo9266b(C2887s sVar) {
            WeakReference<C2887s> weakReference = this.f5700c;
            C2887s sVar2 = weakReference == null ? null : weakReference.get();
            LiveData liveData = (LiveData) this.f5699b.f5721c;
            if (liveData != null) {
                if (sVar2 != null) {
                    liveData.removeObserver(this);
                }
                if (sVar != null) {
                    liveData.observe(sVar, this);
                }
            }
            if (sVar != null) {
                this.f5700c = new WeakReference<>(sVar);
            }
        }

        /* renamed from: c */
        public final void mo9267c(Object obj) {
            ((LiveData) obj).removeObserver(this);
        }

        /* renamed from: d */
        public final void mo9268d(Object obj) {
            LiveData liveData = (LiveData) obj;
            WeakReference<C2887s> weakReference = this.f5700c;
            C2887s sVar = weakReference == null ? null : weakReference.get();
            if (sVar != null) {
                liveData.observe(sVar, this);
            }
        }

        public final void onChanged(Object obj) {
            C2464p<LiveData<?>> pVar = this.f5699b;
            ViewDataBinding viewDataBinding = (ViewDataBinding) pVar.get();
            if (viewDataBinding == null) {
                pVar.mo9295a();
            }
            if (viewDataBinding != null) {
                C2464p<LiveData<?>> pVar2 = this.f5699b;
                viewDataBinding.handleFieldChange(pVar2.f5720b, pVar2.f5721c, 0);
            }
        }
    }

    /* renamed from: androidx.databinding.ViewDataBinding$k */
    public static abstract class C2434k extends C2451i.C2452a implements C2447g {
        /* renamed from: e */
        public final void mo9270e(int i, C2451i iVar) {
            if (i == 0 || i == 0) {
                mo9291a();
            }
        }
    }

    /* renamed from: androidx.databinding.ViewDataBinding$l */
    public static class C2435l extends C2453j.C2454a implements C2457l<C2453j> {

        /* renamed from: b */
        public final C2464p<C2453j> f5701b;

        public C2435l(ViewDataBinding viewDataBinding, int i, ReferenceQueue<ViewDataBinding> referenceQueue) {
            this.f5701b = new C2464p<>(viewDataBinding, i, this, referenceQueue);
        }

        /* renamed from: a */
        public final void mo9271a(C2453j jVar) {
            C2464p<C2453j> pVar = this.f5701b;
            ViewDataBinding viewDataBinding = (ViewDataBinding) pVar.get();
            if (viewDataBinding == null) {
                pVar.mo9295a();
            }
            if (viewDataBinding != null) {
                C2464p<C2453j> pVar2 = this.f5701b;
                C2453j jVar2 = (C2453j) pVar2.f5721c;
                if (jVar2 == jVar) {
                    viewDataBinding.handleFieldChange(pVar2.f5720b, jVar2, 0);
                }
            }
        }

        /* renamed from: b */
        public final void mo9266b(C2887s sVar) {
        }

        /* renamed from: c */
        public final void mo9267c(Object obj) {
            ((C2453j) obj).removeOnListChangedCallback(this);
        }

        /* renamed from: d */
        public final void mo9268d(Object obj) {
            ((C2453j) obj).addOnListChangedCallback(this);
        }

        /* renamed from: e */
        public final void mo9272e(C2453j jVar) {
            mo9271a(jVar);
        }

        /* renamed from: f */
        public final void mo9273f(C2453j jVar) {
            mo9271a(jVar);
        }

        /* renamed from: g */
        public final void mo9274g(C2453j jVar) {
            mo9271a(jVar);
        }

        /* renamed from: h */
        public final void mo9275h(C2453j jVar) {
            mo9271a(jVar);
        }
    }

    /* renamed from: androidx.databinding.ViewDataBinding$m */
    public static class C2436m extends C2455k.C2456a implements C2457l<C2455k> {

        /* renamed from: b */
        public final C2464p<C2455k> f5702b;

        public C2436m(ViewDataBinding viewDataBinding, int i, ReferenceQueue<ViewDataBinding> referenceQueue) {
            this.f5702b = new C2464p<>(viewDataBinding, i, this, referenceQueue);
        }

        /* renamed from: b */
        public final void mo9266b(C2887s sVar) {
        }

        /* renamed from: c */
        public final void mo9267c(Object obj) {
            ((C2455k) obj).mo9293l();
        }

        /* renamed from: d */
        public final void mo9268d(Object obj) {
            ((C2455k) obj).mo9294m();
        }
    }

    /* renamed from: androidx.databinding.ViewDataBinding$n */
    public static class C2437n extends C2451i.C2452a implements C2457l<C2451i> {

        /* renamed from: b */
        public final C2464p<C2451i> f5703b;

        public C2437n(ViewDataBinding viewDataBinding, int i, ReferenceQueue<ViewDataBinding> referenceQueue) {
            this.f5703b = new C2464p<>(viewDataBinding, i, this, referenceQueue);
        }

        /* renamed from: b */
        public final void mo9266b(C2887s sVar) {
        }

        /* renamed from: c */
        public final void mo9267c(Object obj) {
            ((C2451i) obj).removeOnPropertyChangedCallback(this);
        }

        /* renamed from: d */
        public final void mo9268d(Object obj) {
            ((C2451i) obj).addOnPropertyChangedCallback(this);
        }

        /* renamed from: e */
        public final void mo9270e(int i, C2451i iVar) {
            C2464p<C2451i> pVar = this.f5703b;
            ViewDataBinding viewDataBinding = (ViewDataBinding) pVar.get();
            if (viewDataBinding == null) {
                pVar.mo9295a();
            }
            if (viewDataBinding != null) {
                C2464p<C2451i> pVar2 = this.f5703b;
                if (((C2451i) pVar2.f5721c) == iVar) {
                    viewDataBinding.handleFieldChange(pVar2.f5720b, iVar, i);
                }
            }
        }
    }

    public ViewDataBinding(DataBindingComponent dataBindingComponent, View view, int i) {
        this.mRebindRunnable = new C2430g();
        this.mPendingRebind = false;
        this.mRebindHalted = false;
        this.mBindingComponent = dataBindingComponent;
        this.mLocalFieldObservers = new C2464p[i];
        this.mRoot = view;
        if (Looper.myLooper() == null) {
            throw new IllegalStateException("DataBinding must be created in view's UI Thread");
        } else if (USE_CHOREOGRAPHER) {
            this.mChoreographer = Choreographer.getInstance();
            this.mFrameCallback = new C2431h();
        } else {
            this.mFrameCallback = null;
            this.mUIThreadHandler = new Handler(Looper.myLooper());
        }
    }

    public static ViewDataBinding bind(Object obj, View view, int i) {
        return C2446f.f5711a.getDataBinder(checkAndCastToBindingComponent(obj), view, i);
    }

    private static DataBindingComponent checkAndCastToBindingComponent(Object obj) {
        if (obj == null) {
            return null;
        }
        if (obj instanceof DataBindingComponent) {
            return (DataBindingComponent) obj;
        }
        throw new IllegalArgumentException("The provided bindingComponent parameter must be an instance of DataBindingComponent. See  https://issuetracker.google.com/issues/116541301 for details of why this parameter is not defined as DataBindingComponent");
    }

    private void executeBindingsInternal() {
        if (this.mIsExecutingPendingBindings) {
            requestRebind();
        } else if (hasPendingBindings()) {
            this.mIsExecutingPendingBindings = true;
            this.mRebindHalted = false;
            C2442c<C2460m, ViewDataBinding, Void> cVar = this.mRebindCallbacks;
            if (cVar != null) {
                cVar.mo9284c(1, this, (Object) null);
                if (this.mRebindHalted) {
                    this.mRebindCallbacks.mo9284c(2, this, (Object) null);
                }
            }
            if (!this.mRebindHalted) {
                executeBindings();
                C2442c<C2460m, ViewDataBinding, Void> cVar2 = this.mRebindCallbacks;
                if (cVar2 != null) {
                    cVar2.mo9284c(3, this, (Object) null);
                }
            }
            this.mIsExecutingPendingBindings = false;
        }
    }

    public static void executeBindingsOn(ViewDataBinding viewDataBinding) {
        viewDataBinding.executeBindingsInternal();
    }

    private static int findIncludeIndex(String str, int i, C2432i iVar, int i2) {
        str.subSequence(str.indexOf(47) + 1, str.length() - 2);
        throw null;
    }

    private static int findLastMatching(ViewGroup viewGroup, int i) {
        String str = (String) viewGroup.getChildAt(i).getTag();
        String substring = str.substring(0, str.length() - 1);
        int length = substring.length();
        int childCount = viewGroup.getChildCount();
        for (int i2 = i + 1; i2 < childCount; i2++) {
            View childAt = viewGroup.getChildAt(i2);
            String str2 = childAt.getTag() instanceof String ? (String) childAt.getTag() : null;
            if (str2 != null && str2.startsWith(substring)) {
                if (str2.length() == str.length() && str2.charAt(str2.length() - 1) == '0') {
                    return i;
                }
                if (isNumeric(str2, length)) {
                    i = i2;
                }
            }
        }
        return i;
    }

    public static ViewDataBinding getBinding(View view) {
        if (view != null) {
            return (ViewDataBinding) view.getTag(R.id.dataBinding);
        }
        return null;
    }

    public static int getBuildSdkInt() {
        return SDK_INT;
    }

    public static int getColorFromResource(View view, int i) {
        return view.getContext().getColor(i);
    }

    public static ColorStateList getColorStateListFromResource(View view, int i) {
        return view.getContext().getColorStateList(i);
    }

    public static Drawable getDrawableFromResource(View view, int i) {
        return view.getContext().getDrawable(i);
    }

    public static <K, T> T getFrom(Map<K, T> map, K k) {
        if (map == null) {
            return null;
        }
        return map.get(k);
    }

    public static <T> T getFromArray(T[] tArr, int i) {
        if (tArr == null || i < 0 || i >= tArr.length) {
            return null;
        }
        return tArr[i];
    }

    public static <T> T getFromList(C7498f<T> fVar, int i) {
        if (fVar == null || i < 0) {
            return null;
        }
        return fVar.mo19889f((long) i, (Long) null);
    }

    public static <T extends ViewDataBinding> T inflateInternal(LayoutInflater layoutInflater, int i, ViewGroup viewGroup, boolean z, Object obj) {
        DataBindingComponent checkAndCastToBindingComponent = checkAndCastToBindingComponent(obj);
        C2445e eVar = C2446f.f5711a;
        boolean z2 = viewGroup != null && z;
        int childCount = z2 ? viewGroup.getChildCount() : 0;
        View inflate = layoutInflater.inflate(i, viewGroup, z);
        if (!z2) {
            return C2446f.f5711a.getDataBinder(checkAndCastToBindingComponent, inflate, i);
        }
        int childCount2 = viewGroup.getChildCount();
        int i2 = childCount2 - childCount;
        if (i2 == 1) {
            return C2446f.f5711a.getDataBinder(checkAndCastToBindingComponent, viewGroup.getChildAt(childCount2 - 1), i);
        }
        View[] viewArr = new View[i2];
        for (int i3 = 0; i3 < i2; i3++) {
            viewArr[i3] = viewGroup.getChildAt(i3 + childCount);
        }
        return C2446f.f5711a.getDataBinder(checkAndCastToBindingComponent, viewArr, i);
    }

    private static boolean isNumeric(String str, int i) {
        int length = str.length();
        if (length == i) {
            return false;
        }
        while (i < length) {
            if (!Character.isDigit(str.charAt(i))) {
                return false;
            }
            i++;
        }
        return true;
    }

    public static Object[] mapBindings(DataBindingComponent dataBindingComponent, View view, int i, C2432i iVar, SparseIntArray sparseIntArray) {
        Object[] objArr = new Object[i];
        mapBindings(dataBindingComponent, view, objArr, iVar, sparseIntArray, true);
        return objArr;
    }

    public static boolean parse(String str, boolean z) {
        return str == null ? z : Boolean.parseBoolean(str);
    }

    private static int parseTagInt(String str, int i) {
        int length = str.length();
        int i2 = 0;
        while (i < length) {
            i2 = (i2 * 10) + (str.charAt(i) - '0');
            i++;
        }
        return i2;
    }

    /* access modifiers changed from: private */
    public static void processReferenceQueue() {
        while (true) {
            Reference<? extends ViewDataBinding> poll = sReferenceQueue.poll();
            if (poll == null) {
                return;
            }
            if (poll instanceof C2464p) {
                ((C2464p) poll).mo9295a();
            }
        }
    }

    public static int safeUnbox(Integer num) {
        if (num == null) {
            return 0;
        }
        return num.intValue();
    }

    public static void setBindingInverseListener(ViewDataBinding viewDataBinding, C2447g gVar, C2434k kVar) {
        if (gVar != kVar) {
            if (gVar != null) {
                viewDataBinding.removeOnPropertyChangedCallback((C2434k) gVar);
            }
            if (kVar != null) {
                viewDataBinding.addOnPropertyChangedCallback(kVar);
            }
        }
    }

    public static <T> void setTo(T[] tArr, int i, T t) {
        if (tArr != null && i >= 0 && i < tArr.length) {
            tArr[i] = t;
        }
    }

    public void addOnRebindCallback(C2460m mVar) {
        if (this.mRebindCallbacks == null) {
            this.mRebindCallbacks = new C2442c<>(REBIND_NOTIFIER);
        }
        this.mRebindCallbacks.mo9282a(mVar);
    }

    public void ensureBindingComponentIsNotNull(Class<?> cls) {
        if (this.mBindingComponent == null) {
            StringBuilder h = C0072d.m201h("Required DataBindingComponent is null in class ");
            h.append(getClass().getSimpleName());
            h.append(". A BindingAdapter in ");
            h.append(cls.getCanonicalName());
            h.append(" is not static and requires an object to use, retrieved from the DataBindingComponent. If you don't use an inflation method taking a DataBindingComponent, use DataBindingUtil.setDefaultComponent or make all BindingAdapter methods static.");
            throw new IllegalStateException(h.toString());
        }
    }

    public abstract void executeBindings();

    public void executePendingBindings() {
        ViewDataBinding viewDataBinding = this.mContainingBinding;
        if (viewDataBinding == null) {
            executeBindingsInternal();
        } else {
            viewDataBinding.executePendingBindings();
        }
    }

    public void forceExecuteBindings() {
        executeBindings();
    }

    public C2887s getLifecycleOwner() {
        return this.mLifecycleOwner;
    }

    public Object getObservedField(int i) {
        C2464p pVar = this.mLocalFieldObservers[i];
        if (pVar == null) {
            return null;
        }
        return pVar.f5721c;
    }

    public View getRoot() {
        return this.mRoot;
    }

    public void handleFieldChange(int i, Object obj, int i2) {
        if (!this.mInLiveDataRegisterObserver && !this.mInStateFlowRegisterObserver && onFieldChange(i, obj, i2)) {
            requestRebind();
        }
    }

    public abstract boolean hasPendingBindings();

    public abstract void invalidateAll();

    public abstract boolean onFieldChange(int i, Object obj, int i2);

    public void registerTo(int i, Object obj, C2444d dVar) {
        if (obj != null) {
            C2464p pVar = this.mLocalFieldObservers[i];
            if (pVar == null) {
                pVar = dVar.mo9260a(this, i, sReferenceQueue);
                this.mLocalFieldObservers[i] = pVar;
                C2887s sVar = this.mLifecycleOwner;
                if (sVar != null) {
                    pVar.f5719a.mo9266b(sVar);
                }
            }
            pVar.mo9295a();
            pVar.f5721c = obj;
            pVar.f5719a.mo9268d(obj);
        }
    }

    public void removeOnRebindCallback(C2460m mVar) {
        C2442c<C2460m, ViewDataBinding, Void> cVar = this.mRebindCallbacks;
        if (cVar != null) {
            cVar.mo9288h(mVar);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x002a, code lost:
        if (USE_CHOREOGRAPHER == false) goto L_0x0034;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x002c, code lost:
        r2.mChoreographer.postFrameCallback(r2.mFrameCallback);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0034, code lost:
        r2.mUIThreadHandler.post(r2.mRebindRunnable);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:?, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void requestRebind() {
        /*
            r2 = this;
            androidx.databinding.ViewDataBinding r0 = r2.mContainingBinding
            if (r0 == 0) goto L_0x0008
            r0.requestRebind()
            goto L_0x003b
        L_0x0008:
            androidx.lifecycle.s r0 = r2.mLifecycleOwner
            if (r0 == 0) goto L_0x001d
            androidx.lifecycle.Lifecycle r0 = r0.getLifecycle()
            androidx.lifecycle.Lifecycle$State r0 = r0.mo10734b()
            androidx.lifecycle.Lifecycle$State r1 = androidx.lifecycle.Lifecycle.State.STARTED
            boolean r0 = r0.isAtLeast(r1)
            if (r0 != 0) goto L_0x001d
            return
        L_0x001d:
            monitor-enter(r2)
            boolean r0 = r2.mPendingRebind     // Catch:{ all -> 0x003c }
            if (r0 == 0) goto L_0x0024
            monitor-exit(r2)     // Catch:{ all -> 0x003c }
            return
        L_0x0024:
            r0 = 1
            r2.mPendingRebind = r0     // Catch:{ all -> 0x003c }
            monitor-exit(r2)     // Catch:{ all -> 0x003c }
            boolean r0 = USE_CHOREOGRAPHER
            if (r0 == 0) goto L_0x0034
            android.view.Choreographer r0 = r2.mChoreographer
            android.view.Choreographer$FrameCallback r1 = r2.mFrameCallback
            r0.postFrameCallback(r1)
            goto L_0x003b
        L_0x0034:
            android.os.Handler r0 = r2.mUIThreadHandler
            java.lang.Runnable r1 = r2.mRebindRunnable
            r0.post(r1)
        L_0x003b:
            return
        L_0x003c:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x003c }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.databinding.ViewDataBinding.requestRebind():void");
    }

    public void setContainedBinding(ViewDataBinding viewDataBinding) {
        if (viewDataBinding != null) {
            viewDataBinding.mContainingBinding = this;
        }
    }

    public void setLifecycleOwner(C2887s sVar) {
        if (sVar instanceof Fragment) {
            Log.w("DataBinding", "Setting the fragment as the LifecycleOwner might cause memory leaks because views lives shorter than the Fragment. Consider using Fragment's view lifecycle");
        }
        C2887s sVar2 = this.mLifecycleOwner;
        if (sVar2 != sVar) {
            if (sVar2 != null) {
                sVar2.getLifecycle().mo10735c(this.mOnStartListener);
            }
            this.mLifecycleOwner = sVar;
            if (sVar != null) {
                if (this.mOnStartListener == null) {
                    this.mOnStartListener = new OnStartListener(this);
                }
                sVar.getLifecycle().mo10733a(this.mOnStartListener);
            }
            for (C2464p pVar : this.mLocalFieldObservers) {
                if (pVar != null) {
                    pVar.f5719a.mo9266b(sVar);
                }
            }
        }
    }

    public void setRootTag(View view) {
        view.setTag(R.id.dataBinding, this);
    }

    public abstract boolean setVariable(int i, Object obj);

    public void unbind() {
        for (C2464p pVar : this.mLocalFieldObservers) {
            if (pVar != null) {
                pVar.mo9295a();
            }
        }
    }

    public boolean unregisterFrom(int i) {
        C2464p pVar = this.mLocalFieldObservers[i];
        if (pVar != null) {
            return pVar.mo9295a();
        }
        return false;
    }

    public boolean updateLiveDataRegistration(int i, LiveData<?> liveData) {
        this.mInLiveDataRegisterObserver = true;
        try {
            return updateRegistration(i, liveData, CREATE_LIVE_DATA_LISTENER);
        } finally {
            this.mInLiveDataRegisterObserver = false;
        }
    }

    public boolean updateRegistration(int i, Object obj, C2444d dVar) {
        if (obj == null) {
            return unregisterFrom(i);
        }
        C2464p pVar = this.mLocalFieldObservers[i];
        if (pVar == null) {
            registerTo(i, obj, dVar);
            return true;
        } else if (pVar.f5721c == obj) {
            return false;
        } else {
            unregisterFrom(i);
            registerTo(i, obj, dVar);
            return true;
        }
    }

    public static <T> T getFromList(List<T> list, int i) {
        if (list == null || i < 0 || i >= list.size()) {
            return null;
        }
        return list.get(i);
    }

    public static byte parse(String str, byte b) {
        try {
            return Byte.parseByte(str);
        } catch (NumberFormatException unused) {
            return b;
        }
    }

    public static long safeUnbox(Long l) {
        if (l == null) {
            return 0;
        }
        return l.longValue();
    }

    public void setRootTag(View[] viewArr) {
        for (View tag : viewArr) {
            tag.setTag(R.id.dataBinding, this);
        }
    }

    public static boolean getFromArray(boolean[] zArr, int i) {
        if (zArr == null || i < 0 || i >= zArr.length) {
            return false;
        }
        return zArr[i];
    }

    public static Object[] mapBindings(DataBindingComponent dataBindingComponent, View[] viewArr, int i, C2432i iVar, SparseIntArray sparseIntArray) {
        Object[] objArr = new Object[i];
        for (View mapBindings : viewArr) {
            mapBindings(dataBindingComponent, mapBindings, objArr, iVar, sparseIntArray, true);
        }
        return objArr;
    }

    public static short parse(String str, short s) {
        try {
            return Short.parseShort(str);
        } catch (NumberFormatException unused) {
            return s;
        }
    }

    public static short safeUnbox(Short sh) {
        if (sh == null) {
            return 0;
        }
        return sh.shortValue();
    }

    public static void setTo(boolean[] zArr, int i, boolean z) {
        if (zArr != null && i >= 0 && i < zArr.length) {
            zArr[i] = z;
        }
    }

    public static <T> T getFromList(SparseArray<T> sparseArray, int i) {
        if (sparseArray == null || i < 0) {
            return null;
        }
        return sparseArray.get(i);
    }

    public static int parse(String str, int i) {
        try {
            return Integer.parseInt(str);
        } catch (NumberFormatException unused) {
            return i;
        }
    }

    public static byte safeUnbox(Byte b) {
        if (b == null) {
            return 0;
        }
        return b.byteValue();
    }

    public static byte getFromArray(byte[] bArr, int i) {
        if (bArr == null || i < 0 || i >= bArr.length) {
            return 0;
        }
        return bArr[i];
    }

    @TargetApi(16)
    public static <T> T getFromList(LongSparseArray<T> longSparseArray, int i) {
        if (longSparseArray == null || i < 0) {
            return null;
        }
        return longSparseArray.get((long) i);
    }

    public static long parse(String str, long j) {
        try {
            return Long.parseLong(str);
        } catch (NumberFormatException unused) {
            return j;
        }
    }

    public static char safeUnbox(Character ch) {
        if (ch == null) {
            return 0;
        }
        return ch.charValue();
    }

    public static void setTo(byte[] bArr, int i, byte b) {
        if (bArr != null && i >= 0 && i < bArr.length) {
            bArr[i] = b;
        }
    }

    public static boolean getFromList(SparseBooleanArray sparseBooleanArray, int i) {
        if (sparseBooleanArray == null || i < 0) {
            return false;
        }
        return sparseBooleanArray.get(i);
    }

    /* JADX WARNING: Removed duplicated region for block: B:37:0x006e  */
    /* JADX WARNING: Removed duplicated region for block: B:41:? A[ORIG_RETURN, RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static void mapBindings(androidx.databinding.DataBindingComponent r8, android.view.View r9, java.lang.Object[] r10, androidx.databinding.ViewDataBinding.C2432i r11, android.util.SparseIntArray r12, boolean r13) {
        /*
            androidx.databinding.ViewDataBinding r0 = getBinding(r9)
            if (r0 == 0) goto L_0x0007
            return
        L_0x0007:
            java.lang.Object r0 = r9.getTag()
            boolean r1 = r0 instanceof java.lang.String
            if (r1 == 0) goto L_0x0012
            java.lang.String r0 = (java.lang.String) r0
            goto L_0x0013
        L_0x0012:
            r0 = 0
        L_0x0013:
            r1 = 0
            r2 = 1
            if (r13 == 0) goto L_0x003b
            if (r0 == 0) goto L_0x003b
            java.lang.String r13 = "layout"
            boolean r13 = r0.startsWith(r13)
            if (r13 == 0) goto L_0x003b
            r13 = 95
            int r13 = r0.lastIndexOf(r13)
            if (r13 <= 0) goto L_0x0052
            int r13 = r13 + r2
            boolean r3 = isNumeric(r0, r13)
            if (r3 == 0) goto L_0x0052
            int r13 = parseTagInt(r0, r13)
            r0 = r10[r13]
            if (r0 != 0) goto L_0x0053
            r10[r13] = r9
            goto L_0x0053
        L_0x003b:
            if (r0 == 0) goto L_0x0052
            java.lang.String r13 = "binding_"
            boolean r13 = r0.startsWith(r13)
            if (r13 == 0) goto L_0x0052
            int r13 = BINDING_NUMBER_START
            int r13 = parseTagInt(r0, r13)
            r0 = r10[r13]
            if (r0 != 0) goto L_0x0053
            r10[r13] = r9
            goto L_0x0053
        L_0x0052:
            r2 = r1
        L_0x0053:
            if (r2 != 0) goto L_0x006a
            int r13 = r9.getId()
            if (r13 <= 0) goto L_0x006a
            if (r12 == 0) goto L_0x006a
            r0 = -1
            int r13 = r12.get(r13, r0)
            if (r13 < 0) goto L_0x006a
            r0 = r10[r13]
            if (r0 != 0) goto L_0x006a
            r10[r13] = r9
        L_0x006a:
            boolean r13 = r9 instanceof android.view.ViewGroup
            if (r13 == 0) goto L_0x0085
            android.view.ViewGroup r9 = (android.view.ViewGroup) r9
            int r13 = r9.getChildCount()
        L_0x0074:
            if (r1 >= r13) goto L_0x0085
            android.view.View r3 = r9.getChildAt(r1)
            r7 = 0
            r2 = r8
            r4 = r10
            r5 = r11
            r6 = r12
            mapBindings(r2, r3, r4, r5, r6, r7)
            int r1 = r1 + 1
            goto L_0x0074
        L_0x0085:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.databinding.ViewDataBinding.mapBindings(androidx.databinding.DataBindingComponent, android.view.View, java.lang.Object[], androidx.databinding.ViewDataBinding$i, android.util.SparseIntArray, boolean):void");
    }

    public static float parse(String str, float f) {
        try {
            return Float.parseFloat(str);
        } catch (NumberFormatException unused) {
            return f;
        }
    }

    public static double safeUnbox(Double d) {
        return d == null ? ShadowDrawableWrapper.COS_45 : d.doubleValue();
    }

    public static short getFromArray(short[] sArr, int i) {
        if (sArr == null || i < 0 || i >= sArr.length) {
            return 0;
        }
        return sArr[i];
    }

    public static int getFromList(SparseIntArray sparseIntArray, int i) {
        if (sparseIntArray == null || i < 0) {
            return 0;
        }
        return sparseIntArray.get(i);
    }

    public static double parse(String str, double d) {
        try {
            return Double.parseDouble(str);
        } catch (NumberFormatException unused) {
            return d;
        }
    }

    public static float safeUnbox(Float f) {
        if (f == null) {
            return 0.0f;
        }
        return f.floatValue();
    }

    public static void setTo(short[] sArr, int i, short s) {
        if (sArr != null && i >= 0 && i < sArr.length) {
            sArr[i] = s;
        }
    }

    public boolean updateRegistration(int i, C2451i iVar) {
        return updateRegistration(i, iVar, CREATE_PROPERTY_LISTENER);
    }

    @TargetApi(18)
    public static long getFromList(SparseLongArray sparseLongArray, int i) {
        if (sparseLongArray == null || i < 0) {
            return 0;
        }
        return sparseLongArray.get(i);
    }

    public static char parse(String str, char c) {
        return (str == null || str.isEmpty()) ? c : str.charAt(0);
    }

    public static boolean safeUnbox(Boolean bool) {
        if (bool == null) {
            return false;
        }
        return bool.booleanValue();
    }

    public boolean updateRegistration(int i, C2453j jVar) {
        return updateRegistration(i, jVar, CREATE_LIST_LISTENER);
    }

    public static char getFromArray(char[] cArr, int i) {
        if (cArr == null || i < 0 || i >= cArr.length) {
            return 0;
        }
        return cArr[i];
    }

    public static void setTo(char[] cArr, int i, char c) {
        if (cArr != null && i >= 0 && i < cArr.length) {
            cArr[i] = c;
        }
    }

    public boolean updateRegistration(int i, C2455k kVar) {
        return updateRegistration(i, kVar, CREATE_MAP_LISTENER);
    }

    public static int getFromArray(int[] iArr, int i) {
        if (iArr == null || i < 0 || i >= iArr.length) {
            return 0;
        }
        return iArr[i];
    }

    public static void setTo(int[] iArr, int i, int i2) {
        if (iArr != null && i >= 0 && i < iArr.length) {
            iArr[i] = i2;
        }
    }

    public static long getFromArray(long[] jArr, int i) {
        if (jArr == null || i < 0 || i >= jArr.length) {
            return 0;
        }
        return jArr[i];
    }

    public static void setTo(long[] jArr, int i, long j) {
        if (jArr != null && i >= 0 && i < jArr.length) {
            jArr[i] = j;
        }
    }

    public ViewDataBinding(Object obj, View view, int i) {
        this(checkAndCastToBindingComponent(obj), view, i);
    }

    public static float getFromArray(float[] fArr, int i) {
        if (fArr == null || i < 0 || i >= fArr.length) {
            return 0.0f;
        }
        return fArr[i];
    }

    public static void setTo(float[] fArr, int i, float f) {
        if (fArr != null && i >= 0 && i < fArr.length) {
            fArr[i] = f;
        }
    }

    public static double getFromArray(double[] dArr, int i) {
        return (dArr == null || i < 0 || i >= dArr.length) ? ShadowDrawableWrapper.COS_45 : dArr[i];
    }

    public static void setTo(double[] dArr, int i, double d) {
        if (dArr != null && i >= 0 && i < dArr.length) {
            dArr[i] = d;
        }
    }

    public static <T> void setTo(List<T> list, int i, T t) {
        if (list != null && i >= 0 && i < list.size()) {
            list.set(i, t);
        }
    }

    public static <T> void setTo(SparseArray<T> sparseArray, int i, T t) {
        if (sparseArray != null && i >= 0 && i < sparseArray.size()) {
            sparseArray.put(i, t);
        }
    }

    @TargetApi(16)
    public static <T> void setTo(LongSparseArray<T> longSparseArray, int i, T t) {
        if (longSparseArray != null && i >= 0 && i < longSparseArray.size()) {
            longSparseArray.put((long) i, t);
        }
    }

    public static <T> void setTo(C7498f<T> fVar, int i, T t) {
        if (fVar != null && i >= 0 && i < fVar.mo19891i()) {
            fVar.mo19890h((long) i, t);
        }
    }

    public static void setTo(SparseBooleanArray sparseBooleanArray, int i, boolean z) {
        if (sparseBooleanArray != null && i >= 0 && i < sparseBooleanArray.size()) {
            sparseBooleanArray.put(i, z);
        }
    }

    public static void setTo(SparseIntArray sparseIntArray, int i, int i2) {
        if (sparseIntArray != null && i >= 0 && i < sparseIntArray.size()) {
            sparseIntArray.put(i, i2);
        }
    }

    @TargetApi(18)
    public static void setTo(SparseLongArray sparseLongArray, int i, long j) {
        if (sparseLongArray != null && i >= 0 && i < sparseLongArray.size()) {
            sparseLongArray.put(i, j);
        }
    }

    public static <K, T> void setTo(Map<K, T> map, K k, T t) {
        if (map != null) {
            map.put(k, t);
        }
    }
}
