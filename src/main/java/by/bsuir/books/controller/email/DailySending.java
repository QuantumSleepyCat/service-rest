package by.bsuir.books.controller.email;

import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;

/**
 * Created by Lenovo on 20.03.2017.
 */
public class DailySending implements Job {
    public void execute(JobExecutionContext context)
            throws JobExecutionException {

        /*DateFormat dateFormat = new SimpleDateFormat("MM-dd");
        Date date = new Date();
        String currentDate = dateFormat.format(date);
        ContactInfo contactInfo = new ContactInfo();
        List<Contact> contactList = contactInfo.getAllContacts();
        StringBuilder listContact = new StringBuilder("У ");
        for(Contact contact : contactList) {
            if(contact.getBirthday().contains(currentDate))
                listContact.append(" "+contact.getName()+" "+contact.getSurname()+" "
                +contact.getPatronymic()+";");
        }

        InputStream is = getClass().getResourceAsStream("/email.properties");
        Properties properties = new Properties();
        try {
            properties.load(is);
        } catch (IOException e) {
            e.printStackTrace();
        }
        Contact admin = new Contact();
        admin.setSex("");//equals method in email
        admin.setEmail(properties.getProperty("email"));
        ArrayList list = new ArrayList();
        list.add(admin);

        if(!listContact.toString().equals("У ")) {
            listContact.append(" сегодня День Рождения!");
            new EmailSend().emailSend(listContact.toString(), "День рождения пользователей", list);
        }*/
    }

}
