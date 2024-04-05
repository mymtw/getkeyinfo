package com.etsy.android.lib.models;

import com.google.logging.type.LogSeverity;
import kotlin.Pair;

public final class ImageSizes {
    public static final int $stable = 0;
    public static final Pair<Integer, String> IMG_SIZE_170 = new Pair<>(170, "170x135");
    public static final Pair<Integer, String> IMG_SIZE_178 = new Pair<>(178, "178x178");
    public static final Pair<Integer, String> IMG_SIZE_224 = new Pair<>(224, "224xN");
    public static final Pair<Integer, String> IMG_SIZE_300 = new Pair<>(Integer.valueOf(LogSeverity.NOTICE_VALUE), "300x300");
    public static final Pair<Integer, String> IMG_SIZE_340 = new Pair<>(340, "340x270");
    public static final Pair<Integer, String> IMG_SIZE_545 = new Pair<>(545, "545xN");
    public static final Pair<Integer, String> IMG_SIZE_570 = new Pair<>(570, "570xN");
    public static final Pair<Integer, String> IMG_SIZE_640 = new Pair<>(640, "640x640");
    public static final Pair<Integer, String> IMG_SIZE_680 = new Pair<>(680, "680x540");
    public static final Pair<Integer, String> IMG_SIZE_75 = new Pair<>(75, "75x75");
    public static final Pair<Integer, String> IMG_SIZE_760 = new Pair<>(760, "760xN");
    public static final Pair<Integer, String> IMG_SIZE_FULL = new Pair<>(0, "fullxfull");
    public static final ImageSizes INSTANCE = new ImageSizes();

    private ImageSizes() {
    }
}
