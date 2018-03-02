/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package my.test.constraint;

import my.test.TestBase;

public class ConstraintCheckTest extends TestBase {
    public static void main(String[] args) throws Exception {
        new ConstraintCheckTest().start();
    }

    @Override
    public void init() throws Exception {
    }

    @Override
    public void startInternal() throws Exception {
        executeUpdate("DROP TABLE IF EXISTS ConstraintCheckTest");
        executeUpdate("CREATE TABLE IF NOT EXISTS ConstraintCheckTest (f1 int)");

        executeUpdate("ALTER TABLE ConstraintCheckTest ADD CONSTRAINT mycheck CHECK (f1 > 1)");
        tryExecuteUpdate("insert into ConstraintCheckTest(f1) values(1)");
    }
}