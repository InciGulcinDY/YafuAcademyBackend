package com.inci.onlineAcademy.core.configurations;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ResourceBundleMessageSource;
import org.springframework.web.servlet.LocaleResolver;
import org.springframework.web.servlet.i18n.SessionLocaleResolver;

import java.util.Locale;

//  MessageSource: This MessageSource caches both the accessed ResourceBundle instances and the generated MessageFormats
//  for each message.
@Configuration
public class MessageSourceConfiguration {
    @Bean
    public ResourceBundleMessageSource messageSource(){
        ResourceBundleMessageSource messageSource = new ResourceBundleMessageSource();

        messageSource.setBasename("messages");       // Set a single basename, following the basic ResourceBundle
                                                    // convention of not specifying file extension or language codes.

        messageSource.setDefaultEncoding("UTF-8");  //  Set the default charset to use for parsing properties files.

        return messageSource;
    }

    @Bean
    public LocaleResolver localeResolver(){
        //  LocaleResolver: Interface for web-based locale resolution strategies that allows for both locale resolution
        //  via the request and locale modification via request and response.

        SessionLocaleResolver sessionLocaleResolver = new SessionLocaleResolver();
        //  SessionLocaleResolver: LocaleResolver implementation that uses a locale attribute in the user's session in
        //  case of a custom setting, with a fallback to the configured default locale, the request's Accept-Language
        //  header, or the default locale for the server.
        sessionLocaleResolver.setDefaultLocale(new Locale("en", "US"));
        return sessionLocaleResolver;
    }
}
