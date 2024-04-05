package com.paypal.checkout.order;

import android.content.Context;
import android.support.p013v4.media.C0073e;
import androidx.compose.animation.C0388a;
import com.paypal.checkout.createorder.OrderIntent;
import com.paypal.pyplcheckout.common.cache.Cache;
import com.paypal.pyplcheckout.common.instrumentation.PLog;
import com.paypal.pyplcheckout.model.DebugConfigManager;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.DefaultConstructorMarker;

public final class OrderContext {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */
    public static OrderContext orderContext;
    private final String TAG;
    private final String authorizeUrl;
    private final String captureUrl;
    private final String orderId;
    private final OrderIntent orderIntent;
    private final String patchUrl;

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ void create$default(Companion companion, String str, String str2, String str3, String str4, int i, Object obj) {
            if ((i & 2) != 0) {
                str2 = null;
            }
            if ((i & 4) != 0) {
                str3 = null;
            }
            if ((i & 8) != 0) {
                str4 = null;
            }
            companion.create(str, str2, str3, str4);
        }

        public final void clear() {
            OrderContext.orderContext = null;
            Context applicationContext = DebugConfigManager.getInstance().getApplicationContext();
            if (applicationContext != null) {
                Cache.clearCreateOrderContext(applicationContext);
            }
        }

        public final void create(String str, String str2, String str3, String str4) {
            C19383o.m32797g(str, "orderId");
            OrderContext.orderContext = new OrderContext(str, str2, str3, str4);
            Context applicationContext = DebugConfigManager.getInstance().getApplicationContext();
            if (applicationContext != null) {
                Cache.cacheCreateOrderContext(applicationContext, str2, str3, str4);
            }
        }

        public final OrderContext get() {
            OrderContext access$getOrderContext$cp = OrderContext.orderContext;
            if (access$getOrderContext$cp != null) {
                return access$getOrderContext$cp;
            }
            throw new OrderContextNotAvailableException();
        }
    }

    public OrderContext(String str, String str2, String str3, String str4) {
        OrderIntent orderIntent2;
        C19383o.m32797g(str, "orderId");
        this.orderId = str;
        this.captureUrl = str2;
        this.authorizeUrl = str3;
        this.patchUrl = str4;
        this.TAG = "OrderContext";
        if (str2 != null && str3 == null) {
            orderIntent2 = OrderIntent.CAPTURE;
        } else if (str3 == null || str2 != null) {
            PLog.m28728dR("OrderContext", "OrderContext is in an invalid state: " + this);
            orderIntent2 = null;
        } else {
            orderIntent2 = OrderIntent.AUTHORIZE;
        }
        this.orderIntent = orderIntent2;
    }

    public static /* synthetic */ OrderContext copy$default(OrderContext orderContext2, String str, String str2, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = orderContext2.orderId;
        }
        if ((i & 2) != 0) {
            str2 = orderContext2.captureUrl;
        }
        if ((i & 4) != 0) {
            str3 = orderContext2.authorizeUrl;
        }
        if ((i & 8) != 0) {
            str4 = orderContext2.patchUrl;
        }
        return orderContext2.copy(str, str2, str3, str4);
    }

    public static final void create(String str, String str2, String str3, String str4) {
        Companion.create(str, str2, str3, str4);
    }

    public final String component1() {
        return this.orderId;
    }

    public final String component2() {
        return this.captureUrl;
    }

    public final String component3() {
        return this.authorizeUrl;
    }

    public final String component4() {
        return this.patchUrl;
    }

    public final OrderContext copy(String str, String str2, String str3, String str4) {
        C19383o.m32797g(str, "orderId");
        return new OrderContext(str, str2, str3, str4);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OrderContext)) {
            return false;
        }
        OrderContext orderContext2 = (OrderContext) obj;
        return C19383o.m32792b(this.orderId, orderContext2.orderId) && C19383o.m32792b(this.captureUrl, orderContext2.captureUrl) && C19383o.m32792b(this.authorizeUrl, orderContext2.authorizeUrl) && C19383o.m32792b(this.patchUrl, orderContext2.patchUrl);
    }

    public final String getAuthorizeUrl() {
        return this.authorizeUrl;
    }

    public final String getCaptureUrl() {
        return this.captureUrl;
    }

    public final String getOrderId() {
        return this.orderId;
    }

    public final OrderIntent getOrderIntent() {
        return this.orderIntent;
    }

    public final String getPatchUrl() {
        return this.patchUrl;
    }

    public int hashCode() {
        int hashCode = this.orderId.hashCode() * 31;
        String str = this.captureUrl;
        int i = 0;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.authorizeUrl;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.patchUrl;
        if (str3 != null) {
            i = str3.hashCode();
        }
        return hashCode3 + i;
    }

    public String toString() {
        String str = this.orderId;
        String str2 = this.captureUrl;
        return C0073e.m210j(C0388a.m1050f("OrderContext(orderId=", str, ", captureUrl=", str2, ", authorizeUrl="), this.authorizeUrl, ", patchUrl=", this.patchUrl, ")");
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ OrderContext(String str, String str2, String str3, String str4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4);
    }
}
