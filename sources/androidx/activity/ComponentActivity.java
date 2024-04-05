package androidx.activity;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Trace;
import android.support.p013v4.media.C0072d;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.activity.result.C0118a;
import androidx.activity.result.C0120c;
import androidx.activity.result.C0123f;
import androidx.activity.result.C0126g;
import androidx.activity.result.IntentSenderRequest;
import androidx.lifecycle.C2861g0;
import androidx.lifecycle.C2870k0;
import androidx.lifecycle.C2878l0;
import androidx.lifecycle.C2880m0;
import androidx.lifecycle.C2881n;
import androidx.lifecycle.C2885q;
import androidx.lifecycle.C2887s;
import androidx.lifecycle.C2888t;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.ReportFragment;
import androidx.savedstate.C3265b;
import androidx.savedstate.C3268c;
import androidx.savedstate.C3269d;
import androidx.savedstate.ViewTreeSavedStateRegistryOwner;
import com.etsy.android.R;
import com.google.android.play.core.assetpacks.C15588c1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;
import java.util.concurrent.atomic.AtomicInteger;
import p000a.C0000a;
import p000a.C0001b;
import p000a.C0003d;
import p019b.C3443a;
import p176m2.C7312a;
import p250u0.C8077a;

public class ComponentActivity extends androidx.core.app.ComponentActivity implements C0000a, C2880m0, C2881n, C3269d, C0113g, C0126g {
    private static final String ACTIVITY_RESULT_TAG = "android:support:activity-result";
    private final C0123f mActivityResultRegistry;
    private int mContentLayoutId;
    public final C0001b mContextAwareHelper;
    private C2870k0.C2872b mDefaultFactory;
    private final C2888t mLifecycleRegistry;
    private final AtomicInteger mNextLocalRequestCode;
    private final OnBackPressedDispatcher mOnBackPressedDispatcher;
    public final C3268c mSavedStateRegistryController;
    private C2878l0 mViewModelStore;

    /* renamed from: androidx.activity.ComponentActivity$a */
    public class C0093a implements Runnable {
        public C0093a() {
        }

        public final void run() {
            try {
                ComponentActivity.super.onBackPressed();
            } catch (IllegalStateException e) {
                if (!TextUtils.equals(e.getMessage(), "Can not perform this action after onSaveInstanceState")) {
                    throw e;
                }
            }
        }
    }

    /* renamed from: androidx.activity.ComponentActivity$b */
    public class C0094b extends C0123f {
        public C0094b() {
        }

        /* renamed from: b */
        public final void mo1103b(int i, C3443a aVar, Object obj) {
            ComponentActivity componentActivity = ComponentActivity.this;
            C3443a.C3444a b = aVar.mo12969b(componentActivity, obj);
            if (b != null) {
                new Handler(Looper.getMainLooper()).post(new C0110d(this, i, b));
                return;
            }
            Intent a = aVar.mo1146a(componentActivity, obj);
            Bundle bundle = null;
            if (a.getExtras() != null && a.getExtras().getClassLoader() == null) {
                a.setExtrasClassLoader(componentActivity.getClassLoader());
            }
            if (a.hasExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE")) {
                bundle = a.getBundleExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
                a.removeExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
            }
            Bundle bundle2 = bundle;
            if ("androidx.activity.result.contract.action.REQUEST_PERMISSIONS".equals(a.getAction())) {
                String[] stringArrayExtra = a.getStringArrayExtra("androidx.activity.result.contract.extra.PERMISSIONS");
                if (stringArrayExtra == null) {
                    stringArrayExtra = new String[0];
                }
                C8077a.m16263c(i, componentActivity, stringArrayExtra);
            } else if ("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST".equals(a.getAction())) {
                IntentSenderRequest intentSenderRequest = (IntentSenderRequest) a.getParcelableExtra("androidx.activity.result.contract.extra.INTENT_SENDER_REQUEST");
                try {
                    IntentSender intentSender = intentSenderRequest.getIntentSender();
                    Intent fillInIntent = intentSenderRequest.getFillInIntent();
                    int flagsMask = intentSenderRequest.getFlagsMask();
                    int flagsValues = intentSenderRequest.getFlagsValues();
                    int i2 = C8077a.f17593c;
                    componentActivity.startIntentSenderForResult(intentSender, i, fillInIntent, flagsMask, flagsValues, 0, bundle2);
                } catch (IntentSender.SendIntentException e) {
                    new Handler(Looper.getMainLooper()).post(new C0111e(this, i, e));
                }
            } else {
                int i3 = C8077a.f17593c;
                componentActivity.startActivityForResult(a, i, bundle2);
            }
        }
    }

