package com.google.common.base;

import com.google.android.gms.common.api.Api;
import com.google.common.base.AbstractIterator;
import com.google.common.base.C15775a;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: com.google.common.base.p */
public final class C15798p {

    /* renamed from: a */
    public final C15775a f35577a;

    /* renamed from: b */
    public final C15800b f35578b;

    /* renamed from: c */
    public final int f35579c = Api.BaseClientBuilder.API_PRIORITY_OTHER;

    /* renamed from: com.google.common.base.p$a */
    public static abstract class C15799a extends AbstractIterator<String> {

        /* renamed from: d */
        public final CharSequence f35580d;

        /* renamed from: e */
        public final C15775a f35581e;

        /* renamed from: f */
        public final boolean f35582f;

        /* renamed from: g */
        public int f35583g = 0;

        /* renamed from: h */
        public int f35584h;

        public C15799a(C15798p pVar, CharSequence charSequence) {
            this.f35581e = pVar.f35577a;
            this.f35582f = false;
            this.f35584h = pVar.f35579c;
            this.f35580d = charSequence;
        }

        /* renamed from: a */
        public final Object mo55654a() {
            int i;
            int i2 = this.f35583g;
            while (true) {
                int i3 = this.f35583g;
                if (i3 != -1) {
                    C15796n nVar = (C15796n) this;
                    int b = nVar.f35575i.f35576a.mo55774b(i3, nVar.f35580d);
                    if (b == -1) {
                        b = this.f35580d.length();
                        this.f35583g = -1;
                    } else {
                        this.f35583g = b + 1;
                    }
                    int i4 = this.f35583g;
                    if (i4 == i2) {
                        int i5 = i4 + 1;
                        this.f35583g = i5;
                        if (i5 > this.f35580d.length()) {
                            this.f35583g = -1;
                        }
                    } else {
                        while (i2 < b && this.f35581e.mo55775c(this.f35580d.charAt(i2))) {
                            i2++;
                        }
                        while (i > i2) {
                            int i6 = i - 1;
                            if (!this.f35581e.mo55775c(this.f35580d.charAt(i6))) {
                                break;
                            }
                            b = i6;
                        }
                        if (!this.f35582f || i2 != i) {
                            int i7 = this.f35584h;
                        } else {
                            i2 = this.f35583g;
                        }
                    }
                } else {
                    this.f35540b = AbstractIterator.State.DONE;
                    return null;
                }
            }
            int i72 = this.f35584h;
            if (i72 == 1) {
                i = this.f35580d.length();
                this.f35583g = -1;
                while (i > i2) {
                    int i8 = i - 1;
                    if (!this.f35581e.mo55775c(this.f35580d.charAt(i8))) {
                        break;
                    }
                    i = i8;
                }
            } else {
                this.f35584h = i72 - 1;
            }
            return this.f35580d.subSequence(i2, i).toString();
        }
    }

    /* renamed from: com.google.common.base.p$b */
    public interface C15800b {
    }

    public C15798p(C15797o oVar) {
        C15775a.C15780e eVar = C15775a.C15780e.f35559c;
        this.f35578b = oVar;
        this.f35577a = eVar;
    }

    /* renamed from: a */
    public final List<String> mo55784a(CharSequence charSequence) {
        charSequence.getClass();
        C15797o oVar = (C15797o) this.f35578b;
        oVar.getClass();
        C15796n nVar = new C15796n(oVar, this, charSequence);
        ArrayList arrayList = new ArrayList();
        while (nVar.hasNext()) {
            arrayList.add(nVar.next());
        }
        return Collections.unmodifiableList(arrayList);
    }
}
