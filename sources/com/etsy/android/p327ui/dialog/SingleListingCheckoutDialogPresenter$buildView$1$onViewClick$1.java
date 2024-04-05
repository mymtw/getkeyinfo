package com.etsy.android.p327ui.dialog;

import com.etsy.android.lib.logger.AnalyticsProperty;
import com.etsy.android.lib.logger.PredefinedAnalyticsProperty;
import com.etsy.android.lib.models.PaymentOption;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.C19383o;

/* renamed from: com.etsy.android.ui.dialog.SingleListingCheckoutDialogPresenter$buildView$1$onViewClick$1 */
public final class SingleListingCheckoutDialogPresenter$buildView$1$onViewClick$1 extends HashMap<AnalyticsProperty, Object> {
    public SingleListingCheckoutDialogPresenter$buildView$1$onViewClick$1(C9726b bVar) {
        put(PredefinedAnalyticsProperty.LISTING_ID, bVar.f21526f);
        PredefinedAnalyticsProperty predefinedAnalyticsProperty = PredefinedAnalyticsProperty.PAYMENT_METHOD;
        PaymentOption paymentOption = bVar.f21524d;
        C19383o.m32794d(paymentOption);
        put(predefinedAnalyticsProperty, paymentOption.getPaymentMethod());
    }

    public /* bridge */ boolean containsKey(AnalyticsProperty analyticsProperty) {
        return super.containsKey(analyticsProperty);
    }

    public final /* bridge */ Set<Map.Entry<AnalyticsProperty, Object>> entrySet() {
        return getEntries();
    }

    public /* bridge */ Object get(AnalyticsProperty analyticsProperty) {
        return super.get(analyticsProperty);
    }

    public /* bridge */ Set<Map.Entry<AnalyticsProperty, Object>> getEntries() {
        return super.entrySet();
    }

    public /* bridge */ Set<AnalyticsProperty> getKeys() {
        return super.keySet();
    }

    public /* bridge */ Object getOrDefault(AnalyticsProperty analyticsProperty, Object obj) {
        return super.getOrDefault(analyticsProperty, obj);
    }

    public /* bridge */ int getSize() {
        return super.size();
    }

    public /* bridge */ Collection<Object> getValues() {
        return super.values();
    }

    public final /* bridge */ Set<AnalyticsProperty> keySet() {
        return getKeys();
    }

    public /* bridge */ Object remove(AnalyticsProperty analyticsProperty) {
        return super.remove(analyticsProperty);
    }

    public final /* bridge */ int size() {
        return getSize();
    }

    public final /* bridge */ Collection<Object> values() {
        return getValues();
    }

    public final /* bridge */ boolean containsKey(Object obj) {
        if (!(obj instanceof AnalyticsProperty)) {
            return false;
        }
        return containsKey((AnalyticsProperty) obj);
    }

    public final /* bridge */ Object get(Object obj) {
        if (!(obj instanceof AnalyticsProperty)) {
            return null;
        }
        return get((AnalyticsProperty) obj);
    }

    public final /* bridge */ Object getOrDefault(Object obj, Object obj2) {
        return !(obj instanceof AnalyticsProperty) ? obj2 : getOrDefault((AnalyticsProperty) obj, obj2);
    }

    public final /* bridge */ Object remove(Object obj) {
        if (!(obj instanceof AnalyticsProperty)) {
            return null;
        }
        return remove((AnalyticsProperty) obj);
    }

    public /* bridge */ boolean remove(AnalyticsProperty analyticsProperty, Object obj) {
        return super.remove(analyticsProperty, obj);
    }

    public final /* bridge */ boolean remove(Object obj, Object obj2) {
        if (!(obj instanceof AnalyticsProperty)) {
            return false;
        }
        return remove((AnalyticsProperty) obj, obj2);
    }
}
