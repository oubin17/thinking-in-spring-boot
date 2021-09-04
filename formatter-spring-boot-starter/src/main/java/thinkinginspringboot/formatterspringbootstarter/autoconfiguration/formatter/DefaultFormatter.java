package thinkinginspringboot.formatterspringbootstarter.autoconfiguration.formatter;

/**
 * DefaultFormatter
 *
 * @author oubin.ob
 * @version : DefaultFormatter.java v 0.1 2021/9/4 17:42 oubin.ob Exp $$
 */
public class DefaultFormatter implements Formatter {

    /**
     * null 安全实现
     * @param object 待格式化对象
     * @return
     */
    @Override
    public String format(Object object) {
        return String.valueOf(object);
    }
}
