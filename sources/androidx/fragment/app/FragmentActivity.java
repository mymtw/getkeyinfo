package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.app.SharedElementCallback;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.content.res.Configuration;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import androidx.activity.C0113g;
import androidx.activity.ComponentActivity;
import androidx.activity.OnBackPressedDispatcher;
import androidx.activity.result.C0123f;
import androidx.activity.result.C0126g;
import androidx.lifecycle.C2878l0;
import androidx.lifecycle.C2880m0;
import androidx.lifecycle.C2888t;
import androidx.lifecycle.Lifecycle;
import androidx.savedstate.C3265b;
import androidx.savedstate.C3269d;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import p230s1.C7796a;
import p250u0.C8077a;
import p250u0.C8112w;

public class FragmentActivity extends ComponentActivity implements C8077a.C8078a, C8077a.C8079b {
    public static final String LIFECYCLE_TAG = "android:support:lifecycle";
    public boolean mCreated;
    public final C2888t mFragmentLifecycleRegistry = new C2888t(this, true);
    public final C2780p mFragments = new C2780p(new C2710a());
    public boolean mResumed;
    public boolean mStopped = true;

    /* renamed from: androidx.fragment.app.FragmentActivity$a */
    public class C2710a extends C2782r<FragmentActivity> implements C2880m0, C0113g, C0126g, C3269d, C2799x {
        public C2710a() {
            super(FragmentActivity.this);
        }

        /* renamed from: a */
        public final void mo10329a(Fragment fragment) {
            FragmentActivity.this.onAttachFragment(fragment);
        }

        /* renamed from: b */
        public final View mo10129b(int i) {
            return FragmentActivity.this.findViewById(i);
        }

        /* renamed from: c */
        public final boolean mo10130c() {
            Window window = FragmentActivity.this.getWindow();
            return (window == null || window.peekDecorView() == null) ? false : true;
        }

        /* renamed from: d */
        public final FragmentActivity mo10330d() {
            return FragmentActivity.this;
        }

        /* renamed from: e */
        public final LayoutInflater mo10331e() {
            return FragmentActivity.this.getLayoutInflater().cloneInContext(FragmentActivity.this);
        }

        /* renamed from: f */
        public final boolean mo10332f(String str) {
            FragmentActivity fragmentActivity = FragmentActivity.this;
            int i = C8077a.f17593c;
            return fragmentActivity.shouldShowRequestPermissionRationale(str);
        }

        /* renamed from: g */
        public final void mo10333g() {
            FragmentActivity.this.supportInvalidateOptionsMenu();
        }

        public final C0123f getActivityResultRegistry() {
            return FragmentActivity.this.getActivityResultRegistry();
        }

        public final Lifecycle getLifecycle() {
            return FragmentActivity.this.mFragmentLifecycleRegistry;
        }

        public final OnBackPressedDispatcher getOnBackPressedDispatcher() {
            return FragmentActivity.this.getOnBackPressedDispatcher();
        }

        public final C3265b getSavedStateRegistry() {
            return FragmentActivity.this.getSavedStateRegistry();
        }

        public final C2878l0 getViewModelStore() {
            return FragmentActivity.this.getViewModelStore();
        }
    }

    public FragmentActivity() {
        init();
    }

    private void init() {
        getSavedStateRegistry().mo12061b(LIFECYCLE_TAG, new C2772l(this));
        addOnContextAvailableListener(new C2774m(this));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ Bundle lambda$init$0() {
        markFragmentsCreated();
        this.mFragmentLifecycleRegistry.mo10837f(Lifecycle.Event.ON_STOP);
        return new Bundle();
    }

    /* access modifiers changed from: private */
    public void lambda$init$1(Context context) {
        C2782r<?> rVar = this.mFragments.f6331a;
        rVar.f6336e.mo10376b(rVar, rVar, (Fragment) null);
    }

    private static boolean markState(FragmentManager fragmentManager, Lifecycle.State state) {
        boolean z = false;
        for (Fragment next : fragmentManager.mo10358H()) {
            if (next != null) {
                if (next.getHost() != null) {
                    z |= markState(next.getChildFragmentManager(), state);
                }
                C2771k0 k0Var = next.mViewLifecycleOwner;
                if (k0Var != null) {
                    k0Var.mo10577b();
                    if (k0Var.f6318e.f6517c.isAtLeast(Lifecycle.State.STARTED)) {
                        next.mViewLifecycleOwner.f6318e.mo10839h(state);
                        z = true;
                    }
                }
                if (next.mLifecycleRegistry.f6517c.isAtLeast(Lifecycle.State.STARTED)) {
                    next.mLifecycleRegistry.mo10839h(state);
                    z = true;
                }
            }
        }
        return z;
    }

    public final View dispatchFragmentsOnCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        return this.mFragments.f6331a.f6336e.f6136f.onCreateView(view, str, context, attributeSet);
    }

