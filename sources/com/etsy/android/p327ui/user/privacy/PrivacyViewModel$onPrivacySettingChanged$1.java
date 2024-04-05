package com.etsy.android.p327ui.user.privacy;

import android.support.p013v4.media.C0072d;
import com.etsy.android.lib.logger.LogCatKt;
import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import p340ea.C12673n;
import p753kq.C19857l;

/* renamed from: com.etsy.android.ui.user.privacy.PrivacyViewModel$onPrivacySettingChanged$1 */
final class PrivacyViewModel$onPrivacySettingChanged$1 extends Lambda implements C19857l<Throwable, C19394m> {
    public final /* synthetic */ String $key;
    public final /* synthetic */ boolean $value;
    public final /* synthetic */ C11622b this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PrivacyViewModel$onPrivacySettingChanged$1(C11622b bVar, String str, boolean z) {
        super(1);
        this.this$0 = bVar;
        this.$key = str;
        this.$value = z;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((Throwable) obj);
        return C19394m.f43287a;
    }

    public final void invoke(Throwable th) {
        C19383o.m32797g(th, "it");
        LogCatKt.m17045a().mo21306a("There was an error setting privacy state.");
        C12673n nVar = this.this$0.f25726d;
        StringBuilder h = C0072d.m201h("Error setting privacy: ");
        h.append(this.$key);
        h.append(", ");
        h.append(this.$value);
        nVar.mo45450b("android_privacy", h.toString());
    }
}
