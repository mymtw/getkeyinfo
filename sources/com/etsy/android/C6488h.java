package com.etsy.android;

import android.app.Application;
import android.content.Intent;
import android.content.pm.ShortcutInfo;
import android.content.pm.ShortcutManager;
import android.graphics.drawable.Icon;
import com.etsy.android.lib.logger.C8694h;
import com.etsy.android.p327ui.cart.CartShortcutActivity;
import com.etsy.android.p327ui.favorites.FavoritesShortcutActivity;
import com.etsy.android.p327ui.search.p330v2.interstitial.SearchInterstitialActivity;
import com.etsy.android.p327ui.user.purchases.PurchasesShortcutActivity;
import java.util.ArrayList;
import java.util.Arrays;
import p287xp.C8333a;

/* renamed from: com.etsy.android.h */
public final /* synthetic */ class C6488h implements C8333a {

    /* renamed from: a */
    public final /* synthetic */ Application f14391a;

    /* renamed from: b */
    public final /* synthetic */ boolean f14392b;

    public /* synthetic */ C6488h(Application application, boolean z) {
        this.f14391a = application;
        this.f14392b = z;
    }

    public final void run() {
        Application application = this.f14391a;
        boolean z = this.f14392b;
        ShortcutManager shortcutManager = (ShortcutManager) application.getSystemService(ShortcutManager.class);
        try {
            shortcutManager.removeAllDynamicShortcuts();
            ArrayList arrayList = new ArrayList();
            if (z) {
                Intent intent = new Intent("android.intent.action.VIEW");
                intent.setClass(application, PurchasesShortcutActivity.class);
                String string = application.getResources().getString(R.string.nav_purchases);
                arrayList.add(new ShortcutInfo.Builder(application, "shortcut_purchases").setShortLabel(string).setLongLabel(string).setIcon(Icon.createWithResource(application, R.drawable.ic_shortcut_purchases)).setIntent(intent).build());
                Intent intent2 = new Intent("android.intent.action.VIEW");
                intent2.setClass(application, FavoritesShortcutActivity.class);
                String string2 = application.getResources().getString(R.string.nav_favorites);
                arrayList.add(new ShortcutInfo.Builder(application, "shortcut_fav").setShortLabel(string2).setLongLabel(string2).setIcon(Icon.createWithResource(application, R.drawable.ic_shortcut_favorites)).setIntent(intent2).build());
            } else {
                shortcutManager.disableShortcuts(Arrays.asList(new String[]{"shortcut_fav", "shortcut_purchases"}), application.getString(R.string.error_shortcut_sign_in));
            }
            Intent intent3 = new Intent("android.intent.action.VIEW");
            intent3.setClass(application, CartShortcutActivity.class);
            String string3 = application.getResources().getString(R.string.menu_cart);
            arrayList.add(new ShortcutInfo.Builder(application, "shortcut_cart").setShortLabel(string3).setLongLabel(string3).setIcon(Icon.createWithResource(application, R.drawable.ic_shortcut_cart)).setIntent(intent3).build());
            Intent intent4 = new Intent("android.intent.action.VIEW");
            intent4.setClass(application, SearchInterstitialActivity.class);
            String string4 = application.getResources().getString(R.string.menu_search);
            arrayList.add(new ShortcutInfo.Builder(application, "shortcut_search").setShortLabel(string4).setLongLabel(string4).setIcon(Icon.createWithResource(application, R.drawable.ic_shortcut_search)).setIntent(intent4).build());
            shortcutManager.setDynamicShortcuts(arrayList);
        } catch (SecurityException e) {
            C8694h.f19097a.error(e);
        }
    }
}
