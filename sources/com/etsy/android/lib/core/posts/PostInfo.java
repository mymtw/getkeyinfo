package com.etsy.android.lib.core.posts;

import java.io.Serializable;

public class PostInfo implements Serializable {
    private static final long serialVersionUID = -3530295347709398628L;
    private int mAttemptCount;
    private double mBackOffMultiplier;
    private int mMaxRetryCount;
    private long mMaxRetryIntervalMillis;
    private long mRetryIntervalMillis;

    /* renamed from: com.etsy.android.lib.core.posts.PostInfo$b */
    public static class C8626b {
    }

    public PostInfo() {
    }

    public void calculateNextRetryTime() {
        long j = this.mRetryIntervalMillis;
        if (j > 0) {
            long j2 = (long) (((double) j) * this.mBackOffMultiplier);
            this.mRetryIntervalMillis = j2;
            long j3 = this.mMaxRetryIntervalMillis;
            if (j3 > 0 && j2 > j3) {
                this.mRetryIntervalMillis = j3;
            }
        }
    }

    public boolean canRunNow(long j) {
        return System.currentTimeMillis() > j;
    }

    public int getAttemptCount() {
        return this.mAttemptCount;
    }

    public long getNextRunAfterTime() {
        return System.currentTimeMillis() + this.mRetryIntervalMillis;
    }

    public long getRetryIntervalMillis() {
        return this.mRetryIntervalMillis;
    }

    public void incrementAttempt() {
        this.mAttemptCount++;
        calculateNextRetryTime();
    }

    public boolean shouldTryAgain() {
        int i = this.mMaxRetryCount;
        return i <= 0 || this.mAttemptCount <= i;
    }

    public PostInfo(C8626b bVar, C8625a aVar) {
        throw null;
    }
}
