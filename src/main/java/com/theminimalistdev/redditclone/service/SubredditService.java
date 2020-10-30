package com.theminimalistdev.redditclone.service;

import com.theminimalistdev.redditclone.dto.SubredditDto;
import com.theminimalistdev.redditclone.mapper.SubredditMapper;
import com.theminimalistdev.redditclone.model.Subreddit;
import com.theminimalistdev.redditclone.repository.SubredditRepository;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@AllArgsConstructor
@Slf4j
public class SubredditService {

    private final SubredditRepository subredditRepository;
    private final SubredditMapper subredditMapper;

    @Transactional
    public SubredditDto save(SubredditDto subredditDto) {
        Subreddit save = subredditRepository.save(subredditMapper.mapDtoToSubreddit(subredditDto));
        subredditDto.setId(save.getId());
        return subredditDto;
    }

}
