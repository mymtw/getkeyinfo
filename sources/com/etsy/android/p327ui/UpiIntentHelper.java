package com.etsy.android.p327ui;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.support.p013v4.media.C0072d;
import androidx.compose.animation.C0391c;
import com.etsy.android.R;
import com.etsy.android.lib.currency.C8637h;
import com.etsy.android.lib.models.ResponseConstants;
import com.etsy.android.stylekit.views.C9056g;
import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import p486y9.C13888d;
import p672sk.C18519a;
import p753kq.C19846a;

/* renamed from: com.etsy.android.ui.UpiIntentHelper */
public final class UpiIntentHelper {

    /* renamed from: a */
    public final C13888d f19983a;

    /* renamed from: b */
    public final C8637h f19984b;

    /* renamed from: com.etsy.android.ui.UpiIntentHelper$UpiApp */
    public enum UpiApp {
        GOOGLE_PAY("google_pay", "Google Pay", "tez", "upi/pay"),
        PAYTM("paytm", "Paytm", "paytmmp", "upi/pay"),
        PHONE_PE("phonepe", "PhonePe", "phonepe", "pay");
        
        public static final C9088a Companion = null;
        private final String appName;

        /* renamed from: id */
        private final String f19985id;
        private final String intentPath;
        private final String uriScheme;

        /* renamed from: com.etsy.android.ui.UpiIntentHelper$UpiApp$a */
        public static final class C9088a {
        }

        /* access modifiers changed from: public */
        static {
            Companion = new C9088a();
        }

        private UpiApp(String str, String str2, String str3, String str4) {
            this.f19985id = str;
            this.appName = str2;
            this.uriScheme = str3;
            this.intentPath = str4;
        }

        public final String getAppName() {
            return this.appName;
        }

        public final String getId() {
            return this.f19985id;
        }

        public final String getIntentPath() {
            return this.intentPath;
        }

        public final Uri getIntentUri() {
            Uri parse = Uri.parse(this.uriScheme + "://" + this.intentPath);
            C19383o.m32796f(parse, "parse(\"$uriScheme://$intentPath\")");
            return parse;
        }

        public final String getUriScheme() {
            return this.uriScheme;
        }
    }

    /* renamed from: com.etsy.android.ui.UpiIntentHelper$a */
    public static final class C9089a {

        /* renamed from: a */
        public final String f19986a;

        /* renamed from: b */
        public final String f19987b = "upi_apps";

        public C9089a(String str) {
            this.f19986a = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C9089a) && C19383o.m32792b(this.f19986a, ((C9089a) obj).f19986a);
        }

        public final int hashCode() {
            return this.f19986a.hashCode();
        }

        public final String toString() {
            return C0391c.m1057c(C0072d.m201h("UpiIntentQueryParameter(value="), this.f19986a, ')');
        }
    }

    public UpiIntentHelper(C13888d dVar, C8637h hVar) {
        C19383o.m32797g(dVar, "currentLocale");
        C19383o.m32797g(hVar, "userCurrency");
        this.f19983a = dVar;
        this.f19984b = hVar;
    }

    /* renamed from: a */
    public final void mo31279a(Context context, Uri uri, C19846a<C19394m> aVar) {
        UpiApp upiApp;
        Object obj;
        C19383o.m32797g(context, ResponseConstants.CONTEXT);
        try {
            context.startActivity(new Intent("android.intent.action.VIEW", uri));
        } catch (ActivityNotFoundException unused) {
            UpiApp.Companion.getClass();
            UpiApp[] values = UpiApp.values();
            int length = values.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    upiApp = null;
                    break;
                }
                upiApp = values[i];
                String scheme = uri.getScheme();
                if (scheme != null && scheme.equals(upiApp.getUriScheme())) {
                    break;
                }
                i++;
            }
            if (upiApp == null || (obj = upiApp.getAppName()) == null) {
                obj = UpiApp.GOOGLE_PAY;
            }
            C18519a q = new C9056g(context).setTitle(context.getString(R.string.error_title_app_not_found, new Object[]{obj}));
            q.f286a.f264f = context.getString(R.string.error_body_app_not_found, new Object[]{obj});
            q.setPositiveButton(R.string.retry, new C9919h0(this, context, uri, aVar)).setNegativeButton(R.string.error_negative_action_app_not_found, new C10076i0(aVar, 0)).create().show();
        }
    }
}
