package p250u0;

import android.os.Bundle;

/* renamed from: u0.q */
public abstract class C8105q {

    /* renamed from: a */
    public C8100m f17692a;

    /* renamed from: b */
    public CharSequence f17693b;

    /* renamed from: c */
    public CharSequence f17694c;

    /* renamed from: d */
    public boolean f17695d = false;

    /* renamed from: a */
    public void mo20686a(Bundle bundle) {
        if (this.f17695d) {
            bundle.putCharSequence("android.summaryText", this.f17694c);
        }
        CharSequence charSequence = this.f17693b;
        if (charSequence != null) {
            bundle.putCharSequence("android.title.big", charSequence);
        }
        String c = mo20685c();
        if (c != null) {
            bundle.putString("androidx.core.app.extra.COMPAT_TEMPLATE", c);
        }
    }

    /* renamed from: b */
    public void mo20684b(C8106r rVar) {
    }

    /* renamed from: c */
    public String mo20685c() {
        return null;
    }

    /* renamed from: d */
    public void mo20697d() {
    }

    /* renamed from: e */
    public void mo20698e() {
    }

    /* renamed from: f */
    public void mo20699f() {
    }

    /* renamed from: g */
    public final void mo20702g(C8100m mVar) {
        if (this.f17692a != mVar) {
            this.f17692a = mVar;
            if (mVar != null) {
                mVar.mo20696j(this);
            }
        }
    }
}
