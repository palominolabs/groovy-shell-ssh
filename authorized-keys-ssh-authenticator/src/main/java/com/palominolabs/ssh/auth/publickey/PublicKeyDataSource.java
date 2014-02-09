package com.palominolabs.ssh.auth.publickey;

import javax.annotation.Nonnull;
import javax.annotation.concurrent.ThreadSafe;

/**
 * Abstraction around manipulating authorized_keys files.
 */
@ThreadSafe
public interface PublicKeyDataSource {

    /**
     * Use the provided factories to extract matchers from an implementation-specific data source. Each factory will
     * only be asked to load a matcher when the key type matches the value returned by {@link
     * PublicKeyMatcherFactory#getKeyType()}.
     *
     * @param factories factories to use
     * @return matchers that the laoders created
     */
    @Nonnull
    Iterable<PublicKeyMatcher> getMatchers(@Nonnull Iterable<PublicKeyMatcherFactory> factories);
}