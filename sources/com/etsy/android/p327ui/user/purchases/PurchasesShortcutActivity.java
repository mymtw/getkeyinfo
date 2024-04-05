package com.etsy.android.p327ui.user.purchases;

import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.etsy.android.lib.config.C8618c;
import com.etsy.android.p327ui.navigation.keys.fragmentkeys.PurchasesKey;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.reflect.C19421p;
import p356ge.C12788a;
import p440s9.C13366a;

/* renamed from: com.etsy.android.ui.user.purchases.PurchasesShortcutActivity */
public final class PurchasesShortcutActivity extends FragmentActivity implements C13366a {
    public static final int $stable = 8;
    public Map<Integer, View> _$_findViewCache = new LinkedHashMap();
    public C8618c configMap;

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

    public final C8618c getConfigMap() {
        C8618c cVar = this.configMap;
        if (cVar != null) {
            return cVar;
        }
        C19383o.m32805o("configMap");
        throw null;
    }

    public void onStart() {
        super.onStart();
        C12788a.m20424c(this, C12788a.m20422a(this, new PurchasesKey(C19421p.m32935c0(this), (Bundle) null, true, 2, (DefaultConstructorMarker) null), getIntent()));
        finish();
    }

    public final void setConfigMap(C8618c cVar) {
        C19383o.m32797g(cVar, "<set-?>");
        this.configMap = cVar;
    }
}