    public void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.dump(str, fileDescriptor, printWriter, strArr);
        printWriter.print(str);
        printWriter.print("Local FragmentActivity ");
        printWriter.print(Integer.toHexString(System.identityHashCode(this)));
        printWriter.println(" State:");
        String str2 = str + "  ";
        printWriter.print(str2);
        printWriter.print("mCreated=");
        printWriter.print(this.mCreated);
        printWriter.print(" mResumed=");
        printWriter.print(this.mResumed);
        printWriter.print(" mStopped=");
        printWriter.print(this.mStopped);
        if (getApplication() != null) {
            C7796a.m15058a(this).mo20341b(str2, printWriter);
        }
        this.mFragments.f6331a.f6336e.mo10401u(str, fileDescriptor, printWriter, strArr);
    }

    public FragmentManager getSupportFragmentManager() {
        return this.mFragments.f6331a.f6336e;
    }

    @Deprecated
    public C7796a getSupportLoaderManager() {
        return C7796a.m15058a(this);
    }

    public void markFragmentsCreated() {
        do {
        } while (markState(getSupportFragmentManager(), Lifecycle.State.CREATED));
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        this.mFragments.mo10585a();
        super.onActivityResult(i, i2, intent);
    }

    @Deprecated
    public void onAttachFragment(Fragment fragment) {
    }

    public void onConfigurationChanged(Configuration configuration) {
        this.mFragments.mo10585a();
        super.onConfigurationChanged(configuration);
        this.mFragments.f6331a.f6336e.mo10387h(configuration);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.mFragmentLifecycleRegistry.mo10837f(Lifecycle.Event.ON_CREATE);
        C2796v vVar = this.mFragments.f6331a.f6336e;
        vVar.f6122C = false;
        vVar.f6123D = false;
        vVar.f6129J.f6357g = false;
        vVar.mo10399t(1);
    }

    public boolean onCreatePanelMenu(int i, Menu menu) {
        if (i != 0) {
            return super.onCreatePanelMenu(i, menu);
        }
        boolean onCreatePanelMenu = super.onCreatePanelMenu(i, menu);
        C2780p pVar = this.mFragments;
        return onCreatePanelMenu | pVar.f6331a.f6336e.mo10389j(menu, getMenuInflater());
    }

    public View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        View dispatchFragmentsOnCreateView = dispatchFragmentsOnCreateView(view, str, context, attributeSet);
        return dispatchFragmentsOnCreateView == null ? super.onCreateView(view, str, context, attributeSet) : dispatchFragmentsOnCreateView;
    }

    public void onDestroy() {
        super.onDestroy();
        this.mFragments.f6331a.f6336e.mo10390k();
        this.mFragmentLifecycleRegistry.mo10837f(Lifecycle.Event.ON_DESTROY);
    }

    public void onLowMemory() {
        super.onLowMemory();
        this.mFragments.f6331a.f6336e.mo10391l();
    }

    public boolean onMenuItemSelected(int i, MenuItem menuItem) {
        if (super.onMenuItemSelected(i, menuItem)) {
            return true;
        }
        if (i == 0) {
            return this.mFragments.f6331a.f6336e.mo10394o(menuItem);
        }
        if (i != 6) {
            return false;
        }
        return this.mFragments.f6331a.f6336e.mo10388i(menuItem);
    }

    public void onMultiWindowModeChanged(boolean z) {
        this.mFragments.f6331a.f6336e.mo10392m(z);
    }

    public void onNewIntent(@SuppressLint({"UnknownNullness"}) Intent intent) {
        this.mFragments.mo10585a();
        super.onNewIntent(intent);
    }

    public void onPanelClosed(int i, Menu menu) {
        if (i == 0) {
            this.mFragments.f6331a.f6336e.mo10395p(menu);
        }
        super.onPanelClosed(i, menu);
    }

    public void onPause() {
        super.onPause();
        this.mResumed = false;
        this.mFragments.f6331a.f6336e.mo10399t(5);
        this.mFragmentLifecycleRegistry.mo10837f(Lifecycle.Event.ON_PAUSE);
    }

    public void onPictureInPictureModeChanged(boolean z) {
        this.mFragments.f6331a.f6336e.mo10397r(z);
    }

    public void onPostResume() {
        super.onPostResume();
        onResumeFragments();
    }

    @Deprecated
    public boolean onPrepareOptionsPanel(View view, Menu menu) {
        return super.onPreparePanel(0, view, menu);
    }

    public boolean onPreparePanel(int i, View view, Menu menu) {
        return i == 0 ? onPrepareOptionsPanel(view, menu) | this.mFragments.f6331a.f6336e.mo10398s(menu) : super.onPreparePanel(i, view, menu);
    }

    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        this.mFragments.mo10585a();
        super.onRequestPermissionsResult(i, strArr, iArr);
    }

    public void onResume() {
        this.mFragments.mo10585a();
        super.onResume();
        this.mResumed = true;
        this.mFragments.f6331a.f6336e.mo10404x(true);
    }

    public void onResumeFragments() {
        this.mFragmentLifecycleRegistry.mo10837f(Lifecycle.Event.ON_RESUME);
        C2796v vVar = this.mFragments.f6331a.f6336e;
        vVar.f6122C = false;
        vVar.f6123D = false;
        vVar.f6129J.f6357g = false;
        vVar.mo10399t(7);
    }

    public void onStart() {
        this.mFragments.mo10585a();
        super.onStart();
        this.mStopped = false;
        if (!this.mCreated) {
            this.mCreated = true;
            C2796v vVar = this.mFragments.f6331a.f6336e;
            vVar.f6122C = false;
            vVar.f6123D = false;
            vVar.f6129J.f6357g = false;
            vVar.mo10399t(4);
        }
        this.mFragments.f6331a.f6336e.mo10404x(true);
        this.mFragmentLifecycleRegistry.mo10837f(Lifecycle.Event.ON_START);
        C2796v vVar2 = this.mFragments.f6331a.f6336e;
        vVar2.f6122C = false;
        vVar2.f6123D = false;
        vVar2.f6129J.f6357g = false;
        vVar2.mo10399t(5);
    }

    public void onStateNotSaved() {
        this.mFragments.mo10585a();
    }

    public void onStop() {
        super.onStop();
        this.mStopped = true;
        markFragmentsCreated();
        C2796v vVar = this.mFragments.f6331a.f6336e;
        vVar.f6123D = true;
        vVar.f6129J.f6357g = true;
        vVar.mo10399t(4);
        this.mFragmentLifecycleRegistry.mo10837f(Lifecycle.Event.ON_STOP);
    }

    public void setEnterSharedElementCallback(C8112w wVar) {
        int i = C8077a.f17593c;
        setEnterSharedElementCallback((SharedElementCallback) null);
    }

    public void setExitSharedElementCallback(C8112w wVar) {
        int i = C8077a.f17593c;
        setExitSharedElementCallback((SharedElementCallback) null);
    }

    public void startActivityFromFragment(Fragment fragment, @SuppressLint({"UnknownNullness"}) Intent intent, int i) {
        startActivityFromFragment(fragment, intent, i, (Bundle) null);
    }

    @Deprecated
    public void startIntentSenderFromFragment(Fragment fragment, @SuppressLint({"UnknownNullness"}) IntentSender intentSender, int i, Intent intent, int i2, int i3, int i4, Bundle bundle) throws IntentSender.SendIntentException {
        if (i == -1) {
            int i5 = C8077a.f17593c;
            startIntentSenderForResult(intentSender, i, intent, i2, i3, i4, bundle);
            return;
        }
        fragment.startIntentSenderForResult(intentSender, i, intent, i2, i3, i4, bundle);
    }

    public void supportFinishAfterTransition() {
        int i = C8077a.f17593c;
        finishAfterTransition();
    }

    @Deprecated
    public void supportInvalidateOptionsMenu() {
        invalidateOptionsMenu();
    }

    public void supportPostponeEnterTransition() {
        int i = C8077a.f17593c;
        postponeEnterTransition();
    }

    public void supportStartPostponedEnterTransition() {
        int i = C8077a.f17593c;
        startPostponedEnterTransition();
    }

    @Deprecated
    public final void validateRequestPermissionsRequestCode(int i) {
    }

    public void startActivityFromFragment(Fragment fragment, @SuppressLint({"UnknownNullness"}) Intent intent, int i, Bundle bundle) {
        if (i == -1) {
            int i2 = C8077a.f17593c;
            startActivityForResult(intent, -1, bundle);
            return;
        }
        fragment.startActivityForResult(intent, i, bundle);
    }

    public View onCreateView(String str, Context context, AttributeSet attributeSet) {
        View dispatchFragmentsOnCreateView = dispatchFragmentsOnCreateView((View) null, str, context, attributeSet);
        return dispatchFragmentsOnCreateView == null ? super.onCreateView(str, context, attributeSet) : dispatchFragmentsOnCreateView;
    }

    public FragmentActivity(int i) {
        super(i);
        init();
    }
}
