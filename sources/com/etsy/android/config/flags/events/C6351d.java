package com.etsy.android.config.flags.events;

import android.support.p013v4.media.C0072d;
import androidx.compose.animation.C0391c;
import com.etsy.android.config.flags.C6383l;
import kotlin.jvm.internal.C19383o;

/* renamed from: com.etsy.android.config.flags.events.d */
public abstract class C6351d {

    /* renamed from: com.etsy.android.config.flags.events.d$a */
    public static final class C6352a extends C6351d {

        /* renamed from: a */
        public static final C6352a f14148a = new C6352a();
    }

    /* renamed from: com.etsy.android.config.flags.events.d$b */
    public static abstract class C6353b extends C6351d {

        /* renamed from: com.etsy.android.config.flags.events.d$b$a */
        public static final class C6354a extends C6353b {

            /* renamed from: a */
            public static final C6354a f14149a = new C6354a();
        }

        /* renamed from: com.etsy.android.config.flags.events.d$b$b */
        public static final class C6355b extends C6353b {

            /* renamed from: a */
            public final String f14150a;

            /* renamed from: b */
            public final String f14151b;

            public C6355b(String str, String str2) {
                C19383o.m32797g(str, "flagName");
                C19383o.m32797g(str2, "flagValue");
                this.f14150a = str;
                this.f14151b = str2;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C6355b)) {
                    return false;
                }
                C6355b bVar = (C6355b) obj;
                return C19383o.m32792b(this.f14150a, bVar.f14150a) && C19383o.m32792b(this.f14151b, bVar.f14151b);
            }

            public final int hashCode() {
                return this.f14151b.hashCode() + (this.f14150a.hashCode() * 31);
            }

            public final String toString() {
                StringBuilder h = C0072d.m201h("SetOverrideFromConfigsMenu(flagName=");
                h.append(this.f14150a);
                h.append(", flagValue=");
                return C0391c.m1057c(h, this.f14151b, ')');
            }
        }

        /* renamed from: com.etsy.android.config.flags.events.d$b$c */
        public static final class C6356c extends C6353b {

            /* renamed from: a */
            public final String f14152a;

            /* renamed from: b */
            public final String f14153b;

            public C6356c(String str, String str2) {
                C19383o.m32797g(str, "currentConfigName");
                this.f14152a = str;
                this.f14153b = str2;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C6356c)) {
                    return false;
                }
                C6356c cVar = (C6356c) obj;
                return C19383o.m32792b(this.f14152a, cVar.f14152a) && C19383o.m32792b(this.f14153b, cVar.f14153b);
            }

            public final int hashCode() {
                int hashCode = this.f14152a.hashCode() * 31;
                String str = this.f14153b;
                return hashCode + (str == null ? 0 : str.hashCode());
            }

            public final String toString() {
                StringBuilder h = C0072d.m201h("ShowTextInputDialog(currentConfigName=");
                h.append(this.f14152a);
                h.append(", currentConfigValue=");
                return C0391c.m1057c(h, this.f14153b, ')');
            }
        }
    }

    /* renamed from: com.etsy.android.config.flags.events.d$c */
    public static final class C6357c extends C6351d {

        /* renamed from: a */
        public final C6383l f14154a;

        public C6357c(C6383l.C6384a aVar) {
            this.f14154a = aVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C6357c) && C19383o.m32792b(this.f14154a, ((C6357c) obj).f14154a);
        }

        public final int hashCode() {
            return this.f14154a.hashCode();
        }

        public final String toString() {
            StringBuilder h = C0072d.m201h("StateChange(state=");
            h.append(this.f14154a);
            h.append(')');
            return h.toString();
        }
    }
}
