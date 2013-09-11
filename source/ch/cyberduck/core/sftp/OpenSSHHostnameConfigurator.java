package ch.cyberduck.core.sftp;

/*
 * Copyright (c) 2012 David Kocher. All rights reserved.
 * http://cyberduck.ch/
 *
 * This program is free software; you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation; either version 2 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * Bug fixes, suggestions and comments should be sent to:
 * dkocher@cyberduck.ch
 */

import ch.cyberduck.core.HostnameConfigurator;
import ch.cyberduck.core.Local;
import ch.cyberduck.core.LocalFactory;

import org.apache.log4j.Logger;
import org.spearce.jgit.transport.OpenSshConfig;

import java.io.File;

/**
 * @version $Id$
 */
public class OpenSSHHostnameConfigurator implements HostnameConfigurator {
    private static final Logger log = Logger.getLogger(OpenSSHHostnameConfigurator.class);

    private OpenSshConfig configuration;

    public OpenSSHHostnameConfigurator() {
        this(new OpenSshConfig(
                new File(LocalFactory.createLocal(Local.HOME, ".ssh/config").getAbsolute())));
    }

    public OpenSSHHostnameConfigurator(OpenSshConfig configuration) {
        this.configuration = configuration;
    }

    /**
     * @return Resolves any alias given in ~/.ssh/config
     */
    @Override
    public String getHostname(final String alias) {
        final String hostname = configuration.lookup(alias).getHostName();
        if(null == hostname) {
            return alias;
        }
        if(log.isInfoEnabled()) {
            log.info(String.format("Using hostname alias %s from ~/.ssh/config", alias));
        }
        return hostname;
    }

    @Override
    public int getPort(final String alias) {
        return configuration.lookup(alias).getPort();
    }
}
