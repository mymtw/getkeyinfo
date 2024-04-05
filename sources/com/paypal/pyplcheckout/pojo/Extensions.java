package com.paypal.pyplcheckout.pojo;

import java.util.List;
import java.util.Map;
import kotlin.collections.C19294b0;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p650pn.C18417a;

public final class Extensions {
    @C18417a("additionalProperties")
    private final Map<String, Object> additionalProperties;
    @C18417a("correlationId")
    private final String correlationId;
    @C18417a("developerNotes")
    private final List<String> developerNotes;

    public Extensions() {
        this((List) null, (String) null, (Map) null, 7, (DefaultConstructorMarker) null);
    }

    public Extensions(List<String> list, String str, Map<String, ? extends Object> map) {
        C19383o.m32797g(map, "additionalProperties");
        this.developerNotes = list;
        this.correlationId = str;
        this.additionalProperties = map;
    }

    public static /* synthetic */ Extensions copy$default(Extensions extensions, List<String> list, String str, Map<String, Object> map, int i, Object obj) {
        if ((i & 1) != 0) {
            list = extensions.developerNotes;
        }
        if ((i & 2) != 0) {
            str = extensions.correlationId;
        }
        if ((i & 4) != 0) {
            map = extensions.additionalProperties;
        }
        return extensions.copy(list, str, map);
    }

    public final List<String> component1() {
        return this.developerNotes;
    }

    public final String component2() {
        return this.correlationId;
    }

    public final Map<String, Object> component3() {
        return this.additionalProperties;
    }

    public final Extensions copy(List<String> list, String str, Map<String, ? extends Object> map) {
        C19383o.m32797g(map, "additionalProperties");
        return new Extensions(list, str, map);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Extensions)) {
            return false;
        }
        Extensions extensions = (Extensions) obj;
        return C19383o.m32792b(this.developerNotes, extensions.developerNotes) && C19383o.m32792b(this.correlationId, extensions.correlationId) && C19383o.m32792b(this.additionalProperties, extensions.additionalProperties);
    }

    public final Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public final String getCorrelationId() {
        return this.correlationId;
    }

    public final List<String> getDeveloperNotes() {
        return this.developerNotes;
    }

    public int hashCode() {
        List<String> list = this.developerNotes;
        int i = 0;
        int hashCode = (list == null ? 0 : list.hashCode()) * 31;
        String str = this.correlationId;
        if (str != null) {
            i = str.hashCode();
        }
        return this.additionalProperties.hashCode() + ((hashCode + i) * 31);
    }

    public String toString() {
        List<String> list = this.developerNotes;
        String str = this.correlationId;
        Map<String, Object> map = this.additionalProperties;
        return "Extensions(developerNotes=" + list + ", correlationId=" + str + ", additionalProperties=" + map + ")";
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ Extensions(List list, String str, Map map, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : list, (i & 2) != 0 ? null : str, (i & 4) != 0 ? C19294b0.m32559p0() : map);
    }
}
