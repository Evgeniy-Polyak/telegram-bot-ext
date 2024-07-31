package ru.polyak.telegram.bot.ext.core;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.telegram.telegrambots.longpolling.BotSession;
import org.telegram.telegrambots.longpolling.TelegramBotsLongPollingApplication;
import org.telegram.telegrambots.longpolling.interfaces.LongPollingUpdateConsumer;
import org.telegram.telegrambots.longpolling.util.DefaultGetUpdatesGenerator;
import org.telegram.telegrambots.meta.TelegramUrl;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;

import java.util.List;

public class SpringBootLongPollingApplication extends TelegramBotsLongPollingApplication {
    @Autowired
    @Qualifier("allowedUpdates")
    private List<String> allowedUpdates;

    @Override
    public BotSession registerBot(String botToken, LongPollingUpdateConsumer updatesConsumer) throws TelegramApiException {
        return registerBot(botToken, () -> TelegramUrl.DEFAULT_URL, new DefaultGetUpdatesGenerator(allowedUpdates), updatesConsumer);
    }
}
