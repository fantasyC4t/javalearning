/**
 * Alipay.com Inc. Copyright (c) 2004-2020 All Rights Reserved.
 */

import org.yaml.snakeyaml.constructor.Constructor;
import org.yaml.snakeyaml.error.YAMLException;
import org.yaml.snakeyaml.nodes.Tag;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.regex.Pattern;

/**
 *
 * @author th1s
 * @version : WhitelistedYamlConstructor.java, v 0.1 2020年09月11日 5:39 下午 th1s Exp $
 */
public class WhitelistedYamlConstructor extends Constructor {
    private static final Set<Pattern> WHITELISTED_CLASSES = Collections.unmodifiableSet(new HashSet<Pattern>() {
        {
            this.add(Pattern.compile("com\\.atlassian\\.bamboo\\.specs\\.util\\.BambooSpecProperties"));
            this.add(Pattern.compile("com\\.atlassian\\.bamboo\\.specs\\.api\\.model\\..*Properties"));
            this.add(Pattern.compile("com\\.atlassian\\.bamboo\\.specs\\.api\\.model\\..*Properties\\$.+"));
            this.add(Pattern.compile("com\\.atlassian\\.bamboo\\.specs\\.model\\..*Properties"));
            this.add(Pattern.compile("com\\.atlassian\\.bamboo\\.specs\\.model\\..*Properties\\$.+"));
            this.add(Pattern.compile("com\\.atlassian\\.bamboo\\.specs\\.api\\.builders\\.Applicability"));
            this.add(Pattern.compile("com\\.atlassian\\.bamboo\\.specs\\.api\\.builders\\.permission\\.PermissionType"));
        }
    });

    boolean isClassAllowed(String fullClassName) {
        return WHITELISTED_CLASSES.stream().anyMatch((pattern) -> {
            return pattern.matcher(fullClassName).matches();
        });
    }

    protected Class<?> getClassForName(String name) throws ClassNotFoundException {
        if (this.isClassAllowed(name)) {
            return super.getClassForName(name);
        } else {
            throw new YAMLException(String.format("Class '%s' is not allowed in YAML.", name));
        }
    }
}
