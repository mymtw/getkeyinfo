package com.google.android.exoplayer2.source.hls;

import java.io.IOException;
import p612li.C18188d;

final class UnexpectedSampleTimestampException extends IOException {
    public final long lastAcceptedSampleTimeUs;
    public final C18188d mediaChunk;
    public final long rejectedSampleTimeUs;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public UnexpectedSampleTimestampException(p612li.C18188d r9, long r10, long r12) {
        /*
            r8 = this;
            long r0 = p594jh.C17912g.m30088b(r12)
            long r2 = r9.f39831g
            long r4 = r9.f39832h
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r7 = 103(0x67, float:1.44E-43)
            r6.<init>(r7)
            java.lang.String r7 = "Unexpected sample timestamp: "
            r6.append(r7)
            r6.append(r0)
            java.lang.String r0 = " in chunk ["
            r6.append(r0)
            r6.append(r2)
            java.lang.String r0 = ", "
            r6.append(r0)
            r6.append(r4)
            java.lang.String r0 = "]"
            r6.append(r0)
            java.lang.String r0 = r6.toString()
            r8.<init>(r0)
            r8.mediaChunk = r9
            r8.lastAcceptedSampleTimeUs = r10
            r8.rejectedSampleTimeUs = r12
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.source.hls.UnexpectedSampleTimestampException.<init>(li.d, long, long):void");
    }
}
