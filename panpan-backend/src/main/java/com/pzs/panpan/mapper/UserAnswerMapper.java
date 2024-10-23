package com.pzs.panpan.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.pzs.panpan.model.dto.statistic.AppAnswerCountDTO;
import com.pzs.panpan.model.dto.statistic.AppAnswerResultCountDTO;
import com.pzs.panpan.model.entity.UserAnswer;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @author pzs
 * @description 针对表【user_answer(用户答题记录)】的数据库操作Mapper
 * @createDate 2024-10-15 13:37:29
 * @Entity com.pzs.panpan.model.entity.UserAnswer
 */
public interface UserAnswerMapper extends BaseMapper<UserAnswer> {

    @Select("select appId, count(userId) as answerCount from user_answer\n" +
            "    group by appId order by answerCount desc limit 10;")
    List<AppAnswerCountDTO> doAppAnswerCount();

    @Select("select resultName,count(resultName) as resultCount from user_answer\n" +
            "    where appId = #{appId}\n" +
            "    group by resultName order by resultCount desc;")
    List<AppAnswerResultCountDTO> doAppAnswerResultCount(Long appId);
}




