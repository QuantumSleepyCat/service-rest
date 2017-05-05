package by.bsuir.books.controller.email;

import org.apache.commons.mail.DefaultAuthenticator;
import org.apache.commons.mail.Email;
import org.apache.commons.mail.EmailException;
import org.apache.commons.mail.SimpleEmail;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * Created by Lenovo on 19.03.2017.
 */
public class EmailSend {
    public void emailSend(String message, String theme, String toEmail){
        InputStream is = getClass().getResourceAsStream("/email.properties");
        Properties properties = new Properties();
        try {
            properties.load(is);
        } catch (IOException e) {
            e.printStackTrace();
        }
        Email email = new SimpleEmail();
        email.setCharset("utf-8");
        //email.setCharset(org.apache.commons.mail..UTF_8);
        email.setHostName(properties.getProperty("hostname"));
        email.setSmtpPort(Integer.valueOf(properties.getProperty("smtpport")));
        email.setAuthenticator(new DefaultAuthenticator(properties.getProperty("email"), properties.getProperty("password")));
        email.setSSL(true);

        try {
            email.setFrom(properties.getProperty("email"));
            email.setSubject(theme);
            email.setMsg(message);
            email.addTo(toEmail);
            email.send();
            email.getToAddresses().clear();
        } catch (EmailException e) {
            e.printStackTrace();
        }
    }
}
