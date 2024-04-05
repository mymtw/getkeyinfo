package com.paypal.pyplcheckout.addshipping;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import android.text.SpannableStringBuilder;
import android.text.style.StyleSpan;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import com.etsy.android.lib.models.ResponseConstants;
import com.etsy.android.uikit.view.draggable.C11942a;
import com.fasterxml.jackson.databind.util.PrimitiveArrayBuilder;
import com.paypal.pyplcheckout.common.instrumentation.InstrumentationEvent;
import com.paypal.pyplcheckout.common.instrumentation.PEnums;
import com.paypal.pyplcheckout.common.instrumentation.PLog;
import com.paypal.pyplcheckout.utils.StringExtensionsKt;
import java.util.Locale;
import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import kotlin.text.C19457k;
import p753kq.C19846a;

public final class ShippingUtils {
    public static final ShippingUtils INSTANCE = new ShippingUtils();

    private ShippingUtils() {
    }

    public static /* synthetic */ void analyticsClick$default(ShippingUtils shippingUtils, PEnums.TransitionName transitionName, String str, String str2, int i, Object obj) {
        if ((i & 2) != 0) {
            str = "";
        }
        if ((i & 4) != 0) {
            str2 = "";
        }
        shippingUtils.analyticsClick(transitionName, str, str2);
    }

    public static /* synthetic */ void announceAccessibilityEvent$default(ShippingUtils shippingUtils, Context context, String str, View view, int i, Object obj) {
        if ((i & 4) != 0) {
            view = null;
        }
        shippingUtils.announceAccessibilityEvent(context, str, view);
    }

    private final Bitmap drawableToBitmap(Drawable drawable) {
        if (drawable instanceof BitmapDrawable) {
            BitmapDrawable bitmapDrawable = (BitmapDrawable) drawable;
            if (bitmapDrawable.getBitmap() != null) {
                return bitmapDrawable.getBitmap();
            }
        }
        Bitmap createBitmap = (drawable.getIntrinsicWidth() <= 0 || drawable.getIntrinsicHeight() <= 0) ? Bitmap.createBitmap(1, 1, Bitmap.Config.ARGB_8888) : Bitmap.createBitmap(drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight(), Bitmap.Config.ARGB_8888);
        Canvas canvas = createBitmap == null ? null : new Canvas(createBitmap);
        if (canvas != null) {
            drawable.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
        }
        if (canvas != null) {
            drawable.draw(canvas);
        }
        return createBitmap;
    }

    public static /* synthetic */ String getFlagCountry$default(ShippingUtils shippingUtils, Context context, String str, int i, Object obj) {
        if ((i & 2) != 0) {
            str = Locale.getDefault().getCountry();
        }
        return shippingUtils.getFlagCountry(context, str);
    }

    /* access modifiers changed from: private */
    /* renamed from: runOnUiThread$lambda-5  reason: not valid java name */
    public static final void m35198runOnUiThread$lambda5(C19846a aVar) {
        C19383o.m32797g(aVar, "$block");
        aVar.invoke();
    }

    public final void analyticsClick(PEnums.TransitionName transitionName, String str, String str2) {
        C19383o.m32797g(transitionName, "transition");
        C19383o.m32797g(str, "infoMessage");
        C19383o.m32797g(str2, "fieldName");
        PLog.click$default(transitionName, PEnums.Outcome.CLICKED, PEnums.EventCode.E624, PEnums.StateName.ADD_SHIPPING, str, (String) null, (String) null, str2, (InstrumentationEvent.InstrumentationEventBuilder) null, 352, (Object) null);
    }

