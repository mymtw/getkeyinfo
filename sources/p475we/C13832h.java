package p475we;

import android.support.p013v4.media.C0072d;
import com.google.android.play.core.appupdate.C15559a;
import kotlin.jvm.internal.C19383o;

/* renamed from: we.h */
public abstract class C13832h {

    /* renamed from: we.h$a */
    public static final class C13833a extends C13832h {

        /* renamed from: a */
        public final C15559a f30450a;

        public C13833a(C15559a aVar) {
            C19383o.m32797g(aVar, "appUpdateInfo");
            this.f30450a = aVar;
        }

        /* renamed from: a */
        public final String mo46668a() {
            return "forced_upgrade_prompt_hard";
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C13833a) && C19383o.m32792b(this.f30450a, ((C13833a) obj).f30450a);
        }

        public final int hashCode() {
            return this.f30450a.hashCode();
        }

        public final String toString() {
            StringBuilder h = C0072d.m201h("Hard(appUpdateInfo=");
            h.append(this.f30450a);
            h.append(')');
            return h.toString();
        }
    }

    /* renamed from: we.h$b */
    public static final class C13834b extends C13832h {

        /* renamed from: a */
        public static final C13834b f30451a = new C13834b();

        /* renamed from: a */
        public final String mo46668a() {
            return "forced_upgrade_prompt_none";
        }
    }

    /* renamed from: we.h$c */
    public static final class C13835c extends C13832h {

        /* renamed from: a */
        public final C15559a f30452a;

        public C13835c(C15559a aVar) {
            C19383o.m32797g(aVar, "appUpdateInfo");
            this.f30452a = aVar;
        }

        /* renamed from: a */
        public final String mo46668a() {
            return "forced_upgrade_prompt_soft";
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C13835c) && C19383o.m32792b(this.f30452a, ((C13835c) obj).f30452a);
        }

        public final int hashCode() {
            return this.f30452a.hashCode();
        }

        public final String toString() {
            StringBuilder h = C0072d.m201h("Soft(appUpdateInfo=");
            h.append(this.f30452a);
            h.append(')');
            return h.toString();
        }
    }

    /* renamed from: a */
    public abstract String mo46668a();
}
