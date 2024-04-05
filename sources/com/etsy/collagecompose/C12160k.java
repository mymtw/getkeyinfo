package com.etsy.collagecompose;

import android.support.p013v4.media.C0072d;
import androidx.compose.p015ui.text.C2023s;
import kotlin.jvm.internal.C19383o;

/* renamed from: com.etsy.collagecompose.k */
public final class C12160k {

    /* renamed from: a */
    public final C2023s f27195a;

    /* renamed from: b */
    public final C2023s f27196b;

    /* renamed from: c */
    public final C2023s f27197c;

    /* renamed from: d */
    public final C2023s f27198d;

    /* renamed from: e */
    public final C2023s f27199e;

    /* renamed from: f */
    public final C2023s f27200f;

    public C12160k(C2023s sVar, C2023s sVar2, C2023s sVar3, C2023s sVar4, C2023s sVar5, C2023s sVar6) {
        C19383o.m32797g(sVar, "clg_text_heading");
        C19383o.m32797g(sVar2, "clg_text_title_large");
        C19383o.m32797g(sVar3, "clg_text_title");
        C19383o.m32797g(sVar4, "clg_text_title_small");
        C19383o.m32797g(sVar5, "clg_text_body");
        C19383o.m32797g(sVar6, "clg_text_body_small");
        this.f27195a = sVar;
        this.f27196b = sVar2;
        this.f27197c = sVar3;
        this.f27198d = sVar4;
        this.f27199e = sVar5;
        this.f27200f = sVar6;
    }

    /* renamed from: a */
    public final C2023s mo39066a() {
        return this.f27200f;
    }

    /* renamed from: b */
    public final C2023s mo39067b() {
        return this.f27197c;
    }

    /* renamed from: c */
    public final C2023s mo39068c() {
        return this.f27198d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C12160k)) {
            return false;
        }
        C12160k kVar = (C12160k) obj;
        return C19383o.m32792b(this.f27195a, kVar.f27195a) && C19383o.m32792b(this.f27196b, kVar.f27196b) && C19383o.m32792b(this.f27197c, kVar.f27197c) && C19383o.m32792b(this.f27198d, kVar.f27198d) && C19383o.m32792b(this.f27199e, kVar.f27199e) && C19383o.m32792b(this.f27200f, kVar.f27200f);
    }

    public final int hashCode() {
        int hashCode = this.f27196b.hashCode();
        int hashCode2 = this.f27197c.hashCode();
        int hashCode3 = this.f27198d.hashCode();
        int hashCode4 = this.f27199e.hashCode();
        return this.f27200f.hashCode() + ((hashCode4 + ((hashCode3 + ((hashCode2 + ((hashCode + (this.f27195a.hashCode() * 31)) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder h = C0072d.m201h("CollageTypography(clg_text_heading=");
        h.append(this.f27195a);
        h.append(", clg_text_title_large=");
        h.append(this.f27196b);
        h.append(", clg_text_title=");
        h.append(this.f27197c);
        h.append(", clg_text_title_small=");
        h.append(this.f27198d);
        h.append(", clg_text_body=");
        h.append(this.f27199e);
        h.append(", clg_text_body_small=");
        h.append(this.f27200f);
        h.append(')');
        return h.toString();
    }
}
