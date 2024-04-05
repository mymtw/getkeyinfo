package p156k;

import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;

/* renamed from: k.e */
public final class C7168e {

    /* renamed from: a */
    public final Intent f15936a;

    /* renamed from: b */
    public final Bundle f15937b = null;

    /* renamed from: k.e$a */
    public static final class C7169a {

        /* renamed from: a */
        public final Intent f15938a = new Intent("android.intent.action.VIEW");

        /* renamed from: b */
        public final C7159a f15939b = new C7159a();

        /* renamed from: c */
        public boolean f15940c = true;

        /* renamed from: a */
        public final C7168e mo19458a() {
            if (!this.f15938a.hasExtra("android.support.customtabs.extra.SESSION")) {
                Bundle bundle = new Bundle();
                bundle.putBinder("android.support.customtabs.extra.SESSION", (IBinder) null);
                this.f15938a.putExtras(bundle);
            }
            this.f15938a.putExtra("android.support.customtabs.extra.EXTRA_ENABLE_INSTANT_APPS", this.f15940c);
            Intent intent = this.f15938a;
            Integer num = this.f15939b.f15925a;
            Bundle bundle2 = new Bundle();
            if (num != null) {
                bundle2.putInt("android.support.customtabs.extra.TOOLBAR_COLOR", num.intValue());
            }
            intent.putExtras(bundle2);
            this.f15938a.putExtra("androidx.browser.customtabs.extra.SHARE_STATE", 0);
            return new C7168e(this.f15938a);
        }
    }

    public C7168e(Intent intent) {
        this.f15936a = intent;
    }
}
