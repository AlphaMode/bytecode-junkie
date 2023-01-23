package net.kjp12.junkie.internal;// Created 2022-10-03T05:21:35

import java.util.Collection;

/**
 * @author KJP12
 * @since 0.3.2
 **/
public interface UnsafeProxy {
    void blacklistPackages(Collection<String> packages);

    void blacklistPackage(String name);
}
