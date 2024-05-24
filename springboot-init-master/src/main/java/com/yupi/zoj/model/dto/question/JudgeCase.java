package com.yupi.zoj.model.dto.question;

import lombok.Data;

/**
 * 题目用例
 */
@Data
public class JudgeCase {
    /**
     * 输入样例
     */
    private String input;

    /**
     * 输出样例
     */
    private String output;
}