    /* renamed from: androidx.activity.ComponentActivity$c */
    public static final class C0095c {

        /* renamed from: a */
        public Object f134a;

        /* renamed from: b */
        public C2878l0 f135b;
    }

    public ComponentActivity() {
        this.mContextAwareHelper = new C0001b();
        this.mLifecycleRegistry = new C2888t(this, true);
        this.mSavedStateRegistryController = new C3268c(this);
        this.mOnBackPressedDispatcher = new OnBackPressedDispatcher(new C0093a());
        this.mNextLocalRequestCode = new AtomicInteger();
        this.mActivityResultRegistry = new C0094b();
        if (getLifecycle() != null) {
            getLifecycle().mo10733a(new C2885q() {
                public final void onStateChanged(C2887s sVar, Lifecycle.Event event) {
                    if (event == Lifecycle.Event.ON_STOP) {
                        Window window = ComponentActivity.this.getWindow();
                        View peekDecorView = window != null ? window.peekDecorView() : null;
                        if (peekDecorView != null) {
                            peekDecorView.cancelPendingInputEvents();
                        }
                    }
                }
            });
            getLifecycle().mo10733a(new C2885q() {
                public final void onStateChanged(C2887s sVar, Lifecycle.Event event) {
                    if (event == Lifecycle.Event.ON_DESTROY) {
                        ComponentActivity.this.mContextAwareHelper.f1b = null;
                        if (!ComponentActivity.this.isChangingConfigurations()) {
                            ComponentActivity.this.getViewModelStore().mo10831a();
                        }
                    }
                }
            });
            getLifecycle().mo10733a(new C2885q() {
                public final void onStateChanged(C2887s sVar, Lifecycle.Event event) {
                    ComponentActivity.this.ensureViewModelStore();
                    ComponentActivity.this.getLifecycle().mo10735c(this);
                }
            });
            getSavedStateRegistry().mo12061b(ACTIVITY_RESULT_TAG, new C0102b(this, 0));
            addOnContextAvailableListener(new C0103c(this));
            return;
        }
        throw new IllegalStateException("getLifecycle() returned null in ComponentActivity's constructor. Please make sure you are lazily constructing your Lifecycle in the first call to getLifecycle() rather than relying on field initialization.");
    }

    private void initViewTreeOwners() {
        C15588c1.m25297O0(getWindow().getDecorView(), this);
        getWindow().getDecorView().setTag(R.id.view_tree_view_model_store_owner, this);
        ViewTreeSavedStateRegistryOwner.m7917b(getWindow().getDecorView(), this);
    }

    /* access modifiers changed from: private */
    public Bundle lambda$new$0() {
        Bundle bundle = new Bundle();
        C0123f fVar = this.mActivityResultRegistry;
        fVar.getClass();
        bundle.putIntegerArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_RCS", new ArrayList(fVar.f203c.values()));
        bundle.putStringArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS", new ArrayList(fVar.f203c.keySet()));
        bundle.putStringArrayList("KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS", new ArrayList(fVar.f205e));
        bundle.putBundle("KEY_COMPONENT_ACTIVITY_PENDING_RESULT", (Bundle) fVar.f208h.clone());
        bundle.putSerializable("KEY_COMPONENT_ACTIVITY_RANDOM_OBJECT", fVar.f201a);
        return bundle;
    }

