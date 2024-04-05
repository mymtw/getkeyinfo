package androidx.appcompat.app;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.appcompat.view.C0194a;
import androidx.appcompat.widget.Toolbar;
import androidx.appcompat.widget.VectorEnabledTintResources;
import androidx.fragment.app.FragmentActivity;
import androidx.savedstate.C3265b;
import androidx.savedstate.ViewTreeSavedStateRegistryOwner;
import com.etsy.android.R;
import com.google.android.play.core.assetpacks.C15588c1;
import p000a.C0003d;
import p250u0.C8077a;
import p250u0.C8090f;
import p250u0.C8113x;

public class AppCompatActivity extends FragmentActivity implements C0155e, C8113x.C8114a {
    private static final String DELEGATE_TAG = "androidx:appcompat";
    private C0156f mDelegate;
    private Resources mResources;

    /* renamed from: androidx.appcompat.app.AppCompatActivity$a */
    public class C0134a implements C3265b.C3267b {
        public C0134a() {
        }

        /* renamed from: a */
        public final Bundle mo1115a() {
            Bundle bundle = new Bundle();
            AppCompatActivity.this.getDelegate().mo1329r();
            return bundle;
        }
    }

    /* renamed from: androidx.appcompat.app.AppCompatActivity$b */
    public class C0135b implements C0003d {
        public C0135b() {
        }

        /* renamed from: a */
        public final void mo2a(Context context) {
            C0156f delegate = AppCompatActivity.this.getDelegate();
            delegate.mo1320k();
            AppCompatActivity.this.getSavedStateRegistry().mo12060a(AppCompatActivity.DELEGATE_TAG);
            delegate.mo1323n();
        }
    }

    public AppCompatActivity() {
        initDelegate();
    }

    private void initDelegate() {
        getSavedStateRegistry().mo12061b(DELEGATE_TAG, new C0134a());
        addOnContextAvailableListener(new C0135b());
    }

    private void initViewTreeOwners() {
        C15588c1.m25297O0(getWindow().getDecorView(), this);
        getWindow().getDecorView().setTag(R.id.view_tree_view_model_store_owner, this);
        ViewTreeSavedStateRegistryOwner.m7917b(getWindow().getDecorView(), this);
    }

