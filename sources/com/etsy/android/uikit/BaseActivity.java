package com.etsy.android.uikit;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.app.AppCompatActivity;
import com.etsy.android.lib.util.C8914m;
import com.etsy.android.lib.util.C8924v;
import com.etsy.android.stylekit.views.CollageTabLayout;
import dagger.android.C17550a;
import dagger.android.DispatchingAndroidInjector;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Objects;
import kotlin.jvm.internal.C19383o;
import p250u0.C8077a;
import p319ca.C8560a;
import p319ca.C8562c;
import p357gf.C12792a;
import p388lb.C13009c;
import p643op.C18335a;

public abstract class BaseActivity extends AppCompatActivity implements C18335a, C12792a {
    public DispatchingAndroidInjector<Object> dispatchingAndroidInjector;
    public final C8560a localizationDelegate = new C8560a(this);
    private AppBarHelper mAppBarHelper;

    public CollageTabLayout addTabLayout() {
        CollageTabLayout addTabLayout = getAppBarHelper().addTabLayout();
        Objects.requireNonNull(addTabLayout);
        CollageTabLayout collageTabLayout = addTabLayout;
        return addTabLayout;
    }

    public void addViewBelowAppBar(int i, boolean z) {
        getAppBarHelper().addViewBelowAppBar(i, z);
    }

    public C17550a<Object> androidInjector() {
        return this.dispatchingAndroidInjector;
    }

    public void attachBaseContext(Context context) {
        this.localizationDelegate.getClass();
        C19383o.m32797g(context, "applicationContext");
        super.attachBaseContext(new C13009c(C8562c.m16970b(context)));
    }

    public AppBarHelper getAppBarHelper() {
        return this.mAppBarHelper;
    }

    public Context getApplicationContext() {
        C8560a aVar = this.localizationDelegate;
        Context applicationContext = super.getApplicationContext();
        aVar.getClass();
        C19383o.m32797g(applicationContext, "applicationContext");
        return C8562c.m16970b(applicationContext);
    }

    public Resources getResources() {
        C8560a aVar = this.localizationDelegate;
        Resources resources = super.getResources();
        aVar.getClass();
        C19383o.m32797g(resources, "resources");
        return C8562c.m16971c(aVar.f18642b, resources);
    }

    public CollageTabLayout getTabLayout() {
        return getAppBarHelper().getTabLayout();
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C8914m.m17348f(this);
        AppBarHelper appBarHelper = new AppBarHelper();
        this.mAppBarHelper = appBarHelper;
        appBarHelper.init(this);
    }

    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        C8077a.C8078a aVar;
        super.onRequestPermissionsResult(i, strArr, iArr);
        HashMap<Integer, WeakReference<C8077a.C8078a>> hashMap = C8924v.f19686a;
        SharedPreferences.Editor edit = getSharedPreferences("permissions_state", 0).edit();
        for (String str : strArr) {
            int i2 = C8077a.f17593c;
            edit.putBoolean(str, !shouldShowRequestPermissionRationale(str));
        }
        edit.apply();
        WeakReference weakReference = C8924v.f19686a.get(Integer.valueOf(i));
        if (!(weakReference == null || (aVar = (C8077a.C8078a) weakReference.get()) == null)) {
            aVar.onRequestPermissionsResult(i, strArr, iArr);
        }
        C8924v.f19686a.remove(Integer.valueOf(i));
    }

    public void removeTabLayout() {
        getAppBarHelper().removeTabLayout();
    }

    public void removeViewBelowAppBar(boolean z) {
        getAppBarHelper().removeViewBelowAppBar(z);
    }

    public void setContentView(int i) {
        super.setContentView(i);
        this.mAppBarHelper.init(this);
    }

    public void setTitle(CharSequence charSequence) {
        String charSequence2 = charSequence == null ? "" : charSequence.toString();
        super.setTitle(charSequence2);
        this.mAppBarHelper.setTitle((CharSequence) charSequence2);
    }

    public void setContentView(View view) {
        super.setContentView(view);
        this.mAppBarHelper.init(this);
    }

    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        super.setContentView(view, layoutParams);
        this.mAppBarHelper.init(this);
    }
}