    /* access modifiers changed from: private */
    public void lambda$new$1(Context context) {
        Bundle a = getSavedStateRegistry().mo12060a(ACTIVITY_RESULT_TAG);
        if (a != null) {
            C0123f fVar = this.mActivityResultRegistry;
            fVar.getClass();
            ArrayList<Integer> integerArrayList = a.getIntegerArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_RCS");
            ArrayList<String> stringArrayList = a.getStringArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS");
            if (stringArrayList != null && integerArrayList != null) {
                fVar.f205e = a.getStringArrayList("KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS");
                fVar.f201a = (Random) a.getSerializable("KEY_COMPONENT_ACTIVITY_RANDOM_OBJECT");
                fVar.f208h.putAll(a.getBundle("KEY_COMPONENT_ACTIVITY_PENDING_RESULT"));
                for (int i = 0; i < stringArrayList.size(); i++) {
                    String str = stringArrayList.get(i);
                    if (fVar.f203c.containsKey(str)) {
                        Integer num = (Integer) fVar.f203c.remove(str);
                        if (!fVar.f208h.containsKey(str)) {
                            fVar.f202b.remove(num);
                        }
                    }
                    int intValue = integerArrayList.get(i).intValue();
                    String str2 = stringArrayList.get(i);
                    fVar.f202b.put(Integer.valueOf(intValue), str2);
                    fVar.f203c.put(str2, Integer.valueOf(intValue));
                }
            }
        }
    }

    public void addContentView(@SuppressLint({"UnknownNullness", "MissingNullability"}) View view, @SuppressLint({"UnknownNullness", "MissingNullability"}) ViewGroup.LayoutParams layoutParams) {
        initViewTreeOwners();
        super.addContentView(view, layoutParams);
    }

    public final void addOnContextAvailableListener(C0003d dVar) {
        C0001b bVar = this.mContextAwareHelper;
        if (bVar.f1b != null) {
            dVar.mo2a(bVar.f1b);
        }
        bVar.f0a.add(dVar);
    }

    public void ensureViewModelStore() {
        if (this.mViewModelStore == null) {
            C0095c cVar = (C0095c) getLastNonConfigurationInstance();
            if (cVar != null) {
                this.mViewModelStore = cVar.f135b;
            }
            if (this.mViewModelStore == null) {
                this.mViewModelStore = new C2878l0();
            }
        }
    }

    public final C0123f getActivityResultRegistry() {
        return this.mActivityResultRegistry;
    }

    public C2870k0.C2872b getDefaultViewModelProviderFactory() {
        if (getApplication() != null) {
            if (this.mDefaultFactory == null) {
                this.mDefaultFactory = new C2861g0(getApplication(), this, getIntent() != null ? getIntent().getExtras() : null);
            }
            return this.mDefaultFactory;
        }
        throw new IllegalStateException("Your activity is not yet attached to the Application instance. You can't request ViewModel before onCreate call.");
    }

    @Deprecated
    public Object getLastCustomNonConfigurationInstance() {
        C0095c cVar = (C0095c) getLastNonConfigurationInstance();
        if (cVar != null) {
            return cVar.f134a;
        }
        return null;
    }

    public Lifecycle getLifecycle() {
        return this.mLifecycleRegistry;
    }

    public final OnBackPressedDispatcher getOnBackPressedDispatcher() {
        return this.mOnBackPressedDispatcher;
    }

    public final C3265b getSavedStateRegistry() {
        return this.mSavedStateRegistryController.f7591b;
    }

    public C2878l0 getViewModelStore() {
        if (getApplication() != null) {
            ensureViewModelStore();
            return this.mViewModelStore;
        }
        throw new IllegalStateException("Your activity is not yet attached to the Application instance. You can't request ViewModel before onCreate call.");
    }

    @Deprecated
    public void onActivityResult(int i, int i2, Intent intent) {
        if (!this.mActivityResultRegistry.mo1159a(i, i2, intent)) {
            super.onActivityResult(i, i2, intent);
        }
    }

    public void onBackPressed() {
        this.mOnBackPressedDispatcher.mo1105b();
    }

    public void onCreate(Bundle bundle) {
        this.mSavedStateRegistryController.mo12063a(bundle);
        C0001b bVar = this.mContextAwareHelper;
        bVar.f1b = this;
        Iterator it = bVar.f0a.iterator();
        while (it.hasNext()) {
            ((C0003d) it.next()).mo2a(this);
        }
        super.onCreate(bundle);
        ReportFragment.injectIfNeededIn(this);
        int i = this.mContentLayoutId;
        if (i != 0) {
            setContentView(i);
        }
    }

