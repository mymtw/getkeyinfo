package com.paypal.checkout.internal.build;

import com.paypal.checkout.internal.build.BuildValidationStatus;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import kotlin.C19285c;
import kotlin.C19350d;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.text.C19451e;
import kotlin.text.Regex;

public final class BuildValidator {
    private final Date currentTime;
    private final Regex regexPattern;
    private final C19285c simpleDateFormat$delegate;
    private final String versionName;

    public BuildValidator(String str, Date date) {
        C19383o.m32797g(str, "versionName");
        C19383o.m32797g(date, "currentTime");
        this.versionName = str;
        this.currentTime = date;
        this.simpleDateFormat$delegate = C19350d.m32677b(BuildValidator$simpleDateFormat$2.INSTANCE);
        this.regexPattern = new Regex("(?<=SNAPSHOT-).*");
    }

    private final SimpleDateFormat getSimpleDateFormat() {
        return (SimpleDateFormat) this.simpleDateFormat$delegate.getValue();
    }

    private final Calendar getThreeMonthsInTheFuture(Calendar calendar) {
        calendar.add(2, 3);
        calendar.add(14, -1);
        return calendar;
    }

    public final BuildValidationStatus getValidationStatus() {
        C19451e find$default = Regex.find$default(this.regexPattern, this.versionName, 0, 2, (Object) null);
        if (find$default == null) {
            return BuildValidationStatus.Valid.INSTANCE;
        }
        Date parse = getSimpleDateFormat().parse(find$default.getValue());
        C19383o.m32794d(parse);
        Calendar instance = Calendar.getInstance();
        instance.setTime(parse);
        getThreeMonthsInTheFuture(instance);
        return this.currentTime.after(instance.getTime()) ? new BuildValidationStatus.Invalid.Expired("This SNAPSHOT was published more than 3 months ago and is no longer valid.") : BuildValidationStatus.Valid.INSTANCE;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ BuildValidator(String str, Date date, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? new Date() : date);
    }
}
