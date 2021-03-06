/**
 * Copyright (c) 2002-2011 "Neo Technology,"
 * Network Engine for Objects in Lund AB [http://neotechnology.com]
 *
 * This file is part of Neo4j.
 *
 * Neo4j is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Affero General Public License as
 * published by the Free Software Foundation, either version 3 of the
 * License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Affero General Public License for more details.
 *
 * You should have received a copy of the GNU Affero General Public License
 * along with this program. If not, see <http://www.gnu.org/licenses/>.
 */
package org.neo4j.shell;

import java.rmi.RemoteException;

/**
 * A {@link ShellServer} with the addition of executing apps.
 */
public interface AppShellServer extends ShellServer
{
    /**
     * Adds an {@link App} (given its class) to the list of apps this
     * shell server can execute.
     * @param appClass the class of the {@link App} to add to the list.
     * @throws RemoteException if an RMI exception occurs.
     */
    @Deprecated
    void addApp( Class<? extends App> appClass ) throws RemoteException;

	/**
	 * Finds and returns an {@link App} implementation with a given name.
	 * @param name the name of the app.
	 * @return an {@link App} instance for {@code name}.
	 * @throws RemoteException if an RMI exception occurs.
	 */
	App findApp( String name ) throws RemoteException;
}
