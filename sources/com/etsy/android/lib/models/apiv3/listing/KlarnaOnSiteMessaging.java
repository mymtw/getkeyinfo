package com.etsy.android.lib.models.apiv3.listing;

import android.support.p013v4.media.C0072d;
import com.etsy.android.lib.models.apiv3.cart.InfoModal;
import com.squareup.moshi.C17402n;
import com.squareup.moshi.C17403o;
import kotlin.jvm.internal.C19383o;

@C17403o(generateAdapter = true)
public final class KlarnaOnSiteMessaging {
    public static final int $stable = 8;
    private final InfoModal infoModal;
    private final String text;

    public KlarnaOnSiteMessaging(String str, @C17402n(name = "info_modal") InfoModal infoModal2) {
        C19383o.m32797g(str, "text");
        C19383o.m32797g(infoModal2, "infoModal");
        this.text = str;
        this.infoModal = infoModal2;
    }

    public static /* synthetic */ KlarnaOnSiteMessaging copy$default(KlarnaOnSiteMessaging klarnaOnSiteMessaging, String str, InfoModal infoModal2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = klarnaOnSiteMessaging.text;
        }
        if ((i & 2) != 0) {
            infoModal2 = klarnaOnSiteMessaging.infoModal;
        }
        return klarnaOnSiteMessaging.copy(str, infoModal2);
    }

    public final String component1() {
        return this.text;
    }

    public final InfoModal component2() {
        return this.infoModal;
    }

    public final KlarnaOnSiteMessaging copy(String str, @C17402n(name = "info_modal") InfoModal infoModal2) {
        C19383o.m32797g(str, "text");
        C19383o.m32797g(infoModal2, "infoModal");
        return new KlarnaOnSiteMessaging(str, infoModal2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof KlarnaOnSiteMessaging)) {
            return false;
        }
        KlarnaOnSiteMessaging klarnaOnSiteMessaging = (KlarnaOnSiteMessaging) obj;
        return C19383o.m32792b(this.text, klarnaOnSiteMessaging.text) && C19383o.m32792b(this.infoModal, klarnaOnSiteMessaging.infoModal);
    }

    public final InfoModal getInfoModal() {
        return this.infoModal;
    }

    public final String getText() {
        return this.text;
    }

    public int hashCode() {
        return this.infoModal.hashCode() + (this.text.hashCode() * 31);
    }

    public String toString() {
        StringBuilder h = C0072d.m201h("KlarnaOnSiteMessaging(text=");
        h.append(this.text);
        h.append(", infoModal=");
        h.append(this.infoModal);
        h.append(')');
        return h.toString();
    }
}
