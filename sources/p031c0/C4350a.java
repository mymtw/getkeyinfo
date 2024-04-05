package p031c0;

import com.paypal.android.platform.authsdk.authcommon.analytics.EventsNameKt;

/* renamed from: c0.a */
public final class C4350a {

    /* renamed from: a */
    public final int f9578a;

    public /* synthetic */ C4350a(int i) {
        this.f9578a = i;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof C4350a) && this.f9578a == ((C4350a) obj).f9578a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f9578a);
    }

    public final String toString() {
        int i = this.f9578a;
        boolean z = false;
        if (i == 1) {
            return "Touch";
        }
        if (i == 2) {
            z = true;
        }
        return z ? "Keyboard" : EventsNameKt.GENERIC_ERROR_MESSAGE;
    }
}
