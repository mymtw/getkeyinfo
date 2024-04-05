package com.google.android.exoplayer2.upstream;

import android.support.p013v4.media.C0072d;
import java.util.List;
import java.util.Map;
import p505aj.C14002i;
import p513bj.C14049b0;

public final class HttpDataSource$InvalidResponseCodeException extends HttpDataSource$HttpDataSourceException {
    public final Map<String, List<String>> headerFields;
    public final byte[] responseBody;
    public final int responseCode;
    public final String responseMessage;

    public HttpDataSource$InvalidResponseCodeException(int i, String str, Map<String, List<String>> map, C14002i iVar, byte[] bArr) {
        super(C0072d.m200g(26, "Response code: ", i), iVar, 1);
        this.responseCode = i;
        this.responseMessage = str;
        this.headerFields = map;
        this.responseBody = bArr;
    }

    @Deprecated
    public HttpDataSource$InvalidResponseCodeException(int i, Map<String, List<String>> map, C14002i iVar) {
        this(i, (String) null, map, iVar, C14049b0.f30918f);
    }

    @Deprecated
    public HttpDataSource$InvalidResponseCodeException(int i, String str, Map<String, List<String>> map, C14002i iVar) {
        this(i, str, map, iVar, C14049b0.f30918f);
    }
}
