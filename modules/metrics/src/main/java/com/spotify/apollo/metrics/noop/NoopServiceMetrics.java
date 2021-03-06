/*
 * -\-\-
 * Spotify Apollo Metrics Module
 * --
 * Copyright (C) 2013 - 2016 Spotify AB
 * --
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * -/-/-
 */
package com.spotify.apollo.metrics.noop;

import com.spotify.apollo.metrics.ServiceMetrics;
import com.spotify.apollo.metrics.RequestMetrics;

class NoopServiceMetrics implements ServiceMetrics {
  private NoopServiceMetrics() {
  }

  private static final NoopServiceMetrics INSTANCE =
      new NoopServiceMetrics();

  public static ServiceMetrics instance() {
    return INSTANCE;
  }

  @Override
  public RequestMetrics metricsForEndpointCall(String endpoint) {
    return NoopRequestMetrics.instance();
  }
}
