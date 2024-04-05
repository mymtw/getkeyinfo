package com.etsy.android.push;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import androidx.lifecycle.C2857f;
import androidx.lifecycle.C2887s;
import com.etsy.android.lib.deeplinks.EtsyAction;
import com.etsy.android.p327ui.cart.CartBadgeCountRepo;
import p251u1.C8115a;

public class CartRefreshDelegate extends BroadcastReceiver implements C2857f {
    public static final String ARG_COUNT_CART = "count_cart";
    public static final String ARG_COUNT_SAVED = "count_saved";
    public static final String ARG_ORIGIN = "origin";
    public static final String ARG_USER_ACTION = "user_action";
    public static final int ORIGIN_CART = 1;
    public static final int ORIGIN_SAVED = 2;
    private final CartBadgeCountRepo cartBadgeCountRepo;
    private final Context context;
    private final C8937a listener;

    /* renamed from: com.etsy.android.push.CartRefreshDelegate$a */
    public interface C8937a {
        void onCartCountsUpdated(int i, int i2, boolean z, int i3);
    }

    public CartRefreshDelegate(Context context2, C8937a aVar, CartBadgeCountRepo cartBadgeCountRepo2) {
        this.context = context2;
        this.listener = aVar;
        this.cartBadgeCountRepo = cartBadgeCountRepo2;
    }

    public static void sendBroadcast(Context context2, int i, int i2, boolean z, int i3) {
        C8115a a = C8115a.m16322a(context2);
        Intent intent = new Intent();
        intent.setAction(EtsyAction.CART_COUNTS_UPDATED.getIntentAction());
        intent.putExtra(ARG_COUNT_CART, i);
        intent.putExtra(ARG_COUNT_SAVED, i2);
        intent.putExtra(ARG_USER_ACTION, z);
        intent.putExtra(ARG_ORIGIN, i3);
        a.mo20709c(intent);
    }

    public /* bridge */ /* synthetic */ void onCreate(C2887s sVar) {
    }

    public /* bridge */ /* synthetic */ void onDestroy(C2887s sVar) {
    }

    public void onPause() {
        C8115a.m16322a(this.context).mo20710d(this);
    }

    public void onReceive(Context context2, Intent intent) {
        if (intent.getAction().equals(EtsyAction.CART_COUNTS_UPDATED.getIntentAction()) && this.listener != null) {
            int intExtra = intent.getIntExtra(ARG_COUNT_CART, -1);
            this.cartBadgeCountRepo.mo31438c(intExtra);
            this.listener.onCartCountsUpdated(intExtra, intent.getIntExtra(ARG_COUNT_SAVED, -1), intent.getBooleanExtra(ARG_USER_ACTION, false), intent.getIntExtra(ARG_ORIGIN, -1));
        }
    }

    public void onResume() {
        C8115a.m16322a(this.context).mo20708b(this, new IntentFilter(EtsyAction.CART_COUNTS_UPDATED.getIntentAction()));
    }

    public /* bridge */ /* synthetic */ void onStart(C2887s sVar) {
    }

    public /* bridge */ /* synthetic */ void onStop(C2887s sVar) {
    }

    public void onPause(C2887s sVar) {
        onPause();
    }

    public void onResume(C2887s sVar) {
        onResume();
    }
}
