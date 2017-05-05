package by.bsuir.books.controller.email;

import org.apache.commons.lang3.text.StrSubstitutor;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;


/**
 * Created by Lenovo on 21.03.2017.
 */
public class MakeMessage {
    public String makeMessage(Map<String, Object> map, String template){
        Map valuesMap = new HashMap();

        valuesMap.put("login", map.get("login"));
        valuesMap.put("film", map.get("film"));
        valuesMap.put("sum", map.get("sum"));
        valuesMap.put("URL", map.get("URL"));
        //valuesMap.put("place", order.getPlace().getNumber()+order.getPlace().getRow());

        DateFormat dateFormat = new SimpleDateFormat("dd.MM.yyyy");
        Date date = new Date();
        valuesMap.put("currentdate", dateFormat.format(date));


        StrSubstitutor sub = new StrSubstitutor(valuesMap);
        String resolvedString = sub.replace(template);
        return resolvedString;
    }
}
