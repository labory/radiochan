package com.carcasser.radiochan.client;

import com.google.gwt.core.client.JavaScriptObject;

/**
 * Statistic
 */
class Statistic extends JavaScriptObject {
    protected Statistic() {
    }

    public final native String getName() /*-{
        return this.name;
    }-*/;

    public final native String getListeners() /*-{
        return this.listeners;
    }-*/;

    public final native String getListenersPeak() /*-{
        return this.listeners_peak;
    }-*/;

    public final native String  getTitle() /*-{
        return this.title;
    }-*/;

    public final native String getDescription() /*-{
        return this.description;
    }-*/;

    public final native String getGenre() /*-{
        return this.genre;
    }-*/;

    public final native String getBitrate() /*-{
        return this.bitrate;
    }-*/;

    public final native String getUrl() /*-{
        return this.url;
    }-*/;

}
