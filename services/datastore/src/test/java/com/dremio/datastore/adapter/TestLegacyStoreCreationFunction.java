/*
 * Copyright (C) 2017-2019 Dremio Corporation
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.dremio.datastore.adapter;

import java.util.List;

import com.dremio.datastore.api.LegacyKVStore;
import com.dremio.datastore.api.LegacyStoreCreationFunction;
import com.dremio.datastore.format.Format;

/**
 * Exposes KeyFormat for test harness logic.
 */
public interface TestLegacyStoreCreationFunction<K, V> extends LegacyStoreCreationFunction<LegacyKVStore<K, V>> {

  Format<K> getKeyFormat();

  List<Class<?>> getKeyClasses();
}
