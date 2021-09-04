package thinkinginspringboot.formatterspringbootstarter.autoconfiguration.formatter;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

/**
 * JsonFormatter
 *
 * @author oubin.ob
 * @version : JsonFormatter.java v 0.1 2021/9/4 20:03 oubin.ob Exp $$
 */
public class JsonFormatter implements Formatter {

    private final ObjectMapper objectMapper;

    public JsonFormatter() {
        this.objectMapper = new ObjectMapper();
    }

    @Override
    public String format(Object object) {
        try {
            return objectMapper.writeValueAsString(object);
        } catch (JsonProcessingException e) {
            throw new IllegalArgumentException(e);
        }
    }
}