    @Deprecated
    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        if (!this.mActivityResultRegistry.mo1159a(i, -1, new Intent().putExtra("androidx.activity.result.contract.extra.PERMISSIONS", strArr).putExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS", iArr))) {
            super.onRequestPermissionsResult(i, strArr, iArr);
        }
    }

    @Deprecated
    public Object onRetainCustomNonConfigurationInstance() {
        return null;
    }

    public final Object onRetainNonConfigurationInstance() {
        C0095c cVar;
        Object onRetainCustomNonConfigurationInstance = onRetainCustomNonConfigurationInstance();
        C2878l0 l0Var = this.mViewModelStore;
        if (l0Var == null && (cVar = (C0095c) getLastNonConfigurationInstance()) != null) {
            l0Var = cVar.f135b;
        }
        if (l0Var == null && onRetainCustomNonConfigurationInstance == null) {
            return null;
        }
        C0095c cVar2 = new C0095c();
        cVar2.f134a = onRetainCustomNonConfigurationInstance;
        cVar2.f135b = l0Var;
        return cVar2;
    }

    public void onSaveInstanceState(Bundle bundle) {
        Lifecycle lifecycle = getLifecycle();
        if (lifecycle instanceof C2888t) {
            ((C2888t) lifecycle).mo10839h(Lifecycle.State.CREATED);
        }
        super.onSaveInstanceState(bundle);
        this.mSavedStateRegistryController.mo12064b(bundle);
    }

    public Context peekAvailableContext() {
        return this.mContextAwareHelper.f1b;
    }

    public final <I, O> C0120c<I> registerForActivityResult(C3443a<I, O> aVar, C0123f fVar, C0118a<O> aVar2) {
        StringBuilder h = C0072d.m201h("activity_rq#");
        h.append(this.mNextLocalRequestCode.getAndIncrement());
        return fVar.mo1160c(h.toString(), this, aVar, aVar2);
    }

    public final void removeOnContextAvailableListener(C0003d dVar) {
        this.mContextAwareHelper.f0a.remove(dVar);
    }

    public void reportFullyDrawn() {
        try {
            if (C7312a.m14027a()) {
                Trace.beginSection("reportFullyDrawn() for ComponentActivity");
            }
            super.reportFullyDrawn();
            Trace.endSection();
        } catch (Throwable th) {
            Trace.endSection();
            throw th;
        }
    }

    public void setContentView(int i) {
        initViewTreeOwners();
        super.setContentView(i);
    }

    @Deprecated
    public void startActivityForResult(@SuppressLint({"UnknownNullness"}) Intent intent, int i) {
        super.startActivityForResult(intent, i);
    }

    @Deprecated
    public void startIntentSenderForResult(@SuppressLint({"UnknownNullness"}) IntentSender intentSender, int i, Intent intent, int i2, int i3, int i4) throws IntentSender.SendIntentException {
        super.startIntentSenderForResult(intentSender, i, intent, i2, i3, i4);
    }

    @Deprecated
    public void startActivityForResult(@SuppressLint({"UnknownNullness"}) Intent intent, int i, Bundle bundle) {
        super.startActivityForResult(intent, i, bundle);
    }

    @Deprecated
    public void startIntentSenderForResult(@SuppressLint({"UnknownNullness"}) IntentSender intentSender, int i, Intent intent, int i2, int i3, int i4, Bundle bundle) throws IntentSender.SendIntentException {
        super.startIntentSenderForResult(intentSender, i, intent, i2, i3, i4, bundle);
    }

    public void setContentView(@SuppressLint({"UnknownNullness", "MissingNullability"}) View view) {
        initViewTreeOwners();
        super.setContentView(view);
    }

    public void setContentView(@SuppressLint({"UnknownNullness", "MissingNullability"}) View view, @SuppressLint({"UnknownNullness", "MissingNullability"}) ViewGroup.LayoutParams layoutParams) {
        initViewTreeOwners();
        super.setContentView(view, layoutParams);
    }

    public final <I, O> C0120c<I> registerForActivityResult(C3443a<I, O> aVar, C0118a<O> aVar2) {
        return registerForActivityResult(aVar, this.mActivityResultRegistry, aVar2);
    }

    public ComponentActivity(int i) {
        this();
        this.mContentLayoutId = i;
    }
}
