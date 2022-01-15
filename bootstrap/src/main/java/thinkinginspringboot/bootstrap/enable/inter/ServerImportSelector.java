package thinkinginspringboot.bootstrap.enable.inter;

import org.springframework.context.annotation.ImportSelector;
import org.springframework.core.type.AnnotationMetadata;

import java.util.Map;
import java.util.function.Predicate;

/**
 * ServerImportSelector:返回BeanName，这些BeanName会被Spring扫描并注册成Bean
 *
 * @author oubin.ob
 * @version : ServerImportSelector.java v 0.1 2021/8/18 23:38 oubin.ob Exp $$
 */
public class ServerImportSelector implements ImportSelector {
    @Override
    public String[] selectImports(AnnotationMetadata importingClassMetadata) {
        //读取EnableServer中所有的属性方法，本例中只有type()属性方法
        //key为属性方法名称，value为属性方法的返回对象
        Map<String, Object> allAnnotationAttributes = importingClassMetadata.getAnnotationAttributes(EnableServer.class.getName());
        Server.Type type = (Server.Type) allAnnotationAttributes.get("type");
        String[] importClassNames = new String[0];
        switch (type) {
            case FTP:
                importClassNames = new String[]{FtpServer.class.getName()};
                break;
            case HTTP:
                importClassNames = new String[]{HttpService.class.getName()};
                break;
        }

        return importClassNames;
    }

    @Override
    public Predicate<String> getExclusionFilter() {
        return null;
    }
}
