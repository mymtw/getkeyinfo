package com.google.android.exoplayer2.p526ui;

/* renamed from: com.google.android.exoplayer2.ui.c */
public interface C14420c {

    /* renamed from: com.google.android.exoplayer2.ui.c$a */
    public interface C14421a {
        /* renamed from: a */
        void mo30962a(C14420c cVar, long j);

        /* renamed from: b */
        void mo30963b(C14420c cVar, long j, boolean z);

        /* renamed from: c */
        void mo30964c(C14420c cVar, long j);
    }

    void addListener(C14421a aVar);

    long getPreferredUpdateDelay();

    void setAdGroupTimesMs(long[] jArr, boolean[] zArr, int i);

    void setBufferedPosition(long j);

    void setDuration(long j);

    void setEnabled(boolean z);

    void setPosition(long j);
}
