package com.suyi.demo.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.suyi.demo.mapper.PaperStudentStutopicTopicMapper;
import java.util.List;
import com.suyi.demo.model.PaperStudentStutopicTopic;
import com.suyi.demo.model.PaperStudentStutopicTopicExample;
import com.suyi.demo.service.PaperStudentStutopicTopicService;
@Service
public class PaperStudentStutopicTopicServiceImpl implements PaperStudentStutopicTopicService{

    @Resource
    private PaperStudentStutopicTopicMapper paperStudentStutopicTopicMapper;

    @Override
    public long countByExample(PaperStudentStutopicTopicExample example) {
        return paperStudentStutopicTopicMapper.countByExample(example);
    }

    @Override
    public int deleteByExample(PaperStudentStutopicTopicExample example) {
        return paperStudentStutopicTopicMapper.deleteByExample(example);
    }

    @Override
    public int insert(PaperStudentStutopicTopic record) {
        return paperStudentStutopicTopicMapper.insert(record);
    }

    @Override
    public int insertSelective(PaperStudentStutopicTopic record) {
        return paperStudentStutopicTopicMapper.insertSelective(record);
    }

    @Override
    public List<PaperStudentStutopicTopic> selectByExample(PaperStudentStutopicTopicExample example) {
        return paperStudentStutopicTopicMapper.selectByExample(example);
    }

    @Override
    public int updateByExampleSelective(PaperStudentStutopicTopic record,PaperStudentStutopicTopicExample example) {
        return paperStudentStutopicTopicMapper.updateByExampleSelective(record,example);
    }

    @Override
    public int updateByExample(PaperStudentStutopicTopic record,PaperStudentStutopicTopicExample example) {
        return paperStudentStutopicTopicMapper.updateByExample(record,example);
    }

    @Override
    public int batchInsert(List<PaperStudentStutopicTopic> list) {
        return paperStudentStutopicTopicMapper.batchInsert(list);
    }

}
