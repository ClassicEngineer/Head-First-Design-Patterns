package ru.daniladeveloper.patterns.factory;

public interface TelegramBotFactory {

      TelegramBot createBot(BotType type);

      default TelegramBot registerBot(BotType type, BotPropertiesFactory factory) {
          TelegramBot bot = switch (type) {
              case ECHO -> new EchoTelegramBot(factory);
              case REVERSE -> new ReverseTelegramBot(factory);
              case QUESTION -> new QuestionTelegramBot(factory);
          };
          bot.register(type);
          return bot;
      }
}
