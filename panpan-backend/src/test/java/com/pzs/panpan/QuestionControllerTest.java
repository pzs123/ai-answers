package com.pzs.panpan;

import com.pzs.panpan.controller.QuestionController;
import com.pzs.panpan.model.dto.question.AiGenerateQuestionRequest;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

@SpringBootTest
public class QuestionControllerTest {

    @Resource
    private QuestionController questionController;
//    @Test
    void aiGenerateQuestionSSETest() throws InterruptedException {
        // 模拟普通用户
        AiGenerateQuestionRequest aiGenerateQuestionRequest = new AiGenerateQuestionRequest();
        aiGenerateQuestionRequest.setAppId(3L);
        aiGenerateQuestionRequest.setQuestionNumber(5);
        aiGenerateQuestionRequest.setOptionNumber(2);

        // 模拟普通用户
        questionController.aiGenerateQuestionSSETest(aiGenerateQuestionRequest,false);
        // 模拟普通用户
        questionController.aiGenerateQuestionSSETest(aiGenerateQuestionRequest,false);
        // 模拟会员用户
        questionController.aiGenerateQuestionSSETest(aiGenerateQuestionRequest,true);

        // 模拟主线程一直启动
        Thread.sleep(100L);
    }
}
