/*
 * Copyright 2017 the original author or authors.
 *
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
 */
package com.github.liaochong.myexcel.core.parser;

import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

import java.util.Map;

/**
 * @author liaochong
 * @version 1.0
 */
@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Td {
    /**
     * 所在行
     */
    int row;
    /**
     * 所在列
     */
    int col;
    /**
     * 跨行数
     */
    int rowSpan;
    /**
     * 跨列数
     */
    int colSpan;
    /**
     * 内容
     */
    String content;
    /**
     * 内容类型
     */
    ContentTypeEnum tdContentType = ContentTypeEnum.STRING;
    /**
     * 是否为th
     */
    boolean th;
    /**
     * 行边界
     */
    int rowBound;
    /**
     * 列边界
     */
    int colBound;
    /**
     * 单元格样式
     */
    Map<String, String> style;
    /**
     * 公式
     */
    boolean formula;

}
