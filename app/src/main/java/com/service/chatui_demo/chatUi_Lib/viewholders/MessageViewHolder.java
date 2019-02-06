package com.service.chatui_demo.chatUi_Lib.viewholders;

import android.content.Context;
import android.support.v4.content.ContextCompat;
import android.view.View;

import com.service.chatui_demo.R;;
import com.service.chatui_demo.chatUi_Lib.views.MessageView;


public class MessageViewHolder {

    public final int STATUS_SENT = 0;
    public final int STATUS_RECEIVED = 1;

    View row;
    Context context;

    private MessageView messageView;
    private int backgroundRcv, backgroundSend;
    private int bubbleBackgroundRcv, bubbleBackgroundSend;

    public MessageViewHolder(View convertView, int backgroundRcv, int backgroundSend, int bubbleBackgroundRcv, int bubbleBackgroundSend) {
        row = convertView;
        context = row.getContext();
        messageView = (MessageView) convertView;
        this.backgroundRcv = backgroundRcv;
        this.backgroundSend = backgroundSend;
        this.bubbleBackgroundSend = bubbleBackgroundSend;
        this.bubbleBackgroundRcv = bubbleBackgroundRcv;
    }

    public void setMessage(String message) {

        messageView.setMessage(message);

    }

    public void setTimestamp(String timestamp) {

        messageView.setTimestamp(timestamp);

    }

    public void setElevation(float elevation) {

        messageView.setElevation(elevation);

    }

    public void setSender(String sender) {
        messageView.setSender(sender);
    }

    public void setBackground(int messageType) {

        int chatMessageBackground = ContextCompat.getColor(context, R.color.cardview_light_background);
        int bubbleBackground = ContextCompat.getColor(context, R.color.cardview_light_background);

        switch (messageType) {
            case STATUS_RECEIVED:
                chatMessageBackground = backgroundRcv;
                bubbleBackground = bubbleBackgroundRcv;
                break;
            case STATUS_SENT:
                chatMessageBackground = backgroundSend;
                bubbleBackground = bubbleBackgroundSend;
                break;
        }

        messageView.setBackgroundColor(chatMessageBackground);
        messageView.setBackground(bubbleBackground);

    }

}
