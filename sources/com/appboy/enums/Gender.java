package com.appboy.enums;

import android.support.p013v4.media.C0072d;
import androidx.compose.animation.C0391c;
import com.appboy.Constants;
import com.braze.support.BrazeLogger;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Lambda;
import org.apache.commons.lang3.ClassUtils;
import p005a4.C0035b;
import p753kq.C19846a;

public enum Gender implements C0035b<String> {
    MALE("m"),
    FEMALE("f"),
    OTHER("o"),
    UNKNOWN("u"),
    NOT_APPLICABLE("n"),
    PREFER_NOT_TO_SAY(Constants.APPBOY_PUSH_PRIORITY_KEY);
    
    public static final Companion Companion = null;
    private final String value;

    public static final class Companion {

        /* renamed from: com.appboy.enums.Gender$Companion$a */
        public static final class C4905a extends Lambda implements C19846a<String> {

            /* renamed from: b */
            public final /* synthetic */ String f11097b;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C4905a(String str) {
                super(0);
                this.f11097b = str;
            }

            /* renamed from: a */
            public final String invoke() {
                return C0391c.m1057c(C0072d.m201h("No gender with value "), this.f11097b, ClassUtils.PACKAGE_SEPARATOR_CHAR);
            }
        }

        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final Gender getGender(String str) {
            C19383o.m32797g(str, "value");
            Gender[] values = Gender.values();
            int length = values.length;
            int i = 0;
            Gender gender = null;
            boolean z = false;
            Gender gender2 = null;
            while (true) {
                if (i < length) {
                    Gender gender3 = values[i];
                    i++;
                    if (C19383o.m32792b(gender3.getValue(), str)) {
                        if (z) {
                            break;
                        }
                        z = true;
                        gender2 = gender3;
                    }
                } else if (z) {
                    gender = gender2;
                }
            }
            if (gender == null) {
                BrazeLogger.m11282d(BrazeLogger.f11932a, this, BrazeLogger.Priority.W, (Throwable) null, new C4905a(str), 6);
            }
            return gender;
        }
    }

    /* access modifiers changed from: public */
    static {
        Companion = new Companion((DefaultConstructorMarker) null);
    }

    private Gender(String str) {
        this.value = str;
    }

    public static final Gender getGender(String str) {
        return Companion.getGender(str);
    }

    public final String getValue() {
        return this.value;
    }

    public String forJsonPut() {
        return this.value;
    }
}
