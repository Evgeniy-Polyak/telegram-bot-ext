package ru.polyak.telegram.bot.ext.api;

import lombok.Getter;

@Getter
public enum UpdateType {
    MESSAGE("message"),
    INLINE_QUERY("inline_query"),
    CHOSEN_INLINE_RESULT("chosen_inline_result"),
    CALLBACK_QUERY("callback_query"),
    EDITED_MESSAGE("edited_message"),
    CHANNEL_POST("channel_post"),
    EDITED_CHANNEL_POST("edited_channel_post"),
    SHIPPING_QUERY("shipping_query"),
    PRE_CHECKOUT_QUERY("pre_checkout_query"),
    POLL("poll"),
    POLL_ANSWER("poll_answer"),
    MY_CHAT_MEMBER("my_chat_member"),
    CHAT_MEMBER("chat_member"),
    CHAT_JOIN_REQUEST("chat_join_request"),
    MESSAGE_REACTION("message_reaction"),
    MESSAGE_REACTION_COUNT("message_reaction_count"),
    CHAT_BOOST("chat_boost"),
    CHAT_BOOST_REMOVED("removed_chat_boost"),
    BUSINESS_CONNECTION("business_connection"),
    BUSINESS_MESSAGE("business_message"),
    BUSINESS_MESSAGE_EDITED("edited_business_message"),
    BUSINESS_MESSAGE_DELETED("deleted_business_messages");

    private final String value;

    UpdateType(String type) {
        this.value = type;
    }
}

