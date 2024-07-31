package ru.polyak.telegram.bot.ext.handlers;

public interface OnHandler<T> {
    void onHandle(T t);
}
