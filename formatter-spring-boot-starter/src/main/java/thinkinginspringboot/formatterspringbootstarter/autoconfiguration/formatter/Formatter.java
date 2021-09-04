package thinkinginspringboot.formatterspringbootstarter.autoconfiguration.formatter;

/**
 * Formatter
 *
 * @author oubin.ob
 * @version : Formatter.java v 0.1 2021/9/4 17:53 oubin.ob Exp $$
 */
public interface Formatter {

    /**
     * 格式化操作
     *
     * @param object 待格式化对象
     * @return 返回格式化后的内容
     */
    String format(Object object);
}
