package com.etsy.android.p327ui.cart;

import android.os.CountDownTimer;
import android.widget.TextView;
import androidx.compose.animation.C0388a;
import com.etsy.android.lib.models.apiv3.cart.Promotion;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.C19383o;

/* renamed from: com.etsy.android.ui.cart.PromotionCountdownTimer */
public final class PromotionCountdownTimer extends CountDownTimer {
    public static final int $stable = 8;
    private final Promotion promotion;
    private final WeakReference<TextView> promotionTextViewReference;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PromotionCountdownTimer(WeakReference<TextView> weakReference, Promotion promotion2, long j, long j2) {
        super(j, j2);
        C19383o.m32797g(weakReference, "promotionTextViewReference");
        C19383o.m32797g(promotion2, "promotion");
        this.promotionTextViewReference = weakReference;
        this.promotion = promotion2;
    }

    public final String formatSecondsAsString(long j) {
        long j2 = j / ((long) 1000);
        TimeUnit timeUnit = TimeUnit.SECONDS;
        long hours = timeUnit.toHours(j2);
        long minutes = timeUnit.toMinutes(j2);
        return C0388a.m1049e(new Object[]{Long.valueOf(hours), Long.valueOf(minutes - TimeUnit.HOURS.toMinutes(hours)), Long.valueOf(j2 - TimeUnit.MINUTES.toSeconds(minutes))}, 3, "%02d:%02d:%02d", "format(format, *args)");
    }

    public void onFinish() {
        TextView textView = this.promotionTextViewReference.get();
        if (textView != null) {
            String description = this.promotion.getDescription();
            C19383o.m32796f(description, "promotion.description");
            String format = String.format(description, Arrays.copyOf(new Object[]{formatSecondsAsString(0)}, 1));
            C19383o.m32796f(format, "format(format, *args)");
            textView.setText(format);
        }
    }

    public void onTick(long j) {
        this.promotion.setSecondsUntilEnd(Integer.valueOf(((int) j) / 1000));
        TextView textView = this.promotionTextViewReference.get();
        if (textView != null) {
            String description = this.promotion.getDescription();
            C19383o.m32796f(description, "promotion.description");
            String format = String.format(description, Arrays.copyOf(new Object[]{formatSecondsAsString(j)}, 1));
            C19383o.m32796f(format, "format(format, *args)");
            textView.setText(format);
        }
    }
}
