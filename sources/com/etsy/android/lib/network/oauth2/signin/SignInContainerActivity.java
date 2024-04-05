package com.etsy.android.lib.network.oauth2.signin;

import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.C2740a;
import androidx.fragment.app.FragmentManager;
import com.etsy.android.R;
import com.etsy.android.stylekit.accessibility.navigation.extensions.NavigationExtensionsKt;
import com.etsy.android.uikit.nav.TrackingBaseActivity;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.C19383o;
import p440s9.C13366a;

public final class SignInContainerActivity extends TrackingBaseActivity implements C13366a {
    public static final int $stable = 8;
    public Map<Integer, View> _$_findViewCache = new LinkedHashMap();

    private final void initFragment(Bundle bundle) {
        if (bundle == null) {
            OAuth2SignInFragment oAuth2SignInFragment = new OAuth2SignInFragment();
            oAuth2SignInFragment.setArguments(getIntent().getExtras());
            FragmentManager supportFragmentManager = getSupportFragmentManager();
            supportFragmentManager.getClass();
            C2740a aVar = new C2740a(supportFragmentManager);
            aVar.mo10485g(R.id.content_frame, oAuth2SignInFragment, (String) null, 1);
            aVar.mo10483d();
        }
    }

    public void _$_clearFindViewByIdCache() {
        this._$_findViewCache.clear();
    }

    public View _$_findCachedViewById(int i) {
        Map<Integer, View> map = this._$_findViewCache;
        View view = map.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        if (findViewById == null) {
            return null;
        }
        map.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) R.layout.activity_sign_in_container);
        initFragment(bundle);
        setTitle(R.string.sign_in_webview_title);
        setResult(0);
        View decorView = getWindow().getDecorView();
        C19383o.m32796f(decorView, "window.decorView");
        NavigationExtensionsKt.m17420a(decorView, 100);
    }
}
