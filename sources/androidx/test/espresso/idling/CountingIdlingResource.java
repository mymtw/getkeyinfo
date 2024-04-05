package androidx.test.espresso.idling;

import android.text.TextUtils;
import java.util.concurrent.atomic.AtomicInteger;

public final class CountingIdlingResource {

    /* renamed from: a */
    public final String f7667a;

    /* renamed from: b */
    public final AtomicInteger f7668b = new AtomicInteger(0);

    public CountingIdlingResource() {
        if (!TextUtils.isEmpty("CheckoutIdlingResource")) {
            this.f7667a = "CheckoutIdlingResource";
            return;
        }
        throw new IllegalArgumentException("resourceName cannot be empty or null!");
    }
}
