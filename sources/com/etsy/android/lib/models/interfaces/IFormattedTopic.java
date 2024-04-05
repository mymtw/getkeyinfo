package com.etsy.android.lib.models.interfaces;

import com.etsy.android.lib.logger.AnalyticsProperty;
import com.etsy.android.lib.models.apiv3.sdl.ISdlEvent;
import com.etsy.android.lib.models.apiv3.vespa.FormattedTopic;
import com.etsy.android.lib.models.apiv3.vespa.Topic;
import java.util.List;
import java.util.Map;
import kotlin.Pair;

public interface IFormattedTopic {
    List<Pair<String, Map<AnalyticsProperty, Object>>> extractOnTappedEventParameters();

    List<FormattedTopic.Format> getFormats();

    List<ISdlEvent> getSdlEvents();

    Topic getTopic();

    void setFormats(List<? extends FormattedTopic.Format> list);

    void setSdlEvents(List<? extends ISdlEvent> list);

    void setTopic(Topic topic);
}
