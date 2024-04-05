package p409o9;

import android.support.p013v4.media.C0072d;
import androidx.compose.animation.C0391c;
import com.etsy.android.lib.models.ResponseConstants;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.util.List;
import kotlin.jvm.internal.C19383o;

/* renamed from: o9.d */
public final class C13122d {

    /* renamed from: a */
    public final Boolean f28848a = null;

    /* renamed from: b */
    public final Boolean f28849b = null;

    /* renamed from: c */
    public final Boolean f28850c = null;

    /* renamed from: d */
    public final Boolean f28851d = null;

    /* renamed from: e */
    public final List<String> f28852e = null;

    /* renamed from: f */
    public final String f28853f = null;

    /* renamed from: g */
    public final String f28854g = null;

    /* renamed from: o9.d$a */
    public static final class C13123a {
        /* renamed from: a */
        public static C13122d m20789a(JsonNode jsonNode) {
            if (jsonNode.isArray() || (!jsonNode.has("is_in_experiment") && !jsonNode.has("is_operational") && !jsonNode.has("is_in_current_pe") && !jsonNode.has("should_clean_up") && !jsonNode.has("variants") && !jsonNode.has("team") && !jsonNode.has(ResponseConstants.OWNER))) {
                return null;
            }
            ObjectMapper objectMapper = new ObjectMapper();
            objectMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
            return (C13122d) objectMapper.treeToValue(jsonNode, C13122d.class);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C13122d)) {
            return false;
        }
        C13122d dVar = (C13122d) obj;
        return C19383o.m32792b(this.f28848a, dVar.f28848a) && C19383o.m32792b(this.f28849b, dVar.f28849b) && C19383o.m32792b(this.f28850c, dVar.f28850c) && C19383o.m32792b(this.f28851d, dVar.f28851d) && C19383o.m32792b(this.f28852e, dVar.f28852e) && C19383o.m32792b(this.f28853f, dVar.f28853f) && C19383o.m32792b(this.f28854g, dVar.f28854g);
    }

    public final int hashCode() {
        Boolean bool = this.f28848a;
        int i = 0;
        int hashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        Boolean bool2 = this.f28849b;
        int hashCode2 = (hashCode + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Boolean bool3 = this.f28850c;
        int hashCode3 = (hashCode2 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        Boolean bool4 = this.f28851d;
        int hashCode4 = (hashCode3 + (bool4 == null ? 0 : bool4.hashCode())) * 31;
        List<String> list = this.f28852e;
        int hashCode5 = (hashCode4 + (list == null ? 0 : list.hashCode())) * 31;
        String str = this.f28853f;
        int hashCode6 = (hashCode5 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f28854g;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode6 + i;
    }

    public final String toString() {
        StringBuilder h = C0072d.m201h("ConfigOptionState(isInExperiment=");
        h.append(this.f28848a);
        h.append(", isOperational=");
        h.append(this.f28849b);
        h.append(", isInCurrentPe=");
        h.append(this.f28850c);
        h.append(", isReadyToCleanup=");
        h.append(this.f28851d);
        h.append(", variants=");
        h.append(this.f28852e);
        h.append(", teamName=");
        h.append(this.f28853f);
        h.append(", ownerName=");
        return C0391c.m1057c(h, this.f28854g, ')');
    }
}
