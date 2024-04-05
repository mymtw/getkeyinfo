package p368ic;

import android.widget.TextView;
import com.etsy.android.R;
import com.etsy.android.p327ui.core.listingpanel.SaleEndsSoonBadgePicker;
import com.google.android.exoplayer2.metadata.icy.IcyHeaders;
import java.util.concurrent.TimeUnit;
import kotlin.Pair;
import kotlin.jvm.internal.C19383o;
import org.apache.commons.lang3.StringUtils;

/* renamed from: ic.a */
public final class C12930a {

    /* renamed from: a */
    public final SaleEndsSoonBadgePicker f28494a;

    /* renamed from: ic.a$a */
    public /* synthetic */ class C12931a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f28495a;

        static {
            int[] iArr = new int[SaleEndsSoonBadgePicker.TextResult.values().length];
            iArr[SaleEndsSoonBadgePicker.TextResult.MINUTE.ordinal()] = 1;
            iArr[SaleEndsSoonBadgePicker.TextResult.MINUTES.ordinal()] = 2;
            iArr[SaleEndsSoonBadgePicker.TextResult.HOUR.ordinal()] = 3;
            iArr[SaleEndsSoonBadgePicker.TextResult.HOURS.ordinal()] = 4;
            f28495a = iArr;
        }
    }

    public C12930a(SaleEndsSoonBadgePicker saleEndsSoonBadgePicker) {
        this.f28494a = saleEndsSoonBadgePicker;
    }

    /* renamed from: a */
    public final void mo45704a(TextView textView, long j, boolean z) {
        String str;
        Pair pair;
        C19383o.m32797g(textView, "view");
        this.f28494a.getClass();
        int i = 0;
        Pair pair2 = new Pair(SaleEndsSoonBadgePicker.TextResult.NONE, 0);
        if (j > 0) {
            if (j < TimeUnit.MINUTES.toMillis(1)) {
                pair = new Pair(SaleEndsSoonBadgePicker.TextResult.MINUTE, 1);
            } else {
                TimeUnit timeUnit = TimeUnit.HOURS;
                if (j < timeUnit.toMillis(1)) {
                    pair2 = new Pair(SaleEndsSoonBadgePicker.TextResult.MINUTES, Integer.valueOf((int) TimeUnit.MILLISECONDS.toMinutes(j)));
                } else if (j < timeUnit.toMillis(2)) {
                    pair = new Pair(SaleEndsSoonBadgePicker.TextResult.HOUR, 1);
                } else {
                    pair2 = new Pair(SaleEndsSoonBadgePicker.TextResult.HOURS, Integer.valueOf((int) TimeUnit.MILLISECONDS.toHours(j)));
                }
            }
            pair2 = pair;
        }
        int i2 = C12931a.f28495a[((SaleEndsSoonBadgePicker.TextResult) pair2.getFirst()).ordinal()];
        if (i2 == 1) {
            str = textView.getResources().getQuantityString(R.plurals.listing_sale_ends_soon_badge_minutes, 1, new Object[]{IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE});
            C19383o.m32796f(str, "view.resources.getQuanti…minutes, 1, 1.toString())");
        } else if (i2 == 2) {
            str = textView.getResources().getQuantityString(R.plurals.listing_sale_ends_soon_badge_minutes, ((Number) pair2.getSecond()).intValue(), new Object[]{String.valueOf(((Number) pair2.getSecond()).intValue())});
            C19383o.m32796f(str, "view.resources.getQuanti…result.second.toString())");
        } else if (i2 == 3) {
            str = textView.getResources().getQuantityString(R.plurals.listing_sale_ends_soon_badge_hours, 1, new Object[]{IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE});
            C19383o.m32796f(str, "view.resources.getQuanti…e_hours, 1, 1.toString())");
        } else if (i2 != 4) {
            i = 8;
            str = "";
        } else {
            str = textView.getResources().getQuantityString(R.plurals.listing_sale_ends_soon_badge_hours, ((Number) pair2.getSecond()).intValue(), new Object[]{String.valueOf(((Number) pair2.getSecond()).intValue())});
            C19383o.m32796f(str, "view.resources.getQuanti…result.second.toString())");
        }
        textView.setVisibility(i);
        if (z) {
            str = StringUtils.upperCase(str);
        }
        textView.setText(str);
    }
}
