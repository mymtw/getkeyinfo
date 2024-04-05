package com.etsy.android.p327ui.user.review;

/* renamed from: com.etsy.android.ui.user.review.ReviewEvent */
public enum ReviewEvent {
    VIDEO_THUMBNAIL_TAPPED("review_card_video_upload_did_tap_video_thumbnail"),
    VIDEO_CAPTURE_OPENS("review_card_photo_upload_add_video_tapped"),
    TAKES_VIDEO("review_card_video_upload_did_take"),
    SELECTS_VIDEO("review_card_photo_upload_did_select_video"),
    RETAKES_VIDEO("review_card_photo_upload_did_retake_video"),
    DELETES_VIDEO("review_card_photo_upload_did_remove_video"),
    SUBRATINGS_FINISH("review_card_subrating_review_did_finish"),
    NO_SUBRATINGS_FINISH("review_card_subrating_review_did_finish_no_subratings");
    
    private final String eventName;

    private ReviewEvent(String str) {
        this.eventName = str;
    }

    public final String getEventName() {
        return this.eventName;
    }
}
