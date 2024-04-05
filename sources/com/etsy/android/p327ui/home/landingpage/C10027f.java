package com.etsy.android.p327ui.home.landingpage;

import android.support.p013v4.media.C0072d;
import com.etsy.android.lib.models.cardviewelement.Page;
import kotlin.jvm.internal.C19383o;
import p003a2.C0023f;

/* renamed from: com.etsy.android.ui.home.landingpage.f */
public abstract class C10027f {

    /* renamed from: com.etsy.android.ui.home.landingpage.f$a */
    public static final class C10028a extends C10027f {

        /* renamed from: a */
        public static final C10028a f22078a = new C10028a();
    }

    /* renamed from: com.etsy.android.ui.home.landingpage.f$b */
    public static final class C10029b extends C10027f {

        /* renamed from: a */
        public static final C10029b f22079a = new C10029b();
    }

    /* renamed from: com.etsy.android.ui.home.landingpage.f$d */
    public static final class C10031d extends C10027f {

        /* renamed from: a */
        public static final C10031d f22081a = new C10031d();
    }

    /* renamed from: com.etsy.android.ui.home.landingpage.f$e */
    public static final class C10032e extends C10027f {

        /* renamed from: a */
        public static final C10032e f22082a = new C10032e();
    }

    /* renamed from: com.etsy.android.ui.home.landingpage.f$c */
    public static final class C10030c extends C10027f {

        /* renamed from: a */
        public final Page f22080a;

        public C10030c(Page page) {
            this.f22080a = page;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C10030c) && C19383o.m32792b(this.f22080a, ((C10030c) obj).f22080a);
        }

        public final int hashCode() {
            Page page = this.f22080a;
            if (page == null) {
                return 0;
            }
            return page.hashCode();
        }

        public final String toString() {
            StringBuilder h = C0072d.m201h("PageLoaded(page=");
            h.append(this.f22080a);
            h.append(')');
            return h.toString();
        }

        public C10030c() {
            this((Page) null);
        }

        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public C10030c(java.util.List<? extends com.etsy.android.lib.models.BaseModel> r5) {
            /*
                r4 = this;
                java.lang.String r0 = "pageItems"
                kotlin.jvm.internal.C19383o.m32797g(r5, r0)
                com.etsy.android.lib.models.cardviewelement.Page r0 = new com.etsy.android.lib.models.cardviewelement.Page
                r0.<init>()
                java.util.List r1 = r0.getListSections()
                com.etsy.android.lib.models.cardviewelement.ListSection r2 = new com.etsy.android.lib.models.cardviewelement.ListSection
                r2.<init>()
                java.util.List r3 = r2.getItems()
                r3.addAll(r5)
                r1.add(r2)
                r4.<init>((com.etsy.android.lib.models.cardviewelement.Page) r0)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.etsy.android.p327ui.home.landingpage.C10027f.C10030c.<init>(java.util.List):void");
        }
    }

    /* renamed from: com.etsy.android.ui.home.landingpage.f$f */
    public static final class C10033f extends C10027f {

        /* renamed from: a */
        public final String f22083a;

        /* renamed from: b */
        public final Integer f22084b;

        public C10033f(String str, Integer num) {
            this.f22083a = str;
            this.f22084b = num;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C10033f)) {
                return false;
            }
            C10033f fVar = (C10033f) obj;
            return C19383o.m32792b(this.f22083a, fVar.f22083a) && C19383o.m32792b(this.f22084b, fVar.f22084b);
        }

        public final int hashCode() {
            String str = this.f22083a;
            int i = 0;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            Integer num = this.f22084b;
            if (num != null) {
                i = num.hashCode();
            }
            return hashCode + i;
        }

        public final String toString() {
            StringBuilder h = C0072d.m201h("UpdatePagination(nextLink=");
            h.append(this.f22083a);
            h.append(", maxResultCount=");
            return C0023f.m109j(h, this.f22084b, ')');
        }

        public C10033f() {
            this((String) null, (Integer) null);
        }
    }
}
