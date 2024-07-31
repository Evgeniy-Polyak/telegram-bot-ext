package ru.polyak.telegram.bot.ext.core;

import lombok.Getter;
import okhttp3.OkHttpClient;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.telegram.telegrambots.client.okhttp.OkHttpTelegramClient;
import org.telegram.telegrambots.meta.generics.TelegramClient;
import ru.polyak.telegram.bot.ext.api.UpdateType;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

@Getter
@Configuration
public class BotConfiguration {
    @Value("${bot.token}")
    private String botToken;

    @Value("${bot.creator-id}")
    Long creatorId;

    @Bean
    public TelegramClient telegramClient() {
        return new OkHttpTelegramClient(botToken);
    }

    @Bean(value = "okHttpClient")
    public OkHttpClient okHttpClient() {
        return new OkHttpClient();
    }

    @Bean(value = "allowedUpdates")
    @ConditionalOnMissingBean
    public List<String> allowedUpdates() {
        return Stream.of(UpdateType.values())
                .map(UpdateType::getValue)
                .toList();
    }

}