    public final void announceAccessibilityEvent(Context context, String str, View view) {
        C19383o.m32797g(context, ResponseConstants.CONTEXT);
        C19383o.m32797g(str, "message");
        Object systemService = context.getSystemService("accessibility");
        if (systemService != null) {
            AccessibilityManager accessibilityManager = (AccessibilityManager) systemService;
            if (accessibilityManager.isEnabled()) {
                if (view != null) {
                    view.requestFocus();
                }
                AccessibilityEvent obtain = AccessibilityEvent.obtain(PrimitiveArrayBuilder.SMALL_CHUNK_SIZE);
                obtain.getText().add(str);
                accessibilityManager.sendAccessibilityEvent(obtain);
                return;
            }
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type android.view.accessibility.AccessibilityManager");
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x0020  */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0025  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0032  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0034  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0037  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x003c A[ADDED_TO_REGION] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String getFlagCountry(android.content.Context r5, java.lang.String r6) {
        /*
            r4 = this;
            java.lang.String r0 = "context"
            kotlin.jvm.internal.C19383o.m32797g(r5, r0)
            com.paypal.pyplcheckout.common.cache.Cache r0 = com.paypal.pyplcheckout.common.cache.Cache.INSTANCE
            java.lang.String r1 = r0.getMerchantCountry(r5)
            r2 = 1
            r3 = 0
            if (r1 != 0) goto L_0x0010
            goto L_0x001d
        L_0x0010:
            int r1 = r1.length()
            if (r1 <= 0) goto L_0x0018
            r1 = r2
            goto L_0x0019
        L_0x0018:
            r1 = r3
        L_0x0019:
            if (r1 != r2) goto L_0x001d
            r1 = r2
            goto L_0x001e
        L_0x001d:
            r1 = r3
        L_0x001e:
            if (r1 == 0) goto L_0x0025
            java.lang.String r5 = r0.getMerchantCountry(r5)
            goto L_0x0029
        L_0x0025:
            java.lang.String r5 = r0.getCountryId(r5)
        L_0x0029:
            if (r5 == 0) goto L_0x0034
            int r0 = r5.length()
            if (r0 != 0) goto L_0x0032
            goto L_0x0034
        L_0x0032:
            r0 = r3
            goto L_0x0035
        L_0x0034:
            r0 = r2
        L_0x0035:
            if (r0 != 0) goto L_0x003c
            java.lang.String r6 = com.paypal.pyplcheckout.utils.StringExtensionsKt.lowercase(r5)
            goto L_0x004b
        L_0x003c:
            if (r6 == 0) goto L_0x0046
            int r5 = r6.length()
            if (r5 != 0) goto L_0x0045
            goto L_0x0046
        L_0x0045:
            r2 = r3
        L_0x0046:
            if (r2 != 0) goto L_0x0049
            goto L_0x004b
        L_0x0049:
            java.lang.String r6 = "globe"
        L_0x004b:
            java.util.Locale r5 = java.util.Locale.ROOT
            java.lang.String r0 = "ROOT"
            java.lang.String r1 = "this as java.lang.String).toLowerCase(locale)"
            java.lang.String r5 = android.support.p013v4.media.session.C0087d.m237g(r5, r0, r6, r5, r1)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.paypal.pyplcheckout.addshipping.ShippingUtils.getFlagCountry(android.content.Context, java.lang.String):java.lang.String");
    }

    public final int getFlagDrawableId(Resources resources, String str, String str2) {
        C19383o.m32797g(resources, "resources");
        C19383o.m32797g(str, "country");
        C19383o.m32797g(str2, "packageName");
        String lowercase = StringExtensionsKt.lowercase(str);
        return resources.getIdentifier("flag_" + lowercase, "drawable", str2);
    }

    public final int getMaxItemsFromDensityValue(Context context) {
        C19383o.m32797g(context, "<this>");
        int i = context.getResources().getDisplayMetrics().heightPixels;
        boolean z = true;
        if (i >= 0 && i < 1901) {
            return 2;
        }
        if (1900 > i || i >= 2501) {
            z = false;
        }
        return z ? 3 : 4;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000e, code lost:
        r1 = INSTANCE.drawableToBitmap(r6);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final androidx.core.graphics.drawable.RoundedBitmapDrawable getRoundedDrawable(android.content.Context r5, int r6) {
        /*
            r4 = this;
            java.lang.String r0 = "context"
            kotlin.jvm.internal.C19383o.m32797g(r5, r0)
            android.graphics.drawable.Drawable r6 = r5.getDrawable(r6)
            r0 = 0
            if (r6 != 0) goto L_0x000e
        L_0x000c:
            r6 = r0
            goto L_0x0024
        L_0x000e:
            com.paypal.pyplcheckout.addshipping.ShippingUtils r1 = INSTANCE
            android.graphics.Bitmap r1 = r1.drawableToBitmap(r6)
            if (r1 != 0) goto L_0x0017
            goto L_0x000c
        L_0x0017:
            int r2 = r6.getIntrinsicWidth()
            int r6 = r6.getIntrinsicHeight()
            r3 = 0
            android.graphics.Bitmap r6 = android.graphics.Bitmap.createScaledBitmap(r1, r2, r6, r3)
        L_0x0024:
            android.content.res.Resources r5 = r5.getResources()
            z0.b r1 = new z0.b
            r1.<init>(r5, r6)
            if (r6 != 0) goto L_0x0030
            goto L_0x003d
        L_0x0030:
            int r5 = r6.getWidth()
            float r5 = (float) r5
            r6 = 1036831949(0x3dcccccd, float:0.1)
            float r5 = r5 * r6
            java.lang.Float r0 = java.lang.Float.valueOf(r5)
        L_0x003d:
            if (r0 == 0) goto L_0x0046
            float r5 = r0.floatValue()
            r1.setCornerRadius(r5)
        L_0x0046:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.paypal.pyplcheckout.addshipping.ShippingUtils.getRoundedDrawable(android.content.Context, int):androidx.core.graphics.drawable.RoundedBitmapDrawable");
    }

    public final String getStringResource(Context context, String str) {
        C19383o.m32797g(context, ResponseConstants.CONTEXT);
        return !(str == null || C19457k.m33020X0(str)) ? context.getString(context.getResources().getIdentifier(str, "string", context.getPackageName())) : "";
    }

    public final SpannableStringBuilder handleBoldText(String str, String str2) {
        C19383o.m32797g(str2, "fullText");
        if (str == null || str.length() >= str2.length()) {
            return null;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        StyleSpan styleSpan = new StyleSpan(1);
        int length = spannableStringBuilder.length();
        String substring = str2.substring(0, str.length());
        C19383o.m32796f(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        spannableStringBuilder.append(substring);
        spannableStringBuilder.setSpan(styleSpan, length, spannableStringBuilder.length(), 17);
        String substring2 = str2.substring(str.length(), str2.length());
        C19383o.m32796f(substring2, "this as java.lang.String…ing(startIndex, endIndex)");
        return spannableStringBuilder.append(substring2);
    }

    public final void runOnUiThread(C19846a<C19394m> aVar) {
        C19383o.m32797g(aVar, "block");
        new Handler(Looper.getMainLooper()).post(new C11942a(aVar, 3));
    }
}
