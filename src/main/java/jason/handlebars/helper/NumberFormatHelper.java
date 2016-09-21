package jason.handlebars.helper;

import pl.allegro.tech.boot.autoconfigure.handlebars.HandlebarsHelper;

import java.io.IOException;
import java.text.NumberFormat;
import java.util.Locale;

/**
 * @author jason, Moon
 * @since 2016-09-21
 */
@HandlebarsHelper
public class NumberFormatHelper {

    public CharSequence currency(String context, String currencyCode) throws IOException {

        NumberFormat numberFormat = NumberFormat.getCurrencyInstance(currency(currencyCode));

        return numberFormat.format(new Integer(context));
    }

    private Locale currency(String currencyCode) {

        Locale locale;

        if ("USD".equals(currencyCode)) {
            locale = Locale.US;
        } else if ("KRW".equals(currencyCode)) {
            locale = Locale.KOREA;
        } else if ("JPY".equals(currencyCode)) {
            locale = Locale.JAPAN;
        } else if ("GBP".equals(currencyCode)) {
            locale = Locale.UK;
        } else if ("CNY".equals(currencyCode)) {
            locale = Locale.CHINA;
        } else {
            locale = Locale.getDefault();
        }

        return locale;
    }
}
