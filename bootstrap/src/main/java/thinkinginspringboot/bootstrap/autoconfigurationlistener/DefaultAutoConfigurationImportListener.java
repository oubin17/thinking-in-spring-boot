package thinkinginspringboot.bootstrap.autoconfigurationlistener;

import org.springframework.boot.autoconfigure.AutoConfigurationImportEvent;
import org.springframework.boot.autoconfigure.AutoConfigurationImportListener;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.core.io.support.SpringFactoriesLoader;

import java.util.List;
import java.util.Set;

/**
 * DefaultAutoConfigurationImportListener
 *
 * @author oubin.ob
 * @version : DefaultAutoConfigurationImportListener.java v 0.1 2021/9/4 10:49 oubin.ob Exp $$
 */
public class DefaultAutoConfigurationImportListener implements AutoConfigurationImportListener {

    @Override
    public void onAutoConfigurationImportEvent(AutoConfigurationImportEvent event) {
        ClassLoader classLoader = event.getClass().getClassLoader();
        List<String> candidates = SpringFactoriesLoader.loadFactoryNames(EnableAutoConfiguration.class, classLoader);

        List<String> configurations = event.getCandidateConfigurations();
        Set<String> exclusions = event.getExclusions();
        System.out.printf("自动装配Class名单 - 候选数量： %d，实际数量： %d，排除数量：%s\n", candidates.size(), configurations.size(), exclusions.size());

        System.out.println("实际的自动装配名单：");
        event.getCandidateConfigurations().forEach(System.out::println);
        System.out.println("排除的自动装配Class名单：");
        event.getExclusions().forEach(System.out::println);
    }
}
