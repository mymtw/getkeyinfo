package com.google.android.exoplayer2.upstream;

import java.io.IOException;
import p505aj.C14002i;

public class HttpDataSource$HttpDataSourceException extends IOException {
    public static final int TYPE_CLOSE = 3;
    public static final int TYPE_OPEN = 1;
    public static final int TYPE_READ = 2;
    public final C14002i dataSpec;
    public final int type;

    public HttpDataSource$HttpDataSourceException(C14002i iVar, int i) {
        this.dataSpec = iVar;
        this.type = i;
    }

    public HttpDataSource$HttpDataSourceException(String str, C14002i iVar, int i) {
        super(str);
        this.dataSpec = iVar;
        this.type = i;
    }

    public HttpDataSource$HttpDataSourceException(IOException iOException, C14002i iVar, int i) {
        super(iOException);
        this.dataSpec = iVar;
        this.type = i;
    }

    public HttpDataSource$HttpDataSourceException(String str, IOException iOException, C14002i iVar, int i) {
        super(str, iOException);
        this.dataSpec = iVar;
        this.type = i;
    }
}
