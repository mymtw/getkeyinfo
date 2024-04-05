package com.etsy.android.p327ui.home.tabs;

import android.support.p013v4.media.C0070b;
import android.support.p013v4.media.C0072d;
import androidx.compose.animation.C0391c;
import com.etsy.android.lib.models.homescreen.HomeTab;
import java.util.List;
import kotlin.jvm.internal.C19383o;
import retrofit2.HttpException;

/* renamed from: com.etsy.android.ui.home.tabs.k */
public interface C10062k {

    /* renamed from: com.etsy.android.ui.home.tabs.k$a */
    public static final class C10063a implements C10062k {

        /* renamed from: a */
        public final Throwable f22179a;

        /* renamed from: b */
        public final String f22180b;

        public C10063a(String str, HttpException httpException) {
            this.f22179a = httpException;
            this.f22180b = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C10063a)) {
                return false;
            }
            C10063a aVar = (C10063a) obj;
            return C19383o.m32792b(this.f22179a, aVar.f22179a) && C19383o.m32792b(this.f22180b, aVar.f22180b);
        }

        public final int hashCode() {
            int hashCode = this.f22179a.hashCode() * 31;
            String str = this.f22180b;
            return hashCode + (str == null ? 0 : str.hashCode());
        }

        public final String toString() {
            StringBuilder h = C0072d.m201h("Failure(error=");
            h.append(this.f22179a);
            h.append(", message=");
            return C0391c.m1057c(h, this.f22180b, ')');
        }
    }

    /* renamed from: com.etsy.android.ui.home.tabs.k$b */
    public static final class C10064b implements C10062k {

        /* renamed from: a */
        public final List<HomeTab> f22181a;

        public C10064b(List<? extends HomeTab> list) {
            C19383o.m32797g(list, "tabs");
            this.f22181a = list;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C10064b) && C19383o.m32792b(this.f22181a, ((C10064b) obj).f22181a);
        }

        public final int hashCode() {
            return this.f22181a.hashCode();
        }

        public final String toString() {
            return C0070b.m186i(C0072d.m201h("Success(tabs="), this.f22181a, ')');
        }
    }
}
