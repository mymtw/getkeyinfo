package com.paypal.checkout.order.patch;

import android.support.p013v4.media.C0073e;
import androidx.compose.animation.C0388a;
import androidx.compose.animation.C0391c;
import kotlin.jvm.internal.C19383o;
import p003a2.C0023f;

public final class PatchError {
    private final String description;
    private final String field;
    private final String issue;
    private final String value;

    public PatchError(String str, String str2, String str3, String str4) {
        C0391c.m1060g(str, "field", str2, "value", str3, "issue", str4, "description");
        this.field = str;
        this.value = str2;
        this.issue = str3;
        this.description = str4;
    }

    public static /* synthetic */ PatchError copy$default(PatchError patchError, String str, String str2, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = patchError.field;
        }
        if ((i & 2) != 0) {
            str2 = patchError.value;
        }
        if ((i & 4) != 0) {
            str3 = patchError.issue;
        }
        if ((i & 8) != 0) {
            str4 = patchError.description;
        }
        return patchError.copy(str, str2, str3, str4);
    }

    public final String component1() {
        return this.field;
    }

    public final String component2() {
        return this.value;
    }

    public final String component3() {
        return this.issue;
    }

    public final String component4() {
        return this.description;
    }

    public final PatchError copy(String str, String str2, String str3, String str4) {
        C19383o.m32797g(str, "field");
        C19383o.m32797g(str2, "value");
        C19383o.m32797g(str3, "issue");
        C19383o.m32797g(str4, "description");
        return new PatchError(str, str2, str3, str4);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PatchError)) {
            return false;
        }
        PatchError patchError = (PatchError) obj;
        return C19383o.m32792b(this.field, patchError.field) && C19383o.m32792b(this.value, patchError.value) && C19383o.m32792b(this.issue, patchError.issue) && C19383o.m32792b(this.description, patchError.description);
    }

    public final String getDescription() {
        return this.description;
    }

    public final String getField() {
        return this.field;
    }

    public final String getIssue() {
        return this.issue;
    }

    public final String getValue() {
        return this.value;
    }

    public int hashCode() {
        return this.description.hashCode() + C0023f.m105e(this.issue, C0023f.m105e(this.value, this.field.hashCode() * 31, 31), 31);
    }

    public String toString() {
        String str = this.field;
        String str2 = this.value;
        return C0073e.m210j(C0388a.m1050f("PatchError(field=", str, ", value=", str2, ", issue="), this.issue, ", description=", this.description, ")");
    }
}
