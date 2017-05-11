/**
 * 
 * Copyright (c) 2006-2017, Speedment, Inc. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"); You may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at: 
 * 
 * http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */
package com.speedment.common.tuple.internal.nonnullable;

import com.speedment.common.tuple.Tuple;
import com.speedment.common.tuple.internal.AbstractTuple;
import com.speedment.common.tuple.nonnullable.Tuple0;

/**
 * An implementation class of a {@link Tuple0 }
 * 
 * @author Per Minborg
 */
public final class Tuple0Impl extends AbstractTuple implements Tuple0 {
    
    public final static Tuple0 EMPTY_TUPLE = new Tuple0Impl();
    
    /**
     * Constructs a {@link Tuple } of type {@link Tuple0 }.
     */
    private Tuple0Impl() {
        super(Tuple0Impl.class);
    }
}