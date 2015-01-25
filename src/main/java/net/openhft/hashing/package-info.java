/*
 * Copyright 2014 Higher Frequency Trading http://www.higherfrequencytrading.com
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

/**
 * API for hashing sequential data and zero-allocation, pretty fast implementations
 * of non-cryptographic hash functions.
 *
 * <p>Currently implemented:
 * <ul>
 *     <li>{@code long}-valued functions: see {@link net.openhft.hashing.LongHashFunction}
 *     <ul>
 *         <li><a href="https://code.google.com/p/cityhash/">CityHash</a> 1.1:
 *         {@linkplain net.openhft.hashing.LongHashFunction#city_1_1() without seeds},
 *         {@linkplain net.openhft.hashing.LongHashFunction#city_1_1(long) with one seed},
 *         {@linkplain net.openhft.hashing.LongHashFunction#city_1_1(long, long) with two seeds}.
 *         </li>
 *         <li><a href="https://code.google.com/p/smhasher/wiki/MurmurHash3">MurmurHash3</a>:
 *         {@linkplain net.openhft.hashing.LongHashFunction#murmur_3() without seed} and
 *         {@linkplain net.openhft.hashing.LongHashFunction#murmur_3(long) with a seed}.
 *         </li>
 *     </ul>
 *     </li>
 * </ul>
 */
package net.openhft.hashing;