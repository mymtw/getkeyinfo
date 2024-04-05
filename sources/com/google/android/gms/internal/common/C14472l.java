package com.google.android.gms.internal.common;

import androidx.preference.C3039b;
import com.google.android.gms.common.api.Api;
import java.util.Iterator;
import java.util.NoSuchElementException;
import p568fn.C17782b;

/* renamed from: com.google.android.gms.internal.common.l */
public abstract class C14472l implements Iterator<String> {

    /* renamed from: b */
    public String f32602b;

    /* renamed from: c */
    public int f32603c = 2;

    /* renamed from: d */
    public final CharSequence f32604d;

    /* renamed from: e */
    public final boolean f32605e;

    /* renamed from: f */
    public int f32606f = 0;

    /* renamed from: g */
    public int f32607g;

    public C14472l(C14473m mVar, CharSequence charSequence) {
        C3039b bVar = mVar.f32608a;
        this.f32605e = mVar.f32609b;
        this.f32607g = Api.BaseClientBuilder.API_PRIORITY_OTHER;
        this.f32604d = charSequence;
    }

    /* renamed from: a */
    public final boolean hasNext() {
        int i;
        int i2;
        int i3 = this.f32603c;
        if (i3 != 4) {
            int i4 = i3 - 1;
            String str = null;
            if (i3 == 0) {
                throw null;
            } else if (i4 == 0) {
                return true;
            } else {
                if (i4 != 2) {
                    this.f32603c = 4;
                    int i5 = this.f32606f;
                    while (true) {
                        i = this.f32606f;
                        if (i == -1) {
                            this.f32603c = 3;
                            break;
                        }
                        C14471k kVar = (C14471k) this;
                        C3039b bVar = (C3039b) kVar.f32601h.f4420b;
                        CharSequence charSequence = kVar.f32604d;
                        int length = charSequence.length();
                        C17782b.m29835C0(i, length);
                        while (true) {
                            if (i < length) {
                                if (bVar.mo11187t0(charSequence.charAt(i))) {
                                    break;
                                }
                                i++;
                            } else {
                                i = -1;
                                break;
                            }
                        }
                        if (i == -1) {
                            i = this.f32604d.length();
                            this.f32606f = -1;
                            i2 = -1;
                        } else {
                            i2 = i + 1;
                            this.f32606f = i2;
                        }
                        if (i2 == i5) {
                            int i6 = i2 + 1;
                            this.f32606f = i6;
                            if (i6 > this.f32604d.length()) {
                                this.f32606f = -1;
                            }
                        } else {
                            if (i5 < i) {
                                this.f32604d.charAt(i5);
                            }
                            if (i5 < i) {
                                this.f32604d.charAt(i - 1);
                            }
                            if (!this.f32605e || i5 != i) {
                                int i7 = this.f32607g;
                            } else {
                                i5 = this.f32606f;
                            }
                        }
                    }
                    int i72 = this.f32607g;
                    if (i72 == 1) {
                        i = this.f32604d.length();
                        this.f32606f = -1;
                        if (i > i5) {
                            this.f32604d.charAt(i - 1);
                        }
                    } else {
                        this.f32607g = i72 - 1;
                    }
                    str = this.f32604d.subSequence(i5, i).toString();
                    this.f32602b = str;
                    if (this.f32603c != 3) {
                        this.f32603c = 1;
                        return true;
                    }
                }
                return false;
            }
        } else {
            throw new IllegalStateException();
        }
    }

    /* renamed from: b */
    public final String next() {
        if (hasNext()) {
            this.f32603c = 2;
            String str = this.f32602b;
            this.f32602b = null;
            return str;
        }
        throw new NoSuchElementException();
    }

    /* renamed from: c */
    public final void mo49681c() {
        throw new UnsupportedOperationException();
    }

    public final /* bridge */ /* synthetic */ void remove() {
        mo49681c();
        throw null;
    }
}
