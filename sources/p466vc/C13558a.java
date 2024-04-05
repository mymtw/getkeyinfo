package p466vc;

import android.support.p013v4.media.C0070b;
import android.support.p013v4.media.C0072d;
import android.support.p013v4.media.C0073e;
import androidx.compose.animation.C0391c;
import kotlin.jvm.internal.C19383o;
import p003a2.C0015b;
import p321cc.C8569c;

/* renamed from: vc.a */
public abstract class C13558a implements C13572b {

    /* renamed from: vc.a$a */
    public static final class C13559a extends C13558a {

        /* renamed from: a */
        public final String f29644a;

        public C13559a(String str) {
            this.f29644a = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C13559a) && C19383o.m32792b(this.f29644a, ((C13559a) obj).f29644a);
        }

        public final int hashCode() {
            return this.f29644a.hashCode();
        }

        public final String toString() {
            return C0391c.m1057c(C0072d.m201h("AnalyticsGuid(guid="), this.f29644a, ')');
        }
    }

    /* renamed from: vc.a$b */
    public static final class C13560b extends C13558a {

        /* renamed from: a */
        public static final C13560b f29645a = new C13560b();
    }

    /* renamed from: vc.a$c */
    public static final class C13561c extends C13558a {

        /* renamed from: a */
        public final long f29646a;

        public C13561c(long j) {
            this.f29646a = j;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C13561c) && this.f29646a == ((C13561c) obj).f29646a;
        }

        public final int hashCode() {
            return Long.hashCode(this.f29646a);
        }

        public final String toString() {
            return C0015b.m91j(C0072d.m201h("ListingFetch(listingId="), this.f29646a, ')');
        }
    }

    /* renamed from: vc.a$d */
    public static final class C13562d extends C13558a {

        /* renamed from: a */
        public final long f29647a;

        /* renamed from: b */
        public final Throwable f29648b;

        public C13562d(long j, Throwable th) {
            this.f29647a = j;
            this.f29648b = th;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C13562d)) {
                return false;
            }
            C13562d dVar = (C13562d) obj;
            return this.f29647a == dVar.f29647a && C19383o.m32792b(this.f29648b, dVar.f29648b);
        }

        public final int hashCode() {
            int hashCode = Long.hashCode(this.f29647a) * 31;
            Throwable th = this.f29648b;
            return hashCode + (th == null ? 0 : th.hashCode());
        }

        public final String toString() {
            StringBuilder h = C0072d.m201h("ListingFetchError(listingId=");
            h.append(this.f29647a);
            h.append(", throwable=");
            return C0070b.m185h(h, this.f29648b, ')');
        }
    }

    /* renamed from: vc.a$e */
    public static final class C13563e extends C13558a {

        /* renamed from: a */
        public final long f29649a;

        /* renamed from: b */
        public final C8569c.C8570a f29650b;

        public C13563e(long j, C8569c.C8570a aVar) {
            C19383o.m32797g(aVar, "result");
            this.f29649a = j;
            this.f29650b = aVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C13563e)) {
                return false;
            }
            C13563e eVar = (C13563e) obj;
            return this.f29649a == eVar.f29649a && C19383o.m32792b(this.f29650b, eVar.f29650b);
        }

        public final int hashCode() {
            return this.f29650b.hashCode() + (Long.hashCode(this.f29649a) * 31);
        }

        public final String toString() {
            StringBuilder h = C0072d.m201h("ListingFetchResultReceived(listingId=");
            h.append(this.f29649a);
            h.append(", result=");
            h.append(this.f29650b);
            h.append(')');
            return h.toString();
        }
    }

    /* renamed from: vc.a$f */
    public static final class C13564f extends C13558a {

        /* renamed from: a */
        public final long f29651a;

        /* renamed from: b */
        public final C8569c.C8570a.C8572b f29652b;

        public C13564f(long j, C8569c.C8570a.C8572b bVar) {
            C19383o.m32797g(bVar, "result");
            this.f29651a = j;
            this.f29652b = bVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C13564f)) {
                return false;
            }
            C13564f fVar = (C13564f) obj;
            return this.f29651a == fVar.f29651a && C19383o.m32792b(this.f29652b, fVar.f29652b);
        }

        public final int hashCode() {
            return this.f29652b.hashCode() + (Long.hashCode(this.f29651a) * 31);
        }

        public final String toString() {
            StringBuilder h = C0072d.m201h("ListingFetchSuccess(listingId=");
            h.append(this.f29651a);
            h.append(", result=");
            h.append(this.f29652b);
            h.append(')');
            return h.toString();
        }
    }

    /* renamed from: vc.a$g */
    public static final class C13565g extends C13558a {

        /* renamed from: a */
        public final String f29653a;

        public C13565g(String str) {
            this.f29653a = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C13565g) && C19383o.m32792b(this.f29653a, ((C13565g) obj).f29653a);
        }

        public final int hashCode() {
            String str = this.f29653a;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public final String toString() {
            return C0391c.m1057c(C0072d.m201h("ListingFetchUnavailable(message="), this.f29653a, ')');
        }
    }

    /* renamed from: vc.a$h */
    public static final class C13566h extends C13558a {

        /* renamed from: a */
        public static final C13566h f29654a = new C13566h();
    }

    /* renamed from: vc.a$i */
    public static final class C13567i extends C13558a {

        /* renamed from: a */
        public final long f29655a;

        /* renamed from: b */
        public final Throwable f29656b;

        public C13567i(long j, Throwable th) {
            this.f29655a = j;
            this.f29656b = th;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C13567i)) {
                return false;
            }
            C13567i iVar = (C13567i) obj;
            return this.f29655a == iVar.f29655a && C19383o.m32792b(this.f29656b, iVar.f29656b);
        }

        public final int hashCode() {
            int hashCode = Long.hashCode(this.f29655a) * 31;
            Throwable th = this.f29656b;
            return hashCode + (th == null ? 0 : th.hashCode());
        }

        public final String toString() {
            StringBuilder h = C0072d.m201h("LogListingFetchError(listingId=");
            h.append(this.f29655a);
            h.append(", throwable=");
            return C0070b.m185h(h, this.f29656b, ')');
        }
    }

    /* renamed from: vc.a$k */
    public static final class C13569k extends C13558a {

        /* renamed from: a */
        public static final C13569k f29659a = new C13569k();
    }

    /* renamed from: vc.a$l */
    public static final class C13570l extends C13558a {

        /* renamed from: a */
        public final String f29660a;

        public C13570l(String str) {
            this.f29660a = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C13570l) && C19383o.m32792b(this.f29660a, ((C13570l) obj).f29660a);
        }

        public final int hashCode() {
            return this.f29660a.hashCode();
        }

        public final String toString() {
            return C0391c.m1057c(C0072d.m201h("Referrer(referrerString="), this.f29660a, ')');
        }
    }

    /* renamed from: vc.a$m */
    public static final class C13571m extends C13558a {

        /* renamed from: a */
        public final int f29661a;

        public C13571m(int i) {
            this.f29661a = i;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C13571m) && this.f29661a == ((C13571m) obj).f29661a;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f29661a);
        }

        public final String toString() {
            return C0073e.m208h(C0072d.m201h("StatusBarHeight(statusBarHeight="), this.f29661a, ')');
        }
    }

    /* renamed from: vc.a$j */
    public static final class C13568j extends C13558a {

        /* renamed from: a */
        public final boolean f29657a;

        /* renamed from: b */
        public final boolean f29658b;

        public C13568j(boolean z, boolean z2) {
            this.f29657a = z;
            this.f29658b = z2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C13568j)) {
                return false;
            }
            C13568j jVar = (C13568j) obj;
            return this.f29657a == jVar.f29657a && this.f29658b == jVar.f29658b;
        }

        public final int hashCode() {
            boolean z = this.f29657a;
            boolean z2 = true;
            if (z) {
                z = true;
            }
            int i = (z ? 1 : 0) * true;
            boolean z3 = this.f29658b;
            if (!z3) {
                z2 = z3;
            }
            return i + (z2 ? 1 : 0);
        }

        public final String toString() {
            StringBuilder h = C0072d.m201h("NavigationArguments(includeRelatedListings=");
            h.append(this.f29657a);
            h.append(", shouldShowAddToCartInterstitial=");
            return C0391c.m1058d(h, this.f29658b, ')');
        }

        public C13568j() {
            this(true, true);
        }
    }
}
