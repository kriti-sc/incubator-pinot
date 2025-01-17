/**
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package org.apache.pinot.core.routing;

import java.util.List;
import java.util.Map;
import org.apache.pinot.core.transport.ServerInstance;


public class RoutingTable {
  private final Map<ServerInstance, List<String>> _serverInstanceToSegmentsMap;
  private final List<String> _unavailableSegments;

  public RoutingTable(Map<ServerInstance, List<String>> serverInstanceToSegmentsMap, List<String> unavailableSegments) {
    _serverInstanceToSegmentsMap = serverInstanceToSegmentsMap;
    _unavailableSegments = unavailableSegments;
  }

  public Map<ServerInstance, List<String>> getServerInstanceToSegmentsMap() {
    return _serverInstanceToSegmentsMap;
  }

  public List<String> getUnavailableSegments() {
    return _unavailableSegments;
  }
}
