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
package org.neo4j.shell.apps.ha;

import org.neo4j.kernel.HighlyAvailableGraphDatabase;
import org.neo4j.shell.AppCommandParser;
import org.neo4j.shell.Output;
import org.neo4j.shell.Session;
import org.neo4j.shell.kernel.apps.GraphDatabaseApp;

public class Dumplocks extends GraphDatabaseApp
{
    @Override
    protected String exec( AppCommandParser parser, Session session, Output out ) throws Exception
    {
        HighlyAvailableGraphDatabase db = (HighlyAvailableGraphDatabase) getServer().getDb();
        db.getConfig().getLockManager().dumpAllLocks();
        return null;
    }
}
