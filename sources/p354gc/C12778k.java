package p354gc;

import android.support.p013v4.media.C0070b;
import android.support.p013v4.media.C0072d;
import androidx.compose.animation.C0391c;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.C19383o;
import p003a2.C0015b;
import p504ai.C13983i;

/* renamed from: gc.k */
public abstract class C12778k {

    /* renamed from: a */
    public final long f28234a;

    /* renamed from: gc.k$a */
    public static final class C12779a extends C12778k {

        /* renamed from: b */
        public final C12767e f28235b;

        /* renamed from: c */
        public final List<C12774h> f28236c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C12779a(C12767e eVar, List<C12774h> list) {
            super(eVar.mo45523a().f28246c);
            C19383o.m32797g(eVar, "groupedMessageItem");
            C19383o.m32797g(list, "images");
            this.f28235b = eVar;
            this.f28236c = list;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C12779a)) {
                return false;
            }
            C12779a aVar = (C12779a) obj;
            return C19383o.m32792b(this.f28235b, aVar.f28235b) && C19383o.m32792b(this.f28236c, aVar.f28236c);
        }

        public final int hashCode() {
            return this.f28236c.hashCode() + (this.f28235b.hashCode() * 31);
        }

        public final String toString() {
            StringBuilder h = C0072d.m201h("CurrentUserMessage(groupedMessageItem=");
            h.append(this.f28235b);
            h.append(", images=");
            return C0070b.m186i(h, this.f28236c, ')');
        }
    }

    /* renamed from: gc.k$b */
    public static final class C12780b extends C12778k {

        /* renamed from: b */
        public final C12767e f28237b;

        /* renamed from: c */
        public final String f28238c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C12780b(C12767e eVar, String str) {
            super(eVar.mo45523a().f28246c);
            C19383o.m32797g(eVar, "groupedMessageItem");
            this.f28237b = eVar;
            this.f28238c = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C12780b)) {
                return false;
            }
            C12780b bVar = (C12780b) obj;
            return C19383o.m32792b(this.f28237b, bVar.f28237b) && C19383o.m32792b(this.f28238c, bVar.f28238c);
        }

        public final int hashCode() {
            int hashCode = this.f28237b.hashCode() * 31;
            String str = this.f28238c;
            return hashCode + (str == null ? 0 : str.hashCode());
        }

        public final String toString() {
            StringBuilder h = C0072d.m201h("HelpWithOrderMessage(groupedMessageItem=");
            h.append(this.f28237b);
            h.append(", requestUrl=");
            return C0391c.m1057c(h, this.f28238c, ')');
        }
    }

    /* renamed from: gc.k$c */
    public static final class C12781c extends C12778k {

        /* renamed from: b */
        public final C12767e f28239b;

        /* renamed from: c */
        public final List<C12774h> f28240c;

        /* renamed from: d */
        public final String f28241d;

        /* renamed from: e */
        public final String f28242e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C12781c(C12767e eVar, ArrayList arrayList, String str, String str2) {
            super(eVar.mo45523a().f28246c);
            C19383o.m32797g(eVar, "groupedMessageItem");
            this.f28239b = eVar;
            this.f28240c = arrayList;
            this.f28241d = str;
            this.f28242e = str2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C12781c)) {
                return false;
            }
            C12781c cVar = (C12781c) obj;
            return C19383o.m32792b(this.f28239b, cVar.f28239b) && C19383o.m32792b(this.f28240c, cVar.f28240c) && C19383o.m32792b(this.f28241d, cVar.f28241d) && C19383o.m32792b(this.f28242e, cVar.f28242e);
        }

        public final int hashCode() {
            int g = C13983i.m21488g(this.f28240c, this.f28239b.hashCode() * 31, 31);
            String str = this.f28241d;
            int i = 0;
            int hashCode = (g + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.f28242e;
            if (str2 != null) {
                i = str2.hashCode();
            }
            return hashCode + i;
        }

        public final String toString() {
            StringBuilder h = C0072d.m201h("OtherUserMessage(groupedMessageItem=");
            h.append(this.f28239b);
            h.append(", images=");
            h.append(this.f28240c);
            h.append(", avatarUrl=");
            h.append(this.f28241d);
            h.append(", displayName=");
            return C0391c.m1057c(h, this.f28242e, ')');
        }
    }

    /* renamed from: gc.k$d */
    public static final class C12782d extends C12778k {

        /* renamed from: b */
        public final long f28243b;

        public C12782d(long j) {
            super(j);
            this.f28243b = j;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C12782d) && this.f28243b == ((C12782d) obj).f28243b;
        }

        public final int hashCode() {
            return Long.hashCode(this.f28243b);
        }

        public final String toString() {
            return C0015b.m91j(C0072d.m201h("Timestamp(timestamp="), this.f28243b, ')');
        }
    }

    public C12778k(long j) {
        this.f28234a = j;
    }
}
