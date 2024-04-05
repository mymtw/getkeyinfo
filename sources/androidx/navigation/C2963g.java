package androidx.navigation;

import android.content.Intent;
import android.net.Uri;
import android.support.p013v4.media.C0073e;

/* renamed from: androidx.navigation.g */
public final class C2963g {

    /* renamed from: a */
    public final Uri f6723a;

    /* renamed from: b */
    public final String f6724b;

    /* renamed from: c */
    public final String f6725c;

    public C2963g(Intent intent) {
        Uri data = intent.getData();
        String action = intent.getAction();
        String type = intent.getType();
        this.f6723a = data;
        this.f6724b = action;
        this.f6725c = type;
    }

    public final String toString() {
        StringBuilder k = C0073e.m211k("NavDeepLinkRequest", "{");
        if (this.f6723a != null) {
            k.append(" uri=");
            k.append(this.f6723a.toString());
        }
        if (this.f6724b != null) {
            k.append(" action=");
            k.append(this.f6724b);
        }
        if (this.f6725c != null) {
            k.append(" mimetype=");
            k.append(this.f6725c);
        }
        k.append(" }");
        return k.toString();
    }
}
