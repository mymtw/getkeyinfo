package com.etsy.android.lib.models.datatypes;

import com.squareup.moshi.C17403o;
import java.io.Serializable;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.text.C19456j;
import kotlin.text.C19457k;

@C17403o(generateAdapter = false)
public final class EtsyId implements Serializable {
    public static final int $stable = 8;
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    private static final long serialVersionUID = 7892340958702910251L;

    /* renamed from: id */
    private String f19154id;

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public EtsyId() {
        this((String) null, 1, (DefaultConstructorMarker) null);
    }

    public EtsyId(String str) {
        this.f19154id = str == null ? "" : str;
    }

    public static /* synthetic */ void getIdAsLongDeprecated$annotations() {
    }

    public boolean equals(Object obj) {
        if (obj instanceof EtsyId) {
            return C19457k.m33019W0(((EtsyId) obj).f19154id, this.f19154id, true);
        }
        if (obj instanceof EtsyDeepLinkId) {
            return C19457k.m33019W0(((EtsyDeepLinkId) obj).getId(), this.f19154id, true);
        }
        return false;
    }

    public final String getId() {
        return this.f19154id;
    }

    public final long getIdAsLong() {
        Long U0 = C19456j.m33017U0(this.f19154id);
        if (U0 != null) {
            return U0.longValue();
        }
        return 0;
    }

    public final long getIdAsLongDeprecated() {
        return getIdAsLong();
    }

    public final boolean hasId() {
        return this.f19154id.length() > 0;
    }

    public int hashCode() {
        return this.f19154id.hashCode();
    }

    public final boolean isNumeric() {
        return getIdAsLong() != 0;
    }

    public final void setId(String str) {
        if (str != null) {
            this.f19154id = str;
        }
    }

    public final void setIdKt(String str) {
        C19383o.m32797g(str, "<set-?>");
        this.f19154id = str;
    }

    public String toString() {
        return this.f19154id;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ EtsyId(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str);
    }

    public EtsyId(long j) {
        this(String.valueOf(j));
    }
}