    private boolean performMenuItemShortcut(KeyEvent keyEvent) {
        return false;
    }

    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        initViewTreeOwners();
        getDelegate().mo1312c(view, layoutParams);
    }

    public void attachBaseContext(Context context) {
        super.attachBaseContext(getDelegate().mo1314e(context));
    }

    public void closeOptionsMenu() {
        ActionBar supportActionBar = getSupportActionBar();
        if (!getWindow().hasFeature(0)) {
            return;
        }
        if (supportActionBar == null || !supportActionBar.mo1172a()) {
            super.closeOptionsMenu();
        }
    }

    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        int keyCode = keyEvent.getKeyCode();
        ActionBar supportActionBar = getSupportActionBar();
        if (keyCode != 82 || supportActionBar == null || !supportActionBar.mo1184m(keyEvent)) {
            return super.dispatchKeyEvent(keyEvent);
        }
        return true;
    }

    public <T extends View> T findViewById(int i) {
        return getDelegate().mo1315f(i);
    }

    public C0156f getDelegate() {
        if (this.mDelegate == null) {
            int i = C0156f.f386b;
            this.mDelegate = new AppCompatDelegateImpl(this, (Window) null, this, this);
        }
        return this.mDelegate;
    }

    public C0151a getDrawerToggleDelegate() {
        return getDelegate().mo1316g();
    }

    public MenuInflater getMenuInflater() {
        return getDelegate().mo1318i();
    }

    public Resources getResources() {
        if (this.mResources == null && VectorEnabledTintResources.shouldBeUsed()) {
            this.mResources = new VectorEnabledTintResources(this, super.getResources());
        }
        Resources resources = this.mResources;
        return resources == null ? super.getResources() : resources;
    }

    public ActionBar getSupportActionBar() {
        return getDelegate().mo1319j();
    }

    public Intent getSupportParentActivityIntent() {
        return C8090f.m16270a(this);
    }

    public void invalidateOptionsMenu() {
        getDelegate().mo1321l();
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        if (this.mResources != null) {
            this.mResources.updateConfiguration(configuration, super.getResources().getDisplayMetrics());
        }
        getDelegate().mo1322m(configuration);
    }

    public void onContentChanged() {
        onSupportContentChanged();
    }

    public void onCreateSupportNavigateUpTaskStack(C8113x xVar) {
        xVar.getClass();
        Intent supportParentActivityIntent = getSupportParentActivityIntent();
        if (supportParentActivityIntent == null) {
            supportParentActivityIntent = C8090f.m16270a(this);
        }
        if (supportParentActivityIntent != null) {
            ComponentName component = supportParentActivityIntent.getComponent();
            if (component == null) {
                component = supportParentActivityIntent.resolveActivity(xVar.f17712c.getPackageManager());
            }
            xVar.mo20705a(component);
            xVar.f17711b.add(supportParentActivityIntent);
        }
    }

    public void onDestroy() {
        super.onDestroy();
        getDelegate().mo1324o();
    }

    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (performMenuItemShortcut(keyEvent)) {
            return true;
        }
        return super.onKeyDown(i, keyEvent);
    }

    public final boolean onMenuItemSelected(int i, MenuItem menuItem) {
        if (super.onMenuItemSelected(i, menuItem)) {
            return true;
        }
        ActionBar supportActionBar = getSupportActionBar();
        if (menuItem.getItemId() != 16908332 || supportActionBar == null || (supportActionBar.mo1176e() & 4) == 0) {
            return false;
        }
        return onSupportNavigateUp();
    }

    public boolean onMenuOpened(int i, Menu menu) {
        return super.onMenuOpened(i, menu);
    }

    public void onNightModeChanged(int i) {
    }

    public void onPanelClosed(int i, Menu menu) {
        super.onPanelClosed(i, menu);
    }

    public void onPostCreate(Bundle bundle) {
        super.onPostCreate(bundle);
        getDelegate().mo1327p();
    }

    public void onPostResume() {
        super.onPostResume();
        getDelegate().mo1328q();
    }

    public void onPrepareSupportNavigateUpTaskStack(C8113x xVar) {
    }

    public void onStart() {
        super.onStart();
        getDelegate().mo1330s();
    }

    public void onStop() {
        super.onStop();
        getDelegate().mo1331t();
    }

    public void onSupportActionModeFinished(C0194a aVar) {
    }

    public void onSupportActionModeStarted(C0194a aVar) {
    }

    @Deprecated
    public void onSupportContentChanged() {
    }

    public boolean onSupportNavigateUp() {
        Intent supportParentActivityIntent = getSupportParentActivityIntent();
        if (supportParentActivityIntent == null) {
            return false;
        }
        if (supportShouldUpRecreateTask(supportParentActivityIntent)) {
            C8113x xVar = new C8113x(this);
            onCreateSupportNavigateUpTaskStack(xVar);
            onPrepareSupportNavigateUpTaskStack(xVar);
            xVar.mo20706c();
            try {
                int i = C8077a.f17593c;
                finishAffinity();
                return true;
            } catch (IllegalStateException unused) {
                finish();
                return true;
            }
        } else {
            supportNavigateUpTo(supportParentActivityIntent);
            return true;
        }
    }

    public void onTitleChanged(CharSequence charSequence, int i) {
        super.onTitleChanged(charSequence, i);
        getDelegate().mo1290C(charSequence);
    }

    public C0194a onWindowStartingSupportActionMode(C0194a.C0195a aVar) {
        return null;
    }

    public void openOptionsMenu() {
        ActionBar supportActionBar = getSupportActionBar();
        if (!getWindow().hasFeature(0)) {
            return;
        }
        if (supportActionBar == null || !supportActionBar.mo1185n()) {
            super.openOptionsMenu();
        }
    }

    public void setContentView(int i) {
        initViewTreeOwners();
        getDelegate().mo1333w(i);
    }

    public void setSupportActionBar(Toolbar toolbar) {
        getDelegate().mo1288A(toolbar);
    }

    @Deprecated
    public void setSupportProgress(int i) {
    }

    @Deprecated
    public void setSupportProgressBarIndeterminate(boolean z) {
    }

    @Deprecated
    public void setSupportProgressBarIndeterminateVisibility(boolean z) {
    }

    @Deprecated
    public void setSupportProgressBarVisibility(boolean z) {
    }

    public void setTheme(int i) {
        super.setTheme(i);
        getDelegate().mo1289B(i);
    }

    public C0194a startSupportActionMode(C0194a.C0195a aVar) {
        return getDelegate().mo1291D(aVar);
    }

    public void supportInvalidateOptionsMenu() {
        getDelegate().mo1321l();
    }

    public void supportNavigateUpTo(Intent intent) {
        navigateUpTo(intent);
    }

    public boolean supportRequestWindowFeature(int i) {
        return getDelegate().mo1332v(i);
    }

    public boolean supportShouldUpRecreateTask(Intent intent) {
        return shouldUpRecreateTask(intent);
    }

    public AppCompatActivity(int i) {
        super(i);
        initDelegate();
    }

    public void setContentView(View view) {
        initViewTreeOwners();
        getDelegate().mo1334x(view);
    }

    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        initViewTreeOwners();
        getDelegate().mo1335y(view, layoutParams);
    }
}
