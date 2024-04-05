package com.etsy.android.lib.models.datatypes;

import java.io.Serializable;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.text.C19456j;
import kotlin.text.C19457k;

public final class EtsyDeepLinkId implements Serializable {
    public static final int $stable = 8;
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    private static final long serialVersionUID = -4114399235350936476L;

    /* renamed from: id */
    private String f19153id;
    private String name;

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public EtsyDeepLinkId(String str) {
        C19383o.m32797g(str, "id");
        this.f19153id = str;
        this.name = "";
    }

    public final void checkIdTypeAndSet(String str) {
        if (str != null) {
            if (C19456j.m33017U0(str) != null) {
                this.f19153id = str;
            } else {
                this.name = str;
            }
        }
    }

    public boolean equals(Object obj) {
        if (obj instanceof EtsyDeepLinkId) {
            return C19457k.m33019W0(((EtsyDeepLinkId) obj).getId(), getId(), true);
        }
        if (obj instanceof EtsyId) {
            return C19457k.m33019W0(((EtsyId) obj).getId(), getId(), true);
        }
        return false;
    }

    public final String getId() {
        String str = this.f19153id;
        return str.length() == 0 ? this.name : str;
    }

    public final long getIdAsLong() {
        Long U0 = C19456j.m33017U0(getId());
        if (U0 != null) {
            return U0.longValue();
        }
        return 0;
    }

    public final String getName() {
        return this.name;
    }

    public final boolean hasId() {
        if (getId().length() > 0) {
            return true;
        }
        return this.name.length() > 0;
    }

    public int hashCode() {
        return getId().hashCode();
    }

    public final void setName(String str) {
        C19383o.m32797g(str, "<set-?>");
        this.name = str;
    }

    public String toString() {
        return getId();
    }

    public EtsyDeepLinkId() {
        this("");
    }

    public EtsyDeepLinkId(long j) {
        this(String.valueOf(j));
    }
}
