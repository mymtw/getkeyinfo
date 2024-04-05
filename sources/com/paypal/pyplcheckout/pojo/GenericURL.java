package com.paypal.pyplcheckout.pojo;

import androidx.compose.animation.C0391c;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.internal.C19383o;
import p003a2.C0023f;
import p650pn.C18417a;

public final class GenericURL {
    @C18417a("auth")
    private final String auth;
    @C18417a("hash")
    private final String hash;
    @C18417a("host")
    private final String host;
    @C18417a("hostname")
    private final String hostname;
    @C18417a("href")
    private final String href;
    @C18417a("path")
    private final String path;
    @C18417a("pathname")
    private final String pathname;
    @C18417a("port")
    private final String port;
    @C18417a("protocol")
    private final String protocol;
    @C18417a("query")
    private final String query;
    @C18417a("queryParams")
    private final String queryParams;
    @C18417a("search")
    private final String search;
    @C18417a("slashes")
    private final Boolean slashes;

    public GenericURL(String str, Boolean bool, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12) {
        this.protocol = str;
        this.slashes = bool;
        this.auth = str2;
        this.host = str3;
        this.port = str4;
        this.hostname = str5;
        this.hash = str6;
        this.search = str7;
        this.query = str8;
        this.queryParams = str9;
        this.pathname = str10;
        this.path = str11;
        this.href = str12;
    }

    public static /* synthetic */ GenericURL copy$default(GenericURL genericURL, String str, Boolean bool, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, int i, Object obj) {
        GenericURL genericURL2 = genericURL;
        int i2 = i;
        return genericURL.copy((i2 & 1) != 0 ? genericURL2.protocol : str, (i2 & 2) != 0 ? genericURL2.slashes : bool, (i2 & 4) != 0 ? genericURL2.auth : str2, (i2 & 8) != 0 ? genericURL2.host : str3, (i2 & 16) != 0 ? genericURL2.port : str4, (i2 & 32) != 0 ? genericURL2.hostname : str5, (i2 & 64) != 0 ? genericURL2.hash : str6, (i2 & 128) != 0 ? genericURL2.search : str7, (i2 & 256) != 0 ? genericURL2.query : str8, (i2 & RecyclerView.C3084b0.FLAG_ADAPTER_POSITION_UNKNOWN) != 0 ? genericURL2.queryParams : str9, (i2 & RecyclerView.C3084b0.FLAG_ADAPTER_FULLUPDATE) != 0 ? genericURL2.pathname : str10, (i2 & RecyclerView.C3084b0.FLAG_MOVED) != 0 ? genericURL2.path : str11, (i2 & RecyclerView.C3084b0.FLAG_APPEARED_IN_PRE_LAYOUT) != 0 ? genericURL2.href : str12);
    }

    public final String component1() {
        return this.protocol;
    }

    public final String component10() {
        return this.queryParams;
    }

    public final String component11() {
        return this.pathname;
    }

    public final String component12() {
        return this.path;
    }

    public final String component13() {
        return this.href;
    }

    public final Boolean component2() {
        return this.slashes;
    }

    public final String component3() {
        return this.auth;
    }

    public final String component4() {
        return this.host;
    }

    public final String component5() {
        return this.port;
    }

    public final String component6() {
        return this.hostname;
    }

    public final String component7() {
        return this.hash;
    }

    public final String component8() {
        return this.search;
    }

    public final String component9() {
        return this.query;
    }

    public final GenericURL copy(String str, Boolean bool, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12) {
        return new GenericURL(str, bool, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11, str12);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GenericURL)) {
            return false;
        }
        GenericURL genericURL = (GenericURL) obj;
        return C19383o.m32792b(this.protocol, genericURL.protocol) && C19383o.m32792b(this.slashes, genericURL.slashes) && C19383o.m32792b(this.auth, genericURL.auth) && C19383o.m32792b(this.host, genericURL.host) && C19383o.m32792b(this.port, genericURL.port) && C19383o.m32792b(this.hostname, genericURL.hostname) && C19383o.m32792b(this.hash, genericURL.hash) && C19383o.m32792b(this.search, genericURL.search) && C19383o.m32792b(this.query, genericURL.query) && C19383o.m32792b(this.queryParams, genericURL.queryParams) && C19383o.m32792b(this.pathname, genericURL.pathname) && C19383o.m32792b(this.path, genericURL.path) && C19383o.m32792b(this.href, genericURL.href);
    }

    public final String getAuth() {
        return this.auth;
    }

    public final String getHash() {
        return this.hash;
    }

    public final String getHost() {
        return this.host;
    }

    public final String getHostname() {
        return this.hostname;
    }

    public final String getHref() {
        return this.href;
    }

    public final String getPath() {
        return this.path;
    }

    public final String getPathname() {
        return this.pathname;
    }

    public final String getPort() {
        return this.port;
    }

    public final String getProtocol() {
        return this.protocol;
    }

    public final String getQuery() {
        return this.query;
    }

    public final String getQueryParams() {
        return this.queryParams;
    }

    public final String getSearch() {
        return this.search;
    }

    public final Boolean getSlashes() {
        return this.slashes;
    }

    public int hashCode() {
        String str = this.protocol;
        int i = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        Boolean bool = this.slashes;
        int hashCode2 = (hashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        String str2 = this.auth;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.host;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.port;
        int hashCode5 = (hashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.hostname;
        int hashCode6 = (hashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.hash;
        int hashCode7 = (hashCode6 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.search;
        int hashCode8 = (hashCode7 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.query;
        int hashCode9 = (hashCode8 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.queryParams;
        int hashCode10 = (hashCode9 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.pathname;
        int hashCode11 = (hashCode10 + (str10 == null ? 0 : str10.hashCode())) * 31;
        String str11 = this.path;
        int hashCode12 = (hashCode11 + (str11 == null ? 0 : str11.hashCode())) * 31;
        String str12 = this.href;
        if (str12 != null) {
            i = str12.hashCode();
        }
        return hashCode12 + i;
    }

    public String toString() {
        String str = this.protocol;
        Boolean bool = this.slashes;
        String str2 = this.auth;
        String str3 = this.host;
        String str4 = this.port;
        String str5 = this.hostname;
        String str6 = this.hash;
        String str7 = this.search;
        String str8 = this.query;
        String str9 = this.queryParams;
        String str10 = this.pathname;
        String str11 = this.path;
        String str12 = this.href;
        StringBuilder sb = new StringBuilder();
        sb.append("GenericURL(protocol=");
        sb.append(str);
        sb.append(", slashes=");
        sb.append(bool);
        sb.append(", auth=");
        C0391c.m1061h(sb, str2, ", host=", str3, ", port=");
        C0391c.m1061h(sb, str4, ", hostname=", str5, ", hash=");
        C0391c.m1061h(sb, str6, ", search=", str7, ", query=");
        C0391c.m1061h(sb, str8, ", queryParams=", str9, ", pathname=");
        C0391c.m1061h(sb, str10, ", path=", str11, ", href=");
        return C0023f.m110k(sb, str12, ")");
    }
}
