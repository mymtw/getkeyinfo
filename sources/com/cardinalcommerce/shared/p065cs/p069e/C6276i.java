package com.cardinalcommerce.shared.p065cs.p069e;

import android.support.p013v4.media.C0070b;
import java.io.Serializable;

/* renamed from: com.cardinalcommerce.shared.cs.e.i */
public class C6276i implements Serializable {

    /* renamed from: a */
    private boolean f13798a = true;

    /* renamed from: b */
    private String f13799b = "";

    /* renamed from: a */
    public void mo17802a(String str) {
        if (!this.f13799b.equals("")) {
            str = C0070b.m184f(new StringBuilder(), this.f13799b, ",", str);
        }
        this.f13799b = str;
    }

    /* renamed from: a */
    public void mo17803a(boolean z) {
        if (!z) {
            this.f13798a = false;
        }
    }

    /* renamed from: a */
    public void mo17804a(boolean z, String str) {
        if (!z) {
            mo17803a(false);
            mo17802a(str);
        }
    }

    /* renamed from: a */
    public boolean mo17805a() {
        return this.f13798a;
    }

    /* renamed from: b */
    public String mo17806b() {
        return this.f13799b;
    }
}
