package com.etsy.android.p327ui.core.review;

/* renamed from: com.etsy.android.ui.core.review.DisplayVideoReviewsEvent */
public enum DisplayVideoReviewsEvent {
    VIDEO_REVIEW_OPENED("video_review_open"),
    VIDEO_REVIEW_PLAY("video_review_play"),
    VIDEO_REVIEW_PAUSE("video_review_pause"),
    VIDEO_REVIEW_SCRUBBER_USED("video_review_scrubber_used"),
    VIDEO_REVIEW_TAPPED_X("video_review_tapped_x"),
    VIDEO_REVIEW_SEE_FULL_REVIEW("video_review_see_full_review"),
    VIDEO_REVIEW_REWATCH("video_review_rewatch"),
    VIDEO_REVIEW_MODAL_DISMISSED("video_review_modal_dismissed"),
    REVIEW_MODAL_DISMISSED("review_modal_dismissed");
    
    private final String eventName;

    private DisplayVideoReviewsEvent(String str) {
        this.eventName = str;
    }

    public final String getEventName() {
        return this.eventName;
    }
}
