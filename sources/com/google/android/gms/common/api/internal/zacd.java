package com.google.android.gms.common.api.internal;

import com.etsy.android.util.C12060q;
import com.google.android.gms.common.util.concurrent.NumberedThreadFactory;
import java.util.concurrent.ExecutorService;

public final class zacd {
    private static final ExecutorService zaa = C12060q.m19872c(1, new NumberedThreadFactory("GAC_Transform"));

    public static ExecutorService zaa() {
        return zaa;
    }
}
